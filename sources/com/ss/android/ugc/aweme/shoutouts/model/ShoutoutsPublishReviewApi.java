package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.o;

public interface ShoutoutsPublishReviewApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133195a = a.f133196a;

    static {
        Covode.recordClassIndex(87106);
    }

    @o(a = "/tiktok/shoutouts/product/rating/create/v1")
    t<BaseResponse> publishReview(@l.b.t(a = "product_id") String str, @l.b.t(a = "order_id") String str2, @l.b.t(a = "rating_value") int i2, @l.b.t(a = "rating_text") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133196a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87107);
        }
    }
}
