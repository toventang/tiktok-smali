package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeActivityContent implements Serializable {
    @c(a = b.f37372a)
    public String color;
    @c(a = "size")
    public String size;
    @c(a = "text")
    public String text;

    static {
        Covode.recordClassIndex(59314);
    }

    public AwemeActivityContent() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AwemeActivityContent copy$default(AwemeActivityContent awemeActivityContent, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeActivityContent.text;
        }
        if ((i2 & 2) != 0) {
            str2 = awemeActivityContent.color;
        }
        if ((i2 & 4) != 0) {
            str3 = awemeActivityContent.size;
        }
        return awemeActivityContent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.color;
    }

    public final String component3() {
        return this.size;
    }

    public final AwemeActivityContent copy(String str, String str2, String str3) {
        return new AwemeActivityContent(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivityContent)) {
            return false;
        }
        AwemeActivityContent awemeActivityContent = (AwemeActivityContent) obj;
        return l.a(this.text, awemeActivityContent.text) && l.a(this.color, awemeActivityContent.color) && l.a(this.size, awemeActivityContent.size);
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.size;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AwemeActivityContent(text=" + this.text + ", color=" + this.color + ", size=" + this.size + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getText() {
        return this.text;
    }

    public AwemeActivityContent(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.size = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeActivityContent(String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
