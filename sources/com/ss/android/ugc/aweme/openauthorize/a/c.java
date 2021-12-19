package com.ss.android.ugc.aweme.openauthorize.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "client_icon")
    private final String clientIcon;
    @com.google.gson.a.c(a = "client_key")
    private final String clientKey;
    @com.google.gson.a.c(a = "client_name")
    private final String clientName;

    static {
        Covode.recordClassIndex(73691);
    }

    public final String getClientIcon() {
        return this.clientIcon;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getClientName() {
        return this.clientName;
    }
}
