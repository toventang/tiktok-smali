package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.TEVideoUtils;

public class VECurveSpeedUtils {
    private double mAveSpeed;
    private float[] mCurveSpeedPointX;
    private float[] mCurveSpeedPointY;
    private volatile long mNative;

    static {
        Covode.recordClassIndex(99126);
    }

    public synchronized void destroy() {
        MethodCollector.i(13684);
        an.a("VECurveSpeedUtils", "destroy...");
        if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "destroy, mNative == 0");
            MethodCollector.o(13684);
            return;
        }
        TEVideoUtils.nativeCurveSpeedDestroy(this.mNative);
        this.mNative = 0;
        MethodCollector.o(13684);
    }

    public double getAveCurveSpeed() {
        MethodCollector.i(13544);
        if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "getAveCurveSpeed, mNative == 0");
            MethodCollector.o(13544);
            return -112.0d;
        }
        double nativeGetAveCurveSpeed = TEVideoUtils.nativeGetAveCurveSpeed(this.mNative);
        this.mAveSpeed = nativeGetAveCurveSpeed;
        MethodCollector.o(13544);
        return nativeGetAveCurveSpeed;
    }

    public double getCurveSpeedWithSeqDelta(long j2) {
        MethodCollector.i(13546);
        if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "getCurveSpeedWithSeqDelta, mNative == 0");
            MethodCollector.o(13546);
            return -112.0d;
        }
        double nativeGetCurveSpeedWithSeqDelta = TEVideoUtils.nativeGetCurveSpeedWithSeqDelta(this.mNative, j2 * 1000);
        MethodCollector.o(13546);
        return nativeGetCurveSpeedWithSeqDelta;
    }

    public long mapSeqDeltaToTrimDelta(long j2) {
        MethodCollector.i(13547);
        if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "mapSeqDeltaToTrimDelta, mNative == 0");
            MethodCollector.o(13547);
            return -112;
        }
        long nativeMapSeqDeltaToTrimDelta = TEVideoUtils.nativeMapSeqDeltaToTrimDelta(this.mNative, j2 * 1000) / 1000;
        MethodCollector.o(13547);
        return nativeMapSeqDeltaToTrimDelta;
    }

    public long mapTrimDeltaToSeqDelta(long j2) {
        MethodCollector.i(13617);
        if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "mapTrimDeltaToSeqDelta, mNative == 0");
            MethodCollector.o(13617);
            return -112;
        }
        long nativeMapTrimDeltaToSeqDelta = TEVideoUtils.nativeMapTrimDeltaToSeqDelta(this.mNative, j2 * 1000) / 1000;
        MethodCollector.o(13617);
        return nativeMapTrimDeltaToSeqDelta;
    }

    public void setSeqDuration(long j2) {
        MethodCollector.i(13545);
        if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "setSeqDuration, mNative == 0");
            MethodCollector.o(13545);
            return;
        }
        TEVideoUtils.nativeSetSeqDuration(this.mNative, j2 * 1000);
        MethodCollector.o(13545);
    }

    public int setCurveSpeed(float[] fArr, float[] fArr2) {
        MethodCollector.i(13543);
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            an.d("VECurveSpeedUtils", "setCurveSpeed,incorrect curve anchors, mNative == 0");
            MethodCollector.o(13543);
            return -100;
        } else if (this.mNative == 0) {
            an.d("VECurveSpeedUtils", "setCurveSpeed, mNative == 0");
            MethodCollector.o(13543);
            return -112;
        } else {
            int nativeSetCurveSpeedData = TEVideoUtils.nativeSetCurveSpeedData(this.mNative, fArr, fArr2);
            MethodCollector.o(13543);
            return nativeSetCurveSpeedData;
        }
    }

    public VECurveSpeedUtils(float[] fArr, float[] fArr2) {
        MethodCollector.i(13478);
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            this.mNative = 0;
            an.d("VECurveSpeedUtils", "incorrect curve anchors, mNative == 0");
            MethodCollector.o(13478);
            return;
        }
        this.mNative = TEVideoUtils.nativeCreateCurveSpeedUtils(fArr, fArr2);
        this.mCurveSpeedPointX = fArr;
        this.mCurveSpeedPointY = fArr2;
        int curveSpeed = setCurveSpeed(fArr, fArr2);
        an.b("VECurveSpeedUtils", "VECurveSpeedUtils ret1 " + curveSpeed + " ret2 " + getAveCurveSpeed());
        MethodCollector.o(13478);
    }

    public static float[] transferTrimPointXtoSeqPointX(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float[] fArr3 = new float[length];
        int i2 = 0;
        float f2 = 0.0f;
        fArr3[0] = 0.0f;
        while (i2 < length - 1) {
            int i3 = i2 + 1;
            f2 += (fArr[i3] - fArr[i2]) / ((fArr2[i3] + fArr2[i2]) * 0.5f);
            fArr3[i3] = f2;
            i2 = i3;
        }
        for (int i4 = 1; i4 < length; i4++) {
            fArr3[i4] = fArr3[i4] / f2;
            an.b("TAG", "transferTrimPointXtoSeqPointX SeqPointX[" + i4 + "]= " + fArr3[i4]);
        }
        return fArr3;
    }
}
