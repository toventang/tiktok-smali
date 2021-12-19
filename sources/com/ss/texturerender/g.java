package com.ss.texturerender;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.covode.number.Covode;

public final class g {
    static {
        Covode.recordClassIndex(101253);
    }

    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a("glGenTextures");
        if (iArr[0] != 0) {
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
        }
        return iArr[0];
    }

    public static void a(int i2) {
        if (i2 > 0) {
            GLES20.glDeleteFramebuffers(1, new int[i2], 0);
        }
    }

    public static void b(int i2) {
        if (i2 > 0) {
            GLES20.glDeleteTextures(1, new int[i2], 0);
        }
    }

    public static boolean a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return false;
        }
        l.a("GLUtils", str + ": gl error = " + GLUtils.getEGLErrorString(glGetError));
        return true;
    }
}
