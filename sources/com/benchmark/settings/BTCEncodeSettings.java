package com.benchmark.settings;

import com.bytedance.covode.number.Covode;

public class BTCEncodeSettings {
    private String colorFormat;
    private boolean isDecodeToSurface;
    private int srcHeight = 1080;
    private int srcWidth = 720;
    public String strVideoOutputPath;
    public String strYUVPath;
    private boolean useVC1;

    static {
        Covode.recordClassIndex(3042);
    }

    public String getColorFormat() {
        return this.colorFormat;
    }

    public int getSrcHeight() {
        return this.srcHeight;
    }

    public int getSrcWidth() {
        return this.srcWidth;
    }

    public String getStrVideoOutputPath() {
        return this.strVideoOutputPath;
    }

    public boolean isDecodeToSurface() {
        return this.isDecodeToSurface;
    }

    public boolean isUseVC1() {
        return this.useVC1;
    }

    public BTCEncodeSettings(String str, String str2, boolean z, int i2, int i3, String str3, boolean z2) {
        this.strYUVPath = str;
        this.strVideoOutputPath = str2;
        this.srcWidth = i2;
        this.srcHeight = i3;
        this.isDecodeToSurface = z;
        this.useVC1 = z2;
        this.colorFormat = str3;
    }
}
