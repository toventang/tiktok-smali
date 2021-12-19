package com.ss.android.ugc.aweme.cw;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static h f79144a = h.a().a();

    /* renamed from: b  reason: collision with root package name */
    public static c f79145b = new c() {
        /* class com.ss.android.ugc.aweme.cw.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(49125);
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final void a(JSONObject jSONObject) {
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final boolean a() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final void b(JSONObject jSONObject) {
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final boolean b() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final void c(JSONObject jSONObject) {
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final boolean c() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final void d(JSONObject jSONObject) {
        }

        @Override // com.ss.android.ugc.aweme.cw.c
        public final boolean d() {
            return false;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static volatile ExecutorService f79146c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile ExecutorService f79147d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile ExecutorService f79148e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile ScheduledExecutorService f79149f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile ExecutorService f79150g;

    static {
        Covode.recordClassIndex(49124);
    }

    public static ExecutorService a() {
        MethodCollector.i(5081);
        if (f79146c == null) {
            synchronized (g.class) {
                try {
                    if (f79146c == null) {
                        f79146c = m.b.f79181a.a(l.a(o.IO).a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5081);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f79146c;
        MethodCollector.o(5081);
        return executorService;
    }

    public static ExecutorService b() {
        MethodCollector.i(5084);
        if (f79147d == null) {
            synchronized (g.class) {
                try {
                    if (f79147d == null) {
                        f79147d = m.b.f79181a.a(l.a(o.DEFAULT).a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5084);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f79147d;
        MethodCollector.o(5084);
        return executorService;
    }

    public static ExecutorService c() {
        MethodCollector.i(5249);
        if (f79148e == null) {
            synchronized (g.class) {
                try {
                    if (f79148e == null) {
                        f79148e = m.b.f79181a.a(l.a(o.BACKGROUND).a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5249);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f79148e;
        MethodCollector.o(5249);
        return executorService;
    }

    public static ScheduledExecutorService d() {
        MethodCollector.i(5376);
        if (f79149f == null) {
            synchronized (g.class) {
                try {
                    if (f79149f == null) {
                        m mVar = m.b.f79181a;
                        l.a a2 = l.a(o.SCHEDULED);
                        a2.f79174c = 1;
                        f79149f = (ScheduledExecutorService) mVar.a(a2.a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5376);
                    throw th;
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f79149f;
        MethodCollector.o(5376);
        return scheduledExecutorService;
    }

    public static ExecutorService e() {
        MethodCollector.i(5382);
        if (f79150g == null) {
            synchronized (g.class) {
                try {
                    if (f79150g == null) {
                        f79150g = m.b.f79181a.a(l.a(o.SERIAL).a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5382);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f79150g;
        MethodCollector.o(5382);
        return executorService;
    }

    public static ExecutorService a(l lVar) {
        if (lVar.f79165a != o.IO && lVar.f79165a != o.DEFAULT && lVar.f79165a != o.BACKGROUND) {
            return m.b.f79181a.a(lVar, false);
        }
        throw new IllegalArgumentException();
    }

    static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f79144a.f79153c) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(ExecutorService executorService) {
        if (f79146c != null && executorService == a()) {
            return true;
        }
        if (f79147d != null && executorService == b()) {
            return true;
        }
        if (f79148e != null && executorService == c()) {
            return true;
        }
        if (f79149f != null && executorService == d()) {
            return true;
        }
        if (f79150g == null || executorService != e()) {
            return false;
        }
        return true;
    }
}
