package com.bytedance.sdk.bridge.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.sdk.bridge.a;
import com.bytedance.sdk.bridge.b;

public interface BridgeService extends IService {
    static {
        Covode.recordClassIndex(26806);
    }

    a initBridgeConfig();

    b initBridgeLazyConfig();

    void initBridgeSDK();

    void reportErrorInfo(String str, String str2);
}
