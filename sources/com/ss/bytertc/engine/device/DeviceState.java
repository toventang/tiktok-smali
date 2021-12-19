package com.ss.bytertc.engine.device;

import com.bytedance.covode.number.Covode;

public enum DeviceState {
    INIT(0),
    START(1),
    STOP(2),
    REMOVE(3);
    
    int type;

    public final int getId() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(100879);
    }

    public static DeviceState fromId(int i2) {
        DeviceState[] values = values();
        for (DeviceState deviceState : values) {
            if (deviceState.getId() == i2) {
                return deviceState;
            }
        }
        return null;
    }

    private DeviceState(int i2) {
        this.type = i2;
    }
}
