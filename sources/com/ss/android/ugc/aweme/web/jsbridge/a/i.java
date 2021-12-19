package com.ss.android.ugc.aweme.web.jsbridge.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final d f145014a;

    static {
        Covode.recordClassIndex(94814);
    }

    i(d dVar) {
        this.f145014a = dVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f145014a.a(message);
    }
}
