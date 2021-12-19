package com.bytedance.monitor.collector;

import com.bytedance.covode.number.Covode;

public class MonitorJni {
    static {
        Covode.recordClassIndex(25389);
    }

    static native void disableBinderHook();

    public static native void doCloseLockStackTrace();

    static native void doCollect();

    static native void doDestroy();

    static native void doDisableAtrace();

    static native void doDisableIO();

    static native String doDumpAtrace();

    static native String doDumpAtraceRange(long j2, long j3);

    static native void doDumpAtraceRangeToALog(long j2, long j3);

    static native void doEnableAtrace(int i2, long j2);

    public static native void doEnableIO();

    public static native void doEnableLock();

    static native long doGetCpuTime(int i2);

    static native String doGetSchedInfo(int i2);

    public static native void doInit();

    static native void doOpenLockStackTrace();

    public static native void doSetDebugMode(boolean z);

    static native void doSetRecordSwitch(boolean z);

    static native void doStart();

    static native void doStop();

    static native void dumpProcInfoTimeRangeToALog(long j2, long j3);

    public static native void enableBinderHook();

    static native String getProcInfoTimeRange(long j2, long j3);

    static native String getProcInfos();

    static native void keepProcHyperOpen(boolean z);

    static native void setAlogInstance(long j2);

    static native void setBufferSize(int i2);

    static native void startHyperMonitor();

    static native void stopHyperMonitor();
}
