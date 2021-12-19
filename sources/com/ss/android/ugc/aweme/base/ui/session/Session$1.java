package com.ss.android.ugc.aweme.base.ui.session;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class Session$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f68411a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f68412b;

    static {
        Covode.recordClassIndex(42115);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        a aVar = this.f68412b;
        aVar.f68414a.remove(this.f68411a);
    }

    Session$1(a aVar, b bVar) {
        this.f68412b = aVar;
        this.f68411a = bVar;
    }
}
