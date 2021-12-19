package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface ISpeedPredictorAwemePredictor {
    static {
        Covode.recordClassIndex(28037);
    }

    double calculateSpeed();

    void configMlModel(ISpeedPredictorMLConfig iSpeedPredictorMLConfig);

    double getSpeed();

    void monitorVideoSpeed(double d2, double d3, long j2);

    void setPredictorListener(ISpeedPredictorAwemeListener iSpeedPredictorAwemeListener);

    void setSpeedAlgorithmType(int i2);
}
