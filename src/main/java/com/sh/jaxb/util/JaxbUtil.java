package com.sh.jaxb.util;

import cn.hutool.core.util.CharsetUtil;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * jaxb工具类
 *
 *
 * java -jar trang-20181222.jar Test.xml Test.xsd
 * xjc -encoding UTF-8 -p com.sh.jaxb.javabean Test.xsd
 *
 *
 * @author 盛浩
 * @date 2020/11/25 10:41
 */
public class JaxbUtil {

    /**
     * javaBean转xml
     *
     * @param obj 对象
     * @return xml
     */
    public static String conversionXml(Object obj) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, CharsetUtil.UTF_8);
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj,writer);
            result =writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * xml转javaBean
     *
     * @param xml xml
     * @param c 类
     * @return javaBean
     */
    public static<T> T conversionJavaBean(String xml,Class<T> c){
        T t = null;
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            t = (T)unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
