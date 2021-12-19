package com.ss.android.medialib;

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
        Covode.recordClassIndex(36829);
    }

    public static String loadTexture(String str) {
        MethodCollector.i(3837);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            String str2 = FAIL_RES;
            MethodCollector.o(3837);
            return str2;
        }
        int loadTexture = loadTexture(decodeFile, -1, false);
        String a2 = a.a(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[]{"\"res\"", "\"width\"", Integer.valueOf(decodeFile.getWidth()), "\"height\"", Integer.valueOf(decodeFile.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture)});
        MethodCollector.o(3837);
        return a2;
    }

    public static int loadTexture(Bitmap bitmap, int i2) {
        return loadTexture(bitmap, i2, false);
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
}
