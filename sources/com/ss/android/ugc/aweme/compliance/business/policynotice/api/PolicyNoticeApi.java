package com.ss.android.ugc.aweme.compliance.business.policynotice.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.k;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;

public final class PolicyNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final API f77096a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f77097b = new a((byte) 0);

    public interface API {
        static {
            Covode.recordClassIndex(47640);
        }

        @h(a = "/aweme/v1/policy/notice/")
        i<k> getPolicyNotice(@z(a = "scene") int i2);

        @t(a = "/aweme/v1/policy/notice/approve/")
        @g
        i<BaseResponse> policyNoticeApprove(@e(a = "business") String str, @e(a = "policy_version") String str2, @e(a = "style") String str3, @e(a = "extra") String str4, @e(a = "operation") Integer num, @e(a = "scene") Integer num2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(47639);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(API.class);
        l.b(create, "");
        f77096a = (API) create;
    }
}
