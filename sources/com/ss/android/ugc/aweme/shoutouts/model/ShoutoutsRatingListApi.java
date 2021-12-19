package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import f.a.ab;
import h.f.b.l;
import l.b.f;
import l.b.t;

public interface ShoutoutsRatingListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133199a = a.f133200a;

    static {
        Covode.recordClassIndex(87110);
    }

    @f(a = "/tiktok/shoutouts/product/rating/list/v1")
    ab<f> getRatingList(@t(a = "creator_uid") String str, @t(a = "product_id") String str2, @t(a = "offset") int i2, @t(a = "count") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133200a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87111);
        }

        public static ShoutoutsRatingListApi a() {
            Object a2 = RetrofitFactory.a().b(b.f59141e).d().a(ShoutoutsRatingListApi.class);
            l.b(a2, "");
            return (ShoutoutsRatingListApi) a2;
        }
    }
}
