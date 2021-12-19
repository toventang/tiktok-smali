package com.ss.avframework.buffer;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

public class SurfaceTextureHelper {
    private final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public OnTextureFrameAvailableListener listener;
    private final int oesTextureId;
    private SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public OnTextureFrameAvailableListener pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    public interface OnTextureFrameAvailableListener {
        static {
            Covode.recordClassIndex(99692);
        }

        void onTextureFrameAvailable(int i2, float[] fArr, long j2);
    }

    static {
        Covode.recordClassIndex(99682);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public int getTextureId() {
        return this.oesTextureId;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void returnTextureFrame() {
        returnTextureFrame(false);
    }

    public void updateTexImage() {
        this.surfaceTexture.updateTexImage();
    }

    public void dispose() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass6 */

            static {
                Covode.recordClassIndex(99688);
            }

            public void run() {
                SurfaceTextureHelper.this.isQuitting = true;
                if (!SurfaceTextureHelper.this.isTextureInUse) {
                    SurfaceTextureHelper.this.release();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void handlerExit() {
        this.handler.getLooper().quit();
    }

    public void stopListening() {
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99686);
            }

            public void run() {
                SurfaceTextureHelper.this.listener = null;
                SurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    class SurfaceTextureInternal extends SurfaceTexture {
        private Boolean isFinalize = false;

        static {
            Covode.recordClassIndex(99693);
        }

        /* access modifiers changed from: protected */
        @Override // android.graphics.SurfaceTexture, java.lang.Object
        public void finalize() {
            MethodCollector.i(14642);
            if (this.isFinalize.booleanValue()) {
                MethodCollector.o(14642);
                return;
            }
            synchronized (this.isFinalize) {
                try {
                    if (!this.isFinalize.booleanValue()) {
                        this.isFinalize = true;
                        super.finalize();
                        MethodCollector.o(14642);
                    }
                } finally {
                    MethodCollector.o(14642);
                }
            }
        }

        public void release() {
            MethodCollector.i(14644);
            if (this.isFinalize.booleanValue()) {
                AVLog.ioe("SurfaceTextureHelper", "BUG, texture already finalized.".concat(String.valueOf(this)));
                MethodCollector.o(14644);
                return;
            }
            synchronized (this.isFinalize) {
                try {
                    if (this.isFinalize.booleanValue()) {
                        AVLog.ioe("SurfaceTextureHelper", "BUG, texture already finalized.".concat(String.valueOf(this)));
                        return;
                    }
                    super.release();
                    MethodCollector.o(14644);
                } finally {
                    MethodCollector.o(14644);
                }
            }
        }

        public SurfaceTextureInternal(int i2) {
            super(i2);
        }
    }

    public void insertTextureFrameIfNeed() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, System.currentTimeMillis() * 1000 * 1000);
        }
    }

    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            YuvConverter yuvConverter2 = this.yuvConverter;
            if (yuvConverter2 != null) {
                yuvConverter2.release();
            }
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            handlerExit();
        }
    }

    public SurfaceTextureHelper(Handler handler2) {
        this(handler2, false);
    }

    public void returnTextureFrame(final boolean z) {
        this.handler.post(new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99687);
            }

            public void run() {
                SurfaceTextureHelper.this.isTextureInUse = false;
                if (SurfaceTextureHelper.this.isQuitting) {
                    SurfaceTextureHelper.this.release();
                } else {
                    SurfaceTextureHelper.this.tryDeliverTextureFrame(z);
                }
            }
        });
    }

    public static SurfaceTextureHelper create(String str) {
        GLThread gLThread = new GLThread(str);
        gLThread.start();
        final Handler handler2 = new Handler(gLThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Callable<SurfaceTextureHelper>() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99683);
            }

            public static int com_ss_avframework_buffer_SurfaceTextureHelper$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
                return 0;
            }

            @Override // java.util.concurrent.Callable
            public final SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(handler2);
                } catch (RuntimeException e2) {
                    com_ss_avframework_buffer_SurfaceTextureHelper$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("SurfaceTextureHelper", "call:  create failure", e2);
                    return null;
                }
            }
        });
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = onTextureFrameAvailableListener;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99690);
            }

            public void run() {
                if (SurfaceTextureHelper.this.yuvConverter == null) {
                    SurfaceTextureHelper.this.yuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = SurfaceTextureHelper.this.yuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public void tryDeliverTextureFrame(boolean z) {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = !z;
            this.hasPendingTexture = false;
            updateTexImage();
            if (!z) {
                float[] fArr = new float[16];
                this.surfaceTexture.getTransformMatrix(fArr);
                this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, System.currentTimeMillis() * 1000 * 1000);
            }
        }
    }

    public SurfaceTextureHelper(Handler handler2, boolean z) {
        this.setListenerRunnable = new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99684);
            }

            public void run() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99685);
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                SurfaceTextureHelper.this.hasPendingTexture = true;
                SurfaceTextureHelper.this.tryDeliverTextureFrame(false);
            }
        };
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            AVLog.iow("SurfaceTextureHelper", "Using finalizeCheck ".concat(String.valueOf(z)));
            int generateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = generateTexture;
            if (z) {
                this.surfaceTexture = new SurfaceTextureInternal(generateTexture);
            } else {
                this.surfaceTexture = new SurfaceTexture(generateTexture);
            }
            setOnFrameAvailableListener(this.surfaceTexture, this.onFrameAvailableListener, handler2);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener2, Handler handler2) {
        if (Build.VERSION.SDK_INT >= 21) {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener2, handler2);
        } else {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener2);
        }
    }

    public VideoFrame.TextureBuffer createTextureBuffer(int i2, int i3, Matrix matrix) {
        return new TextureBufferImpl(i2, i3, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, matrix, this, new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99691);
            }

            public void run() {
                SurfaceTextureHelper.this.returnTextureFrame();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void textureToYUV(final ByteBuffer byteBuffer, final int i2, final int i3, final int i4, final int i5, final float[] fArr) {
        if (i5 == this.oesTextureId) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
                /* class com.ss.avframework.buffer.SurfaceTextureHelper.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(99689);
                }

                public void run() {
                    if (SurfaceTextureHelper.this.yuvConverter == null) {
                        SurfaceTextureHelper.this.yuvConverter = new YuvConverter();
                    }
                    SurfaceTextureHelper.this.yuvConverter.convert(byteBuffer, i2, i3, i4, i5, fArr);
                }
            });
            return;
        }
        throw new IllegalStateException("textureToByteBuffer called with unexpected textureId");
    }
}
