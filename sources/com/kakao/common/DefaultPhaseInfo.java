package com.kakao.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.Utility;

public class DefaultPhaseInfo implements PhaseInfo {
    private final String appKey;
    private final KakaoPhase phase;

    static {
        Covode.recordClassIndex(34344);
    }

    @Override // com.kakao.common.PhaseInfo
    public String clientSecret() {
        return null;
    }

    @Override // com.kakao.common.PhaseInfo
    public String appKey() {
        return this.appKey;
    }

    @Override // com.kakao.common.PhaseInfo
    public KakaoPhase phase() {
        return this.phase;
    }

    DefaultPhaseInfo(Context context) {
        String metadata = Utility.getMetadata(context, "com.kakao.sdk.Phase");
        if (metadata != null) {
            this.phase = KakaoPhase.ofName(metadata);
        } else {
            this.phase = KakaoPhase.PRODUCTION;
        }
        this.appKey = Utility.getMetadata(context, "com.kakao.sdk.AppKey");
    }
}
