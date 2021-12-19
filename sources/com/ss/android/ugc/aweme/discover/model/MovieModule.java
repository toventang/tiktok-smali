package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class MovieModule implements Serializable {
    @c(a = "info_line1")
    private String infoLine1;
    @c(a = "info_line2")
    private String infoLine2;
    @c(a = "info_line3")
    private String infoLine3;

    static {
        Covode.recordClassIndex(50915);
    }

    public final String getInfoLine1() {
        return this.infoLine1;
    }

    public final String getInfoLine2() {
        return this.infoLine2;
    }

    public final String getInfoLine3() {
        return this.infoLine3;
    }

    public final void setInfoLine1(String str) {
        this.infoLine1 = str;
    }

    public final void setInfoLine2(String str) {
        this.infoLine2 = str;
    }

    public final void setInfoLine3(String str) {
        this.infoLine3 = str;
    }
}
