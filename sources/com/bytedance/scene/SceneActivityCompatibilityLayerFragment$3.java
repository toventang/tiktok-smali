package com.bytedance.scene;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

class SceneActivityCompatibilityLayerFragment$3 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f42651a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42652b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f42653c;

    static {
        Covode.recordClassIndex(26210);
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
        this.f42651a.getLifecycle().b(this);
        this.f42653c.f42920b.b(this.f42652b);
    }
}
