package com.samsung.sdk.sperf;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

/* access modifiers changed from: package-private */
public class Boost {
    private static boolean isLoadLib;

    static {
        Covode.recordClassIndex(35498);
    }

    Boost() {
    }

    public static void com_samsung_sdk_sperf_Boost_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str);
        m.a(uptimeMillis, str);
    }

    public static boolean init() {
        if (isLoadLib) {
            return true;
        }
        try {
            com_samsung_sdk_sperf_Boost_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("perfsdk.performance.samsung");
            isLoadLib = true;
        } catch (UnsatisfiedLinkError e2) {
            SPerfUtil.log("ERROR : Library load fail.. not exist or check permission");
            e2.printStackTrace();
        } catch (Exception e3) {
            SPerfUtil.log("Library has problem");
            e3.printStackTrace();
        }
        return isLoadLib;
        isLoadLib = false;
        return isLoadLib;
    }

    public static native int releaseBoost();

    public static native int releaseBoost(int i2);

    public static int releaseNativeBoost() {
        int defaultLevel;
        MethodCollector.i(4777);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.o(4777);
            return -1;
        }
        releaseBoost();
        SPerfUtil.log("release all boost");
        int i2 = 0;
        do {
            BoostResource boostResource = BoostLevelControl.getBoostResource(i2);
            if (!(boostResource == null || (defaultLevel = boostResource.getDefaultLevel()) == 64532198)) {
                int realBoostLevel = BoostLevelControl.getRealBoostLevel(defaultLevel, i2);
                if (CustomParams.getBoostType(i2) == 1) {
                    requestBoost(i2, realBoostLevel, PerformanceManager.getPid());
                } else {
                    requestBoost(i2, realBoostLevel, 0);
                }
            }
            i2++;
        } while (i2 < 11);
        MethodCollector.o(4777);
        return 0;
    }

    public static int releaseNativeBoost(int i2, int i3) {
        MethodCollector.i(4783);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.o(4783);
            return -1;
        }
        BoostResource boostResource = BoostLevelControl.getBoostResource(i2);
        if (boostResource == null) {
            MethodCollector.o(4783);
            return -1;
        }
        int defaultLevel = boostResource.getDefaultLevel();
        if (defaultLevel == 64532198) {
            releaseBoost(i2);
        } else {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(defaultLevel, i2);
            if (i3 < 0) {
                requestBoost(i2, realBoostLevel, 0);
            } else {
                requestBoost(i2, realBoostLevel, i3);
            }
        }
        SPerfUtil.log("release all boost");
        MethodCollector.o(4783);
        return 0;
    }

    public static native int requestBoost(int i2, int i3, int i4);

    public static int requestNativeBoost(BoostObject boostObject) {
        MethodCollector.i(4878);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.o(4878);
            return -1;
        }
        int i2 = 0;
        do {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(boostObject, i2);
            int timeout = boostObject.getTimeout(i2);
            if (!(realBoostLevel == 64532198 || timeout == 64532198)) {
                if (timeout == 99999999) {
                    timeout = -1;
                }
                SPerfUtil.log("acquire boost - type : " + i2 + "   value : " + realBoostLevel + "   timeouts : " + timeout);
                if (CustomParams.getBoostType(i2) == 1) {
                    timeout = PerformanceManager.getPid();
                    SPerfManager.startTaskReleaseHandler(i2, timeout);
                }
                requestBoost(i2, realBoostLevel, timeout);
            }
            i2++;
        } while (i2 < 11);
        MethodCollector.o(4878);
        return 0;
    }

    public static int requestNativeBoostForProcess(BoostObject boostObject) {
        MethodCollector.i(4895);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.o(4895);
            return -1;
        }
        int i2 = 0;
        do {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(boostObject, i2);
            int timeout = boostObject.getTimeout(i2);
            if (!(realBoostLevel == 64532198 || timeout == 64532198)) {
                if (timeout == 99999999) {
                    timeout = -1;
                }
                SPerfUtil.log("acquire boost - type : " + i2 + "   value : " + realBoostLevel + "   timeouts : " + timeout);
                requestBoost(i2, realBoostLevel, timeout);
            }
            i2++;
        } while (i2 < 11);
        MethodCollector.o(4895);
        return 0;
    }

    public static int setNativePkgName(String str) {
        int i2;
        MethodCollector.i(4909);
        if (str == null) {
            SPerfUtil.log("ERR : PkgName is Null.. check it again");
            i2 = -1;
        } else {
            setPkgName(str);
            SPerfUtil.log("Unique Pkg Name set : " + str);
            i2 = 0;
        }
        MethodCollector.o(4909);
        return i2;
    }

    public static native int setPkgName(String str);
}
