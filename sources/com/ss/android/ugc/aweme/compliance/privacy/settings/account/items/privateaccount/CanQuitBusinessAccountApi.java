package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;

public interface CanQuitBusinessAccountApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77614a = a.f77616b;

    static {
        Covode.recordClassIndex(48019);
    }

    @h(a = "/aweme/v1/ad/ba/quitcheck/")
    t<BaseResponse> check();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final CanQuitBusinessAccountApi f77615a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f77616b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48020);
            Object a2 = RetrofitFactory.a().a(com.ss.android.ugc.aweme.compliance.common.a.a.f77273a).a(CanQuitBusinessAccountApi.class);
            l.b(a2, "");
            f77615a = (CanQuitBusinessAccountApi) a2;
        }
    }
}
