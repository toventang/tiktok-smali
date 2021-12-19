package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;

public interface IStrategyStateSupplier {
    static {
        Covode.recordClassIndex(28058);
    }

    double getNetworkSpeed();

    int getNetworkType();

    String mediaInfoJsonString(String str);

    String onAfterSelect(String str, String str2, int i2, Object obj);

    String onBeforeSelect(String str, String str2, int i2, Object obj);

    String selectBitrateJsonString(String str, int i2);

    String selectBitrateJsonString(String str, String str2, int i2);
}
