package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.h.g;
import com.ss.ugc.effectplatform.model.e;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$1 implements g {
    final /* synthetic */ IFetchEffectListener $oldListener;
    private Effect oldEffect;

    static {
        Covode.recordClassIndex(95561);
    }

    ListenerAdaptExtKt$toKNListener$1(IFetchEffectListener iFetchEffectListener) {
        this.$oldListener = iFetchEffectListener;
    }

    @Override // com.ss.ugc.effectplatform.h.g
    public final void onStart(com.ss.ugc.effectplatform.model.Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onStart(this.oldEffect);
    }

    public final void onSuccess(com.ss.ugc.effectplatform.model.Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onSuccess(this.oldEffect);
    }

    public final void onFail(com.ss.ugc.effectplatform.model.Effect effect, e eVar) {
        l.c(eVar, "");
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onFail(this.oldEffect, ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }

    @Override // com.ss.ugc.effectplatform.h.g
    public final void onProgress(com.ss.ugc.effectplatform.model.Effect effect, int i2, long j2) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        IFetchEffectListener iFetchEffectListener = this.$oldListener;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(this.oldEffect, i2, j2);
        }
    }
}
