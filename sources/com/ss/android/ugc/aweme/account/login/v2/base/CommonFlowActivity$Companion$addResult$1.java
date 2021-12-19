package com.ss.android.ugc.aweme.account.login.v2.base;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.e.d;
import com.ss.android.ugc.aweme.au;

public final class CommonFlowActivity$Companion$addResult$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f64709a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f64710b;

    static {
        Covode.recordClassIndex(39755);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        CommonFlowActivity.f64700f.remove(this.f64709a);
        this.f64710b.getLifecycle().b(this);
        d.a().b();
    }

    CommonFlowActivity$Companion$addResult$1(int i2, m mVar) {
        this.f64709a = i2;
        this.f64710b = mVar;
    }
}
