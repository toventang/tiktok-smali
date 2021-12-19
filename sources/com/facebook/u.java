package com.facebook;

import com.bytedance.covode.number.Covode;

public enum u {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    static {
        Covode.recordClassIndex(30781);
    }
}
