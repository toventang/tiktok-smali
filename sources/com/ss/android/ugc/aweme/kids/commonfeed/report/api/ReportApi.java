package com.ss.android.ugc.aweme.kids.commonfeed.report.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.common.a.a;
import f.a.t;

public final class ReportApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RetrofitApi f106165a = ((RetrofitApi) RetrofitFactory.a().a(a.f105880a).a(RetrofitApi.class));

    /* renamed from: b  reason: collision with root package name */
    public static final ReportApi f106166b = new ReportApi();

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67891);
        }

        @h(a = "/aweme/v1/aweme/feedback/")
        t<BaseResponse> reportAwame(@z(a = "report_type") String str, @z(a = "object_id") long j2, @z(a = "owner_id") long j3, @z(a = "reason") int i2, @z(a = "additional_reasons") String str2);
    }

    private ReportApi() {
    }

    static {
        Covode.recordClassIndex(67890);
    }
}
