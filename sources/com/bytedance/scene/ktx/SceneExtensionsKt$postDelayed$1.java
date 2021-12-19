package com.bytedance.scene.ktx;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class SceneExtensionsKt$postDelayed$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f42924a;

    static {
        Covode.recordClassIndex(26327);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        c.a().removeCallbacks(this.f42924a);
    }

    SceneExtensionsKt$postDelayed$1(Runnable runnable) {
        this.f42924a = runnable;
    }
}
