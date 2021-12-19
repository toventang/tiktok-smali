package com.bytedance.ies.xelement.defaultimpl.player.engine.api.common;

import com.bytedance.covode.number.Covode;

public enum d {
    EXCELLENT("excellent"),
    GOOD("good"),
    REGULAR("regular");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(22240);
    }

    private d(String str) {
        this.desc = str;
    }
}
