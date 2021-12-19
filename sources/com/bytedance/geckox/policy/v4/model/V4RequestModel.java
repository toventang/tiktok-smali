package com.bytedance.geckox.policy.v4.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public class V4RequestModel {
    @c(a = "custom")
    private Map<String, Object> custom;
    private V4DeploymentModel deployment;

    static {
        Covode.recordClassIndex(17420);
    }

    public Map<String, Object> getCustom() {
        return this.custom;
    }

    public V4DeploymentModel getDeployment() {
        return this.deployment;
    }

    public void setCustom(Map<String, Object> map) {
        this.custom = map;
    }

    public void setDeployment(V4DeploymentModel v4DeploymentModel) {
        this.deployment = v4DeploymentModel;
    }

    public V4RequestModel(Map<String, Object> map, V4DeploymentModel v4DeploymentModel) {
        this.custom = map;
        this.deployment = v4DeploymentModel;
    }
}
