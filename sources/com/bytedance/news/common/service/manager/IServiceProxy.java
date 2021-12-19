package com.bytedance.news.common.service.manager;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IServiceProxy<T> {
    static {
        Covode.recordClassIndex(25449);
    }

    void collectService(Map<String, String> map);

    T newInstance();
}
