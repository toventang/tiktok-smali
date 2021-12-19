package com.bytedance.ies.abmock.datacenter.plugin;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseConfigPlugin {
    protected Map<String, ConfigItem> configMap = new HashMap();

    static {
        Covode.recordClassIndex(18614);
    }

    public void addConfigStub() {
    }

    public Map<String, ConfigItem> getConfigMap() {
        return this.configMap;
    }

    public BaseConfigPlugin() {
        addConfigStub();
    }
}
