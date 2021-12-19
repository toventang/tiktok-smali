package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RectDocDet {
    private ResourceFinder mFinder;
    private long mFinderHandle;
    private long mNativeHandle;

    static {
        Covode.recordClassIndex(2865);
    }

    private native long nativeCreate();

    private native int nativeDestroy(long j2);

    private native int nativeInit(long j2, long j3, int i2);

    private native int nativeInitWithPath(long j2, String str, int i2);

    private native RectDocDetResult nativeProcess(long j2, Bitmap bitmap, int i2);

    private native int nativeSetParamF(long j2, int i2, float f2);

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
        MethodCollector.i(1065);
        this.mNativeHandle = nativeCreate();
        boolean isNativeHandleValid = isNativeHandleValid();
        MethodCollector.o(1065);
        return isNativeHandleValid;
    }

    public void destroy() {
        MethodCollector.i(1081);
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0;
        }
        if (this.mFinder != null && isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0;
        }
        MethodCollector.o(1081);
    }

    public RectDocDetResult process(Bitmap bitmap, int i2) {
        MethodCollector.i(1080);
        if (!isNativeHandleValid() || bitmap == null) {
            RectDocDetResult rectDocDetResult = new RectDocDetResult();
            MethodCollector.o(1080);
            return rectDocDetResult;
        }
        RectDocDetResult nativeProcess = nativeProcess(this.mNativeHandle, bitmap, i2);
        MethodCollector.o(1080);
        return nativeProcess;
    }

    public boolean init(ResourceFinder resourceFinder, int i2) {
        MethodCollector.i(1068);
        if (resourceFinder == null || !isNativeHandleValid()) {
            MethodCollector.o(1068);
            return false;
        }
        this.mFinder = resourceFinder;
        this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!isFinderHandleValid()) {
            destroy();
            MethodCollector.o(1068);
            return false;
        } else if (nativeInit(this.mNativeHandle, this.mFinderHandle, i2) == 0) {
            MethodCollector.o(1068);
            return true;
        } else {
            MethodCollector.o(1068);
            return false;
        }
    }

    public boolean initWithPath(String str, int i2) {
        MethodCollector.i(1073);
        if (str == null || str.length() == 0 || !isNativeHandleValid()) {
            MethodCollector.o(1073);
            return false;
        } else if (nativeInitWithPath(this.mNativeHandle, str, i2) == 0) {
            MethodCollector.o(1073);
            return true;
        } else {
            MethodCollector.o(1073);
            return false;
        }
    }

    public boolean setParamF(int i2, float f2) {
        MethodCollector.i(1078);
        if (!isNativeHandleValid()) {
            MethodCollector.o(1078);
            return false;
        } else if (nativeSetParamF(this.mNativeHandle, i2, f2) == 0) {
            MethodCollector.o(1078);
            return true;
        } else {
            MethodCollector.o(1078);
            return false;
        }
    }
}
