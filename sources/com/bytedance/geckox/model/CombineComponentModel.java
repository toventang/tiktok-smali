package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.policy.loop.model.GlobalConfig;
import com.google.gson.a.c;
import java.util.List;
import java.util.Map;

public class CombineComponentModel {
    @c(a = "global_config")
    private GlobalConfig globalConfig = new GlobalConfig();
    @c(a = "packages")
    private List<UpdatePackage> packages;
    @c(a = "universal_strategies")
    private Map<String, CleanPolicyModel> universalStrategies;

    static {
        Covode.recordClassIndex(17372);
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public List<UpdatePackage> getPackages() {
        return this.packages;
    }

    public Map<String, CleanPolicyModel> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
