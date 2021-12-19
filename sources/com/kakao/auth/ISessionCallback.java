package com.kakao.auth;

import com.bytedance.covode.number.Covode;
import com.kakao.util.exception.KakaoException;

public interface ISessionCallback {
    static {
        Covode.recordClassIndex(34241);
    }

    void onSessionOpenFailed(KakaoException kakaoException);

    void onSessionOpened();
}
