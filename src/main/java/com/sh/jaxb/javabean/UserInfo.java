//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.09 时间 12:01:10 AM CST 
//


package com.sh.jaxb.javabean;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}userId"/>
 *         &lt;element ref="{}loginAccount"/>
 *         &lt;element ref="{}password"/>
 *         &lt;element ref="{}addressInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userId",
    "loginAccount",
    "password",
    "addressInfo"
})
@XmlRootElement(name = "userInfo")
public class UserInfo {

    @XmlElement(required = true)
    protected Integer userId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String loginAccount;
    @XmlElement(required = true)
    protected Integer password;
    @XmlElement(required = true)
    protected AddressInfo addressInfo;

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * 获取loginAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 设置loginAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginAccount(String value) {
        this.loginAccount = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassword(Integer value) {
        this.password = value;
    }

    /**
     * 获取addressInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * 设置addressInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
    }

}
