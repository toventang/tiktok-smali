package com.bytedance.ies.powerlist.optimize;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import h.f.b.l;

public final class Optimizer$init$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f34297a;

    static {
        Covode.recordClassIndex(20494);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    public Optimizer$init$1(b bVar) {
        this.f34297a = bVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        b bVar;
        l.c(mVar, "");
        l.c(aVar, "");
        if (c.f34323a[aVar.ordinal()] == 1 && (bVar = this.f34297a.f34317c) != null) {
            bVar.dispose();
        }
    }
}
