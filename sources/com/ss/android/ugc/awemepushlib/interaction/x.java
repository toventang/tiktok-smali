package com.ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    static ExecutorService f145471a;

    /* renamed from: b  reason: collision with root package name */
    static Deque<Runnable> f145472b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f145473c = false;

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f145474d = 0;

    static {
        Covode.recordClassIndex(95127);
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        f145471a = g.a(a2.a());
    }

    static synchronized void a() {
        synchronized (x.class) {
            MethodCollector.i(8185);
            if (f145473c) {
                MethodCollector.o(8185);
                return;
            }
            try {
                if (f145474d != 0) {
                    while (f145472b.size() > 0) {
                        f145472b.pop().run();
                    }
                    f145473c = true;
                }
                MethodCollector.o(8185);
            } catch (NoSuchElementException e2) {
                e2.printStackTrace();
                MethodCollector.o(8185);
            }
        }
    }

    public static void a(Runnable runnable) {
        f145471a.execute(new y(runnable));
    }

    static void a(int i2) {
        f145474d = i2;
        if (i2 == 2 || i2 == 3) {
            f145471a.execute(z.f145476a);
        } else if (i2 == 4) {
            a();
        }
    }
}
