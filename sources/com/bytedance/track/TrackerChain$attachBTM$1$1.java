package com.bytedance.track;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TrackerChain$attachBTM$1$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f44405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f44406b;

    static {
        Covode.recordClassIndex(27205);
    }

    TrackerChain$attachBTM$1$1(a aVar, int i2) {
        this.f44405a = aVar;
        this.f44406b = i2;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (d.f44418a[aVar.ordinal()] == 1) {
            c.a(this.f44405a, this.f44406b);
        }
    }
}
