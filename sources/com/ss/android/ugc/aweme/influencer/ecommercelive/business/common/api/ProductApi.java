package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.a.a;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import java.util.Map;

public interface ProductApi {
    static {
        Covode.recordClassIndex(66976);
    }

    @t(a = "/aweme/v1/oec/affiliate/live/product/del")
    @g
    b<BaseResponse<String>> deleteProducts(@f Map<String, String> map);

    @h(a = "/aweme/v1/oec/affiliate/live/product/num")
    b<BaseResponse<a>> getProductsCount(@z(a = "room_id") String str, @z(a = "is_owner") boolean z);
}
