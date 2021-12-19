package com.bytedance.common.jato;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Process;
import android.util.ArrayMap;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.common.jato.b.a;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.boost.MemoryManager;
import com.bytedance.common.jato.boost.ThreadBoostManager;
import com.bytedance.common.jato.boost.b;
import com.bytedance.common.jato.boost.d;
import com.bytedance.common.jato.boost.e;
import com.bytedance.common.jato.boost.f;
import com.bytedance.common.jato.boost.g;
import com.bytedance.common.jato.boost.i;
import com.bytedance.common.jato.dex.a;
import com.bytedance.common.jato.fdio.FDIOCollector;
import com.bytedance.common.jato.fdio.FDIOPreloaderManager;
import com.bytedance.common.jato.gcblocker.GcBlocker;
import com.bytedance.common.jato.graphics.GraphicsMemShrink;
import com.bytedance.common.jato.scheduler.SchedulerNativeHolder;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class Jato {
    public static Context sContext;
    private static boolean sInitialized;
    private static ExecutorService sInnerExecutorService;
    private static boolean sIsDebug;
    private static b sListener;
    public static List<b> sListenerList;
    private static ExecutorService sWorkExecutorService;

    static {
        Covode.recordClassIndex(15782);
    }

    public static void promoteMainThreadPriority() {
    }

    public static void promoteMainThreadPriority(int i2) {
    }

    public static void tryBoostStorage(long j2) {
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static void enableClassVerify() {
        a.b();
    }

    public static Context getContext() {
        return sContext;
    }

    public static ExecutorService getWorkExecutorService() {
        return sWorkExecutorService;
    }

    public static boolean isDebug() {
        return sIsDebug;
    }

    public static void releaseBoost() {
        b.a();
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void resetRenderThread() {
        g.a();
    }

    public static void preloadCpusetInfo() {
        CpusetManager.init(getWorkExecutorService());
    }

    public static void shrinkVM() {
        shrinkVM(false, -1);
    }

    public static void disableClassVerify() {
        a.a(sContext);
        a.a();
    }

    public static void optimizeLaunchIO() {
        if (Build.VERSION.SDK_INT > 22) {
            com.bytedance.common.jato.fdio.a.a.a();
        }
    }

    public static void shrinkGraphics() {
        ExecutorService executorService = sWorkExecutorService;
        if (executorService != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(15787);
                }

                public final void run() {
                    GraphicsMemShrink.a(Jato.getContext());
                }
            });
        }
    }

    public static void stopOptimizeLaunchIO() {
        if (Build.VERSION.SDK_INT > 22) {
            com.bytedance.common.jato.fdio.a.a.a(false);
        }
    }

    public static synchronized b getListener() {
        b bVar;
        synchronized (Jato.class) {
            MethodCollector.i(8978);
            if (sListener == null) {
                sListener = new b() {
                    /* class com.bytedance.common.jato.Jato.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15785);
                    }

                    @Override // com.bytedance.common.jato.b
                    public final void a(String str) {
                        if (Jato.isDebug() && Jato.sListenerList != null) {
                            for (b bVar : Jato.sListenerList) {
                                if (bVar != null) {
                                    bVar.a(str);
                                }
                            }
                        }
                    }

                    @Override // com.bytedance.common.jato.b
                    public final void a(String str, Throwable th) {
                        if (Jato.sListenerList != null) {
                            for (b bVar : Jato.sListenerList) {
                                if (bVar != null) {
                                    bVar.a(str, th);
                                }
                            }
                        }
                    }
                };
            }
            bVar = sListener;
            MethodCollector.o(8978);
        }
        return bVar;
    }

    public static ExecutorService getInnerExecutorService() {
        MethodCollector.i(8976);
        if (sInnerExecutorService == null) {
            synchronized (Jato.class) {
                try {
                    if (sInnerExecutorService == null) {
                        sInnerExecutorService = com_bytedance_common_jato_Jato_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor(new ThreadFactory() {
                            /* class com.bytedance.common.jato.Jato.AnonymousClass10 */

                            static {
                                Covode.recordClassIndex(15784);
                            }

                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, "jato_inner_thread");
                            }
                        });
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8976);
                    throw th;
                }
            }
        }
        ExecutorService executorService = sInnerExecutorService;
        MethodCollector.o(8976);
        return executorService;
    }

    public static void resetPriority() {
        try {
            if (g.f26813c.get(-1) != null) {
                Process.setThreadPriority(0, g.f26813c.get(-1).intValue());
            }
        } catch (Throwable th) {
            getListener().a("error when reset priority", th);
        }
    }

    public static void stopOptimizeLaunchLock() {
        if (com.bytedance.common.jato.a.a.a.f26766d) {
            com.bytedance.common.jato.a.a.a.f26766d = false;
            if (getWorkExecutorService() != null) {
                getWorkExecutorService().execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE  
                      (wrap: java.util.concurrent.ExecutorService : 0x000d: INVOKE  (r1v1 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.Jato.getWorkExecutorService():java.util.concurrent.ExecutorService)
                      (wrap: com.bytedance.common.jato.a.a.a$1 : 0x0013: CONSTRUCTOR  (r0v4 com.bytedance.common.jato.a.a.a$1) =  call: com.bytedance.common.jato.a.a.a.1.<init>():void type: CONSTRUCTOR)
                     type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.Jato.stopOptimizeLaunchLock():void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r0v4 com.bytedance.common.jato.a.a.a$1) =  call: com.bytedance.common.jato.a.a.a.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.common.jato.Jato.stopOptimizeLaunchLock():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.a.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    boolean r0 = com.bytedance.common.jato.a.a.a.f26766d
                    if (r0 == 0) goto L_0x0026
                    r0 = 0
                    com.bytedance.common.jato.a.a.a.f26766d = r0
                    java.util.concurrent.ExecutorService r0 = getWorkExecutorService()
                    if (r0 == 0) goto L_0x001a
                    java.util.concurrent.ExecutorService r1 = getWorkExecutorService()
                    com.bytedance.common.jato.a.a.a$1 r0 = new com.bytedance.common.jato.a.a.a$1
                    r0.<init>()
                    r1.execute(r0)
                    return
                L_0x001a:
                    java.util.concurrent.ExecutorService r1 = getInnerExecutorService()
                    com.bytedance.common.jato.a.a.a$2 r0 = new com.bytedance.common.jato.a.a.a$2
                    r0.<init>()
                    r1.execute(r0)
                L_0x0026:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.Jato.stopOptimizeLaunchLock():void");
            }

            public static void preloadBoostInfo() {
                Context context = sContext;
                ExecutorService executorService = sWorkExecutorService;
                AnonymousClass5 r0 = new com.bytedance.common.jato.boost.a() {
                    /* class com.bytedance.common.jato.Jato.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(15788);
                    }

                    @Override // com.bytedance.common.jato.boost.a
                    public final void a(String str) {
                        Jato.getListener().a(str);
                    }

                    @Override // com.bytedance.common.jato.boost.a
                    public final void a(String str, Throwable th) {
                        Jato.getListener().a(str, th);
                    }
                };
                b.f26789b = executorService;
                b.f26790c = r0;
                String str = Build.HARDWARE;
                b.a("cpuboost hardware: " + Build.HARDWARE);
                e eVar = null;
                if (str.startsWith("qcom") || str.startsWith("msm") || str.startsWith("qsc") || str.startsWith("sdm")) {
                    b.a("cpuboost qcm boost");
                    eVar = new i();
                } else if (str.startsWith("mt")) {
                    b.a("cpuboost mtk boost");
                    eVar = new f();
                } else if (str.startsWith("kirin") || str.startsWith("hi")) {
                    b.a("cpuboost hisilicon boost");
                    eVar = new d();
                } else {
                    b.a("cpuboost not found boost for: " + Build.HARDWARE, null);
                }
                b.f26788a = eVar;
                if (eVar != null) {
                    b.f26788a.a(context);
                }
            }

            public static void tryCpuBoost(long j2) {
                b.a(j2);
            }

            public static void tryGpuBoost(long j2) {
                b.b(j2);
            }

            public static void bindBigCore(int i2) {
                CpusetManager.bindBigCore(i2);
            }

            public static void bindLittleCore(int i2) {
                CpusetManager.bindLittleCore(i2);
            }

            public static void resetCoreBind(int i2) {
                CpusetManager.resetCoreBind(i2);
            }

            public static void setPriority(int i2) {
                g.a(-1, i2);
            }

            public static void startFDIOCollect(String str) {
                startFDIOCollect(str, false);
            }

            public static boolean tryCpuBoostWithResult(long j2) {
                return b.a(j2);
            }

            public static boolean tryGpuBoostWithResult(long j2) {
                return b.b(j2);
            }

            public static void shrinkVM(int i2) {
                shrinkVM(false, i2);
            }

            public static void startBlockGc(ExecutorService executorService) {
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(15791);
                        }

                        public final void run() {
                            if (c.a()) {
                                GcBlocker.a();
                            }
                        }
                    });
                }
            }

            public static void stopBlockGc(ExecutorService executorService) {
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(15792);
                        }

                        public final void run() {
                            if (c.a()) {
                                GcBlocker.b();
                            }
                        }
                    });
                }
            }

            public static ExecutorService com_bytedance_common_jato_Jato_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor(ThreadFactory threadFactory) {
                l.a a2 = l.a(o.FIXED);
                a2.f79174c = 1;
                a2.f79178g = threadFactory;
                return com.ss.android.ugc.aweme.cw.g.a(a2.a());
            }

            public static void initScheduler(final int i2) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null && sContext != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15783);
                        }

                        public final void run() {
                            MethodCollector.i(10035);
                            com.bytedance.common.jato.scheduler.a a2 = com.bytedance.common.jato.scheduler.a.a();
                            Context context = Jato.sContext;
                            int i2 = i2;
                            if (a2.f26879a.compareAndSet(false, true) && Build.VERSION.SDK_INT > 22 && SchedulerNativeHolder.a()) {
                                int i3 = context.getApplicationInfo().targetSdkVersion;
                                ByteHook.a();
                                if (com.bytedance.common.jato.b.b.a()) {
                                    i2 |= 1024;
                                }
                                SchedulerNativeHolder.nativeInit(i3, i2, context);
                                ThreadBoostManager.delayMaskMemoryInfo();
                            }
                            MethodCollector.o(10035);
                        }
                    });
                }
            }

            public static void shrinkVM(boolean z) {
                shrinkVM(z, -1);
            }

            public static void resetPriority(int i2) {
                try {
                    if (g.f26813c.get(Integer.valueOf(i2)) != null) {
                        Process.setThreadPriority(i2, g.f26813c.get(Integer.valueOf(i2)).intValue());
                    }
                } catch (Throwable th) {
                    getListener().a("error when reset priority", th);
                }
            }

            public static void setPriority(int i2, int i3) {
                g.a(i2, i3);
            }

            public static void boostRenderThread(Application application, ExecutorService executorService) {
                boostRenderThread(application, -20, executorService);
            }

            public static void endFDIOOperator(String str, boolean z) {
                com.bytedance.common.jato.fdio.b andRemove = FDIOPreloaderManager.getAndRemove(str);
                if (andRemove != null) {
                    andRemove.a(z);
                }
            }

            public static void requestBlockGc(Context context, final long j2) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(15790);
                        }

                        public final void run() {
                            MethodCollector.i(11141);
                            if (!c.a()) {
                                MethodCollector.o(11141);
                                return;
                            }
                            long j2 = j2;
                            if (GcBlocker.c() && !GcBlocker.d() && j2 > 0 && j2 <= 5000) {
                                GcBlocker.nativeRequestBlockGc(j2);
                            }
                            MethodCollector.o(11141);
                        }
                    });
                }
            }

            public static void startFDIOCollect(String str, boolean z) {
                FDIOCollector collector = FDIOPreloaderManager.getCollector(str);
                if (collector != null) {
                    collector.a(str, false);
                    collector.f26847a = z;
                }
            }

            public static void startFDIOPreload(String str, boolean z) {
                com.bytedance.common.jato.fdio.b preloader = FDIOPreloaderManager.getPreloader(str);
                if (preloader != null) {
                    preloader.a(str, z);
                }
            }

            public static void shrinkVM(final boolean z, final int i2) {
                ExecutorService executorService = sWorkExecutorService;
                if (executorService != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(15786);
                        }

                        public final void run() {
                            Shrinker.getInstance().doShrink(z, i2);
                        }
                    });
                }
            }

            public static void boostRenderThread(Application application, int i2, ExecutorService executorService) {
                if (executorService != null && application != null) {
                    g.a(application, executorService, i2);
                }
            }

            public static void pagePreFault(final int i2, final boolean z, final boolean z2) {
                ExecutorService executorService;
                final int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29 && i3 < 31 && (executorService = sWorkExecutorService) != null) {
                    executorService.execute(new Runnable() {
                        /* class com.bytedance.common.jato.Jato.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(15789);
                        }

                        public final void run() {
                            MethodCollector.i(12388);
                            String str = null;
                            try {
                                str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.board.platform");
                            } catch (Exception unused) {
                            }
                            if (str != null) {
                                String lowerCase = str.toLowerCase();
                                if (lowerCase.startsWith("kirin9") || lowerCase.startsWith("msm8") || lowerCase.startsWith("sdm8") || lowerCase.startsWith("sm8")) {
                                    MethodCollector.o(12388);
                                    return;
                                }
                            }
                            int i2 = i3;
                            int i3 = i2;
                            boolean z = z;
                            boolean z2 = z2;
                            if (c.a()) {
                                ByteHook.a();
                                MemoryManager.nativePagePreFault(i2, i3, z, z2);
                            }
                            MethodCollector.o(12388);
                        }
                    });
                }
            }

            public static void optimizeLaunchLock(Application application, boolean z, boolean z2) {
                try {
                    com.bytedance.common.jato.a.a.a.f26768f = true;
                    com.bytedance.common.jato.a.a.a.f26769g = z;
                    com.bytedance.common.jato.a.a.a.f26770h = z2;
                    com.bytedance.common.jato.a.a.a.f26767e = application;
                    int i2 = Build.VERSION.SDK_INT;
                    try {
                        Class<?> cls = Class.forName("android.app.ContextImpl");
                        if (Build.VERSION.SDK_INT <= 23) {
                            Field declaredField = cls.getDeclaredField("sSharedPrefs");
                            declaredField.setAccessible(true);
                            ArrayMap arrayMap = (ArrayMap) declaredField.get(null);
                            if (arrayMap != null) {
                                com.bytedance.common.jato.a.a.a.f26763a = (ArrayMap) arrayMap.get(com.bytedance.common.jato.a.a.a.f26767e.getPackageName());
                            }
                            if (com.bytedance.common.jato.a.a.a.f26763a == null) {
                                com.ss.android.ugc.aweme.bf.d.a(com.bytedance.common.jato.a.a.a.f26767e, "jato_preload_sp", 0);
                                ArrayMap arrayMap2 = (ArrayMap) declaredField.get(null);
                                if (arrayMap2 != null) {
                                    com.bytedance.common.jato.a.a.a.f26763a = (ArrayMap) arrayMap2.get(com.bytedance.common.jato.a.a.a.f26767e.getPackageName());
                                }
                            }
                        } else {
                            Field declaredField2 = cls.getDeclaredField("sSharedPrefsCache");
                            declaredField2.setAccessible(true);
                            ArrayMap arrayMap3 = (ArrayMap) declaredField2.get(null);
                            if (arrayMap3 != null) {
                                com.bytedance.common.jato.a.a.a.f26764b = (ArrayMap) arrayMap3.get(com.bytedance.common.jato.a.a.a.f26767e.getPackageName());
                            }
                            if (com.bytedance.common.jato.a.a.a.f26764b == null) {
                                com.ss.android.ugc.aweme.bf.d.a(com.bytedance.common.jato.a.a.a.f26767e, "jato_preload_sp", 0);
                                ArrayMap arrayMap4 = (ArrayMap) declaredField2.get(null);
                                if (arrayMap4 != null) {
                                    com.bytedance.common.jato.a.a.a.f26764b = (ArrayMap) arrayMap4.get(com.bytedance.common.jato.a.a.a.f26767e.getPackageName());
                                }
                            }
                            Application application2 = com.bytedance.common.jato.a.a.a.f26767e;
                            Field declaredField3 = ContextWrapper.class.getDeclaredField("mBase");
                            declaredField3.setAccessible(true);
                            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, "mSharedPrefsPaths");
                            field.setAccessible(true);
                            com.bytedance.common.jato.a.a.a.f26765c = (ArrayMap) field.get((Context) declaredField3.get(application2));
                        }
                    } catch (ClassNotFoundException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchFieldException e3) {
                        e3.printStackTrace();
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (NoSuchMethodException e5) {
                        e5.printStackTrace();
                    } catch (InvocationTargetException e6) {
                        e6.printStackTrace();
                    }
                    com.bytedance.common.jato.a.a.a.a();
                } catch (Throwable unused) {
                }
            }

            public static synchronized void init(Context context, boolean z, b bVar, ExecutorService executorService) {
                synchronized (Jato.class) {
                    MethodCollector.i(9613);
                    init(context, z, bVar, executorService, null);
                    MethodCollector.o(9613);
                }
            }

            public static synchronized void init(Context context, boolean z, b bVar, ExecutorService executorService, a aVar) {
                synchronized (Jato.class) {
                    MethodCollector.i(9783);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (sListenerList == null) {
                        sListenerList = new LinkedList();
                    }
                    sListenerList.add(bVar);
                    if (sInitialized) {
                        MethodCollector.o(9783);
                        return;
                    }
                    sIsDebug = z;
                    sWorkExecutorService = executorService;
                    sInitialized = true;
                    sContext = context;
                    if (context instanceof Application) {
                        com.bytedance.common.jato.b.a aVar2 = a.C0575a.f26784a;
                        Application application = (Application) context;
                        application.unregisterActivityLifecycleCallbacks(aVar2);
                        application.registerActivityLifecycleCallbacks(aVar2);
                    }
                    if (aVar != null) {
                        d.a(context, aVar);
                        d.f26839b.execute(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004e: INVOKE  
                              (wrap: java.util.concurrent.ExecutorService : 0x0047: SGET  (r1v0 java.util.concurrent.ExecutorService) =  com.bytedance.common.jato.d.b java.util.concurrent.ExecutorService)
                              (wrap: com.bytedance.common.jato.d$3 : 0x004b: CONSTRUCTOR  (r0v6 com.bytedance.common.jato.d$3) = 
                              (wrap: long : 0x0046: ARITH  (r2v1 long) = (wrap: long : 0x0042: INVOKE  (r2v0 long) =  type: STATIC call: java.lang.System.currentTimeMillis():long) - (r4v0 'currentTimeMillis' long))
                             call: com.bytedance.common.jato.d.3.<init>(long):void type: CONSTRUCTOR)
                             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.Jato.init(android.content.Context, boolean, com.bytedance.common.jato.b, java.util.concurrent.ExecutorService, com.bytedance.common.jato.a):void, file: classes.dex
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
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: CONSTRUCTOR  (r0v6 com.bytedance.common.jato.d$3) = 
                              (wrap: long : 0x0046: ARITH  (r2v1 long) = (wrap: long : 0x0042: INVOKE  (r2v0 long) =  type: STATIC call: java.lang.System.currentTimeMillis():long) - (r4v0 'currentTimeMillis' long))
                             call: com.bytedance.common.jato.d.3.<init>(long):void type: CONSTRUCTOR in method: com.bytedance.common.jato.Jato.init(android.content.Context, boolean, com.bytedance.common.jato.b, java.util.concurrent.ExecutorService, com.bytedance.common.jato.a):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 30 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.d, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 36 more
                            */
                        /*
                            java.lang.Class<com.bytedance.common.jato.Jato> r7 = com.bytedance.common.jato.Jato.class
                            monitor-enter(r7)
                            r6 = 9783(0x2637, float:1.3709E-41)
                            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)     // Catch:{ all -> 0x0056 }
                            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0056 }
                            java.util.List<com.bytedance.common.jato.b> r0 = com.bytedance.common.jato.Jato.sListenerList     // Catch:{ all -> 0x0056 }
                            if (r0 != 0) goto L_0x0017
                            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0056 }
                            r0.<init>()     // Catch:{ all -> 0x0056 }
                            com.bytedance.common.jato.Jato.sListenerList = r0     // Catch:{ all -> 0x0056 }
                        L_0x0017:
                            java.util.List<com.bytedance.common.jato.b> r0 = com.bytedance.common.jato.Jato.sListenerList     // Catch:{ all -> 0x0056 }
                            r0.add(r10)     // Catch:{ all -> 0x0056 }
                            boolean r0 = com.bytedance.common.jato.Jato.sInitialized     // Catch:{ all -> 0x0056 }
                            if (r0 == 0) goto L_0x0025
                            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)     // Catch:{ all -> 0x0056 }
                            monitor-exit(r7)
                            return
                        L_0x0025:
                            com.bytedance.common.jato.Jato.sIsDebug = r9
                            com.bytedance.common.jato.Jato.sWorkExecutorService = r11
                            r0 = 1
                            com.bytedance.common.jato.Jato.sInitialized = r0
                            com.bytedance.common.jato.Jato.sContext = r8
                            boolean r0 = r8 instanceof android.app.Application
                            if (r0 == 0) goto L_0x003d
                            com.bytedance.common.jato.b.a r1 = com.bytedance.common.jato.b.a.C0575a.f26784a
                            r0 = r8
                            android.app.Application r0 = (android.app.Application) r0
                            r0.unregisterActivityLifecycleCallbacks(r1)
                            r0.registerActivityLifecycleCallbacks(r1)
                        L_0x003d:
                            if (r12 == 0) goto L_0x0051
                            com.bytedance.common.jato.d.a(r8, r12)
                            long r2 = java.lang.System.currentTimeMillis()
                            long r2 = r2 - r4
                            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.d.f26839b
                            com.bytedance.common.jato.d$3 r0 = new com.bytedance.common.jato.d$3
                            r0.<init>(r2)
                            r1.execute(r0)
                        L_0x0051:
                            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
                            monitor-exit(r7)
                            return
                        L_0x0056:
                            r0 = move-exception
                            monitor-exit(r7)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.Jato.init(android.content.Context, boolean, com.bytedance.common.jato.b, java.util.concurrent.ExecutorService, com.bytedance.common.jato.a):void");
                    }
                }
