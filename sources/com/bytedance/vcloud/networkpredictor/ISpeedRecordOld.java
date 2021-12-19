package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface ISpeedRecordOld {
    static {
        Covode.recordClassIndex(28040);
    }

    long getBytes();

    long getLastRecvDate();

    String getProtocol();

    String getStreamId();

    long getTcpInfoRtt();

    long getTime();

    long getTimestamp();

    int getTrackType();
}
