package com.bytedance.ies.xelement.b;

import com.bytedance.covode.number.Covode;

public enum l {
    DEFAULT("default"),
    SHORT("short"),
    LIGHT("light");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(22042);
    }

    private l(String str) {
        this.desc = str;
    }
}
