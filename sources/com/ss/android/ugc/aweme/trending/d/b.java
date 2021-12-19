package com.ss.android.ugc.aweme.trending.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import h.z;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f141081a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92100);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f141082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feed.param.b f141083b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f141084c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f141085d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Aweme f141086e;

        static {
            Covode.recordClassIndex(92101);
        }

        public a(boolean z, com.ss.android.ugc.aweme.feed.param.b bVar, String str, Aweme aweme, Aweme aweme2) {
            this.f141082a = z;
            this.f141083b = bVar;
            this.f141084c = str;
            this.f141085d = aweme;
            this.f141086e = aweme2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3;
            if (this.f141082a) {
                str = "trending_slide_down";
            } else {
                str = "trending_slide_up";
            }
            d a2 = new d().a("search_id", this.f141083b.getSearchId()).a("enter_from", this.f141084c);
            Aweme aweme = this.f141085d;
            String str4 = null;
            if (aweme != null) {
                str2 = aweme.getAuthorUid();
            } else {
                str2 = null;
            }
            d a3 = a2.a("author_id", str2);
            Aweme aweme2 = this.f141085d;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            } else {
                str3 = null;
            }
            d a4 = a3.a("from_group_id", str3);
            Aweme aweme3 = this.f141086e;
            if (aweme3 != null) {
                str4 = aweme3.getAid();
            }
            d a5 = a4.a("to_group_id", str4);
            if (hk.a(this.f141083b.getIsFromTrendingCard())) {
                a5.a("is_from_trending_card", this.f141083b.getIsFromTrendingCard());
            }
            r.a(str, a5.f66730a);
            return z.f158842a;
        }
    }

    public static void a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "click_fyp_trending_bar")) {
            d a2 = new d().a("enter_from", "trending_inflow_page").a("trending_entrance", "homepage_hot_trending_bar");
            l.b(a2, "");
            a("trending_inflow_panel_show", a2);
        }
    }

    public static void a(String str, d dVar) {
        r.a(str, dVar.f66730a);
    }

    public static void a(String str, com.ss.android.ugc.aweme.search.l lVar) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "click_fyp_trending_bar") && lVar != null) {
            Map<String, String> extraMap = lVar.getExtraMap();
            d a2 = new d().a("enter_from", "trending_inflow_page").a("enter_method", "click_bottom_topic_bar").a("trending_entrance", "homepage_hot_trending_bar").a("trending_topic", lVar.getTrendingName()).a("trending_topic_id", lVar.getEventId());
            String str2 = extraMap.get("trending_topic_source");
            if (str2 == null) {
                str2 = "";
            }
            d a3 = a2.a("trending_topic_source", str2);
            String str3 = extraMap.get("topic_rank");
            if (str3 == null) {
                str3 = "";
            }
            d a4 = a3.a("topic_rank", str3);
            String str4 = extraMap.get("topic_group_num");
            if (str4 == null) {
                str4 = "";
            }
            d a5 = a4.a("topic_group_num", str4);
            l.b(a5, "");
            a("trending_inflow_topic_click", a5);
        }
    }

    public static void a(String str, com.ss.android.ugc.aweme.search.l lVar, Integer num, com.ss.android.ugc.aweme.feed.param.b bVar) {
        String str2;
        l.d(bVar, "");
        d a2 = new d().a("search_id", bVar.getSearchId()).a("search_keyword", bVar.getSearchKeyword()).a("search_result_id", bVar.getSearchResultId()).a("enter_from", str);
        String str3 = null;
        if (lVar != null) {
            str2 = lVar.getTrendingName();
        } else {
            str2 = null;
        }
        d a3 = a2.a("trending_topic", str2);
        if (lVar != null) {
            str3 = lVar.getEventId();
        }
        d a4 = a3.a("trending_topic_id", str3).a("rank", num);
        if (hk.a(bVar.getIsFromTrendingCard())) {
            a4.a("is_from_trending_card", bVar.getIsFromTrendingCard());
        }
        r.a("click_more_trending", a4.f66730a);
    }
}
