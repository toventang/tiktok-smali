package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.e;
import h.f.b.l;

public final class AlgorithmModelManager$fetchResourcesWithModelNames$1 implements e<String[]> {
    final /* synthetic */ FetchResourcesListener $listener;

    static {
        Covode.recordClassIndex(95205);
    }

    AlgorithmModelManager$fetchResourcesWithModelNames$1(FetchResourcesListener fetchResourcesListener) {
        this.$listener = fetchResourcesListener;
    }

    public final void onSuccess(String[] strArr) {
        l.c(strArr, "");
        FetchResourcesListener fetchResourcesListener = this.$listener;
        if (fetchResourcesListener != null) {
            fetchResourcesListener.onSuccess();
        }
    }

    public final void onFail(String[] strArr, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        FetchResourcesListener fetchResourcesListener = this.$listener;
        if (fetchResourcesListener != null) {
            fetchResourcesListener.onFailed(eVar.f153653c);
        }
    }
}
