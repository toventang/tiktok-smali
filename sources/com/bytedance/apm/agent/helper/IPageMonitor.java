package com.bytedance.apm.agent.helper;

import com.bytedance.covode.number.Covode;

public interface IPageMonitor {
    static {
        Covode.recordClassIndex(14315);
    }

    String getMonitorLabel();
}
