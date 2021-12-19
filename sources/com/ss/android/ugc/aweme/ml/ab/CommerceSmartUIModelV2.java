package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

public final class CommerceSmartUIModelV2 extends CommerceSmartUIModel {
    @c(a = "features")
    private InputFeaturesConfig features;
    @c(a = "real")
    private OnePlaytimePredictRealConfig realConfig;
    @c(a = "track")
    private OneSmartDataTrackConfig track;

    static {
        Covode.recordClassIndex(70821);
    }

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
