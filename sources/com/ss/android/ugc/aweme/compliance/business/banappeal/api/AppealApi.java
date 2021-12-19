package com.ss.android.ugc.aweme.compliance.business.banappeal.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import f.a.t;
import l.b.f;

public interface AppealApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76749a = a.f76751b;

    static {
        Covode.recordClassIndex(47446);
    }

    @f(a = "/aweme/v1/data/user/info/request/list/")
    t<String> apiUserInfo(@l.b.t(a = "count") int i2, @l.b.t(a = "cursor") int i3);

    @f(a = "/aweme/v2/appeal/status/")
    i<AppealStatusResponse> getUserAppealStatus(@l.b.t(a = "object_type") String str, @l.b.t(a = "object_id") String str2);

    @f(a = "/tiktok/account/ban/detail/get/v1/")
    t<com.ss.android.ugc.aweme.compliance.api.model.a> syncAccountBannedDetails();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final AppealApi f76750a = ((AppealApi) RetrofitFactory.a().a(b.f59141e).a(AppealApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f76751b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47447);
        }
    }
}
