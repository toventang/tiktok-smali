package com.bytedance.scene.navigation;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class NavigationScene$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f42941a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f42942b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f42943c;

    static {
        Covode.recordClassIndex(26339);
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
        this.f42941a.getLifecycle().b(this);
        this.f42943c.f42955c.a(this.f42942b);
    }

    NavigationScene$2(d dVar, m mVar, h hVar) {
        this.f42943c = dVar;
        this.f42941a = mVar;
        this.f42942b = hVar;
    }
}
