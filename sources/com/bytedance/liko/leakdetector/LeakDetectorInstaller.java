package com.bytedance.liko.leakdetector;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.e;

public final class LeakDetectorInstaller {
    public static final LeakDetectorInstaller INSTANCE = new LeakDetectorInstaller();
    private static Handler handler;
    private static boolean hasExcuteBackgroud;
    private static int retryCount;
    private static long trySumTime;

    private LeakDetectorInstaller() {
    }

    public final Handler getHandler() {
        return handler;
    }

    public final boolean getHasExcuteBackgroud() {
        return hasExcuteBackgroud;
    }

    public final int getRetryCount() {
        return retryCount;
    }

    public final long getTrySumTime() {
        return trySumTime;
    }

    static {
        Covode.recordClassIndex(24703);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f40089a;

        static {
            Covode.recordClassIndex(24705);
        }

        b(Context context) {
            this.f40089a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            final int optInt = com.bytedance.liko.b.d.f40079f.optInt("strategy", 0);
            if (optInt > 0) {
                com.bytedance.liko.b.d.f40079f.put("url", "https://api-va.tiktokv.com/");
                MemoryConfig.initJsonConfig(com.bytedance.liko.b.d.f40079f.toString());
                Handler handler = LeakDetectorInstaller.INSTANCE.getHandler();
                if (handler != null) {
                    handler.post(new Runnable(this) {
                        /* class com.bytedance.liko.leakdetector.LeakDetectorInstaller.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f40090a;

                        static {
                            Covode.recordClassIndex(24706);
                        }

                        {
                            this.f40090a = r1;
                        }

                        public final void run() {
                            LeakDetectorInstaller.INSTANCE.install(this.f40090a.f40089a, optInt);
                        }
                    });
                }
                LeakDetectorInstaller.INSTANCE.setTrySumTime(0);
                return z.f158842a;
            } else if (optInt == 0) {
                LeakDetectorInstaller leakDetectorInstaller = LeakDetectorInstaller.INSTANCE;
                leakDetectorInstaller.setTrySumTime(leakDetectorInstaller.getTrySumTime() + 10000);
                l.c("Leak detector strategy < 1,retry", "");
                Handler handler2 = LeakDetectorInstaller.INSTANCE.getHandler();
                if (handler2 != null) {
                    return Boolean.valueOf(handler2.sendEmptyMessageDelayed(0, 10000));
                }
                return null;
            } else {
                l.c("Leak detector strategy < 0, finish", "");
                return z.f158842a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f40087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f40088b;

        static {
            Covode.recordClassIndex(24704);
        }

        a(int i2, Context context) {
            this.f40087a = i2;
            this.f40088b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            Context context;
            SharedPreferences a2;
            String string;
            String str;
            Context context2;
            SharedPreferences a3;
            String string2;
            if (!((this.f40087a & 2) == 0 || (context2 = this.f40088b) == null || (a3 = com.ss.android.ugc.aweme.bf.d.a(context2, "LeakDetectorSp", 0)) == null || (string2 = a3.getString("ld_oom_dump_file", null)) == null)) {
                if ((this.f40087a & 16) != 0) {
                    l.c("OOM UploadHprof right now:".concat(String.valueOf(string2)), "");
                    new com.bytedance.liko.leakdetector.strategy.a.a().a(this.f40088b, string2);
                    com.bytedance.liko.leakdetector.a.c.b(this.f40088b, null);
                } else if (com.bytedance.liko.leakdetector.a.b.a() < 0.4f) {
                    l.c("OOM anlaysis right now:".concat(String.valueOf(string2)), "");
                    LeakDetectorInstaller.INSTANCE.runAnalysis(string2);
                    com.bytedance.liko.leakdetector.a.c.b(this.f40088b, null);
                }
            }
            if (!((this.f40087a & 4) == 0 || (str = MemoryConfig.getMemoryConfig().dumpFilePath) == null)) {
                if ((this.f40087a & 16) != 0) {
                    l.c("direct UploadHprof right now:".concat(String.valueOf(str)), "");
                    new com.bytedance.liko.leakdetector.strategy.a.a().a(this.f40088b, str);
                } else if (com.bytedance.liko.leakdetector.a.b.a() > 0.4f) {
                    l.c("direct anlaysis right now:".concat(String.valueOf(str)), "");
                    LeakDetectorInstaller.INSTANCE.runAnalysis(str);
                }
            }
            if (!((this.f40087a & 8) == 0 || (context = this.f40088b) == null || (a2 = com.ss.android.ugc.aweme.bf.d.a(context, "LeakDetectorSp", 0)) == null || (string = a2.getString("ld_memory_peak_dump_file", null)) == null)) {
                if ((this.f40087a & 16) != 0) {
                    l.c("MemoryPeak UploadHprof right now:".concat(String.valueOf(string)), "");
                    new com.bytedance.liko.leakdetector.strategy.a.a().a(this.f40088b, string);
                    com.bytedance.liko.leakdetector.a.c.a(this.f40088b, null);
                } else if (com.bytedance.liko.leakdetector.a.b.a() > 0.4f) {
                    l.c("MemoryPeak anlaysis right now:".concat(String.valueOf(string)), "");
                    LeakDetectorInstaller.INSTANCE.runAnalysis(string);
                    com.bytedance.liko.leakdetector.a.c.a(this.f40088b, null);
                }
            }
            return z.f158842a;
        }
    }

    public final void setHandler(Handler handler2) {
        handler = handler2;
    }

    public final void setHasExcuteBackgroud(boolean z) {
        hasExcuteBackgroud = z;
    }

    public final void setRetryCount(int i2) {
        retryCount = i2;
    }

    public final void setTrySumTime(long j2) {
        trySumTime = j2;
    }

    public static final class e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f40095a;

        static {
            Covode.recordClassIndex(24709);
        }

        public final void handleMessage(Message message) {
            LeakDetectorInstaller.INSTANCE.tryInstall(this.f40095a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, Looper looper) {
            super(looper);
            this.f40095a = context;
        }
    }

    public static Context com_bytedance_liko_leakdetector_LeakDetectorInstaller_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void initConfig(Context context) {
        i.a((Callable) new b(context));
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f40092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40093b;

        static {
            Covode.recordClassIndex(24707);
        }

        c(Context context, int i2) {
            this.f40092a = context;
            this.f40093b = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            if (bool.booleanValue() && !LeakDetectorInstaller.INSTANCE.getHasExcuteBackgroud()) {
                l.c("excuteStrategy runInbackground", "");
                LeakDetectorInstaller.INSTANCE.setHasExcuteBackgroud(true);
                LeakDetectorInstaller.INSTANCE.excuteStrategy(this.f40092a, this.f40093b);
            }
        }
    }

    public static final class d extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f40094a;

        static {
            Covode.recordClassIndex(24708);
        }

        public final void handleMessage(Message message) {
            if (LeakDetectorInstaller.INSTANCE.getTrySumTime() > 100000) {
                LeakDetectorInstaller.INSTANCE.setTrySumTime(0);
                l.c("Leak detector install timeout", "");
                return;
            }
            LeakDetectorInstaller.INSTANCE.initConfig(this.f40094a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, Looper looper) {
            super(looper);
            this.f40094a = context;
        }
    }

    public static boolean com_bytedance_liko_leakdetector_LeakDetectorInstaller_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(5339);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.b(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(5339);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5339);
        return delete;
    }

    public final synchronized void runAnalysis(String str) {
        MethodCollector.i(5332);
        l.c(str, "");
        com.bytedance.liko.leakdetector.strategy.a.f40110f = true;
        l.c("start Analysis:hprof path:".concat(String.valueOf(str)), "");
        try {
            new AnalyzerEngine().runAnalysis(new File(str), MemoryConfig.getMemoryConfig());
        } catch (Throwable th) {
            com_bytedance_liko_leakdetector_LeakDetectorInstaller_com_ss_android_ugc_aweme_storage_FileLancet_delete(new File(str));
            l.c("runAnalysis fail! delete file " + th.toString(), "");
        }
        com.bytedance.liko.leakdetector.strategy.a.f40110f = false;
        l.c("end Analysis", "");
        MethodCollector.o(5332);
    }

    public final void tryInstall(Context context) {
        if ("local_test".equals(com.bytedance.ies.ugc.appcontext.d.j())) {
            boolean z = true;
            try {
                com.bytedance.liko.b.d.f40074a = true;
                l.c("Leak detector start install", "");
                if (context == null) {
                    Boolean.valueOf(true);
                } else {
                    SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, "LeakDetectorSp", 0);
                    if (a2 != null) {
                        z = a2.getBoolean("open_leak_detector_on_local_test", true);
                    }
                }
                com.bytedance.liko.b.d.f40074a = z;
                if (!z) {
                    l.c("Leak detector is disabled", "");
                    return;
                }
            } catch (Throwable th) {
                l.c("SPHelper crash!\n".concat(String.valueOf(th)), "");
                int i2 = retryCount;
                retryCount = i2 + 1;
                if (i2 <= 0) {
                    new e(context, Looper.getMainLooper()).sendEmptyMessageDelayed(0, 10000);
                    l.c("retry install in 10s", "");
                    return;
                }
                return;
            }
        }
        d dVar = new d(context, Looper.getMainLooper());
        handler = dVar;
        dVar.sendEmptyMessageDelayed(0, 10000);
    }

    public final void excuteStrategy(Context context, int i2) {
        l.c(context, "");
        i.a((Callable) new a(i2, context));
    }

    public final void runInbackground(Context context, int i2) {
        l.c(context, "");
        if (com.bytedance.ies.ugc.appcontext.d.g() > 0) {
            com.bytedance.ies.ugc.appcontext.f.g().d(new c(context, i2));
        } else {
            excuteStrategy(context, i2);
        }
    }

    public final void setLeakCanaryConfig(boolean z, int i2) {
        leakcanary.e.a(e.a.a(leakcanary.e.f159369a, false, z, i2, false, 0, false, false, 121));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[Catch:{ all -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec A[Catch:{ all -> 0x0160 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void install(android.content.Context r13, int r14) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.LeakDetectorInstaller.install(android.content.Context, int):void");
    }
}
