package com.bytedance.als;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class LiveEvent$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f6449a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f6450b;

    static {
        Covode.recordClassIndex(3100);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f6450b.b(this.f6449a);
    }

    LiveEvent$1(g gVar, m mVar) {
        this.f6450b = gVar;
        this.f6449a = mVar;
    }
}
