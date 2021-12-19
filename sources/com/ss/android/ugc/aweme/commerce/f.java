package com.ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import java.util.List;

public class f implements Serializable {
    @c(a = "challenge_list")
    public List<Challenge> challengeList;
    @c(a = "head_image_url")
    public UrlModel headImageUrl;
    @c(a = "offline_info_list")
    public List<j> offlineInfoList;
    @c(a = "quick_shop_name")
    public String quickShopName;
    @c(a = "quick_shop_url")
    public String quickShopUrl;
    @c(a = "site_id")
    public String siteId;

    static {
        Covode.recordClassIndex(45196);
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public List<j> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setOfflineInfoList(List<j> list) {
        this.offlineInfoList = list;
    }
}
