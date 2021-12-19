package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.m;
import h.h;
import h.i;

public interface ProfileAdvancedFeaturesOrderUpdateAPI {

    /* renamed from: a  reason: collision with root package name */
    public static final a f115985a = a.f115987b;

    static {
        Covode.recordClassIndex(74801);
    }

    @t(a = "/tiktok/user/setting/advance_feature/order/update/v1")
    @g
    f.a.t<BaseResponse> updateAdvancedFeaturesOrder(@e(a = "advance_feature_item_order") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f115986a = i.a((h.f.a.a) C2961a.f115988a);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f115987b = new a();

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.api.ProfileAdvancedFeaturesOrderUpdateAPI$a$a  reason: collision with other inner class name */
        static final class C2961a extends m implements h.f.a.a<ProfileAdvancedFeaturesOrderUpdateAPI> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2961a f115988a = new C2961a();

            static {
                Covode.recordClassIndex(74803);
            }

            C2961a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ProfileAdvancedFeaturesOrderUpdateAPI invoke() {
                return RetrofitFactory.a().b(b.f59141e).d().a(ProfileAdvancedFeaturesOrderUpdateAPI.class);
            }
        }

        static {
            Covode.recordClassIndex(74802);
        }
    }
}
