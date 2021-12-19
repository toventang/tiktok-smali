package com.ss.android.ugc.aweme.ecommerce.coupon.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherResponse;
import f.a.t;
import l.b.o;

public interface ClaimVoucherApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f85770a = a.f85771a;

    static {
        Covode.recordClassIndex(53635);
    }

    @o(a = "/api/v1/shop/voucher/claim")
    t<ClaimVoucherResponse> claimVoucher(@l.b.a ClaimVoucherRequest claimVoucherRequest);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f85771a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final f f85772b = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        private a() {
        }

        static {
            Covode.recordClassIndex(53636);
        }
    }
}
