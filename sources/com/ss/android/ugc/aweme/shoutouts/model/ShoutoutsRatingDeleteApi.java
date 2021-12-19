package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import l.b.o;
import l.b.t;

public interface ShoutoutsRatingDeleteApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133197a = a.f133198a;

    static {
        Covode.recordClassIndex(87108);
    }

    @o(a = "/tiktok/shoutouts/product/rating/delete/v1")
    ab<BaseResponse> deleteRating(@t(a = "product_id") String str, @t(a = "rating_id") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133198a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87109);
        }
    }
}
