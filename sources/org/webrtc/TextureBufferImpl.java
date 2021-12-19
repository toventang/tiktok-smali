package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private final RefCountDelegate refCountDelegate;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    static {
        Covode.recordClassIndex(106678);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
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

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ VideoFrame.I420Buffer lambda$toI420$0$TextureBufferImpl() {
        return this.yuvConverter.convert(this);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new TextureBufferImpl$$Lambda$0(this));
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i2, int i3) {
        return applyTransformMatrix(matrix, i2, i3, i2, i3);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        int min = Math.min(i2, (getWidth() * i3) / getHeight());
        int min2 = Math.min(i3, (getHeight() * i2) / getWidth());
        matrix.preScale(((float) min) / ((float) getWidth()), ((float) min2) / ((float) getHeight()));
        matrix.preTranslate((float) (i4 / i2), (float) ((i3 - (i5 + min2)) / i3));
        return applyTransformMatrix(matrix, i2, i3);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i2, int i3, int i4, int i5) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i2, i3, i4, i5, this.type, this.id, matrix2, this.toI420Handler, this.yuvConverter, new TextureBufferImpl$$Lambda$1(this));
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        int i8 = this.height;
        matrix.preTranslate(((float) i2) / ((float) this.width), ((float) (i8 - (i3 + i5))) / ((float) i8));
        matrix.preScale(((float) i4) / ((float) this.width), ((float) i5) / ((float) this.height));
        return applyTransformMatrix(matrix, Math.round(((float) (this.unscaledWidth * i4)) / ((float) this.width)), Math.round(((float) (this.unscaledHeight * i5)) / ((float) this.height)), i6, i7);
    }

    public TextureBufferImpl(int i2, int i3, VideoFrame.TextureBuffer.Type type2, int i4, Matrix matrix, Handler handler, YuvConverter yuvConverter2, Runnable runnable) {
        this.unscaledWidth = i2;
        this.unscaledHeight = i3;
        this.width = i2;
        this.height = i3;
        this.type = type2;
        this.id = i4;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private TextureBufferImpl(int i2, int i3, int i4, int i5, VideoFrame.TextureBuffer.Type type2, int i6, Matrix matrix, Handler handler, YuvConverter yuvConverter2, Runnable runnable) {
        this.unscaledWidth = i2;
        this.unscaledHeight = i3;
        this.width = i4;
        this.height = i5;
        this.type = type2;
        this.id = i6;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
