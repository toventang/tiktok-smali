package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public class ByteAudioStreamFormat {
    public int bitRateBps;
    public int channelNum;
    public int codecType;
    public int frameSizeMs = 20;
    public int sampleRate;

    static {
        Covode.recordClassIndex(15321);
    }

    public int getBitRateBps() {
        return this.bitRateBps;
    }

    public int getChannelNum() {
        return this.channelNum;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public int getFrameSizeMs() {
        return this.frameSizeMs;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setBitRateBps(int i2) {
        this.bitRateBps = i2;
    }

    public void setChannelNum(int i2) {
        this.channelNum = i2;
    }

    public void setFrameSizeMs(int i2) {
        this.frameSizeMs = i2;
    }

    public void setSampleRate(int i2) {
        this.sampleRate = i2;
    }

    public void setCodecType(int i2) {
        if (i2 < 10000 || i2 > 10006) {
            this.codecType = 0;
        } else {
            this.codecType = i2;
        }
    }

    private static ByteAudioStreamFormat create(int i2, int i3, int i4, int i5) {
        return new ByteAudioStreamFormat(i2, i3, i4, i5);
    }

    public ByteAudioStreamFormat(int i2, int i3, int i4, int i5) {
        this.sampleRate = i2;
        this.channelNum = i3;
        this.codecType = i4;
        this.bitRateBps = i5;
    }
}
