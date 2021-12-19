package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class cs implements b {

    /* renamed from: a  reason: collision with root package name */
    private final br f16077a;

    static {
        Covode.recordClassIndex(8898);
    }

    cs(br brVar) {
        this.f16077a = brVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        br brVar = this.f16077a;
        p pVar = (p) obj;
        if (brVar.isViewValid() && brVar.v != null) {
            if (pVar.f15136a == 0) {
                brVar.v.setAnchorInteractMode(true);
                brVar.o = true;
            } else if (pVar.f15136a == 1) {
                brVar.v.setAnchorInteractMode(false);
                brVar.o = false;
            }
            if (brVar.V == null || !((Boolean) brVar.V.b(cn.class)).booleanValue()) {
                int[] iArr = new int[2];
                brVar.v.getVideoSize(iArr);
                if (!(iArr[0] == 0 || iArr[1] == 0)) {
                    brVar.a(iArr[0], iArr[1], n.a(brVar.getContext()));
                }
                if (pVar.f15136a == 0) {
                    if (LiveBannerExperiment.isNewBannerEnable()) {
                        brVar.a(pVar.f15139d);
                    }
                } else if (pVar.f15136a == 1) {
                    brVar.a(0);
                }
            }
        }
        return z.f158842a;
    }
}
