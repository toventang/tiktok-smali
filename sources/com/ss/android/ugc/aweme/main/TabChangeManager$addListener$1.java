package com.ss.android.ugc.aweme.main;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.g;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class TabChangeManager$addListener$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TabChangeManager f109112a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f109113b;

    static {
        Covode.recordClassIndex(69874);
    }

    TabChangeManager$addListener$1(TabChangeManager tabChangeManager, g gVar) {
        this.f109112a = tabChangeManager;
        this.f109113b = gVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            this.f109112a.f109106c.remove(this.f109113b);
        }
    }
}
