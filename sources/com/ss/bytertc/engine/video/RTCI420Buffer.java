package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class RTCI420Buffer {
    private ByteBuffer dataU;
    private ByteBuffer dataV;
    private ByteBuffer dataY;
    private int height;
    private int width;

    static {
        Covode.recordClassIndex(101081);
    }

    public ByteBuffer getDataU() {
        return this.dataU;
    }

    public ByteBuffer getDataV() {
        return this.dataV;
    }

    public ByteBuffer getDataY() {
        return this.dataY;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDataU(ByteBuffer byteBuffer) {
        this.dataU = byteBuffer;
    }

    public void setDataV(ByteBuffer byteBuffer) {
        this.dataV = byteBuffer;
    }

    public void setDataY(ByteBuffer byteBuffer) {
        this.dataY = byteBuffer;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }
}
