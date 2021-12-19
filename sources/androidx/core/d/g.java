package androidx.core.d;

import android.os.Build;
import android.os.Trace;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static long f2296a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2297b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2298c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2299d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2300e;

    public static void a() {
        int i2 = Build.VERSION.SDK_INT;
        Trace.endSection();
    }

    static {
        Covode.recordClassIndex(733);
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2296a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2297b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                f2298c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                f2299d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                f2300e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        int i2 = Build.VERSION.SDK_INT;
        Trace.beginSection(str);
    }
}
