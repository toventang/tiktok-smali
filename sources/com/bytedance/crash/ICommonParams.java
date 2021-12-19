package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface ICommonParams {
    static {
        Covode.recordClassIndex(16119);
    }

    Map<String, Object> getCommonParams();

    String getDeviceId();

    List<String> getPatchInfo();

    Map<String, Integer> getPluginInfo();

    String getSessionId();

    long getUserId();
}
