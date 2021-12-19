package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.z.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20167a;

    static {
        Covode.recordClassIndex(11898);
    }

    o(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20167a = liveNewGiftPanelWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20167a;
        a aVar = (a) obj;
        if (liveNewGiftPanelWidget.f20132f != null) {
            com.bytedance.android.livesdk.olddialog.giftpanellist.a.a aVar2 = liveNewGiftPanelWidget.f20132f;
            aVar2.f20023b = aVar.f22930a;
            aVar2.c();
        }
    }
}
