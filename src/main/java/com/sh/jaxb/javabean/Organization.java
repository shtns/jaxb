//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.09 时间 12:01:10 AM CST 
//


package com.sh.jaxb.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}userInfo"/>
 *         &lt;element ref="{}roleInfo"/>
 *         &lt;element ref="{}menuInfo"/>
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
    "userInfo",
    "roleInfo",
    "menuInfo"
})
@XmlRootElement(name = "organization")
public class Organization {

    @XmlElement(required = true)
    protected UserInfo userInfo;
    @XmlElement(required = true)
    protected RoleInfo roleInfo;
    @XmlElement(required = true)
    protected MenuInfo menuInfo;

    /**
     * 获取userInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * 设置userInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setUserInfo(UserInfo value) {
        this.userInfo = value;
    }

    /**
     * 获取roleInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleInfo }
     *     
     */
    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    /**
     * 设置roleInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleInfo }
     *     
     */
    public void setRoleInfo(RoleInfo value) {
        this.roleInfo = value;
    }

    /**
     * 获取menuInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MenuInfo }
     *     
     */
    public MenuInfo getMenuInfo() {
        return menuInfo;
    }

    /**
     * 设置menuInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MenuInfo }
     *     
     */
    public void setMenuInfo(MenuInfo value) {
        this.menuInfo = value;
    }

}
