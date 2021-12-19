package com.bytedance.android.monitorV2.h.a;

import com.a;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f23966a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23967b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23968c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23969d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23970e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23971f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23972g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23973h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23974i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23975j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23976k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f23977l = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23978m = true;

    static {
        Covode.recordClassIndex(14135);
    }

    public final boolean a() {
        b.c("HybridMonitor", a.a("switch enableMonitor: %b", new Object[]{Boolean.valueOf(this.f23966a)}));
        return this.f23966a;
    }

    public final boolean b() {
        b.c("HybridMonitor", a.a("switch webEnableMonitor: %b", new Object[]{Boolean.valueOf(this.f23967b)}));
        return this.f23967b;
    }

    public final boolean c() {
        b.c("HybridMonitor", a.a("switch webEnableBlank: %b", new Object[]{Boolean.valueOf(this.f23968c)}));
        return this.f23968c;
    }

    public final boolean d() {
        b.c("HybridMonitor", a.a("switch webEnableJSB: %b", new Object[]{Boolean.valueOf(this.f23970e)}));
        return this.f23970e;
    }

    public final boolean e() {
        b.c("HybridMonitor", a.a("switch webEnableInject: %b", new Object[]{Boolean.valueOf(this.f23971f)}));
        return this.f23971f;
    }

    public final boolean f() {
        b.c("HybridMonitor", a.a("switch lynxEnableMonitor: %b", new Object[]{Boolean.valueOf(this.f23972g)}));
        return this.f23972g;
    }

    public final boolean g() {
        b.c("HybridMonitor", a.a("switch ynxEnablePerf: %b", new Object[]{Boolean.valueOf(this.f23973h)}));
        return this.f23973h;
    }

    public final boolean h() {
        b.c("HybridMonitor", a.a("switch lynxEnableBlank: %b", new Object[]{Boolean.valueOf(this.f23974i)}));
        return this.f23974i;
    }

    public final boolean i() {
        b.c("HybridMonitor", a.a("switch lynxEnableJsb: %b", new Object[]{Boolean.valueOf(this.f23976k)}));
        return this.f23976k;
    }

    public final boolean j() {
        b.c("HybridMonitor", a.a("switch ebEnableUpdatePageData: %b", new Object[]{Boolean.valueOf(this.f23978m)}));
        return this.f23978m;
    }

    public final String toString() {
        return "SwitchConfig{enableMonitor=" + this.f23966a + ", webEnableMonitor=" + this.f23967b + ", webEnableBlank=" + this.f23968c + ", webEnableFetch=" + this.f23969d + ", webEnableJSB=" + this.f23970e + ", webEnableInject=" + this.f23971f + "\n, lynxEnableMonitor=" + this.f23972g + ", lynxEnablePerf=" + this.f23973h + ", lynxEnableBlank=" + this.f23974i + ", lynxEnableFetch=" + this.f23975j + ", lynxEnableJsb=" + this.f23976k + "\n, webEnableAutoReport=" + this.f23977l + ", webEnableUpdatePageData=" + this.f23978m + '}';
    }
}
