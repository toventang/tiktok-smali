package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.infra.b;
import com.ss.android.ugc.aweme.ml.infra.h;
import h.f.b.l;

public final class SmartDataTrackerServiceDefault extends SmartDataTrackerService {
    static {
        Covode.recordClassIndex(70873);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void onScenePredictCheckOrRun(String str, h hVar, b bVar) {
    }

    public final void onSceneRealCheckAndReport(String str, h hVar) {
    }

    public final void putExtData(String str, String str2, String str3, Object obj) {
        l.d(str3, "");
        l.d(obj, "");
    }
}
