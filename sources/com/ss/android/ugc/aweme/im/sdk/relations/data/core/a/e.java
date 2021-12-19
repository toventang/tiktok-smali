package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public abstract class e<R> {

    /* renamed from: g  reason: collision with root package name */
    protected d<R> f103035g;

    static {
        Covode.recordClassIndex(66051);
    }

    public abstract void bG_();

    public abstract void bH_();

    public abstract boolean bI_();

    public abstract boolean e();

    public boolean b() {
        if (this.f103035g != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(d<R> dVar) {
        l.d(dVar, "");
        this.f103035g = dVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th, boolean z) {
        l.d(th, "");
        if (z) {
            d<R> dVar = this.f103035g;
            if (dVar == null) {
                l.a("loadSubscriber");
            }
            dVar.c(th);
            return;
        }
        d<R> dVar2 = this.f103035g;
        if (dVar2 == null) {
            l.a("loadSubscriber");
        }
        dVar2.a(th);
    }

    /* access modifiers changed from: protected */
    public final void a(List<R> list, boolean z) {
        l.d(list, "");
        if (z) {
            d<R> dVar = this.f103035g;
            if (dVar == null) {
                l.a("loadSubscriber");
            }
            dVar.b(list, e());
            return;
        }
        d<R> dVar2 = this.f103035g;
        if (dVar2 == null) {
            l.a("loadSubscriber");
        }
        dVar2.a(list, e());
    }
}
