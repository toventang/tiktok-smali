package com.ss.android.ugc.aweme.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.utils.bq;

public final class l extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f109583a;

    /* renamed from: b  reason: collision with root package name */
    public String f109584b;

    /* renamed from: c  reason: collision with root package name */
    private String f109585c;

    /* renamed from: d  reason: collision with root package name */
    private String f109586d;

    /* renamed from: e  reason: collision with root package name */
    private String f109587e;
    private String p;
    private Aweme q;
    private String r;

    static {
        Covode.recordClassIndex(70137);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("group_id", this.f109585c, c.a.f109563b);
        a("author_id", this.f109586d, c.a.f109563b);
        Context a2 = d.a();
        if (a2 != null) {
            this.p = String.valueOf(bq.f(a2) / 1024);
        }
        a("memory_usage", this.p);
        a("local_time_ms", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.f109583a)) {
            a("enter_method", this.f109583a, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109556h)) {
            String str = this.f109556h;
            str.hashCode();
            switch (str.hashCode()) {
                case -1382453013:
                    if (str.equals("NOTIFICATION")) {
                        this.f109556h = "notice";
                        break;
                    }
                    break;
                case 2614219:
                    if (str.equals("USER")) {
                        this.f109556h = "profile";
                        break;
                    }
                    break;
                case 482617583:
                    if (str.equals("PUBLISH")) {
                        this.f109556h = "shoot";
                        break;
                    }
                    break;
                case 1055811561:
                    if (str.equals("DISCOVER")) {
                        this.f109556h = "discover";
                        break;
                    }
                    break;
            }
            a("enter_from", this.f109556h);
        }
        if (!TextUtils.isEmpty(this.f109587e)) {
            a("music_id", this.f109587e);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("follow_status", this.r);
        }
        if (!TextUtils.isEmpty(this.f109584b)) {
            a("notice_type", this.f109584b);
        }
    }

    public final l a(String str) {
        this.f109556h = str;
        return this;
    }

    public l(String str) {
        super(str);
        this.f109559k = true;
    }

    public final l f(Aweme aweme) {
        if (aweme != null) {
            this.q = aweme;
            this.f109585c = aweme.getAid();
            this.f109586d = aweme.getAuthorUid();
            this.r = aa.a(aweme);
        }
        return this;
    }
}
