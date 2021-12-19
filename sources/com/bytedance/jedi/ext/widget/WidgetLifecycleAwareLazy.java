package com.bytedance.jedi.ext.widget;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.af;
import androidx.lifecycle.ah;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;

public final class WidgetLifecycleAwareLazy<T extends ac> extends lifecycleAwareLazy<T> implements au {
    static {
        Covode.recordClassIndex(24491);
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WidgetLifecycleAwareLazy(m mVar, a<String> aVar, a<? extends T> aVar2) {
        super(mVar, aVar, aVar2);
        l.c(mVar, "");
        l.c(aVar2, "");
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void a(m mVar, T t, a<String> aVar) {
        l.c(mVar, "");
        l.c(t, "");
        l.c(aVar, "");
        Object b2 = ((Widget) mVar).j().b();
        if (!(b2 instanceof Fragment)) {
            b2 = null;
        }
        Fragment fragment = (Fragment) b2;
        if (fragment != null) {
            l.c(fragment, "");
            l.c(t, "");
            l.c(aVar, "");
            af a2 = ah.a(fragment);
            l.a((Object) a2, "");
            String invoke = aVar.invoke();
            if (a2.a(invoke) == null) {
                a2.a(invoke, t);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WidgetLifecycleAwareLazy(m mVar, a aVar, a aVar2, int i2, g gVar) {
        this(mVar, (i2 & 2) != 0 ? null : aVar, aVar2);
    }
}
