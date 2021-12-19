package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;

public interface IActivityLifeManager extends IService {
    static {
        Covode.recordClassIndex(26949);
    }

    boolean isForeground();

    void register(d dVar);

    void unregister(d dVar);
}
