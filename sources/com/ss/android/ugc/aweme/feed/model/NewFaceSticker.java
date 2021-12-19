package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class NewFaceSticker implements Serializable {
    @c(a = "desc")
    private String desc;
    @c(a = "effect_id")
    private String effectId;
    @c(a = "icon_url")
    private UrlModel iconUrl;
    @c(a = "id")
    private String id;
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = StringSet.name)
    private String name;
    @c(a = "owner_id")
    private String ownerId;
    @c(a = "owner_nickname")
    private String ownerNickName;
    @c(a = "user_count")
    private int userCount;

    static {
        Covode.recordClassIndex(59431);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerNickName() {
        return this.ownerNickName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public final void setUserCount(int i2) {
        this.userCount = i2;
    }
}
