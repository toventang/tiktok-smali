package com.bytedance.android.livesdk.model.message.tracking;

import com.bytedance.covode.number.Covode;

public class EventTrackingMessage {
    public final String method;
    public final String source;

    static {
        Covode.recordClassIndex(11698);
    }

    EventTrackingMessage(String str, boolean z) {
        this.method = str;
        if (z) {
            this.source = "remote";
        } else {
            this.source = "native";
        }
    }
}
