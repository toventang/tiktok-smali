package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class Boost implements Serializable {
    @c(a = b.f37372a)
    public String bgColor;
    @c(a = "label")
    public String text;
    @c(a = "color_text")
    public String textColor;

    static {
        Covode.recordClassIndex(59350);
    }

    public Boost() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Boost copy$default(Boost boost, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = boost.text;
        }
        if ((i2 & 2) != 0) {
            str2 = boost.bgColor;
        }
        if ((i2 & 4) != 0) {
            str3 = boost.textColor;
        }
        return boost.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.bgColor;
    }

    public final String component3() {
        return this.textColor;
    }

    public final Boost copy(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new Boost(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Boost)) {
            return false;
        }
        Boost boost = (Boost) obj;
        return l.a(this.text, boost.text) && l.a(this.bgColor, boost.bgColor) && l.a(this.textColor, boost.textColor);
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bgColor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Boost(text=" + this.text + ", bgColor=" + this.bgColor + ", textColor=" + this.textColor + ")";
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public Boost(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Boost(String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3);
    }
}
