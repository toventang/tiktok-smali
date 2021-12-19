package com.ss.android.ugc.aweme.kids.setting.base.session;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.session.b;

/* access modifiers changed from: package-private */
public class Session$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f106820a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f106821b;

    static {
        Covode.recordClassIndex(68307);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        a aVar = this.f106821b;
        aVar.f106823a.remove(this.f106820a);
    }

    Session$1(a aVar, b bVar) {
        this.f106821b = aVar;
        this.f106820a = bVar;
    }
}
