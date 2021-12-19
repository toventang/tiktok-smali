package com.ss.android.ugc.aweme.dsp.common.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class DspUpsellRessoStruct implements Serializable {
    @c(a = "app_link")
    private String appLink = "";
    @c(a = "deep_link")
    private String deepLink = "";
    @c(a = "download_link")
    private String downloadLink = "";

    static {
        Covode.recordClassIndex(51936);
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDownloadLink() {
        return this.downloadLink;
    }

    public final void setAppLink(String str) {
        l.d(str, "");
        this.appLink = str;
    }

    public final void setDeepLink(String str) {
        l.d(str, "");
        this.deepLink = str;
    }

    public final void setDownloadLink(String str) {
        l.d(str, "");
        this.downloadLink = str;
    }
}
