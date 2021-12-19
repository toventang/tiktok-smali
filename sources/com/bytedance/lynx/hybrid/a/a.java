package com.bytedance.lynx.hybrid.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.h.c;
import h.f.b.l;

public class a extends c {
    private final String appId;
    private final String appVersion;
    private final String did;
    private final boolean isDebug;
    private final String region;

    static {
        Covode.recordClassIndex(25043);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDid() {
        return this.did;
    }

    public final String getRegion() {
        return this.region;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public a(String str, String str2, String str3, String str4, boolean z) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(str4, "");
        this.region = str;
        this.appId = str2;
        this.appVersion = str3;
        this.did = str4;
        this.isDebug = z;
    }
}
