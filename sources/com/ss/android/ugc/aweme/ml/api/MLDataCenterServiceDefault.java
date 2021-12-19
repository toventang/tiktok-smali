package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.b.c;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.h;
import java.util.Map;
import org.json.JSONObject;

public final class MLDataCenterServiceDefault extends MLDataCenterService {
    static {
        Covode.recordClassIndex(70868);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, h hVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final d.a getFeatureStaticGetter() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final c getFeedTrackRangeInfo(String str, int i2, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void traceMobClickEvent(String str, JSONObject jSONObject) {
    }

    public final void trackPlayPrepare(String str, Aweme aweme, String str2) {
    }

    public final void trackPlaytime(String str, long j2, Aweme aweme, String str2) {
    }
}
