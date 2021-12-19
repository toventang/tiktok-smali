package com.ss.android.ugc.aweme.main;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f109319a;

    /* renamed from: b  reason: collision with root package name */
    private final Message f109320b;

    static {
        Covode.recordClassIndex(70014);
    }

    s(Handler handler, Message message) {
        this.f109319a = handler;
        this.f109320b = message;
    }

    public final void run() {
        this.f109319a.handleMessage(this.f109320b);
    }
}
