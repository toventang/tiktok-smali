package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$10 implements e<ProviderEffectModel> {
    final /* synthetic */ IFetchProviderEffect $oldListener;

    static {
        Covode.recordClassIndex(95562);
    }

    ListenerAdaptExtKt$toKNListener$10(IFetchProviderEffect iFetchProviderEffect) {
        this.$oldListener = iFetchProviderEffect;
    }

    public final void onSuccess(ProviderEffectModel providerEffectModel) {
        l.c(providerEffectModel, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel(providerEffectModel));
    }

    public final void onFail(ProviderEffectModel providerEffectModel, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
