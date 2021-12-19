package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.kakao.usermgmt.StringSet;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.o;

public final class CancelVideoMaskApi {

    /* renamed from: a  reason: collision with root package name */
    public static final CancelVideoMaskApi f91917a = new CancelVideoMaskApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f91918b = ((RealApi) RetrofitFactory.a().b(b.f59141e).d().a(RealApi.class));

    public interface RealApi {
        static {
            Covode.recordClassIndex(57860);
        }

        @o(a = "/aweme/v1/mask/cancel/")
        @e
        t<BaseResponse> cancelVideoMask(@c(a = "aweme_id") String str, @c(a = "mask_type") Integer num, @c(a = "status") Integer num2);
    }

    private CancelVideoMaskApi() {
    }

    static {
        Covode.recordClassIndex(57859);
    }

    public static void a(int i2) {
        n.a("tns_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/mask/cancel/").a("status", Integer.valueOf(i2)).a());
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        n.a("tns_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/mask/cancel/").a("status", (Integer) 1).a("error_message", str2).a("tns_logId", str).a());
    }

    public static t<BaseResponse> a(String str, Integer num, Integer num2) {
        l.d(str, "");
        return f91918b.cancelVideoMask(str, num, num2);
    }
}
