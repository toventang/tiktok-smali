package com.ss.android.ugc.aweme.bp;

import android.app.Activity;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.lighten.a.r;
import com.ss.android.ugc.aweme.experiment.ha;
import com.ss.android.ugc.aweme.experiment.hb;
import com.ss.android.ugc.aweme.video.v;
import f.a.b.a;
import f.a.g.b;
import f.a.t;
import java.lang.reflect.Method;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f68747a = "MemoryManager";

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f68748c;

    /* renamed from: e  reason: collision with root package name */
    private static volatile e f68749e;

    /* renamed from: b  reason: collision with root package name */
    b<Long> f68750b = null;

    /* renamed from: d  reason: collision with root package name */
    private a f68751d = new a();

    static {
        Covode.recordClassIndex(42334);
    }

    private e() {
    }

    public final void b() {
        hb hbVar = (hb) com.bytedance.ies.abmock.b.a().a(true, "trim_memory_in_activity_settings", hb.class, ha.f90194a);
        if (hbVar != null && hbVar.f90195a) {
            a(hbVar);
        }
    }

    public final void c() {
        v.O().A();
        new Thread(new Runnable() {
            /* class com.ss.android.ugc.aweme.bp.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(42336);
            }

            public final void run() {
                r.b(80);
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                    Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                    Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    Method method = (Method) declaredMethod.invoke(cls, "trimMemory", new Class[]{Integer.TYPE});
                    if (!(invoke == null || method == null)) {
                        Object[] objArr = {40};
                        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{invoke, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_memory_MemoryTrimManager$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                        if (((Boolean) a2.first).booleanValue()) {
                            Object obj = a2.second;
                        } else {
                            com.bytedance.helios.sdk.a.a(method.invoke(invoke, objArr), method, new Object[]{invoke, objArr}, "com_ss_android_ugc_aweme_memory_MemoryTrimManager$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                        }
                    }
                } catch (Throwable unused) {
                }
                e.f68748c = true;
            }
        }).start();
    }

    public static e a() {
        MethodCollector.i(6233);
        if (f68749e == null) {
            synchronized (e.class) {
                try {
                    f68749e = new e();
                } catch (Throwable th) {
                    MethodCollector.o(6233);
                    throw th;
                }
            }
        }
        e eVar = f68749e;
        MethodCollector.o(6233);
        return eVar;
    }

    private void a(hb hbVar) {
        this.f68751d.a(a(hbVar.f90199e).d(new f(this, hbVar)));
    }

    private static t<Activity> a(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -1352294148:
                if (!str.equals("create")) {
                    return null;
                }
                break;
            case -934426579:
                if (!str.equals("resume")) {
                    return null;
                }
                break;
            case 109757538:
                if (!str.equals("start")) {
                    return null;
                }
                return f.b();
            case 1557372922:
                if (!str.equals("destroy")) {
                    return null;
                }
                return f.f();
            default:
                return null;
        }
        return f.c();
    }
}
