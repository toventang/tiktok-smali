package com.ss.android.ugc.aweme.profile.ui.widget;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final RecommendCommonUserView f117398a;

    static {
        Covode.recordClassIndex(75852);
    }

    e(RecommendCommonUserView recommendCommonUserView) {
        this.f117398a = recommendCommonUserView;
    }

    public final void run() {
        RecommendCommonUserView recommendCommonUserView = this.f117398a;
        recommendCommonUserView.setLayoutParams(recommendCommonUserView.getLayoutParams());
    }
}
