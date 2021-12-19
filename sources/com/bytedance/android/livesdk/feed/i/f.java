package com.bytedance.android.livesdk.feed.i;

import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final LottieAnimationView f17514a;

    static {
        Covode.recordClassIndex(9701);
    }

    f(LottieAnimationView lottieAnimationView) {
        this.f17514a = lottieAnimationView;
    }

    public final void onDismiss() {
        this.f17514a.d();
    }
}
