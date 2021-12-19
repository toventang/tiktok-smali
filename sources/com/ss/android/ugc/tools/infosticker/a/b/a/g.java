package com.ss.android.ugc.tools.infosticker.a.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.b.a.b;
import com.ss.android.ugc.tools.infosticker.a.b.m;
import h.f.a.a;
import h.f.b.l;

public final class g extends b<Effect, m> implements com.ss.android.ugc.tools.infosticker.a.b.b {
    static {
        Covode.recordClassIndex(98384);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a<? extends d> aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.tools.h.b.a.b
    public final /* synthetic */ m a(Effect effect) {
        l.d(effect, "");
        return new m();
    }

    @Override // com.ss.android.ugc.tools.h.b.a.b
    public final Exception a(Effect effect, ExceptionResult exceptionResult) {
        l.d(effect, "");
        l.d(exceptionResult, "");
        return exceptionResult.getException();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.tools.h.b.a.b
    public final /* synthetic */ m b(Effect effect, ExceptionResult exceptionResult) {
        l.d(effect, "");
        l.d(exceptionResult, "");
        return new m(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.tools.h.b.a.b
    public final /* synthetic */ Effect a(Effect effect, Effect effect2) {
        l.d(effect, "");
        return effect2 == null ? effect : effect2;
    }
}
