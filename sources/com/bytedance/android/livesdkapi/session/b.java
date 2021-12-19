package com.bytedance.android.livesdkapi.session;

import com.bytedance.covode.number.Covode;

public enum b {
    ServerApiCall("server_api_call"),
    MessageReceived("message_received"),
    SdkInterfaceCall("sdk_interface_call"),
    SdkCallback("sdk_callback"),
    BussinessApiCall("bussiness_api_call");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(13887);
    }

    private b(String str) {
        this.type = str;
    }
}
