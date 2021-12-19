package com.kakao.auth.common;

import com.bytedance.covode.number.Covode;

public interface MessageSendable {
    static {
        Covode.recordClassIndex(34308);
    }

    String getTargetId();

    String getType();

    boolean isAllowedMsg();
}
