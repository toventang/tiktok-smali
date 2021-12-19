package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface ISmartDataCenterApiService {
    static {
        Covode.recordClassIndex(70963);
    }

    void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, h hVar);
}
