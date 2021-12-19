package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class InfoStickerView$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f149655a;

    static {
        Covode.recordClassIndex(98546);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f149655a.A.isDisposed()) {
            this.f149655a.A.dispose();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    InfoStickerView$1(l lVar) {
        this.f149655a = lVar;
    }
}
