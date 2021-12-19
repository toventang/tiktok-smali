package com.bytedance.scene;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.navigation.b;
import com.ss.android.ugc.aweme.au;

class SceneActivityCompatibilityLayerFragment$4 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f42654a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f42655b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f42656c;

    static {
        Covode.recordClassIndex(26211);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f42654a.getLifecycle().b(this);
        this.f42656c.f42921c.remove(this.f42655b);
    }
}
