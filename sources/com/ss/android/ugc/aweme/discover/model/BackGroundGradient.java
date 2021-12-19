package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class BackGroundGradient implements Serializable {
    @c(a = "center_color")
    private final String centerColor;
    @c(a = "end_color")
    private final String endColor;
    @c(a = "start_color")
    private final String startColor;

    static {
        Covode.recordClassIndex(50868);
    }

    public static /* synthetic */ BackGroundGradient copy$default(BackGroundGradient backGroundGradient, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = backGroundGradient.startColor;
        }
        if ((i2 & 2) != 0) {
            str2 = backGroundGradient.centerColor;
        }
        if ((i2 & 4) != 0) {
            str3 = backGroundGradient.endColor;
        }
        return backGroundGradient.copy(str, str2, str3);
    }

    public final String component1() {
        return this.startColor;
    }

    public final String component2() {
        return this.centerColor;
    }

    public final String component3() {
        return this.endColor;
    }

    public final BackGroundGradient copy(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new BackGroundGradient(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackGroundGradient)) {
            return false;
        }
        BackGroundGradient backGroundGradient = (BackGroundGradient) obj;
        return l.a(this.startColor, backGroundGradient.startColor) && l.a(this.centerColor, backGroundGradient.centerColor) && l.a(this.endColor, backGroundGradient.endColor);
    }

    public final int hashCode() {
        String str = this.startColor;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.centerColor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.endColor;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BackGroundGradient(startColor=" + this.startColor + ", centerColor=" + this.centerColor + ", endColor=" + this.endColor + ")";
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public BackGroundGradient(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.startColor = str;
        this.centerColor = str2;
        this.endColor = str3;
    }
}
