package com.google.ar.core;

import com.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class Quaternion {

    /* renamed from: a  reason: collision with root package name */
    public static final Quaternion f53392a = new Quaternion();
    public float w = 1.0f;
    public float x;
    public float y;
    public float z;

    private void a(float f2, float f3, float f4, float f5) {
        this.x = f2;
        this.y = f3;
        this.z = f4;
        this.w = f5;
    }

    static {
        Covode.recordClassIndex(33037);
    }

    public Quaternion() {
        a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public final String toString() {
        return a.a("[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z), Float.valueOf(this.w)});
    }

    public Quaternion(Quaternion quaternion) {
        a(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }

    public Quaternion(float f2, float f3, float f4, float f5) {
        a(f2, f3, f4, f5);
    }

    public static void a(Quaternion quaternion, float[] fArr, int i2, float[] fArr2, int i3) {
        float f2 = fArr[i2];
        float f3 = fArr[i2 + 1];
        float f4 = fArr[i2 + 2];
        float f5 = quaternion.x;
        float f6 = quaternion.y;
        float f7 = quaternion.z;
        float f8 = quaternion.w;
        float f9 = ((f8 * f2) + (f6 * f4)) - (f7 * f3);
        float f10 = ((f8 * f3) + (f7 * f2)) - (f5 * f4);
        float f11 = ((f8 * f4) + (f5 * f3)) - (f6 * f2);
        float f12 = -f5;
        float f13 = ((f2 * f12) - (f3 * f6)) - (f4 * f7);
        float f14 = -f7;
        float f15 = -f6;
        fArr2[i3] = (((f9 * f8) + (f13 * f12)) + (f10 * f14)) - (f11 * f15);
        fArr2[i3 + 1] = (((f10 * f8) + (f13 * f15)) + (f11 * f12)) - (f9 * f14);
        fArr2[i3 + 2] = (((f11 * f8) + (f13 * f14)) + (f9 * f15)) - (f10 * f12);
    }
}
