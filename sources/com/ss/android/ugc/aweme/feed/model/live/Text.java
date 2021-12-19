package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class Text implements Serializable {
    @c(a = "default_pattern")
    private String defaultPattern;
    @c(a = "key")
    private String key;

    static {
        Covode.recordClassIndex(59515);
    }

    public Text() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = text.key;
        }
        if ((i2 & 2) != 0) {
            str2 = text.defaultPattern;
        }
        return text.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.defaultPattern;
    }

    public final Text copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new Text(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return l.a(this.key, text.key) && l.a(this.defaultPattern, text.defaultPattern);
    }

    public final int hashCode() {
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.defaultPattern;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Text(key=" + this.key + ", defaultPattern=" + this.defaultPattern + ")";
    }

    public final String getDefaultPattern() {
        return this.defaultPattern;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setDefaultPattern(String str) {
        l.d(str, "");
        this.defaultPattern = str;
    }

    public final void setKey(String str) {
        l.d(str, "");
        this.key = str;
    }

    public Text(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.key = str;
        this.defaultPattern = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Text(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
