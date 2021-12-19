package com.bytedance.hox;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class Hox$activityLifeObserver$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hox f31032a;

    static {
        Covode.recordClassIndex(18019);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    Hox$activityLifeObserver$1(Hox hox) {
        this.f31032a = hox;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        int i2 = a.f31038a[aVar.ordinal()];
        if (i2 == 1) {
            this.f31032a.f31024b = true;
        } else if (i2 == 2) {
            this.f31032a.f31024b = false;
        }
    }
}
