package com.ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;

public enum MtCertingActionEnum {
    CA_EMPTY,
    CA_CERTING,
    CA_UPDATING;

    static {
        Covode.recordClassIndex(80809);
    }
}
