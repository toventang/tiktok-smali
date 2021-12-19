package com.bytedance.jedi.scene;

import androidx.lifecycle.ac;
import androidx.lifecycle.af;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.au;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;

public final class SceneLifecycleAwareLazy<T extends ac> extends lifecycleAwareLazy<T> implements au {
    static {
        Covode.recordClassIndex(24492);
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SceneLifecycleAwareLazy(m mVar, a<String> aVar, a<? extends T> aVar2) {
        super(mVar, aVar, aVar2);
        l.c(mVar, "");
        l.c(aVar2, "");
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void a(m mVar, T t, a<String> aVar) {
        l.c(mVar, "");
        l.c(t, "");
        l.c(aVar, "");
        j jVar = ((j) mVar).o;
        if (jVar != null) {
            l.c(jVar, "");
            l.c(t, "");
            l.c(aVar, "");
            af viewModelStore = jVar.getViewModelStore();
            l.a((Object) viewModelStore, "");
            String invoke = aVar.invoke();
            if (viewModelStore.a(invoke) == null) {
                viewModelStore.a(invoke, t);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SceneLifecycleAwareLazy(m mVar, a aVar, a aVar2, int i2, g gVar) {
        this(mVar, (i2 & 2) != 0 ? null : aVar, aVar2);
    }
}
