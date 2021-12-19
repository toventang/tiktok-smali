package com.ss.android.ugc.aweme.shortvideo.upload;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f132133a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f132134b = new Handler(this.f132133a.getLooper());

    static {
        Covode.recordClassIndex(86548);
    }

    public p() {
        HandlerThread handlerThread = new HandlerThread("PublishCommandExecutor");
        this.f132133a = handlerThread;
        handlerThread.start();
    }

    public final void a(m mVar) {
        if (this.f132133a.isAlive()) {
            this.f132134b.post(new q(mVar));
            return;
        }
        throw new InterruptedException("PublishCommandExecutor has quit");
    }
}
