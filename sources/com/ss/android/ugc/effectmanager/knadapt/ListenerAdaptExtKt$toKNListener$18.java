package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$18 implements e<ResourceListModel> {
    final /* synthetic */ IFetchResourceListener $oldListener;

    static {
        Covode.recordClassIndex(95572);
    }

    ListenerAdaptExtKt$toKNListener$18(IFetchResourceListener iFetchResourceListener) {
        this.$oldListener = iFetchResourceListener;
    }

    public final void onSuccess(ResourceListModel resourceListModel) {
        l.c(resourceListModel, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.ResourceListModel(resourceListModel));
    }

    public final void onFail(ResourceListModel resourceListModel, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
