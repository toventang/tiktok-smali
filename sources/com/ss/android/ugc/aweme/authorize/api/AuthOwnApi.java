package com.ss.android.ugc.aweme.authorize.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.ab;

public interface AuthOwnApi {
    static {
        Covode.recordClassIndex(41351);
    }

    @h(a = "/passport/open/check_login/")
    ab<Object> getLoginStatus(@z(a = "client_key") String str);
}
