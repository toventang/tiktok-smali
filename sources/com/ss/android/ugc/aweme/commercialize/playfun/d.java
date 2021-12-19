package com.ss.android.ugc.aweme.commercialize.playfun;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public Runnable f74993a;

    /* renamed from: b  reason: collision with root package name */
    public final e f74994b;

    static {
        Covode.recordClassIndex(46233);
    }

    public static void a(String str) {
        l.d(str, "");
    }

    public abstract void a();

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public boolean f() {
        return false;
    }

    public final void g() {
        this.f74994b.a(0);
    }

    public void e() {
        Runnable runnable = this.f74993a;
        if (runnable != null) {
            this.f74994b.n.removeCallbacks(runnable);
        }
        this.f74993a = null;
    }

    public d(e eVar) {
        l.d(eVar, "");
        this.f74994b = eVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Runnable runnable) {
        l.d(runnable, "");
        this.f74993a = runnable;
        this.f74994b.n.post(runnable);
    }
}
