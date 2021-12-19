package com.ss.android.ugc.aweme.crossplatform.activity;

import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class x implements MessageQueue.IdleHandler {

    /* renamed from: a  reason: collision with root package name */
    private final v f78587a;

    static {
        Covode.recordClassIndex(48797);
    }

    x(v vVar) {
        this.f78587a = vVar;
    }

    public final boolean queueIdle() {
        return this.f78587a.d();
    }
}
