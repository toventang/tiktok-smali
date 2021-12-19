package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;

public abstract class AbsIapChannelOrderData {
    protected String mChannelOrderId;
    protected String mExtraPayload;
    protected boolean mIsAckEd;
    protected boolean mIsNewSubscription;
    protected boolean mIsSubscription;
    protected String mMerchantId;
    protected String mMerchantUserId;
    protected String mOriginalJson = "";
    protected String mProductId;
    protected String mSelfOrderId;
    protected String mSignature;

    static {
        Covode.recordClassIndex(17659);
    }

    public abstract String getChannelToken();

    public abstract String getChannelUserId();

    public abstract String getDeveloperPayload();

    public abstract String getHost();

    public abstract int getOrderState();

    public abstract String getOriginalJson();

    public abstract IapPaymentMethod getPaymentMethod();

    public abstract String getSelfToken();

    public abstract String getSignature();

    public abstract boolean isOrderFromOtherSystem();

    public abstract boolean isOrderStateSuccess();

    public String getChannelOrderId() {
        return this.mChannelOrderId;
    }

    public String getExtraPayload() {
        return this.mExtraPayload;
    }

    public String getMerchantId() {
        return this.mMerchantId;
    }

    public String getMerchantUserId() {
        return this.mMerchantUserId;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public String getSelfOrderId() {
        return this.mSelfOrderId;
    }

    public boolean isAcknowledged() {
        return this.mIsAckEd;
    }

    public boolean isNewSubscription() {
        return this.mIsNewSubscription;
    }

    public boolean isSubscription() {
        return this.mIsSubscription;
    }
}
