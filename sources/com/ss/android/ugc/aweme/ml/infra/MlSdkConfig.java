package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class MlSdkConfig {
    @c(a = "package")
    private String packageUrl;

    static {
        Covode.recordClassIndex(70968);
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String toString() {
        return "{packageUrl=" + this.packageUrl + '}';
    }

    public final void setPackageUrl(String str) {
        this.packageUrl = str;
    }
}
