package com.ss.android.ugc.aweme.trending.ui;

import android.os.Bundle;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.trending.d.b;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class b extends com.ss.android.ugc.aweme.detail.h.b {
    private static final a F = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private TrendingMainViewModel f141100a;

    static {
        Covode.recordClassIndex(92118);
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void m() {
    }

    static final class a {
        static {
            Covode.recordClassIndex(92119);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public final void p() {
        super.p();
        this.W.f91652b = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final boolean t() {
        TrendingMainViewModel trendingMainViewModel = this.f141100a;
        if (trendingMainViewModel != null) {
            trendingMainViewModel.f141162a = y();
        }
        if (y() == null) {
            return true;
        }
        AwemeService.b().a(y());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void b(List<Aweme> list) {
        TrendingMainViewModel trendingMainViewModel = this.f141100a;
        if (trendingMainViewModel == null || !trendingMainViewModel.f141169k) {
            this.N.a(0, false);
        } else {
            super.b(list);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.b
    public final void a(List<Aweme> list, boolean z) {
        super.a(list, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.detail.h.b
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        Object obj = this.be;
        if (!(obj instanceof TrendingMainViewModel)) {
            obj = null;
        }
        this.f141100a = (TrendingMainViewModel) obj;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(boolean z, Aweme aweme, Aweme aweme2) {
        String str;
        super.a(z, aweme, aweme2);
        String a_ = a_(true);
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        br();
        l.d(bVar, "");
        i.b(new b.a(!z, bVar, a_, aweme, aweme2), r.a());
        TrendingMainViewModel trendingMainViewModel = this.f141100a;
        if (trendingMainViewModel == null || (str = trendingMainViewModel.f141164c) == null) {
            str = "";
        }
        boolean z2 = !z;
        l.d(str, "");
        if (l.a((Object) str, (Object) "click_fyp_trending_bar") && aweme != null && aweme.getTrendingBarFYP() != null && aweme2 != null && aweme2.getTrendingBarFYP() != null) {
            AwemeTrendingBar trendingBarFYP = aweme.getTrendingBarFYP();
            Map<String, String> trackMap = aweme.getTrendingBarFYP().getTrackMap();
            AwemeTrendingBar trendingBarFYP2 = aweme2.getTrendingBarFYP();
            Map<String, String> trackMap2 = aweme2.getTrendingBarFYP().getTrackMap();
            d a2 = new d().a("enter_from", "trending_inflow_page").a("trending_entrance", "homepage_hot_trending_bar");
            String groupId = aweme.getGroupId();
            if (groupId == null) {
                groupId = "";
            }
            d a3 = a2.a("from_group_id", groupId).a("from_trending_topic", trendingBarFYP.getEventKeyword()).a("from_trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
            String str2 = trackMap.get("trending_topic_source");
            if (str2 == null) {
                str2 = "";
            }
            d a4 = a3.a("from_trending_topic_source", str2);
            String str3 = trackMap.get("topic_rank");
            if (str3 == null) {
                str3 = "";
            }
            d a5 = a4.a("from_topic_rank", str3);
            String str4 = trackMap.get("topic_group_rank");
            if (str4 == null) {
                str4 = "";
            }
            d a6 = a5.a("from_topic_group_rank", str4);
            String str5 = trackMap.get("topic_group_num");
            if (str5 == null) {
                str5 = "";
            }
            d a7 = a6.a("from_topic_group_num", str5);
            String groupId2 = aweme2.getGroupId();
            if (groupId2 == null) {
                groupId2 = "";
            }
            d a8 = a7.a("to_group_id", groupId2).a("to_trending_topic", trendingBarFYP2.getEventKeyword()).a("to_trending_topic_id", String.valueOf(trendingBarFYP2.getEventKeywordId()));
            String str6 = trackMap2.get("trending_topic_source");
            if (str6 == null) {
                str6 = "";
            }
            d a9 = a8.a("to_trending_topic_source", str6);
            String str7 = trackMap2.get("topic_rank");
            if (str7 == null) {
                str7 = "";
            }
            d a10 = a9.a("to_topic_rank", str7);
            String str8 = trackMap2.get("topic_group_rank");
            if (str8 == null) {
                str8 = "";
            }
            d a11 = a10.a("to_topic_group_rank", str8);
            String str9 = trackMap2.get("topic_group_num");
            if (str9 == null) {
                str9 = "";
            }
            d a12 = a11.a("to_topic_group_num", str9);
            if (z2) {
                l.b(a12, "");
                com.ss.android.ugc.aweme.trending.d.b.a("trending_inflow_slide_down", a12);
                return;
            }
            l.b(a12, "");
            com.ss.android.ugc.aweme.trending.d.b.a("trending_inflow_slide_up", a12);
        }
    }
}
