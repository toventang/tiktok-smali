package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import l.b;
import l.b.f;
import l.b.t;

public interface AccountService {
    static {
        Covode.recordClassIndex(103728);
    }

    @f(a = "/1.1/account/verify_credentials.json")
    b<Object> verifyCredentials(@t(a = "include_entities") Boolean bool, @t(a = "skip_status") Boolean bool2, @t(a = "include_email") Boolean bool3);
}
