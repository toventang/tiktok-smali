package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.ugc.effectplatform.h.i;

public final class ListenerAdaptExtKt$toKNListener$8 implements i {
    final /* synthetic */ IUpdateTagListener $oldListener;

    static {
        Covode.recordClassIndex(95581);
    }

    @Override // com.ss.ugc.effectplatform.h.i
    public final void onFinally() {
        this.$oldListener.onFinally();
    }

    ListenerAdaptExtKt$toKNListener$8(IUpdateTagListener iUpdateTagListener) {
        this.$oldListener = iUpdateTagListener;
    }
}
