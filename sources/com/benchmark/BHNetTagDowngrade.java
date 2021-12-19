package com.benchmark;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public class BHNetTagDowngrade implements IBTCHNetTag {
    static {
        Covode.recordClassIndex(2925);
    }

    @Override // com.benchmark.IBTCHNetTag
    public Map<String, String> getNetTag() {
        return null;
    }
}
