package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String username;
    private Integer age;
    private Boolean sex;
    private Date born;
    private Map<String,String> parent;
    private List<String> idCards;
    private List<Address> addressList;
    private Address address;
//测试冲突
public void User(){
return;
}
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", born=" + born +
                ", parent=" + parent +
                ", idCards=" + idCards +
                ", addressList=" + addressList +
                ", address=" + address +
                '}';
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Boolean getSex() {
        return sex;
    }
    
    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    
    public Date getBorn() {
        return born;
    }
    
    public void setBorn(Date born) {
        this.born = born;
    }
    
    public Map<String, String> getParent() {
        return parent;
    }
    
    public void setParent(Map<String, String> parent) {
        this.parent = parent;
    }
    
    public List<String> getIdCards() {
        return idCards;
    }
    
    public void setIdCards(List<String> idCards) {
        this.idCards = idCards;
    }
    
    public List<Address> getAddressList() {
        return addressList;
    }
    
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
}
