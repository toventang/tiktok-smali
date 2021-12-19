package com.bytedance.android.livesdk.container.util;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class KeyboardWatcher$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f16881a;

    static {
        Covode.recordClassIndex(9373);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            f fVar = this.f16881a;
            fVar.f16896a.getViewTreeObserver().removeOnGlobalLayoutListener(fVar);
        }
    }
}
