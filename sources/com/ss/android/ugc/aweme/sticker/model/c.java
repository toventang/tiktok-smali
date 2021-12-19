package com.ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import java.io.Serializable;

public class c implements Serializable {
    @com.google.gson.a.c(a = "ad_owner_id")
    public String adOwnerId;
    @com.google.gson.a.c(a = "ad_owner_name")
    public String adOwnerName;
    @com.google.gson.a.c(a = "challenge_id")
    public String challengeId;
    @com.google.gson.a.c(a = "unlock_info")
    public d commerceStickerUnlockInfo;
    @com.google.gson.a.c(a = "detail_desc")
    public String detailDesc;
    @com.google.gson.a.c(a = "detail_letters")
    public String detailLetters;
    @com.google.gson.a.c(a = "detail_open_url")
    public String detailOpenUrl;
    @com.google.gson.a.c(a = "detail_web_url")
    public String detailWebUrl;
    @com.google.gson.a.c(a = "detail_web_url_title")
    public String detailWebUrlTitle;
    @com.google.gson.a.c(a = "disclaimer")
    public ChallengeDisclaimer disclaimer;
    @com.google.gson.a.c(a = "expire_time")
    public long expireTime;
    @com.google.gson.a.c(a = "mission_module")
    public HTCMissionModule htcMissionModule;
    @com.google.gson.a.c(a = "id")
    public String id;
    @com.google.gson.a.c(a = "music_id")
    public String musicId;
    @com.google.gson.a.c(a = "screen_desc")
    public String screenDesc;
    @com.google.gson.a.c(a = "screen_icon")
    public UrlModel screenIcon;
    @com.google.gson.a.c(a = "sec_ad_owner_id")
    public String secAdOwnerId;

    static {
        Covode.recordClassIndex(88248);
    }

    public String getAdOwnerId() {
        return this.adOwnerId;
    }

    public String getAdOwnerName() {
        return this.adOwnerName;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public d getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getDetailLetters() {
        return this.detailLetters;
    }

    public String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public ChallengeDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getId() {
        return this.id;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getScreenDesc() {
        return this.screenDesc;
    }

    public UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public String getSecAdOwnerId() {
        return this.secAdOwnerId;
    }

    public void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerceStickerUnlockInfo(d dVar) {
        this.commerceStickerUnlockInfo = dVar;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public void setDisclaimer(ChallengeDisclaimer challengeDisclaimer) {
        this.disclaimer = challengeDisclaimer;
    }

    public void setExpireTime(long j2) {
        this.expireTime = j2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }

    public void setSecAdOwnerId(String str) {
        this.secAdOwnerId = str;
    }
}
