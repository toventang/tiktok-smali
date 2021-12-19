package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface IABRModule {
    static {
        Covode.recordClassIndex(28009);
    }

    void addBufferInfo(int i2, String str, long j2, long j3, long j4);

    float getFloatOption(int i2, float f2);

    long getLongOption(int i2, long j2);

    ABRResult getPredict();

    String getVersion();

    void init(IPlayStateSupplier iPlayStateSupplier);

    ABRResult onceSelect(int i2, int i3);

    void release();

    void setDeviceInfo(IDeviceInfo iDeviceInfo);

    void setDoubleOptionForKey(int i2, double d2);

    void setFloatOptionForKey(int i2, float f2);

    void setInfoListener(IABRInfoListener iABRInfoListener);

    void setIntOptionForKey(int i2, int i3);

    void setLongOptionForKey(int i2, long j2);

    void setMediaInfo(List<IVideoStream> list, List<IAudioStream> list2);

    void setSRBenchmark(Map<Integer, Integer> map);

    void setSRBenchmarkMap(Map<Integer, List<Integer>> map);

    void setStringOptionForKey(int i2, String str);

    void start(int i2, int i3);

    void stop();
}
