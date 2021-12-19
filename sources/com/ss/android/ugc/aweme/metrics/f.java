package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.c;
import java.util.Map;

public final class f extends h<f> {
    private String X;
    private Aweme Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    public String f109568a;
    private String aa;
    private String ab;
    private boolean ac;

    /* renamed from: b  reason: collision with root package name */
    public String f109569b;

    /* renamed from: c  reason: collision with root package name */
    public int f109570c;

    /* renamed from: d  reason: collision with root package name */
    public String f109571d;

    /* renamed from: e  reason: collision with root package name */
    public String f109572e;
    public String p;
    public String q;
    public int r;
    public String s;
    public String t;
    public Boolean u;
    public String v;

    static {
        Covode.recordClassIndex(70130);
    }

    public f() {
        super("click_more_button");
        this.u = false;
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        AwemeTrendingBar trendingBarFYP;
        a("group_id", this.f109568a, c.a.f109563b);
        a("author_id", this.f109569b, c.a.f109563b);
        if (this.Y != null) {
            a(ForwardStatisticsServiceImpl.b().a(this.Y, this.X));
        }
        if (ac.a(this.f109556h)) {
            h(ac.b(this.Y));
        }
        if (this.Z != 0) {
            a("is_long_item", new StringBuilder().append(this.Z).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109572e)) {
            a(this.f109572e, this.p, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109571d)) {
            a("playlist_type", this.f109571d, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("log_pb", this.s, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.q)) {
            a("prop_id", this.q, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            a("enter_method", this.ab);
        }
        if (this.r != 0) {
            a("scene_id", new StringBuilder().append(this.r).toString(), c.a.f109562a);
        }
        if (this.ac) {
            str = "1";
        } else {
            str = "0";
        }
        a("is_horizontal_screen", str);
        a("previous_page", this.t, c.a.f109562a);
        if (!TextUtils.isEmpty(this.aa)) {
            a("impr_type", this.aa, c.a.f109562a);
        }
        a("request_id", ac.b(this.Y));
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (this.u.booleanValue()) {
            a("story_type", "story");
        } else {
            a("story_type", UGCMonitor.TYPE_POST);
        }
        Aweme aweme = this.Y;
        if (!(aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || this.f109570c != 30)) {
            Map<String, String> trackMap = trendingBarFYP.getTrackMap();
            a("enter_from", "trending_inflow_page");
            a("trending_entrance", "homepage_hot_trending_bar");
            a("group_id", this.f109568a);
            a("trending_topic", trendingBarFYP.getEventKeyword());
            a("trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
            a("trending_topic_source", trackMap.get("trending_topic_source"));
            a("topic_rank", trackMap.get("topic_rank"));
            a("topic_group_rank", trackMap.get("topic_group_rank"));
            a("topic_group_num", trackMap.get("topic_group_num"));
        }
        if (!TextUtils.isEmpty(this.v)) {
            a("story_collection_id", this.v);
        }
    }

    public final f a(String str) {
        this.f109556h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ f b_(String str) {
        this.v = str;
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(boolean r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "click_share_button"
        L_0x0004:
            r1.<init>(r0)
            r0 = 0
            r1.Z = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.u = r0
            r0 = 1
            r1.f109559k = r0
            return
        L_0x0014:
            java.lang.String r0 = "click_more_button"
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.metrics.f.<init>(boolean):void");
    }

    /* renamed from: f */
    public final f g(Aweme aweme) {
        super.g(aweme);
        if (aweme != null) {
            this.Y = aweme;
            this.f109568a = aweme.getAid();
            this.aa = ac.j(aweme);
        }
        return this;
    }
}
