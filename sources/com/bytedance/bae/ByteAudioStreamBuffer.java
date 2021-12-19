package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public class ByteAudioStreamBuffer {
    public byte[] data;
    public int length;
    public ByteAudioStreamFormat streamFormat;
    public int timestamp;

    static {
        Covode.recordClassIndex(15320);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLength() {
        return this.length;
    }

    public ByteAudioStreamFormat getStreamFormat() {
        return this.streamFormat;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public void setLength(int i2) {
        this.length = i2;
    }

    public void setTimestamp(int i2) {
        this.timestamp = i2;
    }

    private static ByteAudioStreamBuffer create(byte[] bArr, int i2, ByteAudioStreamFormat byteAudioStreamFormat, int i3) {
        return new ByteAudioStreamBuffer(bArr, i2, byteAudioStreamFormat, i3);
    }

    public ByteAudioStreamBuffer(byte[] bArr, int i2, ByteAudioStreamFormat byteAudioStreamFormat, int i3) {
        this.data = bArr;
        this.length = i2;
        this.streamFormat = byteAudioStreamFormat;
        this.timestamp = i3;
    }
}
