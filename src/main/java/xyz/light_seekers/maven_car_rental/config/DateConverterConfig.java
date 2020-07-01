package xyz.light_seekers.maven_car_rental.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Description: 全局页面传入日期字符串，自动转换成日期格式
 * @Author: Light
 * @Date: 2020/7/1 9:39
 */
@Configuration
public class DateConverterConfig implements WebMvcConfigurer {
    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @PostConstruct
    public void initEditableValidation() {
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) requestMappingHandlerAdapter.getWebBindingInitializer();
        if (initializer.getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
            genericConversionService.addConverter(new CommDateConverter());
        }
    }

    public static class CommDateConverter implements Converter<String, Date> {
        private static final List<String> formarts = new ArrayList<>(4);

        static {
            formarts.add("yyyy-MM");
            formarts.add("yyyy-MM-dd");
            formarts.add("yyyy-MM-dd hh:mm");
            formarts.add("yyyy-MM-dd hh:mm:ss");
        }

        @Override
        public Date convert(String source) {
            if (source == null) {
                return null;
            }
            String value = source.trim();
            if ("".equals(value)) {
                return null;
            }
            if (source.matches("^\\d{4}-\\d{1,2}$")) {
                return parseDate(source, formarts.get(0));
            } else if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")) {
                return parseDate(source, formarts.get(1));
            } else if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")) {
                return parseDate(source, formarts.get(2));
            } else if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")) {
                return parseDate(source, formarts.get(3));
            } else {
                throw new IllegalArgumentException("Invalid boolean value '" + source + "'");
            }
        }

        /**
         * 格式化日期
         *
         * @param dateStr String 字符型日期
         * @param format  String 格式
         * @return Date 日期
         */
        public Date parseDate(String dateStr, String format) {
            Date date = null;
            try {
                DateFormat dateFormat = new SimpleDateFormat(format);
                date = dateFormat.parse(dateStr);
            } catch (Exception e) {

            }
            return date;
        }
    }
}
