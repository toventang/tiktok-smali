package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class DiamondPackageExtra extends Extra {
    @c(a = "recommended_packet_id")
    public int RecommendedPacketId;
    @c(a = "badge_icon")
    private String mBadgeIcon;
    @c(a = "channel")
    private String mChannel;
    @c(a = "channel_id")
    private int mChannelId;
    @c(a = "currency_list")
    private List<String> mCurrencyList;
    @c(a = "default_currency")
    private String mDefaultCurrency;
    @c(a = "is_default")
    private boolean mIsDefault;
    @c(a = "is_recommend")
    private boolean mIsRecommend;
    @c(a = "need_auth")
    private int mNeedAuth;
    @c(a = "should_display_customized_web_recharge")
    public boolean officialRecharge;
    @c(a = "recently_purchased_packet_id")
    public int recentlyPurchasedPacketId;

    static {
        Covode.recordClassIndex(13222);
    }

    public String getBadgeIcon() {
        return this.mBadgeIcon;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public int getChannelId() {
        return this.mChannelId;
    }

    public List<String> getCurrencyList() {
        return this.mCurrencyList;
    }

    public String getDefaultCurrency() {
        return this.mDefaultCurrency;
    }

    public boolean getIsDefault() {
        return this.mIsDefault;
    }

    public boolean getIsRecommend() {
        return this.mIsRecommend;
    }

    public int getNeedAuth() {
        return this.mNeedAuth;
    }

    public void setBadgeIcon(String str) {
        this.mBadgeIcon = str;
    }

    public void setChannel(String str) {
        this.mChannel = str;
    }

    public void setChannelId(int i2) {
        this.mChannelId = i2;
    }

    public void setCurrencyList(List<String> list) {
        this.mCurrencyList = list;
    }

    public void setDefaultCurrency(String str) {
        this.mDefaultCurrency = str;
    }

    public void setIsDefault(boolean z) {
        this.mIsDefault = z;
    }

    public void setIsRecommend(boolean z) {
        this.mIsRecommend = z;
    }

    public void setNeedAuth(int i2) {
        this.mNeedAuth = i2;
    }
}
