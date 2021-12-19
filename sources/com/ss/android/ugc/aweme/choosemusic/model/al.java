package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class al implements Serializable {
    @c(a = "info")
    private String info;

    static {
        Covode.recordClassIndex(43554);
    }

    public final String getInfo() {
        return this.info;
    }

    public final void setInfo(String str) {
        this.info = str;
    }
}
