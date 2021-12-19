package com.ss.android.ugc.aweme.shortvideo.v.c;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.eo;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.upload.u;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.ss.android.ugc.aweme.shortvideo.util.bs;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.aweme.utils.hn;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.aj;
import dmt.av.video.m;
import h.p;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f132468a;

    /* renamed from: b  reason: collision with root package name */
    public long f132469b;

    /* renamed from: c  reason: collision with root package name */
    public long f132470c;

    /* renamed from: d  reason: collision with root package name */
    public long f132471d;

    /* renamed from: e  reason: collision with root package name */
    public long f132472e;

    /* renamed from: f  reason: collision with root package name */
    public String f132473f;

    /* renamed from: g  reason: collision with root package name */
    public final int f132474g;

    /* renamed from: h  reason: collision with root package name */
    public final int f132475h;

    /* renamed from: i  reason: collision with root package name */
    public SynthetiseResult f132476i;

    /* renamed from: j  reason: collision with root package name */
    public final String f132477j;

    /* renamed from: k  reason: collision with root package name */
    public double f132478k;

    /* renamed from: l  reason: collision with root package name */
    public long f132479l;

    /* renamed from: m  reason: collision with root package name */
    public String f132480m;
    public final String n;
    public final boolean o;
    public b p;
    public eo q;
    public C3434a r;
    public final c s;
    public final j t;
    public boolean u;
    public boolean v;
    public final int w;
    private boolean x;

    static {
        Covode.recordClassIndex(86719);
    }

    public static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a(boolean z, SynthetiseResult synthetiseResult, Throwable th, Object obj) {
        String str;
        String e2;
        String th2;
        int i2;
        int i3;
        int i4;
        int i5;
        this.v = true;
        String str2 = synthetiseResult != null ? "encode:" + synthetiseResult.synthetiseCPUEncode : "";
        if (z) {
            gr.c(this.n, str2);
            q.d("Publisher synthetise() finished, result = ".concat(String.valueOf(synthetiseResult)));
            this.f132476i = synthetiseResult;
        } else {
            gr.a(this.n, com.ss.android.ugc.aweme.publish.g.c.a.b(th), th.getMessage());
            q.d("Publisher synthetise failed");
            cr.a().a(9);
        }
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (z) {
            str = "success_synthetise";
        } else {
            str = "failed_synthetise";
        }
        r.a("av_memory_log", bVar.a("scene", str).a("shoot_way", this.f132477j).a("synthetise_start", z ? "success" : "failed").a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
        this.f132469b = SystemClock.uptimeMillis();
        long j2 = 0;
        this.f132479l = this.f132479l > 0 ? hn.f143067b.a() - this.f132479l : 0;
        Locale locale = Locale.US;
        double d2 = (double) this.f132479l;
        Double.isNaN(d2);
        String a2 = com.a.a(locale, "%d", new Object[]{Integer.valueOf((int) (d2 / 1000000.0d))});
        com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("duration", a2).a("status", String.valueOf(z ? 1 : 0));
        if ("upload".equals(this.f132473f)) {
            e2 = com.ss.android.ugc.aweme.property.b.f();
        } else {
            e2 = com.ss.android.ugc.aweme.property.b.e();
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("resolution", e2).a("is_hardcode", com.ss.android.ugc.aweme.property.b.a() ? "1" : "0").a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("video_quality", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.d()).toString()).a("_perf_monitor", "1").a("fps", new StringBuilder().append(this.f132478k).toString()).a("is_hd_setting", m.a(obj) ? 1 : 0).a("current_page", this.u ? "homepage_follow" : "video_post_page");
        if (th == null) {
            th2 = null;
        } else {
            th2 = th.toString();
        }
        a4.a("fail_info", th2);
        if (th instanceof ee) {
            a4.a("error_code", new StringBuilder().append(((ee) th).getCode()).toString());
        }
        if (this.f132474g == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (i.a(videoPublishEditModel.mOutputFile)) {
                j2 = h.i(videoPublishEditModel.mOutputFile);
                i2 = aj.c(videoPublishEditModel.mOutputFile);
                if (!(synthetiseResult == null || synthetiseResult.outputVideoFileInfo == null)) {
                    i3 = synthetiseResult.outputVideoFileInfo.getCodecType();
                    i4 = synthetiseResult.outputVideoFileInfo.getGop();
                }
                i3 = -1;
                i4 = -1;
            } else {
                i2 = 0;
                i3 = -1;
                i4 = -1;
            }
            int[] a5 = bb.a(videoPublishEditModel.getPreviewInfo());
            int i6 = a5 != null ? a5[8] : -1;
            p<Integer, Integer> a6 = com.ss.android.ugc.tools.utils.m.a(videoPublishEditModel);
            if (a6.getFirst().intValue() + a6.getSecond().intValue() > 1) {
                i5 = 1;
            } else {
                i5 = a6.getFirst().intValue() + a6.getSecond().intValue() == 1 ? 0 : -1;
            }
            this.x = videoPublishEditModel.isSyntheticHardEncode;
            a4.a("compose_coding", videoPublishEditModel.isSyntheticHardEncode ? "hardcoding" : "softcoding").a("file_bitrate", i2).a("file_size", com.a.a(Locale.US, "%d", new Object[]{Long.valueOf(j2 / 1024)})).a("codec_type", i3).a("gop", i4).a("source_codec_type", i6).a("original_resolution", bp.o(videoPublishEditModel)).a("is_multi_content", i5);
            if (e.b(videoPublishEditModel.getLocalTempPath())) {
                j2 += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (videoPublishEditModel.getLocalFinalPath() != null) {
                j2 += h.i(videoPublishEditModel.getLocalFinalPath());
            }
            com.ss.android.ugc.aweme.shortvideo.upload.r.a(this.f132480m, j2);
            u.a a7 = com.ss.android.ugc.aweme.shortvideo.upload.r.a();
            if (a7 != null) {
                a4.a("init_available_size_mb", (int) a7.f132149a).a("max_publish_usage_mb", (int) a7.f132150b).a("available_size_detail", a7.f132151c);
            }
            a4.a("select_gear_by_upload_speed", videoPublishEditModel.getUploadSpeedSettingsIndex());
            a4.a("creation_id", videoPublishEditModel.creationId).a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds)).a("effect_list", videoPublishEditModel.getEditEffectList()).a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).a("prop_list", videoPublishEditModel.mStickerID).a("publish_type", this.w).a("beautify_used", videoPublishEditModel.faceBeautyOpen).a("publish_id", this.n).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.f68624a).a("content_type", videoPublishEditModel.getAvetParameter().getContentType()).a("is_hd_video", m.b(videoPublishEditModel) ? 1 : 0).a("content_source", videoPublishEditModel.getAvetParameter().getContentSource()).a("source_duration", synthetiseResult != null ? synthetiseResult.outputVideoFileInfo.getDuration() : -1);
            com.ss.android.ugc.aweme.shortvideo.v.b.a.a(a4, synthetiseResult, obj);
            if (videoPublishEditModel.hardcodeAdaptiveResult != null) {
                a4.a("hw_opt_bitrate_set_result", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getHwOptBitrate()));
                a4.a("pre_bitrate_status", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
        }
        a4.a("publish_cnt", g.a().o().c() ? g.a().o().d() : 0);
        r.a("video_compose_end", a4.f149193a);
        q.d("Publisher uploadSynthetiseEndEvent: ".concat(String.valueOf(a2)));
    }

    public final void a(boolean z, Throwable th, com.ss.android.ugc.aweme.publish.f.h hVar, Object obj) {
        String str = "";
        if (z) {
            gr.d(this.n);
            try {
                a(true, new com.ss.android.ugc.aweme.shortvideo.ar().a("resultCode", com.ss.android.ugc.aweme.port.in.c.f115623b.b(hVar)).a("args", com.ss.android.ugc.aweme.port.in.c.f115623b.b(obj)).a("result", com.ss.android.ugc.aweme.port.in.c.f115623b.b(hVar)));
            } catch (Exception e2) {
                a(e2);
            }
        } else {
            gr.b(this.n, com.ss.android.ugc.aweme.publish.g.c.a.d(th), th.getMessage() != null ? th.getMessage() : str);
            try {
                a(false, new com.ss.android.ugc.aweme.shortvideo.ar().a("throwable", Log.getStackTraceString(th)).a("args", com.ss.android.ugc.aweme.port.in.c.f115623b.b(obj)).a("result", com.ss.android.ugc.aweme.port.in.c.f115623b.b(hVar)));
            } catch (Exception e3) {
                a(e3);
            }
            cr.a().a(9);
        }
        this.f132471d = SystemClock.uptimeMillis();
        if (!a(this.f132475h)) {
            d dVar = null;
            if (hVar instanceof d) {
                dVar = (d) hVar;
            }
            eo eoVar = this.q;
            if (th != null) {
                str = th.toString();
            }
            eoVar.a(z, str, null, true, dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.c.a$a  reason: collision with other inner class name */
    public static class C3434a {

        /* renamed from: a  reason: collision with root package name */
        public o f132481a;

        /* renamed from: b  reason: collision with root package name */
        private Object f132482b;

        static {
            Covode.recordClassIndex(86720);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f132481a.f53699a) {
                this.f132481a.c();
                r.a("url_upload", bl.a(this.f132482b).a("duration", com.a.a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f132481a.a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f149193a);
            }
        }

        public C3434a(Object obj) {
            this.f132482b = obj;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public o f132483a;

        static {
            Covode.recordClassIndex(86721);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f132483a.f53699a) {
                this.f132483a.c();
                r.a("get_video_key", new com.ss.android.ugc.tools.f.b().a("duration", com.a.a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f132483a.a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f149193a);
            }
        }
    }

    public static void a(Throwable th) {
        try {
            com.ss.android.ugc.aweme.df.q.a("aweme_upload_video_funnel", new com.ss.android.ugc.aweme.shortvideo.ar().a(StringSet.type, "pure_exception").a("exception", Log.getStackTraceString(th)).a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final com.ss.android.ugc.aweme.shortvideo.ar a(com.ss.android.ugc.aweme.shortvideo.ar arVar) {
        if (arVar == null) {
            arVar = new com.ss.android.ugc.aweme.shortvideo.ar();
        }
        arVar.a("video_type", Integer.valueOf(this.f132474g)).a("item_type", this.t.getClass().getSimpleName());
        return arVar;
    }

    private void a(boolean z, com.ss.android.ugc.aweme.shortvideo.ar arVar) {
        String str;
        int i2;
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            com.ss.android.ugc.aweme.au.a.f67096a.a("upload_video_end");
            com.ss.android.ugc.aweme.base.g.a aVar = com.ss.android.ugc.aweme.au.a.f67096a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            if (z) {
                str = "_success";
            } else {
                str = "_failure";
            }
            aVar.a(sb.append(str).toString());
            com.ss.android.ugc.aweme.shortvideo.ar a2 = a(arVar).a(StringSet.type, "upload_video_end");
            if (z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            com.ss.android.ugc.aweme.df.q.a("aweme_upload_video_funnel", a2.a("status", Integer.valueOf(i2)).a("extra", com.ss.android.ugc.aweme.au.a.f67096a.a()).a("stack_trace", stackTraceString).a());
            a("upload_video_end", stackTraceString);
        } catch (Exception e2) {
            a(e2);
        }
    }

    public final void a(String str, String str2) {
        JSONObject optJSONObject = com.ss.android.ugc.aweme.au.a.f67096a.b().optJSONObject("events");
        if (optJSONObject.optInt("upload_video_start") < optJSONObject.optInt("upload_video_end")) {
            com.ss.android.ugc.aweme.df.q.a("aweme_upload_video_funnel", a((com.ss.android.ugc.aweme.shortvideo.ar) null).a(StringSet.type, str + "_abnormal_counting").a("extra", com.ss.android.ugc.aweme.au.a.f67096a.a()).a("stack_trace", str2).a());
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        j f132484a;

        /* renamed from: b  reason: collision with root package name */
        int f132485b;

        /* renamed from: c  reason: collision with root package name */
        String f132486c;

        /* renamed from: d  reason: collision with root package name */
        int f132487d;

        /* renamed from: e  reason: collision with root package name */
        public long f132488e;

        /* renamed from: f  reason: collision with root package name */
        public o f132489f;

        static {
            Covode.recordClassIndex(86722);
        }

        /* access modifiers changed from: package-private */
        public final void a(Object obj, boolean z, boolean z2) {
            if (this.f132489f.f53699a) {
                b(obj, z, z2);
                this.f132489f.c();
            }
        }

        private void b(Object obj, boolean z, boolean z2) {
            String str;
            q.a("PublishDurationMonitor LOG_END");
            long a2 = this.f132489f.a(TimeUnit.MILLISECONDS);
            com.ss.android.ugc.aweme.df.q.a("type_av_compose_upload", bl.b(obj).a("speed", Float.valueOf((((float) this.f132484a.d(obj)) * 1.0f) / ((float) a2))).a("processTime", Long.valueOf(a2)).a());
            com.ss.android.ugc.aweme.shortvideo.v.b.a.a(obj, this.f132487d, a2, this.f132485b, this.f132486c, a.this.f132469b, a.this.f132468a, a.this.f132471d, a.this.f132470c, a.this.f132472e, this.f132488e, z, a.this.o, a.this.w, z2, a.this.f132476i, this.f132484a, a.this.q);
            q.d("PublishDurationMonitor publish_finish ".concat(String.valueOf(a2)));
            if (com.ss.android.ugc.aweme.settings.i.a()) {
                com.ss.android.ugc.aweme.shortvideo.ar a3 = bl.b(obj).a("video_type", Integer.valueOf(this.f132487d));
                if (a.this.o) {
                    str = "1";
                } else {
                    str = "0";
                }
                com.ss.android.ugc.aweme.df.q.a("user_publish_success_rate_parallel", 0, a3.a("retry_publish", str).a("video_upload_type", Integer.valueOf(this.f132485b)).a());
            }
        }

        c(j jVar, int i2, String str, int i3) {
            this.f132484a = jVar;
            this.f132485b = i2;
            this.f132486c = str;
            this.f132487d = i3;
        }
    }

    public final void a(boolean z, com.ss.android.ugc.aweme.publish.f.h hVar, Throwable th) {
        if (z) {
            gr.d(this.n, bs.a(hVar));
            this.p.a();
            q.d("Publisher create video finished.");
            return;
        }
        int a2 = com.ss.android.ugc.aweme.publish.g.c.a.a(th, 11);
        if (!fe.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
            a2 = -2;
        }
        gr.a(this.n, a2, com.ss.android.ugc.aweme.publish.g.c.a.e(th), th.getMessage());
        q.d("Publisher create video failed.");
        cr.a().a(9);
    }

    public final void a(boolean z, com.ss.android.ugc.aweme.publish.f.h hVar, ai aiVar, Throwable th, Object obj, boolean z2) {
        if (z) {
            this.f132472e = SystemClock.uptimeMillis();
            gr.e(this.n);
            aiVar.materialId = hVar.f118767i;
            com.ss.android.ugc.aweme.port.in.c.t.a("mus_af_post_video");
            this.r.a();
            cr.a().a(10);
            this.s.a(obj, z2, this.x);
            return;
        }
        int a2 = com.ss.android.ugc.aweme.publish.g.c.a.a(th, 13);
        if (!fe.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
            a2 = -2;
        }
        gr.c(this.n, a2, com.ss.android.ugc.aweme.publish.g.c.a.e(th));
        cr.a().a(9);
    }

    public a(j jVar, int i2, int i3, int i4, String str, String str2, boolean z) {
        this.t = jVar;
        this.f132477j = str2;
        this.f132474g = i3;
        this.f132475h = i4;
        this.o = z;
        this.n = str;
        this.w = i2;
        this.s = new c(jVar, i4, str2, i3);
    }
}
