package leakcanary.internal;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.w;
import h.z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import leakcanary.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f159454a = {new y(ab.a(j.class), "isDebuggableBuild", "isDebuggableBuild()Z")};

    /* renamed from: b  reason: collision with root package name */
    public static final h.f.a.b<Application, z> f159455b;

    /* renamed from: c  reason: collision with root package name */
    public static Application f159456c;

    /* renamed from: d  reason: collision with root package name */
    static final Handler f159457d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public static final leakcanary.g f159458e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f159459f = new j();

    /* renamed from: g  reason: collision with root package name */
    private static final h f159460g = h.i.a((h.f.a.a) e.f159466a);

    /* renamed from: h  reason: collision with root package name */
    private static final c f159461h = new c();

    /* renamed from: i  reason: collision with root package name */
    private static final Executor f159462i;

    public static final class a implements h.f.a.b<Application, z>, leakcanary.h {

        /* renamed from: b  reason: collision with root package name */
        public static final a f159463b = new a();

        @Override // leakcanary.h
        public final void onObjectRetained() {
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(105863);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Application application) {
            l.c(application, "");
            return z.f158842a;
        }
    }

    public static final class c implements leakcanary.b {
        static {
            Covode.recordClassIndex(105865);
        }

        c() {
        }

        @Override // leakcanary.b
        public final long a() {
            return SystemClock.uptimeMillis();
        }
    }

    public static final class d extends m implements h.f.a.a<a.C4197a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f159465a = new d();

        static {
            Covode.recordClassIndex(105866);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ a.C4197a invoke() {
            return leakcanary.a.f159358a;
        }
    }

    private j() {
    }

    public static boolean a() {
        if (f159456c != null) {
            return true;
        }
        return false;
    }

    static final class g extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f159468a = new g();

        static {
            Covode.recordClassIndex(105869);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(leakcanary.a.f159358a.f159360a);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f159466a = new e();

        static {
            Covode.recordClassIndex(105867);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Application application = j.f159456c;
            if (application == null) {
                l.a("application");
            }
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Object obj;
        Covode.recordClassIndex(105862);
        try {
            Class<?> cls = Class.forName("leakcanary.internal.InternalLeakCanary");
            l.a((Object) cls, "");
            obj = cls.getDeclaredField("INSTANCE").get(null);
        } catch (Throwable unused) {
            obj = a.f159463b;
        }
        if (obj != null) {
            f159455b = (h.f.a.b) ad.b(obj, 1);
            b bVar = b.f159464a;
            f159462i = bVar;
            f159458e = new leakcanary.g(f159461h, bVar, g.f159468a);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    static final class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public static final b f159464a = new b();

        static {
            Covode.recordClassIndex(105864);
        }

        b() {
        }

        public final void execute(Runnable runnable) {
            j.f159457d.postDelayed(runnable, leakcanary.a.f159358a.f159364e);
        }
    }

    public static final class f implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final f f159467a = new f();

        static {
            Covode.recordClassIndex(105868);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return z.f158842a;
        }
    }
}
