package com.ss.android.ugc.aweme.share.business.tcm;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface TCMOrderDeleteApi {
    static {
        Covode.recordClassIndex(81048);
    }

    @t(a = "/aweme/v1/commerce/tcm/item/delete/apply/")
    @g
    f.a.t<BaseResponse> applyDeleteTCMOrder(@e(a = "order_id") String str, @e(a = "item_id") String str2);

    @h(a = "/aweme/v1/commerce/tcm/item/delete/status/")
    f.a.t<a> checkTCMOrderDeleteStatus(@z(a = "order_id") String str, @z(a = "item_id") String str2);
}
