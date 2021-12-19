package com.ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class SearchShopStruct implements Serializable {
    @c(a = "height")
    private int height;
    @c(a = "rawData")
    private String rawData;
    @c(a = "scheme")
    private String scheme;

    static {
        Covode.recordClassIndex(59524);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final void setHeight(int i2) {
        this.height = i2;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }
}
