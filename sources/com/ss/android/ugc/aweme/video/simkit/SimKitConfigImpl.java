package com.ss.android.ugc.aweme.video.simkit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.simcommon.SimALog;
import com.ss.android.ugc.aweme.video.simcommon.SimAppConfig;
import com.ss.android.ugc.aweme.video.simcommon.SimMobEvent;
import com.ss.android.ugc.aweme.video.simcommon.SimMonitor;
import com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl;
import com.ss.android.ugc.aweme.video.simplayer.PlayerExperimentImpl;
import com.ss.android.ugc.aweme.video.simplayer.PlayerSettingServiceImpl;
import com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;

public final class SimKitConfigImpl implements ISimKitConfig {
    private final h.h mALog$delegate = h.i.a(h.m.SYNCHRONIZED, a.f143796a);
    private final h.h mAppConfig$delegate = h.i.a(h.m.SYNCHRONIZED, b.f143797a);
    private final h.h mCommonConfig$delegate = h.i.a(h.m.SYNCHRONIZED, c.f143798a);
    private final h.h mDimensionBitrateCurveConfig$delegate = h.i.a(h.m.SYNCHRONIZED, d.f143799a);
    private final h.h mDimensionBitrateFilterConfig$delegate = h.i.a(h.m.SYNCHRONIZED, e.f143800a);
    private final h.h mEvent$delegate = h.i.a(h.m.SYNCHRONIZED, f.f143801a);
    private final h.h mMonitor$delegate = h.i.a(h.m.SYNCHRONIZED, g.f143802a);
    private final h.h mPlayerExperiment$delegate = h.i.a(h.m.SYNCHRONIZED, h.f143803a);
    private final h.h mPlayerGlobalConfig$delegate = h.i.a(h.m.SYNCHRONIZED, i.f143804a);
    private final h.h mPlayerSettingService$delegate = h.i.a(h.m.SYNCHRONIZED, j.f143805a);
    private final h.h mPreloaderExperiment$delegate = h.i.a(h.m.SYNCHRONIZED, new k(this));
    private final h.h mSimPlayerConfig$delegate = h.i.a(h.m.SYNCHRONIZED, l.f143806a);
    private final h.h mSpeedCalculatorConfig$delegate = h.i.a(h.m.SYNCHRONIZED, m.f143807a);
    private final h.h mVideoPreloaderManagerConfig$delegate = h.i.a(h.m.SYNCHRONIZED, n.f143808a);

    static {
        Covode.recordClassIndex(94084);
    }

    private final IALog getMALog() {
        return (IALog) this.mALog$delegate.getValue();
    }

    private final IAppConfig getMAppConfig() {
        return (IAppConfig) this.mAppConfig$delegate.getValue();
    }

    private final ICommonConfig getMCommonConfig() {
        return (ICommonConfig) this.mCommonConfig$delegate.getValue();
    }

    private final IDimensionBitrateCurveConfig getMDimensionBitrateCurveConfig() {
        return (IDimensionBitrateCurveConfig) this.mDimensionBitrateCurveConfig$delegate.getValue();
    }

    private final IDimensionBitrateFilterConfig getMDimensionBitrateFilterConfig() {
        return (IDimensionBitrateFilterConfig) this.mDimensionBitrateFilterConfig$delegate.getValue();
    }

    private final IEvent getMEvent() {
        return (IEvent) this.mEvent$delegate.getValue();
    }

    private final IMonitor getMMonitor() {
        return (IMonitor) this.mMonitor$delegate.getValue();
    }

    private final IPlayerExperiment getMPlayerExperiment() {
        return (IPlayerExperiment) this.mPlayerExperiment$delegate.getValue();
    }

    private final PlayerGlobalConfig getMPlayerGlobalConfig() {
        return (PlayerGlobalConfig) this.mPlayerGlobalConfig$delegate.getValue();
    }

    private final PlayerSettingService getMPlayerSettingService() {
        return (PlayerSettingService) this.mPlayerSettingService$delegate.getValue();
    }

    private final IPreloaderExperiment getMPreloaderExperiment() {
        return (IPreloaderExperiment) this.mPreloaderExperiment$delegate.getValue();
    }

    private final ISimPlayerConfig getMSimPlayerConfig() {
        return (ISimPlayerConfig) this.mSimPlayerConfig$delegate.getValue();
    }

    private final ISpeedCalculatorConfig getMSpeedCalculatorConfig() {
        return (ISpeedCalculatorConfig) this.mSpeedCalculatorConfig$delegate.getValue();
    }

    public final IVideoPreloadConfig getMVideoPreloaderManagerConfig() {
        return (IVideoPreloadConfig) this.mVideoPreloaderManagerConfig$delegate.getValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<SimALog> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143796a = new a();

        static {
            Covode.recordClassIndex(94085);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimALog invoke() {
            return new SimALog();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<SimAppConfig> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143797a = new b();

        static {
            Covode.recordClassIndex(94086);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimAppConfig invoke() {
            return new SimAppConfig();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<SimKitCommonConfig> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143798a = new c();

        static {
            Covode.recordClassIndex(94087);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimKitCommonConfig invoke() {
            return new SimKitCommonConfig();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.video.simkit.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f143799a = new d();

        static {
            Covode.recordClassIndex(94088);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.video.simkit.a.a invoke() {
            return new com.ss.android.ugc.aweme.video.simkit.a.a();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.video.simkit.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f143800a = new e();

        static {
            Covode.recordClassIndex(94089);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.video.simkit.a.b invoke() {
            return new com.ss.android.ugc.aweme.video.simkit.a.b();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<SimMobEvent> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f143801a = new f();

        static {
            Covode.recordClassIndex(94090);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimMobEvent invoke() {
            return new SimMobEvent();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<SimMonitor> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f143802a = new g();

        static {
            Covode.recordClassIndex(94091);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimMonitor invoke() {
            return new SimMonitor();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<PlayerExperimentImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f143803a = new h();

        static {
            Covode.recordClassIndex(94092);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PlayerExperimentImpl invoke() {
            return new PlayerExperimentImpl();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<PlayerGlobalConfigImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f143804a = new i();

        static {
            Covode.recordClassIndex(94093);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PlayerGlobalConfigImpl invoke() {
            return new PlayerGlobalConfigImpl();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<PlayerSettingServiceImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f143805a = new j();

        static {
            Covode.recordClassIndex(94094);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PlayerSettingServiceImpl invoke() {
            return new PlayerSettingServiceImpl();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<PlayerConfigImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f143806a = new l();

        static {
            Covode.recordClassIndex(94096);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PlayerConfigImpl invoke() {
            return new PlayerConfigImpl();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<SpeedConfigImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f143807a = new m();

        static {
            Covode.recordClassIndex(94097);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SpeedConfigImpl invoke() {
            return new SpeedConfigImpl();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<VideoPreloadManagerConfigImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f143808a = new n();

        static {
            Covode.recordClassIndex(94098);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPreloadManagerConfigImpl invoke() {
            return new VideoPreloadManagerConfigImpl();
        }
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final PlayerSettingService PlayerSettingService() {
        return getMPlayerSettingService();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IALog getALog() {
        return getMALog();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IAppConfig getAppConfig() {
        return getMAppConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ICommonConfig getCommonConfig() {
        return getMCommonConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig() {
        return getMDimensionBitrateCurveConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig() {
        return getMDimensionBitrateFilterConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IEvent getEvent() {
        return getMEvent();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IMonitor getMonitor() {
        return getMMonitor();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final PlayerGlobalConfig getPlayerGlobalConfig() {
        return getMPlayerGlobalConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IPreloaderExperiment getPreloaderExperiment() {
        return getMPreloaderExperiment();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ISimPlayerConfig getSimPlayerConfig() {
        return getMSimPlayerConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IPlayerExperiment getSimPlayerExperiment() {
        return getMPlayerExperiment();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ISimReporterConfig getSimReporterConfig() {
        return new com.ss.android.ugc.aweme.simreporter.api.a();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ISpeedCalculatorConfig getSpeedCalculatorConfig() {
        return getMSpeedCalculatorConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IVideoPreloadConfig getVideoPreloaderManagerConfig() {
        return getMVideoPreloaderManagerConfig();
    }

    static final class k extends h.f.b.m implements h.f.a.a<IPreloaderExperiment> {
        final /* synthetic */ SimKitConfigImpl this$0;

        static {
            Covode.recordClassIndex(94095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SimKitConfigImpl simKitConfigImpl) {
            super(0);
            this.this$0 = simKitConfigImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IPreloaderExperiment invoke() {
            return this.this$0.getMVideoPreloaderManagerConfig().getExperiment();
        }
    }
}
