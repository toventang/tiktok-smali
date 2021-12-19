package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdk.verify.model.QueryZhimaStatusResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface ZhimaVerifyApi {
    static {
        Covode.recordClassIndex(13215);
    }

    @h(a = "/webcast/certification/get_certification_entrance/")
    t<d<GetCertificationEntranceResponse>> getCertificationEntrance();

    @h(a = "/webcast/certification/get_certification_status/")
    t<d<ZhimaStatusResponse>> getCertificationStatus();

    @h(a = "/webcast/certification/query/")
    t<d<ZhimaPollingResponse>> queryPollingStatus(@z(a = "zhima_token") String str, @z(a = "transaction_id") String str2);

    @h(a = "/webcast/certification/common/query/")
    t<d<QueryZhimaStatusResponse>> queryZhimaVerifyStatus(@z(a = "zhima_token") String str);

    @com.bytedance.retrofit2.b.t(a = "/webcast/certification/common/submit/")
    @g
    t<d<Object>> zhimaVerify(@e(a = "return_url") String str, @e(a = "certify_type") String str2);
}
