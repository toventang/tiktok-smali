package com.ss.android.ugc.aweme.sticker.repository.internals.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import h.f.a.a;
import h.f.b.l;

public final class c implements p {

    /* renamed from: a  reason: collision with root package name */
    private final a<d> f135520a;

    static {
        Covode.recordClassIndex(88576);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(a<? extends d> aVar) {
        l.d(aVar, "");
        this.f135520a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.p
    public final boolean a(Effect effect) {
        l.d(effect, "");
        return com.ss.android.ugc.aweme.sticker.repository.a.a.a.a(this.f135520a.invoke(), effect);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.p
    public final boolean b(Effect effect) {
        l.d(effect, "");
        return com.ss.android.ugc.aweme.sticker.repository.a.a.a.b(this.f135520a.invoke(), effect);
    }
}
