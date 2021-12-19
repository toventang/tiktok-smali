package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class VisitedAccount implements Serializable {
    @c(a = "avatar_url")
    private UrlModel avatarUrl;
    @c(a = "custom_verify")
    private String customVerify;
    @c(a = "enterprise_verify_reason")
    private String enterpriseVerifyReason;
    @c(a = "nickname")
    private String nickname;
    @c(a = "follow_status")
    private String relationShip;
    @c(a = "sec_uid")
    private String secUid;
    @c(a = "uid")
    private String uid;

    static {
        Covode.recordClassIndex(50994);
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRelationShip() {
        return this.relationShip;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setRelationShip(String str) {
        this.relationShip = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
