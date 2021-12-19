package com.ss.android.ugc.aweme.kids.liked.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;
import f.a.t;
import h.f.b.l;

public interface FavoriteApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106715a = a.f106716a;

    static {
        Covode.recordClassIndex(68210);
    }

    @h(a = "/tiktok/v1/kids/aweme/favorite/")
    t<KidFeedItemList> getFavoriteList(@z(a = "max_cursor") long j2, @z(a = "min_cursor") long j3, @z(a = "count") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f106716a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(68211);
        }

        public static FavoriteApi a() {
            Object a2 = RetrofitFactory.a().a(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).a(FavoriteApi.class);
            l.b(a2, "");
            return (FavoriteApi) a2;
        }
    }
}
