package com.ss.avframework.livestreamv2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.opengl.GLRenderVideoSink;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThread;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

public class CanvasRenderView extends RenderView {
    private SafeHandlerThread mCanvasThread;
    private Handler mCanvasThreadHandler;
    private int mFB;
    private boolean mFitMode;
    private int mFrameHeight;
    private int mFrameWidth;
    private Matrix mMatrix = new Matrix();
    private boolean mMirrorX;
    private boolean mMirrorY;
    private Paint mPaint = new Paint();
    private boolean mSizedChanged;
    private SurfaceHolder mSurfaceHolder;
    private int mWindHeight;
    private int mWindWidth;

    static {
        Covode.recordClassIndex(99847);
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink
    public Handler getGlThreadHandler() {
        return this.mCanvasThreadHandler;
    }

    @Override // com.ss.avframework.livestreamv2.RenderView
    public float getRealRatePerSeconds() {
        return super.getRealRatePerSeconds();
    }

    public void addViewCallback() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
            AVLog.ioi("CanvasRenderView", "addViewCallback() by ".concat(String.valueOf(this)));
        }
    }

    public void removeViewCallback() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            AVLog.ioi("CanvasRenderView", "removeViewCallback() by ".concat(String.valueOf(this)));
        }
    }

    @Override // com.ss.avframework.livestreamv2.RenderView, com.ss.avframework.opengl.GLRenderVideoSink
    public void init() {
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("Canvas-(" + this + ")");
        this.mCanvasThread = lockThread;
        lockThread.start();
        this.mCanvasThreadHandler = this.mCanvasThread.getHandler();
        setRenderer(this);
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink, com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(11902);
        AVLog.ioi("CanvasRenderView", "begin release[" + this + "]");
        Handler glThreadHandler = getGlThreadHandler();
        if (glThreadHandler != null) {
            if (!glThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.CanvasRenderView.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(99850);
                }

                public void run() {
                    CanvasRenderView.this.onSurfaceDestroy();
                }
            })) {
                AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already release at")));
                MethodCollector.o(11902);
                return;
            }
            SafeHandlerThreadPoolExecutor.unlockThread(this.mCanvasThread);
            this.mCanvasThread = null;
        }
        AVLog.ioi("CanvasRenderView", "end release[" + this + "]");
        MethodCollector.o(11902);
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink
    public void initSurfaceView(SurfaceView surfaceView) {
        super.initSurfaceView(surfaceView);
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink
    public void initTextureView(TextureView textureView) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // com.ss.avframework.livestreamv2.RenderView
    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    @Override // com.ss.avframework.livestreamv2.RenderView, com.ss.avframework.opengl.GLRenderVideoSink.GLRenderer
    public void onDrawFrame(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // com.ss.avframework.livestreamv2.RenderView
    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    public CanvasRenderView(SurfaceView surfaceView) {
        super(surfaceView);
    }

    public void onBuffer(final VideoFrame.Buffer buffer) {
        MethodCollector.i(11737);
        if (this.mFB == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFB = iArr[0];
        }
        VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
        GLES20.glBindFramebuffer(36160, this.mFB);
        GLES20.glFramebufferTexture2D(36160, 36064, textureBuffer.getType().getGlTarget(), textureBuffer.getTextureId(), 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(buffer.getWidth() * buffer.getHeight() * 4);
        GLES20.glReadPixels(0, 0, buffer.getWidth(), buffer.getHeight(), 6408, 5121, allocateDirect);
        GlUtil.checkAnyGLES2Error("BUG");
        GLES20.glBindFramebuffer(36160, 0);
        final Bitmap createBitmap = Bitmap.createBitmap(buffer.getWidth(), buffer.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        getGlThreadHandler().post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.CanvasRenderView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99849);
            }

            public void run() {
                CanvasRenderView.this.onCanvasDrawBuffer(createBitmap, buffer);
            }
        });
        MethodCollector.o(11737);
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AVLog.ioi("CanvasRenderView", "onSurfaceCreated() [" + this + "]");
        this.mNeedReportFirstRender = true;
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = surfaceHolder;
            AVLog.ioi("CanvasRenderView", "mSurfaceHolder is set to " + this.mSurfaceHolder);
            return;
        }
        AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already received onSurfaceCreated at")));
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MethodCollector.i(11739);
        AVLog.ioi("CanvasRenderView", "onSurfaceDestroy() [" + this + "]");
        if (this.mSurfaceHolder == null) {
            MethodCollector.o(11739);
            return;
        }
        synchronized (this) {
            try {
                AVLog.ioi("CanvasRenderView", "mSurfaceHolder: " + this.mSurfaceHolder + " is set to null");
                this.mSurfaceHolder = null;
            } finally {
                MethodCollector.o(11739);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.RenderView, com.ss.avframework.engine.VideoSink, com.ss.avframework.opengl.GLRenderVideoSink
    public void onFrame(final VideoFrame videoFrame) {
        MethodCollector.i(11572);
        if (this.mCanvasThread != null) {
            videoFrame.retain();
            if (this.mFB == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFB = iArr[0];
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            GLES20.glBindFramebuffer(36160, this.mFB);
            GLES20.glFramebufferTexture2D(36160, 36064, textureBuffer.getType().getGlTarget(), textureBuffer.getTextureId(), 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(textureBuffer.getWidth() * textureBuffer.getHeight() * 4);
            GLES20.glReadPixels(0, 0, textureBuffer.getWidth(), textureBuffer.getHeight(), 6408, 5121, allocateDirect);
            GlUtil.checkAnyGLES2Error("BUG");
            GLES20.glBindFramebuffer(36160, 0);
            final Bitmap createBitmap = Bitmap.createBitmap(textureBuffer.getWidth(), textureBuffer.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            getGlThreadHandler().post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.CanvasRenderView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99848);
                }

                public void run() {
                    CanvasRenderView.this.onCanvasDrawFrame(createBitmap, videoFrame);
                }
            });
        }
        MethodCollector.o(11572);
    }

    @Override // com.ss.avframework.livestreamv2.RenderView
    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    public CanvasRenderView(SurfaceView surfaceView, boolean z) {
        super(surfaceView, z);
    }

    private Matrix calcViewRatio(int i2, int i3) {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z = this.mFitMode;
        float f6 = (float) i2;
        float f7 = (float) i3;
        float f8 = f6 / f7;
        int i4 = this.mWindWidth;
        int i5 = this.mWindHeight;
        float f9 = ((float) i4) / ((float) i5);
        float f10 = 0.0f;
        if (z) {
            if (f8 > f9) {
                f3 = ((float) i4) / f6;
                f4 = (-(((float) i5) - (f7 * f3))) / 2.0f;
            } else {
                f3 = ((float) i4) / f6;
                f2 = -(((float) i4) - (f6 * f3));
                f10 = f2 / 2.0f;
                f4 = 0.0f;
            }
        } else if (f8 < f9) {
            f3 = ((float) i4) / f6;
            f4 = ((f7 * f3) - ((float) i5)) / 2.0f;
        } else {
            f3 = ((float) i5) / f7;
            f2 = (f6 * f3) - ((float) i4);
            f10 = f2 / 2.0f;
            f4 = 0.0f;
        }
        this.mMatrix.postScale(f3, f3);
        this.mMatrix.postTranslate(-f10, -f4);
        this.mMatrix.postTranslate((-((float) this.mWindWidth)) / 2.0f, (-((float) this.mWindHeight)) / 2.0f);
        Matrix matrix = this.mMatrix;
        float f11 = -1.0f;
        if (this.mMirrorX) {
            f5 = -1.0f;
        } else {
            f5 = 1.0f;
        }
        if (!this.mMirrorY) {
            f11 = 1.0f;
        }
        matrix.postScale(f5, f11);
        this.mMatrix.postTranslate(((float) this.mWindWidth) / 2.0f, ((float) this.mWindHeight) / 2.0f);
        this.mFrameHeight = i3;
        this.mFrameWidth = i2;
        return this.mMatrix;
    }

    public void onCanvasDrawBuffer(Bitmap bitmap, VideoFrame.Buffer buffer) {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas != null) {
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                if (!(!this.mSizedChanged && height == this.mFrameHeight && width == this.mFrameWidth)) {
                    calcViewRatio(width, height);
                    this.mSizedChanged = false;
                }
                lockCanvas.drawBitmap(bitmap, this.mMatrix, null);
                this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
                if (this.mNeedReportFirstRender) {
                    this.mNeedReportFirstRender = false;
                    GLRenderVideoSink.GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                    if (glRenderInfoListener != null) {
                        glRenderInfoListener.onInfo(3, (int) (TimeUtils.currentTimeMs() - buffer.getCaptureMs()), 0);
                    }
                }
            } else {
                return;
            }
        }
        buffer.release();
    }

    public void onCanvasDrawFrame(Bitmap bitmap, VideoFrame videoFrame) {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas != null) {
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                if (!(!this.mSizedChanged && rotatedHeight == this.mFrameHeight && rotatedWidth == this.mFrameWidth)) {
                    calcViewRatio(rotatedWidth, rotatedHeight);
                    this.mSizedChanged = false;
                }
                if (this.mRealRateStatistict != null) {
                    this.mRealRateStatistict.add();
                }
                lockCanvas.drawBitmap(bitmap, this.mMatrix, null);
                this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
                if (this.mNeedReportFirstRender) {
                    this.mNeedReportFirstRender = false;
                    GLRenderVideoSink.GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                    if (!(glRenderInfoListener == null || videoFrame.getBuffer() == null)) {
                        glRenderInfoListener.onInfo(3, (int) (TimeUtils.currentTimeMs() - videoFrame.getBuffer().getCaptureMs()), 0);
                    }
                }
            } else {
                return;
            }
        }
        videoFrame.release();
    }

    @Override // com.ss.avframework.opengl.GLRenderVideoSink
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        AVLog.ioi("CanvasRenderView", "onSurfaceChanged() [" + this + "] + width: " + i3 + "height:" + i4);
        this.mWindWidth = i3;
        this.mWindHeight = i4;
        this.mSizedChanged = true;
    }
}
