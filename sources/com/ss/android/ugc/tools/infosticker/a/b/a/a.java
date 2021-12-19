package com.ss.android.ugc.tools.infosticker.a.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.f;
import com.ss.android.ugc.tools.infosticker.a.b.b;
import com.ss.android.ugc.tools.infosticker.a.b.m;
import h.f.b.l;

public final class a extends com.ss.android.ugc.tools.h.b.a.a<Effect, Effect, m> implements com.ss.android.ugc.tools.infosticker.a.b.a {

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.tools.h.a.a.a f149383e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<b> f149384f;

    static {
        Covode.recordClassIndex(98372);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ String a(Effect effect) {
        Effect effect2 = effect;
        l.d(effect2, "");
        String effectId = effect2.getEffectId();
        if (effectId.length() <= 0 || effectId == null) {
            return effect2.getId();
        }
        return effectId;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.b.a.a
    public final /* synthetic */ void a(Effect effect, f<Effect, Effect, m> fVar) {
        Effect effect2 = effect;
        l.d(effect2, "");
        l.d(fVar, "");
        if (this.f149383e.a(effect2)) {
            fVar.a(effect2, effect2);
        } else {
            this.f149384f.invoke().a(effect2, fVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.tools.h.a.a.a aVar, h.f.a.a<? extends b> aVar2, int i2) {
        super(i2);
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149383e = aVar;
        this.f149384f = aVar2;
    }
}
