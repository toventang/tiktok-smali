package leakcanary.internal;

import android.app.Application;
import android.content.ComponentName;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.w;
import h.z;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicReference;
import leakcanary.c;
import leakcanary.e;
import leakcanary.h;
import leakcanary.internal.f;
import m.a;

public final class InternalLeakCanary implements h.f.a.b<Application, z>, h {
    static final /* synthetic */ i[] $$delegatedProperties = {new y(ab.a(InternalLeakCanary.class), "leakDirectoryProvider", "getLeakDirectoryProvider()Lleakcanary/internal/LeakDirectoryProvider;")};
    public static final InternalLeakCanary INSTANCE = new InternalLeakCanary();
    public static Application application;
    private static volatile boolean applicationVisible;
    private static f heapDumpTrigger;
    private static final h.h leakDirectoryProvider$delegate = h.i.a((h.f.a.a) d.f159403a);

    public final k getLeakDirectoryProvider() {
        return (k) leakDirectoryProvider$delegate.getValue();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f159402a = new c();

        static {
            Covode.recordClassIndex(105833);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ e.a invoke() {
            return leakcanary.e.f159369a;
        }
    }

    private InternalLeakCanary() {
    }

    public final boolean getApplicationVisible() {
        return applicationVisible;
    }

    static final class d extends m implements h.f.a.a<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f159403a = new d();

        static {
            Covode.recordClassIndex(105834);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return new k(InternalLeakCanary.INSTANCE.getApplication(), AnonymousClass1.f159404a, AnonymousClass2.f159405a);
        }
    }

    private final void disableDumpHeapInInstrumentationTests() {
        new Handler().post(a.f159400a);
    }

    public final Application getApplication() {
        Application application2 = application;
        if (application2 == null) {
            l.a("application");
        }
        return application2;
    }

    public final e.a getNoInstallConfig() {
        return new e.a(false, 0, false, 0, 126);
    }

    public final void onDumpHeapReceived() {
        f fVar = heapDumpTrigger;
        if (fVar != null) {
            fVar.f159432h.post(new f.c(fVar));
        }
    }

    public final /* synthetic */ <T> T noOpDelegate() {
        l.c();
        e eVar = e.f159406a;
        T t = (T) Proxy.newProxyInstance(Object.class.getClassLoader(), new Class[]{Object.class}, eVar);
        l.c();
        return t;
    }

    static {
        Covode.recordClassIndex(105830);
    }

    @Override // leakcanary.h
    public final void onObjectRetained() {
        f fVar = heapDumpTrigger;
        if (fVar == null) {
            return;
        }
        if (fVar.f159426b) {
            a.AbstractC4200a aVar = m.a.f159491a;
            if (aVar != null) {
                aVar.a("Already scheduled retained check, ignoring (" + "found new object retained" + ')');
                return;
            }
            return;
        }
        fVar.f159426b = true;
        fVar.f159432h.post(new f.g(fVar, "found new object retained"));
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f159400a = new a();

        static {
            Covode.recordClassIndex(105831);
        }

        a() {
        }

        public final void run() {
            try {
                Class<?> cls = Class.forName("androidx.test.platform.app.InstrumentationRegistry");
                l.a((Object) cls, "");
                Field declaredField = cls.getDeclaredField("instrumentationRef");
                l.a((Object) declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new w("null cannot be cast to non-null type");
                } else if (((AtomicReference) obj).get() != null) {
                    a.AbstractC4200a aVar = m.a.f159491a;
                    if (aVar != null) {
                        aVar.a("Instrumentation test detected, setting LeakCanary.Config.dumpHeap to false");
                    }
                    leakcanary.e.a(e.a.a(leakcanary.e.f159369a, false, false, 0, false, 0, false, false, 126));
                }
            } catch (Throwable unused) {
                if (0 == 0) {
                }
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(Application application2) {
        invoke(application2);
        return z.f158842a;
    }

    public final void setApplication(Application application2) {
        l.c(application2, "");
        application = application2;
    }

    public static final /* synthetic */ f access$getHeapDumpTrigger$p(InternalLeakCanary internalLeakCanary) {
        f fVar = heapDumpTrigger;
        if (fVar == null) {
            l.a("heapDumpTrigger");
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f159401a = new b();

        static {
            Covode.recordClassIndex(105832);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            InternalLeakCanary internalLeakCanary = InternalLeakCanary.INSTANCE;
            InternalLeakCanary.applicationVisible = booleanValue;
            f access$getHeapDumpTrigger$p = InternalLeakCanary.access$getHeapDumpTrigger$p(InternalLeakCanary.INSTANCE);
            if (booleanValue) {
                access$getHeapDumpTrigger$p.f159430f = -1;
            } else {
                access$getHeapDumpTrigger$p.f159430f = SystemClock.uptimeMillis();
                access$getHeapDumpTrigger$p.a("app became invisible", leakcanary.a.f159358a.f159364e);
            }
            return z.f158842a;
        }
    }

    public final void invoke(Application application2) {
        l.c(application2, "");
        application = application2;
        j.f159458e.a((h) this);
        AndroidHeapDumper androidHeapDumper = new AndroidHeapDumper(application2, getLeakDirectoryProvider());
        c.a aVar = c.a.f159365a;
        c cVar = c.f159402a;
        HandlerThread handlerThread = new HandlerThread("LeakCanary-Heap-Dump");
        handlerThread.start();
        heapDumpTrigger = new f(application2, new Handler(handlerThread.getLooper()), j.f159458e, aVar, androidHeapDumper, cVar);
        b bVar = b.f159401a;
        l.c(application2, "");
        l.c(bVar, "");
        application2.registerActivityLifecycleCallbacks(new p(bVar));
        disableDumpHeapInInstrumentationTests();
    }

    public final void setEnabledBlocking(String str, boolean z) {
        int i2;
        l.c(str, "");
        Application application2 = application;
        if (application2 == null) {
            l.a("application");
        }
        ComponentName componentName = new ComponentName(application2, str);
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        Application application3 = application;
        if (application3 == null) {
            l.a("application");
        }
        application3.getPackageManager().setComponentEnabledSetting(componentName, i2, 1);
    }

    public static final class e implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final e f159406a = new e();

        static {
            Covode.recordClassIndex(105837);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return z.f158842a;
        }
    }
}
