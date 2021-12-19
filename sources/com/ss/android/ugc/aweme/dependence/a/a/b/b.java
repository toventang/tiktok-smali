package com.ss.android.ugc.aweme.dependence.a.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b<Param, Target> {

    /* renamed from: a  reason: collision with root package name */
    public AtomicInteger f79567a = new AtomicInteger(-1);

    /* renamed from: b  reason: collision with root package name */
    public int f79568b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79569c;

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f79570d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public Target f79571e;

    /* renamed from: f  reason: collision with root package name */
    public e f79572f;

    /* renamed from: g  reason: collision with root package name */
    public String f79573g;

    /* renamed from: h  reason: collision with root package name */
    public Param f79574h;

    static {
        Covode.recordClassIndex(49424);
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void b(com.ss.android.ugc.aweme.dependence.a.a.a.b<Param, Target> bVar);

    /* access modifiers changed from: protected */
    public void c(com.ss.android.ugc.aweme.dependence.a.a.a.b<Param, Target> bVar) {
        l.d(bVar, "");
    }

    public final void a(int i2) {
        this.f79567a.set(i2);
    }

    public final void a(com.ss.android.ugc.aweme.dependence.a.a.a.b<Param, Target> bVar) {
        l.d(bVar, "");
        if (!this.f79570d.get()) {
            this.f79570d.set(true);
            bVar.a(this);
        }
        if (a()) {
            a(3);
            c(bVar);
            bVar.b(this);
            return;
        }
        a(2);
        b(bVar);
    }

    public b(String str, Param param) {
        l.d(str, "");
        this.f79573g = str;
        this.f79574h = param;
        a(0);
    }
}
