package xyz.light_seekers.maven_car_rental.util;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/14 9:41
 */
@Slf4j
public class ContractUtil {
    public static String createContact(Map<String, String> contractContent) {
        Formatter formatter = new Formatter();
        ClassPathResource classPathResource = new ClassPathResource("templates/Contract.pdf");
        String desFile = System.getProperty("user.dir") + "/contract/" + contractContent.get("RentalId") + ".pdf";// 正式pdf保存路径
        PdfReader reader = null;
        PdfStamper stamper = null;
        ByteArrayOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            reader = new PdfReader(classPathResource.getInputStream());
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            //填充Pdf的表单
            AcroFields form = stamper.getAcroFields();
            for (Iterator<String> it = form.getFields().keySet().iterator(); it.hasNext(); ) {
                String name = (String) it.next();
                form.setField(name, contractContent.get(name));
            }
            stamper.setFormFlattening(false);
            stamper.close();
            //保存退出
            fos = new FileOutputStream(desFile);
            fos.write(bos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                reader.close();
            }
            try {
                if (null != bos) {
                    bos.close();
                }
            } catch (IOException e) {
                log.info("关闭ByteArrayOutputStream失败");
            }

            try {
                if (null != fos) {
                    fos.close();
                }
            } catch (IOException e) {
                log.info("关闭FileOutputStream失败");
            }
        }
        try {
            return formatter.format("%s:12345/contract/contract/%s.pdf", InetAddress.getLocalHost().getHostAddress(), contractContent.get("RentalId")).toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
