package com.ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "code")

    /* renamed from: a  reason: collision with root package name */
    public final int f78384a;
    @c(a = "message")

    /* renamed from: b  reason: collision with root package name */
    public final String f78385b;
    @c(a = "data")

    /* renamed from: c  reason: collision with root package name */
    public final b f78386c;

    static {
        Covode.recordClassIndex(48677);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f78384a == dVar.f78384a && l.a(this.f78385b, dVar.f78385b) && l.a(this.f78386c, dVar.f78386c);
    }

    public final int hashCode() {
        int i2 = this.f78384a * 31;
        String str = this.f78385b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        b bVar = this.f78386c;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ShowCaseRespModel(code=" + this.f78384a + ", message=" + this.f78385b + ", data=" + this.f78386c + ")";
    }
}
