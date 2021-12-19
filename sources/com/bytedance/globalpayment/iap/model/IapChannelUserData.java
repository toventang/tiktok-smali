package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;

public class IapChannelUserData {
    private IapPaymentMethod mIapPaymentMethod;
    private String mUserId;
    private String mUserMarkPlace;

    static {
        Covode.recordClassIndex(17664);
    }

    public IapPaymentMethod getIapPaymentMethod() {
        return this.mIapPaymentMethod;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String getUserMarkPlace() {
        return this.mUserMarkPlace;
    }

    public IapChannelUserData setIapPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        this.mIapPaymentMethod = iapPaymentMethod;
        return this;
    }

    public IapChannelUserData setUserId(String str) {
        this.mUserId = str;
        return this;
    }

    public IapChannelUserData setUserMarkPlace(String str) {
        this.mUserMarkPlace = str;
        return this;
    }

    public IapChannelUserData(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        this.mIapPaymentMethod = iapPaymentMethod;
        this.mUserId = str;
        this.mUserMarkPlace = str2;
    }
}
