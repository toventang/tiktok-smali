package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IABRModuleSpeedRecord {
    static {
        Covode.recordClassIndex(28010);
    }

    long getBytes();

    String getStreamId();

    long getTime();

    long getTimestamp();

    int getTrackType();
}
