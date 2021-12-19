package com.ss.android.ugc.aweme.account.login.v2.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

interface PrivateAccountUserSettingsApi {
    static {
        Covode.recordClassIndex(39809);
    }

    @o(a = "aweme/v1/user/set/settings/")
    @e
    t<BaseResponse> setPrivatePolicyShow(@c(a = "field") String str, @c(a = "value") String str2);
}
