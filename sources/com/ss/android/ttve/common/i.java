package com.ss.android.ttve.common;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f61085a = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: b  reason: collision with root package name */
    public static float[] f61086b = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: c  reason: collision with root package name */
    public d f61087c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f61088d;

    /* renamed from: e  reason: collision with root package name */
    public FloatBuffer f61089e;

    /* renamed from: f  reason: collision with root package name */
    public FloatBuffer f61090f;

    /* renamed from: g  reason: collision with root package name */
    public int f61091g;

    /* renamed from: h  reason: collision with root package name */
    private RectF f61092h;

    /* renamed from: i  reason: collision with root package name */
    private int f61093i = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(37615);
    }

    public final void a() {
        this.f61087c.a();
        int[] iArr = this.f61088d;
        if (iArr != null) {
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            this.f61088d = null;
        }
        this.f61087c = null;
        this.f61089e = null;
        this.f61090f = null;
    }

    public static FloatBuffer a(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr, 0, fArr.length).position(0);
        return asFloatBuffer;
    }

    public final void a(int i2) {
        GLES20.glUseProgram(this.f61087c.f61060a);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glBindBuffer(34962, this.f61088d[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f61088d[1]);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void a(RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = this.f61092h;
            if (rectF2 == null || !rectF.equals(rectF2)) {
                this.f61092h = rectF;
                f61086b[0] = rectF.left;
                f61086b[1] = 1.0f - rectF.top;
                f61086b[2] = rectF.left;
                f61086b[3] = 1.0f - rectF.bottom;
                f61086b[4] = rectF.right;
                f61086b[5] = 1.0f - rectF.top;
                f61086b[6] = rectF.right;
                f61086b[7] = 1.0f - rectF.bottom;
                this.f61090f = a(f61086b);
                GLES20.glUseProgram(this.f61087c.f61060a);
                GLES20.glBindBuffer(34962, this.f61088d[1]);
                this.f61090f.position(0);
                GLES20.glBufferSubData(34962, 0, 32, this.f61090f);
            }
        }
    }

    public final void a(int i2, boolean z, int i3, int i4, int i5, int i6) {
        float f2;
        float f3;
        GLES20.glUseProgram(this.f61087c.f61060a);
        if (i3 <= 0 || i4 <= 0 || i5 <= 0 || i6 <= 0) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.f61091g, 1, false, fArr, 0);
        } else if (this.f61093i != i2) {
            this.f61093i = i2;
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.rotateM(fArr2, 0, (float) i2, 0.0f, 0.0f, 1.0f);
            if (z) {
                Matrix.rotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (Math.abs(i2) == 90 || Math.abs(i2) == 270) {
                f2 = (float) i4;
            } else {
                f2 = (float) i3;
            }
            if (Math.abs(i2) == 90 || Math.abs(i2) == 270) {
                f3 = (float) i3;
            } else {
                f3 = (float) i4;
            }
            float f4 = (float) i5;
            float f5 = f4 / f2;
            float f6 = (float) i6;
            float f7 = f6 / f3;
            if (f5 <= f7) {
                f5 = f7;
            }
            Matrix.scaleM(fArr2, 0, (((float) i3) / 2.0f) * f5, (((float) i4) / 2.0f) * f5, 1.0f);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.orthoM(fArr4, 0, ((float) (-i5)) / 2.0f, f4 / 2.0f, ((float) (-i6)) / 2.0f, f6 / 2.0f, -2.0f, 2.0f);
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr2, 0);
            float[] fArr6 = new float[16];
            Matrix.setIdentityM(fArr6, 0);
            Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
            GLES20.glUniformMatrix4fv(this.f61091g, 1, false, fArr6, 0);
        }
    }
}
