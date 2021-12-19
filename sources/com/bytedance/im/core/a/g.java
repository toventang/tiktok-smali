package com.bytedance.im.core.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class g implements Serializable {
    public static final g DEFAULT = new g();
    @c(a = "enable_crash_in_debug")
    public boolean enableCrash;
    @c(a = "enable_network_trace")
    public boolean enableNetworkTrace;
    @c(a = "log_cmd")
    public boolean logCmdUsage;

    static {
        Covode.recordClassIndex(22618);
    }
}
