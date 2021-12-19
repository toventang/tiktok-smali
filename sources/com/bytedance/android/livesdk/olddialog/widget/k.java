package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20161a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20162b;

    static {
        Covode.recordClassIndex(11894);
    }

    k(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i2) {
        this.f20161a = liveNewGiftPanelWidget;
        this.f20162b = i2;
    }

    public final void run() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20161a;
        liveNewGiftPanelWidget.f20127a.b(this.f20162b);
    }
}
