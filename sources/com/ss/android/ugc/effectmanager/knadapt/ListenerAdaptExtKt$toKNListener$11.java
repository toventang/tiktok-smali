package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.ugc.effectplatform.h.d;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.e;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$11 implements d {
    final /* synthetic */ IDownloadProviderEffectListener $oldListener;

    static {
        Covode.recordClassIndex(95563);
    }

    ListenerAdaptExtKt$toKNListener$11(IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        this.$oldListener = iDownloadProviderEffectListener;
    }

    public final void onSuccess(ProviderEffect providerEffect) {
        l.c(providerEffect, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect));
    }

    public final void onFail(ProviderEffect providerEffect, e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }

    @Override // com.ss.ugc.effectplatform.h.d
    public final void onProgress(ProviderEffect providerEffect, int i2, long j2) {
        IDownloadProviderEffectListener iDownloadProviderEffectListener = this.$oldListener;
        if (iDownloadProviderEffectListener instanceof IDownloadProviderEffectProgressListener) {
            ((IDownloadProviderEffectProgressListener) iDownloadProviderEffectListener).onProgress(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), i2, j2);
        }
    }
}
