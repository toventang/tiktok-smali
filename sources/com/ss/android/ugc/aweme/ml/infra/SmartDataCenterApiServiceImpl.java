package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.b;
import java.util.Map;

public final class SmartDataCenterApiServiceImpl extends SmartDataCenterApiService {
    static {
        Covode.recordClassIndex(70985);
    }

    public static ISmartDataCenterApiService a() {
        MethodCollector.i(7304);
        Object a2 = b.a(ISmartDataCenterApiService.class, false);
        if (a2 != null) {
            ISmartDataCenterApiService iSmartDataCenterApiService = (ISmartDataCenterApiService) a2;
            MethodCollector.o(7304);
            return iSmartDataCenterApiService;
        }
        if (b.cL == null) {
            synchronized (ISmartDataCenterApiService.class) {
                try {
                    if (b.cL == null) {
                        b.cL = new SmartDataCenterApiServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7304);
                    throw th;
                }
            }
        }
        SmartDataCenterApiService smartDataCenterApiService = (SmartDataCenterApiService) b.cL;
        MethodCollector.o(7304);
        return smartDataCenterApiService;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
        MLDataCenterService.b.f110379a.addSceneModelConfig(inputFeaturesConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public final boolean fillInputFeatures(Map<String, Object> map, InputFeaturesConfig inputFeaturesConfig, h hVar) {
        return MLDataCenterService.b.f110379a.fillInputFeatures(map, inputFeaturesConfig, hVar);
    }
}
