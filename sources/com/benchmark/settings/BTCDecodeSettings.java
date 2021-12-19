package com.benchmark.settings;

import com.bytedance.covode.number.Covode;

public class BTCDecodeSettings {
    public String decodeFile;
    public String decodeFrameSaveDir = "";
    private int dstHeight = 1280;
    private int dstWidth = 720;
    public boolean isDebug;
    private boolean isDecodeToSurface = true;
    private boolean useVC1;

    static {
        Covode.recordClassIndex(3041);
    }

    public int getDstHeight() {
        return this.dstHeight;
    }

    public int getDstWidth() {
        return this.dstWidth;
    }

    public boolean isDecodeToSurface() {
        return this.isDecodeToSurface;
    }

    public boolean isUseVC1() {
        return this.useVC1;
    }

    public BTCDecodeSettings(boolean z, int i2, int i3, String str) {
        this.isDecodeToSurface = z;
        this.dstWidth = i2;
        this.dstHeight = i3;
        this.decodeFile = str;
    }
}
