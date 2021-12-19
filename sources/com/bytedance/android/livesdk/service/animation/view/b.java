package com.bytedance.android.livesdk.service.animation.view;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewSendGiftAnimationView f21253a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f21254b;

    static {
        Covode.recordClassIndex(12538);
    }

    b(LiveNewSendGiftAnimationView liveNewSendGiftAnimationView, Runnable runnable) {
        this.f21253a = liveNewSendGiftAnimationView;
        this.f21254b = runnable;
    }

    public final void run() {
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = this.f21253a;
        Runnable runnable = this.f21254b;
        liveNewSendGiftAnimationView.f21226a = 2;
        liveNewSendGiftAnimationView.b(runnable);
    }
}
