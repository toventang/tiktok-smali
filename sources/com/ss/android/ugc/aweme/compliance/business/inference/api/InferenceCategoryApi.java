package com.ss.android.ugc.aweme.compliance.business.inference.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.inference.model.InferenceCategory;
import h.f.b.l;
import l.b.c;
import l.b.e;

public interface InferenceCategoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76952a = a.f76953a;

    static {
        Covode.recordClassIndex(47558);
    }

    @h(a = "/aweme/v1/pers/ad/interests/")
    b<InferenceCategory> getUserLabelList();

    @t(a = "/aweme/v1/cmpl/set/settings/")
    @e
    b<BaseResponse> setUserLabel(@c(a = "settings") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f76953a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47559);
        }

        public static InferenceCategoryApi a() {
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(InferenceCategoryApi.class);
            l.b(a2, "");
            return (InferenceCategoryApi) a2;
        }
    }
}
