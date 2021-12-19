package com.ss.avframework.capture.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.avframework.buffer.SurfaceTextureHelper;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import java.lang.reflect.Field;

public class ScreenVideoCapturer extends VideoCapturer implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    private int fps;
    private int frameInterval;
    public int height;
    private boolean isDisposed;
    public final Runnable mDupFrameTask = new Runnable() {
        /* class com.ss.avframework.capture.video.ScreenVideoCapturer.AnonymousClass2 */

        static {
            Covode.recordClassIndex(99734);
        }

        public void run() {
            if (ScreenVideoCapturer.this.surfaceTextureHelper != null && ScreenVideoCapturer.this.mStat == 1) {
                ScreenVideoCapturer.this.surfaceTextureHelper.insertTextureFrameIfNeed();
            }
        }
    };
    private long mNextFrameTimeStamp;
    public final VideoCapturer.VideoCapturerObserver mObserver;
    public int mStat;
    protected MediaProjection mediaProjection;
    public final MediaProjection.Callback mediaProjectionCallback = new MediaProjection.Callback() {
        /* class com.ss.avframework.capture.video.ScreenVideoCapturer.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99733);
        }

        public void onStop() {
            if (ScreenVideoCapturer.this.mObserver != null) {
                ScreenVideoCapturer.this.mObserver.onVideoCapturerError(-201, new Exception("mediaProjection session is no longer valid"));
            }
            super.onStop();
        }
    };
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    public int width;

    static {
        Covode.recordClassIndex(99732);
    }

    private static MediaProjection com_ss_avframework_capture_video_ScreenVideoCapturer_android_media_projection_MediaProjectionManager_getMediaProjection(MediaProjectionManager mediaProjectionManager2, int i2, Intent intent) {
        Pair<Boolean, Object> a2 = a.a(mediaProjectionManager2, new Object[]{Integer.valueOf(i2), intent}, 102101, "android.media.projection.MediaProjection", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (MediaProjection) a2.second;
        }
        MediaProjection mediaProjection2 = mediaProjectionManager2.getMediaProjection(i2, intent);
        a.a(mediaProjection2, mediaProjectionManager2, new Object[]{Integer.valueOf(i2), intent}, 102101, "com_ss_avframework_capture_video_ScreenVideoCapturer_android_media_projection_MediaProjectionManager_getMediaProjection(Landroid/media/projection/MediaProjectionManager;ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;");
        return mediaProjection2;
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer, com.ss.avframework.engine.VideoSource
    public boolean isScreenCast() {
        return true;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void stop() {
        stopCapture();
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    @Override // com.ss.avframework.engine.NativeObject
    public void release() {
        dispose();
        super.release();
        this.mStat = 2;
    }

    private synchronized void dispose() {
        MethodCollector.i(10414);
        this.isDisposed = true;
        MethodCollector.o(10414);
    }

    public synchronized void stopCapture() {
        MethodCollector.i(10413);
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class com.ss.avframework.capture.video.ScreenVideoCapturer.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99735);
            }

            private static void com_ss_avframework_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop(MediaProjection mediaProjection) {
                if (!((Boolean) a.a(mediaProjection, new Object[0], 102102, "void", false, null).first).booleanValue()) {
                    mediaProjection.stop();
                    a.a(null, mediaProjection, new Object[0], 102102, "com_ss_avframework_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop(Landroid/media/projection/MediaProjection;)V");
                }
            }

            public void run() {
                ScreenVideoCapturer.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenVideoCapturer.this.mDupFrameTask);
                ScreenVideoCapturer.this.surfaceTextureHelper.stopListening();
                if (ScreenVideoCapturer.this.virtualDisplay != null) {
                    ScreenVideoCapturer.this.virtualDisplay.release();
                    ScreenVideoCapturer.this.virtualDisplay = null;
                }
                if (ScreenVideoCapturer.this.mediaProjection != null) {
                    ScreenVideoCapturer.this.mediaProjection.unregisterCallback(ScreenVideoCapturer.this.mediaProjectionCallback);
                    try {
                        AVLog.ioi("ScreenVideoCapturer", "MediaProjection stop " + ScreenVideoCapturer.this.mediaProjection);
                        com_ss_avframework_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop(ScreenVideoCapturer.this.mediaProjection);
                    } catch (Exception e2) {
                        AVLog.ioe("ScreenVideoCapturer", "MediaProjection stop exception: " + e2.getMessage());
                    }
                    ScreenVideoCapturer.this.mediaProjection = null;
                }
                ScreenVideoCapturer.this.mStat = 0;
            }
        });
        MethodCollector.o(10413);
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private boolean keepFrame(long j2) {
        long j3 = this.mNextFrameTimeStamp;
        if (j3 > 0) {
            long j4 = j3 - j2;
            long abs = Math.abs(j4);
            int i2 = this.frameInterval;
            if (abs < ((long) (i2 * 2))) {
                if (j4 > 0) {
                    return false;
                }
                this.mNextFrameTimeStamp += (long) i2;
                return true;
            }
        }
        this.mNextFrameTimeStamp = j2 + ((long) (this.frameInterval / 2));
        return true;
    }

    public ScreenVideoCapturer(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
        this.mediaProjectionPermissionResultData = intent;
        this.mObserver = videoCapturerObserver;
        this.mStat = 2;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context) {
        MethodCollector.i(10247);
        checkNotDisposed();
        if (surfaceTextureHelper2 != null) {
            this.surfaceTextureHelper = surfaceTextureHelper2;
            this.mediaProjectionManager = (MediaProjectionManager) com_ss_avframework_capture_video_ScreenVideoCapturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "media_projection");
            this.mStat = 0;
            MethodCollector.o(10247);
        } else {
            RuntimeException runtimeException = new RuntimeException("surfaceTextureHelper not set.");
            MethodCollector.o(10247);
            throw runtimeException;
        }
    }

    public static Object com_ss_avframework_capture_video_ScreenVideoCapturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(10410);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(10410);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void start(int i2, int i3, int i4) {
        startCapture(i2, i3, i4);
    }

    public synchronized void changeCaptureFormat(int i2, int i3, int i4) {
        MethodCollector.i(10415);
        checkNotDisposed();
        this.width = i2;
        this.height = i3;
        if (this.virtualDisplay == null) {
            MethodCollector.o(10415);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class com.ss.avframework.capture.video.ScreenVideoCapturer.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99736);
            }

            public void run() {
                ScreenVideoCapturer.this.virtualDisplay.release();
                ScreenVideoCapturer.this.createVirtualDisplay();
            }
        });
        MethodCollector.o(10415);
    }

    @Override // com.ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i2, float[] fArr, long j2) {
        this.surfaceTextureHelper.getHandler().removeCallbacks(this.mDupFrameTask);
        this.surfaceTextureHelper.getHandler().postDelayed(this.mDupFrameTask, (long) this.frameInterval);
        this.numCapturedFrames++;
        long j3 = j2 / 1000;
        if (!keepFrame(j3 / 1000)) {
            this.surfaceTextureHelper.returnTextureFrame(true);
            return;
        }
        VideoFrame.TextureBuffer createTextureBuffer = this.surfaceTextureHelper.createTextureBuffer(this.width, this.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
        onFrame(createTextureBuffer, this.width, this.height, 0, j3);
        createTextureBuffer.release();
    }

    public synchronized void startCapture(int i2, int i3, int i4) {
        MethodCollector.i(10412);
        checkNotDisposed();
        this.width = i2;
        this.height = i3;
        this.fps = i4;
        this.frameInterval = 1000 / i4;
        try {
            this.mediaProjection = com_ss_avframework_capture_video_ScreenVideoCapturer_android_media_projection_MediaProjectionManager_getMediaProjection(this.mediaProjectionManager, -1, this.mediaProjectionPermissionResultData);
            AVLog.ioi("ScreenVideoCapturer", "MediaProjectionManager getMediaProjection " + this.mediaProjection);
            MediaProjection mediaProjection2 = this.mediaProjection;
            if (mediaProjection2 == null) {
                this.mObserver.onVideoCapturerError(-203, new Exception("mediaProjection is null, please check permission"));
                MethodCollector.o(10412);
                return;
            }
            mediaProjection2.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.surfaceTextureHelper.startListening(this);
            this.mStat = 1;
            VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mObserver;
            if (videoCapturerObserver != null) {
                videoCapturerObserver.onVideoCapturerStarted();
            }
            MethodCollector.o(10412);
        } catch (Exception e2) {
            AVLog.ioe("ScreenVideoCapturer", "MediaProjectionManager getMediaProjection fail: " + e2.getMessage());
            this.mObserver.onVideoCapturerError(-202, e2);
            MethodCollector.o(10412);
        }
    }
}
