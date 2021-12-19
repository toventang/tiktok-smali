package com.bytedance.jedi.arch;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;

public final class BaseJediViewModel$selectSubscribe$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f39360a;

    static {
        Covode.recordClassIndex(24144);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f39360a.isDisposed()) {
            this.f39360a.dispose();
        }
    }

    BaseJediViewModel$selectSubscribe$2(b bVar) {
        this.f39360a = bVar;
    }
}
