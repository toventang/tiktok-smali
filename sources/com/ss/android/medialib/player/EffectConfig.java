package com.ss.android.medialib.player;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.model.EffectFileInfo;
import com.ss.android.medialib.model.EffectModel;

public class EffectConfig {
    String deviceName;
    String effect8File;
    String effect9File;
    int effectBuildChainType = 1;
    EffectFileInfo[] effectFileInfos;
    String effectModelDir;
    EffectModel[] effectModels;
    int effectType;
    float filterIntensity = -1.0f;
    String leftFilter;
    float pos;
    String rightFilter;
    String snowflakeFile;
    String vertigoFile;

    static {
        Covode.recordClassIndex(36927);
    }

    public String getEffect8File() {
        return this.effect8File;
    }

    public String getEffect9File() {
        return this.effect9File;
    }

    public int getEffectBuildChainType() {
        return this.effectBuildChainType;
    }

    public EffectFileInfo[] getEffectFileInfos() {
        return this.effectFileInfos;
    }

    public EffectModel[] getEffectModels() {
        return this.effectModels;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public float getFilterIntensity() {
        return this.filterIntensity;
    }

    public String getLeftFilter() {
        return this.leftFilter;
    }

    public float getPos() {
        return this.pos;
    }

    public String getRightFilter() {
        return this.rightFilter;
    }

    public String getSnowflakeFile() {
        return this.snowflakeFile;
    }

    public String getVertigoFile() {
        return this.vertigoFile;
    }

    public String getDeviceName() {
        String str = this.deviceName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEffectModelDir() {
        String str = this.effectModelDir;
        if (str == null) {
            return "";
        }
        return str;
    }

    public EffectConfig setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public void setEffect8File(String str) {
        this.effect8File = str;
    }

    public void setEffect9File(String str) {
        this.effect9File = str;
    }

    public EffectConfig setEffectBuildChainType(int i2) {
        this.effectBuildChainType = i2;
        return this;
    }

    public EffectConfig setEffectFileInfos(EffectFileInfo[] effectFileInfoArr) {
        this.effectFileInfos = effectFileInfoArr;
        return this;
    }

    public EffectConfig setEffectModelDir(String str) {
        this.effectModelDir = str;
        return this;
    }

    public EffectConfig setEffectModels(EffectModel[] effectModelArr) {
        this.effectModels = effectModelArr;
        return this;
    }

    public EffectConfig setEffectType(int i2) {
        this.effectType = i2;
        return this;
    }

    public EffectConfig setFilterIntensity(float f2) {
        this.filterIntensity = f2;
        return this;
    }

    public void setSnowflakeFile(String str) {
        this.snowflakeFile = str;
    }

    public void setVertigoFile(String str) {
        this.vertigoFile = str;
    }

    public EffectConfig setFilter(String str) {
        this.leftFilter = str;
        this.rightFilter = str;
        this.pos = 1.0f;
        return this;
    }

    public EffectConfig setEffectModels(String[] strArr) {
        String[] split;
        if (strArr == null) {
            return this;
        }
        this.effectModels = new EffectModel[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (!(str == null || (split = str.split(",")) == null || split.length != 3)) {
                this.effectModels[i2] = new EffectModel(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            }
        }
        return this;
    }

    public EffectConfig setFilter(String str, String str2, float f2) {
        this.leftFilter = str;
        this.rightFilter = str2;
        this.pos = f2;
        return this;
    }

    public EffectConfig setEffectModels(int[] iArr, int i2, int i3) {
        if (iArr == null) {
            return this;
        }
        int length = (iArr.length / 3) + 1;
        this.effectModels = new EffectModel[length];
        int i4 = 0;
        while (true) {
            int i5 = length - 1;
            if (i4 < i5) {
                int i6 = i4 * 3;
                this.effectModels[i4] = new EffectModel(iArr[i6], iArr[i6 + 1], iArr[i6 + 2]);
                i4++;
            } else {
                this.effectModels[i5] = new EffectModel(i2, i3, i3);
                return this;
            }
        }
    }

    public EffectConfig setEffectFiles(String str, String str2, String str3, String str4) {
        this.effect8File = str;
        this.effect9File = str2;
        this.vertigoFile = str3;
        this.snowflakeFile = str4;
        return this;
    }
}
