package com.ss.android.ugc.aweme.search.l.a.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public long f121315b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f121316c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f121317d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f121318e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f121319f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f121320g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f121321h = -1;

    /* renamed from: i  reason: collision with root package name */
    public long f121322i = -1;

    /* renamed from: j  reason: collision with root package name */
    public long f121323j = -1;

    /* renamed from: k  reason: collision with root package name */
    public long f121324k = -1;

    /* renamed from: l  reason: collision with root package name */
    public long f121325l = -1;

    /* renamed from: m  reason: collision with root package name */
    public long f121326m = -1;
    public o n;
    public boolean o;
    public Long p;
    public Long q;
    public Long r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public Integer w;

    static {
        Covode.recordClassIndex(79069);
    }

    public final boolean d() {
        if (this.f121318e != -1 || this.o) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f121315b != -1) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (this.f121318e == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f121318e = currentTimeMillis;
            a(currentTimeMillis - this.f121317d);
        }
    }

    public final void a() {
        if (this.f121317d == -1) {
            this.f121317d = System.currentTimeMillis();
            this.f121318e = -1;
        }
    }

    public final void b() {
        Integer num;
        if (this.f121318e == -1 && (num = com.ss.android.ugc.aweme.search.l.a.a.f121302c.f121330c) != null && num.intValue() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f121318e = currentTimeMillis;
            a(currentTimeMillis - this.f121317d);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f121327a;

        static {
            Covode.recordClassIndex(79070);
        }

        a(d dVar) {
            this.f121327a = dVar;
        }

        public final void run() {
            Integer num;
            if (this.f121327a.f121325l == -1) {
                this.f121327a.f121325l = System.currentTimeMillis();
                d dVar = this.f121327a;
                long j2 = dVar.f121325l - this.f121327a.f121315b;
                if (dVar.p == null) {
                    dVar.p = Long.valueOf(j2);
                    dVar.a("cost", Long.valueOf(j2));
                }
                if (this.f121327a.o && (!this.f121327a.o || (num = com.ss.android.ugc.aweme.search.l.a.a.f121302c.f121331d) == null || num.intValue() != 0)) {
                    this.f121327a.f121325l = -1;
                } else if (!com.ss.android.ugc.aweme.search.l.a.a.f121300a && !com.ss.android.ugc.aweme.search.l.a.a.f121301b && com.ss.android.ugc.aweme.search.l.a.a.f121303d.p != null && com.ss.android.ugc.aweme.search.l.a.a.c()) {
                    com.ss.android.ugc.aweme.search.l.a.a.b();
                }
            }
        }
    }

    public final String toString() {
        return "SearchChainWholeProgressCost(cost=" + this.p + ", triggerNetCost=" + this.q + ", triggerRealRequstCost=" + this.r + ", netCost=" + this.s + ", dataParseCost=" + this.t + ", viewDrawCost=" + this.u + ')';
    }

    private final void a(long j2) {
        this.s = Long.valueOf(j2);
        a("net_cost", Long.valueOf(j2));
    }

    private static boolean b(String str) {
        return l.a((Object) str, (Object) com.ss.android.ugc.aweme.search.l.a.a.f121304e.f121311e);
    }

    private boolean a(String str) {
        l.d(str, "");
        boolean z = com.ss.android.ugc.aweme.search.l.a.a.f121300a;
        boolean z2 = com.ss.android.ugc.aweme.search.l.a.a.f121301b;
        boolean d2 = d();
        if (z || !d2 || z2) {
            return false;
        }
        return true;
    }

    public final void a(Integer num) {
        if (this.f121317d == -1) {
            this.f121317d = System.currentTimeMillis();
            this.f121318e = -1;
            com.ss.android.ugc.aweme.search.l.a.a.f121302c.a(num);
        }
    }

    public final void a(View view, String str) {
        l.d(view, "");
        if (a("onEventEnd") && b(str)) {
            view.postOnAnimation(new a(this));
        }
    }
}
