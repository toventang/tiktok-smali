package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.dialogv2.b.b;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.giftpanellist.a.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20165a;

    static {
        Covode.recordClassIndex(11896);
    }

    m(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20165a = liveNewGiftPanelWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20165a;
        if (d.u.e() && LiveFirstRechargeStyleSetting.INSTANCE.getValue() && d.u.d() && liveNewGiftPanelWidget.f20132f != null) {
            a aVar = liveNewGiftPanelWidget.f20132f;
            u g2 = d.u.g();
            u h2 = d.h();
            if (d.u.f()) {
                if (g2 != null) {
                    aVar.f20027f.addFirst(new b(g2));
                }
            } else if (h2 != null) {
                aVar.f20027f.addFirst(new b(h2));
            }
        }
        if (liveNewGiftPanelWidget.f20132f != null) {
            a aVar2 = liveNewGiftPanelWidget.f20132f;
            if (d.u.d() && (!LiveFirstRechargeStyleSetting.INSTANCE.getValue() || d.u.e())) {
                if (d.u.f()) {
                    aVar2.f20028g = d.u.i();
                } else {
                    aVar2.f20028g = 0;
                }
            }
            liveNewGiftPanelWidget.f20132f.notifyDataSetChanged();
        }
    }
}
