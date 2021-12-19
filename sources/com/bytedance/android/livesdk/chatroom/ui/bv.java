package com.bytedance.android.livesdk.chatroom.ui;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bv implements b {

    /* renamed from: a  reason: collision with root package name */
    private final br f16050a;

    static {
        Covode.recordClassIndex(8874);
    }

    bv(br brVar) {
        this.f16050a = brVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        br brVar = this.f16050a;
        Integer num = (Integer) obj;
        if (!(brVar.ag == null || brVar.F == null)) {
            brVar.q = num.intValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (brVar.n == 1) {
                layoutParams.topMargin = brVar.q;
                layoutParams.gravity = 1;
            } else {
                layoutParams.leftMargin = brVar.F.getWidth() / 2;
                layoutParams.gravity = 16;
            }
            brVar.ag.setLayoutParams(layoutParams);
        }
        return z.f158842a;
    }
}
