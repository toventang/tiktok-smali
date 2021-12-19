package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.e;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.runtime.d;
import com.bytedance.crash.runtime.h;
import com.bytedance.crash.runtime.r;
import com.bytedance.crash.util.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static Context f27724a;

    /* renamed from: b  reason: collision with root package name */
    public static Application f27725b;

    /* renamed from: c  reason: collision with root package name */
    public static long f27726c;

    /* renamed from: d  reason: collision with root package name */
    public static long f27727d;

    /* renamed from: e  reason: collision with root package name */
    public static String f27728e = "default";

    /* renamed from: f  reason: collision with root package name */
    public static boolean f27729f;

    /* renamed from: g  reason: collision with root package name */
    public static final ConfigManager f27730g = new ConfigManager();

    /* renamed from: h  reason: collision with root package name */
    public static final a f27731h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static volatile ConcurrentHashMap<Integer, String> f27732i;

    /* renamed from: j  reason: collision with root package name */
    public static final JSONObject f27733j = new JSONObject();

    /* renamed from: k  reason: collision with root package name */
    public static volatile int f27734k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile String f27735l;

    /* renamed from: m  reason: collision with root package name */
    static long f27736m = 0;
    private static d n;
    private static r o;
    private static volatile String p;
    private static final Object q = new Object();
    private static boolean r = false;
    private static String s;

    public static d a() {
        if (n == null) {
            n = h.a(f27724a);
        }
        return n;
    }

    public static boolean c() {
        return h().contains("test_crash");
    }

    private static String h() {
        Object obj = a().a().get("channel");
        if (obj == null) {
            return "unknown";
        }
        return String.valueOf(obj);
    }

    static {
        Covode.recordClassIndex(16255);
    }

    public static r b() {
        MethodCollector.i(8786);
        if (o == null) {
            synchronized (m.class) {
                try {
                    o = new r();
                } catch (Throwable th) {
                    MethodCollector.o(8786);
                    throw th;
                }
            }
        }
        r rVar = o;
        MethodCollector.o(8786);
        return rVar;
    }

    public static String d() {
        return e() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    public static String e() {
        MethodCollector.i(8987);
        if (p == null) {
            synchronized (q) {
                try {
                    if (p == null) {
                        p = f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8987);
                    throw th;
                }
            }
        }
        String str = p;
        MethodCollector.o(8987);
        return str;
    }

    public static String f() {
        return Long.toHexString(new Random().nextLong()) + '-' + f27726c + '-' + Process.myPid() + "G";
    }

    public static String g() {
        MethodCollector.i(8988);
        if (s == null) {
            synchronized (m.class) {
                try {
                    if (s == null) {
                        s = e.d().optString("bytrace_id_prefix", String.valueOf(UUID.randomUUID())) + "-" + Process.myPid();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8988);
                    throw th;
                }
            }
        }
        String str = s;
        MethodCollector.o(8988);
        return str;
    }

    public static void a(String str, String str2) {
        n.a(f27733j, str, str2);
    }

    public static void a(Application application, Context context) {
        if (f27725b == null || f27724a == null) {
            f27726c = System.currentTimeMillis();
            f27727d = SystemClock.uptimeMillis();
            f27724a = context;
            f27725b = application;
            p = e();
        }
    }

    static void a(Application application, Context context, ICommonParams iCommonParams) {
        if (!r) {
            a(application, context);
            n = new d(f27724a, iCommonParams, a());
            r = true;
        }
    }

    public static String a(long j2, CrashType crashType, boolean z, boolean z2) {
        String str;
        StringBuilder append = new StringBuilder().append(j2).append("_").append(crashType.getName()).append('_').append(e()).append('_');
        String str2 = "normal_";
        if (z) {
            str = "oom_";
        } else {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append(f27726c).append('_');
        if (z2) {
            str2 = "ignore_";
        }
        return append2.append(str2).append(Long.toHexString(new Random().nextLong())).append("G").toString();
    }
}
