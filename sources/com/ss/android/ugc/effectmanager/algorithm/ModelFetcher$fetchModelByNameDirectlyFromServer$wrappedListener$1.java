package com.ss.android.ugc.effectmanager.algorithm;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import h.f.b.l;

public final class ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 implements e<ModelInfo> {
    final /* synthetic */ boolean $downloadModelAfterFetch;
    final /* synthetic */ e $listener;
    final /* synthetic */ String $modelName;
    final /* synthetic */ ModelFetcher this$0;

    static {
        Covode.recordClassIndex(95228);
    }

    public final void onSuccess(ModelInfo modelInfo) {
        l.c(modelInfo, "");
        if (this.$downloadModelAfterFetch) {
            EPLog.d("ModelFetcher", "fetch model: " + this.$modelName + " info success!");
            i.b(new ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$1(this, modelInfo), i.f4824a).a(new ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$2(this, modelInfo), i.f4826c, null);
            return;
        }
        e eVar = this.$listener;
        if (eVar != null) {
            eVar.onSuccess(modelInfo);
        }
    }

    public final void onFail(ModelInfo modelInfo, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        e eVar2 = this.$listener;
        if (eVar2 != null) {
            eVar2.onFail(modelInfo, eVar);
        }
    }

    ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1(ModelFetcher modelFetcher, e eVar, boolean z, String str) {
        this.this$0 = modelFetcher;
        this.$listener = eVar;
        this.$downloadModelAfterFetch = z;
        this.$modelName = str;
    }
}
