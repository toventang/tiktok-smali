package com.ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f123166a;

    /* renamed from: b  reason: collision with root package name */
    public final o f123167b;

    static {
        Covode.recordClassIndex(80895);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f123166a, eVar.f123166a) && l.a(this.f123167b, eVar.f123167b);
    }

    public final int hashCode() {
        String str = this.f123166a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        o oVar = this.f123167b;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CommonJsonRespWithUrl(url=" + this.f123166a + ", resp=" + this.f123167b + ")";
    }

    public e(String str, o oVar) {
        l.d(str, "");
        l.d(oVar, "");
        this.f123166a = str;
        this.f123167b = oVar;
    }
}
