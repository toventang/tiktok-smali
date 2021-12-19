package com.bytedance.platform.godzilla.a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;
import java.util.LinkedList;
import java.util.List;

public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f41950a;

    /* renamed from: b  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f41951b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h> f41952c = new LinkedList();

    static {
        Covode.recordClassIndex(25618);
    }

    private static boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        int i2 = 0;
        while (!(th instanceof OutOfMemoryError)) {
            if (i2 > 20) {
                return false;
            }
            i2++;
            try {
                th = th.getCause();
                if (th == null) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public final boolean b(h hVar) {
        boolean remove;
        MethodCollector.i(3206);
        synchronized (this.f41952c) {
            try {
                remove = this.f41952c.remove(hVar);
            } finally {
                MethodCollector.o(3206);
            }
        }
        return remove;
    }

    public final boolean a(h hVar) {
        boolean add;
        MethodCollector.i(3205);
        synchronized (this.f41952c) {
            try {
                add = this.f41952c.add(hVar);
            } finally {
                MethodCollector.o(3205);
            }
        }
        return add;
    }

    private void a(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f41951b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private boolean b(Thread thread, Throwable th) {
        MethodCollector.i(3208);
        try {
            synchronized (this.f41952c) {
                try {
                    for (h hVar : this.f41952c) {
                        try {
                            if (hVar.a(thread, th)) {
                                return true;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(3208);
                }
            }
        } catch (Throwable unused2) {
        }
        MethodCollector.o(3208);
        return false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (a(th) || !b(thread, th)) {
                a(thread, th);
            } else if (thread != null && thread.getName().equals("main")) {
                while (true) {
                    try {
                        Looper.loop();
                    } catch (Exception e2) {
                        if (a(e2) || !b(thread, e2)) {
                            a(thread, e2);
                        }
                    }
                }
                a(thread, e2);
            }
        } catch (Throwable th2) {
            a(thread, th2);
        }
    }
}
