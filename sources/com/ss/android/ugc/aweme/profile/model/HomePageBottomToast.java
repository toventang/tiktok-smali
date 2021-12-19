package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class HomePageBottomToast implements Serializable {
    @c(a = "group_id")
    private Integer groupId;
    @c(a = "icon_url")
    private UrlModel iconUrl;
    @c(a = "interval")
    private Long interval;
    @c(a = "jump_url")
    private String jumpUrl;
    @c(a = "jump_url_title")
    private String jumpUrlTitle;
    @c(a = "limit")
    private Integer limit;
    @c(a = "toast")
    private String toast;
    @c(a = "toast_type")
    private Integer toastType;
    @c(a = "type_limit")
    private Integer typeLimit;

    static {
        Covode.recordClassIndex(75227);
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final Long getInterval() {
        return this.interval;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getJumpUrlTitle() {
        return this.jumpUrlTitle;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getToast() {
        return this.toast;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    public final Integer getTypeLimit() {
        return this.typeLimit;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setInterval(Long l2) {
        this.interval = l2;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setJumpUrlTitle(String str) {
        this.jumpUrlTitle = str;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setToast(String str) {
        this.toast = str;
    }

    public final void setToastType(Integer num) {
        this.toastType = num;
    }

    public final void setTypeLimit(Integer num) {
        this.typeLimit = num;
    }
}
