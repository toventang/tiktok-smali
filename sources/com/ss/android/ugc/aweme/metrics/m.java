package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.w.a;
import java.util.Locale;

public final class m extends a<m> {
    public String X;
    public String Y;
    public String Z;
    public boolean aa;
    public String ab;
    private String ac;
    private String ad;
    private Aweme ae;
    private String af;
    private String ag;
    private int ah;
    private String ai;
    private String aj;
    private boolean ak;
    private String al;
    private String am;

    /* renamed from: e  reason: collision with root package name */
    public String f109588e;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public boolean u;
    public String v;

    static {
        Covode.recordClassIndex(70138);
    }

    public m() {
        super("enter_music_detail");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        Aweme aweme;
        a("group_id", this.f109588e, c.a.f109563b);
        a("music_id", this.p, c.a.f109563b);
        a("author_id", this.ac, c.a.f109563b);
        a("category_name", this.ab, c.a.f109562a);
        a("request_id", this.q, c.a.f109563b);
        a("is_reposted", new StringBuilder().append(this.ah).toString());
        a("repost_from_group_id", this.ai);
        a("repost_from_user_id", this.aj);
        if (!((BusinessComponentServiceUtils.getBusinessBridgeService().c().toUpperCase(Locale.ROOT).equals("US") && !b.g().isLogin()) || (aweme = this.ae) == null || aweme.getStickerEntranceInfo() == null || this.U.getStickerEntranceInfo().id == null)) {
            a("from_prop_id", this.ae.getStickerEntranceInfo().id);
        }
        a(ForwardStatisticsServiceImpl.b().a(this.ae, this.ad));
        if (g.a().a(this.f109588e)) {
            a("previous_page", "push", c.a.f109562a);
        } else if (!TextUtils.isEmpty(this.s)) {
            a("previous_page", this.s, c.a.f109562a);
            a("previous_page_position", this.t, c.a.f109562a);
        }
        String str2 = "1";
        if (this.u) {
            a("is_instructive", str2, c.a.f109562a);
            a("bottom_bar_show", str2, c.a.f109562a);
        }
        if (ac.a(this.f109556h)) {
            h(this.q);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            a.a();
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("tab_name", this.x);
        }
        if (!TextUtils.isEmpty(this.X)) {
            a(this.X, this.Y, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.v)) {
            a("playlist_type", this.v, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.af)) {
            a("impr_type", this.af, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            a("compilation_id", this.ag, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("process_id", this.r, c.a.f109562a);
        }
        if (h() && !TextUtils.isEmpty(this.Z)) {
            a("enter_position", this.Z);
        }
        a("impr_id", this.q);
        if (i.f79764a) {
            a("is_fullscreen", str2);
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.ak) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            a("relation_type", str);
            a("video_type", this.al);
            a("rec_uid", this.am);
        }
        if (!this.aa) {
            str2 = "0";
        }
        a("ugc_to_pgc_meta", str2);
    }

    public final m o(String str) {
        this.f109556h = str;
        return this;
    }

    /* renamed from: f */
    public final m g(Aweme aweme) {
        String valueOf;
        super.g(aweme);
        if (aweme != null) {
            this.ae = aweme;
            this.q = ac.b(aweme);
            this.f109588e = aweme.getAid();
            this.ac = aweme.getAuthorUid();
            if (aweme.getMusic() == null) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(aweme.getMusic().getId());
            }
            this.p = valueOf;
            this.af = ac.j(aweme);
            if (aweme.getMixInfo() != null) {
                this.ag = aweme.getMixInfo().mixId;
            }
            this.ak = in.a(aweme);
            this.al = ac.k(aweme);
            this.am = ac.l(aweme);
        }
        return this;
    }
}
