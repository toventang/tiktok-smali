package com.ss.android.ugc.trill.share.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    a f150653a;

    static {
        Covode.recordClassIndex(99069);
    }

    public g(a aVar) {
        this.f150653a = aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        r.a("client_watermark_end", new d().a("end_watermark", currentTimeMillis).a("watermark_id", this.f150653a.f150656c).a("duration", currentTimeMillis - this.f150653a.f150654a).a("watermark_sdk", this.f150653a.f150655b).a("watermark_type", this.f150653a.f150657d).a("is_self_video", this.f150653a.f150658e).a("is_composer_watermark_success", i2).f66730a);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f150654a;

        /* renamed from: b  reason: collision with root package name */
        int f150655b;

        /* renamed from: c  reason: collision with root package name */
        String f150656c;

        /* renamed from: d  reason: collision with root package name */
        String f150657d;

        /* renamed from: e  reason: collision with root package name */
        int f150658e;

        /* renamed from: f  reason: collision with root package name */
        boolean f150659f;

        /* renamed from: g  reason: collision with root package name */
        Aweme f150660g;

        static {
            Covode.recordClassIndex(99070);
        }

        public a(Aweme aweme, String str) {
            this.f150660g = aweme;
            this.f150658e = com.ss.android.ugc.aweme.feed.share.a.a.a(aweme) ? 1 : 0;
            this.f150656c = com.bytedance.common.utility.d.b(str + AppLog.getServerDeviceId() + System.currentTimeMillis());
        }
    }
}
