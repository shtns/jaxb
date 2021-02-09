//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.09 时间 12:01:10 AM CST 
//


package com.sh.jaxb.javabean;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sh.jaxb.javabean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MenuName_QNAME = new QName("", "MenuName");
    private final static QName _LoginAccount_QNAME = new QName("", "loginAccount");
    private final static QName _Password_QNAME = new QName("", "password");
    private final static QName _RoleNameEn_QNAME = new QName("", "roleNameEn");
    private final static QName _MenuId_QNAME = new QName("", "MenuId");
    private final static QName _RoleId_QNAME = new QName("", "roleId");
    private final static QName _RoleName_QNAME = new QName("", "roleName");
    private final static QName _AddressDetails_QNAME = new QName("", "addressDetails");
    private final static QName _UserId_QNAME = new QName("", "userId");
    private final static QName _AddressTest_QNAME = new QName("", "addressTest");
    private final static QName _MenuPath_QNAME = new QName("", "MenuPath");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sh.jaxb.javabean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link RoleInfo }
     * 
     */
    public RoleInfo createRoleInfo() {
        return new RoleInfo();
    }

    /**
     * Create an instance of {@link MenuInfo }
     * 
     */
    public MenuInfo createMenuInfo() {
        return new MenuInfo();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MenuName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMenuName(String value) {
        return new JAXBElement<String>(_MenuName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "loginAccount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLoginAccount(String value) {
        return new JAXBElement<String>(_LoginAccount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "password")
    public JAXBElement<BigInteger> createPassword(BigInteger value) {
        return new JAXBElement<BigInteger>(_Password_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roleNameEn")
    public JAXBElement<BigInteger> createRoleNameEn(BigInteger value) {
        return new JAXBElement<BigInteger>(_RoleNameEn_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MenuId")
    public JAXBElement<BigInteger> createMenuId(BigInteger value) {
        return new JAXBElement<BigInteger>(_MenuId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roleId")
    public JAXBElement<BigInteger> createRoleId(BigInteger value) {
        return new JAXBElement<BigInteger>(_RoleId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoleName(String value) {
        return new JAXBElement<String>(_RoleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressDetails")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressDetails(String value) {
        return new JAXBElement<String>(_AddressDetails_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userId")
    public JAXBElement<BigInteger> createUserId(BigInteger value) {
        return new JAXBElement<BigInteger>(_UserId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressTest")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressTest(String value) {
        return new JAXBElement<String>(_AddressTest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MenuPath")
    public JAXBElement<String> createMenuPath(String value) {
        return new JAXBElement<String>(_MenuPath_QNAME, String.class, null, value);
    }

}
