package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class e {
    @c(a = "enableNetworkMonitor")

    /* renamed from: a  reason: collision with root package name */
    public boolean f112404a;
    @c(a = "enableTTNetMonitor")

    /* renamed from: b  reason: collision with root package name */
    public boolean f112405b;
    @c(a = "enableOkHttpMonitor")

    /* renamed from: c  reason: collision with root package name */
    public boolean f112406c;
    @c(a = "enableUrlConnectionMonitor")

    /* renamed from: d  reason: collision with root package name */
    public boolean f112407d;
    @c(a = "enableHttpClientMonitor")

    /* renamed from: e  reason: collision with root package name */
    public boolean f112408e;
    @c(a = "enableWebMonitor")

    /* renamed from: f  reason: collision with root package name */
    public boolean f112409f;

    static {
        Covode.recordClassIndex(72249);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f112404a == eVar.f112404a && this.f112405b == eVar.f112405b && this.f112406c == eVar.f112406c && this.f112407d == eVar.f112407d && this.f112408e == eVar.f112408e && this.f112409f == eVar.f112409f;
    }

    public final int hashCode() {
        boolean z = this.f112404a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f112405b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f112406c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f112407d;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.f112408e;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        if (!this.f112409f) {
            i2 = 0;
        }
        return i22 + i2;
    }

    public final String toString() {
        return "NetworkMonitorConfig(enableNetworkMonitor=" + this.f112404a + ", enableTTNetMonitor=" + this.f112405b + ", enableOkHttpMonitor=" + this.f112406c + ", enableUrlConnectionMonitor=" + this.f112407d + ", enableHttpClientMonitor=" + this.f112408e + ", enableWebMonitor=" + this.f112409f + ")";
    }

    private e() {
        this.f112404a = true;
        this.f112405b = true;
        this.f112406c = true;
        this.f112407d = true;
        this.f112408e = true;
        this.f112409f = true;
    }

    public /* synthetic */ e(byte b2) {
        this();
    }
}
