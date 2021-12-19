package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] dstPoints = new float[6];
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final YuvUploader yuvUploader = new YuvUploader(null);

    public static int org_webrtc_VideoFrameDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        static {
            Covode.recordClassIndex(106715);
        }

        private YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        /* synthetic */ YuvUploader(AnonymousClass1 r1) {
            this();
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i2, int i3, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i4 = 0;
            int i5 = i2 / 2;
            int[] iArr2 = {i2, i5, i5};
            int i6 = i3 / 2;
            int[] iArr3 = {i3, i6, i6};
            int i7 = 0;
            int i8 = 0;
            do {
                if (iArr[i7] > iArr2[i7]) {
                    i8 = Math.max(i8, iArr2[i7] * iArr3[i7]);
                }
                i7++;
            } while (i7 < 3);
            if (i8 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i8)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i8);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i9 = 0;
                do {
                    this.yuvTextures[i9] = GlUtil.generateTexture(3553);
                    i9++;
                } while (i9 < 3);
            }
            do {
                GLES20.glActiveTexture(33984 + i4);
                GLES20.glBindTexture(3553, this.yuvTextures[i4]);
                if (iArr[i4] == iArr2[i4]) {
                    byteBuffer = byteBufferArr[i4];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i4], iArr[i4], this.copyBuffer, iArr2[i4], iArr2[i4], iArr3[i4]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i4], iArr3[i4], 0, 6409, 5121, byteBuffer);
                i4++;
            } while (i4 < 3);
            return this.yuvTextures;
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    static {
        Covode.recordClassIndex(106713);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.VideoFrameDrawer$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 106714(0x1a0da, float:1.49538E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r2
                org.webrtc.VideoFrame$TextureBuffer$Type r0 = org.webrtc.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.VideoFrame$TextureBuffer$Type r0 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoFrameDrawer.AnonymousClass1.<clinit>():void");
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    private void calculateTransformedRenderSize(int i2, int i3, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i2;
            this.renderHeight = i3;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i4 = 0; i4 < 3; i4++) {
            float[] fArr = this.dstPoints;
            int i5 = i4 * 2;
            int i6 = i5 + 0;
            fArr[i6] = fArr[i6] * ((float) i2);
            int i7 = i5 + 1;
            fArr[i7] = fArr[i7] * ((float) i3);
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f2, float f3, float f4, float f5) {
        return (int) Math.round(Math.hypot((double) (f4 - f2), (double) (f5 - f3)));
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i2, int i3, int i4, int i5) {
        try {
            calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
            boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate((float) videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (!z || this.renderWidth <= 0) {
                if (videoFrame != this.lastI420Frame) {
                    this.lastI420Frame = videoFrame;
                    if (!(videoFrame == null || videoFrame.getBuffer() == null)) {
                        VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                        this.yuvUploader.uploadFromBuffer(i420);
                        i420.release();
                    }
                }
                glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i2, i3, i4, i5);
                return;
            }
            this.lastI420Frame = null;
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i2, i3, i4, i5);
        } catch (Exception e2) {
            org_webrtc_VideoFrameDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_w("VideoFrameDrawer", "draw frame error", e2);
        }
    }

    static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i8 = AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i8 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i2, i3, i4, i5, i6, i7);
        } else if (i8 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i2, i3, i4, i5, i6, i7);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }
}
