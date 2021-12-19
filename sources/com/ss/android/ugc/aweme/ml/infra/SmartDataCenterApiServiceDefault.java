package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class SmartDataCenterApiServiceDefault extends SmartDataCenterApiService {
    static {
        Covode.recordClassIndex(70984);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public final boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, h hVar) {
        return false;
    }
}
