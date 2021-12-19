package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class InquiryStruct implements Serializable {
    @c(a = "desc")
    private String desc;
    @c(a = "icon")
    private UrlModel icon;
    @c(a = "open_url")
    private String openUrl;
    @c(a = "web_url")
    private String webUrl;

    static {
        Covode.recordClassIndex(50906);
    }

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
