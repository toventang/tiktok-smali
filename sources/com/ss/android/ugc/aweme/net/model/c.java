package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;

public enum c {
    NATIVE_NETWORK_MONITOR_EXCEPTION_LOG("native_network_monitor_exception_log"),
    UNEXPECTED_NETWORK_LOG("unexpected_network_log"),
    NATIVE_NETWORK_API_LOG("native_network_api_log"),
    PENETRATE_HEADER_LOG("penetrate_header_log"),
    HTTP_COOKIE_TOKEN_LOG("http_cookie_token_log"),
    COMPLIANCE_NETWORK_MONITOR_LOG("compliance_network_monitor_log"),
    COMPLIANCE_PAYLOAD_MONITOR_LOG("compliance_payload_monitor_log"),
    COMPLIANCE_THIRDPARTY_NETWORK_MONITOR_LOG("compliance_thirdparty_network_monitor_log");
    
    private final String logType;

    public final String getLogType() {
        return this.logType;
    }

    static {
        Covode.recordClassIndex(72269);
    }

    private c(String str) {
        this.logType = str;
    }
}
