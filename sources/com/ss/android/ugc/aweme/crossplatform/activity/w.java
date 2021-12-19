package com.ss.android.ugc.aweme.crossplatform.activity;

import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class w implements MessageQueue.IdleHandler {

    /* renamed from: a  reason: collision with root package name */
    private final v f78586a;

    static {
        Covode.recordClassIndex(48796);
    }

    public w(v vVar) {
        this.f78586a = vVar;
    }

    public final boolean queueIdle() {
        return this.f78586a.e();
    }
}
