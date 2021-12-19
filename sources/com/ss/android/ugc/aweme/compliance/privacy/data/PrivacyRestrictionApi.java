package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;

/* access modifiers changed from: package-private */
public interface PrivacyRestrictionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77370a = a.f77371a;

    static {
        Covode.recordClassIndex(47854);
    }

    @h(a = "/tiktok/privacy/setting/restriction/v1")
    t<PrivacyRestrictionResponse> fetchPrivacyRestriction();

    @com.bytedance.retrofit2.b.t(a = "/tiktok/privacy/agreement/record/agree/v1")
    @g
    t<BaseResponse> updateAgreement(@e(a = "record_name") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77371a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47855);
        }
    }
}
