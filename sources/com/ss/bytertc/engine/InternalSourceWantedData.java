package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    static {
        Covode.recordClassIndex(100767);
    }

    public String toString() {
        return "InternalSourceWantedData{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", frameRate='" + this.frameRate + '\'' + '}';
    }

    private static InternalSourceWantedData create(int i2, int i3, int i4) {
        return new InternalSourceWantedData(i2, i3, i4);
    }

    public InternalSourceWantedData(int i2, int i3, int i4) {
        this.width = i2;
        this.height = i3;
        this.frameRate = i4;
    }
}
