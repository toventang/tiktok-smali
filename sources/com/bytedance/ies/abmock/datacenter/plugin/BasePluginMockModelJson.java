package com.bytedance.ies.abmock.datacenter.plugin;

import com.bytedance.covode.number.Covode;

public abstract class BasePluginMockModelJson {
    protected StringBuilder mockModelJsonBuilder;

    static {
        Covode.recordClassIndex(18615);
    }

    public String getMockModelJson() {
        StringBuilder sb = this.mockModelJsonBuilder;
        if (sb == null) {
            return "[]";
        }
        return sb.toString();
    }
}
