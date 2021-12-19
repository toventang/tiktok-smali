package com.google.ar.core;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.f53392a);
    private final Quaternion quaternion;
    private final float[] translation;

    private Pose(float[] fArr, Quaternion quaternion2) {
        this.translation = fArr;
        this.quaternion = quaternion2;
    }

    /* access modifiers changed from: package-private */
    public Quaternion getQuaternion() {
        return this.quaternion;
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public float qw() {
        return this.quaternion.w;
    }

    public float qx() {
        return this.quaternion.x;
    }

    public float qy() {
        return this.quaternion.y;
    }

    public float qz() {
        return this.quaternion.z;
    }

    public float tx() {
        return this.translation[0];
    }

    public float ty() {
        return this.translation[1];
    }

    public float tz() {
        return this.translation[2];
    }

    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    static {
        Covode.recordClassIndex(33036);
    }

    public Pose inverse() {
        float[] fArr = new float[3];
        Quaternion quaternion2 = this.quaternion;
        Quaternion quaternion3 = new Quaternion(-quaternion2.x, -quaternion2.y, -quaternion2.z, quaternion2.w);
        Quaternion.a(quaternion3, this.translation, 0, fArr, 0);
        fArr[0] = -fArr[0];
        fArr[1] = -fArr[1];
        fArr[2] = -fArr[2];
        return new Pose(fArr, quaternion3);
    }

    public String toString() {
        return a.a(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", new Object[]{Float.valueOf(this.translation[0]), Float.valueOf(this.translation[1]), Float.valueOf(this.translation[2]), Float.valueOf(this.quaternion.x), Float.valueOf(this.quaternion.y), Float.valueOf(this.quaternion.z), Float.valueOf(this.quaternion.w)});
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public Pose compose(Pose pose) {
        float[] fArr = new float[3];
        Quaternion.a(this.quaternion, pose.translation, 0, fArr, 0);
        float f2 = fArr[0];
        float[] fArr2 = this.translation;
        fArr[0] = f2 + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        Quaternion quaternion2 = this.quaternion;
        Quaternion quaternion3 = pose.quaternion;
        Quaternion quaternion4 = new Quaternion();
        float f3 = quaternion2.x;
        float f4 = quaternion3.w;
        float f5 = quaternion2.y;
        float f6 = quaternion3.z;
        float f7 = quaternion2.z;
        float f8 = quaternion3.y;
        float f9 = quaternion2.w;
        quaternion4.x = (((f3 * f4) + (f5 * f6)) - (f7 * f8)) + (quaternion3.x * f9);
        float f10 = quaternion2.x;
        float f11 = -f10;
        float f12 = quaternion3.x;
        quaternion4.y = (f11 * f6) + (f5 * f4) + (f7 * f12) + (f8 * f9);
        float f13 = quaternion3.y;
        float f14 = quaternion2.y;
        quaternion4.z = ((f10 * f13) - (f14 * f12)) + (f7 * f4) + (f6 * f9);
        quaternion4.w = (((f11 * f12) - (f14 * f13)) - (quaternion2.z * quaternion3.z)) + (f9 * f4);
        return new Pose(fArr, quaternion4);
    }

    public float[] getTransformedAxis(int i2, float f2) {
        float[] fArr = new float[3];
        getTransformedAxis(i2, f2, fArr, 0);
        return fArr;
    }

    public void getTranslation(float[] fArr, int i2) {
        System.arraycopy(this.translation, 0, fArr, i2, 3);
    }

    public void getRotationQuaternion(float[] fArr, int i2) {
        Quaternion quaternion2 = this.quaternion;
        fArr[i2] = quaternion2.x;
        fArr[i2 + 1] = quaternion2.y;
        fArr[i2 + 2] = quaternion2.z;
        fArr[i2 + 3] = quaternion2.w;
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }

    public void toMatrix(float[] fArr, int i2) {
        float f2;
        Quaternion quaternion2 = this.quaternion;
        float f3 = quaternion2.x;
        float f4 = quaternion2.y;
        float f5 = quaternion2.z;
        float f6 = quaternion2.w;
        float f7 = (f3 * f3) + (f4 * f4) + (f5 * f5) + (f6 * f6);
        if (f7 > 0.0f) {
            f2 = 2.0f / f7;
        } else {
            f2 = 0.0f;
        }
        float f8 = f3 * f2;
        float f9 = f4 * f2;
        float f10 = f2 * f5;
        float f11 = f6 * f8;
        float f12 = f6 * f9;
        float f13 = f6 * f10;
        float f14 = f8 * f3;
        float f15 = f3 * f9;
        float f16 = f3 * f10;
        float f17 = f9 * f4;
        float f18 = f4 * f10;
        float f19 = f5 * f10;
        fArr[i2] = 1.0f - (f17 + f19);
        fArr[i2 + 4] = f15 - f13;
        fArr[i2 + 8] = f16 + f12;
        fArr[i2 + 1] = f15 + f13;
        fArr[i2 + 5] = 1.0f - (f19 + f14);
        fArr[i2 + 9] = f18 - f11;
        fArr[i2 + 2] = f16 - f12;
        fArr[i2 + 6] = f18 + f11;
        fArr[i2 + 10] = 1.0f - (f14 + f17);
        float[] fArr2 = this.translation;
        fArr[i2 + 12] = fArr2[0];
        fArr[i2 + 13] = fArr2[1];
        fArr[i2 + 14] = fArr2[2];
        fArr[i2 + 3] = 0.0f;
        fArr[i2 + 7] = 0.0f;
        fArr[i2 + 11] = 0.0f;
        fArr[i2 + 15] = 1.0f;
    }

    public static Pose makeTranslation(float f2, float f3, float f4) {
        return new Pose(new float[]{f2, f3, f4}, IDENTITY.quaternion);
    }

    public static Pose makeInterpolated(Pose pose, Pose pose2, float f2) {
        float f3;
        if (f2 == 0.0f) {
            return pose;
        }
        if (f2 == 1.0f) {
            return pose2;
        }
        float[] fArr = new float[3];
        int i2 = 0;
        do {
            fArr[i2] = (pose.translation[i2] * (1.0f - f2)) + (pose2.translation[i2] * f2);
            i2++;
        } while (i2 < 3);
        Quaternion quaternion2 = pose.quaternion;
        Quaternion quaternion3 = pose2.quaternion;
        Quaternion quaternion4 = new Quaternion();
        float f4 = (quaternion2.x * quaternion3.x) + (quaternion2.y * quaternion3.y) + (quaternion2.z * quaternion3.z) + (quaternion2.w * quaternion3.w);
        if (f4 < 0.0f) {
            Quaternion quaternion5 = new Quaternion(quaternion3);
            f4 = -f4;
            quaternion5.x = -quaternion5.x;
            quaternion5.y = -quaternion5.y;
            quaternion5.z = -quaternion5.z;
            quaternion5.w = -quaternion5.w;
            quaternion3 = quaternion5;
        }
        float acos = (float) Math.acos((double) f4);
        float sqrt = (float) Math.sqrt((double) (1.0f - (f4 * f4)));
        if (((double) Math.abs(sqrt)) > 0.001d) {
            float f5 = 1.0f / sqrt;
            f3 = ((float) Math.sin((double) ((1.0f - f2) * acos))) * f5;
            f2 = ((float) Math.sin((double) (f2 * acos))) * f5;
        } else {
            f3 = 1.0f - f2;
        }
        float f6 = (quaternion2.x * f3) + (quaternion3.x * f2);
        quaternion4.x = f6;
        float f7 = (quaternion2.y * f3) + (quaternion3.y * f2);
        quaternion4.y = f7;
        float f8 = (quaternion2.z * f3) + (quaternion3.z * f2);
        quaternion4.z = f8;
        float f9 = (f3 * quaternion2.w) + (f2 * quaternion3.w);
        quaternion4.w = f9;
        float sqrt2 = (float) (1.0d / Math.sqrt((double) ((((f6 * f6) + (f7 * f7)) + (f8 * f8)) + (f9 * f9))));
        quaternion4.x *= sqrt2;
        quaternion4.y *= sqrt2;
        quaternion4.z *= sqrt2;
        quaternion4.w *= sqrt2;
        return new Pose(fArr, quaternion4);
    }

    public void rotateVector(float[] fArr, int i2, float[] fArr2, int i3) {
        Quaternion.a(this.quaternion, fArr, i2, fArr2, i3);
    }

    public static Pose makeRotation(float f2, float f3, float f4, float f5) {
        return new Pose(IDENTITY.translation, new Quaternion(f2, f3, f4, f5));
    }

    public void getTransformedAxis(int i2, float f2, float[] fArr, int i3) {
        Quaternion quaternion2 = this.quaternion;
        float[] fArr2 = {0.0f, 0.0f, 0.0f};
        fArr2[i2] = f2;
        Quaternion.a(quaternion2, fArr2, 0, fArr, i3);
    }

    public void transformPoint(float[] fArr, int i2, float[] fArr2, int i3) {
        rotateVector(fArr, i2, fArr2, i3);
        int i4 = 0;
        do {
            int i5 = i4 + i3;
            fArr2[i5] = fArr2[i5] + this.translation[i4];
            i4++;
        } while (i4 < 3);
    }

    private Pose(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.quaternion = new Quaternion(f5, f6, f7, f8);
        this.translation = new float[]{f2, f3, f4};
    }
}
