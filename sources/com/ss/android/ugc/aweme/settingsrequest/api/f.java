package com.ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f123168a;

    /* renamed from: b  reason: collision with root package name */
    public final l f123169b;

    static {
        Covode.recordClassIndex(80896);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.f.b.l.a(this.f123168a, fVar.f123168a) && h.f.b.l.a(this.f123169b, fVar.f123169b);
    }

    public final int hashCode() {
        String str = this.f123168a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        l lVar = this.f123169b;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CommonRespWithUrl(url=" + this.f123168a + ", resp=" + this.f123169b + ")";
    }

    public f(String str, l lVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(lVar, "");
        this.f123168a = str;
        this.f123169b = lVar;
    }
}
