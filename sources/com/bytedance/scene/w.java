package com.bytedance.scene;

import com.bytedance.covode.number.Covode;

public enum w {
    NONE(0, "NONE"),
    VIEW_CREATED(1, "VIEW_CREATED"),
    ACTIVITY_CREATED(2, "ACTIVITY_CREATED"),
    STARTED(3, "STARTED"),
    RESUMED(4, "RESUMED");
    
    public final String name;
    public final int value;

    public final String getName() {
        return this.name;
    }

    static {
        Covode.recordClassIndex(26392);
    }

    private w(int i2, String str) {
        this.value = i2;
        this.name = str;
    }
}
