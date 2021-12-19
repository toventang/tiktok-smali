package com.kakao.auth;

import com.bytedance.covode.number.Covode;

public interface IPushConfig {
    static {
        Covode.recordClassIndex(34239);
    }

    String getDeviceUUID();

    ApiResponseCallback<Integer> getTokenRegisterCallback();
}
