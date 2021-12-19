package com.bytedance.android.livesdk.service.animation.view;

import com.bytedance.covode.number.Covode;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewSendGiftAnimationForWishListView f21251a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f21252b;

    static {
        Covode.recordClassIndex(12537);
    }

    public a(LiveNewSendGiftAnimationForWishListView liveNewSendGiftAnimationForWishListView, Runnable runnable) {
        this.f21251a = liveNewSendGiftAnimationForWishListView;
        this.f21252b = runnable;
    }

    public final void run() {
        LiveNewSendGiftAnimationForWishListView liveNewSendGiftAnimationForWishListView = this.f21251a;
        Runnable runnable = this.f21252b;
        liveNewSendGiftAnimationForWishListView.f21210d = 2;
        liveNewSendGiftAnimationForWishListView.a(runnable);
    }
}
