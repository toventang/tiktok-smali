package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public class SpeedPredictorRecordOld implements ISpeedRecordOld {
    private long mBytes;
    private long mLastRecvDate;
    private String mProtocol;
    private String mStreamId = "";
    private long mTcpInfoRtt;
    private long mTime;
    private long mTimestamp;
    private int mTrackType;

    static {
        Covode.recordClassIndex(28050);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getBytes() {
        return this.mBytes;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getLastRecvDate() {
        return this.mLastRecvDate;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public String getProtocol() {
        return this.mProtocol;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public String getStreamId() {
        return this.mStreamId;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getTcpInfoRtt() {
        return this.mTcpInfoRtt;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getTime() {
        return this.mTime;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getTimestamp() {
        return this.mTimestamp;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public int getTrackType() {
        return this.mTrackType;
    }

    public void setBytes(long j2) {
        this.mBytes = j2;
    }

    public void setLastRecvDate(long j2) {
        this.mLastRecvDate = j2;
    }

    public void setProtocol(String str) {
        this.mProtocol = str;
    }

    public void setSteamId(String str) {
        this.mStreamId = str;
    }

    public void setTcpInfoRtt(long j2) {
        this.mTcpInfoRtt = j2;
    }

    public void setTime(long j2) {
        this.mTime = j2;
    }

    public void setTimestamp(long j2) {
        this.mTimestamp = j2;
    }

    public void setTrackType(int i2) {
        this.mTrackType = i2;
    }
}
