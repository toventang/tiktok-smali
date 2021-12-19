package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.widget.RelativeLayout;
import com.bytedance.android.live.broadcast.e.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.livesdk.j.bl;
import com.bytedance.android.livesdk.j.ec;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16518a;

    static {
        Covode.recordClassIndex(9156);
    }

    s(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16518a = bottomRightBannerWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16518a;
        boolean z = true;
        boolean z2 = !((k) obj).f9998a;
        boolean a2 = bottomRightBannerWidget.a();
        if (bottomRightBannerWidget.isViewValid && bottomRightBannerWidget.getView() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bottomRightBannerWidget.getView().getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (z2) {
                bottomRightBannerWidget.f16254i = false;
                layoutParams2.addRule(12);
                layoutParams2.bottomMargin = y.d(R.dimen.zc);
                layoutParams2.addRule(11);
                layoutParams2.rightMargin = y.d(R.dimen.ze);
                bottomRightBannerWidget.show();
                bottomRightBannerWidget.dataChannel.c(bl.class, false);
            } else {
                bottomRightBannerWidget.f16254i = true;
                layoutParams2.addRule(10);
                if (p.f()) {
                    layoutParams2.topMargin = y.d(R.dimen.zf);
                } else {
                    layoutParams2.topMargin = y.d(R.dimen.zg);
                }
                layoutParams2.addRule(21);
                layoutParams2.setMarginEnd(y.d(R.dimen.ze));
                if (a2) {
                    bottomRightBannerWidget.hide();
                    a.b("task_banner");
                } else if (bottomRightBannerWidget.isShowing() && bottomRightBannerWidget.f16246a != null && bottomRightBannerWidget.f16246a.f14313a != null && bottomRightBannerWidget.f16246a.f14313a.getVisibility() == 0) {
                    bottomRightBannerWidget.dataChannel.c(bl.class, true);
                }
            }
            DataChannel dataChannel = bottomRightBannerWidget.dataChannel;
            if (!bottomRightBannerWidget.isShowing() || bottomRightBannerWidget.f16246a == null || bottomRightBannerWidget.f16246a.f14313a == null || bottomRightBannerWidget.f16246a.f14313a.getVisibility() != 0) {
                z = false;
            }
            dataChannel.b(com.bytedance.android.livesdk.j.p.class, Boolean.valueOf(z));
            bottomRightBannerWidget.dataChannel.b(ec.class, layoutParams2);
            bottomRightBannerWidget.getView().setLayoutParams(layoutParams2);
        }
        return z.f158842a;
    }
}
