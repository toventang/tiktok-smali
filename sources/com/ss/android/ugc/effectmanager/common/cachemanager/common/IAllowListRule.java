package com.ss.android.ugc.effectmanager.common.cachemanager.common;

import com.bytedance.covode.number.Covode;

public interface IAllowListRule {
    static {
        Covode.recordClassIndex(95282);
    }

    boolean isAllowed(String str);
}
