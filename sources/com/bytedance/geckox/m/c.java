package com.bytedance.geckox.m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f29935c;

    /* renamed from: a  reason: collision with root package name */
    public Handler f29936a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f29937b;

    static {
        Covode.recordClassIndex(17356);
    }

    private c() {
        b();
    }

    public static c a() {
        MethodCollector.i(7198);
        if (f29935c == null) {
            synchronized (c.class) {
                try {
                    if (f29935c == null) {
                        f29935c = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7198);
                    throw th;
                }
            }
        }
        c cVar = f29935c;
        MethodCollector.o(7198);
        return cVar;
    }

    private void b() {
        if (this.f29936a == null || this.f29937b.getLooper() == null) {
            HandlerThread handlerThread = new HandlerThread("timer-task", 4);
            this.f29937b = handlerThread;
            handlerThread.start();
            this.f29936a = new a(this.f29937b.getLooper());
        }
    }

    public final void a(int i2) {
        Handler handler = this.f29936a;
        if (handler != null) {
            handler.removeMessages(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends Handler {
        static {
            Covode.recordClassIndex(17357);
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            com.bytedance.geckox.i.a.a("handler timer task execute", Integer.valueOf(aVar.a()), Long.valueOf(aVar.f29927b));
            aVar.b();
            if (aVar.f29927b > 0) {
                Message obtainMessage = c.this.f29936a.obtainMessage(message.what);
                obtainMessage.obj = aVar;
                c.this.f29936a.sendMessageDelayed(obtainMessage, aVar.f29927b);
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    public final void a(a aVar, long j2) {
        if (j2 >= 0) {
            b(aVar, j2, 0);
        }
    }

    public final void a(a aVar, long j2, long j3) {
        b(aVar, j2, j3);
    }

    private void b(a aVar, long j2, long j3) {
        b();
        int a2 = aVar.a();
        aVar.f29927b = j3;
        Message obtainMessage = this.f29936a.obtainMessage(a2);
        obtainMessage.obj = aVar;
        obtainMessage.what = a2;
        this.f29936a.sendMessageDelayed(obtainMessage, j2);
    }
}
