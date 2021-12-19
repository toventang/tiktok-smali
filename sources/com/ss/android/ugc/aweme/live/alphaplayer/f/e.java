package com.ss.android.ugc.aweme.live.alphaplayer.f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(69397);
    }

    public static void a(int i2) {
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        }
    }

    public static int a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }
}
