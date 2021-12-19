package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.ss.ugc.effectplatform.h.e;
import h.f.b.l;

public final class ModelListenerAdaptKt$toKNListener$1 implements e<String[]> {
    final /* synthetic */ IFetchModelListener $oldListener;

    static {
        Covode.recordClassIndex(95586);
    }

    ModelListenerAdaptKt$toKNListener$1(IFetchModelListener iFetchModelListener) {
        this.$oldListener = iFetchModelListener;
    }

    public final void onSuccess(String[] strArr) {
        l.c(strArr, "");
        this.$oldListener.onSuccess(strArr);
    }

    public final void onFail(String[] strArr, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar).getException());
    }
}
