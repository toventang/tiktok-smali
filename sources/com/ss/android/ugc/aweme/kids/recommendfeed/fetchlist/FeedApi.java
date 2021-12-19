package com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist;

import beancopy.ConvertHelp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.y;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import com.ss.android.ugc.aweme.logger.a;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import tiktok.kids.proto.tiktok_v1_kids_feed_response;

public final class FeedApi {

    /* renamed from: a  reason: collision with root package name */
    public static final FeedApi f106801a = new FeedApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RetrofitApi f106802b = ((RetrofitApi) RetrofitFactory.a().a(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).a(RetrofitApi.class));

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(68283);
        }

        @h(a = "/tiktok/v1/kids/feed/")
        @y(a = 2)
        t<tiktok_v1_kids_feed_response> fetchRecommendFeed(@z(a = "count") int i2, @z(a = "pull_type") int i3, @z(a = "volume") double d2, @z(a = "cached_item_num") Integer num);
    }

    private FeedApi() {
    }

    static {
        Covode.recordClassIndex(68282);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f106803a = new a();

        static {
            Covode.recordClassIndex(68284);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return a((tiktok_v1_kids_feed_response) obj);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList, java.lang.String] */
        private static KFeedItemList a(tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response) {
            th = 0;
            try {
                KFeedItemList tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList = ConvertHelp.tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList(tiktok_v1_kids_feed_response, th);
                if (tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList != null) {
                    return tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList;
                }
                String str = "Pb2Model: model is null";
                throw new a(str, th);
            } finally {
                a aVar = new a(th, th);
            }
        }
    }

    public static t<KFeedItemList> a(int i2) {
        if (a.b.f109011a.f109002c) {
            a.b.f109011a.b("feed_request_to_feed_api", false);
            a.b.f109011a.a("feed_compose_params", false);
        }
        if (a.b.f109011a.f109002c) {
            a.b.f109011a.b("feed_compose_params", false);
            a.b.f109011a.a("feed_api_to_net_api", System.currentTimeMillis(), false);
        }
        t<R> d2 = f106802b.fetchRecommendFeed(8, i2, com.ss.android.ugc.aweme.m.a.a(2), 0).d(a.f106803a);
        if (a.b.f109011a.f109002c) {
            a.b.f109011a.b("feed_net_api_to_feed_api", false);
            a.b.f109011a.a("feed_api_to_ui_response", false);
        }
        l.b(d2, "");
        return d2;
    }
}
