package com.ss.android.ugc.aweme.setting.unit.privacy;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.b.e;
import f.a.b.b;
import h.f.b.l;

public final class RemoveContactsUnit$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f122964a;

    static {
        Covode.recordClassIndex(80745);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RemoveContactsUnit$1(d dVar) {
        this.f122964a = dVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            e eVar = this.f122964a.f122971c;
            if (eVar != null) {
                eVar.cd_();
            }
            b bVar = this.f122964a.f122976h;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }
}
