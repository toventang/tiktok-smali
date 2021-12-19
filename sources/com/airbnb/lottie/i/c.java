package com.airbnb.lottie.i;

import android.os.Handler;
import android.os.HandlerThread;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5678a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, Handler> f5679b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static long f5680c;

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<Handler> f5681d = new ArrayList<>();

    private c() {
    }

    static {
        Covode.recordClassIndex(2384);
    }

    public static Handler a(g gVar) {
        Handler handler;
        MethodCollector.i(7337);
        l.c(gVar, "");
        ConcurrentHashMap<Integer, Handler> concurrentHashMap = f5679b;
        synchronized (concurrentHashMap) {
            try {
                int hashCode = gVar.hashCode();
                if (!concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                    int max = Math.max(d.e.f5650b, 1);
                    long j2 = f5680c;
                    f5680c = 1 + j2;
                    int i2 = (int) (j2 % ((long) max));
                    ArrayList<Handler> arrayList = f5681d;
                    if (arrayList.size() > i2) {
                        Integer valueOf = Integer.valueOf(hashCode);
                        Handler handler2 = arrayList.get(i2);
                        l.a((Object) handler2, "");
                        concurrentHashMap.put(valueOf, handler2);
                        Handler handler3 = concurrentHashMap.get(Integer.valueOf(hashCode));
                        if (handler3 == null) {
                            l.a();
                        }
                        l.a((Object) handler3, "");
                        handler = handler3;
                    } else {
                        System.currentTimeMillis();
                        HandlerThread handlerThread = new HandlerThread("LottieWorkThread-".concat(String.valueOf(i2)));
                        handlerThread.start();
                        handler = new Handler(handlerThread.getLooper());
                        arrayList.add(handler);
                        concurrentHashMap.put(Integer.valueOf(hashCode), handler);
                        if (d.f5620a) {
                            System.currentTimeMillis();
                        }
                    }
                    return handler;
                }
                Handler handler4 = concurrentHashMap.get(Integer.valueOf(hashCode));
                if (handler4 == null) {
                    l.a();
                }
                Handler handler5 = handler4;
                MethodCollector.o(7337);
                return handler5;
            } finally {
                MethodCollector.o(7337);
            }
        }
    }
}
