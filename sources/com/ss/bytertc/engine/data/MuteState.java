package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum MuteState {
    MUTE_STATE_OFF(0),
    MUTE_STATE_ON(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        if (this == MUTE_STATE_ON) {
            return "kMuteStateOn";
        }
        return "kMuteStateOff";
    }

    static {
        Covode.recordClassIndex(100859);
    }

    public static MuteState fromId(int i2) {
        MuteState[] values = values();
        for (MuteState muteState : values) {
            if (muteState.value() == i2) {
                return muteState;
            }
        }
        return null;
    }

    private MuteState(int i2) {
        this.value = i2;
    }
}
