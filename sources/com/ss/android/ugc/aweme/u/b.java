package com.ss.android.ugc.aweme.u;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.a.e;
import com.bytedance.crash.util.ab;
import com.ss.android.ugc.aweme.feed.experiment.ad;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f141622a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92549);
    }

    private static void c(String str) {
        com.ss.android.ugc.aweme.framework.a.a.a(6, "BugReportCrashUtil", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.u.b$b  reason: collision with other inner class name */
    public static final class C3762b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C3762b f141624a = new C3762b();

        static {
            Covode.recordClassIndex(92551);
        }

        C3762b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            l.b(str, "");
            b.b(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141625a = new c();

        static {
            Covode.recordClassIndex(92552);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.framework.a.a.a(th);
            String message = th.getMessage();
            if (message != null) {
                b.b(message);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f141623a = new a();

        static {
            Covode.recordClassIndex(92550);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            StringBuilder append = new StringBuilder().append(str).append(',');
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            return append.append(currentThread.getName()).toString();
        }
    }

    public static void a(String str) {
        if (ad.f93031a <= 0) {
            c("can't report:".concat(String.valueOf(str)));
        } else if (str != null) {
            t.b(str).b(f.a.h.a.b(f.a.k.a.f158006c)).d(a.f141623a).a(C3762b.f141624a, c.f141625a);
        }
    }

    public static void b(String str) {
        try {
            if (!Npth.isInit()) {
                c("Npth is not init, report abort:".concat(String.valueOf(str)));
                return;
            }
            e a2 = e.a();
            CrashType crashType = CrashType.JAVA;
            com.bytedance.crash.entity.b bVar = new com.bytedance.crash.entity.b(new JSONObject());
            bVar.a("data", (Object) ab.a(new c(str)));
            bVar.a("isOOM", (Object) false);
            bVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
            com.bytedance.crash.entity.b a3 = a2.a(crashType, bVar);
            String javaCrashUploadUrl = m.f27730g.getJavaCrashUploadUrl();
            l.b(a3, "");
            com.bytedance.crash.j.f.a(javaCrashUploadUrl, a3.f27557a.toString());
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
