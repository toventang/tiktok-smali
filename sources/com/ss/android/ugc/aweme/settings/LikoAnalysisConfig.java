package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LikoAnalysisConfig {
    @c(a = "bigObjectFilterSystem")
    boolean bigObjectFilterSystem = true;
    @c(a = "bigObjectLatitude")
    int bigObjectLatitude = 3;
    @c(a = "bitmapLatitude")
    int bitmapLatitude = 204800;
    @c(a = "objectInstanceFilterSystem")
    boolean objectInstanceFilterSystem = true;
    @c(a = "objectInstanceLatitude")
    int objectInstanceLatitude = 10;
    @c(a = "supportBigObjectAnalysis")
    boolean supportBigObjectAnalysis = true;
    @c(a = "supportBitmapAnalysis")
    boolean supportBitmapAnalysis = true;
    @c(a = "supportObjectInstanceAnalysis")
    boolean supportObjectInstanceAnalysis = true;

    static {
        Covode.recordClassIndex(80833);
    }

    public int getBigObjectLatitude() {
        return this.bigObjectLatitude;
    }

    public int getBitmapLatitude() {
        return this.bitmapLatitude;
    }

    public int getObjectInstanceLatitude() {
        return this.objectInstanceLatitude;
    }

    public boolean isBigObjectFilterSystem() {
        return this.bigObjectFilterSystem;
    }

    public boolean isObjectInstanceFilterSystem() {
        return this.objectInstanceFilterSystem;
    }

    public boolean isSupportBigObjectAnalysis() {
        return this.supportBigObjectAnalysis;
    }

    public boolean isSupportBitmapAnalysis() {
        return this.supportBitmapAnalysis;
    }

    public boolean isSupportObjectInstanceAnalysis() {
        return this.supportObjectInstanceAnalysis;
    }

    public void setBigObjectFilterSystem(boolean z) {
        this.bigObjectFilterSystem = z;
    }

    public void setBigObjectLatitude(int i2) {
        this.bigObjectLatitude = i2;
    }

    public void setBitmapLatitude(int i2) {
        this.bitmapLatitude = i2;
    }

    public void setObjectInstanceFilterSystem(boolean z) {
        this.objectInstanceFilterSystem = z;
    }

    public void setObjectInstanceLatitude(int i2) {
        this.objectInstanceLatitude = i2;
    }

    public void setSupportBigObjectAnalysis(boolean z) {
        this.supportBigObjectAnalysis = z;
    }

    public void setSupportBitmapAnalysis(boolean z) {
        this.supportBitmapAnalysis = z;
    }

    public void setSupportObjectInstanceAnalysis(boolean z) {
        this.supportObjectInstanceAnalysis = z;
    }
}
