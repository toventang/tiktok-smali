package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class InfoStickerNewView$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f149848a;

    static {
        Covode.recordClassIndex(98656);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f149848a.f149863a.isDisposed()) {
            this.f149848a.f149863a.dispose();
        }
    }
}
