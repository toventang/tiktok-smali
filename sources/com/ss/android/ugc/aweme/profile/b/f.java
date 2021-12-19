package com.ss.android.ugc.aweme.profile.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;
import h.f.b.l;
import h.m.p;

public final class f extends c<f> {
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f116046a;

    /* renamed from: b  reason: collision with root package name */
    public String f116047b;

    /* renamed from: c  reason: collision with root package name */
    public Long f116048c;

    /* renamed from: d  reason: collision with root package name */
    public String f116049d;

    /* renamed from: e  reason: collision with root package name */
    public String f116050e;
    public Aweme p;
    public String q;
    private String s;

    static {
        Covode.recordClassIndex(74864);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74865);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f() {
        super("profile_tab_client_show");
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("enter_from", this.f109556h, c.a.f109562a);
        a("group_id", this.f116046a, c.a.f109563b);
        a("author_id", this.f116047b, c.a.f109563b);
        if (!TextUtils.isEmpty(this.q)) {
            a("tab_name", this.q, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh")) {
            com.ss.android.ugc.aweme.w.a.a();
        }
        if (TextUtils.equals(this.f109556h, "sticker_profile_detail")) {
            a("tab_name", "effect", c.a.f109562a);
        }
        a("request_id", this.f116050e, c.a.f109563b);
        a("content", this.f116049d, c.a.f109562a);
        if (l.a((Object) "prop_page", (Object) this.f109556h)) {
            a("log_pb", ac.a.f91473a.a(this.f116050e), c.a.f109563b);
        } else {
            a("music_id", String.valueOf(this.f116048c), c.a.f109563b);
            if (l.a((Object) "homepage_fresh", (Object) this.f109556h) || p.a("homepage_channel", this.f109556h, true)) {
                h(this.f116050e);
            }
        }
        if (TextUtils.equals("challenge", this.f109556h)) {
            a("tag_id", this.s);
        }
    }

    public final f a(String str) {
        l.d(str, "");
        this.f109556h = str;
        return this;
    }
}
