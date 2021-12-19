package com.ss.android.ugc.aweme.publish.g.a;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.publish.g.b;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.r;
import com.ss.android.ugc.aweme.shortvideo.publish.s;
import com.ss.android.ugc.aweme.shortvideo.publish.u;
import com.ss.android.ugc.aweme.shortvideo.s.c;
import com.ss.android.ugc.aweme.shortvideo.upload.n;
import com.ss.android.ugc.tools.utils.q;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class a implements k<ai> {

    /* renamed from: a  reason: collision with root package name */
    private final n f118775a;

    /* renamed from: b  reason: collision with root package name */
    private final String f118776b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f118777c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f118778d;

    /* renamed from: e  reason: collision with root package name */
    private final VideoPublishEditModel f118779e;

    static {
        Covode.recordClassIndex(77142);
    }

    private b a(ar arVar) {
        return new b(arVar).a(this.f118776b).a(this.f118779e).a(r.CREATE_AWEME).a(u.VIDEO).a().a(this.f118777c);
    }

    @Override // com.google.c.h.a.k
    public final void onFailure(Throwable th) {
        String str;
        q.a("PublishDurationMonitor CreateAweme End failed");
        int a2 = com.ss.android.ugc.aweme.publish.g.c.a.a(th, 13);
        String e2 = com.ss.android.ugc.aweme.publish.g.c.a.e(th);
        JSONObject a3 = a(new ar()).b().c().a(new com.ss.android.ugc.aweme.publish.g.b.b(th)).a(s.FAILED).a("server_log_id", e2).a("is_hd_video", Integer.valueOf(this.f118778d ? 1 : 0)).a();
        if (this.f118779e.isMvThemeVideoType() && i.a()) {
            com.bytedance.apm.b.a("aweme_mv_publish_error_rate", a2, a3);
        }
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", a2, a3);
        com.ss.android.ugc.tools.f.b a4 = bl.a(this.f118779e).a("status", a2).a("shoot_way", this.f118779e);
        String str2 = "1";
        if (this.f118777c) {
            str = str2;
        } else {
            str = "0";
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("retry_publish", str).a("publish_id", this.f118776b).a("publish_step", 41).a("error_code", com.ss.android.ugc.aweme.publish.g.c.a.a(th, 13)).a("server_log_id", e2);
        if (!c.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
            str2 = "0";
        }
        com.ss.android.ugc.aweme.common.r.a("parallel_publish_result", a5.a("network_available", str2).f149193a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.h.a.k
    public final /* synthetic */ void onSuccess(ai aiVar) {
        String str;
        q.a("PublishDurationMonitor CreateAweme End success");
        JSONObject a2 = a(new ar()).b().c().a(s.SUCCESS).a("is_hd_video", Integer.valueOf(this.f118778d ? 1 : 0)).a();
        if (this.f118779e.isMvThemeVideoType() && i.a()) {
            com.bytedance.apm.b.a("aweme_mv_publish_error_rate", 0, a2);
        }
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", 0, a2);
        com.ss.android.ugc.tools.f.b a3 = bl.a(this.f118779e).a("status", 0).a("shoot_way", this.f118779e.mShootWay);
        if (this.f118777c) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.aweme.common.r.a("parallel_publish_result", a3.a("retry_publish", str).a("publish_id", this.f118776b).a("publish_step", 41).f149193a);
        n nVar = this.f118775a;
        long length = new File(this.f118779e.mParallelUploadOutputFile).length();
        if (nVar.f132132a.f53699a) {
            if (i.a()) {
                o.a("publish_log_parallel", new ar().a("duration", Long.valueOf(nVar.f132132a.a(TimeUnit.MILLISECONDS))).a("upload_speed", Float.valueOf((((float) length) * 1.0f) / ((float) nVar.f132132a.a(TimeUnit.MILLISECONDS)))).a());
            }
            nVar.f132132a.c();
        }
    }

    public a(n nVar, String str, boolean z, boolean z2, VideoPublishEditModel videoPublishEditModel) {
        String str2;
        this.f118775a = nVar;
        this.f118776b = str;
        this.f118777c = z;
        this.f118778d = z2;
        this.f118779e = videoPublishEditModel;
        com.ss.android.ugc.tools.f.b a2 = bl.a(videoPublishEditModel);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        com.ss.android.ugc.aweme.common.r.a("parallel_publish_result", a2.a("retry_publish", str2).a("shoot_way", videoPublishEditModel.mShootWay).a("publish_step", 40).a("publish_id", str).f149193a);
    }
}
