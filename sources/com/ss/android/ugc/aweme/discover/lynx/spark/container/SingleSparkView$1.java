package com.ss.android.ugc.aweme.discover.lynx.spark.container;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.lynx.spark.d;
import h.f.b.l;

public final class SingleSparkView$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f81591a;

    static {
        Covode.recordClassIndex(50701);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SingleSparkView$1(a aVar) {
        this.f81591a = aVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            d dVar = this.f81591a.f81593a;
            if (dVar != null) {
                dVar.b();
            }
            for (T t : this.f81591a.f81599g) {
                if (!t.isDisposed()) {
                    t.dispose();
                }
            }
        }
    }
}
