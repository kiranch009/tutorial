package com.beans;


// Generated Nov 24, 2015 2:08:31 PM by Hibernate Tools 4.0.0


/**
 * UserAddress generated by hbm2java
 */
public class UserAddress implements java.io.Serializable
{

    private Integer addressId;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;

    public Integer getAddressId()
    {
        return this.addressId;
    }

    public void setAddressId(Integer addressId)
    {
        this.addressId = addressId;
    }

    public String getAddress1()
    {
        return this.address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2()
    {
        return this.address2;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZip()
    {
        return this.zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

}