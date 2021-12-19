package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class SmartSdkConfig {
    @c(a = "mlsdk")
    private MlSdkConfig mlSdkConfig;
    @c(a = "pitaya")
    private PitayaConfig pitayaConfig;

    static {
        Covode.recordClassIndex(71006);
    }

    public final MlSdkConfig getMlSdkConfig() {
        return this.mlSdkConfig;
    }

    public final PitayaConfig getPitayaConfig() {
        return this.pitayaConfig;
    }

    public final String toString() {
        if (this.pitayaConfig != null) {
            return "{pitayaConfig=" + this.pitayaConfig + '}';
        }
        return "{mlSdkConfig=" + this.mlSdkConfig + '}';
    }

    public final void setMlSdkConfig(MlSdkConfig mlSdkConfig2) {
        this.mlSdkConfig = mlSdkConfig2;
    }

    public final void setPitayaConfig(PitayaConfig pitayaConfig2) {
        this.pitayaConfig = pitayaConfig2;
    }
}
