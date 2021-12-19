package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.infra.b;
import com.ss.android.ugc.aweme.ml.infra.h;

public interface ISmartDataTrackerService {
    static {
        Covode.recordClassIndex(70853);
    }

    void checkAndInit();

    void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig);

    boolean enable(String str);

    void onScenePredictCheckOrRun(String str, h hVar, b bVar);
}
