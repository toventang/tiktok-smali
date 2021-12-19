package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftBottomWidget f20151a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20152b;

    static {
        Covode.recordClassIndex(11885);
    }

    b(LiveNewGiftBottomWidget liveNewGiftBottomWidget, int i2) {
        this.f20151a = liveNewGiftBottomWidget;
        this.f20152b = i2;
    }

    public final void run() {
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f20151a;
        liveNewGiftBottomWidget.f20104a.b(this.f20152b);
    }
}
