package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SaveConfigType;

public class ConfigItem {
    public Object defaultValue;
    public boolean isAB;
    public SaveConfigType.ConfigType type;

    static {
        Covode.recordClassIndex(18582);
    }

    public ConfigItem(SaveConfigType.ConfigType configType, Object obj, boolean z) {
        this.type = configType;
        this.defaultValue = obj;
        this.isAB = z;
    }
}
