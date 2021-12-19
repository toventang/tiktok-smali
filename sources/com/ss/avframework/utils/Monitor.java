package com.ss.avframework.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.MediaEngineFactory;

public class Monitor {
    private static boolean sEnableCPULoadWithTop = false;
    private static boolean sInitLogDone = false;
    private static TEBundle sMonitorDataBase = new TEBundle();

    protected static void initLogFile(Context context, int i2) {
    }

    protected static native void nativeDisableLogFile(boolean z);

    protected static native double nativeGetAppPrecentageOnCPU();

    protected static native long nativeGetAppRSSKB();

    protected static native long nativeGetAppVSSKB();

    protected static native double nativeGetCPUPrecentage();

    protected static native double nativeGetSystemPrecentageOnCPU();

    protected static native double nativeGetUserPrecentageOnCPU();

    protected static native boolean nativeInitLogFile(String str, int i2);

    protected static native boolean nativeIsDisableLogFile();

    protected static native void nativeWriteLog(String str, int i2, String str2);

    public Monitor() {
        MediaEngineFactory.getVersion();
    }

    protected static boolean isDisableLogFile() {
        MethodCollector.i(13135);
        boolean nativeIsDisableLogFile = nativeIsDisableLogFile();
        MethodCollector.o(13135);
        return nativeIsDisableLogFile;
    }

    public double getAppPrecentageOnCPU() {
        MethodCollector.i(13131);
        double nativeGetAppPrecentageOnCPU = nativeGetAppPrecentageOnCPU() * 100.0d;
        MethodCollector.o(13131);
        return nativeGetAppPrecentageOnCPU;
    }

    public long getAppRSSKB() {
        MethodCollector.i(13133);
        long nativeGetAppRSSKB = nativeGetAppRSSKB();
        MethodCollector.o(13133);
        return nativeGetAppRSSKB;
    }

    public long getAppVSSKB() {
        MethodCollector.i(13132);
        long nativeGetAppVSSKB = nativeGetAppVSSKB();
        MethodCollector.o(13132);
        return nativeGetAppVSSKB;
    }

    public double getCPUPrecentage() {
        MethodCollector.i(13128);
        double nativeGetCPUPrecentage = nativeGetCPUPrecentage() * 100.0d;
        MethodCollector.o(13128);
        return nativeGetCPUPrecentage;
    }

    public double getSystemPrecentageOnCPU() {
        MethodCollector.i(13129);
        double nativeGetSystemPrecentageOnCPU = nativeGetSystemPrecentageOnCPU() * 100.0d;
        MethodCollector.o(13129);
        return nativeGetSystemPrecentageOnCPU;
    }

    public double getUserPrecentageOnCPU() {
        MethodCollector.i(13130);
        double nativeGetUserPrecentageOnCPU = nativeGetUserPrecentageOnCPU() * 100.0d;
        MethodCollector.o(13130);
        return nativeGetUserPrecentageOnCPU;
    }

    static {
        Covode.recordClassIndex(100594);
    }

    public static void enableCPULoadStaticsWithTop(boolean z) {
        sEnableCPULoadWithTop = z;
    }

    private static TEBundle staticsCPUInfoOnTop(long j2) {
        return sMonitorDataBase;
    }

    protected static void disableLogFile(boolean z) {
        MethodCollector.i(13134);
        nativeDisableLogFile(z);
        MethodCollector.o(13134);
    }

    public static void writeLog(String str, int i2, String str2) {
        MethodCollector.i(13136);
        nativeWriteLog(str, i2, str2);
        MethodCollector.o(13136);
    }
}
