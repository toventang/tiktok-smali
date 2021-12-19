package com.bytedance.scene;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

class SceneActivityCompatibilityLayerFragment$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f42648a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f42650c;

    static {
        Covode.recordClassIndex(26209);
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
        this.f42648a.getLifecycle().b(this);
        this.f42650c.f42919a.b(this.f42649b);
    }
}
