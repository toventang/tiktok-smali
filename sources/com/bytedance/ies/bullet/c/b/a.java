package com.bytedance.ies.bullet.c.b;

import com.bytedance.covode.number.Covode;

public enum a {
    Closed;
    
    private final String actionType;

    public final String getActionType() {
        return this.actionType;
    }

    static {
        Covode.recordClassIndex(18716);
    }

    private a() {
        this.actionType = r3;
    }
}
