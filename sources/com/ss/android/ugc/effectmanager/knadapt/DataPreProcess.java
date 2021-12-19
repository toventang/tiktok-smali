package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;

public final class DataPreProcess {
    public static final DataPreProcess INSTANCE = new DataPreProcess();
    public static boolean enable;

    private DataPreProcess() {
    }

    static {
        Covode.recordClassIndex(95541);
    }
}
