package com.benchmark.tools;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f6366a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    static {
        Covode.recordClassIndex(3057);
    }

    public static int a(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
