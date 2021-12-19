package com.ss.avframework.livestreamv2.utils;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.ThreadUtils;

public class VideoProcessUnit {
    public GlTextureFrameBuffer mBuffer;
    public GlRenderDrawer mDrawer;
    public Handler mGlHandler;
    public boolean mHorizontalMirror;
    private int mInputHeight;
    private int mInputWidth;
    private Mode mMode = Mode.MODE_FIT;
    private float[] mPrjMatrix = new float[16];
    public int mRotation;
    private int mTargetHeight;
    private int mTargetWidth;
    private boolean mUpdateProject;
    public boolean mVerticalMirror;

    static {
        Covode.recordClassIndex(100504);
    }

    public void reset() {
        Matrix.setIdentityM(this.mPrjMatrix, 0);
    }

    public synchronized void release() {
        MethodCollector.i(12947);
        Handler handler = this.mGlHandler;
        if (handler == null) {
            MethodCollector.o(12947);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.utils.VideoProcessUnit.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100505);
            }

            public void run() {
                if (VideoProcessUnit.this.mBuffer != null) {
                    VideoProcessUnit.this.mBuffer.release();
                    VideoProcessUnit.this.mBuffer = null;
                }
                if (VideoProcessUnit.this.mDrawer != null) {
                    VideoProcessUnit.this.mDrawer.release();
                    VideoProcessUnit.this.mDrawer = null;
                }
                VideoProcessUnit.this.mGlHandler = null;
            }
        });
        MethodCollector.o(12947);
    }

    public enum Mode {
        MODE_FIT,
        MODE_FILL;

        static {
            Covode.recordClassIndex(100507);
        }
    }

    private void updateProject() {
        boolean z;
        if (this.mTargetHeight == 0 || this.mTargetWidth == 0) {
            this.mTargetHeight = this.mInputHeight;
            this.mTargetWidth = this.mInputWidth;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.preRotate((float) (-this.mRotation));
        this.mPrjMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        if (this.mBuffer == null) {
            this.mBuffer = new GlTextureFrameBuffer(6408);
        }
        this.mBuffer.setSize(this.mTargetWidth, this.mTargetHeight);
        if (this.mMode == Mode.MODE_FIT) {
            z = true;
        } else {
            z = false;
        }
        RendererCommon.calcWindRatio(z, this.mHorizontalMirror, this.mVerticalMirror, this.mTargetWidth, this.mTargetHeight, this.mInputWidth, this.mInputHeight, this.mPrjMatrix);
        this.mUpdateProject = false;
    }

    public void updateRotation(int i2) {
        this.mRotation = i2;
        this.mUpdateProject = true;
    }

    public void updateCrop(int i2, int i3) {
        this.mTargetHeight = i3;
        this.mTargetWidth = i2;
        this.mUpdateProject = true;
    }

    public void updateMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
        this.mUpdateProject = true;
    }

    public VideoProcessUnit(Handler handler, Mode mode) {
        reset();
        this.mMode = mode;
        this.mGlHandler = handler;
        if (handler == null) {
            throw new AndroidRuntimeException("Handler is null.");
        }
    }

    public int process(int i2, int i3, int i4, boolean z, android.graphics.Matrix matrix) {
        return process(i2, i3, i4, z, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix));
    }

    public int process(final int i2, final int i3, final int i4, final boolean z, final float[] fArr) {
        final int[] iArr = {-1};
        Handler handler = this.mGlHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.utils.VideoProcessUnit.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(100506);
                }

                public void run() {
                    iArr[0] = VideoProcessUnit.this.onProcess(i2, i3, i4, z, fArr);
                }
            });
        }
        return iArr[0];
    }

    public int onProcess(int i2, int i3, int i4, boolean z, float[] fArr) {
        if (i3 <= 0 || i4 <= 0 || i2 <= 0) {
            throw new AndroidRuntimeException("Bad parameter");
        }
        if (!(this.mInputWidth == i3 && this.mInputHeight == i4)) {
            this.mInputHeight = i4;
            this.mInputWidth = i3;
            this.mUpdateProject = true;
        }
        if (this.mUpdateProject) {
            updateProject();
        }
        if (this.mDrawer == null) {
            this.mDrawer = new GlRenderDrawer();
        }
        GLES20.glBindFramebuffer(36160, this.mBuffer.getFrameBufferId());
        GLES20.glClear(16640);
        if (z) {
            this.mDrawer.drawOes(i2, this.mPrjMatrix, fArr, 0, 0, this.mTargetWidth, this.mTargetHeight);
        } else {
            this.mDrawer.drawRgb(i2, this.mPrjMatrix, fArr, 0, 0, this.mTargetWidth, this.mTargetHeight);
        }
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, 0);
        return this.mBuffer.getTextureId();
    }
}
