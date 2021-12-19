package com.ss.android.ugc.aweme.filter;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;

public class FilterScrollerModule implements au {

    /* renamed from: a  reason: collision with root package name */
    private b f95463a;

    static {
        Covode.recordClassIndex(60481);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            removeListener();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void removeListener() {
        b bVar = this.f95463a;
        if (bVar != null) {
            bVar.dispose();
            this.f95463a = null;
        }
    }
}
