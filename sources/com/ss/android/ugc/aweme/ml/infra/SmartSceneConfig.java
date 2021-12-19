package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;

public class SmartSceneConfig {
    @c(a = "disable")
    private boolean disable;
    @c(a = "features")
    private InputFeaturesConfig features;
    @c(a = "out_type")
    public String outType;
    @c(a = "scene")
    private String scene;
    @c(a = "sdk")
    private SmartSdkConfig sdkConfig;
    @c(a = "track")
    private OneSmartDataTrackConfig track;

    static {
        Covode.recordClassIndex(71005);
    }

    public final boolean getDisable() {
        return this.disable;
    }

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final String getScene() {
        return this.scene;
    }

    public final SmartSdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public String toString() {
        return "SmartSceneConfig{scene=" + this.scene + ", disable=" + this.disable + ", outType=" + this.outType + ", sdkConfig=" + this.sdkConfig + ", features=" + this.features + ", track=" + this.track + '}';
    }

    public final void setDisable(boolean z) {
        this.disable = z;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setSdkConfig(SmartSdkConfig smartSdkConfig) {
        this.sdkConfig = smartSdkConfig;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
