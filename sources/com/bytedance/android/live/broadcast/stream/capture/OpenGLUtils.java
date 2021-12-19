package com.bytedance.android.live.broadcast.stream.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;

public class OpenGLUtils {
    private static final String FAIL_RES = a.a(Locale.US, "{%s: false}", new Object[]{"\"res\""});

    static {
        Covode.recordClassIndex(4377);
    }

    public static int getExternalOESTextureID() {
        int[] iArr = new int[1];
        checkGlError("genTexture pre");
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError("genTexture end");
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Integer.toHexString(glGetError);
        }
    }

    public static Bitmap loadBitmap(String str) {
        MethodCollector.i(6816);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        MethodCollector.o(6816);
        return decodeFile;
    }

    public static String loadTexture(String str) {
        MethodCollector.i(6818);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            String str2 = FAIL_RES;
            MethodCollector.o(6818);
            return str2;
        }
        int loadTexture = loadTexture(decodeFile, -1, false);
        String a2 = a.a(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[]{"\"res\"", "\"width\"", Integer.valueOf(decodeFile.getWidth()), "\"height\"", Integer.valueOf(decodeFile.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture)});
        MethodCollector.o(6818);
        return a2;
    }

    public static int loadTexture(Bitmap bitmap, int i2) {
        return loadTexture(bitmap, i2, false);
    }

    private static int loadShader(String str, int i2) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        return glCreateShader;
    }

    public static int loadProgram(String str, String str2) {
        int loadShader;
        int[] iArr = new int[1];
        int loadShader2 = loadShader(str, 35633);
        if (loadShader2 == 0 || (loadShader = loadShader(str2, 35632)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            return 0;
        }
        GLES20.glDeleteShader(loadShader2);
        GLES20.glDeleteShader(loadShader);
        return glCreateProgram;
    }

    public static int loadTexture(Bitmap bitmap, int i2, boolean z) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i2 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i2);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i2;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static int initEffectTexture(int i2, int i3, int[] iArr, int i4) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i4, iArr[0]);
        GLES20.glTexParameterf(i4, 10240, 9729.0f);
        GLES20.glTexParameterf(i4, 10241, 9729.0f);
        GLES20.glTexParameterf(i4, 10242, 33071.0f);
        GLES20.glTexParameterf(i4, 10243, 33071.0f);
        GLES20.glTexImage2D(i4, 0, 6408, i2, i3, 0, 6408, 5121, null);
        return iArr[0];
    }
}
