package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

public interface IPreloadVESo {
    static {
        Covode.recordClassIndex(79471);
    }

    long getPreLoadVESoCostTime();

    PreloadVESoStatus getPreLoadVESoStatus();

    void preLoadVESo();
}
