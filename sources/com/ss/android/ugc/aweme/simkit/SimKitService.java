package com.ss.android.ugc.aweme.simkit;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.j;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.w;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.x;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.preload.api.a.n;
import com.ss.android.ugc.aweme.video.preload.o;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.ss.android.ugc.f.a.a.a.b.g;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.simapicommon.a;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.c;

public class SimKitService implements c {

    /* renamed from: a  reason: collision with root package name */
    public ISimKitConfig f133485a;

    /* renamed from: b  reason: collision with root package name */
    private b f133486b = new e();

    /* renamed from: c  reason: collision with root package name */
    private c f133487c = new c() {
        /* class com.ss.android.ugc.aweme.simkit.SimKitService.AnonymousClass1 */

        static {
            Covode.recordClassIndex(87301);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.d.c
        public final b a(String str, com.ss.android.ugc.aweme.player.sdk.b.c cVar) {
            return w.a.f133577a.a(str, cVar);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.d.c
        public final com.ss.android.ugc.f.a.a.a.a.c a(i iVar, boolean z) {
            return w.a.f133577a.a(iVar, z);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.playerkit.videoview.b.b f133488d;

    /* renamed from: e  reason: collision with root package name */
    private ISpeedCalculator f133489e;

    static {
        Covode.recordClassIndex(87300);
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final c c() {
        return this.f133487c;
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final int g() {
        return com.ss.android.ugc.aweme.simkit.impl.bitrateselector.b.f133532a;
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final b h() {
        return this.f133486b;
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final ISimKitConfig b() {
        ISimKitConfig iSimKitConfig = this.f133485a;
        if (iSimKitConfig == null) {
            return (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        return iSimKitConfig;
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final int e() {
        return f().c();
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final g d() {
        if (this.f133488d == null) {
            IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = d.a().b().getDimensionBitrateCurveConfig();
            if (dimensionBitrateCurveConfig == null || !dimensionBitrateCurveConfig.a()) {
                this.f133488d = new x();
            } else {
                this.f133488d = new j();
            }
        }
        return this.f133488d.a();
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final synchronized ISpeedCalculator f() {
        ISpeedCalculator iSpeedCalculator;
        ISpeedCalculatorConfig speedCalculatorConfig;
        MethodCollector.i(5410);
        if (this.f133489e == null && (speedCalculatorConfig = d.a().b().getSpeedCalculatorConfig()) != null) {
            ISpeedCalculator a2 = com.ss.android.ugc.aweme.speedpredictor.api.c.a(speedCalculatorConfig.getCalculatorType()).a();
            this.f133489e = a2;
            a2.a(speedCalculatorConfig);
        }
        iSpeedCalculator = this.f133489e;
        MethodCollector.o(5410);
        return iSpeedCalculator;
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final void a() {
        if (this.f133485a == null) {
            this.f133485a = (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        ISimPlayerService$$CC.get$$STATIC$$().a(new ISimPlayerService.a() {
            /* class com.ss.android.ugc.aweme.simkit.SimKitService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(87302);
            }

            @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService.a
            public final void a(String str) {
                SimKitService.this.f133485a.getALog().d(str);
            }
        });
        com.ss.android.ugc.aweme.video.preload.c.b.f143648a = f.f133497a;
        if (this.f133485a.getSimPlayerExperiment().PlayeAbEnableCustomizeThreadPoolExp() == 1) {
            ISimPlayerService$$CC.get$$STATIC$$().a(a.f148867b);
        }
        com.ss.android.ugc.aweme.player.sdk.a.f115103a = this.f133485a.getAppConfig().isDebug();
        a.f133492a = this.f133485a.getAppConfig().isDebug();
    }

    @Override // com.ss.android.ugc.aweme.simkit.c
    public final void a(Context context, ISimKitConfig iSimKitConfig) {
        MethodCollector.i(5395);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        a.a((Application) applicationContext);
        this.f133485a = iSimKitConfig;
        a.f148869d = iSimKitConfig.getAppConfig();
        a.f148870e = iSimKitConfig.getMonitor();
        a.f148871f = iSimKitConfig.getEvent();
        a.f148872g = iSimKitConfig.getALog();
        com.ss.android.ugc.aweme.video.config.a aVar = a.C3820a.f143369a;
        aVar.f143367a = iSimKitConfig.getSimPlayerExperiment();
        aVar.f143368b = new com.ss.android.ugc.aweme.simkit.config.b(iSimKitConfig.getSimPlayerConfig());
        PlayerSettingService.init(iSimKitConfig.PlayerSettingService(), iSimKitConfig.getAppConfig().isDebug());
        o.f143762a = new n(new com.ss.android.ugc.aweme.simkit.config.c(iSimKitConfig.getVideoPreloaderManagerConfig()));
        synchronized (s.f143772a) {
            try {
                s.f143773b = com.ss.android.ugc.aweme.video.preload.j.a();
                if (s.f143774c != null) {
                    s.f143773b.a(s.f143774c);
                }
            } catch (Throwable th) {
                MethodCollector.o(5395);
                throw th;
            }
        }
        com.ss.android.ugc.playerkit.model.c.f148702a.f148703b = iSimKitConfig.getPlayerGlobalConfig();
        com.ss.android.ugc.aweme.simreporter.api.b.f133610a = iSimKitConfig.getSimReporterConfig();
        a();
        MethodCollector.o(5395);
    }
}
