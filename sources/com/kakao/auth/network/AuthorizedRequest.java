package com.kakao.auth.network;

import com.bytedance.covode.number.Covode;
import com.kakao.common.IConfiguration;
import com.kakao.common.PhaseInfo;
import com.kakao.network.IRequest;

public interface AuthorizedRequest extends IRequest {
    static {
        Covode.recordClassIndex(34328);
    }

    void setAccessToken(String str);

    void setConfiguration(PhaseInfo phaseInfo, IConfiguration iConfiguration);
}
