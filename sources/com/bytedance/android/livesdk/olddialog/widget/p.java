package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.olddialog.giftpanellist.a.a;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20168a;

    static {
        Covode.recordClassIndex(11899);
    }

    p(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20168a = liveNewGiftPanelWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20168a;
        if (liveNewGiftPanelWidget.f20132f != null) {
            a aVar = liveNewGiftPanelWidget.f20132f;
            if (aVar.f20022a != null) {
                a.C0498a.f22936a.f22931a = false;
                aVar.f20022a.b();
            }
        }
    }
}
