package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.d;
import com.ss.android.ugc.aweme.ml.b.c;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.h;
import java.util.Map;
import org.json.JSONObject;

public interface IMLDataCenterService {
    static {
        Covode.recordClassIndex(70852);
    }

    void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    void checkAndInit();

    boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, h hVar);

    d.a getFeatureStaticGetter();

    c getFeedTrackRangeInfo(String str, int i2, boolean z);

    void traceMobClickEvent(String str, JSONObject jSONObject);
}
