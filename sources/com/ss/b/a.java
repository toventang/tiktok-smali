package com.ss.b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static HandlerThread f151627a;

    /* renamed from: b  reason: collision with root package name */
    public static HandlerC4062a f151628b;

    /* renamed from: c  reason: collision with root package name */
    public static b f151629c;

    /* renamed from: d  reason: collision with root package name */
    public static int f151630d;

    /* renamed from: e  reason: collision with root package name */
    public static AtomicInteger f151631e = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(100624);
    }

    public static void a() {
        HandlerThread handlerThread = f151627a;
        if (handlerThread != null) {
            handlerThread.quit();
            f151629c.b();
            f151627a = null;
            f151628b = null;
            f151629c = null;
        }
    }

    /* renamed from: com.ss.b.a$a  reason: collision with other inner class name */
    public static class HandlerC4062a extends Handler {
        static {
            Covode.recordClassIndex(100625);
        }

        public HandlerC4062a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (a.f151629c != null) {
                int i2 = message.what;
                Context context = (Context) message.obj;
                if (i2 == 1) {
                    a.f151629c.a(c.c(context), -1);
                } else if (i2 == 2) {
                    b bVar = a.f151629c;
                    c.b(context);
                    bVar.a(-1.0f, -1);
                } else if (i2 == 3) {
                    a.f151629c.a(-1.0f, c.d(context));
                } else if (i2 == 4) {
                    b bVar2 = a.f151629c;
                    float c2 = c.c(context);
                    c.b(context);
                    bVar2.a(c2, -1);
                } else if (i2 == 5) {
                    try {
                        b bVar3 = a.f151629c;
                        float c3 = c.c(context);
                        c.b(context);
                        bVar3.a(c3, c.d(context));
                    } catch (NullPointerException unused) {
                    }
                }
                sendMessageDelayed(obtainMessage(i2, context), (long) a.f151630d);
            }
        }
    }
}
