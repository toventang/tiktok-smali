package com.ss.avframework.livestreamv2.core;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.SurfaceTextureHelper;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.utils.VideoProcessUnit;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.avframework.utils.TimeUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class ShortVideoPushManager implements IShortVideoPushManager {
    private Surface mCurrentActiveSurface;
    private int mDefaultBufferHeight = 1280;
    private int mDefaultBufferWidth = 720;
    private final int mFrameInterval;
    private final GLThread mGLThread;
    public final Handler mGLTreadHandler;
    public final LiveCore mLiveCore;
    private long mNextFrameTimeStamp;
    public final int mOutputHeight;
    public int mOutputTextureId = -1;
    public final int mOutputWidth;
    public Runnable mPushTaskRunnable;
    private Object mReleaseFence = new Object();
    private boolean mReleased = false;
    private Map<Surface, SurfaceTextureHelper> mSurfaceMap;
    private int mVideoHeight;
    private VideoProcessUnit mVideoProcessUnit;
    private int mVideoWidth;
    public final Handler mWorkThreadHandler;

    static {
        Covode.recordClassIndex(100121);
    }

    static final /* synthetic */ void lambda$doRelease$1$ShortVideoPushManager() {
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void enableVideoMirror(boolean z, boolean z2) {
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public boolean isVideoMirror(boolean z) {
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void setFitMode(boolean z) {
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void setRenderView(RenderView renderView) {
    }

    private int getVideoHeight() {
        return this.mVideoHeight;
    }

    private int getVideoWidth() {
        return this.mVideoWidth;
    }

    public void finalize() {
        release();
    }

    public class ShortVideoSurfaceTextureHelper extends SurfaceTextureHelper {
        static {
            Covode.recordClassIndex(100126);
        }

        @Override // com.ss.avframework.buffer.SurfaceTextureHelper
        public void handlerExit() {
            AVLog.ioi("ShortVideoPushManager", "call handlerExit.");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ShortVideoSurfaceTextureHelper(Handler handler) {
            super(handler, true);
            ShortVideoPushManager.this = r2;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public synchronized void release() {
        MethodCollector.i(14018);
        synchronized (this.mReleaseFence) {
            try {
                doRelease();
            } finally {
                MethodCollector.o(14018);
            }
        }
    }

    private void doRelease() {
        if (!this.mReleased) {
            this.mReleased = true;
            this.mPushTaskRunnable = ShortVideoPushManager$$Lambda$1.$instance;
            this.mCurrentActiveSurface = null;
            Map<Surface, SurfaceTextureHelper> map = this.mSurfaceMap;
            if (map != null && map.size() > 0) {
                for (Map.Entry<Surface, SurfaceTextureHelper> entry : this.mSurfaceMap.entrySet()) {
                    Surface key = entry.getKey();
                    if (key != null) {
                        key.release();
                    }
                    SurfaceTextureHelper value = entry.getValue();
                    if (value != null) {
                        value.dispose();
                    }
                }
                this.mSurfaceMap.clear();
            }
            this.mSurfaceMap = null;
            VideoProcessUnit videoProcessUnit = this.mVideoProcessUnit;
            if (videoProcessUnit != null) {
                videoProcessUnit.release();
                this.mVideoProcessUnit = null;
            }
            SafeHandlerThreadPoolExecutor.unlockThread(this.mGLThread);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public Surface getSurface() {
        SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(this.mGLTreadHandler, new Callable<SurfaceTextureHelper>() {
            /* class com.ss.avframework.livestreamv2.core.ShortVideoPushManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100125);
            }

            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    ShortVideoPushManager shortVideoPushManager = ShortVideoPushManager.this;
                    return new ShortVideoSurfaceTextureHelper(shortVideoPushManager.mGLTreadHandler);
                } catch (RuntimeException unused) {
                    AVLog.e("ShortVideoPushManager", "call:  create failure");
                    return null;
                }
            }
        });
        if (surfaceTextureHelper == null) {
            return null;
        }
        SurfaceTexture surfaceTexture = surfaceTextureHelper.getSurfaceTexture();
        int i2 = Build.VERSION.SDK_INT;
        surfaceTexture.setDefaultBufferSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
        Surface surface = new Surface(surfaceTexture);
        surfaceTextureHelper.startListening(new ShortVideoPushManager$$Lambda$0(this, surface, surfaceTextureHelper));
        AVLog.w("ShortVideoPushManager", "getSurface(" + surface + ")");
        this.mSurfaceMap.put(surface, surfaceTextureHelper);
        return surface;
    }

    public static IShortVideoPushManager createShortVideoPushManager(LiveCore liveCore) {
        return new ShortVideoPushManager(liveCore);
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void releaseSurface(Surface surface) {
        MethodCollector.i(13973);
        synchronized (this.mReleaseFence) {
            try {
                doReleaseSurface(surface);
            } finally {
                MethodCollector.o(13973);
            }
        }
    }

    private boolean keepFrame(long j2) {
        long j3 = this.mNextFrameTimeStamp;
        if (j3 > 0) {
            long j4 = j3 - j2;
            long abs = Math.abs(j4);
            int i2 = this.mFrameInterval;
            if (abs < ((long) (i2 * 2))) {
                if (j4 > 0) {
                    return false;
                }
                this.mNextFrameTimeStamp += (long) i2;
                return true;
            }
        }
        this.mNextFrameTimeStamp = j2 + ((long) (this.mFrameInterval / 2));
        return true;
    }

    private void doReleaseSurface(Surface surface) {
        AVLog.iow("ShortVideoPushManager", "releaseSurface(" + surface + ")");
        if (this.mCurrentActiveSurface == surface) {
            AVLog.w("ShortVideoPushManager", "can not release surface cause active(" + surface + ")");
        } else if (this.mSurfaceMap != null && surface != null) {
            surface.release();
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceMap.get(surface);
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
            }
            this.mSurfaceMap.remove(surface);
        }
    }

    private ShortVideoPushManager(LiveCore liveCore) {
        DisplayMetrics displayMetrics;
        AVLog.w("ShortVideoPushManager", "ShortVideoPushManager ctor");
        AVLog.logKibana(4, "ShortVideoPushManager", "ShortVideoPushManager ctor", null);
        this.mLiveCore = liveCore;
        this.mFrameInterval = 1000 / liveCore.getBuilder().getVideoFps();
        int videoCaptureWidth = liveCore.getBuilder().getVideoCaptureWidth();
        this.mOutputWidth = videoCaptureWidth;
        int videoCaptureHeight = liveCore.getBuilder().getVideoCaptureHeight();
        this.mOutputHeight = videoCaptureHeight;
        this.mWorkThreadHandler = liveCore.getWorkThreadHandler();
        this.mSurfaceMap = new HashMap();
        LiveCore.Builder builder = liveCore.getBuilder();
        if (!(builder == null || (displayMetrics = builder.getContext().getResources().getDisplayMetrics()) == null)) {
            this.mDefaultBufferWidth = displayMetrics.widthPixels;
            this.mDefaultBufferHeight = displayMetrics.heightPixels;
        }
        GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("GL-ShortVideo");
        this.mGLThread = lockGLThread;
        lockGLThread.start();
        Handler handler = lockGLThread.getHandler();
        this.mGLTreadHandler = handler;
        VideoProcessUnit videoProcessUnit = new VideoProcessUnit(handler, VideoProcessUnit.Mode.MODE_FIT);
        this.mVideoProcessUnit = videoProcessUnit;
        videoProcessUnit.updateCrop(videoCaptureWidth, videoCaptureHeight);
        this.mPushTaskRunnable = new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.ShortVideoPushManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100124);
            }

            public void run() {
                ShortVideoPushManager.this.mWorkThreadHandler.removeCallbacks(ShortVideoPushManager.this.mPushTaskRunnable);
                AVLog.logToIODevice2(5, "ShortVideoPushManager", "Short video frame comes.", null, "ShortVideoPushManager:mVideoMixer", 10000);
                ShortVideoPushManager.this.mLiveCore.pushVideoFrame(ShortVideoPushManager.this.mOutputTextureId, false, ShortVideoPushManager.this.mOutputWidth, ShortVideoPushManager.this.mOutputHeight, 0, null, TimeUtils.nanoTime() / 1000);
                ShortVideoPushManager.this.mWorkThreadHandler.postDelayed(ShortVideoPushManager.this.mPushTaskRunnable, 100);
            }
        };
    }

    @Override // com.ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void activeSurface(Surface surface, int i2, int i3) {
        MethodCollector.i(13920);
        AVLog.iow("ShortVideoPushManager", "activeSurface(" + i2 + "," + i3 + "),surface" + surface);
        synchronized (this.mSurfaceMap) {
            try {
                this.mCurrentActiveSurface = surface;
                this.mVideoWidth = i2;
                this.mVideoHeight = i3;
            } finally {
                MethodCollector.o(13920);
            }
        }
    }

    public final /* synthetic */ void lambda$getSurface$0$ShortVideoPushManager(Surface surface, SurfaceTextureHelper surfaceTextureHelper, int i2, float[] fArr, long j2) {
        MethodCollector.i(14073);
        synchronized (this.mSurfaceMap) {
            try {
                if (this.mCurrentActiveSurface != surface) {
                    AVLog.logToIODevice2(5, "ShortVideoPushManager", "Current surface (" + surface + ")is not active,active is:" + this.mCurrentActiveSurface, null, "ShortVideoPushManager:CheceSurface", 10000);
                    surfaceTextureHelper.returnTextureFrame(true);
                } else if (!keepFrame(j2 / 1000000)) {
                    surfaceTextureHelper.returnTextureFrame(true);
                    MethodCollector.o(14073);
                } else {
                    int videoWidth = getVideoWidth();
                    int videoHeight = getVideoHeight();
                    if (i2 <= 0 || videoWidth <= 0 || videoHeight <= 0) {
                        surfaceTextureHelper.returnTextureFrame(true);
                        MethodCollector.o(14073);
                        return;
                    }
                    this.mOutputTextureId = this.mVideoProcessUnit.process(i2, videoWidth, videoHeight, true, fArr);
                    this.mPushTaskRunnable.run();
                    surfaceTextureHelper.returnTextureFrame();
                    MethodCollector.o(14073);
                }
            } finally {
                MethodCollector.o(14073);
            }
        }
    }
}
