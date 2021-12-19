package com.ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.TimeUtils;

public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private long captureMs;
    private VideoFrame.IExtraData extData;
    private final int height;
    private final int id;
    protected RoiInfo mROIInfo;
    private ToI420Interface mToI420Interface;
    private int refCount;
    private final Object refCountLock;
    private final Runnable releaseCallback;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;

    public interface ToI420Interface {
        static {
            Covode.recordClassIndex(99699);
        }

        VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer);
    }

    static {
        Covode.recordClassIndex(99697);
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void recycle() {
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return this.extData;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.i(12052);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.o(12052);
            }
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            return surfaceTextureHelper2.textureToYuv(this);
        }
        ToI420Interface toI420Interface = this.mToI420Interface;
        if (toI420Interface != null) {
            return toI420Interface.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        MethodCollector.i(12210);
        synchronized (this.refCountLock) {
            try {
                int i2 = this.refCount - 1;
                this.refCount = i2;
                if (i2 == 0) {
                    Runnable runnable = this.releaseCallback;
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        recycle();
                    }
                    RoiInfo roiInfo = this.mROIInfo;
                    if (roiInfo != null) {
                        roiInfo.release();
                        this.mROIInfo = null;
                    }
                }
            } finally {
                MethodCollector.o(12210);
            }
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j2) {
        this.captureMs = j2;
    }

    public void updateExtraData(VideoFrame.IExtraData iExtraData) {
        this.extData = iExtraData;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.mROIInfo;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.mROIInfo = roiInfo;
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(((float) i2) / ((float) this.width), ((float) i3) / ((float) this.height));
        matrix.preScale(((float) i4) / ((float) this.width), ((float) i5) / ((float) this.height));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i6, i7, this.type, this.id, matrix, this.surfaceTextureHelper, new Runnable() {
            /* class com.ss.avframework.buffer.TextureBufferImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99698);
            }

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        textureBufferImpl.mToI420Interface = this.mToI420Interface;
        textureBufferImpl.setROIInfo(this.mROIInfo);
        this.mROIInfo = null;
        textureBufferImpl.captureMs = this.captureMs;
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i2, int i3, VideoFrame.TextureBuffer.Type type2, int i4, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable) {
        this(i2, i3, type2, i4, matrix, surfaceTextureHelper2, runnable, (VideoFrame.IExtraData) null);
    }

    public TextureBufferImpl(int i2, int i3, VideoFrame.TextureBuffer.Type type2, int i4, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable) {
        this(i2, i3, type2, i4, matrix, toI420Interface, runnable, (VideoFrame.IExtraData) null);
    }

    public TextureBufferImpl(int i2, int i3, VideoFrame.TextureBuffer.Type type2, int i4, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i2;
        this.height = i3;
        this.type = type2;
        this.id = i4;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.releaseCallback = runnable;
        this.mToI420Interface = null;
        this.extData = iExtraData;
        this.refCount = 1;
    }

    public TextureBufferImpl(int i2, int i3, VideoFrame.TextureBuffer.Type type2, int i4, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i2;
        this.height = i3;
        this.type = type2;
        this.id = i4;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = null;
        this.releaseCallback = runnable;
        this.mToI420Interface = toI420Interface;
        this.extData = iExtraData;
        this.captureMs = TimeUtils.currentTimeMs();
        this.refCount = 1;
    }
}
