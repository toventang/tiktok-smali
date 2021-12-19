package com.ss.texturerender;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(101252);
    }

    public static int a(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            l.a("ShaderHelper", "Error compiling shader: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
        }
        l.a("ShaderHelper", "error = " + GLUtils.getEGLErrorString(GLES20.glGetError()));
        throw new RuntimeException("Error creating shader.");
    }
}
