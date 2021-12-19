package com.bytedance.android.live.liveinteract.api.a;

import com.bytedance.android.livesdk.b.a.a;
import com.bytedance.covode.number.Covode;

public final class c extends a<Integer> {
    private static c o;

    /* renamed from: a  reason: collision with root package name */
    public long f9949a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9950b;

    /* renamed from: c  reason: collision with root package name */
    public long f9951c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9952d;

    /* renamed from: e  reason: collision with root package name */
    public int f9953e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a f9954f;

    /* renamed from: g  reason: collision with root package name */
    public String f9955g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9956h;

    /* renamed from: i  reason: collision with root package name */
    public int f9957i;

    /* renamed from: j  reason: collision with root package name */
    public int f9958j;

    /* renamed from: k  reason: collision with root package name */
    public int f9959k;

    /* renamed from: l  reason: collision with root package name */
    public int f9960l;
    private long p;

    static {
        Covode.recordClassIndex(5139);
    }

    private c() {
        this.n = 0;
    }

    public static c a() {
        if (o == null) {
            o = new c();
        }
        return o;
    }

    public final long b() {
        long j2 = this.p;
        this.f9949a += j2;
        this.p = 0;
        return j2;
    }

    public final void c() {
        this.n = 0;
        this.f9950b = false;
        this.p = 0;
        this.f9949a = 0;
        this.f9951c = 0;
        this.f9952d = false;
        this.f9953e = 0;
        this.f9954f = null;
        this.f9955g = null;
        this.f9956h = false;
        this.f9957i = 0;
        this.f9958j = 0;
        this.f9960l = 0;
    }

    public final void a(long j2) {
        if (j2 > this.p) {
            this.p = j2;
        }
    }

    public final void a(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() <= 2) {
            if (2 == num.intValue()) {
                this.f9950b = true;
            }
            super.a((Object) num);
        }
    }
}
