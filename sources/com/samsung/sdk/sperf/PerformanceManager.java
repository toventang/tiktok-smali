package com.samsung.sdk.sperf;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PerformanceManager {
    private static PerformanceManager mPerformanceManager;
    private static int myPid = -1;
    private static SPerfManager sPerfManager;

    static {
        Covode.recordClassIndex(35503);
    }

    private PerformanceManager() {
    }

    public static PerformanceManager getInstance() {
        PerformanceManager performanceManager;
        MethodCollector.i(5952);
        synchronized (PerformanceManager.class) {
            try {
                if (mPerformanceManager == null) {
                    mPerformanceManager = new PerformanceManager();
                }
                performanceManager = null;
                SPerfManager createInstance = SPerfManager.createInstance(null);
                sPerfManager = createInstance;
                if (createInstance != null) {
                    performanceManager = mPerformanceManager;
                }
            } finally {
                MethodCollector.o(5952);
            }
        }
        return performanceManager;
    }

    protected static int getPid() {
        if (myPid < 0) {
            myPid = Process.myPid();
        }
        return myPid;
    }

    public int start(int i2, int i3) {
        SPerfManager sPerfManager2 = sPerfManager;
        if (sPerfManager2 != null) {
            return sPerfManager2.startPresetBoost(i2, i3);
        }
        SPerfUtil.log("SPerf has not initialized");
        return -1;
    }

    public int start(CustomParams customParams) {
        String str;
        if (sPerfManager == null) {
            str = "SPerf has not initialized";
        } else if (customParams == null) {
            str = "CustomParams is null";
        } else {
            BoostObject boostObject = customParams.getBoostObject();
            if (boostObject != null) {
                return sPerfManager.startBoost(boostObject);
            }
            str = "CustomParams is not initialized";
        }
        SPerfUtil.log(str);
        return -1;
    }

    public int stop() {
        SPerfManager sPerfManager2 = sPerfManager;
        if (sPerfManager2 != null) {
            return sPerfManager2.stopBoost();
        }
        SPerfUtil.log("SPerf has not initialized");
        return -1;
    }
}
