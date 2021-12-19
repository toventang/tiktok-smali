package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRBufferInfo implements IBufferInfo {
    private long mFileAvailSize = -1;
    private long mHeadSize = -1;
    private float mPlayerAvailDuration = -1.0f;
    private String mStreamId = "";

    static {
        Covode.recordClassIndex(27997);
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public long getFileAvailSize() {
        return this.mFileAvailSize;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public long getHeadSize() {
        return this.mHeadSize;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public float getPlayerAvailDuration() {
        return this.mPlayerAvailDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public String getStreamId() {
        return this.mStreamId;
    }

    public void setFileAvailSize(long j2) {
        this.mFileAvailSize = j2;
    }

    public void setHeadSize(long j2) {
        this.mHeadSize = j2;
    }

    public void setPlayerAvailDuration(float f2) {
        this.mPlayerAvailDuration = f2;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
