package com.bytedance.services.slardar.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

public interface IConfigManager extends IService {
    static {
        Covode.recordClassIndex(26963);
    }

    void fetchConfig();

    int getConfigInt(String str, int i2);

    JSONObject getConfigJSON(String str);

    boolean getLogTypeSwitch(String str);

    boolean getMetricTypeSwitch(String str);

    boolean getServiceSwitch(String str);

    boolean getSwitch(String str);

    boolean isConfigReady();

    String queryConfig();

    void registerConfigListener(a aVar);

    void registerResponseConfigListener(b bVar);

    void unregisterConfigListener(a aVar);

    void unregisterResponseConfigListener(b bVar);
}
