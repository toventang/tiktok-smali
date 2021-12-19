package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;

final class ListenerAdaptExtKt$commit$1$run$1 implements Runnable {
    final /* synthetic */ Object $result;
    final /* synthetic */ ListenerAdaptExtKt$commit$1 this$0;

    static {
        Covode.recordClassIndex(95557);
    }

    ListenerAdaptExtKt$commit$1$run$1(ListenerAdaptExtKt$commit$1 listenerAdaptExtKt$commit$1, Object obj) {
        this.this$0 = listenerAdaptExtKt$commit$1;
        this.$result = obj;
    }

    public final void run() {
        this.this$0.$callbackInMainThread.invoke(this.$result);
    }
}
