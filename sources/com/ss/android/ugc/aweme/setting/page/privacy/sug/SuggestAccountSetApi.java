package com.ss.android.ugc.aweme.setting.page.privacy.sug;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.m;
import h.h;
import h.i;

public final class SuggestAccountSetApi {

    /* renamed from: a  reason: collision with root package name */
    public static final h f122529a = i.a((h.f.a.a) a.f122531a);

    /* renamed from: b  reason: collision with root package name */
    public static final SuggestAccountSetApi f122530b = new SuggestAccountSetApi();

    public interface RealApi {
        static {
            Covode.recordClassIndex(80373);
        }

        @t(a = "/tiktok/privacy/setting/suggestion/update/v1")
        @g
        f.a.t<BaseResponse> setSuggestPrivacySettings(@e(a = "field") String str, @e(a = "value") int i2);
    }

    private SuggestAccountSetApi() {
    }

    static final class a extends m implements h.f.a.a<RealApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122531a = new a();

        static {
            Covode.recordClassIndex(80374);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RealApi invoke() {
            return RetrofitFactory.a().a(Api.f66569d).a(RealApi.class);
        }
    }

    static {
        Covode.recordClassIndex(80372);
    }
}
