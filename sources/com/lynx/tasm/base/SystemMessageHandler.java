package com.lynx.tasm.base;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SystemMessageHandler extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private long f55759a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55760b = true;

    static {
        Covode.recordClassIndex(34869);
    }

    private native void nativeRunWork(long j2);

    private void stop() {
        this.f55760b = false;
    }

    private void scheduleWork() {
        sendMessage(Message.obtain(this, 1));
    }

    public static SystemMessageHandler create(long j2) {
        return new SystemMessageHandler(j2);
    }

    private SystemMessageHandler(long j2) {
        this.f55759a = j2;
    }

    public void handleMessage(Message message) {
        MethodCollector.i(13876);
        if (this.f55760b) {
            TraceEvent.a(0, "Looper::handleMessage");
            nativeRunWork(this.f55759a);
            TraceEvent.b(0, "Looper::handleMessage");
        }
        MethodCollector.o(13876);
    }
}
