package com.ss.android.ugc.aweme.sp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedList;

public class d {

    /* renamed from: a  reason: collision with root package name */
    static final Object f133984a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static Object f133985b = new Object();

    /* renamed from: c  reason: collision with root package name */
    static final LinkedList<Runnable> f133986c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    static final LinkedList<Runnable> f133987d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    static boolean f133988e = true;

    /* renamed from: f  reason: collision with root package name */
    private static final String f133989f = d.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    private static Handler f133990g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final b f133991h = new b();

    /* renamed from: i  reason: collision with root package name */
    private static int f133992i = 0;

    public static boolean b() {
        boolean z;
        MethodCollector.i(11004);
        synchronized (f133984a) {
            try {
                if (!f133987d.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(11004);
            }
        }
        return z;
    }

    static {
        Covode.recordClassIndex(87664);
    }

    static Handler a() {
        Handler handler;
        MethodCollector.i(10832);
        synchronized (f133984a) {
            try {
                if (f133990g == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    f133990g = new a(handlerThread.getLooper());
                }
                handler = f133990g;
            } finally {
                MethodCollector.o(10832);
            }
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {
        static {
            Covode.recordClassIndex(87665);
        }

        a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            LinkedList linkedList;
            MethodCollector.i(13309);
            if (message.what == 1) {
                synchronized (d.f133985b) {
                    try {
                        synchronized (d.f133984a) {
                            try {
                                linkedList = (LinkedList) d.f133987d.clone();
                                d.f133987d.clear();
                                d.a().removeMessages(1);
                            } finally {
                                MethodCollector.o(13309);
                            }
                        }
                        if (linkedList.size() > 0) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                    } finally {
                        MethodCollector.o(13309);
                    }
                }
                return;
            }
            MethodCollector.o(13309);
        }
    }
}
