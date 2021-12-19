package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface QAProfileEntranceApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77745a = a.f77746a;

    static {
        Covode.recordClassIndex(48140);
    }

    @t(a = "/aweme/v1/user/proaccount/edit/")
    @g
    f.a.t<BaseResponse> setQAStatus(@e(a = "enable_qna_on_profile") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77746a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48141);
        }
    }
}
