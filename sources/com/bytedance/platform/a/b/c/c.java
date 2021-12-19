package com.bytedance.platform.a.b.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.a.a.g;
import java.lang.ref.WeakReference;

public final class c extends Handler {
    static {
        Covode.recordClassIndex(25592);
    }

    public c(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        MethodCollector.i(6654);
        super.handleMessage(message);
        if (message.what != 100) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("UnSupport message is " + message.what);
            MethodCollector.o(6654);
            throw illegalArgumentException;
        } else if (message.obj instanceof WeakReference) {
            Message message2 = (Message) ((WeakReference) message.obj).get();
            if (message2 == null || message2.arg2 != 9527) {
                g.a(g.a.ERROR);
                MethodCollector.o(6654);
                return;
            }
            d b2 = d.b();
            b2.c();
            synchronized (d.f41884c) {
                try {
                    if (!b2.f41888d.contains(message2)) {
                        b2.f41888d.add(message2);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6654);
                    throw th;
                }
            }
            int i2 = message2.what;
            g.a(g.a.ERROR);
            MethodCollector.o(6654);
        } else {
            MethodCollector.o(6654);
        }
    }
}
