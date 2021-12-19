package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.g;
import com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;

public interface AudienceProductListApi {
    static {
        Covode.recordClassIndex(55192);
    }

    @h(a = "/aweme/v1/oec/live/popup/prebuy/get")
    b<BaseResponse<e>> getFansPopUp(@z(a = "source") int i2, @z(a = "room_id") String str, @z(a = "anchor_id") String str2, @z(a = "product_ids") String str3);

    @h(a = "/aweme/v1/oec/live/product/pop")
    b<BaseResponse<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b>> getIntroduceProduct(@z(a = "room_id") String str, @z(a = "promotion_response_style") Integer num);

    @h(a = "/aweme/v1/oec/live/product/refresh")
    b<BaseResponse<g>> getProductList(@z(a = "room_id") String str, @z(a = "product_ids") String str2);
}
