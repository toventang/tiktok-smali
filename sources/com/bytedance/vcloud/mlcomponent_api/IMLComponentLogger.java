package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IMLComponentLogger {
    static {
        Covode.recordClassIndex(28024);
    }

    void logEvent(String str, Map map);
}
