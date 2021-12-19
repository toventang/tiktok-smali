package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import java.io.Serializable;

public final class PlayListInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "create_time")
    public Long createTime = 0L;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "index")
    public Integer index = 0;
    @c(a = "item_total")
    public Long itemTotal = 0L;
    @c(a = "mix_id")
    public String mixId;
    @c(a = StringSet.name)
    public String mixName;
    @c(a = "mix_src")
    public Integer mixSrc = 0;
    @c(a = "show_rename_tooltip")
    public Boolean showRenameTooltip = false;
    @c(a = "update_time")
    public Long updateTime = 0L;

    static {
        Covode.recordClassIndex(59441);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59442);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final Long getItemTotal() {
        return this.itemTotal;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final String getMixName() {
        return this.mixName;
    }

    public final Integer getMixSrc() {
        return this.mixSrc;
    }

    public final Boolean getShowRenameTooltip() {
        return this.showRenameTooltip;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final void setCreateTime(Long l2) {
        this.createTime = l2;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setItemTotal(Long l2) {
        this.itemTotal = l2;
    }

    public final void setMixId(String str) {
        this.mixId = str;
    }

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setMixSrc(Integer num) {
        this.mixSrc = num;
    }

    public final void setShowRenameTooltip(Boolean bool) {
        this.showRenameTooltip = bool;
    }

    public final void setUpdateTime(Long l2) {
        this.updateTime = l2;
    }
}
