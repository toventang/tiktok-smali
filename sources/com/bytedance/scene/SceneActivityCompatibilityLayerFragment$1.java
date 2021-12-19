package com.bytedance.scene;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class SceneActivityCompatibilityLayerFragment$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f42645a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42646b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f42647c;

    static {
        Covode.recordClassIndex(26208);
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
        this.f42645a.getLifecycle().b(this);
        this.f42647c.f42919a.b(this.f42646b);
    }

    SceneActivityCompatibilityLayerFragment$1(k kVar, m mVar, int i2) {
        this.f42647c = kVar;
        this.f42645a = mVar;
        this.f42646b = i2;
    }
}
