package com.ss.android.ugc.aweme.profile.viewmodel;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;

public final class FollowViewModel implements au {

    /* renamed from: a  reason: collision with root package name */
    private b f117492a;

    static {
        Covode.recordClassIndex(75898);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        b bVar = this.f117492a;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
