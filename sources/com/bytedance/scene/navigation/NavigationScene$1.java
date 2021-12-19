package com.bytedance.scene.navigation;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class NavigationScene$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f42938a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f42939b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f42940c;

    static {
        Covode.recordClassIndex(26338);
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
        this.f42938a.getLifecycle().b(this);
        this.f42940c.f42960h.remove(this.f42939b);
    }

    NavigationScene$1(d dVar, m mVar, c cVar) {
        this.f42940c = dVar;
        this.f42938a = mVar;
        this.f42939b = cVar;
    }
}
