package com.ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;

public enum MtCertStatusEnum {
    CS_EMPTY,
    CS_CERTED,
    CS_CERTING,
    CS_DENIED;

    static {
        Covode.recordClassIndex(80808);
    }
}
