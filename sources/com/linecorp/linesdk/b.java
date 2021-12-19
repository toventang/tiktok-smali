package com.linecorp.linesdk;

import com.bytedance.covode.number.Covode;

public enum b {
    SUCCESS,
    CANCEL,
    NETWORK_ERROR,
    SERVER_ERROR,
    AUTHENTICATION_AGENT_ERROR,
    INTERNAL_ERROR;

    static {
        Covode.recordClassIndex(34550);
    }
}
