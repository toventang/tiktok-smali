package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UserPreferSettings {
    @c(a = "display_time")
    private Integer displayTime;
    @c(a = "n")
    private Integer n;
    @c(a = "t")
    private Integer t;
    @c(a = "v")
    private Integer v;

    static {
        Covode.recordClassIndex(63106);
    }

    public Integer getDisplayTime() {
        Integer num = this.displayTime;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getN() {
        Integer num = this.n;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getT() {
        Integer num = this.t;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getV() {
        Integer num = this.v;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
