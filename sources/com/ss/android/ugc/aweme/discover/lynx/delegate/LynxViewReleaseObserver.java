package com.ss.android.ugc.aweme.discover.lynx.delegate;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.au;

public final class LynxViewReleaseObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    public LynxView f81475a;

    static {
        Covode.recordClassIndex(50632);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        LynxView lynxView = this.f81475a;
        if (lynxView != null) {
            lynxView.destroy();
        }
        this.f81475a = null;
    }

    public LynxViewReleaseObserver(LynxView lynxView) {
        this.f81475a = lynxView;
    }
}
