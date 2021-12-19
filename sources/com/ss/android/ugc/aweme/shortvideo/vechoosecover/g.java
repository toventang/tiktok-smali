package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity f132548a;

    static {
        Covode.recordClassIndex(86747);
    }

    g(ChooseCoverActivity chooseCoverActivity) {
        this.f132548a = chooseCoverActivity;
    }

    public final void run() {
        ChooseCoverActivity chooseCoverActivity = this.f132548a;
        if (chooseCoverActivity.f132505f != null) {
            chooseCoverActivity.f132505f.d();
        }
    }
}
