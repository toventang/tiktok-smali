package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.google.c.a.s;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.d;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.publish.g.c.a;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.s.c;
import com.ss.android.ugc.aweme.shortvideo.upload.c.b;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class z implements k<h> {

    /* renamed from: a  reason: collision with root package name */
    final String f132163a;

    /* renamed from: b  reason: collision with root package name */
    String f132164b;

    /* renamed from: c  reason: collision with root package name */
    private final o f132165c = o.a();

    /* renamed from: d  reason: collision with root package name */
    private final b f132166d;

    /* renamed from: e  reason: collision with root package name */
    private final UploadSpeedInfo f132167e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f132168f;

    /* renamed from: g  reason: collision with root package name */
    private final int f132169g;

    /* renamed from: h  reason: collision with root package name */
    private final String f132170h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f132171i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f132172j;

    /* renamed from: k  reason: collision with root package name */
    private final int f132173k;

    /* renamed from: l  reason: collision with root package name */
    private final String f132174l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f132175m;

    static {
        Covode.recordClassIndex(86561);
    }

    public void a() {
        String str;
        a(true);
        ar b2 = bl.b(this.f132175m);
        String str2 = "1";
        if (this.f132166d.f132102g) {
            str = str2;
        } else {
            str = "0";
        }
        ar a2 = b2.a("click_publish", str);
        if (new File(this.f132163a).exists()) {
            long a3 = this.f132165c.a(TimeUnit.MILLISECONDS);
            a2.a("speed", Float.valueOf(((float) new File(this.f132163a).length()) / ((float) a3))).a("duration", Long.valueOf(a3));
        }
        com.ss.android.ugc.tools.f.b a4 = bl.a(this.f132175m).a("mob_lost_assist", 1);
        if (!this.f132171i) {
            str2 = "0";
        }
        r.a("parallel_publish_result", a4.a("retry_publish", str2).a("shoot_way", this.f132174l).a("status", 82).a("publish_step", 31).a("publish_id", this.f132170h).f149193a);
        q.a("upload_error_parallel", 0, a2.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.h.a.k
    public /* synthetic */ void onSuccess(h hVar) {
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

    @Override // com.google.c.h.a.k
    public void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        a(false);
        String b2 = s.b(th);
        com.ss.android.ugc.tools.utils.q.b("Publisher UploadFailed: ".concat(String.valueOf(b2)));
        int d2 = a.d(th);
        ar a2 = bl.b(this.f132175m).a("exception", b2);
        String str6 = "1";
        if (this.f132166d.f132102g) {
            str = str6;
        } else {
            str = "0";
        }
        q.a("upload_error_parallel", d2, a2.a("click_publish", str).a());
        ar a3 = bl.b(this.f132175m).a("exception", b2).a("event", x.f132161a.a().toString()).a("videoLength", Integer.valueOf(this.f132173k)).a("is_hd_video", Integer.valueOf(this.f132172j ? 1 : 0)).a("shoot_way", this.f132174l).a("is_long_video_allowed", Boolean.valueOf(d.a())).a("long_video_threshold", Long.valueOf(com.ss.android.ugc.aweme.setting.d.a()));
        if (this.f132166d.f132102g) {
            str2 = str6;
        } else {
            str2 = "0";
        }
        q.a("aweme_movie_publish_error_rate_parallel", d2, a3.a("click_publish", str2).a());
        com.ss.android.ugc.tools.f.b a4 = bl.a(this.f132175m).a("status", d2);
        if (this.f132171i) {
            str3 = str6;
        } else {
            str3 = "0";
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("retry_publish", str3).a("shoot_way", this.f132174l);
        if (this.f132166d.c()) {
            str4 = str6;
        } else {
            str4 = "0";
        }
        com.ss.android.ugc.tools.f.b a6 = a5.a("is_synthetic_success", str4).a("synthetic_error_code", this.f132166d.f132099d).a("publish_step", 31).a("error_code", d2);
        if (this.f132166d.f132102g) {
            str5 = str6;
        } else {
            str5 = "0";
        }
        com.ss.android.ugc.tools.f.b a7 = a6.a("click_publish", str5);
        if (!c.a(i.f115645a)) {
            str6 = "0";
        }
        r.a("parallel_publish_result", a7.a("network_available", str6).a("publish_id", this.f132170h).f149193a);
        com.ss.android.ugc.aweme.shortvideo.k.f128613a.a("output file: " + this.f132163a);
        if (this.f132163a != null) {
            com.ss.android.ugc.aweme.shortvideo.k.f128613a.a(" size: " + new File(this.f132163a).length());
        } else {
            com.ss.android.ugc.aweme.shortvideo.k.f128613a.a("output file == null");
        }
    }

    public z(String str, String str2, UploadSpeedInfo uploadSpeedInfo, b bVar, boolean z, boolean z2, String str3, int i2, int i3, String str4, boolean z3, Object obj) {
        this.f132175m = obj;
        this.f132163a = str;
        this.f132164b = str2;
        this.f132167e = uploadSpeedInfo;
        this.f132166d = bVar;
        this.f132168f = z;
        this.f132174l = str3;
        this.f132169g = i2;
        this.f132170h = str4;
        this.f132172j = z2;
        this.f132173k = i3;
        this.f132171i = z3;
    }
}
