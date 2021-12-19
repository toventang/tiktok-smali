package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$1<V> implements Callable<TResult> {
    final /* synthetic */ ModelInfo $response;
    final /* synthetic */ ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 this$0;

    static {
        Covode.recordClassIndex(95229);
    }

    ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$1(ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1, ModelInfo modelInfo) {
        this.this$0 = modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1;
        this.$response = modelInfo;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.ss.android.ugc.effectmanager.model.ModelInfo(this.$response));
        return this.this$0.this$0.downloadAndUpdateModelList(null, arrayList, null).get(this.$response.getName());
    }
}
