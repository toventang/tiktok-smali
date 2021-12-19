package com.ss.android.ugc.effectmanager.algorithm;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class AlgorithmModelManager$fetchResourcesWithModelNames$3<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {
    final /* synthetic */ FetchResourcesListener $listener;

    static {
        Covode.recordClassIndex(95207);
    }

    AlgorithmModelManager$fetchResourcesWithModelNames$3(FetchResourcesListener fetchResourcesListener) {
        this.$listener = fetchResourcesListener;
    }

    @Override // b.g
    public final Void then(i<Void> iVar) {
        l.a((Object) iVar, "");
        if (iVar.c()) {
            FetchResourcesListener fetchResourcesListener = this.$listener;
            if (fetchResourcesListener == null) {
                return null;
            }
            fetchResourcesListener.onFailed(iVar.e());
            return null;
        }
        FetchResourcesListener fetchResourcesListener2 = this.$listener;
        if (fetchResourcesListener2 == null) {
            return null;
        }
        fetchResourcesListener2.onSuccess();
        return null;
    }
}
