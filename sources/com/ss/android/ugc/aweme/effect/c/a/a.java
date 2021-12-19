package com.ss.android.ugc.aweme.effect.c.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import dmt.av.video.w;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<g> f88908a;

    static {
        Covode.recordClassIndex(55919);
    }

    public abstract void a(w wVar);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public abstract void b(w wVar);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.asve.editor.g> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(h.f.a.a<? extends g> aVar) {
        l.d(aVar, "");
        this.f88908a = aVar;
    }

    /* access modifiers changed from: protected */
    public final int a(w wVar, int i2) {
        if (wVar == null) {
            wVar = w.a();
        }
        g invoke = this.f88908a.invoke();
        if (w.a(wVar)) {
            if (a()) {
                return invoke.G() - i2;
            }
            return i2;
        } else if (w.b(wVar) || w.c(wVar)) {
            return invoke.r(i2);
        } else {
            if (w.d(wVar)) {
                return i2;
            }
            throw new UnsupportedOperationException("apply time effect: " + wVar + " is not supported yet.");
        }
    }

    /* access modifiers changed from: protected */
    public final int b(w wVar, int i2) {
        if (wVar == null) {
            wVar = w.a();
        }
        g invoke = this.f88908a.invoke();
        if (w.a(wVar)) {
            if (a()) {
                return invoke.G() - i2;
            }
            return i2;
        } else if (w.b(wVar) || w.c(wVar)) {
            return invoke.s(i2);
        } else {
            if (w.d(wVar)) {
                return i2;
            }
            throw new UnsupportedOperationException("apply time effect: " + wVar + " is not supported yet.");
        }
    }
}
