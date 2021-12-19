package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import java.util.Map;

public interface ISpeedPredictor {
    static {
        Covode.recordClassIndex(28035);
    }

    void close();

    float getAverageDownloadSpeed(int i2, int i3, boolean z);

    Map<String, String> getDownloadSpeed(int i2);

    float getLastPredictConfidence();

    String getMultidimensionalDownloadSpeeds();

    SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj();

    String getMultidimensionalPredictSpeeds();

    SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj();

    float getPredictSpeed();

    float getPredictSpeed(int i2);

    String getVersion();

    void prepare();

    void release();

    void setConfigInfo(Map map);

    void setModelComponent(MLComponentManager mLComponentManager);

    void setSpeedQueueSize(int i2);

    void start();

    void update(long j2, long j3, long j4);

    void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    void update(String str, Map<String, Integer> map);
}
