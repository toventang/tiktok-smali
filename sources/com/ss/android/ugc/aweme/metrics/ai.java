package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;

public final class ai extends c {
    private String A;
    private String B;

    /* renamed from: a  reason: collision with root package name */
    public String f109486a;

    /* renamed from: b  reason: collision with root package name */
    public String f109487b;

    /* renamed from: c  reason: collision with root package name */
    public String f109488c;

    /* renamed from: d  reason: collision with root package name */
    public String f109489d;

    /* renamed from: e  reason: collision with root package name */
    public int f109490e;
    public String p;
    public String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private boolean v;
    private String w;
    private String x;
    private String y;
    private int z;

    static {
        Covode.recordClassIndex(70104);
    }

    public ai() {
        super("shoot");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("shoot_way", this.f109486a, c.a.f109562a);
        if (!TextUtils.isEmpty(this.q)) {
            a("enter_from", this.q);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("music_id", this.r, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.f109487b)) {
            a("group_id", this.f109487b, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("tag_id", this.s, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("sticker_id", this.t, c.a.f109563b);
        }
        a("content_type", this.f109488c, c.a.f109562a);
        a("content_cnt", String.valueOf(this.f109490e), c.a.f109562a);
        a("creation_id", this.p, c.a.f109562a);
        a("content_source", this.f109489d, c.a.f109562a);
        a("is_reposted", new StringBuilder().append(this.z).toString());
        a("repost_from_group_id", this.A);
        a("repost_from_user_id", this.B);
        if (this.v) {
            a("log_pb", this.u, c.a.f109562a);
        }
        if (g.a().a(this.f109487b)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.w)) {
            a("coupon_code", this.w);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("supplier_id", this.x);
        }
        if (!TextUtils.isEmpty(this.y)) {
            a("order_id", this.y);
        }
        UgCommonServiceImpl.j().a().a("shoot", "");
    }
}
