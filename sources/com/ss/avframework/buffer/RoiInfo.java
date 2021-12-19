package com.ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.NativeObject;
import java.nio.ByteBuffer;

public class RoiInfo extends NativeObject {
    private long externalNativeObj;

    static {
        Covode.recordClassIndex(99681);
    }

    private native void nativeCreate();

    private native int nativeGetCenterPosX();

    private native int nativeGetCenterPosY();

    private native ByteBuffer nativeGetFacePointsData();

    private native int nativeGetRoiHeight();

    private native float nativeGetRoiPitch();

    private native float nativeGetRoiRoll();

    private native int nativeGetRoiWidth();

    private native float nativeGetRoiYaw();

    private native int[] nativeGetStretchedRoi();

    private native void nativeLockFacePointsData();

    private native void nativeSetEnable(boolean z);

    private native void nativeSetRoiInfo(int i2, int i3, int i4, int i5, float f2, float f3, float f4);

    private native void nativeUnlockFacePointsData();

    public RoiInfo() {
        MethodCollector.i(14648);
        nativeCreate();
        MethodCollector.o(14648);
    }

    public int getCenterPosX() {
        MethodCollector.i(10905);
        int nativeGetCenterPosX = nativeGetCenterPosX();
        MethodCollector.o(10905);
        return nativeGetCenterPosX;
    }

    public int getCenterPosY() {
        MethodCollector.i(10906);
        int nativeGetCenterPosY = nativeGetCenterPosY();
        MethodCollector.o(10906);
        return nativeGetCenterPosY;
    }

    public ByteBuffer getFacePointsData() {
        MethodCollector.i(11389);
        ByteBuffer nativeGetFacePointsData = nativeGetFacePointsData();
        MethodCollector.o(11389);
        return nativeGetFacePointsData;
    }

    public int getRoiHeight() {
        MethodCollector.i(10909);
        int nativeGetRoiHeight = nativeGetRoiHeight();
        MethodCollector.o(10909);
        return nativeGetRoiHeight;
    }

    public float getRoiPitch() {
        MethodCollector.i(11074);
        float nativeGetRoiPitch = nativeGetRoiPitch();
        MethodCollector.o(11074);
        return nativeGetRoiPitch;
    }

    public float getRoiRoll() {
        MethodCollector.i(11232);
        float nativeGetRoiRoll = nativeGetRoiRoll();
        MethodCollector.o(11232);
        return nativeGetRoiRoll;
    }

    public int getRoiWidth() {
        MethodCollector.i(10908);
        int nativeGetRoiWidth = nativeGetRoiWidth();
        MethodCollector.o(10908);
        return nativeGetRoiWidth;
    }

    public float getRoiYaw() {
        MethodCollector.i(10910);
        float nativeGetRoiYaw = nativeGetRoiYaw();
        MethodCollector.o(10910);
        return nativeGetRoiYaw;
    }

    public int[] getStretchedRoi() {
        MethodCollector.i(11233);
        int[] nativeGetStretchedRoi = nativeGetStretchedRoi();
        MethodCollector.o(11233);
        return nativeGetStretchedRoi;
    }

    public void lockFacePointsData() {
        MethodCollector.i(11387);
        nativeLockFacePointsData();
        MethodCollector.o(11387);
    }

    public void unlockFacePointsData() {
        MethodCollector.i(11388);
        nativeUnlockFacePointsData();
        MethodCollector.o(11388);
    }

    @Override // com.ss.avframework.engine.NativeObject
    public void release() {
        if (this.externalNativeObj != 0) {
            setNativeObj(0);
            this.externalNativeObj = 0;
        }
        super.release();
    }

    public void setEnable(boolean z) {
        MethodCollector.i(10739);
        nativeSetEnable(z);
        MethodCollector.o(10739);
    }

    public RoiInfo(long j2) {
        this.externalNativeObj = j2;
        setNativeObj(j2);
    }

    public RoiInfo(int i2, int i3, int i4, int i5, float f2, float f3, float f4) {
        this();
        MethodCollector.i(14649);
        nativeSetRoiInfo(i2, i3, i4, i5, f2, f3, f4);
        MethodCollector.o(14649);
    }
}
