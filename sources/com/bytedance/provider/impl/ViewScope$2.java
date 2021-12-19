package com.bytedance.provider.impl;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.f;
import h.f.b.l;

public final class ViewScope$2 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f42012a;

    static {
        Covode.recordClassIndex(25689);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            f.a(this.f42012a);
        }
    }
}
