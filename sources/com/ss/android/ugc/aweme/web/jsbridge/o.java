package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final FeedbackUploadALog f145045a;

    static {
        Covode.recordClassIndex(94837);
    }

    o(FeedbackUploadALog feedbackUploadALog) {
        this.f145045a = feedbackUploadALog;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f145045a.c();
    }
}
