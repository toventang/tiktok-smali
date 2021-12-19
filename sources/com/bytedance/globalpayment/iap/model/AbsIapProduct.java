package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;

public abstract class AbsIapProduct {
    protected IapChannelUserData mChannelUserData;
    protected String mDescription;
    protected String mFreeTrialPeriod;
    protected String mPrice;
    protected long mPriceAmountMicros;
    protected String mPriceCurrencyCode;
    protected String mProductId;
    protected String mProductType;
    protected String mSubscriptionPeriod;
    protected String mTitle;

    static {
        Covode.recordClassIndex(17661);
    }

    public IapChannelUserData getChannelUserData() {
        return this.mChannelUserData;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getFreeTrialPeriod() {
        return this.mFreeTrialPeriod;
    }

    public String getPrice() {
        return this.mPrice;
    }

    public long getPriceAmountMicros() {
        return this.mPriceAmountMicros;
    }

    public String getPriceCurrencyCode() {
        return this.mPriceCurrencyCode;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public String getProductType() {
        return this.mProductType;
    }

    public String getSubscriptionPeriod() {
        return this.mSubscriptionPeriod;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public AbsIapProduct setChannelUserData(IapChannelUserData iapChannelUserData) {
        this.mChannelUserData = iapChannelUserData;
        return this;
    }
}
