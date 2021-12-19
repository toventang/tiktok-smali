package com.ss.android.message;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d implements WeakHandler.IHandler {

    /* renamed from: b  reason: collision with root package name */
    public static HandlerThread f59825b;

    /* renamed from: c  reason: collision with root package name */
    private static d f59826c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f59827d;

    /* renamed from: a  reason: collision with root package name */
    public final WeakHandler f59828a;

    static {
        Covode.recordClassIndex(36978);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    private d() {
        if (f59825b == null) {
            HandlerThread handlerThread = new HandlerThread("PushThreadHandler");
            f59825b = handlerThread;
            handlerThread.start();
            f59827d = true;
        }
        this.f59828a = new WeakHandler(f59825b.getLooper(), this);
    }

    public static d a() {
        MethodCollector.i(14020);
        if (f59826c == null) {
            synchronized (d.class) {
                try {
                    if (f59826c == null) {
                        f59826c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14020);
                    throw th;
                }
            }
        }
        d dVar = f59826c;
        MethodCollector.o(14020);
        return dVar;
    }

    public final void a(Runnable runnable, long j2) {
        if (j2 <= 0) {
            this.f59828a.post(runnable);
        } else {
            this.f59828a.postDelayed(runnable, j2);
        }
    }
}
