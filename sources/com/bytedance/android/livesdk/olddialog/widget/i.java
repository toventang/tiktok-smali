package com.bytedance.android.livesdk.olddialog.widget;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements u {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20159a;

    static {
        Covode.recordClassIndex(11892);
    }

    i(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20159a = liveNewGiftPanelWidget;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20159a;
        Integer num = (Integer) obj;
        if (num != null) {
            if (liveNewGiftPanelWidget.o != num.intValue()) {
                liveNewGiftPanelWidget.p = false;
                liveNewGiftPanelWidget.o = num.intValue();
            }
            liveNewGiftPanelWidget.f20138l = false;
            if (num.intValue() != 5) {
                liveNewGiftPanelWidget.a(liveNewGiftPanelWidget.f20130d, num);
            } else {
                liveNewGiftPanelWidget.b(liveNewGiftPanelWidget.f20131e);
            }
        }
        liveNewGiftPanelWidget.f20132f.b();
    }
}
