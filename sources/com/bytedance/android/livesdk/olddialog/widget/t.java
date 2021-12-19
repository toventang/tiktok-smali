package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20172a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20173b;

    static {
        Covode.recordClassIndex(11903);
    }

    t(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i2) {
        this.f20172a = liveNewGiftPanelWidget;
        this.f20173b = i2;
    }

    public final void run() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20172a;
        liveNewGiftPanelWidget.f20127a.b(this.f20173b);
    }
}
