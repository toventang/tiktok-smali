package com.ss.android.ugc.aweme.trending;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.search.m;
import f.a.t;

public interface TrendingDetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141034a = a.f141036b;

    static {
        Covode.recordClassIndex(92072);
    }

    @h(a = "/aweme/v1/trending/search/inflow/")
    t<m> getTrendingDetailDataSearch(@z(a = "event_id") String str, @z(a = "offset") int i2, @z(a = "count") int i3, @z(a = "item_id") String str2, @z(a = "billboard_type") int i4, @z(a = "event_list") String str3);

    @h(a = "tiktok/trends/inflow/video/v1/")
    t<m> getTrendingDetailFYP(@z(a = "event_id") String str, @z(a = "offset") int i2, @z(a = "count") int i3, @z(a = "item_id") String str2, @z(a = "billboard_type") int i4, @z(a = "event_list") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final TrendingDetailApi f141035a = ((TrendingDetailApi) RetrofitFactory.a().b(b.f59141e).d().a(TrendingDetailApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f141036b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(92073);
        }
    }
}
