package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.r;
import dmt.av.video.p;

final /* synthetic */ class x implements r {

    /* renamed from: a  reason: collision with root package name */
    private final f f97889a;

    static {
        Covode.recordClassIndex(62216);
    }

    x(f fVar) {
        this.f97889a = fVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        f fVar = this.f97889a;
        if (i2 == 4098) {
            p value = fVar.f97851d.getValue();
            if (!fVar.K) {
                return;
            }
            if (value == null || value.f156931g != 0) {
                fVar.f97855h.post(new ab(fVar));
            }
        }
    }
}
