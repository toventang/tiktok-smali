package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRAudioStream implements IAudioStream {
    public int mBandWidth;
    private String mCodec;
    private int mSampleRate;
    private int mSegmentDuration;
    private String mStreamId = "";

    static {
        Covode.recordClassIndex(27996);
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getBandwidth() {
        return this.mBandWidth;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getCodec() {
        return this.mCodec;
    }

    @Override // com.bytedance.vcloud.abrmodule.IAudioStream
    public int getSampleRate() {
        return this.mSampleRate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getSegmentDuration() {
        return this.mSegmentDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getStreamId() {
        return this.mStreamId;
    }

    public void setBandWidth(int i2) {
        this.mBandWidth = i2;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setSampleRate(int i2) {
        this.mSampleRate = i2;
    }

    public void setSegmentDuration(int i2) {
        this.mSegmentDuration = i2;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
