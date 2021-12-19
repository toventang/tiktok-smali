package com.bytedance;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;

public final class RxLiveEvent$observe$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f6410a;

    static {
        Covode.recordClassIndex(3086);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f6410a.dispose();
    }

    RxLiveEvent$observe$1(b bVar) {
        this.f6410a = bVar;
    }
}
