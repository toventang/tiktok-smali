package com.ss.avframework.opengl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.JavaI420Buffer;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.JniCommon;
import java.nio.ByteBuffer;

public class YuvConverterCPU {
    private GlTextureFrameBuffer mFrameBuffer;
    private GlRenderDrawer mGlDrawer;

    static {
        Covode.recordClassIndex(100547);
    }

    static int clamp(int i2) {
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    public void release() {
        GlTextureFrameBuffer glTextureFrameBuffer = this.mFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mFrameBuffer = null;
        }
        GlRenderDrawer glRenderDrawer = this.mGlDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mGlDrawer = null;
        }
    }

    public VideoFrame.I420Buffer readPixel(VideoFrame.TextureBuffer textureBuffer) {
        MethodCollector.i(14319);
        if (this.mFrameBuffer == null) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mFrameBuffer = glTextureFrameBuffer;
            glTextureFrameBuffer.setSize(textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        if (this.mGlDrawer == null) {
            this.mGlDrawer = new GlRenderDrawer();
        }
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        android.graphics.Matrix matrix = null;
        boolean z = textureBuffer instanceof JavaI420Buffer;
        if (textureBuffer instanceof VideoFrame.TextureBuffer) {
            matrix = new android.graphics.Matrix(textureBuffer.getTransformMatrix());
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        } else if (z) {
            matrix = new android.graphics.Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        Matrix.rotateM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        if (matrix != null) {
            Matrix.multiplyMM(fArr2, 0, fArr3, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix), 0);
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer.getFrameBufferId());
        if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
            this.mGlDrawer.drawOes(textureBuffer.getTextureId(), fArr, fArr2, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
        } else {
            this.mGlDrawer.drawRgb(textureBuffer.getTextureId(), fArr, fArr2, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        GLES20.glFinish();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(textureBuffer.getWidth() * textureBuffer.getHeight() * 4);
        GLES20.glReadPixels(0, 0, textureBuffer.getWidth(), textureBuffer.getHeight(), 6408, 5121, allocateDirect);
        allocateDirect.position(0);
        GLES20.glBindFramebuffer(36160, 0);
        byte[] bArr = new byte[allocateDirect.limit()];
        allocateDirect.get(bArr);
        int i2 = ((width + 7) / 8) * 8;
        int i3 = (height + 1) / 2;
        int i4 = (height + i3 + 1) * i2;
        byte[] bArr2 = new byte[i4];
        RGBA2_YUV420P_I420_YU12(bArr, bArr2, width, height);
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i4);
        nativeAllocateByteBuffer.clear();
        nativeAllocateByteBuffer.put(bArr2);
        int i5 = (i2 * height) + 0;
        int i6 = (i2 / 2) + i5;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i5);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i5);
        int i7 = i3 * i2;
        nativeAllocateByteBuffer.limit(i5 + i7);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i6);
        nativeAllocateByteBuffer.limit(i6 + i7);
        JavaI420Buffer wrap = JavaI420Buffer.wrap(width, height, slice, i2, slice2, i2, nativeAllocateByteBuffer.slice(), i2, textureBuffer.getCaptureMs(), new Runnable() {
            /* class com.ss.avframework.opengl.YuvConverterCPU.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100548);
            }

            public void run() {
                MethodCollector.i(14057);
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                MethodCollector.o(14057);
            }
        });
        MethodCollector.o(14319);
        return wrap;
    }

    static void RGBA2_YUV420P_I420_YU12(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = i6 + 1;
                int i12 = bArr[i6] & 255;
                int i13 = i11 + 1;
                int i14 = bArr[i11] & 255;
                int i15 = i13 + 1;
                int i16 = bArr[i13] & 255;
                i6 = i15 + 1;
                int i17 = (((((i12 * 66) + (i14 * 129)) + (i16 * 25)) + 128) >> 8) + 16;
                int i18 = (((((i12 * -38) - (i14 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                int i19 = (((((i12 * 112) - (i14 * 94)) - (i16 * 18)) + 128) >> 8) + 128;
                int i20 = i5 + 1;
                bArr2[i5] = (byte) clamp(i17);
                if (i9 % 2 == 0 && i7 % 2 == 0) {
                    int i21 = i4 + i8;
                    bArr2[i21] = (byte) clamp(i18);
                    int i22 = i2 / 2;
                    bArr2[i21 + i22] = (byte) clamp(i19);
                    i8++;
                    if (i8 == i22) {
                        i4 += i2;
                        i8 = 0;
                    }
                }
                i7++;
                i10++;
                i5 = i20;
            }
        }
    }
}
