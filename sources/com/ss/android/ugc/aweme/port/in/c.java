package com.ss.android.ugc.aweme.port.in;

import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.bef.effectsdk.BuildConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.k;
import com.google.gson.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.effect.b;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.e;
import com.ss.android.ugc.aweme.effectplatform.h;
import com.ss.android.ugc.aweme.effectplatform.w;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.port.internal.i;
import com.ss.android.ugc.aweme.port.internal.n;
import com.ss.android.ugc.aweme.port.internal.o;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.ez;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.logger.ILogger;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.File;

public final class c {
    public static ba A = D.B();
    public static an B = C.Q();
    public static u C;
    public static aj D;
    public static bc E = C.D();
    public static bk F = C.F();
    public static av G = D.r();
    public static bb H = D.y();
    public static ez I = C.q();
    public static a J = new a();
    private static final Object K = new Object();

    /* renamed from: a  reason: collision with root package name */
    public static Application f115622a;

    /* renamed from: b  reason: collision with root package name */
    public static f f115623b;

    /* renamed from: c  reason: collision with root package name */
    public static ab f115624c = D.f();

    /* renamed from: d  reason: collision with root package name */
    public static ak f115625d = D.h();

    /* renamed from: e  reason: collision with root package name */
    public static bf f115626e = D.u();

    /* renamed from: f  reason: collision with root package name */
    public static af f115627f = ((af) k.a(D.p()));

    /* renamed from: g  reason: collision with root package name */
    public static ay f115628g = D.A();

    /* renamed from: h  reason: collision with root package name */
    public static aa f115629h = D.b();

    /* renamed from: i  reason: collision with root package name */
    public static n f115630i = D.e();

    /* renamed from: j  reason: collision with root package name */
    public static IHashTagService f115631j = D.q();

    /* renamed from: k  reason: collision with root package name */
    public static bg f115632k = D.v();

    /* renamed from: l  reason: collision with root package name */
    public static ai f115633l = D.z();

    /* renamed from: m  reason: collision with root package name */
    public static az f115634m = D.s();
    public static bm n = new o();
    public static IVideoConfigService o = new n();
    public static IVideoConfigService p = new i();
    public static bi q = D.w();
    public static ax r = D.j();
    public static am s = D.i();
    public static ac t = D.g();
    public static z u = C.A();
    public static bd v = D.t();
    public static au w = C.C();
    public static t x = D.n();
    public static ae y = D.o();
    public static w z = D.a();

    public static boolean a() {
        return k.a.f115657a.a(d.f115636a);
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        k.a.f115657a.a(new e(sb));
        return sb.toString();
    }

    public static synchronized q c() {
        q f2;
        synchronized (c.class) {
            MethodCollector.i(10788);
            f2 = g.a().r().d().f();
            MethodCollector.o(10788);
        }
        return f2;
    }

    public static void e() {
        d();
        br.a(f115622a, m.f115659a, f115623b, I).a();
    }

    public static void d() {
        MethodCollector.i(10959);
        synchronized (K) {
            try {
                if (!DownloadableModelSupport.isInitialized()) {
                    EffectConfiguration build = EffectPlatformFactory.a().createEffectConfigurationBuilder(new EffectPlatformBuilder().setContext(f115622a)).build();
                    final b bVar = new b();
                    DownloadableModelConfig.Builder eventListener = new DownloadableModelConfig.Builder().setAssetManager(f115622a.getAssets()).setJsonConverter(h.a()).setMonitorService(new e()).setAppId(EffectPlatform.a()).setAccessKey("142710f02c3a11e8b42429f14557854a").setDeviceType(Build.MODEL).setHosts(EffectPlatformFactory.a().getDownloadableModelHosts()).setSdkVersion(BuildConfig.VERSION_NAME).setWorkspace(new File(f115622a.getFilesDir(), "effectmodel").getPath()).setEffectNetWorker(new w()).setEffectConfiguration(build).setExecutor(g.a()).setEventListener(new ModelEventListener() {
                        /* class com.ss.android.ugc.aweme.port.in.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(74584);
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
                            bVar.startDownloadEffectModelAlog(effect, modelInfo, BuildConfig.VERSION_NAME);
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelNotFound(Effect effect, Exception exc) {
                            bj.b("onModelNotFound" + Log.getStackTraceString(exc));
                            com.ss.android.ugc.aweme.df.q.a("model_not_found_rate", 1, new ar().a("errorDesc", Log.getStackTraceString(exc)).a("zip_model", (Integer) 0).a());
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
                            bj.b("onModelDownloadError " + effect.getName() + " requirements " + modelInfo.getName());
                            com.ss.android.ugc.aweme.df.q.a("service_model_download_error_rate", 1, new ar().a("errorDesc", Log.getStackTraceString(exc)).a("zip_model", (Integer) 0).a());
                            bVar.endDownloadEffectModelAlog(effect, modelInfo, -1, -1, exc, BuildConfig.VERSION_NAME);
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j2) {
                            bj.a("onModelDownloadSuccess " + effect.getName() + " requirements " + modelInfo.getName());
                            com.ss.android.ugc.aweme.df.q.a("model_download_time", 0, new ar().a("duration", Long.valueOf(j2)).a());
                            com.ss.android.ugc.aweme.df.q.a("service_model_download_error_rate", 0, new ar().a("zipModel", (Integer) 0).a());
                            bVar.endDownloadEffectModelAlog(effect, modelInfo, j2, 0, null, BuildConfig.VERSION_NAME);
                        }

                        @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                        public final void onFetchModelList(boolean z, String str, long j2, String str2) {
                            bVar.reportModelListAlog(z, str, j2, str2);
                        }
                    });
                    g.a();
                    DownloadableModelConfig build2 = eventListener.setModelFileEnv(DownloadableModelConfig.ModelFileEnv.ONLINE).setModelType(FetchModelType.fromValue(0)).build();
                    EPLog.setLogger(new ILogger() {
                        /* class com.ss.android.ugc.aweme.port.in.c.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(74585);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void d(String str) {
                            bj.a("effect_platform::".concat(String.valueOf(str)));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void i(String str) {
                            bj.d("effect_platform::".concat(String.valueOf(str)));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void w(String str) {
                            bj.c("effect_platform::".concat(String.valueOf(str)));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
                        public final void e(String str, Throwable th) {
                            bj.b("effect_platform::" + str + ", cause::" + Log.getStackTraceString(th));
                        }
                    });
                    DownloadableModelSupport.initialize(build2);
                    DownloadableModelSupport.setLibraryLoader(f.f115638a);
                }
            } finally {
                MethodCollector.o(10959);
            }
        }
    }

    static {
        Covode.recordClassIndex(74583);
        Application application = i.f115645a;
        u a2 = g.a();
        aj ajVar = l.f115658a;
        f115622a = application;
        C = a2;
        D = ajVar;
        f115623b = a2.G();
        br.a(application, m.f115659a, f115623b, I);
    }

    public static void a(com.ss.android.vesdk.k kVar) {
        d();
        br.a(f115622a, m.f115659a, f115623b, I).a(kVar);
    }
}
