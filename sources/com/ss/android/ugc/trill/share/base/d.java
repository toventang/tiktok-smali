package com.ss.android.ugc.trill.share.base;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import java.io.File;
import java.util.concurrent.Callable;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f150640f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f150641a;

    /* renamed from: b  reason: collision with root package name */
    public long f150642b;

    /* renamed from: c  reason: collision with root package name */
    public int f150643c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f150644d;

    /* renamed from: e  reason: collision with root package name */
    public String f150645e;

    static {
        Covode.recordClassIndex(99064);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(99065);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f150646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f150647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f150648c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f150649d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f150650e;

        static {
            Covode.recordClassIndex(99066);
        }

        b(d dVar, String str, long j2, String str2, long j3) {
            this.f150646a = dVar;
            this.f150647b = str;
            this.f150648c = j2;
            this.f150649d = str2;
            this.f150650e = j3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String d2 = cs.d(this.f150647b);
            long length = new File(this.f150647b).length();
            this.f150646a.a(this.f150648c, length, 0, "", false, this.f150649d);
            boolean equals = TextUtils.equals(d2, "20");
            c cVar = new c();
            long j2 = this.f150650e;
            long j3 = 0;
            if (j2 != 0) {
                j3 = length / j2;
            }
            com.bytedance.apm.b.a("aweme_download_error_rate", 0, cVar.a("Download_Rate", Long.valueOf(j3)).a("Download_duration", Long.valueOf(this.f150650e)).a("file_size", Long.valueOf(length)).a("errorDesc", "success").a("errorCode", (Integer) -1).a("url", this.f150646a.f150645e).a("isMp4", Boolean.valueOf(equals)).a());
            return null;
        }
    }

    public final d a(boolean z) {
        this.f150643c = z ? 1 : 0;
        return this;
    }

    public final d a(Aweme aweme) {
        l.d(aweme, "");
        this.f150644d = aweme;
        return this;
    }

    public final d a(ACLCommonShare aCLCommonShare) {
        int i2 = 0;
        if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 3) {
            i2 = 1;
        }
        this.f150641a = i2;
        return this;
    }

    public final void a(long j2, long j3, int i2, String str, boolean z, String str2) {
        l.d(str2, "");
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("end_download", System.currentTimeMillis()).a("package_size", j3).a("duration", j2 - this.f150642b).a("is_self_video", this.f150643c);
        Aweme aweme = this.f150644d;
        if (aweme == null) {
            l.a("mAweme");
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("aweme_id", aweme.getAid()).a("download_url", this.f150645e).a("is_server_watermark", this.f150641a);
        l.b(a3, "");
        Aweme aweme2 = this.f150644d;
        if (aweme2 == null) {
            l.a("mAweme");
        }
        com.ss.android.ugc.aweme.app.f.d a4 = com.ss.android.ugc.aweme.upvote.event.c.a(a3, aweme2, str2);
        if (j3 == -1) {
            a4.a("error_code", i2).a("retry_failed", z ? 1 : 0).a("error_message", str);
        }
        r.a("download_end", a4.f66730a);
    }
}
