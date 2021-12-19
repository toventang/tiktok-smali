package com.ss.bytertc.engine.device;

import com.bytedance.covode.number.Covode;

public enum DeviceType {
    MICROPHONE(0),
    SPEAKER(1),
    CAMERA(2);
    
    int type;

    /* access modifiers changed from: package-private */
    public final int getId() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(100880);
    }

    public static DeviceType fromId(int i2) {
        DeviceType[] values = values();
        for (DeviceType deviceType : values) {
            if (deviceType.getId() == i2) {
                return deviceType;
            }
        }
        return null;
    }

    private DeviceType(int i2) {
        this.type = i2;
    }
}
