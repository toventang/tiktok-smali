package com.bytedance.ttnet.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.frameworks.baselib.network.http.g.d;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.q;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.ss.android.ugc.aweme.net.j.h;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.ss.android.ugc.aweme.utils.eo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class RetrofitUtils {

    /* renamed from: a  reason: collision with root package name */
    private static volatile CopyOnWriteArrayList<a> f44641a;

    /* renamed from: b  reason: collision with root package name */
    private static d<String, q> f44642b = new d<>(10);

    /* renamed from: c  reason: collision with root package name */
    private static d<String, q> f44643c = new d<>(10);

    private static void a(com.bytedance.frameworks.baselib.network.http.a aVar, List<b> list, com.bytedance.ttnet.d.d dVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (b bVar : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f42471a)) {
                            str = bVar.f42472b;
                        }
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (m.a(str)) {
            str = dVar.f28940a;
        }
        if (m.a(str)) {
            str = a(exc);
        }
        if (!m.a(str) && aVar != null) {
            aVar.f28913a = str;
            if (aVar.f28914b != null) {
                aVar.f28914b.f28940a = str;
            }
        }
    }

    private static String a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String a(List<b> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f42471a)) {
                return bVar.f42472b;
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v9, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v10, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v11, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v12, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v13, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0168 A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0172 A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0187 A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x018e A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x019d A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01da A[Catch:{ all -> 0x01ec, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01dd A[Catch:{ all -> 0x01ec, all -> 0x01f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(final java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.RetrofitUtils.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static synchronized void a(a aVar) {
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7398);
            if (aVar == null) {
                MethodCollector.o(7398);
                return;
            }
            ReportTimeDecorator reportTimeDecorator = new ReportTimeDecorator(aVar);
            if (!f44641a.contains(reportTimeDecorator)) {
                f44641a.add(reportTimeDecorator);
            }
            d.a(f44642b, reportTimeDecorator);
            d.a(f44643c, reportTimeDecorator);
            MethodCollector.o(7398);
        }
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(27294);
        CopyOnWriteArrayList<a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        f44641a = copyOnWriteArrayList;
        q.f42565h = copyOnWriteArrayList;
    }

    static class ReportTimeDecorator extends BaseInterceptorDecorator {
        static {
            Covode.recordClassIndex(27299);
        }

        public ReportTimeDecorator(a aVar) {
            super(aVar);
        }

        private u a(a.AbstractC1036a aVar) {
            long currentTimeMillis = System.currentTimeMillis();
            String name = this.f44646a.getClass().getName();
            aVar.c().P.put(name.substring(name.lastIndexOf(46) + 1, name.length()) + "Time", Long.valueOf(currentTimeMillis));
            return this.f44646a.intercept(aVar);
        }

        @Override // com.bytedance.ttnet.utils.RetrofitUtils.BaseInterceptorDecorator, com.bytedance.retrofit2.c.a
        public u intercept(a.AbstractC1036a aVar) {
            if (!(aVar.c() instanceof com.ss.android.ugc.aweme.bs.b)) {
                return a(aVar);
            }
            com.ss.android.ugc.aweme.bs.b bVar = (com.ss.android.ugc.aweme.bs.b) aVar.c();
            if (bVar.W > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
                bVar.a(bVar.Y, uptimeMillis);
                bVar.b(bVar.Y, uptimeMillis);
            }
            bVar.a(getClass().getSimpleName());
            bVar.W = SystemClock.uptimeMillis();
            u a2 = a(aVar);
            if (bVar.X > 0) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
                String simpleName = getClass().getSimpleName();
                bVar.a(simpleName, uptimeMillis2);
                bVar.c(simpleName, uptimeMillis2);
            }
            bVar.X = SystemClock.uptimeMillis();
            return a2;
        }
    }

    static abstract class BaseInterceptorDecorator implements a {

        /* renamed from: a  reason: collision with root package name */
        protected a f44646a;

        static {
            Covode.recordClassIndex(27298);
        }

        public BaseInterceptorDecorator(a aVar) {
            this.f44646a = aVar;
        }

        private u a(a.AbstractC1036a aVar) {
            return this.f44646a.intercept(aVar);
        }

        @Override // com.bytedance.retrofit2.c.a
        public u intercept(a.AbstractC1036a aVar) {
            if (!(aVar.c() instanceof com.ss.android.ugc.aweme.bs.b)) {
                return a(aVar);
            }
            com.ss.android.ugc.aweme.bs.b bVar = (com.ss.android.ugc.aweme.bs.b) aVar.c();
            if (bVar.W > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
                bVar.a(bVar.Y, uptimeMillis);
                bVar.b(bVar.Y, uptimeMillis);
            }
            bVar.a(getClass().getSimpleName());
            bVar.W = SystemClock.uptimeMillis();
            u a2 = a(aVar);
            if (bVar.X > 0) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
                String simpleName = getClass().getSimpleName();
                bVar.a(simpleName, uptimeMillis2);
                bVar.c(simpleName, uptimeMillis2);
            }
            bVar.X = SystemClock.uptimeMillis();
            return a2;
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        String str3 = null;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.frameworks.baselib.network.http.e.a aVar = new com.bytedance.frameworks.baselib.network.http.e.a(str);
            str2 = aVar.getBaseType();
            try {
                str3 = aVar.getParameter("charset");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        return new Pair<>(str2, str3);
    }

    public static synchronized q b(String str) {
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7451);
            if (m.a(str)) {
                MethodCollector.o(7451);
                return null;
            }
            q a2 = f44642b.a(str);
            if (a2 != null) {
                MethodCollector.o(7451);
                return a2;
            }
            q b2 = b(str, null);
            f44642b.a(str, b2);
            MethodCollector.o(7451);
            return b2;
        }
    }

    private static q a(q.a aVar) {
        if (h.a().f112414a) {
            try {
                a.AbstractC1037a aVar2 = (a.AbstractC1037a) Reflect.on(aVar).field("clientProvider", new Class[0]).get();
                com.bytedance.retrofit2.client.a aVar3 = aVar2.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(aVar2.getClass().getName()) || (aVar3 instanceof o) || (aVar3 instanceof com.bytedance.frameworks.baselib.network.http.cronet.c.a)) {
                    return aVar.a();
                }
            } catch (Throwable th) {
                eo.a(th, "error occured.");
            }
        }
        q a2 = aVar.a();
        if (a2.f42572g != null) {
            a2.f42572g.add(new TTNetMonitorInterceptor());
            a2.f42572g.set(0, new BeforeHandleRequestInterceptor(a2.f42572g.get(0)));
        }
        return a2;
    }

    public static synchronized q b(String str, List<com.bytedance.retrofit2.c.a> list) {
        q a2;
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7586);
            a2 = a(str, list, (e.a) null, new a.AbstractC1037a() {
                /* class com.bytedance.ttnet.utils.RetrofitUtils.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(27296);
                }

                @Override // com.bytedance.retrofit2.client.a.AbstractC1037a
                public final com.bytedance.retrofit2.client.a get() {
                    return new com.bytedance.ttnet.retrofit.b();
                }
            });
            MethodCollector.o(7586);
        }
        return a2;
    }

    public static synchronized q a(String str, List<com.bytedance.retrofit2.c.a> list) {
        q b2;
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7521);
            b2 = b(str, list);
            MethodCollector.o(7521);
        }
        return b2;
    }

    public static synchronized <S> S a(q qVar, Class<S> cls) {
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7808);
            if (qVar != null) {
                S s = (S) qVar.a(cls);
                MethodCollector.o(7808);
                return s;
            }
            MethodCollector.o(7808);
            return null;
        }
    }

    public static synchronized <S> S a(String str, Class<S> cls) {
        S s;
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7751);
            s = (S) a(b(str), cls);
            MethodCollector.o(7751);
        }
        return s;
    }

    private static synchronized q a(String str, List<com.bytedance.retrofit2.c.a> list, e.a aVar, a.AbstractC1037a aVar2) {
        q a2;
        synchronized (RetrofitUtils.class) {
            MethodCollector.i(7588);
            a2 = a(list, null, null, aVar2, str);
            MethodCollector.o(7588);
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r3 == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.bytedance.retrofit2.q a(java.util.List<com.bytedance.retrofit2.c.a> r9, java.util.List<com.bytedance.retrofit2.e.a> r10, java.util.List<com.bytedance.retrofit2.c.a> r11, com.bytedance.retrofit2.client.a.AbstractC1037a r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.RetrofitUtils.a(java.util.List, java.util.List, java.util.List, com.bytedance.retrofit2.client.a$a, java.lang.String):com.bytedance.retrofit2.q");
    }
}
