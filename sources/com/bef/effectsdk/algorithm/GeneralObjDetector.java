package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class GeneralObjDetector {
    public final int ModelType_kPureDetect = 1;
    public final int ParamType_kDetectShortSideLen = 1;
    private ResourceFinder mFinder;
    private long mFinderHandle;
    private long mNativeHandle;

    static {
        Covode.recordClassIndex(2863);
    }

    private native long nativeCreate();

    private native int nativeDestroy(long j2);

    private native int nativeInit(long j2, long j3, int i2);

    private native int nativeInitWithPath(long j2, String str, int i2);

    private native GeneralObjDetectResult nativeProcess(long j2, Bitmap bitmap, int i2);

    private native int nativeSetParamF(long j2, int i2, float f2);

    private native int nativeSetParamS(long j2, int i2, String str);

    private boolean isFinderHandleValid() {
        if (0 != this.mFinderHandle) {
            return true;
        }
        return false;
    }

    private boolean isNativeHandleValid() {
        if (0 != this.mNativeHandle) {
            return true;
        }
        return false;
    }

    public boolean create() {
        MethodCollector.i(1470);
        this.mNativeHandle = nativeCreate();
        boolean isNativeHandleValid = isNativeHandleValid();
        MethodCollector.o(1470);
        return isNativeHandleValid;
    }

    public void destroy() {
        MethodCollector.i(1495);
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0;
        }
        if (this.mFinder != null && isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0;
        }
        MethodCollector.o(1495);
    }

    public boolean init(ResourceFinder resourceFinder, int i2) {
        MethodCollector.i(1486);
        if (resourceFinder == null || !isNativeHandleValid()) {
            MethodCollector.o(1486);
            return false;
        }
        this.mFinder = resourceFinder;
        this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!isFinderHandleValid()) {
            destroy();
            MethodCollector.o(1486);
            return false;
        } else if (nativeInit(this.mNativeHandle, this.mFinderHandle, i2) == 0) {
            MethodCollector.o(1486);
            return true;
        } else {
            MethodCollector.o(1486);
            return false;
        }
    }

    public boolean initWithPath(String str, int i2) {
        MethodCollector.i(1488);
        if (str == null || str.length() == 0 || !isNativeHandleValid()) {
            MethodCollector.o(1488);
            return false;
        } else if (nativeInitWithPath(this.mNativeHandle, str, i2) == 0) {
            MethodCollector.o(1488);
            return true;
        } else {
            MethodCollector.o(1488);
            return false;
        }
    }

    public GeneralObjDetectResult process(Bitmap bitmap, int i2) {
        MethodCollector.i(1493);
        if (!isNativeHandleValid() || bitmap == null) {
            GeneralObjDetectResult generalObjDetectResult = new GeneralObjDetectResult();
            MethodCollector.o(1493);
            return generalObjDetectResult;
        }
        GeneralObjDetectResult nativeProcess = nativeProcess(this.mNativeHandle, bitmap, i2);
        nativeProcess.logData();
        MethodCollector.o(1493);
        return nativeProcess;
    }

    public boolean setParamF(int i2, float f2) {
        MethodCollector.i(1489);
        if (!isNativeHandleValid()) {
            MethodCollector.o(1489);
            return false;
        } else if (nativeSetParamF(this.mNativeHandle, i2, f2) == 0) {
            MethodCollector.o(1489);
            return true;
        } else {
            MethodCollector.o(1489);
            return false;
        }
    }

    public boolean setParamS(int i2, String str) {
        MethodCollector.i(1492);
        if (!isNativeHandleValid()) {
            MethodCollector.o(1492);
            return false;
        } else if (nativeSetParamS(this.mNativeHandle, i2, str) == 0) {
            MethodCollector.o(1492);
            return true;
        } else {
            MethodCollector.o(1492);
            return false;
        }
    }
}
