package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final SoftInputResizeFuncLayoutView f100867a;

    static {
        Covode.recordClassIndex(64528);
    }

    e(SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView) {
        this.f100867a = softInputResizeFuncLayoutView;
    }

    public final void onGlobalLayout() {
        this.f100867a.d();
    }
}
