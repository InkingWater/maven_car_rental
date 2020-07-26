package xyz.light_seekers.maven_car_rental.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/15 19:29
 */
@Slf4j
public class StatisticsControllerTest {

    @Test
    public void getMonthlyRental() throws IOException {
        Connection connect = Jsoup.connect("http://127.0.0.1:12345/statistics/monthlyRental");
        Connection method = connect.method(Connection.Method.GET).
                ignoreContentType(true).
                userAgent("Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.15)").
                timeout(5000);
        Document document = method.get();
        JSONObject result = JSON.parseObject(document.text());
        Assert.assertEquals(result.getJSONObject("data").toJSONString(),
                "{\"items\":{\"2020-06-26\":0,\"2020-06-27\":0,\"2020-06-24\":0,\"2020-07-14\":1,\"2020-06-25\":0,\"2020-06-28\":0,\"2020-06-29\":0,\"2020-06-22\":0,\"2020-07-12\":0,\"2020-06-23\":0,\"2020-07-13\":1,\"2020-06-20\":0,\"2020-07-10\":0,\"2020-06-21\":0,\"2020-07-11\":0,\"2020-06-15\":0,\"2020-07-05\":0,\"2020-06-16\":0,\"2020-07-06\":0,\"2020-07-03\":0,\"2020-07-04\":0,\"2020-06-19\":0,\"2020-07-09\":0,\"2020-06-17\":0,\"2020-07-07\":0,\"2020-06-18\":0,\"2020-07-08\":0,\"2020-06-30\":0,\"2020-07-01\":0,\"2020-07-02\":0}}");
    }

    @Test
    public void getTypeCar() {
    }

    @Test
    public void getVipClient() {
    }
}