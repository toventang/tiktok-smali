package com.bytedance.android.livesdk.chatroom.ui;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class dk implements b {

    /* renamed from: a  reason: collision with root package name */
    private final dd f16129a;

    static {
        Covode.recordClassIndex(8936);
    }

    dk(dd ddVar) {
        this.f16129a = ddVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        dd ddVar = this.f16129a;
        int intValue = ((Integer) obj).intValue();
        if (ddVar.I != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ddVar.I.getLayoutParams();
            layoutParams.topMargin = intValue;
            int c2 = y.c();
            if (com.bytedance.android.live.core.f.b.b.b() && com.bytedance.android.live.core.f.b.b.a() == 0) {
                c2 = 0;
            }
            layoutParams.width = c2;
            layoutParams.gravity |= 1;
            ddVar.I.setLayoutParams(layoutParams);
        }
        return z.f158842a;
    }
}
