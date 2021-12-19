package com.bytedance.creativex.recorder.gesture;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final DefaultGesturePresenter f28347a;

    static {
        Covode.recordClassIndex(16646);
    }

    a(DefaultGesturePresenter defaultGesturePresenter) {
        this.f28347a = defaultGesturePresenter;
    }

    public final void run() {
        this.f28347a.f28341d = true;
    }
}
