package com.ss.avframework.buffer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.SurfaceTextureHelper;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;

public class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
    public static final String TAG = SurfaceTextureSharedHandler.class.getSimpleName();
    private SurfaceInternal surface;

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.buffer.SurfaceTextureHelper
    public void handlerExit() {
    }

    public static class SurfaceInternal extends Surface implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
        private final int mHeight;
        private SurfaceTextureHelper.OnTextureFrameAvailableListener mListerne;
        private SurfaceTextureSharedHandler mParent;
        private final int mWidth;

        static {
            Covode.recordClassIndex(99696);
        }

        public int getHeight() {
            return this.mHeight;
        }

        public SurfaceTextureHelper getSurfaceTextureHelper() {
            return this.mParent;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public void release() {
            super.release();
            SurfaceTextureSharedHandler surfaceTextureSharedHandler = this.mParent;
            if (surfaceTextureSharedHandler != null) {
                surfaceTextureSharedHandler.dispose();
                this.mParent = null;
            }
            AVLog.iow(SurfaceTextureSharedHandler.TAG, "Release surface " + this + " with w " + this.mWidth + " h " + this.mHeight);
        }

        public void setListener(SurfaceTextureHelper.OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
            this.mListerne = onTextureFrameAvailableListener;
        }

        @Override // com.ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
        public void onTextureFrameAvailable(int i2, float[] fArr, long j2) {
            SurfaceTextureHelper.OnTextureFrameAvailableListener onTextureFrameAvailableListener = this.mListerne;
            if (onTextureFrameAvailableListener != null) {
                onTextureFrameAvailableListener.onTextureFrameAvailable(i2, fArr, j2);
            }
            this.mParent.returnTextureFrame();
        }

        public SurfaceInternal(SurfaceTexture surfaceTexture, SurfaceTextureSharedHandler surfaceTextureSharedHandler, int i2, int i3) {
            super(surfaceTexture);
            this.mParent = surfaceTextureSharedHandler;
            surfaceTextureSharedHandler.startListening(this);
            this.mWidth = i2;
            this.mHeight = i3;
        }
    }

    static {
        Covode.recordClassIndex(99694);
    }

    @Override // com.ss.avframework.buffer.SurfaceTextureHelper
    public void dispose() {
        super.dispose();
        GLThreadManager.get().decrementRef();
    }

    public SurfaceTextureSharedHandler(Handler handler) {
        super(handler, true);
    }

    public static Surface createSurface(int i2, int i3) {
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager == null) {
            return null;
        }
        gLThreadManager.addRef();
        final Handler mainGlHandle = GLThreadManager.getMainGlHandle();
        final SurfaceTextureSharedHandler[] surfaceTextureSharedHandlerArr = new SurfaceTextureSharedHandler[1];
        ThreadUtils.invokeAtFrontUninterruptibly(mainGlHandle, new Runnable() {
            /* class com.ss.avframework.buffer.SurfaceTextureSharedHandler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99695);
            }

            public final void run() {
                surfaceTextureSharedHandlerArr[0] = new SurfaceTextureSharedHandler(mainGlHandle);
            }
        });
        return surfaceTextureSharedHandlerArr[0].getSurface(i2, i3);
    }

    public synchronized Surface getSurface(int i2, int i3) {
        SurfaceInternal surfaceInternal;
        MethodCollector.i(10067);
        if (this.surface == null) {
            int i4 = Build.VERSION.SDK_INT;
            getSurfaceTexture().setDefaultBufferSize(i2, i3);
            this.surface = new SurfaceInternal(getSurfaceTexture(), this, i2, i3);
            AVLog.iow(TAG, "Create surface " + this.surface + " with w " + i2 + " h " + i3 + " tex " + getTextureId());
        }
        surfaceInternal = this.surface;
        MethodCollector.o(10067);
        return surfaceInternal;
    }
}
