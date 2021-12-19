package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.agent.filter.ISendFilter;
import com.bytedance.covode.number.Covode;

public class JSONTrace implements ISendFilter {
    static {
        Covode.recordClassIndex(14381);
    }

    @Override // com.bytedance.apm.agent.filter.ISendFilter
    public boolean isSend() {
        return false;
    }
}
