package com.ss.android.ugc.aweme.authorize.network;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.openauthorize.a.d;
import com.ss.android.ugc.aweme.openauthorize.a.h;
import com.ss.android.ugc.aweme.openauthorize.a.j;
import f.a.ab;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public interface AuthorizeApi {
    static {
        Covode.recordClassIndex(41396);
    }

    @o(a = "/passport/open/web/auth/")
    @e
    ab<h> confirmBCAuthorize(@c(a = "client_key") String str, @c(a = "scope") String str2, @c(a = "source") String str3, @c(a = "redirect_uri") String str4);

    @o(a = "/passport/open/confirm_qrcode/")
    @e
    ab<j> confirmQroceAuthorize(@c(a = "token") String str, @c(a = "scopes") String str2);

    @o(a = "/aweme/v1/openapi/authorized/page/detail/")
    @e
    ab<d> getAuthPageInfo(@c(a = "client_key") String str, @c(a = "authorized_pattern") int i2, @c(a = "scope") String str2, @c(a = "redirect_uri") String str3, @c(a = "bc_params") String str4);

    @f(a = "/passport/open/check_login/")
    ab<Object> getLoginStatus(@t(a = "client_key") String str);

    @f(a = "/passport/open/scan_qrcode/")
    ab<j> scanQrcode(@t(a = "ticket") String str, @t(a = "token") String str2, @t(a = "auth_type") Integer num, @t(a = "client_key") String str3, @t(a = "client_secret") String str4, @t(a = "scope") String str5, @t(a = "next_url") String str6);
}
