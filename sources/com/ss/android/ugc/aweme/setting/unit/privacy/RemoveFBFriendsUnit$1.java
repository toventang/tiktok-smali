package com.ss.android.ugc.aweme.setting.unit.privacy;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.b.f;
import f.a.b.b;
import h.f.b.l;

public final class RemoveFBFriendsUnit$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f122965a;

    static {
        Covode.recordClassIndex(80746);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RemoveFBFriendsUnit$1(e eVar) {
        this.f122965a = eVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            f fVar = this.f122965a.f122994c;
            if (fVar != null) {
                fVar.cd_();
            }
            b bVar = this.f122965a.f122999h;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }
}
