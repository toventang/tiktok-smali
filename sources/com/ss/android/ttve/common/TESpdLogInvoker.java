package com.ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class TESpdLogInvoker {
    public native void close();

    public native int error(String str);

    public native String getLogFiles(String str);

    public native int info(int i2, String str);

    public native int initSpdLog(String str, int i2, int i3);

    public native void setLevel(int i2);

    public native int warn(String str);

    static {
        Covode.recordClassIndex(37604);
        d.a();
    }
}
