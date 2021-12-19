package com.ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.common.response.KidsSettings;
import f.a.t;

public interface ComplianceApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106571a = a.f106572a;

    static {
        Covode.recordClassIndex(68095);
    }

    @h(a = "/tiktok/v1/kids/check/in/")
    t<BaseResponse> checkIn();

    @h(a = "/tiktok/v1/kids/settings/")
    t<KidsSettings> getKidsSettings();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f106572a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(68096);
        }
    }
}
