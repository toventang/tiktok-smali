package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import d.a.f.d;
import d.a.g.f;
import h.f.a.b;

public final class ListenerAdaptExtKt$commit$1 implements d {
    final /* synthetic */ b $callbackInMainThread;
    final /* synthetic */ Object $data;
    final /* synthetic */ b $runnable;

    static {
        Covode.recordClassIndex(95556);
    }

    @Override // d.a.f.d
    public final void cancel() {
    }

    @Override // d.a.f.d
    public final String getId() {
        return "";
    }

    @Override // d.a.f.d
    public final void run() {
        f.a(new ListenerAdaptExtKt$commit$1$run$1(this, this.$runnable.invoke(this.$data)));
    }

    ListenerAdaptExtKt$commit$1(b bVar, Object obj, b bVar2) {
        this.$runnable = bVar;
        this.$data = obj;
        this.$callbackInMainThread = bVar2;
    }
}
