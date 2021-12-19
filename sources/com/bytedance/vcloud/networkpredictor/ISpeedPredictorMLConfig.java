package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface ISpeedPredictorMLConfig {
    static {
        Covode.recordClassIndex(28039);
    }

    boolean enable();

    String getModelDirName();

    String getModelType();

    String modelUrl();
}
