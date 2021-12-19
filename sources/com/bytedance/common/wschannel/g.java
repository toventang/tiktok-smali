package com.bytedance.common.wschannel;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.message.d;

public class g implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHandler f27215a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile g f27216b;

    static {
        Covode.recordClassIndex(16046);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    private g() {
        if (f27215a == null) {
            try {
                f27215a = d.a().f59828a;
            } catch (Throwable unused) {
                HandlerThread handlerThread = new HandlerThread("WsHT");
                handlerThread.start();
                f27215a = new WeakHandler(handlerThread.getLooper(), this);
            }
        }
    }

    public static g a() {
        MethodCollector.i(10871);
        if (f27216b == null) {
            synchronized (g.class) {
                try {
                    if (f27216b == null) {
                        f27216b = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10871);
                    throw th;
                }
            }
        }
        g gVar = f27216b;
        MethodCollector.o(10871);
        return gVar;
    }

    public static void a(Runnable runnable) {
        f27215a.post(runnable);
    }
}
