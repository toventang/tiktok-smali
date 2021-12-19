package com.bef.effectsdk.game;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class RenderTextureUtils {
    private static float[] flipY_uvArray = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private static float[] uvArray = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private static float[] vertexArray = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};

    public static FloatBuffer getFlipY_uvBuffer() {
        return getFloatBuffer(flipY_uvArray);
    }

    public static FloatBuffer getUVBuffer() {
        return getFloatBuffer(uvArray);
    }

    public static FloatBuffer getVertexBuffer() {
        return getFloatBuffer(vertexArray);
    }

    static {
        Covode.recordClassIndex(2886);
    }

    protected static FloatBuffer getFloatBuffer(float[] fArr) {
        FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        put.position(0);
        return put;
    }

    public static int generateBlankTexture(int i2, int i3) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i2 * i3 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(0.0f);
        asFloatBuffer.position(0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, asFloatBuffer);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static FloatBuffer getUVBufferWithParams(float f2, float f3, float f4, float f5) {
        return getFloatBuffer(new float[]{f2, f4, f3, f4, f2, f5, f3, f5});
    }

    public static FloatBuffer getVertexBufferWithParams(float f2, float f3, float f4, float f5) {
        return getFloatBuffer(new float[]{f2, f4, f3, f4, f2, f5, f3, f5});
    }
}
