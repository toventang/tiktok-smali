package com.ss.android.ugc.tools.view.base;

import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public abstract class HumbleViewModel extends ac implements au {
    private boolean destroyed;
    private final m lifecycleOwner;

    static {
        Covode.recordClassIndex(98782);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean isDestroyed() {
        return this.destroyed;
    }

    private final void destroy() {
        if (!this.destroyed) {
            this.destroyed = true;
            onCleared();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        destroy();
        this.lifecycleOwner.getLifecycle().b(this);
    }

    private final void observeLifecycle() {
        i lifecycle = this.lifecycleOwner.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a() == i.b.DESTROYED) {
            destroy();
        } else {
            this.lifecycleOwner.getLifecycle().a(this);
        }
    }

    public HumbleViewModel(m mVar) {
        l.d(mVar, "");
        this.lifecycleOwner = mVar;
        observeLifecycle();
    }
}
