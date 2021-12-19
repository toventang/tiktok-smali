package com.bytedance.provider.impl;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.f;
import h.f.b.l;

public final class FragmentScope$2 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f42011a;

    static {
        Covode.recordClassIndex(25688);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            f.a(this.f42011a);
        }
    }
}
