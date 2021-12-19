package com.ss.android.ugc.aweme.publish.g.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.publish.g.b.f;
import com.ss.android.ugc.aweme.publish.g.c.a;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.k;
import com.ss.android.ugc.aweme.shortvideo.publish.s;
import com.ss.android.ugc.aweme.shortvideo.publish.u;
import com.ss.android.ugc.aweme.shortvideo.upload.c.b;
import com.ss.android.ugc.aweme.shortvideo.upload.z;
import h.f.b.l;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class c extends z {

    /* renamed from: c  reason: collision with root package name */
    private final o f118781c;

    /* renamed from: d  reason: collision with root package name */
    private final b f118782d;

    /* renamed from: e  reason: collision with root package name */
    private final String f118783e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f118784f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f118785g;

    /* renamed from: h  reason: collision with root package name */
    private final VideoPublishEditModel f118786h;

    static {
        Covode.recordClassIndex(77144);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.z
    public final void a() {
        String str;
        a(true);
        ar a2 = a(new ar()).b().c().a(s.SUCCESS);
        String str2 = "1";
        if (this.f118782d.f132102g) {
            str = str2;
        } else {
            str = "0";
        }
        ar a3 = a2.a("click_publish", str);
        if (new File(this.f118786h.mParallelUploadOutputFile).exists()) {
            long a4 = this.f118781c.a(TimeUnit.MILLISECONDS);
            a3.a("speed", Float.valueOf(((float) new File(this.f118786h.mParallelUploadOutputFile).length()) / ((float) a4))).a("duration", Long.valueOf(a4));
        }
        JSONObject a5 = a3.a();
        if (i.a()) {
            q.a("upload_error_parallel", 0, a5);
        }
        q.a("aweme_movie_publish_error_rate_parallel", 0, a5);
        com.ss.android.ugc.tools.f.b a6 = bl.a(this.f118786h).a("mob_lost_assist", 1);
        if (!this.f118784f) {
            str2 = "0";
        }
        r.a("parallel_publish_result", a6.a("retry_publish", str2).a("shoot_way", this.f118786h.mShootWay).a("status", 82).a("publish_step", 31).a("publish_id", this.f118783e).f149193a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.z, com.google.c.h.a.k
    public final /* synthetic */ void onSuccess(h hVar) {
        a();
    }

    private static void a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Upload End ");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        com.ss.android.ugc.tools.utils.q.a(sb.append(str).toString());
    }

    private com.ss.android.ugc.aweme.publish.g.b a(ar arVar) {
        return new com.ss.android.ugc.aweme.publish.g.b(arVar).a(this.f118783e).a(this.f118786h).a(com.ss.android.ugc.aweme.shortvideo.publish.r.UPLOAD).a(u.VIDEO).a().a(this.f118784f);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.z, com.google.c.h.a.k
    public final void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        a(false);
        String str6 = "";
        if (th != null) {
            String b2 = com.google.c.a.s.b(th);
            l.b(b2, str6);
            str6 = b2;
        }
        com.ss.android.ugc.tools.utils.q.b("Publisher UploadFailed: ".concat(String.valueOf(str6)));
        int d2 = a.d(th);
        String str7 = "1";
        if (i.a()) {
            ar a2 = bl.b(this.f118786h).a("exception", str6);
            if (this.f118782d.f132102g) {
                str5 = str7;
            } else {
                str5 = "0";
            }
            q.a("upload_error_parallel", d2, a2.a("click_publish", str5).a());
        }
        ar a3 = a(new ar()).b().c().a(new f(th)).a(s.FAILED).a("is_hd_video", Integer.valueOf(this.f118785g ? 1 : 0));
        if (this.f118782d.f132102g) {
            str = str7;
        } else {
            str = "0";
        }
        q.a("aweme_movie_publish_error_rate_parallel", d2, a3.a("click_publish", str).a());
        com.ss.android.ugc.tools.f.b a4 = bl.a(this.f118786h).a("status", d2);
        if (this.f118784f) {
            str2 = str7;
        } else {
            str2 = "0";
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("retry_publish", str2).a("shoot_way", this.f118786h.mShootWay);
        if (this.f118782d.c()) {
            str3 = str7;
        } else {
            str3 = "0";
        }
        com.ss.android.ugc.tools.f.b a6 = a5.a("is_synthetic_success", str3).a("synthetic_error_code", this.f118782d.f132099d).a("publish_step", 31).a("error_code", d2);
        if (this.f118782d.f132102g) {
            str4 = str7;
        } else {
            str4 = "0";
        }
        com.ss.android.ugc.tools.f.b a7 = a6.a("click_publish", str4);
        if (!com.ss.android.ugc.aweme.shortvideo.s.c.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
            str7 = "0";
        }
        r.a("parallel_publish_result", a7.a("network_available", str7).a("publish_id", this.f118783e).f149193a);
        k.f128613a.a("output file: " + this.f118786h.mParallelUploadOutputFile);
        if (this.f118786h.mParallelUploadOutputFile != null) {
            k.f128613a.a(" size: " + new File(this.f118786h.mParallelUploadOutputFile).length());
        } else {
            k.f128613a.a("output file == null");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.ss.android.ugc.aweme.shortvideo.upload.c.b r19, boolean r20, boolean r21, int r22, java.lang.String r23, boolean r24, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.g.a.c.<init>(com.ss.android.ugc.aweme.shortvideo.upload.c.b, boolean, boolean, int, java.lang.String, boolean, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}
