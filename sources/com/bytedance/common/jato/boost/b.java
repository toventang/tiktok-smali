package com.bytedance.common.jato.boost;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static e f26788a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f26789b;

    /* renamed from: c  reason: collision with root package name */
    public static a f26790c;

    static {
        Covode.recordClassIndex(15810);
    }

    public static synchronized void a() {
        synchronized (b.class) {
            MethodCollector.i(2839);
            e eVar = f26788a;
            if (eVar != null) {
                eVar.a();
            }
            MethodCollector.o(2839);
        }
    }

    public static void a(String str) {
        a aVar = f26790c;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public static synchronized boolean b(long j2) {
        synchronized (b.class) {
            MethodCollector.i(2838);
            e eVar = f26788a;
            if (eVar != null) {
                boolean b2 = eVar.b(j2);
                MethodCollector.o(2838);
                return b2;
            }
            MethodCollector.o(2838);
            return false;
        }
    }

    public static synchronized boolean a(long j2) {
        synchronized (b.class) {
            MethodCollector.i(2837);
            e eVar = f26788a;
            if (eVar != null) {
                boolean a2 = eVar.a(j2);
                MethodCollector.o(2837);
                return a2;
            }
            MethodCollector.o(2837);
            return false;
        }
    }

    public static void a(String str, Throwable th) {
        a aVar = f26790c;
        if (aVar != null) {
            aVar.a(str, th);
        }
    }
}
