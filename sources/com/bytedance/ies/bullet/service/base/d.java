package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f32585a;

    /* renamed from: b  reason: collision with root package name */
    public String f32586b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32587c = false;

    static {
        Covode.recordClassIndex(19344);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f32585a, dVar.f32585a) && l.a(this.f32586b, dVar.f32586b) && this.f32587c == dVar.f32587c;
    }

    public final int hashCode() {
        String str = this.f32585a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32586b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f32587c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "ChannelBundleModel(channel=" + this.f32585a + ", bundlePath=" + this.f32586b + ", valid=" + this.f32587c + ")";
    }

    public final String a() {
        if (this.f32587c) {
            return this.f32585a;
        }
        return null;
    }

    public final String b() {
        if (this.f32587c) {
            return this.f32586b;
        }
        return null;
    }

    public final void a(String str) {
        l.c(str, "");
        this.f32585a = str;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f32586b = str;
    }

    public d(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f32585a = str;
        this.f32586b = str2;
    }
}
