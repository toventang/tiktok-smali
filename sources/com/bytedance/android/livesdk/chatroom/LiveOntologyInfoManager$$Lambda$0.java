package com.bytedance.android.livesdk.chatroom;

import androidx.fragment.app.e;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class LiveOntologyInfoManager$$Lambda$0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f14869a;

    static {
        Covode.recordClassIndex(8242);
    }

    public LiveOntologyInfoManager$$Lambda$0(d dVar) {
        this.f14869a = dVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        d dVar = this.f14869a;
        if ((mVar instanceof e) && ((e) mVar).isFinishing() && i.a.ON_DESTROY.equals(aVar) && mVar.hashCode() == dVar.f15173c) {
            dVar.f15171a = false;
            dVar.f15172b = null;
            mVar.getLifecycle().b(dVar.f15174d);
            dVar.f15174d = null;
        }
    }
}
