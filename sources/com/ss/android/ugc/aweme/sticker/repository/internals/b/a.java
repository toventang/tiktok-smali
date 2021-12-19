package com.ss.android.ugc.aweme.sticker.repository.internals.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.ab;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.aweme.sticker.repository.a.l;
import com.ss.android.ugc.aweme.sticker.repository.a.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.f;

public final class a extends com.ss.android.ugc.tools.h.b.a.a<ac, Effect, ab> implements l {

    /* renamed from: e  reason: collision with root package name */
    private final n f135512e;

    static {
        Covode.recordClassIndex(88570);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ String a(ac acVar) {
        ac acVar2 = acVar;
        h.f.b.l.d(acVar2, "");
        return acVar2.f135465a.getEffectId();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.l
    public final boolean a(Effect effect) {
        h.f.b.l.d(effect, "");
        return this.f135512e.a(effect, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(n nVar, int i2) {
        super(i2);
        h.f.b.l.d(nVar, "");
        this.f135512e = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ void a(ac acVar, f<ac, Effect, ab> fVar) {
        h.f.b.l.d(acVar, "");
        h.f.b.l.d(fVar, "");
        this.f135512e.a(acVar, fVar);
    }
}
