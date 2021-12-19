package com.ss.android.ugc.aweme.commercialize.feed.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "site_id")
    private String siteId = "";

    static {
        Covode.recordClassIndex(45789);
    }

    public final String getSiteId() {
        return this.siteId;
    }

    public final void setSiteId(String str) {
        this.siteId = str;
    }
}
