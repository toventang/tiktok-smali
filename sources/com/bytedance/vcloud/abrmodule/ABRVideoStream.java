package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRVideoStream implements IVideoStream {
    public int mBandWidth;
    private String mCodec;
    private int mFrameRate;
    private int mHeight;
    private int mResolution;
    private int mSegmentDuration;
    private String mStreamId = "";
    private int mSupportSR;
    private int mWidth;

    static {
        Covode.recordClassIndex(28005);
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public float getFrameRate() {
        return (float) this.mFrameRate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getBandwidth() {
        return this.mBandWidth;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getCodec() {
        return this.mCodec;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getResolution() {
        return this.mResolution;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getSegmentDuration() {
        return this.mSegmentDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getStreamId() {
        return this.mStreamId;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getSupportSR() {
        return this.mSupportSR;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getWidth() {
        return this.mWidth;
    }

    public void setBandWidth(int i2) {
        this.mBandWidth = i2;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setFrameRate(int i2) {
        this.mFrameRate = i2;
    }

    public void setHeight(int i2) {
        this.mHeight = i2;
    }

    public void setResolution(int i2) {
        this.mResolution = i2;
    }

    public void setSegmentDuration(int i2) {
        this.mSegmentDuration = i2;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }

    public void setSupportSR(int i2) {
        this.mSupportSR = i2;
    }

    public void setWidth(int i2) {
        this.mWidth = i2;
    }
}
