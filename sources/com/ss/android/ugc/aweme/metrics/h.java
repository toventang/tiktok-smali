package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.metrics.h;
import com.ss.android.ugc.aweme.w.a;

public abstract class h<E extends h> extends c {
    protected Boolean A = false;
    protected String B;
    protected String C;
    protected String D;
    protected int E = 0;
    protected String F;
    protected String G;
    protected String H;
    protected String I;
    protected String J;
    protected String K;
    protected String L;
    protected String M;
    protected String N;
    protected String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    protected Aweme U;
    public int V = -1;
    public String W = "";

    /* renamed from: a  reason: collision with root package name */
    private String f109573a;

    /* renamed from: b  reason: collision with root package name */
    private String f109574b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f109575c = "";
    protected String w;
    protected String x;
    protected String y;
    protected Boolean z = false;

    static {
        Covode.recordClassIndex(70132);
    }

    /* access modifiers changed from: protected */
    public String j() {
        return "";
    }

    public final boolean i() {
        if (!TextUtils.equals(this.f109556h, "others_homepage") || TextUtils.isEmpty(this.O)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        if (TextUtils.equals(this.f109556h, "general_search") || TextUtils.equals(this.f109556h, "search_result") || TextUtils.equals(this.f109556h, "search_ecommerce") || TextUtils.equals(this.f109556h, "search_music") || i()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public void d() {
        String str;
        if ("homepage_country".equals(this.f109556h) && !TextUtils.isEmpty(this.w)) {
            a("country_name", this.w, c.a.f109562a);
        }
        if (("others_homepage".equals(this.f109556h) || "collection_video".equals(this.f109556h) || "personal_homepage".equals(this.f109556h) || "playlist".equals(this.f109556h)) && !TextUtils.isEmpty(this.x)) {
            a("tab_name", this.x, c.a.f109562a);
            a("order", this.y, c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            a.a();
        }
        if (!TextUtils.isEmpty(this.f109557i)) {
            if (TextUtils.equals(this.f109556h, "homepage_fresh_topic") || this.f109558j) {
                a("topic_name", this.f109557i, c.a.f109562a);
            } else {
                a("trending_topic", this.f109557i, c.a.f109562a);
            }
        }
        if ("discovery_category".equals(this.f109556h) && !TextUtils.isEmpty(this.x)) {
            a("discovery_category", this.x, c.a.f109562a);
            a("order", this.y, c.a.f109562a);
        }
        a("enter_from", this.f109556h, c.a.f109562a);
        if (this.E != 0) {
            a("topic_type", new StringBuilder().append(this.E).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.L)) {
            a("is_from_trending_card", this.L);
        }
        if (!TextUtils.isEmpty(this.M)) {
            a("trending_topic", this.M);
        }
        if (!TextUtils.isEmpty(this.N)) {
            a("trending_topic_id", this.N);
        }
        if (TextUtils.equals(this.f109556h, "general_search")) {
            a("video_tag", this.f109561m);
        }
        if (h()) {
            a("rank", this.n, c.a.f109562a);
            if (i.f79764a) {
                str = "1";
            } else {
                str = "0";
            }
            a("is_fullscreen", str);
            if (!TextUtils.isEmpty(this.F)) {
                a("search_result_id", this.F, c.a.f109562a);
                if (TextUtils.isEmpty(this.H)) {
                    a("list_item_id", j(), c.a.f109562a);
                } else {
                    a("list_item_id", this.H, c.a.f109562a);
                }
            }
            if (!TextUtils.isEmpty(this.G)) {
                a("list_result_type", this.G, c.a.f109562a);
            }
            if (!TextUtils.isEmpty(this.I)) {
                a("search_third_item_id", j(), c.a.f109562a);
            }
            if (!TextUtils.isEmpty(this.J)) {
                a("impr_id", this.J);
            } else {
                a("impr_id", this.K);
            }
        }
        if (!TextUtils.isEmpty(this.O)) {
            a("search_id", this.O);
        }
        if (!TextUtils.isEmpty(this.P)) {
            a("enter_from", this.P);
        }
        if (!TextUtils.isEmpty(this.Q)) {
            a("vs_entrance_type", this.Q);
        }
        if (!TextUtils.isEmpty(this.R)) {
            a("vs_session_id", this.R);
        }
        if (!TextUtils.isEmpty(this.S)) {
            a("result_id", this.S);
        }
        if (!TextUtils.isEmpty(this.T)) {
            a("vs_group_id", this.T);
        }
        if (!TextUtils.isEmpty(this.f109573a)) {
            a("news_id", this.f109573a);
        }
        if (this.A.booleanValue()) {
            a("is_fullscreen", "0");
        }
        if (!TextUtils.isEmpty(this.B)) {
            a("is_pinned", this.B);
        }
        if (TextUtils.equals(this.f109556h, "homepage_hot") || TextUtils.equals(this.f109556h, "homepage_follow")) {
            if (!TextUtils.isEmpty(this.C)) {
                a("rec_type", this.C, c.a.f109562a);
            }
            if (!TextUtils.isEmpty(this.D)) {
                a("label_text", this.D, c.a.f109562a);
            }
        }
        int i2 = this.V;
        if (i2 >= 0) {
            a("follow_status", i2);
        }
        if (!TextUtils.isEmpty(this.W)) {
            a("story_type", this.W);
        }
        if (!TextUtils.isEmpty(this.f109574b)) {
            a("story_collection_id", this.f109574b);
        }
        if (!TextUtils.isEmpty(this.f109575c)) {
            a("from_group_id", this.f109575c);
        }
    }

    public final E a(Boolean bool) {
        this.z = bool;
        return this;
    }

    public final E b(Boolean bool) {
        this.A = bool;
        return this;
    }

    public E b_(String str) {
        this.f109574b = str;
        return this;
    }

    public final E c(String str) {
        this.x = str;
        return this;
    }

    public final E d(String str) {
        this.y = str;
        return this;
    }

    public final E e(String str) {
        this.B = str;
        return this;
    }

    public final E f(String str) {
        this.F = str;
        return this;
    }

    public final E g(String str) {
        this.G = str;
        return this;
    }

    public final E i(String str) {
        this.H = str;
        return this;
    }

    public final E j(String str) {
        this.I = str;
        return this;
    }

    public E k(String str) {
        this.J = str;
        return this;
    }

    public final E l(String str) {
        this.O = str;
        return this;
    }

    public E m(String str) {
        this.f109573a = str;
        return this;
    }

    public E n(String str) {
        this.f109575c = str;
        return this;
    }

    public h(String str) {
        super(str);
    }

    public E g(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAuthor() != null) {
                this.w = aweme.getAuthor().getRegion();
            }
            this.L = aweme.isFromTrendingCard();
            this.M = aweme.getTrendingName();
            this.N = aweme.getTrendingId();
            this.U = aweme;
        }
        a(aweme);
        b(aweme);
        return this;
    }
}
