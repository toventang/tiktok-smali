package com.kakao.auth.authorization.authcode;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.AuthorizationResult;

public interface AuthCodeListener {
    static {
        Covode.recordClassIndex(34283);
    }

    void onAuthCodeReceived(int i2, AuthorizationResult authorizationResult);
}
