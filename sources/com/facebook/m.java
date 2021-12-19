package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.GraphRequest;
import com.facebook.a.h;
import com.facebook.a.i;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.b.a.f;
import com.facebook.internal.c;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.internal.v;
import com.facebook.internal.y;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.g;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f48915a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f48916b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f48917c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile String f48918d = "facebook.com";

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f48919e = false;

    /* renamed from: f  reason: collision with root package name */
    static boolean f48920f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Context f48921g;

    /* renamed from: h  reason: collision with root package name */
    public static int f48922h = 64206;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f48923i = false;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f48924j = false;

    /* renamed from: k  reason: collision with root package name */
    static a f48925k = new a() {
        /* class com.facebook.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29482);
        }

        @Override // com.facebook.m.a
        public final GraphRequest a(String str, JSONObject jSONObject) {
            return GraphRequest.a((AccessToken) null, str, jSONObject, (GraphRequest.b) null);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private static final String f48926l = m.class.getCanonicalName();

    /* renamed from: m  reason: collision with root package name */
    private static final HashSet<u> f48927m = new HashSet<>(Arrays.asList(u.DEVELOPER_ERRORS));
    private static Executor n;
    private static volatile Boolean o;
    private static AtomicLong p = new AtomicLong(65536);
    private static v<File> q;
    private static final Object r = new Object();
    private static String s = "v9.0";
    private static Boolean t = false;
    private static Boolean u = false;

    public interface a {
        static {
            Covode.recordClassIndex(29491);
        }

        GraphRequest a(String str, JSONObject jSONObject);
    }

    public interface b {
        static {
            Covode.recordClassIndex(29492);
        }
    }

    public static String e() {
        com.a.a("getGraphApiVersion: %s", new Object[]{s});
        return s;
    }

    public static long f() {
        ae.a();
        return p.get();
    }

    public static synchronized boolean b() {
        boolean booleanValue;
        synchronized (m.class) {
            MethodCollector.i(234);
            booleanValue = u.booleanValue();
            MethodCollector.o(234);
        }
        return booleanValue;
    }

    public static Executor c() {
        MethodCollector.i(238);
        synchronized (r) {
            try {
                if (n == null) {
                    n = AsyncTask.THREAD_POOL_EXECUTOR;
                }
            } catch (Throwable th) {
                MethodCollector.o(238);
                throw th;
            }
        }
        Executor executor = n;
        MethodCollector.o(238);
        return executor;
    }

    public static synchronized boolean a() {
        boolean booleanValue;
        synchronized (m.class) {
            MethodCollector.i(232);
            booleanValue = t.booleanValue();
            MethodCollector.o(232);
        }
        return booleanValue;
    }

    public static String d() {
        String str;
        AccessToken accessToken = b.a().f46926b;
        if (accessToken == null || (str = accessToken.f46504k) == null || !str.equals("gaming")) {
            return f48918d;
        }
        return f48918d.replace("facebook.com", "fb.gg");
    }

    static {
        Covode.recordClassIndex(29481);
    }

    public static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static synchronized void a(Context context) {
        synchronized (m.class) {
            MethodCollector.i(224);
            d(context);
            MethodCollector.o(224);
        }
    }

    public static boolean c(Context context) {
        ae.a();
        return d.a(context, "com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static boolean a(u uVar) {
        boolean z;
        MethodCollector.i(237);
        HashSet<u> hashSet = f48927m;
        synchronized (hashSet) {
            try {
                if (!f48919e || !hashSet.contains(uVar)) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.o(237);
            }
        }
        return z;
    }

    private static synchronized void d(Context context) {
        synchronized (m.class) {
            MethodCollector.i(225);
            if (g.f107210b.compareAndSet(false, true)) {
                Executor executor = g.f107209a;
                ae.a(executor, "executor");
                synchronized (r) {
                    try {
                        n = executor;
                    } catch (Throwable th) {
                        MethodCollector.o(225);
                        throw th;
                    }
                }
            }
            e(context);
            MethodCollector.o(225);
        }
    }

    private static synchronized void e(Context context) {
        ApplicationInfo applicationInfo;
        synchronized (m.class) {
            MethodCollector.i(230);
            if (t.booleanValue()) {
                MethodCollector.o(230);
                return;
            }
            ae.a((Object) context, "applicationContext");
            ae.b(context, false);
            ae.a(context, false);
            f48921g = b(context);
            h.a(context);
            Context context2 = f48921g;
            if (context2 != null) {
                try {
                    PackageManager packageManager = context2.getPackageManager();
                    String packageName = context2.getPackageName();
                    if (TextUtils.equals(packageName, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
                        if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                            com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                        }
                        applicationInfo = com.ss.android.ugc.aweme.lancet.c.b.f107191a;
                    } else {
                        applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                    }
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        if (f48915a == null) {
                            Object a2 = a(applicationInfo.metaData, "com.facebook.sdk.ApplicationId");
                            if (a2 instanceof String) {
                                String str = (String) a2;
                                if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                    f48915a = str.substring(2);
                                } else {
                                    f48915a = str;
                                }
                            } else if (a2 instanceof Number) {
                                j jVar = new j("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                                MethodCollector.o(230);
                                throw jVar;
                            }
                        }
                        if (f48916b == null) {
                            f48916b = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                        }
                        if (f48917c == null) {
                            f48917c = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                        }
                        if (f48922h == 64206) {
                            f48922h = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                        }
                        if (o == null) {
                            o = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (!ad.a(f48915a)) {
                t = true;
                if (ab.a()) {
                    u = true;
                }
                if ((f48921g instanceof Application) && ab.b()) {
                    com.facebook.a.e.a.a((Application) f48921g, f48915a);
                }
                r.a();
                y.b();
                c.a(f48921g);
                q = new v<>(new Callable<File>() {
                    /* class com.facebook.m.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(29483);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ File call() {
                        Context context = m.f48921g;
                        if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                            com.ss.android.ugc.aweme.lancet.d.f107194b = context.getCacheDir();
                        }
                        return com.ss.android.ugc.aweme.lancet.d.f107194b;
                    }
                });
                o.a(o.b.Instrument, new o.a() {
                    /* class com.facebook.m.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(29484);
                    }

                    @Override // com.facebook.internal.o.a
                    public final void a(boolean z) {
                        if (z && ab.b()) {
                            o.a(o.b.CrashReport, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: INVOKE  
                                  (wrap: com.facebook.internal.o$b : 0x0008: SGET  (r1v0 com.facebook.internal.o$b) =  com.facebook.internal.o.b.CrashReport com.facebook.internal.o$b)
                                  (wrap: com.facebook.internal.a.c$1 : 0x000c: CONSTRUCTOR  (r0v1 com.facebook.internal.a.c$1) =  call: com.facebook.internal.a.c.1.<init>():void type: CONSTRUCTOR)
                                 type: STATIC call: com.facebook.internal.o.a(com.facebook.internal.o$b, com.facebook.internal.o$a):void in method: com.facebook.m.3.a(boolean):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r0v1 com.facebook.internal.a.c$1) =  call: com.facebook.internal.a.c.1.<init>():void type: CONSTRUCTOR in method: com.facebook.m.3.a(boolean):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 21 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.internal.a.c, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 27 more
                                */
                            /*
                                this = this;
                                if (r3 == 0) goto L_0x001c
                                boolean r0 = com.facebook.ab.b()
                                if (r0 == 0) goto L_0x001c
                                com.facebook.internal.o$b r1 = com.facebook.internal.o.b.CrashReport
                                com.facebook.internal.a.c$1 r0 = new com.facebook.internal.a.c$1
                                r0.<init>()
                                com.facebook.internal.o.a(r1, r0)
                                com.facebook.internal.o$b r1 = com.facebook.internal.o.b.ErrorReport
                                com.facebook.internal.a.c$2 r0 = new com.facebook.internal.a.c$2
                                r0.<init>()
                                com.facebook.internal.o.a(r1, r0)
                            L_0x001c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.AnonymousClass3.a(boolean):void");
                        }
                    });
                    o.a(o.b.AppEvents, new o.a() {
                        /* class com.facebook.m.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(29485);
                        }

                        @Override // com.facebook.internal.o.a
                        public final void a(boolean z) {
                            if (z && !com.facebook.internal.a.b.a.a(i.class)) {
                                try {
                                    r.f48660d.add(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: INVOKE  
                                          (wrap: java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$b> : 0x000f: SGET  (r0v3 java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$b>) =  com.facebook.internal.r.d java.util.concurrent.ConcurrentLinkedQueue)
                                          (wrap: com.facebook.a.i$1 : 0x000c: CONSTRUCTOR  (r1v1 com.facebook.a.i$1) =  call: com.facebook.a.i.1.<init>():void type: CONSTRUCTOR)
                                         type: VIRTUAL call: java.util.concurrent.ConcurrentLinkedQueue.add(java.lang.Object):boolean in method: com.facebook.m.4.a(boolean):void, file: classes2.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r1v1 com.facebook.a.i$1) =  call: com.facebook.a.i.1.<init>():void type: CONSTRUCTOR in method: com.facebook.m.4.a(boolean):void, file: classes2.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 24 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.i, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 30 more
                                        */
                                    /*
                                        this = this;
                                        if (r3 == 0) goto L_0x001e
                                        java.lang.Class<com.facebook.a.i> r0 = com.facebook.a.i.class
                                        boolean r0 = com.facebook.internal.a.b.a.a(r0)
                                        if (r0 != 0) goto L_0x001e
                                        com.facebook.a.i$1 r1 = new com.facebook.a.i$1     // Catch:{ all -> 0x0018 }
                                        r1.<init>()     // Catch:{ all -> 0x0018 }
                                        java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$b> r0 = com.facebook.internal.r.f48660d     // Catch:{ all -> 0x0018 }
                                        r0.add(r1)     // Catch:{ all -> 0x0018 }
                                        com.facebook.internal.r.a()     // Catch:{ all -> 0x0018 }
                                        return
                                    L_0x0018:
                                        r1 = move-exception
                                        java.lang.Class<com.facebook.a.i> r0 = com.facebook.a.i.class
                                        com.facebook.internal.a.b.a.a(r1, r0)
                                    L_0x001e:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.AnonymousClass4.a(boolean):void");
                                }
                            });
                            o.a(o.b.ChromeCustomTabsPrefetching, new o.a() {
                                /* class com.facebook.m.AnonymousClass5 */

                                static {
                                    Covode.recordClassIndex(29486);
                                }

                                @Override // com.facebook.internal.o.a
                                public final void a(boolean z) {
                                    if (z) {
                                        m.f48923i = true;
                                    }
                                }
                            });
                            o.a(o.b.IgnoreAppSwitchToLoggedOut, new o.a() {
                                /* class com.facebook.m.AnonymousClass6 */

                                static {
                                    Covode.recordClassIndex(29487);
                                }

                                @Override // com.facebook.internal.o.a
                                public final void a(boolean z) {
                                    if (z) {
                                        m.f48924j = true;
                                    }
                                }
                            });
                            o.a(o.b.Monitoring, new o.a() {
                                /* class com.facebook.m.AnonymousClass7 */

                                static {
                                    Covode.recordClassIndex(29488);
                                }

                                @Override // com.facebook.internal.o.a
                                public final void a(boolean z) {
                                    if (z && ab.e()) {
                                        ae.a();
                                        q a2 = r.a(m.f48915a);
                                        if (a2 != null && a2.p) {
                                            f.f48592a.a();
                                        }
                                    }
                                }
                            });
                            c().execute(new FutureTask(new Callable<Void>(null, context) {
                                /* class com.facebook.m.AnonymousClass8 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f48928a = null;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ Context f48929b;

                                static {
                                    Covode.recordClassIndex(29489);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public Void call() {
                                    MethodCollector.i(3694);
                                    b a2 = b.a();
                                    AccessToken a3 = a2.f46925a.a();
                                    if (a3 != null) {
                                        a2.a(a3, false);
                                    }
                                    w a4 = w.a();
                                    Profile a5 = a4.f49234a.a();
                                    if (a5 != null) {
                                        a4.a(a5, false);
                                    }
                                    if (AccessToken.a() && w.a().f49235b == null) {
                                        Profile.a();
                                    }
                                    Context context = m.f48921g;
                                    String str = m.f48915a;
                                    if (!com.facebook.internal.a.b.a.a(h.class)) {
                                        try {
                                            if (ab.b()) {
                                                h.f46814a.execute(
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: INVOKE  
                                                      (wrap: java.util.concurrent.ScheduledThreadPoolExecutor : 0x004c: SGET  (r1v12 java.util.concurrent.ScheduledThreadPoolExecutor) =  com.facebook.a.h.a java.util.concurrent.ScheduledThreadPoolExecutor)
                                                      (wrap: com.facebook.a.h$1 : 0x0050: CONSTRUCTOR  (r0v23 com.facebook.a.h$1) = 
                                                      (r4v0 'context' android.content.Context)
                                                      (wrap: com.facebook.a.h : 0x0049: CONSTRUCTOR  (r2v2 com.facebook.a.h) = (r4v0 'context' android.content.Context), (r1v2 'str' java.lang.String) call: com.facebook.a.h.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                                                     call: com.facebook.a.h.1.<init>(android.content.Context, com.facebook.a.h):void type: CONSTRUCTOR)
                                                     type: VIRTUAL call: java.util.concurrent.ScheduledThreadPoolExecutor.execute(java.lang.Runnable):void in method: com.facebook.m.8.a():java.lang.Void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r0v23 com.facebook.a.h$1) = 
                                                      (r4v0 'context' android.content.Context)
                                                      (wrap: com.facebook.a.h : 0x0049: CONSTRUCTOR  (r2v2 com.facebook.a.h) = (r4v0 'context' android.content.Context), (r1v2 'str' java.lang.String) call: com.facebook.a.h.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                                                     call: com.facebook.a.h.1.<init>(android.content.Context, com.facebook.a.h):void type: CONSTRUCTOR in method: com.facebook.m.8.a():java.lang.Void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                    	... 29 more
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.h, state: GENERATED_AND_UNLOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                    	... 35 more
                                                    */
                                                /*
                                                // Method dump skipped, instructions count: 197
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.AnonymousClass8.call():java.lang.Void");
                                            }

                                            {
                                                this.f48929b = r3;
                                            }
                                        }));
                                        MethodCollector.o(230);
                                        return;
                                    }
                                    j jVar2 = new j("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                                    MethodCollector.o(230);
                                    throw jVar2;
                                }
                            }

                            private static Object a(Bundle bundle, String str) {
                                try {
                                    return bundle.get(str);
                                } catch (Exception | OutOfMemoryError unused) {
                                    return null;
                                }
                            }
                        }
