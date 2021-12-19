package com.ss.android.ugc.aweme.crossplatform.platform.rn.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class RNBundleInfo {
    @c(a = "base_version")
    String baseVersion;
    @c(a = "modules")
    List<String> modules;
    @c(a = "version")
    String version;

    static {
        Covode.recordClassIndex(48917);
    }

    public String getBaseVersion() {
        return this.baseVersion;
    }

    public List<String> getModules() {
        return this.modules;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "\nmodules: " + this.modules + "\nversion: " + this.version + "\nbase_version: " + this.baseVersion;
    }

    public void setBaseVersion(String str) {
        this.baseVersion = str;
    }

    public void setModules(List<String> list) {
        this.modules = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
