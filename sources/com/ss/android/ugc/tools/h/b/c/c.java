package com.ss.android.ugc.tools.h.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.a.a;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<d> f149355a;

    static {
        Covode.recordClassIndex(98350);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(h.f.a.a<? extends d> aVar) {
        l.d(aVar, "");
        this.f149355a = aVar;
    }

    @Override // com.ss.android.ugc.tools.h.a.a.a
    public final boolean a(Effect effect) {
        l.d(effect, "");
        return this.f149355a.invoke().c(effect);
    }
}
