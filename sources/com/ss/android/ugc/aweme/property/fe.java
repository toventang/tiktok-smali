package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class fe {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public final String f118540a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f118541b;

    static {
        Covode.recordClassIndex(76989);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return l.a(this.f118540a, feVar.f118540a) && l.a(this.f118541b, feVar.f118541b);
    }

    public final int hashCode() {
        String str = this.f118540a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f118541b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VESynthesisSettingsCategoryItem(key=" + this.f118540a + ", value=" + this.f118541b + ")";
    }

    private /* synthetic */ fe() {
        this("", "");
    }

    private fe(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f118540a = str;
        this.f118541b = str2;
    }
}
