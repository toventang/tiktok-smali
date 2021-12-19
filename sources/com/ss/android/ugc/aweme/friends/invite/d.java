package com.ss.android.ugc.aweme.friends.invite;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class d implements Serializable {
    @c(a = "short_url")
    private String url;

    static {
        Covode.recordClassIndex(61492);
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
