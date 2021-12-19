package com.facebook.a.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.a.d;
import com.facebook.a.b.b;
import com.facebook.a.b.c;
import com.facebook.a.e;
import com.facebook.a.h;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.internal.w;
import com.facebook.j;
import com.facebook.m;
import com.facebook.u;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f46708a = a.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    public static final ScheduledExecutorService f46709b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile ScheduledFuture f46710c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f46711d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static AtomicInteger f46712e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    public static volatile i f46713f;

    /* renamed from: g  reason: collision with root package name */
    public static String f46714g;

    /* renamed from: h  reason: collision with root package name */
    public static long f46715h;

    /* renamed from: i  reason: collision with root package name */
    public static int f46716i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static WeakReference<Activity> f46717j;

    /* renamed from: k  reason: collision with root package name */
    private static AtomicBoolean f46718k = new AtomicBoolean(false);

    public static int a() {
        ae.a();
        q a2 = r.a(m.f48915a);
        if (a2 == null) {
            return 60;
        }
        return a2.f48643d;
    }

    static void b() {
        MethodCollector.i(3873);
        synchronized (f46711d) {
            try {
                if (f46710c != null) {
                    f46710c.cancel(false);
                }
                f46710c = null;
            } finally {
                MethodCollector.o(3873);
            }
        }
    }

    static {
        Covode.recordClassIndex(28463);
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        f46709b = (ScheduledExecutorService) g.a(a2.a());
    }

    public static void a(Application application, String str) {
        if (f46718k.compareAndSet(false, true)) {
            com.facebook.internal.o.a(o.b.CodelessEvents, new o.a() {
                /* class com.facebook.a.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28464);
                }

                @Override // com.facebook.internal.o.a
                public final void a(boolean z) {
                    if (z) {
                        if (!com.facebook.internal.a.b.a.a(b.class)) {
                            try {
                                b.f46641d.set(true);
                            } catch (Throwable th) {
                                com.facebook.internal.a.b.a.a(th, b.class);
                            }
                        }
                    } else if (!com.facebook.internal.a.b.a.a(b.class)) {
                        try {
                            b.f46641d.set(false);
                        } catch (Throwable th2) {
                            com.facebook.internal.a.b.a.a(th2, b.class);
                        }
                    }
                }
            });
            f46714g = str;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                /* class com.facebook.a.e.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28465);
                }

                public final void onActivityStarted(Activity activity) {
                    a.f46716i++;
                    w.a(u.APP_EVENTS, a.f46708a, "onActivityStarted");
                }

                public final void onActivityDestroyed(Activity activity) {
                    w.a(u.APP_EVENTS, a.f46708a, "onActivityDestroyed");
                    if (!com.facebook.internal.a.b.a.a(b.class)) {
                        try {
                            c a2 = c.a();
                            if (!com.facebook.internal.a.b.a.a(a2)) {
                                try {
                                    a2.f46655e.remove(Integer.valueOf(activity.hashCode()));
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, a2);
                                }
                            }
                        } catch (Throwable th2) {
                            com.facebook.internal.a.b.a.a(th2, b.class);
                        }
                    }
                }

                public final void onActivityStopped(Activity activity) {
                    w.a(u.APP_EVENTS, a.f46708a, "onActivityStopped");
                    if (!com.facebook.internal.a.b.a.a(h.class)) {
                        try {
                            if (!com.facebook.internal.a.b.a.a(e.class)) {
                                try {
                                    e.f46696b.execute(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                                          (wrap: java.util.concurrent.ScheduledExecutorService : 0x0019: SGET  (r1v3 java.util.concurrent.ScheduledExecutorService) =  com.facebook.a.e.b java.util.concurrent.ScheduledExecutorService)
                                          (wrap: com.facebook.a.e$2 : 0x001d: CONSTRUCTOR  (r0v9 com.facebook.a.e$2) =  call: com.facebook.a.e.2.<init>():void type: CONSTRUCTOR)
                                         type: INTERFACE call: java.util.concurrent.ScheduledExecutorService.execute(java.lang.Runnable):void in method: com.facebook.a.e.a.2.onActivityStopped(android.app.Activity):void, file: classes2.dex
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
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v9 com.facebook.a.e$2) =  call: com.facebook.a.e.2.<init>():void type: CONSTRUCTOR in method: com.facebook.a.e.a.2.onActivityStopped(android.app.Activity):void, file: classes2.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 34 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.e, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 40 more
                                        */
                                    /*
                                        this = this;
                                        com.facebook.u r2 = com.facebook.u.APP_EVENTS
                                        java.lang.String r1 = com.facebook.a.e.a.f46708a
                                        java.lang.String r0 = "onActivityStopped"
                                        com.facebook.internal.w.a(r2, r1, r0)
                                        java.lang.Class<com.facebook.a.h> r0 = com.facebook.a.h.class
                                        boolean r0 = com.facebook.internal.a.b.a.a(r0)
                                        if (r0 != 0) goto L_0x0031
                                        java.lang.Class<com.facebook.a.e> r0 = com.facebook.a.e.class
                                        boolean r0 = com.facebook.internal.a.b.a.a(r0)     // Catch:{ all -> 0x002b }
                                        if (r0 != 0) goto L_0x0031
                                        java.util.concurrent.ScheduledExecutorService r1 = com.facebook.a.e.f46696b     // Catch:{ all -> 0x0024 }
                                        com.facebook.a.e$2 r0 = new com.facebook.a.e$2     // Catch:{ all -> 0x0024 }
                                        r0.<init>()     // Catch:{ all -> 0x0024 }
                                        r1.execute(r0)     // Catch:{ all -> 0x0024 }
                                        goto L_0x0031
                                    L_0x0024:
                                        r1 = move-exception
                                        java.lang.Class<com.facebook.a.e> r0 = com.facebook.a.e.class
                                        com.facebook.internal.a.b.a.a(r1, r0)
                                        goto L_0x0031
                                    L_0x002b:
                                        r1 = move-exception
                                        java.lang.Class<com.facebook.a.h> r0 = com.facebook.a.h.class
                                        com.facebook.internal.a.b.a.a(r1, r0)
                                    L_0x0031:
                                        int r0 = com.facebook.a.e.a.f46716i
                                        int r0 = r0 + -1
                                        com.facebook.a.e.a.f46716i = r0
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.e.a.AnonymousClass2.onActivityStopped(android.app.Activity):void");
                                }

                                public final void onActivityPaused(Activity activity) {
                                    w.a(u.APP_EVENTS, a.f46708a, "onActivityPaused");
                                    if (a.f46712e.decrementAndGet() < 0) {
                                        a.f46712e.set(0);
                                    }
                                    a.b();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    String c2 = ad.c(activity);
                                    if (!com.facebook.internal.a.b.a.a(b.class)) {
                                        try {
                                            if (b.f46641d.get()) {
                                                c a2 = c.a();
                                                if (!com.facebook.internal.a.b.a.a(a2)) {
                                                    try {
                                                        if (!com.facebook.internal.u.a()) {
                                                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                                a2.f46652b.remove(activity);
                                                                a2.f46653c.clear();
                                                                a2.f46655e.put(Integer.valueOf(activity.hashCode()), (HashSet) a2.f46654d.clone());
                                                                a2.f46654d.clear();
                                                            } else {
                                                                throw new j("Can't remove activity from CodelessMatcher on non-UI thread");
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        com.facebook.internal.a.b.a.a(th, a2);
                                                    }
                                                }
                                                if (b.f46640c != null) {
                                                    com.facebook.a.b.e eVar = b.f46640c;
                                                    if (!com.facebook.internal.a.b.a.a(eVar)) {
                                                        try {
                                                            if (!(eVar.f46675b.get() == null || eVar.f46676c == null)) {
                                                                try {
                                                                    eVar.f46676c.cancel();
                                                                    eVar.f46676c = null;
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            com.facebook.internal.a.b.a.a(th2, eVar);
                                                        }
                                                    }
                                                }
                                                if (b.f46639b != null) {
                                                    b.f46639b.unregisterListener(b.f46638a);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            com.facebook.internal.a.b.a.a(th3, b.class);
                                        }
                                    }
                                    a.f46709b.execute(new Runnable(currentTimeMillis, c2) {
                                        /* class com.facebook.a.e.a.AnonymousClass5 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ long f46722a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ String f46723b;

                                        static {
                                            Covode.recordClassIndex(28468);
                                        }

                                        public final void run() {
                                            long j2;
                                            MethodCollector.i(80);
                                            if (com.facebook.internal.a.b.a.a(this)) {
                                                MethodCollector.o(80);
                                                return;
                                            }
                                            try {
                                                if (a.f46713f == null) {
                                                    a.f46713f = new i(Long.valueOf(this.f46722a), null);
                                                }
                                                a.f46713f.f46752b = Long.valueOf(this.f46722a);
                                                if (a.f46712e.get() <= 0) {
                                                    AnonymousClass1 r5 = new Runnable() {
                                                        /* class com.facebook.a.e.a.AnonymousClass5.AnonymousClass1 */

                                                        static {
                                                            Covode.recordClassIndex(28469);
                                                        }

                                                        public final void run() {
                                                            MethodCollector.i(233);
                                                            if (com.facebook.internal.a.b.a.a(this)) {
                                                                MethodCollector.o(233);
                                                                return;
                                                            }
                                                            try {
                                                                if (a.f46713f == null) {
                                                                    a.f46713f = new i(Long.valueOf(AnonymousClass5.this.f46722a), null);
                                                                }
                                                                if (a.f46712e.get() <= 0) {
                                                                    j.a(AnonymousClass5.this.f46723b, a.f46713f, a.f46714g);
                                                                    ae.a();
                                                                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(m.f48921g).edit();
                                                                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                                                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                                                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                                                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                                                    edit.apply();
                                                                    ae.a();
                                                                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(m.f48921g).edit();
                                                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                                                    edit2.apply();
                                                                    a.f46713f = null;
                                                                }
                                                                synchronized (a.f46711d) {
                                                                    try {
                                                                        a.f46710c = null;
                                                                    } finally {
                                                                        MethodCollector.o(233);
                                                                    }
                                                                }
                                                            } catch (Throwable th) {
                                                                com.facebook.internal.a.b.a.a(th, this);
                                                                MethodCollector.o(233);
                                                            }
                                                        }
                                                    };
                                                    synchronized (a.f46711d) {
                                                        try {
                                                            a.f46710c = a.f46709b.schedule(r5, (long) a.a(), TimeUnit.SECONDS);
                                                        } catch (Throwable th) {
                                                            MethodCollector.o(80);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                long j3 = a.f46715h;
                                                if (j3 > 0) {
                                                    j2 = (this.f46722a - j3) / 1000;
                                                } else {
                                                    j2 = 0;
                                                }
                                                String str = this.f46723b;
                                                ae.a();
                                                Context context = m.f48921g;
                                                ae.a();
                                                String str2 = m.f48915a;
                                                ae.a((Object) context, "context");
                                                q a2 = r.a(str2, false);
                                                if (a2 != null && a2.f48646g && j2 > 0) {
                                                    com.facebook.a.m mVar = new com.facebook.a.m(context);
                                                    new Bundle(1).putCharSequence("fb_aa_time_spent_view_name", str);
                                                    mVar.a((double) j2);
                                                }
                                                a.f46713f.c();
                                                MethodCollector.o(80);
                                            } catch (Throwable th2) {
                                                com.facebook.internal.a.b.a.a(th2, this);
                                                MethodCollector.o(80);
                                            }
                                        }

                                        {
                                            this.f46722a = r1;
                                            this.f46723b = r3;
                                        }
                                    });
                                }

                                public final void onActivityResumed(Activity activity) {
                                    d dVar;
                                    View a2;
                                    w.a(u.APP_EVENTS, a.f46708a, "onActivityResumed");
                                    a.f46717j = new WeakReference<>(activity);
                                    a.f46712e.incrementAndGet();
                                    a.b();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    a.f46715h = currentTimeMillis;
                                    String c2 = ad.c(activity);
                                    if (!com.facebook.internal.a.b.a.a(b.class)) {
                                        try {
                                            if (b.f46641d.get()) {
                                                c a3 = c.a();
                                                if (!com.facebook.internal.a.b.a.a(a3)) {
                                                    try {
                                                        if (!com.facebook.internal.u.a()) {
                                                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                                a3.f46652b.add(activity);
                                                                a3.f46654d.clear();
                                                                if (a3.f46655e.containsKey(Integer.valueOf(activity.hashCode()))) {
                                                                    a3.f46654d = a3.f46655e.get(Integer.valueOf(activity.hashCode()));
                                                                }
                                                                if (!com.facebook.internal.a.b.a.a(a3)) {
                                                                    try {
                                                                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                                            a3.b();
                                                                        } else {
                                                                            a3.f46651a.post(
                                                                            /*  JADX ERROR: Method code generation error
                                                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: INVOKE  
                                                                                  (wrap: android.os.Handler : 0x0095: IGET  (r1v18 android.os.Handler) = (r2v9 'a3' com.facebook.a.b.c) com.facebook.a.b.c.a android.os.Handler)
                                                                                  (wrap: com.facebook.a.b.c$1 : 0x0099: CONSTRUCTOR  (r0v61 com.facebook.a.b.c$1) = (r2v9 'a3' com.facebook.a.b.c) call: com.facebook.a.b.c.1.<init>(com.facebook.a.b.c):void type: CONSTRUCTOR)
                                                                                 type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.facebook.a.e.a.2.onActivityResumed(android.app.Activity):void, file: classes2.dex
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
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
                                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                                                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0099: CONSTRUCTOR  (r0v61 com.facebook.a.b.c$1) = (r2v9 'a3' com.facebook.a.b.c) call: com.facebook.a.b.c.1.<init>(com.facebook.a.b.c):void type: CONSTRUCTOR in method: com.facebook.a.e.a.2.onActivityResumed(android.app.Activity):void, file: classes2.dex
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                                                	... 64 more
                                                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.b.c, state: GENERATED_AND_UNLOADED
                                                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                                                	... 70 more
                                                                                */
                                                                            /*
                                                                            // Method dump skipped, instructions count: 453
                                                                            */
                                                                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.e.a.AnonymousClass2.onActivityResumed(android.app.Activity):void");
                                                                        }

                                                                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                                                                            w.a(u.APP_EVENTS, a.f46708a, "onActivitySaveInstanceState");
                                                                        }

                                                                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                                                                            w.a(u.APP_EVENTS, a.f46708a, "onActivityCreated");
                                                                            a.f46709b.execute(new Runnable() {
                                                                                /* class com.facebook.a.e.a.AnonymousClass3 */

                                                                                static {
                                                                                    Covode.recordClassIndex(28466);
                                                                                }

                                                                                public final void run() {
                                                                                    if (!com.facebook.internal.a.b.a.a(this)) {
                                                                                        try {
                                                                                            if (a.f46713f == null) {
                                                                                                ae.a();
                                                                                                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(m.f48921g);
                                                                                                long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
                                                                                                long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
                                                                                                i iVar = null;
                                                                                                iVar = null;
                                                                                                k kVar = null;
                                                                                                iVar = null;
                                                                                                String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                                                                                                if (!(j2 == 0 || j3 == 0)) {
                                                                                                    if (string != null) {
                                                                                                        i iVar2 = new i(Long.valueOf(j2), Long.valueOf(j3));
                                                                                                        iVar2.f46753c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                                                                                                        ae.a();
                                                                                                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(m.f48921g);
                                                                                                        if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                                                                                                            kVar = new k(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                                                                                                        }
                                                                                                        iVar2.f46755e = kVar;
                                                                                                        iVar2.f46754d = Long.valueOf(System.currentTimeMillis());
                                                                                                        iVar2.f46756f = UUID.fromString(string);
                                                                                                        iVar = iVar2;
                                                                                                    }
                                                                                                }
                                                                                                a.f46713f = iVar;
                                                                                            }
                                                                                        } catch (Throwable th) {
                                                                                            com.facebook.internal.a.b.a.a(th, this);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        }
