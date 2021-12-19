package com.ss.ttvideoengine.s;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.SimpleDateFormat;
import java.util.Date;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static String f153287a;

    /* renamed from: b  reason: collision with root package name */
    public static a f153288b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static int f153289c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f153290d = true;

    /* renamed from: e  reason: collision with root package name */
    public static int f153291e = 0;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f153293a = -1;

        /* renamed from: b  reason: collision with root package name */
        public long f153294b = -1;

        static {
            Covode.recordClassIndex(101791);
        }

        a() {
        }

        public final boolean a() {
            if (this.f153293a > 0) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(101789);
    }

    public static long a() {
        MethodCollector.i(12754);
        if (!f153290d) {
            synchronized (m.class) {
                try {
                    a aVar = f153288b;
                    if (aVar != null && aVar.a()) {
                        return (f153288b.f153293a + SystemClock.elapsedRealtime()) - f153288b.f153294b;
                    }
                } finally {
                    MethodCollector.o(12754);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        MethodCollector.o(12754);
        return currentTimeMillis;
    }

    public static boolean b() {
        MethodCollector.i(12757);
        synchronized (m.class) {
            try {
                a aVar = f153288b;
                if (aVar != null) {
                    return aVar.a();
                }
                MethodCollector.o(12757);
                return false;
            } finally {
                MethodCollector.o(12757);
            }
        }
    }

    public static String a(long j2, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j2));
        } catch (Exception unused) {
            return "";
        }
    }
}
