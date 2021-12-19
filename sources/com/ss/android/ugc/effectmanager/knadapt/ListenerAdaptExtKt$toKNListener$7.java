package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$7 implements e<SearchEffectResponseV2> {
    final /* synthetic */ ISearchEffectListenerV2 $oldListener;

    static {
        Covode.recordClassIndex(95580);
    }

    ListenerAdaptExtKt$toKNListener$7(ISearchEffectListenerV2 iSearchEffectListenerV2) {
        this.$oldListener = iSearchEffectListenerV2;
    }

    public final void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
        l.c(searchEffectResponseV2, "");
        com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2 searchEffectResponseV22 = new com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2();
        searchEffectResponseV22.setData(new SearchEffectModel(searchEffectResponseV2.getData()));
        searchEffectResponseV22.status_code = searchEffectResponseV2.getStatus_code();
        searchEffectResponseV22.message = searchEffectResponseV2.getMessage();
        this.$oldListener.onSuccess(searchEffectResponseV22);
    }

    public final void onFail(SearchEffectResponseV2 searchEffectResponseV2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
