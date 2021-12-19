package com.bytedance.ies.ugc.aweme.network.ext;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;

public final class RxExtKt$lifecycle$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f35025a;

    static {
        Covode.recordClassIndex(21012);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f35025a.dispose();
    }
}
