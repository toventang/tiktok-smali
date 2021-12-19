package com.benchmark;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IBTCHNetTag {
    static {
        Covode.recordClassIndex(2931);
    }

    Map<String, String> getNetTag();
}
