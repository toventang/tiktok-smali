package com.ss.android.ugc.aweme.donation.token;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;

public interface DonationTokenCreateApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83033a = a.f83034a;

    static {
        Covode.recordClassIndex(51766);
    }

    @t(a = "/webcast/room/token_create/")
    @g
    f.a.t<DonationTokenResponse> tokenCreate(@e(a = "item_type") int i2, @e(a = "item_id") Long l2, @e(a = "sec_uid") String str, @e(a = "extra") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f83034a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(51767);
        }

        public static DonationTokenCreateApi a() {
            String str;
            IRetrofitFactory a2 = RetrofitFactory.a();
            if (d.c()) {
                str = "https://webcast.tiktokv.com";
            } else {
                str = "https://webcast-va.tiktokv.com";
            }
            Object a3 = a2.b(str).d().a(DonationTokenCreateApi.class);
            l.b(a3, "");
            return (DonationTokenCreateApi) a3;
        }
    }
}
