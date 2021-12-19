package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class bj implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88872a;

    static {
        Covode.recordClassIndex(55905);
    }

    public bj(ac acVar) {
        this.f88872a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88872a;
        if (obj != null && acVar.f88779b.editMusicSyncMode) {
            acVar.A.H();
        }
    }
}
