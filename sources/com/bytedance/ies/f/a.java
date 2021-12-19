package com.bytedance.ies.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f33813a = "notify.log";

    /* renamed from: b  reason: collision with root package name */
    public static SimpleDateFormat f33814b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c  reason: collision with root package name */
    private static ExecutorService f33815c;

    static {
        Covode.recordClassIndex(20069);
    }

    public static synchronized void a() {
        synchronized (a.class) {
            MethodCollector.i(11147);
            try {
                ExecutorService executorService = f33815c;
                if (executorService != null) {
                    executorService.shutdown();
                }
                MethodCollector.o(11147);
            } catch (Exception unused) {
                MethodCollector.o(11147);
            }
        }
    }
}
