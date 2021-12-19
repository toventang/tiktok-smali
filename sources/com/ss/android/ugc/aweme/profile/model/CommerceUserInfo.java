package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class CommerceUserInfo implements Serializable {
    @c(a = "account_promote_related")
    public int accountPromoteRelated;
    @c(a = "ad_authorization")
    public boolean adAuthorization;
    @c(a = "ad_experience_entry")
    public boolean adExperienceEntry;
    @c(a = "ad_experience_text")
    public String adExperienceText;
    @c(a = "ads_feedback_entry")
    public boolean adFeedbackEntry;
    @c(a = "ad_influencer_type")
    public int adInfluencerType;
    @c(a = "ad_revenue_rits")
    public List<Integer> adRevenueRits;
    @c(a = "ad_revenue_sharing")
    public boolean adRevenueSharing;
    @c(a = "clf_type")
    public int clfType;
    @c(a = "has_ads_entry")
    public boolean hasAdEntry;
    @c(a = "has_promote")
    public boolean hasPromote;
    @c(a = "has_tcm_entry")
    public boolean hasTcmEntry;
    @c(a = "is_ad_partner")
    public boolean isAdPartner;
    @c(a = "is_auction_ad_influencer")
    public boolean isAuctionAdInfluencer;
    @c(a = "link_user_info")
    public LinkUserInfoStruct linkUserInfo;
    @c(a = "notification_config")
    public int notificationConfig;
    @c(a = "promote_pay_type")
    public int promotePayType;
    @c(a = "show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;
    @c(a = "star_atlas")
    public int starAtlas;

    static {
        Covode.recordClassIndex(75214);
    }

    public String getAdExperienceText() {
        return this.adExperienceText;
    }

    public int getAdInfluencerType() {
        return this.adInfluencerType;
    }

    public List<Integer> getAdRevenueRits() {
        return this.adRevenueRits;
    }

    public int getClfType() {
        return this.clfType;
    }

    public LinkUserInfoStruct getLinkUserInfo() {
        return this.linkUserInfo;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public int getPromotePayType() {
        return this.promotePayType;
    }

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isAdPartner() {
        return this.isAdPartner;
    }

    public boolean isAdRevenueSharing() {
        return this.adRevenueSharing;
    }

    public boolean isAuctionAdInfluencer() {
        return this.isAuctionAdInfluencer;
    }

    public boolean isHasAdExperienceEntry() {
        return this.adExperienceEntry;
    }

    public boolean isHasAdFeedbackEntry() {
        return this.adFeedbackEntry;
    }

    public boolean isHasTcmEntry() {
        return this.hasTcmEntry;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }

    public void setAdExperienceText(String str) {
        this.adExperienceText = str;
    }

    public void setNotificationConfig(int i2) {
        this.notificationConfig = i2;
    }
}
