package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.r;
import dmt.av.video.p;

final /* synthetic */ class av implements r {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88823a;

    static {
        Covode.recordClassIndex(55875);
    }

    av(ac acVar) {
        this.f88823a = acVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        ac acVar = this.f88823a;
        if (i2 == 4098) {
            p value = acVar.f88781d.getValue();
            if (!acVar.K) {
                return;
            }
            if (value == null || value.f156931g != 0) {
                acVar.f88785h.post(new az(acVar));
            }
        }
    }
}
