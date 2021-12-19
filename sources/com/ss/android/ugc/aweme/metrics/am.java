package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.e.a;
import com.ss.android.ugc.aweme.metrics.c;

public final class am extends h<am> {

    /* renamed from: a  reason: collision with root package name */
    public String f109498a;

    /* renamed from: b  reason: collision with root package name */
    public String f109499b;

    /* renamed from: c  reason: collision with root package name */
    public String f109500c;

    /* renamed from: d  reason: collision with root package name */
    public String f109501d;

    /* renamed from: e  reason: collision with root package name */
    public String f109502e;
    public String p;
    public String q;
    public String r;
    protected String s;
    private String t;
    private Aweme u;

    static {
        Covode.recordClassIndex(70108);
    }

    public am() {
        super("stay_time");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("duration", this.f109498a, c.a.f109562a);
        a("enter_from", this.f109556h, c.a.f109562a);
        a("enter_method", this.s, c.a.f109562a);
        a("group_id", this.f109499b, c.a.f109562a);
        a("author_id", ac.a(this.u), c.a.f109562a);
        a("city_info", "", c.a.f109562a);
        a("page_uid", this.f109502e, c.a.f109562a);
        if (!TextUtils.isEmpty(this.f109501d)) {
            a("previous_page", this.f109501d, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("page_type", this.t, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109501d, "homepage_hot") || TextUtils.equals(this.f109501d, "homepage_follow")) {
            int i2 = !TextUtils.equals(this.f109501d, "homepage_hot") ? 1 : 0;
            a("feeds_group_id", this.f109500c, c.a.f109562a);
            a("log_pb", ac.a.f91473a.a(ac.a(this.f109500c, i2)), c.a.f109562a);
        }
        if (ac.b(this.f109556h)) {
            a("notice_type", a.f96227a);
            a("show_cnt", String.valueOf(a.f96228b));
            a("yellow_dot_logid", a.f96229c);
        }
        if (TextUtils.equals("challenge", this.f109556h)) {
            String str = this.p;
            String str2 = this.q;
            a("process_id", str);
            a("tag_id", str2);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("playlist_id", this.r);
        }
    }

    public final am a(String str) {
        this.f109556h = str;
        return this;
    }

    public final am o(String str) {
        this.s = str;
        return this;
    }

    /* renamed from: f */
    public final am g(Aweme aweme) {
        super.g(aweme);
        this.u = aweme;
        this.f109499b = ac.e(aweme);
        if (!(aweme == null || aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
            this.r = aweme.playlist_info.getMixId();
        }
        return this;
    }
}
