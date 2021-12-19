package com.ss.android.ugc.aweme.account.login.v2.base;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import f.a.e.b.b;
import f.a.e.e.c.y;
import f.a.n;
import f.a.r;
import f.a.s;
import h.f.b.l;

public final class f {
    static {
        Covode.recordClassIndex(39781);
    }

    public static final <T> n<T> a(n<T> nVar, a aVar) {
        n<T> a2;
        l.d(nVar, "");
        l.d(aVar, "");
        MaybeBindLifeCycleTransformer maybeBindLifeCycleTransformer = new MaybeBindLifeCycleTransformer();
        if (aVar.ab_()) {
            m viewLifecycleOwner = aVar.getViewLifecycleOwner();
            l.b(viewLifecycleOwner, "");
            viewLifecycleOwner.getLifecycle().a(maybeBindLifeCycleTransformer);
        } else {
            aVar.getLifecycle().a(maybeBindLifeCycleTransformer);
        }
        r a3 = ((s) b.a((Object) maybeBindLifeCycleTransformer, "transformer is null")).a(nVar);
        if (a3 instanceof n) {
            a2 = f.a.h.a.a((n) a3);
        } else {
            b.a((Object) a3, "onSubscribe is null");
            a2 = f.a.h.a.a(new y(a3));
        }
        l.b(a2, "");
        return a2;
    }
}
