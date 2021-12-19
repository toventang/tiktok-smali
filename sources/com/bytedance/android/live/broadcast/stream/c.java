package com.bytedance.android.live.broadcast.stream;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.d.a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreCameraLogLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableVeCamera2Setting;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEffectNewEngineConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableEffectNewEngineSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCameraCaptureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableEffectSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePushStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableStreamPreviewSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestStreamConfigSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStreamReport;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.ILayerControl;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.filter.FilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c implements com.bytedance.android.live.broadcast.api.d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8504k = new a((byte) 0);
    private static final float[] s = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public ILiveStream.ILiveStreamErrorListener f8505a;

    /* renamed from: b  reason: collision with root package name */
    public ILiveStream.ILiveStreamInfoListener f8506b;

    /* renamed from: c  reason: collision with root package name */
    public LiveCore f8507c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.d.b f8508d;

    /* renamed from: e  reason: collision with root package name */
    public int f8509e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8510f;

    /* renamed from: g  reason: collision with root package name */
    public long f8511g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f8512h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    public boolean f8513i;

    /* renamed from: j  reason: collision with root package name */
    public final d f8514j;

    /* renamed from: l  reason: collision with root package name */
    private final a.C0102a f8515l = new a.C0102a();

    /* renamed from: m  reason: collision with root package name */
    private boolean f8516m;
    private boolean n;
    private final Runnable o = new b(this);
    private final Runnable p = new d(this);
    private final ILiveStream.ILiveStreamErrorListener q;
    private final ILiveStream.ILiveStreamInfoListener r;

    public static final class a {
        static {
            Covode.recordClassIndex(4368);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final LiveCore e() {
        return this.f8507c;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        l.d(iLiveStreamInfoListener, "");
        this.f8506b = iLiveStreamInfoListener;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        l.d(iLiveStreamErrorListener, "");
        this.f8505a = iLiveStreamErrorListener;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(SurfaceView surfaceView) {
        LiveCore liveCore;
        l.d(surfaceView, "");
        if (!TestDisableStreamPreviewSetting.INSTANCE.getValue() && (liveCore = this.f8507c) != null) {
            liveCore.setDisplay(surfaceView);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        l.d(iTextureFrameAvailableListener, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.addTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(String str) {
        if (!TestDisablePushStreamSetting.INSTANCE.getValue()) {
            if (str == null || str.length() == 0) {
                str = this.f8514j.f8570b;
            }
            com.bytedance.android.live.broadcast.api.d.b bVar = this.f8508d;
            if (bVar != null) {
                bVar.beforeLiveCoreStartStream();
            }
            LiveCore liveCore = this.f8507c;
            if (liveCore != null) {
                liveCore.start(str);
            }
            this.f8512h.postDelayed(this.p, 3000);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(List<String> list) {
        if (!TestDisablePushStreamSetting.INSTANCE.getValue()) {
            if (list == null || list.size() <= 0) {
                a(this.f8514j.f8570b);
                return;
            }
            com.bytedance.android.live.broadcast.api.d.b bVar = this.f8508d;
            if (bVar != null) {
                bVar.beforeLiveCoreStartStream();
            }
            LiveCore liveCore = this.f8507c;
            if (liveCore != null) {
                liveCore.start(list);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.resume(privacyCert);
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.setAudioMute(this.f8516m, privacyCert);
        }
        this.f8512h.removeCallbacks(this.o);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(boolean z, PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        this.f8516m = z;
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.setAudioMute(z, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
        l.d(bundle, "");
        l.d(catchVideoCallback, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.catchVideo(bundle, catchVideoCallback);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8517a;

        static {
            Covode.recordClassIndex(4369);
        }

        b(c cVar) {
            this.f8517a = cVar;
        }

        public final void run() {
            this.f8517a.f8509e = 10008;
            this.f8517a.a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void c() {
        boolean z = !this.n;
        this.n = z;
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.enableMirror(z, true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final IFilterManager b() {
        if (TestDisableEffectSetting.INSTANCE.getValue()) {
            return FilterManager.createDummy();
        }
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            return liveCore.getVideoFilterMgr();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final int d() {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.f8507c;
        if (liveCore == null || (videoCapturerControl = liveCore.getVideoCapturerControl()) == null) {
            return -1;
        }
        return videoCapturerControl.queryZoomAbility(true, false);
    }

    static {
        Covode.recordClassIndex(4367);
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8528a;

        static {
            Covode.recordClassIndex(4372);
        }

        d(c cVar) {
            this.f8528a = cVar;
        }

        public final void run() {
            ILayerControl layerControl;
            c cVar = this.f8528a;
            if (cVar.f8508d != null) {
                LiveStreamReport liveStreamReport = new LiveStreamReport();
                LiveCore liveCore = cVar.f8507c;
                if (liveCore != null && liveCore.getLiveStreamInfo(liveStreamReport)) {
                    LivePerformanceManager.getInstance().setStreamFps(liveStreamReport.getVideoTransportRealFps());
                    LiveCore liveCore2 = cVar.f8507c;
                    if (!(liveCore2 == null || (layerControl = liveCore2.getLayerControl()) == null)) {
                        LivePerformanceManager.getInstance().setPreviewFps(layerControl.getRealRenderFps());
                    }
                    com.bytedance.android.live.broadcast.api.d.b bVar = cVar.f8508d;
                    if (bVar != null) {
                        bVar.onInfo(((float) liveStreamReport.getVideoTransportRealBps()) / 1000.0f);
                    }
                }
                liveStreamReport.release();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a() {
        if (this.f8509e != 10008) {
            this.f8509e = 0;
        }
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.stop();
        }
        this.f8512h.removeCallbacks(this.p);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(com.bytedance.android.live.broadcast.api.d.b bVar) {
        this.f8508d = bVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void e(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.stopVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void f(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.startVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void g(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.stopVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void h(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.startAudioCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void i(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.stopAudioCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final int a(float f2) {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.f8507c;
        if (liveCore == null || (videoCapturerControl = liveCore.getVideoCapturerControl()) == null) {
            return -1;
        }
        return videoCapturerControl.startZoom(true, f2);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void j(PrivacyCert privacyCert) {
        LiveCore.Builder builder;
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        int i2 = 1;
        if (!(liveCore == null || (builder = liveCore.getBuilder()) == null || builder.getVideoCaptureDevice() != 1)) {
            i2 = 2;
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.switchVideoCapture(i2, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void b(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        this.f8512h.postDelayed(this.o, this.f8514j.o);
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.setAudioMute(true, privacyCert);
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.pause(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void c(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.enableMixer(true, false);
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.enableMixer(false, false);
        }
        LiveCore liveCore3 = this.f8507c;
        if (liveCore3 != null) {
            liveCore3.stop();
        }
        LiveCore liveCore4 = this.f8507c;
        if (liveCore4 != null) {
            liveCore4.release(privacyCert);
        }
        this.f8507c = null;
        this.f8512h.removeCallbacksAndMessages(null);
        this.f8508d = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void d(PrivacyCert privacyCert) {
        LiveCore liveCore;
        l.d(privacyCert, "");
        if (!TestDisableCameraCaptureSetting.INSTANCE.getValue() && (liveCore = this.f8507c) != null) {
            liveCore.startVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void k(PrivacyCert privacyCert) {
        LiveCore.Builder builder;
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (!(liveCore == null || (builder = liveCore.getBuilder()) == null)) {
            builder.setBgMode(2);
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.resume(privacyCert);
        }
        LiveCore liveCore3 = this.f8507c;
        if (liveCore3 != null) {
            liveCore3.setAudioMute(this.f8516m, privacyCert);
        }
        this.f8515l.f7527a = 2;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final Client a(LiveCore.InteractConfig interactConfig) {
        l.d(interactConfig, "");
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a2, "");
        interactConfig.setAppChannel(((IHostContext) a2).getChannel());
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a3, "");
        interactConfig.setDeviceId(((IHostContext) a3).getServerDeviceId());
        interactConfig.setAppId(String.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).appId()));
        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a4, "");
        interactConfig.setAppVersion(((IHostContext) a4).getVersionCode());
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            return liveCore.create(interactConfig);
        }
        return null;
    }

    public c(d dVar) {
        int i2;
        String str;
        l.d(dVar, "");
        this.f8514j = dVar;
        C0130c cVar = new C0130c(this);
        this.q = cVar;
        e eVar = new e(this);
        this.r = eVar;
        LiveCore.Builder builder = new LiveCore.Builder();
        builder.setUsingExternAudioCaptureOnServerInteractMode(dVar.O);
        builder.setEnableVideoEncodeAccelera(dVar.f8580l);
        builder.setVideoProfile(dVar.f8581m);
        builder.setLogMonitor(new e(dVar));
        builder.setContext(dVar.f8569a);
        builder.setProjectKey(dVar.G);
        builder.setUploadLogInterval(5000);
        builder.setVideoFps(dVar.f8575g);
        builder.setVideoBitrate(dVar.f8572d * 1000);
        builder.setVideoMaxBitrate(dVar.f8574f * 1000);
        builder.setVideoMinBitrate(dVar.f8573e * 1000);
        builder.setVideoWidth(dVar.f8578j);
        builder.setVideoHeight(dVar.f8579k);
        builder.setVideoCaptureDevice(dVar.v);
        builder.setUsingVECamera2API(LiveEnableVeCamera2Setting.INSTANCE.enable());
        builder.setAudioChannel(2);
        builder.setAudioProfile(dVar.q);
        if (dVar.q == 1) {
            i2 = 128000;
        } else {
            i2 = 64000;
        }
        builder.setAudioBitrate(i2);
        builder.setAudioCaptureChannel(2);
        builder.setAudioSampleHZ(dVar.p);
        builder.setAudioCaptureDevice(dVar.w);
        if (dVar.x != null) {
            com.bytedance.android.livesdk.model.l lVar = dVar.x;
            l.b(lVar, "");
            if (lVar.f19090a >= 0) {
                com.bytedance.android.livesdk.model.l lVar2 = dVar.x;
                l.b(lVar2, "");
                String str2 = lVar2.f19091b;
                l.b(str2, "");
                if (str2.length() > 0) {
                    com.bytedance.android.livesdk.model.l lVar3 = dVar.x;
                    l.b(lVar3, "");
                    JSONObject jSONObject = new JSONObject(lVar3.f19091b);
                    com.bytedance.android.livesdk.model.l lVar4 = dVar.x;
                    l.b(lVar4, "");
                    builder.setAdmType(lVar4.f19090a, jSONObject);
                }
            }
        }
        builder.setUsingLiveStreamAudioCapture(dVar.F);
        builder.setRtmpReconnectCounts(dVar.n);
        builder.setRtmpReconnectIntervalSeconds(5);
        builder.setVideoEncoder(dVar.B);
        builder.setEnableVideoBFrame(dVar.A);
        builder.setVideoGopSec(dVar.z);
        builder.setBitrateAdaptStrategy(dVar.y);
        builder.setRoiOn(dVar.C ? 1 : 0, true);
        builder.setRoiOn(dVar.D ? 1 : 0, false);
        if (dVar.E == null) {
            str = "";
        } else {
            str = dVar.E;
        }
        builder.setRoiAssetDir(str);
        builder.setBgMode(dVar.M);
        if (TestStreamConfigSetting.INSTANCE.getValue() != null && TestStreamConfigSetting.INSTANCE.getValue().mEnable) {
            Map<String, String> stringMap = TestStreamConfigSetting.INSTANCE.getValue().getStringMap();
            l.b(stringMap, "");
            String str3 = dVar.H;
            l.b(str3, "");
            dVar.H = a(stringMap, str3);
        }
        builder.setupSdkParams(dVar.H);
        builder.setAssetManager(dVar.I);
        builder.setEffectModePath(dVar.K);
        builder.setEffectResourceFinder(dVar.J);
        builder.setVideoCaptureWidth(dVar.f8576h);
        builder.setVideoCaptureHeight(dVar.f8577i);
        builder.setEffectAlgorithmAB(dVar.L);
        builder.setUseNewEffectEngine(LiveEnableEffectNewEngineSetting.INSTANCE.getValue());
        builder.setEffectPlatformConfig(LiveEffectNewEngineConfigSetting.INSTANCE.getValue());
        builder.setLiveAuthString(dVar.N);
        builder.setCameraLogLevel(LiveCoreCameraLogLevelSetting.INSTANCE.getValue());
        com.bytedance.android.live.core.c.a.a(6, "LiveStream4", "builder.isEnableForceGlFinish: " + builder.isEnableForceGlFinish());
        if (dVar.u != null) {
            builder.setScreenCaptureIntent(dVar.u);
        }
        LiveCore create = builder.create();
        this.f8507c = create;
        if (create != null) {
            create.setErrorListener(cVar);
        }
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.setInfoListener(eVar);
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.enableMixer(true, true);
        }
        LiveCore liveCore3 = this.f8507c;
        if (liveCore3 != null) {
            liveCore3.enableMixer(false, true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.catchMediaData(bundle, catchPicCallback);
        }
    }

    private static String a(Map<String, String> map, String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("PushBase"));
        for (T t : map.entrySet()) {
            jSONObject2.put((String) t.getKey(), t.getValue());
        }
        jSONObject.put("PushBase", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        l.b(jSONObject3, "");
        return jSONObject3;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(int i2, PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.switchVideoCapture(i2, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(Bitmap bitmap, PrivacyCert privacyCert) {
        LiveCore.Builder builder;
        l.d(bitmap, "");
        l.d(privacyCert, "");
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.setAudioMute(true, privacyCert);
        }
        LiveCore liveCore2 = this.f8507c;
        if (liveCore2 != null) {
            liveCore2.setBackGroundPhotoPath(bitmap);
        }
        LiveCore liveCore3 = this.f8507c;
        if (!(liveCore3 == null || (builder = liveCore3.getBuilder()) == null)) {
            builder.setBgMode(3);
        }
        LiveCore liveCore4 = this.f8507c;
        if (liveCore4 != null) {
            liveCore4.pause(privacyCert);
        }
        this.f8515l.f7527a = 6;
    }

    public final void a(int i2, int i3, String str) {
        this.f8512h.removeCallbacksAndMessages(null);
        com.bytedance.android.live.broadcast.api.d.b bVar = this.f8508d;
        if (bVar != null) {
            bVar.onStreamEnd(i2, i3, str);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$c  reason: collision with other inner class name */
    static final class C0130c implements ILiveStream.ILiveStreamErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8523a;

        static {
            Covode.recordClassIndex(4370);
        }

        C0130c(c cVar) {
            this.f8523a = cVar;
        }

        @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
        public final void onError(final int i2, final int i3, final Exception exc) {
            this.f8523a.f8512h.post(new Runnable(this) {
                /* class com.bytedance.android.live.broadcast.stream.c.C0130c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0130c f8524a;

                static {
                    Covode.recordClassIndex(4371);
                }

                {
                    this.f8524a = r1;
                }

                public final void run() {
                    String str;
                    if (this.f8524a.f8523a.f8509e == -1) {
                        this.f8524a.f8523a.f8509e = i2;
                    }
                    Exception exc = exc;
                    String str2 = "";
                    if (exc != null) {
                        str = exc.getMessage();
                    } else {
                        str = str2;
                    }
                    if (this.f8524a.f8523a.f8508d != null) {
                        c cVar = this.f8524a.f8523a;
                        int i2 = this.f8524a.f8523a.f8509e;
                        int i3 = i3;
                        if (str != null) {
                            str2 = str;
                        }
                        cVar.a(i2, i3, str2);
                    }
                    this.f8524a.f8523a.f8509e = -1;
                }
            });
            this.f8523a.f8514j.t.a("code1:" + i2 + ",code2:" + i3, exc);
            ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener = this.f8523a.f8505a;
            if (iLiveStreamErrorListener != null) {
                iLiveStreamErrorListener.onError(i2, i3, exc);
            }
        }
    }

    static final class e implements ILiveStream.ILiveStreamInfoListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8529a;

        static {
            Covode.recordClassIndex(4373);
        }

        e(c cVar) {
            this.f8529a = cVar;
        }

        @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener
        public final void onInfo(final int i2, final int i3, final int i4) {
            String str;
            this.f8529a.f8512h.post(new Runnable(this) {
                /* class com.bytedance.android.live.broadcast.stream.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f8530a;

                static {
                    Covode.recordClassIndex(4374);
                }

                {
                    this.f8530a = r1;
                }

                public final void run() {
                    com.bytedance.android.live.broadcast.api.d.b bVar;
                    int i2 = i2;
                    if (i2 == 2) {
                        com.bytedance.android.live.broadcast.api.d.b bVar2 = this.f8530a.f8529a.f8508d;
                        if (bVar2 != null) {
                            bVar2.onStreamStart();
                        }
                    } else if (i2 == 3) {
                        if (this.f8530a.f8529a.f8509e != -1) {
                            this.f8530a.f8529a.a(this.f8530a.f8529a.f8509e, i3, "");
                            this.f8530a.f8529a.f8509e = -1;
                        }
                    } else if (i2 == 15) {
                        this.f8530a.f8529a.f8510f = true;
                        com.bytedance.android.live.broadcast.api.d.b bVar3 = this.f8530a.f8529a.f8508d;
                        if (bVar3 != null) {
                            bVar3.onReconnect();
                        }
                    } else if (i2 == 11) {
                        if (this.f8530a.f8529a.f8510f) {
                            this.f8530a.f8529a.f8510f = false;
                            com.bytedance.android.live.broadcast.api.d.b bVar4 = this.f8530a.f8529a.f8508d;
                            if (bVar4 != null) {
                                bVar4.onReconnected();
                            }
                        } else {
                            com.bytedance.android.live.broadcast.api.d.b bVar5 = this.f8530a.f8529a.f8508d;
                            if (bVar5 != null) {
                                bVar5.connected();
                            }
                        }
                        if (!this.f8530a.f8529a.f8513i) {
                            this.f8530a.f8529a.f8513i = true;
                            com.bytedance.android.live.broadcast.api.d.b bVar6 = this.f8530a.f8529a.f8508d;
                            if (bVar6 != null) {
                                bVar6.onFirstRTMPConnect();
                            }
                        }
                        if (System.currentTimeMillis() - this.f8530a.f8529a.f8511g > 5000) {
                            this.f8530a.f8529a.f8511g = System.currentTimeMillis();
                            com.bytedance.android.live.broadcast.api.d.b bVar7 = this.f8530a.f8529a.f8508d;
                            if (bVar7 != null) {
                                bVar7.onNetworkLow();
                            }
                        }
                    } else if (i2 == 13) {
                        if (System.currentTimeMillis() - this.f8530a.f8529a.f8511g > 5000) {
                            this.f8530a.f8529a.f8511g = System.currentTimeMillis();
                            com.bytedance.android.live.broadcast.api.d.b bVar8 = this.f8530a.f8529a.f8508d;
                            if (bVar8 != null) {
                                bVar8.onNetworkLow();
                            }
                        }
                    } else if (i2 == 30) {
                        com.bytedance.android.live.broadcast.api.d.b bVar9 = this.f8530a.f8529a.f8508d;
                        if (bVar9 != null) {
                            bVar9.onCaptureFirstFrame();
                        }
                    } else if (i2 == 101 && (bVar = this.f8530a.f8529a.f8508d) != null) {
                        bVar.onNetworkStatus(i4);
                    }
                }
            });
            com.bytedance.android.live.broadcast.stream.a.b bVar = this.f8529a.f8514j.t;
            String str2 = "INFO (" + i2 + ',' + i3 + ',' + i4 + ") ";
            switch (i2) {
                case 1:
                    str = str2 + "starting_publish";
                    break;
                case 2:
                    str = str2 + "started_publish";
                    break;
                case 3:
                    str = str2 + "stoped_publish";
                    break;
                case 4:
                    str = str2 + "video_starting_capture";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    str = str2 + "video_started_capture";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    str = str2 + "video_stoped_capture";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    str = str2 + "audio_starting_capture";
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    str = str2 + "audio_started_capture";
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    str = str2 + "audio_stoped_capture";
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    str = str2 + "rtmp_connecting";
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    str = str2 + "rtmp_connected";
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    str = str2 + "rtmp_connect_fail";
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    str = str2 + "network too weak";
                    break;
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    str = str2 + "rtmp_disconnected";
                    break;
                case 15:
                    str = str2 + "rtmp_reconnecting";
                    break;
                case 16:
                    str = str2 + "video_encoder_format_changed";
                    break;
                default:
                    str = str2 + "UNKONW???";
                    break;
            }
            bVar.a(str);
            ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.f8529a.f8506b;
            if (iLiveStreamInfoListener != null) {
                iLiveStreamInfoListener.onInfo(i2, i3, i4);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.a
    public final void a(int i2, int i3, int i4, long j2) {
        LiveCore liveCore = this.f8507c;
        if (liveCore != null) {
            liveCore.pushVideoFrame(i2, false, i3, i4, LiveFeedRefreshTimeSetting.DEFAULT, s, j2 * 1000);
        }
    }
}
