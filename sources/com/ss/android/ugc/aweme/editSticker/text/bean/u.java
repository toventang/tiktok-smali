package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class u {
    @c(a = "keyword")

    /* renamed from: a  reason: collision with root package name */
    public final String f88455a;
    @c(a = "lang")

    /* renamed from: b  reason: collision with root package name */
    public final String f88456b;

    static {
        Covode.recordClassIndex(55675);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.f88455a, uVar.f88455a) && l.a(this.f88456b, uVar.f88456b);
    }

    public final int hashCode() {
        String str = this.f88455a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f88456b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TextWikiAnchor(keyword=" + this.f88455a + ", lang=" + this.f88456b + ")";
    }

    private /* synthetic */ u() {
        this("", "");
    }

    public u(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f88455a = str;
        this.f88456b = str2;
    }
}
