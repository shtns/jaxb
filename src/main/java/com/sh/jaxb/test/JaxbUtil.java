package com.sh.jaxb.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * https://www.freeformatter.com/xsd-generator.html
 * xjc xsd所在目录 -d 生成的java类存放位置
 *
 *
 * @author 盛浩
 * @date 2020/11/25 10:41
 */
public class JaxbUtil {

    /**
     * JavaBean装换成xml
     * 默认编码UTF-8
     * @param obj
     * @return
     */
    public static String converTomXml(Object obj) {
        return converToXml(obj,"UTF-8");

    }

    /**
     * JavaBean装换成xml
     * @param obj
     * @param encoding
     * @return
     */
    private static String converToXml(Object obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING,encoding);
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj,writer);
            result =writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * xml装换成JavaBean
     * @param xml
     * @param c
     * @return
     */
    @SuppressWarnings("unchecked")
    public static<T> T converyToJavaBean(String xml,Class<T> c){
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
