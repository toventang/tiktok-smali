package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class EffectArtistDetail implements Serializable {
    @c(a = "total")
    public int total;

    static {
        Covode.recordClassIndex(75216);
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int i2) {
        this.total = i2;
    }
}
