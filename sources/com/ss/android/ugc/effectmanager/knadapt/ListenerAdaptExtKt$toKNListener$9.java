package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.ugc.effectplatform.h.e;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$9 implements e<Boolean> {
    final /* synthetic */ IIsTagNeedUpdatedListener $oldListener;

    static {
        Covode.recordClassIndex(95582);
    }

    ListenerAdaptExtKt$toKNListener$9(IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        this.$oldListener = iIsTagNeedUpdatedListener;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.ugc.effectplatform.h.e
    public final /* synthetic */ void onSuccess(Boolean bool) {
        onSuccess(bool.booleanValue());
    }

    public final void onSuccess(boolean z) {
        if (z) {
            this.$oldListener.onTagNeedUpdate();
        } else {
            this.$oldListener.onTagNeedNotUpdate();
        }
    }

    public final void onFail(Boolean bool, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onTagNeedNotUpdate();
    }
}
