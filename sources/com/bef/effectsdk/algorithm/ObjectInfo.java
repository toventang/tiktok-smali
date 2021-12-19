package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class ObjectInfo {
    private int bbox_bottom;
    private int bbox_left;
    private int bbox_right;
    private int bbox_top;
    private int label;

    static {
        Covode.recordClassIndex(2864);
    }

    public static int com_bef_effectsdk_algorithm_ObjectInfo_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public int getBBoxBottom() {
        return this.bbox_bottom;
    }

    public int getBBoxLeft() {
        return this.bbox_left;
    }

    public int getBBoxRight() {
        return this.bbox_right;
    }

    public int getBboxTop() {
        return this.bbox_top;
    }

    public int getLabel() {
        return this.label;
    }

    public ObjectInfo() {
        this.label = -1;
        this.bbox_left = -1;
        this.bbox_top = -1;
        this.bbox_right = -1;
        this.bbox_bottom = -1;
    }

    public void logData() {
        com_bef_effectsdk_algorithm_ObjectInfo_com_ss_android_ugc_aweme_lancet_LogLancet_d("EffectSDK", "ObjectInfo label:" + this.label + " bbox_left:" + this.bbox_left + " bbox_top:" + this.bbox_top + " bbox_right:" + this.bbox_right + " bbox_bottom:" + this.bbox_bottom);
    }

    public void setLabel(int i2) {
        this.label = i2;
    }

    public void setBBox(int i2, int i3, int i4, int i5) {
        this.bbox_left = i2;
        this.bbox_top = i3;
        this.bbox_right = i4;
        this.bbox_bottom = i5;
    }

    public ObjectInfo(int i2, int i3, int i4, int i5, int i6) {
        this.label = i2;
        this.bbox_left = i3;
        this.bbox_top = i4;
        this.bbox_right = i5;
        this.bbox_bottom = i6;
    }
}
