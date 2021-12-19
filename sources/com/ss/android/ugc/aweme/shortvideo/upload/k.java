package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.publish.g.c.a;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.r;
import com.ss.android.ugc.aweme.shortvideo.publish.s;
import com.ss.android.ugc.aweme.shortvideo.publish.u;
import com.ss.android.ugc.aweme.shortvideo.s.c;
import com.ss.android.ugc.aweme.shortvideo.upload.c.b;
import com.ss.android.ugc.aweme.shortvideo.util.bs;
import org.json.JSONObject;

public final class k implements com.google.c.h.a.k<h> {

    /* renamed from: a  reason: collision with root package name */
    private final String f132125a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f132126b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f132127c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f132128d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f132129e;

    /* renamed from: f  reason: collision with root package name */
    private final b f132130f;

    /* renamed from: g  reason: collision with root package name */
    private final VideoPublishEditModel f132131g;

    static {
        Covode.recordClassIndex(86542);
    }

    public final synchronized boolean a() {
        MethodCollector.i(9814);
        this.f132126b = true;
        if (!this.f132127c) {
            MethodCollector.o(9814);
            return true;
        }
        MethodCollector.o(9814);
        return false;
    }

    private com.ss.android.ugc.aweme.publish.g.b a(ar arVar) {
        return new com.ss.android.ugc.aweme.publish.g.b(arVar).a(this.f132125a).a(this.f132131g).a(r.AUTH_KEY).a(u.VIDEO).a().b().a(this.f132128d);
    }

    @Override // com.google.c.h.a.k
    public final synchronized void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        MethodCollector.i(9642);
        int a2 = a.a(th, 11);
        ar a3 = a(new ar()).c().a(new com.ss.android.ugc.aweme.publish.g.b.a(th)).a(s.FAILED);
        int i2 = 1;
        if (i.a()) {
            if (this.f132130f.f132102g) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            com.bytedance.apm.b.a("fetch_upload_parameters_error_parallel", 1, a3.a("click_publish", str5).a());
        }
        this.f132127c = true;
        if (!this.f132126b) {
            if (this.f132130f.f132102g) {
                str = "1";
            } else {
                str = "0";
            }
            ar a4 = a3.a("click_publish", str);
            if (!this.f132129e) {
                i2 = 0;
            }
            com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", a2, a4.a("is_hd_video", Integer.valueOf(i2)).a());
            String e2 = a.e(th);
            com.ss.android.ugc.tools.f.b a5 = bl.a(this.f132131g).a("status", a2).a("shoot_way", this.f132131g.mShootWay);
            if (this.f132128d) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            com.ss.android.ugc.tools.f.b a6 = a5.a("retry_publish", str2).a("publish_step", 21).a("error_code", a.a(th, 11)).a("server_log_id", e2);
            if (this.f132130f.f132102g) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            com.ss.android.ugc.tools.f.b a7 = a6.a("click_publish", str3);
            if (c.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            com.ss.android.ugc.aweme.common.r.a("parallel_publish_result", a7.a("network_available", str4).a("publish_id", this.f132125a).f149193a);
        }
        MethodCollector.o(9642);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.h.a.k
    public final /* synthetic */ void onSuccess(h hVar) {
        String str;
        String str2;
        h hVar2 = hVar;
        JSONObject a2 = a(new ar()).c().a(s.SUCCESS).a();
        if (i.a()) {
            com.bytedance.apm.b.a("fetch_upload_parameters_error_parallel", 0, a2);
        }
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", 0, a2);
        com.ss.android.ugc.tools.f.b a3 = bl.a(this.f132131g).a("mob_lost_assist", 1).a("shoot_way", this.f132131g.mShootWay);
        if (this.f132128d) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("retry_publish", str).a("status", 81).a("publish_step", 21);
        g b2 = bs.b(hVar2);
        if (b2 == null || (str2 = b2.toString()) == null) {
            str2 = "";
        }
        com.ss.android.ugc.aweme.common.r.a("parallel_publish_result", a4.a("auth_key", str2).a("publish_id", this.f132125a).f149193a);
    }

    public k(String str, boolean z, boolean z2, boolean z3, VideoPublishEditModel videoPublishEditModel, b bVar) {
        String str2;
        this.f132125a = str;
        this.f132126b = z;
        this.f132128d = z2;
        this.f132129e = z3;
        this.f132130f = bVar;
        this.f132131g = videoPublishEditModel;
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", -1, a(new ar()).c().a(s.START).a("is_hd_video", Integer.valueOf(z3 ? 1 : 0)).a());
        com.ss.android.ugc.tools.f.b a2 = bl.a(videoPublishEditModel).a("status", -1).a("shoot_way", videoPublishEditModel.mShootWay);
        if (z2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        com.ss.android.ugc.aweme.common.r.a("parallel_publish_result", a2.a("retry_publish", str2).a("publish_step", 20).a("publish_id", str).f149193a);
    }
}
