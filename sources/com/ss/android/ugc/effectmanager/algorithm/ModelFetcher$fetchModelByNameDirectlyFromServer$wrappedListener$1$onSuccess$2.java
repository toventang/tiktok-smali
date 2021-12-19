package com.ss.android.ugc.effectmanager.algorithm;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$2<TTaskResult, TContinuationResult> implements g<Boolean, Void> {
    final /* synthetic */ ModelInfo $response;
    final /* synthetic */ ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 this$0;

    static {
        Covode.recordClassIndex(95230);
    }

    ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$2(ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1, ModelInfo modelInfo) {
        this.this$0 = modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1;
        this.$response = modelInfo;
    }

    @Override // b.g
    public final Void then(i<Boolean> iVar) {
        l.a((Object) iVar, "");
        if (iVar.c()) {
            EPLog.e("ModelFetcher", "download model: " + this.this$0.$modelName + " failed!", iVar.e());
            e eVar = this.this$0.$listener;
            if (eVar == null) {
                return null;
            }
            eVar.onFail(this.$response, new com.ss.ugc.effectplatform.model.e(iVar.e()));
            return null;
        } else if (l.a((Object) iVar.d(), (Object) true)) {
            e eVar2 = this.this$0.$listener;
            if (eVar2 == null) {
                return null;
            }
            eVar2.onSuccess(this.$response);
            return null;
        } else {
            EPLog.e("ModelFetcher", "download model: " + this.this$0.$modelName + " failed with null!");
            e eVar3 = this.this$0.$listener;
            if (eVar3 == null) {
                return null;
            }
            eVar3.onFail(this.$response, new com.ss.ugc.effectplatform.model.e(10002));
            return null;
        }
    }
}
