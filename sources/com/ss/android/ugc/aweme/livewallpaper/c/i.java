package com.ss.android.ugc.aweme.livewallpaper.c;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static boolean f108812a = b();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f108813b;

    public static boolean a() {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return true;
        }
        Integer.toHexString(glGetError);
        return false;
    }

    private static boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        try {
            EGL14.eglGetCurrentContext();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(69701);
        float[] fArr = new float[16];
        f108813b = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static int a(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        a();
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static int a(int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        a();
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        a();
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        a();
        return i4;
    }
}
