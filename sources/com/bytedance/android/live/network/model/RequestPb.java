package com.bytedance.android.live.network.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RequestPb {
    @c(a = "enable")
    private boolean enable;
    @c(a = "pass_through_api")
    private String passThroughApi;
    @c(a = "switches")
    private String switches;

    static {
        Covode.recordClassIndex(6647);
    }

    public String getPassThroughApi() {
        return this.passThroughApi;
    }

    public String getSwitches() {
        return this.switches;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public static RequestPb defaultInstance() {
        RequestPb requestPb = new RequestPb();
        requestPb.enable = false;
        requestPb.switches = "{}";
        requestPb.passThroughApi = "";
        return requestPb;
    }
}
