package com.ss.android.ugc.aweme.main;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class CreativityToolsPluginUpdater$startObserve$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f109056a;

    static {
        Covode.recordClassIndex(69837);
    }

    public CreativityToolsPluginUpdater$startObserve$1(e eVar) {
        this.f109056a = eVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            this.f109056a.a();
        }
    }
}
