package com.benchmark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

public class ByteBenchBundle {
    private static final Object sPoolSync = new Object();
    private static Queue<ByteBenchBundle> sPools = new ArrayDeque(8);
    private long mHandle;

    private native long nativeCreate();

    private native boolean nativeGetBool(long j2, String str);

    private native float nativeGetFloat(long j2, String str);

    private native int nativeGetInt(long j2, String str);

    private native int[] nativeGetIntArray(long j2, String str);

    private native String nativeGetString(long j2, String str);

    private static native void nativeRelease(long j2);

    private static native void nativeReleaseAll(long[] jArr);

    private native int nativeSetBool(long j2, String str, boolean z);

    private native int nativeSetByteArray(long j2, String str, byte[] bArr);

    private native int nativeSetDouble(long j2, String str, double d2);

    private native int nativeSetDoubleArray(long j2, String str, double[] dArr);

    private native int nativeSetFloat(long j2, String str, float f2);

    private native int nativeSetFloatArray(long j2, String str, float[] fArr);

    private native int nativeSetHandle(long j2, String str, long j3);

    private native int nativeSetInt(long j2, String str, int i2);

    private native int nativeSetIntArray(long j2, String str, int[] iArr);

    private native int nativeSetIntOrigin(long j2, String str, int i2);

    private native int nativeSetLong(long j2, String str, long j3);

    private native int nativeSetString(long j2, String str, String str2);

    private native int nativeSetStringArray(long j2, String str, String[] strArr);

    public long getHandle() {
        return this.mHandle;
    }

    static {
        Covode.recordClassIndex(2928);
    }

    private ByteBenchBundle() {
        MethodCollector.i(6752);
        this.mHandle = nativeCreate();
        MethodCollector.o(6752);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(6748);
        super.finalize();
        long j2 = this.mHandle;
        if (j2 != 0) {
            nativeRelease(j2);
        }
        MethodCollector.o(6748);
    }

    public void recycle() {
        MethodCollector.i(6747);
        synchronized (sPoolSync) {
            try {
                sPools.add(this);
            } finally {
                MethodCollector.o(6747);
            }
        }
    }

    public static void cleanAll() {
        MethodCollector.i(6750);
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    int size = sPools.size();
                    long[] jArr = new long[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        ByteBenchBundle poll = sPools.poll();
                        jArr[i2] = poll.getHandle();
                        poll.mHandle = 0;
                    }
                    nativeReleaseAll(jArr);
                }
            } finally {
                MethodCollector.o(6750);
            }
        }
    }

    public static ByteBenchBundle obtain() {
        ByteBenchBundle byteBenchBundle;
        MethodCollector.i(6746);
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    byteBenchBundle = sPools.poll();
                } else {
                    byteBenchBundle = new ByteBenchBundle();
                }
            } finally {
                MethodCollector.o(6746);
            }
        }
        return byteBenchBundle;
    }

    public ByteBenchBundle(long j2) {
        this.mHandle = j2;
    }

    public boolean getBool(String str) {
        MethodCollector.i(7362);
        boolean nativeGetBool = nativeGetBool(this.mHandle, str);
        MethodCollector.o(7362);
        return nativeGetBool;
    }

    public float getFloat(String str) {
        MethodCollector.i(7201);
        float nativeGetFloat = nativeGetFloat(this.mHandle, str);
        MethodCollector.o(7201);
        return nativeGetFloat;
    }

    public int getInt(String str) {
        MethodCollector.i(7364);
        int nativeGetInt = nativeGetInt(this.mHandle, str);
        MethodCollector.o(7364);
        return nativeGetInt;
    }

    public int[] getIntArray(String str) {
        MethodCollector.i(7294);
        int[] nativeGetIntArray = nativeGetIntArray(this.mHandle, str);
        MethodCollector.o(7294);
        return nativeGetIntArray;
    }

    public String getString(String str) {
        MethodCollector.i(7292);
        String nativeGetString = nativeGetString(this.mHandle, str);
        MethodCollector.o(7292);
        return nativeGetString;
    }

    public int setBool(String str, boolean z) {
        MethodCollector.i(6754);
        int nativeSetBool = nativeSetBool(this.mHandle, str, z);
        MethodCollector.o(6754);
        return nativeSetBool;
    }

    public int setByteArray(String str, byte[] bArr) {
        MethodCollector.i(6958);
        int nativeSetByteArray = nativeSetByteArray(this.mHandle, str, bArr);
        MethodCollector.o(6958);
        return nativeSetByteArray;
    }

    public int setDoubleArray(String str, double[] dArr) {
        MethodCollector.i(7029);
        int nativeSetDoubleArray = nativeSetDoubleArray(this.mHandle, str, dArr);
        MethodCollector.o(7029);
        return nativeSetDoubleArray;
    }

    public int setFloat(String str, float f2) {
        MethodCollector.i(6962);
        int nativeSetFloat = nativeSetFloat(this.mHandle, str, f2);
        MethodCollector.o(6962);
        return nativeSetFloat;
    }

    public int setFloatArray(String str, float[] fArr) {
        MethodCollector.i(6965);
        int nativeSetFloatArray = nativeSetFloatArray(this.mHandle, str, fArr);
        MethodCollector.o(6965);
        return nativeSetFloatArray;
    }

    public int setInt(String str, int i2) {
        MethodCollector.i(6758);
        int nativeSetInt = nativeSetInt(this.mHandle, str, i2);
        MethodCollector.o(6758);
        return nativeSetInt;
    }

    public int setIntArray(String str, int[] iArr) {
        MethodCollector.i(6956);
        int nativeSetIntArray = nativeSetIntArray(this.mHandle, str, iArr);
        MethodCollector.o(6956);
        return nativeSetIntArray;
    }

    public int setIntOrigin(String str, int i2) {
        MethodCollector.i(6953);
        int nativeSetIntOrigin = nativeSetIntOrigin(this.mHandle, str, i2);
        MethodCollector.o(6953);
        return nativeSetIntOrigin;
    }

    public int setString(String str, String str2) {
        MethodCollector.i(7077);
        int nativeSetString = nativeSetString(this.mHandle, str, str2);
        MethodCollector.o(7077);
        return nativeSetString;
    }

    public int setStringArray(String str, String[] strArr) {
        MethodCollector.i(7128);
        int nativeSetStringArray = nativeSetStringArray(this.mHandle, str, strArr);
        MethodCollector.o(7128);
        return nativeSetStringArray;
    }

    public int setDouble(String str, double d2) {
        MethodCollector.i(7027);
        int nativeSetDouble = nativeSetDouble(this.mHandle, str, d2);
        MethodCollector.o(7027);
        return nativeSetDouble;
    }

    public int setHandle(String str, long j2) {
        MethodCollector.i(6756);
        int nativeSetHandle = nativeSetHandle(this.mHandle, str, j2);
        MethodCollector.o(6756);
        return nativeSetHandle;
    }

    public int setLong(String str, long j2) {
        MethodCollector.i(6878);
        int nativeSetLong = nativeSetLong(this.mHandle, str, j2);
        MethodCollector.o(6878);
        return nativeSetLong;
    }
}
