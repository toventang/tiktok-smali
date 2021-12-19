package com.ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.ss.android.ugc.aweme.discover.repo.fetcher.DiscoveryTimeGapInterceptor;
import f.a.ab;
import h.f.b.l;
import l.b.f;
import l.b.t;

public interface DiscoverApiNew {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80768a = a.f80770b;

    static {
        Covode.recordClassIndex(50227);
    }

    @f(a = "/aweme/v1/find/")
    ab<BannerList> getBannerList(@t(a = "banner_tab_type") Integer num, @t(a = "ad_personality_mode") Integer num2, @t(a = "cmpl_enc") String str);

    @f(a = "/aweme/v1/category/list/")
    ab<TrendingTopicList> getTrendingTopics(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "ad_personality_mode") Integer num, @t(a = "cmpl_enc") String str);

    @f(a = "/aweme/v2/category/list/")
    ab<TrendingTopicList> getTrendingTopicsV2(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "is_complete") Integer num, @t(a = "ad_personality_mode") Integer num2, @t(a = "cmpl_enc") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final DiscoverApiNew f80769a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f80770b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(50228);
            Object a2 = RetrofitFactory.a().b(b.f59141e).a((com.bytedance.retrofit2.c.a) new DiscoveryTimeGapInterceptor()).d().a(DiscoverApiNew.class);
            l.b(a2, "");
            f80769a = (DiscoverApiNew) a2;
        }
    }
}
