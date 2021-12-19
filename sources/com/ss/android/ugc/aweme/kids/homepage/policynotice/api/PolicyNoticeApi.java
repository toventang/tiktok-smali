package com.ss.android.ugc.aweme.kids.homepage.policynotice.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.response.c;
import h.f.b.l;

public final class PolicyNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final API f106610a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f106611b = new a((byte) 0);

    public interface API {
        static {
            Covode.recordClassIndex(68119);
        }

        @h(a = "/tiktok/v1/kids/policy/notice/")
        i<c> getPolicyNotice();

        @t(a = "/tiktok/v1/kids/policy/notice/approve/")
        i<BaseResponse> policyNoticeApprove(@z(a = "business") String str, @z(a = "policy_version") String str2, @z(a = "style") String str3, @z(a = "extra") String str4, @z(a = "operation") Integer num);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68120);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(68118);
        Object a2 = RetrofitFactory.a().a(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).a(API.class);
        l.b(a2, "");
        f106610a = (API) a2;
    }
}
