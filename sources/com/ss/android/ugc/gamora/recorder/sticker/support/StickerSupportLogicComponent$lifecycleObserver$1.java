package com.ss.android.ugc.gamora.recorder.sticker.support;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bef.effectsdk.view.BEFView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class StickerSupportLogicComponent$lifecycleObserver$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f148488a;

    static {
        Covode.recordClassIndex(97883);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        BEFView bEFView = this.f148488a.f148490b;
        if (bEFView != null) {
            bEFView.onPause();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        BEFView bEFView = this.f148488a.f148490b;
        if (bEFView != null) {
            bEFView.onResume();
        }
        this.f148488a.b();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    StickerSupportLogicComponent$lifecycleObserver$1(b bVar) {
        this.f148488a = bVar;
    }
}
