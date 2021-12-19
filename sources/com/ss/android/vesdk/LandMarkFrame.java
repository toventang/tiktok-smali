package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class LandMarkFrame {
    private float[] FOVAngle;
    private float[] quaternion;
    private double sensorTimestamp;

    static {
        Covode.recordClassIndex(99081);
    }

    public float[] getFOVAngle() {
        return this.FOVAngle;
    }

    public float[] getQuaternion() {
        return this.quaternion;
    }

    public double getSensorTimestamp() {
        return this.sensorTimestamp;
    }

    public void setFOVAngle(float[] fArr) {
        this.FOVAngle = fArr;
    }

    public void setQuaternion(float[] fArr) {
        this.quaternion = fArr;
    }

    public void setSensorTimestamp(double d2) {
        this.sensorTimestamp = d2;
    }

    /* access modifiers changed from: package-private */
    public void setInfo(double d2, float[] fArr, float[] fArr2) {
        this.sensorTimestamp = d2;
        this.quaternion = fArr;
        this.FOVAngle = fArr2;
    }
}
