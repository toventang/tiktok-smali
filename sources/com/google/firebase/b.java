package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.d.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.l;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.components.n;
import com.google.firebase.components.s;
import com.google.firebase.f.e;
import com.google.firebase.f.g;
import com.kakao.usermgmt.StringSet;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f54280a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static final Map<String, b> f54281b = new androidx.c.a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f54282e = new ExecutorC1241b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final i f54283c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f54284d = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final Context f54285f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54286g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54287h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f54288i = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    private final s<com.google.firebase.e.a> f54289j;

    /* renamed from: k  reason: collision with root package name */
    private final List<Object> f54290k = new CopyOnWriteArrayList();

    /* renamed from: l  reason: collision with root package name */
    private final List<Object> f54291l = new CopyOnWriteArrayList();

    /* access modifiers changed from: package-private */
    public static class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        static AtomicReference<a> f54292a = new AtomicReference<>();

        a() {
        }

        static {
            Covode.recordClassIndex(33702);
        }

        public static Context a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public final void a(boolean z) {
            MethodCollector.i(1984);
            synchronized (b.f54280a) {
                try {
                    Iterator it = new ArrayList(b.f54281b.values()).iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (bVar.f54284d.get()) {
                            bVar.g();
                        }
                    }
                } finally {
                    MethodCollector.o(1984);
                }
            }
        }
    }

    /* renamed from: com.google.firebase.b$b  reason: collision with other inner class name */
    static class ExecutorC1241b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private static final Handler f54295a = new Handler(Looper.getMainLooper());

        private ExecutorC1241b() {
        }

        static {
            Covode.recordClassIndex(33703);
        }

        /* synthetic */ ExecutorC1241b(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            f54295a.post(runnable);
        }
    }

    public final Context a() {
        j();
        return this.f54285f;
    }

    public final String b() {
        j();
        return this.f54286g;
    }

    public final e c() {
        j();
        return this.f54287h;
    }

    public int hashCode() {
        return this.f54286g.hashCode();
    }

    /* access modifiers changed from: package-private */
    public static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<c> f54296a = new AtomicReference<>();

        /* renamed from: b  reason: collision with root package name */
        private final Context f54297b;

        static {
            Covode.recordClassIndex(33704);
        }

        private c(Context context) {
            this.f54297b = context;
        }

        public static void a(Context context) {
            if (f54296a.get() == null) {
                c cVar = new c(context);
                if (f54296a.compareAndSet(null, cVar)) {
                    b(context, cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            MethodCollector.i(1998);
            synchronized (b.f54280a) {
                try {
                    for (b bVar : b.f54281b.values()) {
                        bVar.i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1998);
                    throw th;
                }
            }
            this.f54297b.unregisterReceiver(this);
            MethodCollector.o(1998);
        }

        private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.b.c.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    private void j() {
        r.a(!this.f54288i.get(), "FirebaseApp was deleted");
    }

    public final boolean f() {
        return "[DEFAULT]".equals(b());
    }

    static {
        Covode.recordClassIndex(33701);
    }

    public final boolean e() {
        j();
        return this.f54289j.a().f54363a.get();
    }

    public final void g() {
        Iterator<Object> it = this.f54290k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void i() {
        if (!h.a(this.f54285f)) {
            c.a(this.f54285f);
        } else {
            this.f54283c.a(f());
        }
    }

    public String toString() {
        return p.a(this).a(StringSet.name, this.f54286g).a("options", this.f54287h).toString();
    }

    public final String h() {
        return com.google.android.gms.common.util.c.a(b().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(c().f54357b.getBytes(Charset.defaultCharset()));
    }

    public static b d() {
        b bVar;
        MethodCollector.i(2080);
        synchronized (f54280a) {
            try {
                bVar = f54281b.get("[DEFAULT]");
                if (bVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Default FirebaseApp is not initialized in this process " + l.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    MethodCollector.o(2080);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.o(2080);
            }
        }
        return bVar;
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final <T> T a(Class<T> cls) {
        j();
        return (T) this.f54283c.a(cls);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f54286g.equals(((b) obj).b());
    }

    public static b a(Context context) {
        MethodCollector.i(2086);
        synchronized (f54280a) {
            try {
                if (f54281b.containsKey("[DEFAULT]")) {
                    return d();
                }
                t tVar = new t(context);
                String a2 = tVar.a("google_app_id");
                if (TextUtils.isEmpty(a2)) {
                    MethodCollector.o(2086);
                    return null;
                }
                b a3 = a(context, new e(a2, tVar.a("google_api_key"), tVar.a("firebase_database_url"), tVar.a("ga_trackingId"), tVar.a("gcm_defaultSenderId"), tVar.a("google_storage_bucket"), tVar.a("project_id")), "[DEFAULT]");
                MethodCollector.o(2086);
                return a3;
            } finally {
                MethodCollector.o(2086);
            }
        }
    }

    private b(Context context, String str, e eVar) {
        com.google.firebase.components.b<?> bVar;
        this.f54285f = (Context) r.a(context);
        this.f54286g = r.a(str);
        this.f54287h = (e) r.a(eVar);
        f fVar = new f(context, new f.a(ComponentDiscoveryService.class, (byte) 0));
        List<com.google.firebase.components.h> a2 = f.a(fVar.f54320b.a(fVar.f54319a));
        String a3 = e.a();
        Executor executor = f54282e;
        com.google.firebase.components.b[] bVarArr = new com.google.firebase.components.b[8];
        bVarArr[0] = com.google.firebase.components.b.a(context, Context.class, new Class[0]);
        bVarArr[1] = com.google.firebase.components.b.a(this, b.class, new Class[0]);
        bVarArr[2] = com.google.firebase.components.b.a(eVar, e.class, new Class[0]);
        bVarArr[3] = g.a("fire-android", "");
        bVarArr[4] = g.a("fire-core", "19.3.0");
        if (a3 != null) {
            bVar = g.a("kotlin", a3);
        } else {
            bVar = null;
        }
        bVarArr[5] = bVar;
        bVarArr[6] = com.google.firebase.components.b.a(com.google.firebase.f.h.class).a(new n(com.google.firebase.f.f.class, 2)).a(com.google.firebase.f.c.f54371a).a();
        bVarArr[7] = com.google.firebase.components.b.a(com.google.firebase.c.c.class).a(n.a(Context.class)).a(com.google.firebase.c.b.f54301a).a();
        this.f54283c = new i(executor, a2, bVarArr);
        this.f54289j = new s<>(new c(this, context));
    }

    private static b a(Context context, e eVar, String str) {
        boolean z;
        b bVar;
        MethodCollector.i(2090);
        if (a.a(context) instanceof Application) {
            Application application = (Application) a.a(context);
            if (a.f54292a.get() == null) {
                a aVar = new a();
                if (a.f54292a.compareAndSet(null, aVar)) {
                    com.google.android.gms.common.api.internal.c.a(application);
                    com.google.android.gms.common.api.internal.c.a().a(aVar);
                }
            }
        }
        String trim = str.trim();
        if (b(context) != null) {
            context = b(context);
        }
        synchronized (f54280a) {
            try {
                Map<String, b> map = f54281b;
                if (!map.containsKey(trim)) {
                    z = true;
                } else {
                    z = false;
                }
                r.a(z, "FirebaseApp name " + trim + " already exists!");
                r.a(context, "Application context cannot be null.");
                bVar = new b(context, trim, eVar);
                map.put(trim, bVar);
            } catch (Throwable th) {
                MethodCollector.o(2090);
                throw th;
            }
        }
        bVar.i();
        MethodCollector.o(2090);
        return bVar;
    }
}
