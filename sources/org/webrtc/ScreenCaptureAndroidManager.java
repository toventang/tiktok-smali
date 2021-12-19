package org.webrtc;

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
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class ScreenCaptureAndroidManager implements VideoCapturer, VideoSink {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private DeviceOrientation mCurrentOrientation;
    private Display mDisplay;
    private int mFrameIndex;
    public Map<Integer, CountDownLatch> mLocks;
    private Map<Integer, VideoFrame> mVideoFrames;
    public MediaProjection mediaProjection;
    public MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    private int width;

    static {
        Covode.recordClassIndex(106654);
    }

    private static MediaProjection org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection(MediaProjectionManager mediaProjectionManager2, int i2, Intent intent) {
        Pair<Boolean, Object> a2 = a.a(mediaProjectionManager2, new Object[]{Integer.valueOf(i2), intent}, 102101, "android.media.projection.MediaProjection", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (MediaProjection) a2.second;
        }
        MediaProjection mediaProjection2 = mediaProjectionManager2.getMediaProjection(i2, intent);
        a.a(mediaProjection2, mediaProjectionManager2, new Object[]{Integer.valueOf(i2), intent}, 102101, "org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection(Landroid/media/projection/MediaProjectionManager;ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;");
        return mediaProjection2;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class HOLDER {
        public static final ScreenCaptureAndroidManager INSTANCE = new ScreenCaptureAndroidManager();

        private HOLDER() {
        }

        static {
            Covode.recordClassIndex(106659);
        }
    }

    public static ScreenCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private ScreenCaptureAndroidManager() {
        this.mVideoFrames = new HashMap();
        this.mLocks = new HashMap();
    }

    private boolean maybeDoRotation() {
        DeviceOrientation deviceOrientation = getDeviceOrientation(getDeviceRotation());
        if (deviceOrientation == this.mCurrentOrientation) {
            return false;
        }
        this.mCurrentOrientation = deviceOrientation;
        rotateCaptureOrientation(deviceOrientation);
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        MethodCollector.i(8981);
        this.isDisposed = true;
        MethodCollector.o(8981);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        MethodCollector.i(8803);
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCaptureAndroidManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106656);
            }

            private static void org_webrtc_ScreenCaptureAndroidManager$2_android_media_projection_MediaProjection_stop(MediaProjection mediaProjection) {
                if (!((Boolean) a.a(mediaProjection, new Object[0], 102102, "void", false, null).first).booleanValue()) {
                    mediaProjection.stop();
                    a.a(null, mediaProjection, new Object[0], 102102, "org_webrtc_ScreenCaptureAndroidManager$2_android_media_projection_MediaProjection_stop(Landroid/media/projection/MediaProjection;)V");
                }
            }

            public void run() {
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
                if (ScreenCaptureAndroidManager.this.virtualDisplay != null) {
                    ScreenCaptureAndroidManager.this.virtualDisplay.release();
                    ScreenCaptureAndroidManager.this.virtualDisplay = null;
                }
                if (ScreenCaptureAndroidManager.this.mediaProjection != null) {
                    ScreenCaptureAndroidManager.this.mediaProjection.unregisterCallback(ScreenCaptureAndroidManager.this.mediaProjectionCallback);
                    org_webrtc_ScreenCaptureAndroidManager$2_android_media_projection_MediaProjection_stop(ScreenCaptureAndroidManager.this.mediaProjection);
                    ScreenCaptureAndroidManager.this.mediaProjection = null;
                }
            }
        });
        MethodCollector.o(8803);
    }

    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE;

        static {
            Covode.recordClassIndex(106658);
        }
    }

    private synchronized int getDeviceRotation() {
        MethodCollector.i(9196);
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            MethodCollector.o(9196);
            return 0;
        } else if (rotation == 1) {
            MethodCollector.o(9196);
            return 90;
        } else if (rotation == 2) {
            MethodCollector.o(9196);
            return LiveFeedRefreshTimeSetting.DEFAULT;
        } else if (rotation != 3) {
            MethodCollector.o(9196);
            return 0;
        } else {
            MethodCollector.o(9196);
            return 270;
        }
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("RTCScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private DeviceOrientation getDeviceOrientation(int i2) {
        if (i2 != 0) {
            if (i2 != 90) {
                if (i2 != 180) {
                    if (i2 != 270) {
                        return DeviceOrientation.LANDSCAPE;
                    }
                }
            }
            return DeviceOrientation.LANDSCAPE;
        }
        return DeviceOrientation.PORTRAIT;
    }

    private void rotateCaptureOrientation(DeviceOrientation deviceOrientation) {
        if ((deviceOrientation == DeviceOrientation.LANDSCAPE && this.width < this.height) || (deviceOrientation == DeviceOrientation.PORTRAIT && this.height < this.width)) {
            int i2 = this.width;
            int i3 = this.height;
            this.height = i2;
            this.width = i2 + (i3 - i2);
        }
    }

    public int addFrame(VideoFrame videoFrame) {
        int i2 = this.mFrameIndex;
        this.mVideoFrames.put(Integer.valueOf(i2), videoFrame);
        this.mFrameIndex++;
        return i2;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (maybeDoRotation()) {
            VirtualDisplay virtualDisplay2 = this.virtualDisplay;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
            }
            createVirtualDisplay();
            return;
        }
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public VideoFrame removeFrame(int i2) {
        if (this.mVideoFrames.containsKey(Integer.valueOf(i2))) {
            return this.mVideoFrames.remove(Integer.valueOf(i2));
        }
        return null;
    }

    public synchronized void stopCapture(final int i2) {
        MethodCollector.i(8802);
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCaptureAndroidManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106655);
            }

            private static void org_webrtc_ScreenCaptureAndroidManager$1_android_media_projection_MediaProjection_stop(MediaProjection mediaProjection) {
                if (!((Boolean) a.a(mediaProjection, new Object[0], 102102, "void", false, null).first).booleanValue()) {
                    mediaProjection.stop();
                    a.a(null, mediaProjection, new Object[0], 102102, "org_webrtc_ScreenCaptureAndroidManager$1_android_media_projection_MediaProjection_stop(Landroid/media/projection/MediaProjection;)V");
                }
            }

            public static int org_webrtc_ScreenCaptureAndroidManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
                return 0;
            }

            public void run() {
                CountDownLatch remove = ScreenCaptureAndroidManager.this.mLocks.remove(Integer.valueOf(i2));
                if (remove != null) {
                    remove.countDown();
                    org_webrtc_ScreenCaptureAndroidManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_i("ScreenCaptureAndroid", "stopCapture countDown finish");
                }
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
                if (ScreenCaptureAndroidManager.this.virtualDisplay != null) {
                    ScreenCaptureAndroidManager.this.virtualDisplay.release();
                    ScreenCaptureAndroidManager.this.virtualDisplay = null;
                }
                if (ScreenCaptureAndroidManager.this.mediaProjection != null) {
                    ScreenCaptureAndroidManager.this.mediaProjection.unregisterCallback(ScreenCaptureAndroidManager.this.mediaProjectionCallback);
                    org_webrtc_ScreenCaptureAndroidManager$1_android_media_projection_MediaProjection_stop(ScreenCaptureAndroidManager.this.mediaProjection);
                    ScreenCaptureAndroidManager.this.mediaProjection = null;
                }
            }
        });
        MethodCollector.o(8802);
    }

    public void setData(Intent intent, MediaProjection.Callback callback) {
        this.isDisposed = false;
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    public void addLock(int i2, CountDownLatch countDownLatch) {
        this.mLocks.put(Integer.valueOf(i2), countDownLatch);
    }

    public static Object org_webrtc_ScreenCaptureAndroidManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(8522);
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
                    MethodCollector.o(8522);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i2, int i3, int i4) {
        MethodCollector.i(8798);
        startCapture(i2, i3, i4, 4);
        MethodCollector.o(8798);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i2, int i3, int i4) {
        MethodCollector.i(8982);
        checkNotDisposed();
        if (i2 <= 0 || i3 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i2;
            this.height = i3;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        if (this.virtualDisplay == null) {
            MethodCollector.o(8982);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCaptureAndroidManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(106657);
            }

            public void run() {
                ScreenCaptureAndroidManager.this.virtualDisplay.release();
                ScreenCaptureAndroidManager.this.createVirtualDisplay();
            }
        });
        MethodCollector.o(8982);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver2) {
        MethodCollector.i(8520);
        checkNotDisposed();
        if (capturerObserver2 != null) {
            this.capturerObserver = capturerObserver2;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.mediaProjectionManager = (MediaProjectionManager) org_webrtc_ScreenCaptureAndroidManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "media_projection");
                this.mDisplay = ((WindowManager) org_webrtc_ScreenCaptureAndroidManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window")).getDefaultDisplay();
                MethodCollector.o(8520);
            } else {
                RuntimeException runtimeException = new RuntimeException("surfaceTextureHelper not set.");
                MethodCollector.o(8520);
                throw runtimeException;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException("capturerObserver not set.");
            MethodCollector.o(8520);
            throw runtimeException2;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i2, int i3, int i4, int i5) {
        MethodCollector.i(8523);
        checkNotDisposed();
        if (i2 <= 0 || i3 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i2;
            this.height = i3;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        MediaProjection org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection = org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection(this.mediaProjectionManager, -1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection;
        if (org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection == null) {
            MethodCollector.o(8523);
            return;
        }
        org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (i5 <= 0) {
            i5 = 4;
        }
        surfaceTextureHelper2.setMinFps(i5);
        this.surfaceTextureHelper.startListening(this);
        MethodCollector.o(8523);
    }
}
