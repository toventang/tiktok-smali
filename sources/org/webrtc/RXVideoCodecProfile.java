package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* access modifiers changed from: package-private */
public enum RXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    ByteVC1ProfileUnknown(10),
    ByteVC1ProfileMain(11),
    ByteVC1ProfileMain10(12),
    ByteVC1ProfileMain10HDR10(100),
    ByteVC1ProfileMax(128);
    
    private int value;

    public final int toInt() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(106644);
    }

    static RXVideoCodecProfile fromValue(int i2) {
        if (i2 == 0) {
            return Unknown;
        }
        if (i2 == 1) {
            return ProfileConstrainedBaseline;
        }
        if (i2 == 2) {
            return ProfileBaseline;
        }
        if (i2 == 3) {
            return ProfileMain;
        }
        if (i2 == 4) {
            return ProfileConstrainedHigh;
        }
        if (i2 == 5) {
            return ProfileHigh;
        }
        if (i2 == 100) {
            return ByteVC1ProfileMain10HDR10;
        }
        if (i2 == 128) {
            return ByteVC1ProfileMax;
        }
        switch (i2) {
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return ByteVC1ProfileUnknown;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return ByteVC1ProfileMain;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return ByteVC1ProfileMain10;
            default:
                return Unknown;
        }
    }

    private RXVideoCodecProfile(int i2) {
        this.value = i2;
    }
}
