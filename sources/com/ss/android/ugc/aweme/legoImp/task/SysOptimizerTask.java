package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.j.i;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.ArtOptimizer;
import com.bytedance.sysoptimizer.DvmDeadLockOptimizer;
import com.bytedance.sysoptimizer.DvmGlesOptimizer;
import com.bytedance.sysoptimizer.DvmOptimizer;
import com.bytedance.sysoptimizer.HighLevelTrimMemory;
import com.bytedance.sysoptimizer.JitCompileMethodCrash;
import com.bytedance.sysoptimizer.KGetCookieOptimizer;
import com.bytedance.sysoptimizer.MaliGpuExtIsSupportOptimizer;
import com.bytedance.sysoptimizer.MaliMemOptimizer;
import com.bytedance.sysoptimizer.NougatJitCompileOptimizer;
import com.bytedance.sysoptimizer.ONativeCryptoCRLOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.RedmiTypeFaceOptimizer;
import com.bytedance.sysoptimizer.SmEditTextLeakOpt;
import com.bytedance.sysoptimizer.StackLeakChecker;
import com.bytedance.sysoptimizer.StackLeakItem;
import com.bytedance.sysoptimizer.StageFrightAndroid4Optimizer;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.bytedance.sysoptimizer.VMDebugDumpHprofOptimizer;
import com.bytedance.sysoptimizer.fake.name.SmFakeNameHandler;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import com.bytedance.sysoptimizer.java.IAutofillManagerProtector;
import com.bytedance.sysoptimizer.java.IConnectivityManagerProtector;
import com.bytedance.sysoptimizer.java.OppoNAlarmProtector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.ss.android.ugc.aweme.experiment.gw;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SysOptimizerTask implements com.ss.android.ugc.aweme.lego.a, w {

    /* renamed from: a  reason: collision with root package name */
    public Long f107894a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f107895b;

    public static class a {
        @com.google.gson.a.c(a = "disable_oatfile_dump")

        /* renamed from: a  reason: collision with root package name */
        public boolean f107905a = true;

        static {
            Covode.recordClassIndex(69159);
        }
    }

    public static class b {
        @com.google.gson.a.c(a = "optimize_sub_proc")

        /* renamed from: a  reason: collision with root package name */
        public boolean f107906a;
        @com.google.gson.a.c(a = "optimizer_enable")

        /* renamed from: b  reason: collision with root package name */
        public boolean f107907b;

        static {
            Covode.recordClassIndex(69160);
        }
    }

    public static class c {
        @com.google.gson.a.c(a = "enable_optimizer")

        /* renamed from: a  reason: collision with root package name */
        public boolean f107908a;
        @com.google.gson.a.c(a = "always_catch_sigsegv")

        /* renamed from: b  reason: collision with root package name */
        public boolean f107909b;
        @com.google.gson.a.c(a = "target_devices")

        /* renamed from: c  reason: collision with root package name */
        public String[] f107910c;

        static {
            Covode.recordClassIndex(69161);
        }
    }

    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107911a = null;

        public static class a {
            @com.google.gson.a.c(a = "resourceIds")

            /* renamed from: a  reason: collision with root package name */
            public List<Integer> f107912a;
            @com.google.gson.a.c(a = "returnId")

            /* renamed from: b  reason: collision with root package name */
            public int f107913b;
            @com.google.gson.a.c(a = "protectClassName")

            /* renamed from: c  reason: collision with root package name */
            public String f107914c;
            @com.google.gson.a.c(a = "protectMethodName")

            /* renamed from: d  reason: collision with root package name */
            public String f107915d;
            @com.google.gson.a.c(a = "apiLevels")

            /* renamed from: e  reason: collision with root package name */
            public List<Integer> f107916e;
            @com.google.gson.a.c(a = "models")

            /* renamed from: f  reason: collision with root package name */
            public List<String> f107917f;
            @com.google.gson.a.c(a = "maxStep")

            /* renamed from: g  reason: collision with root package name */
            public int f107918g;

            static {
                Covode.recordClassIndex(69163);
            }
        }

        public static class b {
            @com.google.gson.a.c(a = "configs")

            /* renamed from: a  reason: collision with root package name */
            public List<a> f107919a;

            static {
                Covode.recordClassIndex(69164);
            }
        }

        static {
            Covode.recordClassIndex(69162);
        }
    }

    public static class e {
        @com.google.gson.a.c(a = "enable_checker")

        /* renamed from: a  reason: collision with root package name */
        public boolean f107920a;
        @com.google.gson.a.c(a = "report_threshold")

        /* renamed from: b  reason: collision with root package name */
        public int f107921b = 100;
        @com.google.gson.a.c(a = "check_interval_mins")

        /* renamed from: c  reason: collision with root package name */
        public int f107922c = 100;
        @com.google.gson.a.c(a = "auto_fix_allowlist")

        /* renamed from: d  reason: collision with root package name */
        public String f107923d;

        static {
            Covode.recordClassIndex(69165);
        }
    }

    public static class f {
        @com.google.gson.a.c(a = "shrink_enable")

        /* renamed from: a  reason: collision with root package name */
        public boolean f107924a;

        static {
            Covode.recordClassIndex(69166);
        }
    }

    static {
        Covode.recordClassIndex(69148);
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    class SysOptCheckSoLoadResult implements w {
        static {
            Covode.recordClassIndex(69150);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.n();
        }

        SysOptCheckSoLoadResult() {
        }
    }

    class SysOptDisableDumpOatFileForANR implements w {
        static {
            Covode.recordClassIndex(69151);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.p(context);
        }

        SysOptDisableDumpOatFileForANR() {
        }
    }

    class SysOptDvmOptimizer implements w {
        static {
            Covode.recordClassIndex(69152);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        SysOptDvmOptimizer() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.this.f107894a = Long.valueOf(System.currentTimeMillis());
            DvmOptimizer.optDvmLinearAllocBuffer(context);
        }
    }

    class SysOptEnableStackLeakChecker implements w {
        static {
            Covode.recordClassIndex(69153);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.q(context);
        }

        SysOptEnableStackLeakChecker() {
        }
    }

    class SysOptFixSamSungGetNameCrash implements w {
        static {
            Covode.recordClassIndex(69154);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.c(context);
        }

        SysOptFixSamSungGetNameCrash() {
        }
    }

    class SysOptHookOptimizerEnable implements w {
        static {
            Covode.recordClassIndex(69155);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        SysOptHookOptimizerEnable() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (Build.VERSION.SDK_INT == 24) {
                HighLevelTrimMemory.optimize(context);
            }
            DvmDeadLockOptimizer.optimize(context);
            if (com.ss.android.common.util.f.a(context)) {
                SysOptimizerTask.n(context);
            }
            SysOptimizerTask.d(context);
            SysOptimizerTask.b(context);
            SysOptimizerTask.h(context);
            SysOptimizerTask.i(context);
            SysOptimizerTask.l();
            SysOptimizerTask.m();
            SysOptimizerTask.j(context);
            SysOptimizerTask.e(context);
            SysOptimizerTask.f(context);
            SysOptimizerTask.g(context);
            SysOptimizerTask.k(context);
            SysOptimizerTask.l(context);
            DvmGlesOptimizer.fix(context);
            SysOptimizer.hookOptimizerEnable();
            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
            if (SysOptimizerTask.this.f107895b.booleanValue()) {
                valueOf2.longValue();
                valueOf.longValue();
                valueOf2.longValue();
                SysOptimizerTask.this.f107894a.longValue();
            }
        }
    }

    class SysOptMaliSwapBufferError implements w {
        static {
            Covode.recordClassIndex(69156);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.m(context);
        }

        SysOptMaliSwapBufferError() {
        }
    }

    class SysOptOptimizeShrinker implements w {
        static {
            Covode.recordClassIndex(69157);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            SysOptimizerTask.o();
        }

        SysOptOptimizeShrinker() {
        }
    }

    class SysOptOptimizeSuspendTimeout implements w {
        static {
            Covode.recordClassIndex(69158);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        SysOptOptimizeSuspendTimeout() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            if (com.bytedance.ies.abmock.b.a().a(true, "suspendtimeout_opt", true)) {
                SysOptimizerTask.o(context);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return new String[]{"ABTask"};
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static void l() {
        if (SettingsManager.a().a("type_face_opt_switch", true)) {
            TypeFaceOptimizer.start();
        }
    }

    public static void n() {
        int size = SysOptimizer.getLoadLibraryError().size();
        if (size > 0) {
            int i2 = 0;
            do {
                a(SysOptimizer.getLoadLibraryError().get(i2), "load_so_exception", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "SysOptimizerTask Thread");
                i2++;
            } while (i2 < size);
        }
    }

    public static void o() {
        try {
            f fVar = (f) SettingsManager.a().a("shrink_settings", f.class);
            if (fVar != null && fVar.f107924a) {
                Shrinker.getInstance().doShrink(SettingsManager.a().a("shrink_threshold", 512));
            }
            int a2 = com.bytedance.ies.abmock.b.a().a("vmshrink_high_exp", ClientExpManager.vmshrink_high_exp());
            if (a2 == 0) {
                Shrinker.getInstance().doShrinkRegion(0);
            } else if (a2 == 1) {
                Shrinker.getInstance().doShrinkRegion(256);
            } else if (a2 == 2) {
                Shrinker.getInstance().doShrinkRegion(384);
            }
        } catch (Throwable unused) {
        }
    }

    public static void m() {
        List<d.a> list;
        List<Integer> list2;
        d.b bVar = (d.b) SettingsManager.a().a("fix_resource_not_found", d.b.class, d.f107911a);
        if (!(bVar == null || (list = bVar.f107919a) == null || list.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            for (d.a aVar : list) {
                if (!(aVar == null || (list2 = aVar.f107912a) == null || list2.isEmpty())) {
                    sb.append("rescue ");
                    for (Integer num : list2) {
                        int intValue = num.intValue();
                        ResourcesProtector.registerConfig(new ResourcesProtector.Builder().maxStep(aVar.f107918g).protectClassName(aVar.f107914c).protectMethodName(aVar.f107915d).returnId(aVar.f107913b).resId(intValue).protectApis(a(aVar.f107916e)).protectModels(b(aVar.f107917f)).build());
                        sb.append("resourceId = ").append(intValue).append(",").append(aVar.f107914c).append(".").append(aVar.f107915d).append("\n");
                    }
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append("\n");
                }
            }
            sb.delete(sb.length() - 1, sb.length());
        }
    }

    private static Context r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static void b(Context context) {
        if (SettingsManager.a().a("hprof_dump_data_opt", true)) {
            VMDebugDumpHprofOptimizer.fix(context);
        }
    }

    public static void c(Context context) {
        if (SettingsManager.a().a("fix_samsung_field_get_name_crash", true)) {
            SmFakeNameHandler.start(context);
        }
    }

    public static void d(Context context) {
        if (SettingsManager.a().a("fix_jit_comile_method_crash", true)) {
            JitCompileMethodCrash.optimize(context);
        }
    }

    public static void e(Context context) {
        if (SettingsManager.a().a("ul_native_crypto_opt", false)) {
            ONativeCryptoCRLOptimizer.fix(context);
        }
    }

    public static void f(Context context) {
        if (SettingsManager.a().a("ul_mali_gpu_format_opt", false)) {
            MaliGpuExtIsSupportOptimizer.fix(context);
        }
    }

    public static void g(Context context) {
        if (SettingsManager.a().a("ul_kitkat_get_cookie_opt", false)) {
            KGetCookieOptimizer.fix(context);
        }
    }

    public static void h(Context context) {
        if (SettingsManager.a().a("fix_jit_compile_crash_on_n", false)) {
            NougatJitCompileOptimizer.fix(context);
        }
    }

    public static void i(Context context) {
        if (SettingsManager.a().a("fix_package_not_belong", false)) {
            BinderServiceWrapperProtector.setDebug(false);
            IConnectivityManagerProtector.install(context);
            IAutofillManagerProtector.install(context);
            OppoNAlarmProtector.install(context);
        }
    }

    public static void j(Context context) {
        if (SettingsManager.a().a("register_broadcast_protector", true) && (r(context) instanceof Application)) {
            ReceiverRegisterCrashOptimizer.fix((Application) r(context));
        }
    }

    public static void k(Context context) {
        if (SettingsManager.a().a("red_mi_typeface_fix", false)) {
            RedmiTypeFaceOptimizer.fixOnAndroidQ(context);
        }
    }

    public static void p(Context context) {
        try {
            a aVar = (a) SettingsManager.a().a("art_oatfile_dump_settings", a.class);
            if (aVar == null) {
                ArtOptimizer.disableDumpOatFileForANR(context);
            } else if (aVar.f107905a) {
                ArtOptimizer.disableDumpOatFileForANR(context);
            }
        } catch (Throwable unused) {
        }
    }

    private static String[] b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String[] strArr = new String[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = list.get(i2);
        }
        return strArr;
    }

    public static void l(Context context) {
        if (SettingsManager.a().a("stage_fright_fix", false)) {
            StageFrightAndroid4Optimizer.fixStageFrightAndroid4(context);
        }
    }

    public static void m(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && Process.is64Bit()) {
            if (gw.a()) {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, true);
            } else if (gw.b()) {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, false);
            }
        }
    }

    public static void o(Context context) {
        try {
            b bVar = (b) SettingsManager.a().a("art_suspend_timeout_settings", b.class);
            if (bVar == null) {
                ArtOptimizer.optSuspendTimeout(context);
            } else if (bVar.f107907b) {
                if (bVar.f107906a || com.ss.android.common.util.f.a(context)) {
                    ArtOptimizer.optSuspendTimeout(context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static int[] a(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int[] iArr = new int[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (java.util.Arrays.asList(r3).contains(r1) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.n(android.content.Context):boolean");
    }

    public static void q(Context context) {
        try {
            e eVar = (e) SettingsManager.a().a("enable_stack_leak_checker", e.class);
            if (eVar != null && eVar.f107920a) {
                StackLeakChecker.registerStackLeakListener(new StackLeakChecker.StackLeakListener() {
                    /* class com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(69149);
                    }

                    @Override // com.bytedance.sysoptimizer.StackLeakChecker.StackLeakListener
                    public final void onLeakReport(ArrayList<StackLeakItem> arrayList) {
                        Iterator<StackLeakItem> it = arrayList.iterator();
                        while (it.hasNext()) {
                            StackLeakItem next = it.next();
                            Throwable th = new Throwable(next.getLeakItem());
                            th.setStackTrace(new StackTraceElement[]{new StackTraceElement("StackLeakSoName", next.getSoName(), next.getSoName(), next.getLeakCount())});
                            SysOptimizerTask.a(th, "stack_leak_info", "stackleak", "stackleak", "stackleak", "StackLeakChecker Thread");
                        }
                    }
                });
                StackLeakChecker.setInterval(eVar.f107921b, ((long) (eVar.f107922c * 6)) * 10000000);
                String[] strArr = null;
                if (eVar.f107923d != null && eVar.f107923d.length() > 1) {
                    strArr = eVar.f107923d.split(":");
                }
                StackLeakChecker.enableChecker(context, strArr);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.ss.android.ugc.aweme.framework.a.a.a("SysOptimizerTask");
        this.f107895b = Boolean.valueOf(com.ss.android.common.util.f.a(context));
        if (com.ss.android.ugc.aweme.lego.b.f()) {
            this.f107894a = Long.valueOf(System.currentTimeMillis());
            com.ss.android.ugc.aweme.lego.f.a(false).a(new SysOptDvmOptimizer()).a(new SysOptOptimizeSuspendTimeout()).a(new SysOptFixSamSungGetNameCrash()).a(new SysOptMaliSwapBufferError()).a(new SysOptDisableDumpOatFileForANR()).a(new SysOptHookOptimizerEnable()).a(new SysOptOptimizeShrinker()).a(new SysOptEnableStackLeakChecker()).a(new SysOptCheckSoLoadResult()).a();
            return;
        }
        this.f107894a = Long.valueOf(System.currentTimeMillis());
        DvmOptimizer.optDvmLinearAllocBuffer(context);
        if (com.bytedance.ies.abmock.b.a().a(true, "suspendtimeout_opt", true)) {
            o(context);
        }
        m(context);
        c(context);
        p(context);
        if (Build.VERSION.SDK_INT == 24) {
            HighLevelTrimMemory.optimize(context);
        }
        DvmDeadLockOptimizer.optimize(context);
        if (com.ss.android.common.util.f.a(context)) {
            n(context);
        }
        d(context);
        h(context);
        i(context);
        l();
        j(context);
        m();
        e(context);
        f(context);
        g(context);
        k(context);
        Application application = (Application) context;
        if (SettingsManager.a().a("samsung_et_leak_opt", true)) {
            SmEditTextLeakOpt.optimize(application);
            com.bytedance.ies.ugc.appcontext.f.g().d(ad.f107944a);
        }
        l(context);
        DvmGlesOptimizer.fix(context);
        SysOptimizer.hookOptimizerEnable();
        o();
        b(context);
        q(context);
        n();
        if (this.f107895b.booleanValue()) {
            System.currentTimeMillis();
            this.f107894a.longValue();
        }
    }

    public static void a(Throwable th, String str, String str2, String str3, String str4, String str5) {
        com.bytedance.crash.entity.d a2 = com.bytedance.crash.entity.d.a(th.getStackTrace()[th.getStackTrace().length - 1], com.bytedance.crash.util.ab.a(th.getStackTrace()), str2, str5, false, str3, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(th.toString());
        a2.a(str, (List<String>) arrayList);
        a2.a(str4, "true");
        i.a(a2);
    }
}
