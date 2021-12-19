package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20163a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20164b;

    static {
        Covode.recordClassIndex(11895);
    }

    l(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i2) {
        this.f20163a = liveNewGiftPanelWidget;
        this.f20164b = i2;
    }

    public final void run() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20163a;
        liveNewGiftPanelWidget.f20127a.b(this.f20164b);
    }
}
