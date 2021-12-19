package com.bytedance.router;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface IMappingInitializer {
    static {
        Covode.recordClassIndex(26104);
    }

    int getMapSize();

    void init(Map<String, String> map);

    void initInterceptorMap(Map<String, List<String>> map);
}
