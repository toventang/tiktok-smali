package com.bytedance.ies.bullet.kit.rn.core;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface b {
    static {
        Covode.recordClassIndex(19055);
    }

    Map<String, Object> getConstants();

    String getName();

    boolean hasConstants();

    void initialize();

    void onCatalystInstanceDestroy();
}
