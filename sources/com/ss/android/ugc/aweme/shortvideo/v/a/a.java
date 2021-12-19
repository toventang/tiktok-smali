package com.ss.android.ugc.aweme.shortvideo.v.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.c.h.a.q;
import com.google.c.h.a.u;
import com.kakao.usermgmt.StringSet;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.bo;
import com.ss.android.ugc.aweme.shortvideo.cp;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cw;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.eo;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult;
import com.ss.android.ugc.aweme.shortvideo.upload.o;
import com.ss.android.ugc.aweme.shortvideo.upload.r;
import com.ss.android.ugc.aweme.shortvideo.upload.u;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.ss.android.ugc.aweme.shortvideo.util.bs;
import com.ss.android.ugc.aweme.shortvideo.v.f;
import com.ss.android.ugc.aweme.shortvideo.x;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.aweme.utils.hn;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.i;
import dmt.av.video.aj;
import dmt.av.video.m;
import h.p;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class a implements f {
    private q<h> A;
    private long B = 0;
    private double C;
    private String D;
    private String E;

    /* renamed from: a  reason: collision with root package name */
    public final String f132413a;

    /* renamed from: b  reason: collision with root package name */
    public o f132414b;

    /* renamed from: c  reason: collision with root package name */
    final int f132415c;

    /* renamed from: d  reason: collision with root package name */
    final int f132416d;

    /* renamed from: e  reason: collision with root package name */
    final cp f132417e = new cp();

    /* renamed from: f  reason: collision with root package name */
    final j f132418f;

    /* renamed from: g  reason: collision with root package name */
    public SynthetiseResult f132419g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.core.d.a f132420h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.publish.b.a.a<h> f132421i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.publish.b.a.a<h> f132422j;

    /* renamed from: k  reason: collision with root package name */
    public final c f132423k;

    /* renamed from: l  reason: collision with root package name */
    public final cw f132424l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f132425m = false;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public long q = 0;
    public long r = 0;
    public boolean s;
    public boolean t;
    public eo u;
    public final String v;
    public final boolean w;
    public final int x;
    public h y;
    private com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> z;

    static {
        Covode.recordClassIndex(86699);
    }

    static boolean a(int i2) {
        return i2 == 1;
    }

    public final String toString() {
        return "PublisherImpl2";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.a$a  reason: collision with other inner class name */
    static class C3433a {

        /* renamed from: a  reason: collision with root package name */
        com.google.c.a.o f132450a;

        static {
            Covode.recordClassIndex(86710);
        }

        C3433a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        com.google.c.a.o f132451a;

        static {
            Covode.recordClassIndex(86711);
        }

        b() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f132451a = com.google.c.a.o.b(hn.f143067b);
        }
    }

    public final void a(boolean z2, Throwable th, String str, BaseShortVideoContext baseShortVideoContext, SynthetiseResult synthetiseResult) {
        String th2;
        long j2;
        int i2;
        int i3;
        int i4;
        CompileProbeResult.ResultData data;
        this.o = SystemClock.uptimeMillis();
        long j3 = 0;
        this.B = this.B > 0 ? hn.f143067b.a() - this.B : 0;
        Locale locale = Locale.US;
        double d2 = (double) this.B;
        Double.isNaN(d2);
        int i5 = 0;
        String a2 = com.a.a(locale, "%d", new Object[]{Integer.valueOf((int) (d2 / 1000000.0d))});
        com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("duration", a2).a("status", String.valueOf(z2 ? 1 : 0)).a("is_hardcode", com.ss.android.ugc.aweme.property.b.a() ? "1" : "0").a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("video_quality", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.d()).toString()).a("_perf_monitor", "1").a("fps", new StringBuilder().append(this.C).toString()).a("publish_id", this.v).a("is_hd_setting", m.a(baseShortVideoContext) ? 1 : 0).a("current_page", str);
        if (th == null) {
            th2 = null;
        } else {
            th2 = th.toString();
        }
        a3.a("fail_info", th2);
        if (th instanceof ee) {
            a3.a("error_code", new StringBuilder().append(((ee) th).getCode()).toString());
        }
        if (this.f132415c == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            String str2 = "";
            if (i.a(videoPublishEditModel.mOutputFile)) {
                j3 = com.ss.android.ugc.tools.utils.h.i(videoPublishEditModel.mOutputFile);
                if (synthetiseResult == null || synthetiseResult.outputVideoFileInfo == null) {
                    i3 = aj.c(videoPublishEditModel.mOutputFile);
                    j2 = -1;
                    i4 = -1;
                    i2 = -1;
                } else {
                    i3 = synthetiseResult.outputVideoFileInfo.getBitrate();
                    str2 = synthetiseResult.outputVideoFileInfo.getResolution();
                    j2 = synthetiseResult.outputVideoFileInfo.getDuration();
                    i4 = synthetiseResult.outputVideoFileInfo.getCodecType();
                    i2 = synthetiseResult.outputVideoFileInfo.getGop();
                }
            } else {
                j2 = -1;
                i2 = -1;
                i3 = 0;
                i4 = -1;
            }
            if (!(videoPublishEditModel.compileProbeResult == null || (data = videoPublishEditModel.compileProbeResult.getData()) == null)) {
                a3.a("pre_psnr", Float.valueOf(data.getPsnr())).a("pre_encoder_type", data.getEncoderType()).a("pre_encode_width", data.getEncodeWidth()).a("pre_encode_height", data.getEncodeHeight()).a("pre_max_bitrate", data.getMaxBitrate()).a("pre_preset", data.getPreset()).a("pre_crf", data.getCrf()).a("pre_gop", data.getGop()).a("pre_qpoffset", Double.valueOf(data.getQpoffset())).a("pre_optimize_crf", data.getOptimizeCrf());
            }
            if (videoPublishEditModel.hardcodeAdaptiveResult != null) {
                a3.a("hw_opt_bitrate_set_result", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getHwOptBitrate()));
                a3.a("pre_bitrate_status", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
            int[] a4 = bb.a(videoPublishEditModel.getPreviewInfo());
            int i6 = a4 != null ? a4[8] : -1;
            p<Integer, Integer> a5 = com.ss.android.ugc.tools.utils.m.a(videoPublishEditModel);
            int i7 = 1;
            if (a5.getFirst().intValue() + a5.getSecond().intValue() <= 1) {
                i7 = a5.getFirst().intValue() + a5.getSecond().intValue() == 1 ? 0 : -1;
            }
            this.s = videoPublishEditModel.isSyntheticHardEncode;
            i5 = 0;
            a3.a("compose_coding", videoPublishEditModel.isSyntheticHardEncode ? "hardcoding" : "softcoding").a("file_bitrate", i3).a("resolution", str2).a("file_duration_ms", j2).a("codec_type", i4).a("gop", i2).a("source_codec_type", i6).a("is_multi_content", i7).a("original_resolution", bp.o(videoPublishEditModel)).a("file_size", com.a.a(Locale.US, "%d", new Object[]{Long.valueOf(j3 / 1024)}));
            if (e.b(videoPublishEditModel.getLocalTempPath())) {
                j3 += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (videoPublishEditModel.getLocalFinalPath() != null) {
                j3 += com.ss.android.ugc.tools.utils.h.i(videoPublishEditModel.getLocalFinalPath());
            }
            r.a(this.D, j3);
            u.a a6 = r.a();
            if (a6 != null) {
                a3.a("init_available_size_mb", (int) a6.f132149a).a("max_publish_usage_mb", (int) a6.f132150b).a("available_size_detail", a6.f132151c);
            }
            if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay) && !TextUtils.isEmpty(videoPublishEditModel.clientId) && !TextUtils.isEmpty(videoPublishEditModel.shareId)) {
                a3.a("channel", videoPublishEditModel.clientId);
                a3.a("shoot_way", videoPublishEditModel.mShootWay);
                a3.a("open_platform_share_id", videoPublishEditModel.shareId);
            }
            a3.a("select_gear_by_upload_speed", videoPublishEditModel.getUploadSpeedSettingsIndex());
            a3.a("creation_id", videoPublishEditModel.creationId).a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds)).a("effect_list", videoPublishEditModel.getEditEffectList()).a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).a("prop_list", videoPublishEditModel.mStickerID).a("beautify_used", videoPublishEditModel.faceBeautyOpen).a("publish_type", this.x).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.f68624a).a("watermark_resolution", videoPublishEditModel.mWatermarkVideoWidth + "*" + videoPublishEditModel.mWatermarkVideoHeight).a("content_type", es.c(videoPublishEditModel)).a("is_hd_video", m.b(videoPublishEditModel) ? 1 : 0).a("content_source", es.a(videoPublishEditModel)).a("source_duration", j2);
            com.ss.android.ugc.aweme.shortvideo.v.b.a.a(a3, synthetiseResult, baseShortVideoContext);
        }
        if (g.a().o().c()) {
            i5 = g.a().o().d();
        }
        a3.a("publish_cnt", i5);
        com.ss.android.ugc.aweme.common.r.a("video_compose_end", a3.f149193a);
        com.ss.android.ugc.tools.utils.q.d("uploadSynthetiseEndEvent: ".concat(String.valueOf(a2)));
    }

    public final void a(boolean z2, String str, h hVar) {
        this.q = SystemClock.uptimeMillis();
        if (!a(this.f132416d)) {
            d dVar = null;
            if (hVar instanceof d) {
                dVar = (d) hVar;
            }
            this.u.a(z2, str, null, true, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        if (!g.a().A().a()) {
            return false;
        }
        if (this.f132414b == null) {
            return true;
        }
        this.f132414b.onError(new et(new com.ss.android.ugc.aweme.shortvideo.v.d(toString() + "#" + str)));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void i() {
        if (this.z != null) {
            com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel PublisherImpl2 pause");
            this.f132418f.a(this.f132414b);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void j() {
        if (this.z != null) {
            com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel PublisherImpl2 resume");
            this.f132418f.b(this.f132414b);
        }
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        j f132452a;

        /* renamed from: b  reason: collision with root package name */
        int f132453b;

        /* renamed from: c  reason: collision with root package name */
        String f132454c;

        /* renamed from: d  reason: collision with root package name */
        int f132455d;

        /* renamed from: e  reason: collision with root package name */
        long f132456e;

        /* renamed from: f  reason: collision with root package name */
        com.google.c.a.o f132457f;

        static {
            Covode.recordClassIndex(86712);
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor LOG_START");
            this.f132457f = com.google.c.a.o.b(hn.f143067b);
            this.f132456e = SystemClock.uptimeMillis();
            com.ss.android.ugc.aweme.common.r.a("click_publish_button", new com.ss.android.ugc.tools.f.b().a("compose_finish", z ? 1 : 0).f149193a);
        }

        c(j jVar, int i2, String str, int i3) {
            this.f132452a = jVar;
            this.f132453b = i2;
            this.f132454c = str;
            this.f132455d = i3;
        }
    }

    public static void a(Throwable th) {
        try {
            com.ss.android.ugc.aweme.base.o.a("aweme_upload_video_funnel", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "pure_exception").a("exception", Log.getStackTraceString(th)).a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.app.f.c a(com.ss.android.ugc.aweme.app.f.c cVar) {
        if (cVar == null) {
            cVar = new com.ss.android.ugc.aweme.app.f.c();
        }
        cVar.a("video_type", Integer.valueOf(this.f132415c)).a("item_type", this.f132418f.getClass().getSimpleName());
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void a(final BaseShortVideoContext baseShortVideoContext) {
        this.f132418f.f128567c = 0;
        this.f132424l.a("startPublish()");
        gr.f(this.v);
        this.f132418f.a();
        this.f132425m = true;
        com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> aVar = this.z;
        if (aVar == null) {
            this.f132424l.a("startPublish() synthetise()");
            c(baseShortVideoContext, 0);
            this.f132423k.a(false);
            return;
        }
        boolean isDone = aVar.isDone();
        if (isDone) {
            this.f132424l.a("synthetise() already done");
        } else {
            this.f132424l.a("synthetise() not finished.");
        }
        this.f132423k.a(isDone);
        l.a(this.z, new k<SynthetiseResult>() {
            /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86700);
            }

            @Override // com.google.c.h.a.k
            public final void onFailure(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.h.a.k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                if (!a.this.f132420h.a()) {
                    a.this.b(baseShortVideoContext, 0);
                }
            }
        }, com.ss.android.ugc.aweme.base.m.f68150a);
    }

    private void b(BaseShortVideoContext baseShortVideoContext) {
        String e2;
        String str;
        String str2;
        com.ss.android.ugc.aweme.turbo.api.b.a().videoComposeStart();
        this.n = SystemClock.uptimeMillis();
        int b2 = com.ss.android.ugc.aweme.shortvideo.v.g.b(com.ss.android.ugc.aweme.df.b.a());
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (this.f132415c == 0) {
            e2 = ((VideoPublishEditModel) baseShortVideoContext).getVideoResolution();
        } else if ("upload".equals(this.E)) {
            e2 = com.ss.android.ugc.aweme.property.b.f();
        } else {
            e2 = com.ss.android.ugc.aweme.property.b.e();
        }
        com.ss.android.ugc.tools.f.b a2 = bVar.a("resolution", e2);
        String str3 = "0";
        if (com.ss.android.ugc.aweme.property.b.a()) {
            str = "1";
        } else {
            str = str3;
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("is_hardcode", str).a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("video_quality", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.d()).toString()).a("_perf_monitor", "1").a("publish_id", this.v).a("pre_publish_type", this.x).a("publish_type", this.x);
        if (com.ss.android.ugc.aweme.shortvideo.v.e.a()) {
            str2 = "1";
        } else {
            str2 = str3;
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("user_enable_pre_publish", str2);
        if (g.a().e().getEnablePreUploadByUser(false)) {
            str3 = "1";
        }
        a4.a("feature_enable_pre_publish", str3).a("total_available_memory_mb", b2 - com.ss.android.ugc.aweme.shortvideo.v.g.d()).a("total_available_memory_percentage", Float.valueOf(com.ss.android.ugc.aweme.shortvideo.v.g.a(b2))).a("total_memory_mb", b2).a("jvm_allow_memory_mb", com.ss.android.ugc.aweme.shortvideo.v.g.a()).a("jvm_available_memory_mb", com.ss.android.ugc.aweme.shortvideo.v.g.a() - com.ss.android.ugc.aweme.shortvideo.v.g.b()).a("jvm_available_memory_percentage", Float.valueOf(com.ss.android.ugc.aweme.shortvideo.v.g.c())).a("fps", new StringBuilder().append(this.C).toString());
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            bVar.a("source_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
            if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay) && !TextUtils.isEmpty(videoPublishEditModel.clientId) && !TextUtils.isEmpty(videoPublishEditModel.shareId)) {
                bVar.a("channel", videoPublishEditModel.clientId);
                bVar.a("shoot_way", videoPublishEditModel.mShootWay);
                bVar.a("open_platform_share_id", videoPublishEditModel.shareId);
            }
            HardcodeAdaptiveResult hardcodeAdaptiveResult = videoPublishEditModel.hardcodeAdaptiveResult;
            if (hardcodeAdaptiveResult != null) {
                bVar.a("hw_opt_bitrate_set_result", Float.valueOf(hardcodeAdaptiveResult.getHwOptBitrate()));
                bVar.a("pre_bitrate_status", Float.valueOf(hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
        }
        com.ss.android.ugc.aweme.common.r.a("video_compose_start", bVar.f149193a);
        this.B = hn.f143067b.a();
        com.ss.android.ugc.tools.utils.q.d("Publisher uploadSynthetiseStartEvent");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void a(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel PublisherImpl2 cancel");
        cr.a();
        boolean h2 = cr.h();
        com.ss.android.ugc.tools.utils.q.d("Publisher cancelSynthesis publishing:".concat(String.valueOf(h2)));
        if (h2) {
            com.ss.android.ugc.aweme.common.r.a("user_cancel_publish", new com.ss.android.ugc.tools.f.b().a("publish_id", this.v).a("video_type", this.f132415c).a("video_upload_type", this.f132416d).a("cancel_step", "user").f149193a);
            cr.a().a(aVar);
            this.f132420h.b();
            cr.a().a(10);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void a(BaseShortVideoContext baseShortVideoContext, int i2) {
        this.f132418f.f128567c = i2;
        this.f132424l.a("prePublish() publishType:".concat(String.valueOf(i2)));
        if (this.z == null) {
            c(baseShortVideoContext, i2);
        }
        b(baseShortVideoContext, i2);
    }

    private void c(final BaseShortVideoContext baseShortVideoContext, final int i2) {
        int i3;
        com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel PublisherImpl2 synthetise start");
        if (this.f132415c == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            this.C = (double) videoPublishEditModel.videoFps();
            this.D = videoPublishEditModel.creationId;
            i3 = videoPublishEditModel.videoEditorType;
        } else {
            i3 = -1;
        }
        this.E = com.ss.android.ugc.aweme.photo.a.b.a(this.f132415c, baseShortVideoContext);
        gr.b(this.v, com.a.a(Locale.US, "id:%s vt:%d ut:%d et:%d", new Object[]{this.v, Integer.valueOf(this.f132415c), Integer.valueOf(this.f132416d), Integer.valueOf(i3)}));
        cr.a().a(2);
        r.a(this.D, com.ss.android.ugc.aweme.photo.a.b.b(this.f132415c));
        com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> b2 = this.f132418f.b(baseShortVideoContext);
        b(baseShortVideoContext);
        this.z = b2;
        com.ss.android.ugc.aweme.common.r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "start_synthetise").a("shoot_way", this.f132413a).a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
        l.a(b2, new k<SynthetiseResult>() {
            /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(86703);
            }

            @Override // com.google.c.h.a.k
            public final void onFailure(Throwable th) {
                gr.a(a.this.v, com.ss.android.ugc.aweme.publish.g.c.a.b(th), th.getMessage());
                a.this.f132424l.a("synthetise failed");
                com.ss.android.ugc.aweme.common.r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "failed_synthetise").a("shoot_way", a.this.f132413a).a("synthetise_start", "failed").a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
                cr.a().a(9);
                if (a.this.f132425m) {
                    a.this.a(false, th, "homepage_follow", baseShortVideoContext, null);
                } else {
                    a.this.a(false, th, "video_post_page", baseShortVideoContext, null);
                }
                if (a.this.f132414b != null) {
                    a.this.f132414b.onError(new et(th));
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.h.a.k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                String str;
                SynthetiseResult synthetiseResult2 = synthetiseResult;
                if (synthetiseResult2 != null) {
                    str = "encode:" + synthetiseResult2.synthetiseCPUEncode;
                    cr.a().p = synthetiseResult2.outputFile;
                } else {
                    str = "";
                }
                gr.c(a.this.v, str);
                try {
                    if (a.this.f132425m) {
                        a.this.a(true, null, "homepage_follow", baseShortVideoContext, synthetiseResult2);
                    } else {
                        a.this.a(true, null, "video_post_page", baseShortVideoContext, synthetiseResult2);
                    }
                    com.ss.android.ugc.aweme.common.r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "success_synthetise").a("shoot_way", a.this.f132413a).a("synthetise_start", "success").a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
                    a.this.f132419g = synthetiseResult2;
                    a.this.f132424l.a("synthetise() finished, result = ".concat(String.valueOf(synthetiseResult2)));
                    if (!a.this.f132420h.a()) {
                        a.this.b(baseShortVideoContext, i2);
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.base.o.a("aweme_synthetise_error_log", new com.ss.android.ugc.aweme.app.f.c().a("exception", com.facebook.common.d.m.c(e2)).a());
                }
            }
        }, u.a.INSTANCE);
        b2.b(new b(this, b2), u.a.INSTANCE);
        l.a(b2, new k<SynthetiseResult>() {
            /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(86704);
            }

            @Override // com.google.c.h.a.k
            public final void onFailure(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.h.a.k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                SynthetiseResult synthetiseResult2 = synthetiseResult;
                if (!a.this.f132420h.a() && synthetiseResult2 != null && a.this.f132414b != null && synthetiseResult2.outputFile != null) {
                    a.this.f132414b.onSynthetiseSuccess(synthetiseResult2.outputFile);
                }
            }
        }, com.ss.android.ugc.aweme.base.m.f68150a);
    }

    public final void b(final BaseShortVideoContext baseShortVideoContext, final int i2) {
        if (!a("createVideo")) {
            if (this.A == null) {
                q<h> c2 = this.f132418f.c(baseShortVideoContext);
                this.A = c2;
                if (c2 != null) {
                    this.f132424l.a("createVideo() synthetiseResult = " + this.f132419g);
                    final b bVar = new b();
                    bVar.a();
                    l.a(this.A, new k<h>() {
                        /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(86705);
                        }

                        @Override // com.google.c.h.a.k
                        public final void onFailure(Throwable th) {
                            int a2 = com.ss.android.ugc.aweme.publish.g.c.a.a(th, 11);
                            if (!fe.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
                                a2 = -2;
                            }
                            gr.a(a.this.v, a2, com.ss.android.ugc.aweme.publish.g.c.a.e(th), th.getMessage());
                            a.this.f132424l.a("create video failed.");
                            com.ss.android.ugc.tools.utils.q.a(th);
                            cr.a().a(9);
                            if (a.this.f132414b != null) {
                                a.this.f132414b.onError(new et(th));
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.google.c.h.a.k
                        public final /* synthetic */ void onSuccess(h hVar) {
                            gr.d(a.this.v, bs.a(hVar));
                            b bVar = bVar;
                            if (bVar.f132451a.f53699a) {
                                bVar.f132451a.c();
                                com.ss.android.ugc.aweme.common.r.a("get_video_key", new com.ss.android.ugc.tools.f.b().a("duration", com.a.a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) bVar.f132451a.a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f149193a);
                            }
                            a.this.f132424l.a("create video finished.");
                        }
                    }, com.ss.android.ugc.aweme.base.m.f68150a);
                    com.ss.android.ugc.aweme.common.r.a("publish_start", new com.ss.android.ugc.tools.f.b().a("shoot_entrance", this.f132413a).a("is_photo", "0").f149193a);
                } else {
                    return;
                }
            }
            l.a(this.A, new k<h>() {
                /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(86706);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(h hVar) {
                    boolean z;
                    h hVar2 = hVar;
                    a.this.y = hVar2;
                    int i2 = i2;
                    if (i2 != 1) {
                        a aVar = a.this;
                        BaseShortVideoContext baseShortVideoContext = baseShortVideoContext;
                        if (i2 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!aVar.a("uploadVideo")) {
                            com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel PublisherImpl2 uploadVideo start");
                            if (aVar.f132421i == null) {
                                aVar.f132424l.a("uploadVideo() synthetiseResult = " + aVar.f132419g);
                                aVar.p = SystemClock.uptimeMillis();
                                if (!a.a(aVar.f132416d)) {
                                    aVar.u = new eo(baseShortVideoContext, aVar.f132418f, aVar.f132415c, null, aVar.v, aVar.x);
                                    aVar.u.a(true, null);
                                    try {
                                        String stackTraceString = Log.getStackTraceString(new Exception());
                                        com.ss.android.ugc.aweme.au.a.f67096a.a("upload_video_start");
                                        com.ss.android.ugc.aweme.base.o.a("aweme_upload_video_funnel", aVar.a((com.ss.android.ugc.aweme.app.f.c) null).a(StringSet.type, "upload_video_start").a("extra", com.ss.android.ugc.aweme.au.a.f67096a.a()).a("stack_trace", stackTraceString).a());
                                        aVar.a("upload_video_start", stackTraceString);
                                    } catch (Exception e2) {
                                        a.a(e2);
                                    }
                                }
                                aVar.f132421i = aVar.f132418f.a(baseShortVideoContext, hVar2);
                                l.a(aVar.f132421i, new k<h>(baseShortVideoContext, hVar2) {
                                    /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass7 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ BaseShortVideoContext f132444a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ h f132445b;

                                    static {
                                        Covode.recordClassIndex(86707);
                                    }

                                    @Override // com.google.c.h.a.k
                                    public final void onFailure(Throwable th) {
                                        String str;
                                        int d2 = com.ss.android.ugc.aweme.publish.g.c.a.d(th);
                                        String str2 = a.this.v;
                                        if (th.getMessage() != null) {
                                            str = th.getMessage();
                                        } else {
                                            str = "";
                                        }
                                        gr.b(str2, d2, str);
                                        try {
                                            a.this.a(false, new com.ss.android.ugc.aweme.app.f.c().a("throwable", Log.getStackTraceString(th)).a("args", com.ss.android.ugc.aweme.port.in.c.f115623b.b(this.f132444a)).a("result", com.ss.android.ugc.aweme.port.in.c.f115623b.b(this.f132445b)));
                                        } catch (Exception e2) {
                                            a.a(e2);
                                        }
                                        cr.a().a(9);
                                        a.this.a(false, th.toString(), this.f132445b);
                                        if (a.this.f132414b != null) {
                                            a.this.f132414b.onError(new et(th, com.ss.android.ugc.aweme.publish.g.c.a.a(d2)));
                                        }
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.google.c.h.a.k
                                    public final /* synthetic */ void onSuccess(h hVar) {
                                        gr.d(a.this.v);
                                        try {
                                            a.this.a(true, new com.ss.android.ugc.aweme.app.f.c().a("resultCode", com.ss.android.ugc.aweme.port.in.c.f115623b.b(hVar)).a("args", com.ss.android.ugc.aweme.port.in.c.f115623b.b(this.f132444a)).a("result", com.ss.android.ugc.aweme.port.in.c.f115623b.b(this.f132445b)));
                                        } catch (Exception e2) {
                                            a.a(e2);
                                        }
                                        a.this.a(true, "", this.f132445b);
                                    }

                                    {
                                        this.f132444a = r2;
                                        this.f132445b = r3;
                                    }
                                }, com.ss.android.ugc.aweme.base.m.f68150a);
                            }
                            if (!z) {
                                l.a(aVar.f132421i, new k<h>(baseShortVideoContext) {
                                    /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass8 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ BaseShortVideoContext f132447a;

                                    static {
                                        Covode.recordClassIndex(86708);
                                    }

                                    @Override // com.google.c.h.a.k
                                    public final void onFailure(Throwable th) {
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.google.c.h.a.k
                                    public final /* synthetic */ void onSuccess(h hVar) {
                                        h hVar2 = hVar;
                                        a aVar = a.this;
                                        BaseShortVideoContext baseShortVideoContext = this.f132447a;
                                        if (!aVar.a("uploadCoverTextImage")) {
                                            if (aVar.f132422j == null) {
                                                aVar.f132422j = aVar.f132418f.b(baseShortVideoContext, aVar.y);
                                                l.a(aVar.f132422j, new k<h>() {
                                                    /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass9 */

                                                    static {
                                                        Covode.recordClassIndex(86709);
                                                    }

                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                    @Override // com.google.c.h.a.k
                                                    public final /* synthetic */ void onSuccess(h hVar) {
                                                        String str = a.this.v;
                                                        h.f.b.l.d(str, "");
                                                        gr.a(str, BehaviorType.SUCCESS, "CT", null, null, 24);
                                                    }

                                                    @Override // com.google.c.h.a.k
                                                    public final void onFailure(Throwable th) {
                                                        String str;
                                                        String str2 = a.this.v;
                                                        if (th.getMessage() != null) {
                                                            str = th.getMessage();
                                                        } else {
                                                            str = "";
                                                        }
                                                        h.f.b.l.d(str2, "");
                                                        h.f.b.l.d(str, "");
                                                        gr.a(str2, BehaviorType.FAILED, "CT", "0", str);
                                                        if (a.this.f132414b != null) {
                                                            a.this.f132414b.onError(new et(th, com.ss.android.ugc.aweme.publish.g.c.a.a(com.ss.android.ugc.aweme.publish.g.c.a.d(th))));
                                                        }
                                                    }
                                                }, com.ss.android.ugc.aweme.base.m.f68150a);
                                                aVar.f132422j.b(new d(aVar), com.ss.android.ugc.aweme.base.m.f68150a);
                                            }
                                            l.a(aVar.f132422j, new k<h>(hVar2, baseShortVideoContext) {
                                                /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass10 */

                                                /* renamed from: a  reason: collision with root package name */
                                                final /* synthetic */ h f132428a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ BaseShortVideoContext f132429b;

                                                static {
                                                    Covode.recordClassIndex(86701);
                                                }

                                                @Override // com.google.c.h.a.k
                                                public final void onFailure(Throwable th) {
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // com.google.c.h.a.k
                                                public final /* synthetic */ void onSuccess(h hVar) {
                                                    h hVar2 = hVar;
                                                    com.ss.android.ugc.tools.utils.q.d(this + " onUploadCoverTextImageSuccess");
                                                    if (hVar2 != null) {
                                                        this.f132428a.f118766h = hVar2.f118766h;
                                                    }
                                                    a aVar = a.this;
                                                    BaseShortVideoContext baseShortVideoContext = this.f132429b;
                                                    h hVar3 = this.f132428a;
                                                    if (!aVar.a("createAweme")) {
                                                        aVar.f132424l.a("createAweme() synthetiseResult = " + aVar.f132419g + " \nargs " + baseShortVideoContext);
                                                        if (aVar.f132414b != null) {
                                                            aVar.f132414b.onProgressUpdate(aVar.f132417e.a(3, 0), false);
                                                        }
                                                        C3433a aVar2 = new C3433a();
                                                        aVar2.f132450a = com.google.c.a.o.b(hn.f143067b);
                                                        l.a(aVar.f132418f.a(baseShortVideoContext, hVar3, aVar.f132419g), new k<ai>(baseShortVideoContext, hVar3, aVar2) {
                                                            /* class com.ss.android.ugc.aweme.shortvideo.v.a.a.AnonymousClass2 */

                                                            /* renamed from: a  reason: collision with root package name */
                                                            final /* synthetic */ BaseShortVideoContext f132431a;

                                                            /* renamed from: b  reason: collision with root package name */
                                                            final /* synthetic */ h f132432b;

                                                            /* renamed from: c  reason: collision with root package name */
                                                            final /* synthetic */ C3433a f132433c;

                                                            static {
                                                                Covode.recordClassIndex(86702);
                                                            }

                                                            @Override // com.google.c.h.a.k
                                                            public final void onFailure(Throwable th) {
                                                                int a2 = com.ss.android.ugc.aweme.publish.g.c.a.a(th, 13);
                                                                if (!fe.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
                                                                    a2 = -2;
                                                                }
                                                                gr.c(a.this.v, a2, com.ss.android.ugc.aweme.publish.g.c.a.e(th));
                                                                cr.a().a(9);
                                                                if (a.this.f132414b != null) {
                                                                    a.this.f132414b.onError(new et(th));
                                                                }
                                                            }

                                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                            @Override // com.google.c.h.a.k
                                                            public final /* synthetic */ void onSuccess(ai aiVar) {
                                                                String str;
                                                                ai aiVar2 = aiVar;
                                                                a.this.r = SystemClock.uptimeMillis();
                                                                if (!(a.this.f132419g == null || a.this.f132419g.outputVideoFileInfo == null)) {
                                                                    aiVar2.realVideoHeight = a.this.f132419g.outputVideoFileInfo.getHeight();
                                                                    aiVar2.realVideoWidth = a.this.f132419g.outputVideoFileInfo.getWidth();
                                                                }
                                                                BaseShortVideoContext baseShortVideoContext = this.f132431a;
                                                                if ((baseShortVideoContext instanceof VideoPublishEditModel) && ((VideoPublishEditModel) baseShortVideoContext).mShoutOutsData != null) {
                                                                    aiVar2.shoutoutData = ((VideoPublishEditModel) this.f132431a).mShoutOutsData;
                                                                    com.ss.android.ugc.aweme.shoutouts.d dVar = ((VideoPublishEditModel) this.f132431a).mShoutOutsData;
                                                                    if (com.ss.android.ugc.aweme.shoutouts.d.MODE_CREATE.equals(dVar.getShoutOutsMode()) || com.ss.android.ugc.aweme.shoutouts.d.MODE_EDIT.equals(dVar.getShoutOutsMode())) {
                                                                        aiVar2.shoutOutsType = 1;
                                                                    }
                                                                    if (com.ss.android.ugc.aweme.shoutouts.d.MODE_SEND.equals(dVar.getShoutOutsMode())) {
                                                                        aiVar2.shoutOutsType = 2;
                                                                    }
                                                                }
                                                                gr.e(a.this.v);
                                                                aiVar2.materialId = this.f132432b.f118767i;
                                                                com.ss.android.ugc.aweme.port.in.c.t.a("mus_af_post_video");
                                                                C3433a aVar = this.f132433c;
                                                                if (aVar.f132450a.f53699a) {
                                                                    aVar.f132450a.c();
                                                                    com.ss.android.ugc.aweme.common.r.a("url_upload", new com.ss.android.ugc.tools.f.b().a("duration", com.a.a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) aVar.f132450a.a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f149193a);
                                                                }
                                                                if (a.this.f132414b != null) {
                                                                    cr.a().a(10);
                                                                    a.this.f132414b.onSuccess(aiVar2, false);
                                                                    c cVar = a.this.f132423k;
                                                                    BaseShortVideoContext baseShortVideoContext2 = this.f132431a;
                                                                    boolean z = a.this.t;
                                                                    boolean z2 = a.this.s;
                                                                    if (cVar.f132457f.f53699a) {
                                                                        com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor LOG_END");
                                                                        long a2 = cVar.f132457f.a(TimeUnit.MILLISECONDS);
                                                                        com.ss.android.ugc.aweme.base.o.a("type_av_compose_upload", new com.ss.android.ugc.aweme.app.f.c().a("speed", Float.valueOf((((float) cVar.f132452a.d(baseShortVideoContext2)) * 1.0f) / ((float) a2))).a("processTime", Long.valueOf(a2)).a());
                                                                        com.ss.android.ugc.aweme.shortvideo.v.b.a.a(baseShortVideoContext2, cVar.f132455d, a2, cVar.f132453b, cVar.f132454c, a.this.o, a.this.n, a.this.q, a.this.p, a.this.r, cVar.f132456e, z, a.this.w, a.this.x, z2, a.this.f132419g, cVar.f132452a, a.this.u);
                                                                        com.ss.android.ugc.tools.utils.q.d("PublishDurationMonitor publish_finish ".concat(String.valueOf(a2)));
                                                                        if (com.ss.android.ugc.aweme.settings.i.a()) {
                                                                            com.ss.android.ugc.aweme.app.f.c a3 = new com.ss.android.ugc.aweme.app.f.c().a("video_type", Integer.valueOf(cVar.f132455d));
                                                                            if (a.this.w) {
                                                                                str = "1";
                                                                            } else {
                                                                                str = "0";
                                                                            }
                                                                            com.bytedance.apm.b.a("user_publish_success_rate_parallel", 0, a3.a("retry_publish", str).a("video_upload_type", Integer.valueOf(cVar.f132453b)).a());
                                                                        }
                                                                        cVar.f132457f.c();
                                                                    }
                                                                }
                                                            }

                                                            {
                                                                this.f132431a = r2;
                                                                this.f132432b = r3;
                                                                this.f132433c = r4;
                                                            }
                                                        }, com.ss.android.ugc.aweme.base.m.f68150a);
                                                    }
                                                }

                                                {
                                                    this.f132428a = r2;
                                                    this.f132429b = r3;
                                                }
                                            }, com.ss.android.ugc.aweme.base.m.f68150a);
                                        }
                                    }

                                    {
                                        this.f132447a = r2;
                                    }
                                }, com.ss.android.ugc.aweme.base.m.f68150a);
                                aVar.f132421i.b(new c(aVar), com.ss.android.ugc.aweme.base.m.f68150a);
                            }
                        }
                    }
                }
            }, com.ss.android.ugc.aweme.base.m.f68150a);
            if (i2 == 0) {
                this.t = this.f132418f.e(baseShortVideoContext);
                o oVar = this.f132414b;
                if (oVar != null) {
                    oVar.onProgressUpdate(this.f132417e.a(2, 0), false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r4 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.v.a.a.a(java.lang.String, java.lang.String):void");
    }

    public final void a(boolean z2, com.ss.android.ugc.aweme.app.f.c cVar) {
        String str;
        int i2;
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            com.ss.android.ugc.aweme.au.a.f67096a.a("upload_video_end");
            com.ss.android.ugc.aweme.base.g.a aVar = com.ss.android.ugc.aweme.au.a.f67096a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            if (z2) {
                str = "_success";
            } else {
                str = "_failure";
            }
            aVar.a(sb.append(str).toString());
            com.ss.android.ugc.aweme.app.f.c a2 = a(cVar).a(StringSet.type, "upload_video_end");
            if (z2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            com.ss.android.ugc.aweme.base.o.a("aweme_upload_video_funnel", a2.a("status", Integer.valueOf(i2)).a("extra", com.ss.android.ugc.aweme.au.a.f67096a.a()).a("stack_trace", stackTraceString).a());
            a("upload_video_end", stackTraceString);
        } catch (Exception e2) {
            a(e2);
        }
    }

    public a(j jVar, int i2, int i3, int i4, String str, boolean z2, x<ai> xVar) {
        this.f132418f = jVar;
        this.f132413a = str;
        this.f132415c = i3;
        this.f132416d = i4;
        this.w = z2;
        this.x = i2;
        String str2 = DeviceRegisterManager.getDeviceId() + "-" + SystemClock.uptimeMillis();
        this.v = str2;
        jVar.f128568d = str2;
        jVar.f128569e = z2;
        if (xVar != null) {
            o oVar = new o();
            this.f132414b = oVar;
            oVar.add(new bo(xVar));
        }
        androidx.core.d.a aVar = new androidx.core.d.a();
        this.f132420h = aVar;
        jVar.a(aVar);
        this.f132423k = new c(jVar, i4, str, i3);
        cw cwVar = new cw(this);
        this.f132424l = cwVar;
        cwVar.a("new Publisher() type = ".concat(String.valueOf(i3)));
    }
}
