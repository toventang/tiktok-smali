package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.ugc.effectplatform.h.h;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import h.f.b.l;

public final class ModelListenerAdaptKt$toKNListener$2 implements h {
    final /* synthetic */ ModelEventListener $oldListener;

    static {
        Covode.recordClassIndex(95587);
    }

    ModelListenerAdaptKt$toKNListener$2(ModelEventListener modelEventListener) {
        this.$oldListener = modelEventListener;
    }

    @Override // com.ss.ugc.effectplatform.h.h
    public final void onModelNotFound(Effect effect, Exception exc) {
        l.c(exc, "");
        this.$oldListener.onModelNotFound(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), exc);
    }

    @Override // com.ss.ugc.effectplatform.h.h
    public final void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
        l.c(effect, "");
        l.c(modelInfo, "");
        this.$oldListener.onModelDownloadStart(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.ss.android.ugc.effectmanager.model.ModelInfo(modelInfo));
    }

    @Override // com.ss.ugc.effectplatform.h.h
    public final void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
        l.c(effect, "");
        l.c(modelInfo, "");
        l.c(exc, "");
        this.$oldListener.onModelDownloadError(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.ss.android.ugc.effectmanager.model.ModelInfo(modelInfo), exc);
    }

    @Override // com.ss.ugc.effectplatform.h.h
    public final void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j2) {
        l.c(effect, "");
        l.c(modelInfo, "");
        this.$oldListener.onModelDownloadSuccess(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.ss.android.ugc.effectmanager.model.ModelInfo(modelInfo), j2);
    }

    @Override // com.ss.ugc.effectplatform.h.h
    public final void onFetchModelList(boolean z, String str, long j2, String str2) {
        this.$oldListener.onFetchModelList(z, str, j2, str2);
    }
}
