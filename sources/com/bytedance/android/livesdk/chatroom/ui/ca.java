package com.bytedance.android.livesdk.chatroom.ui;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ca implements b {

    /* renamed from: a  reason: collision with root package name */
    private final br f16056a;

    static {
        Covode.recordClassIndex(8880);
    }

    ca(br brVar) {
        this.f16056a = brVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        br brVar = this.f16056a;
        if (brVar.f15998h == i.SCREEN_RECORD && LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            int measuredWidth = brVar.C.f15846a.getMeasuredWidth();
            int measuredHeight = brVar.C.f15846a.getMeasuredHeight();
            if (measuredWidth != 0 && measuredWidth >= measuredHeight) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) brVar.H.getLayoutParams();
                if (brVar.n == 1) {
                    layoutParams.width = measuredWidth;
                    layoutParams.height = measuredHeight;
                    layoutParams.topMargin = y.a(br.f15992b);
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.topMargin = 0;
                }
                brVar.H.setGravity(17);
                brVar.H.setPadding(0, 0, 0, 0);
                brVar.H.setLayoutParams(layoutParams);
            }
        }
        return z.f158842a;
    }
}
