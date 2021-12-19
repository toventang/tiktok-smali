package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.olddialog.giftpanellist.a.a;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20169a;

    static {
        Covode.recordClassIndex(11900);
    }

    q(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20169a = liveNewGiftPanelWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20169a;
        if (liveNewGiftPanelWidget.f20132f != null) {
            a aVar = liveNewGiftPanelWidget.f20132f;
            if (aVar.f20022a != null) {
                a.C0498a.f22936a.f22931a = true;
                aVar.f20022a.b();
                aVar.c();
            }
        }
    }
}
