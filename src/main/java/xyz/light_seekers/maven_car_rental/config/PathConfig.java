package xyz.light_seekers.maven_car_rental.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.File;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/14 9:44
 */
@Configuration
public class PathConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        String contractDirectory = System.getProperty("user.dir") + "/contract";
        File file = new File(contractDirectory);
        if (!file.isDirectory()) {
            //递归生成文件夹
            file.mkdirs();
        }
        //合同
        registry.addResourceHandler("/contract/**")
                .addResourceLocations("file:" + contractDirectory);
        //swagger
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/web/**")
                .addResourceLocations("classpath:/templates/web/");
    }
}
