package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import java.io.Serializable;

public final class AnchorInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "extra")
    public String extra;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "id")
    public String id;
    @c(a = "log_extra")
    public String logExtra;
    @c(a = "mp_url")
    public String mpUrl;
    @c(a = "open_url")
    public String openUrl;
    @c(a = "title")
    public String title;
    @c(a = StringSet.type)
    public Integer type = -1;
    @c(a = "web_url")
    public String webUrl;

    static {
        Covode.recordClassIndex(59297);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59298);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
