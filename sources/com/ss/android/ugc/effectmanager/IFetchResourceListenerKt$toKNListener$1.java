package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.h.e;
import h.f.b.l;

public final class IFetchResourceListenerKt$toKNListener$1 implements e<Long> {
    final /* synthetic */ IFetchResourceListener $oldListener;

    static {
        Covode.recordClassIndex(95195);
    }

    IFetchResourceListenerKt$toKNListener$1(IFetchResourceListener iFetchResourceListener) {
        this.$oldListener = iFetchResourceListener;
    }

    public final void onSuccess(long j2) {
        this.$oldListener.onSuccess(j2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.ugc.effectplatform.h.e
    public final /* synthetic */ void onSuccess(Long l2) {
        onSuccess(l2.longValue());
    }

    public final void onFail(Long l2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        IFetchResourceListener iFetchResourceListener = this.$oldListener;
        Exception exception = ListenerAdaptExtKt.toOldExceptionResult(eVar).getException();
        l.a((Object) exception, "");
        iFetchResourceListener.onFailure(exception);
    }
}
