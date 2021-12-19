package com.ss.android.ugc.aweme.trending.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.feed.param.b f141070a;

    /* renamed from: b  reason: collision with root package name */
    public static c f141071b = new C3736a();

    /* renamed from: c  reason: collision with root package name */
    public static c f141072c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static c f141073d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static c f141074e = new d();

    /* renamed from: f  reason: collision with root package name */
    public static c f141075f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static c f141076g = new i();

    /* renamed from: h  reason: collision with root package name */
    public static c f141077h = new h();

    /* renamed from: i  reason: collision with root package name */
    public static c f141078i = new f();

    /* renamed from: j  reason: collision with root package name */
    public static c f141079j = new e();

    /* renamed from: k  reason: collision with root package name */
    public static final a f141080k = new a();

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$a  reason: collision with other inner class name */
    public static final class C3736a extends c {
        static {
            Covode.recordClassIndex(92091);
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            return "trending_inflow_page";
        }

        C3736a() {
        }
    }

    public static final class b extends c {
        static {
            Covode.recordClassIndex(92092);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            String str;
            com.ss.android.ugc.aweme.feed.param.b bVar = a.f141070a;
            if (bVar == null || (str = bVar.getFromGroupId()) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    public static final class c extends c {
        static {
            Covode.recordClassIndex(92093);
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            return "homepage_hot_trending_bar";
        }

        c() {
        }
    }

    public static final class d extends c {
        static {
            Covode.recordClassIndex(92094);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            AwemeTrendingBar trendingBarFYP;
            String eventKeyword;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (eventKeyword = trendingBarFYP.getEventKeyword()) == null) {
                return "";
            }
            return eventKeyword;
        }
    }

    public static final class e extends c {
        static {
            Covode.recordClassIndex(92095);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("topic_group_num")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    public static final class f extends c {
        static {
            Covode.recordClassIndex(92096);
        }

        f() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("topic_group_rank")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    public static final class g extends c {
        static {
            Covode.recordClassIndex(92097);
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            Object obj;
            AwemeTrendingBar trendingBarFYP;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null) {
                obj = "";
            } else {
                obj = Long.valueOf(trendingBarFYP.getEventKeywordId());
            }
            return obj.toString();
        }
    }

    public static final class h extends c {
        static {
            Covode.recordClassIndex(92098);
        }

        h() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("topic_rank")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    public static final class i extends c {
        static {
            Covode.recordClassIndex(92099);
        }

        i() {
        }

        @Override // com.ss.android.ugc.aweme.trending.d.c
        public final String a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("trending_topic_source")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(92090);
    }
}
