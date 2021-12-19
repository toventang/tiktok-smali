package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SpecialPlusMedia {
    @c(a = "md5")
    private String md5 = "";
    @c(a = "url")
    private String url = "";

    static {
        Covode.recordClassIndex(87969);
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setMd5(String str) {
        l.d(str, "");
        this.md5 = str;
    }

    public final void setUrl(String str) {
        l.d(str, "");
        this.url = str;
    }
}
