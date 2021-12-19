package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class Address implements Serializable {
    @c(a = "address")
    private String address;
    @c(a = "city")
    private String city;
    @c(a = "district")
    private String district;
    @c(a = "province")
    private String provice;
    @c(a = "simple_addr")
    private String simpleAddr;

    static {
        Covode.recordClassIndex(88090);
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
