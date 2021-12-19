package com.ss.bytertc.engine.utils;

import android.graphics.Matrix;
import android.graphics.YuvImage;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.video.ITextureBuffer;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class TextureBufferImpl implements EglContextCarrier, ITextureBuffer, VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private EglBase.Context mEglBaseContext;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final TextureHelper textureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private YuvImage yuvImage;

    static {
        Covode.recordClassIndex(101056);
    }

    @Override // com.ss.bytertc.engine.utils.EglContextCarrier
    public EglBase.Context getEglBaseContext() {
        return this.mEglBaseContext;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    public TextureHelper getTextureHelper() {
        return this.textureHelper;
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.textureHelper.textureToYuv(this);
    }

    public long getNativeEglContext() {
        TextureHelper textureHelper2 = this.textureHelper;
        if (textureHelper2 != null) {
            return textureHelper2.getNativeEglContext();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        MethodCollector.i(8076);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.o(8076);
            }
        }
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        MethodCollector.i(8162);
        synchronized (this.refCountLock) {
            try {
                int i2 = this.refCount - 1;
                this.refCount = i2;
                if (i2 == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } finally {
                MethodCollector.o(8162);
            }
        }
    }

    @Override // com.ss.bytertc.engine.utils.EglContextCarrier
    public void setEglBaseContext(EglBase.Context context) {
        this.mEglBaseContext = context;
    }

    public void setTransFormMatrix(float[] fArr) {
        RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveMyBitmap(java.lang.String r13, byte[] r14, int r15, int r16) {
        /*
            r12 = this;
            r5 = 8241(0x2031, float:1.1548E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            java.lang.String r1 = "texturebuffer"
            java.lang.String r0 = "saveMyBitmap"
            com.ss.bytertc.engine.utils.LogUtil.i(r1, r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r13)
            r1.createNewFile()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            r4 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x001c }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x001c }
            r4 = r0
            goto L_0x0020
        L_0x001c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0020:
            android.graphics.YuvImage r6 = new android.graphics.YuvImage
            r8 = 17
            int r9 = r12.width
            int r10 = r12.height
            r11 = 0
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ Exception -> 0x003c }
            int r2 = r12.width     // Catch:{ Exception -> 0x003c }
            int r1 = r12.height     // Catch:{ Exception -> 0x003c }
            r0 = 0
            r3.<init>(r0, r0, r2, r1)     // Catch:{ Exception -> 0x003c }
            r0 = 50
            r6.compressToJpeg(r3, r0, r4)     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            r4.flush()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0044:
            r4.close()     // Catch:{ IOException -> 0x004b }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.utils.TextureBufferImpl.saveMyBitmap(java.lang.String, byte[], int, int):void");
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        int min = Math.min(i2, (getWidth() * i3) / getHeight());
        int min2 = Math.min(i3, (getHeight() * i2) / getWidth());
        matrix.preScale(((float) min) / ((float) getWidth()), ((float) min2) / ((float) getHeight()));
        matrix.preTranslate((float) (i4 / i2), (float) ((i3 - (i5 + min2)) / i3));
        return new TextureBufferImpl(i2, i3, this.type, this.id, matrix, this.textureHelper, new Runnable() {
            /* class com.ss.bytertc.engine.utils.TextureBufferImpl.AnonymousClass3 */

            static {
                Covode.recordClassIndex(101059);
            }

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    public TextureBufferImpl(int i2, int i3, int i4, final int i5, final TextureHelper textureHelper2) {
        this.width = i2;
        this.height = i3;
        if (i4 == VideoFrame.TextureBuffer.Type.OES.getGlTarget()) {
            this.type = VideoFrame.TextureBuffer.Type.OES;
        } else {
            this.type = VideoFrame.TextureBuffer.Type.RGB;
        }
        this.id = i5;
        Matrix matrix = new Matrix();
        this.transformMatrix = matrix;
        matrix.reset();
        this.textureHelper = textureHelper2;
        this.releaseCallback = new Runnable() {
            /* class com.ss.bytertc.engine.utils.TextureBufferImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101057);
            }

            public void run() {
                textureHelper2.releaseTextureID(i5);
            }
        };
        this.refCount = 1;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        retain();
        Matrix matrix = new Matrix();
        int i8 = this.height;
        matrix.preTranslate(((float) i2) / ((float) this.width), ((float) (i8 - (i3 + i5))) / ((float) i8));
        matrix.preScale(((float) i4) / ((float) this.width), ((float) i5) / ((float) this.height));
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i6, i7, this.type, this.id, matrix2, this.textureHelper, new Runnable() {
            /* class com.ss.bytertc.engine.utils.TextureBufferImpl.AnonymousClass2 */

            static {
                Covode.recordClassIndex(101058);
            }

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    public TextureBufferImpl(int i2, int i3, VideoFrame.TextureBuffer.Type type2, int i4, Matrix matrix, TextureHelper textureHelper2, Runnable runnable) {
        this.width = i2;
        this.height = i3;
        this.type = type2;
        this.id = i4;
        this.transformMatrix = matrix;
        this.textureHelper = textureHelper2;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }
}
