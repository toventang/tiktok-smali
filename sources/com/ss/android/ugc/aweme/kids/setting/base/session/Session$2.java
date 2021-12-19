package com.ss.android.ugc.aweme.kids.setting.base.session;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class Session$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f106822a;

    static {
        Covode.recordClassIndex(68308);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f106822a.b();
    }

    Session$2(a aVar) {
        this.f106822a = aVar;
    }
}
