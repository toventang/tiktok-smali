package com.he.lynx;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.b.b.b;
import com.he.lynx.HeliumApp;
import com.he.lynx.loader.MediaLoader;
import com.he.lynx.player.IHeliumPlayer;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

public class Helium {
    private static final int AUDIO = 8;
    private static final int VIDEO = 4;
    public static boolean cameraPermission = true;
    private static double[] euler = new double[4];
    static Sensor gyroscopeSensor;
    static volatile boolean helium_loaded;
    private static SensorEventListener orientationListener = new SensorEventListener() {
        /* class com.he.lynx.Helium.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34182);
        }

        public final void onAccuracyChanged(Sensor sensor, int i2) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            MethodCollector.i(5412);
            if (sensorEvent.sensor.getType() == 15) {
                Helium.sendOrientationData(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.values[3], sensorEvent.timestamp);
                MethodCollector.o(5412);
                return;
            }
            if (sensorEvent.sensor.getType() == 4) {
                Helium.sendGyroscopeData(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.timestamp);
            }
            MethodCollector.o(5412);
        }
    };
    public static final Set<IHeliumPlayer> players = new CopyOnWriteArraySet();
    static Sensor rotationSensor;
    static SensorManager sensorManager;

    public static native void _screenshot(long j2, int i2, int i3, ByteBuffer byteBuffer);

    public static native long addView(long j2, Surface surface);

    public static native void cleanup(long j2);

    public static native void dispatch(long j2, ByteBuffer byteBuffer);

    public static native void doFrame(long j2);

    public static native void flushRecord(long j2, long j3);

    private static String getMiniAppSoPluginDir() {
        return null;
    }

    public static native void onMediaRequest(long j2, Object obj, String str);

    public static native void onMediaStatusChange(long j2, int i2);

    public static native void onPause(long j2);

    private static native void onRecordRequest(long j2, Object obj);

    public static native void onResume(long j2);

    public static native void onSurfaceChanged(long j2, long j3, int i2, int i3);

    public static native void onSurfaceCreated(long j2, long j3, Surface surface);

    public static native void onSurfaceDestroyed(long j2, long j3);

    public static native String preloadLiteEffectModules();

    public static native void sendGyroscopeData(float f2, float f3, float f4, long j2);

    public static native void sendOrientationData(float f2, float f3, float f4, float f5, long j2);

    public static native void setLiteExternalEffectLibraryPath(String str);

    public static native void setSensitivePermissionStatus(int i2, boolean z);

    private static native void setupEngine(int i2, int i3);

    public static native long setupLite(float f2, HeliumApp heliumApp, long j2, long[] jArr, AssetManager assetManager, String str, boolean z, boolean z2);

    public static native long startRecord(long j2, long j3, Surface surface, int i2, ByteBuffer byteBuffer, int i3, int i4, float f2, float f3, float f4, float f5);

    private static void startRecord(HeliumApp heliumApp, BaseCameraContext baseCameraContext, String str, int i2, int i3, boolean z) {
    }

    public static native void stopAudioCapture(long j2);

    public static native void stopRecord(long j2, long j3);

    static class HostCameraContext extends BaseCameraContext {
        private final IPlatformCamera hostCamera;
        int pageID;

        static {
            Covode.recordClassIndex(34188);
        }

        private void autoFocus() {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.autoFocus();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void release() {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.dispose();
            }
            if (this.texture != null) {
                this.texture.release();
                this.texture = null;
            }
        }

        private void onSurfaceTextureReady(SurfaceTexture surfaceTexture) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.onSurfaceTextureReady(surfaceTexture);
            }
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void pause(HeliumApp.StateCallback.CallType callType) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.pause(callType);
            }
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void resume(HeliumApp.StateCallback.CallType callType) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.resume(callType);
            }
        }

        static HostCameraContext requestHostCameraCtx(int i2, HeliumApp.PlatformCameraFactory platformCameraFactory, int i3) {
            boolean z;
            boolean z2;
            boolean z3;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 96) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            IPlatformCamera createPlatformCamera = platformCameraFactory.createPlatformCamera();
            createPlatformCamera.request(z, z2, z3, 0, i3);
            Size cameraResolution = createPlatformCamera.getCameraResolution();
            return new HostCameraContext(cameraResolution.getWidth(), cameraResolution.getHeight(), createPlatformCamera, i3);
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void setMediaState(HeliumApp heliumApp, int i2, long j2) {
            int i3 = i2 & 15;
            if (i3 == 0) {
                release();
                heliumApp.resumables.remove(this);
            } else if (i3 == 1) {
                int i4 = (i2 >> 8) & 16777215;
                if (i4 != 0) {
                    this.texture = new SurfaceTexture(i4);
                    onSurfaceTextureReady(this.texture);
                }
                resume(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.add(this);
            } else if (i3 == 2) {
                pause(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.remove(this);
            } else if (i3 == 6) {
                this.texture.updateTexImage();
                this.s_timestamp = this.texture.getTimestamp();
            } else if (i3 == 7) {
                autoFocus();
            }
        }

        HostCameraContext(int i2, int i3, IPlatformCamera iPlatformCamera, int i4) {
            super(i2, i3);
            this.hostCamera = iPlatformCamera;
            this.pageID = i4;
        }
    }

    private static void stopSensors() {
        sensorManager.unregisterListener(orientationListener);
    }

    public static void setupEngine() {
        MethodCollector.i(4993);
        setupEngine(0, 1);
        MethodCollector.o(4993);
    }

    /* access modifiers changed from: package-private */
    public static class PlayerContext extends VideoContext implements IHeliumPlayer.IHeliumPlayerListener {
        final HeliumApp app;
        boolean isComplete;
        boolean loop;
        IHeliumPlayer player;
        Surface surface;
        final Uri uri;
        float volume;

        static {
            Covode.recordClassIndex(34189);
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public boolean onError(IHeliumPlayer iHeliumPlayer, Object obj) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public float getCurrentTime() {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null && !this.isComplete) {
                return ((float) iHeliumPlayer.getCurrentPosition()) / 1000.0f;
            }
            return 0.0f;
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void release() {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null) {
                iHeliumPlayer.release();
                this.player = null;
            }
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
                this.surface = null;
            }
            if (this.texture != null) {
                this.texture.release();
                this.texture = null;
            }
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onPrepared(IHeliumPlayer iHeliumPlayer) {
            try {
                iHeliumPlayer.play();
            } catch (IllegalStateException unused) {
            }
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void pause(HeliumApp.StateCallback.CallType callType) {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null) {
                try {
                    iHeliumPlayer.pause();
                } catch (IllegalStateException unused) {
                }
            }
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onRenderStart(IHeliumPlayer iHeliumPlayer) {
            MethodCollector.i(3904);
            Helium.onMediaStatusChange(this._ptr, 2);
            MethodCollector.o(3904);
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onSeekComplete(IHeliumPlayer iHeliumPlayer) {
            MethodCollector.i(3905);
            Helium.onMediaStatusChange(this._ptr, 3);
            MethodCollector.o(3905);
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onCompletion(IHeliumPlayer iHeliumPlayer) {
            MethodCollector.i(3906);
            if (this.loop) {
                try {
                    if (!iHeliumPlayer.isPlaying()) {
                        iHeliumPlayer.play();
                    }
                    iHeliumPlayer.seekTo(0);
                } catch (IllegalStateException unused) {
                }
            } else {
                this.isComplete = true;
            }
            if (this._ptr != 0) {
                Helium.onMediaStatusChange(this._ptr, 1);
            }
            MethodCollector.o(3906);
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void resume(HeliumApp.StateCallback.CallType callType) {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer == null) {
                IHeliumPlayer createPlayer = this.app.createPlayer();
                this.player = createPlayer;
                try {
                    createPlayer.setDataSource(this.uri.toString());
                } catch (Exception unused) {
                }
                this.player.setListener(this);
                this.player.prepare();
                this.player.setSurface(this.surface);
                return;
            }
            iHeliumPlayer.setSurface(this.surface);
            IHeliumPlayer iHeliumPlayer2 = this.player;
            float f2 = this.volume;
            iHeliumPlayer2.setVolume(f2, f2);
            if (HeliumApp.StateCallback.CallType.SystemCall != callType || !this.isComplete || this.loop) {
                try {
                    this.player.play();
                } catch (IllegalStateException unused2) {
                }
                this.isComplete = false;
                this.player.setListener(this);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void setMediaState(HeliumApp heliumApp, int i2, long j2) {
            int i3 = i2 & 15;
            boolean z = false;
            if (i3 == 1) {
                int i4 = i2 >> 8;
                if (i4 != 0) {
                    this.texture = new SurfaceTexture(i4 & 16777215);
                    this.surface = new Surface(this.texture);
                }
                if ((i2 & 128) != 0) {
                    z = true;
                }
                this.loop = z;
                this.volume = (float) Double.longBitsToDouble(j2);
            } else if (i3 == 11) {
                if ((i2 & 128) != 0) {
                    z = true;
                }
                this.loop = z;
            } else if (i3 == 4) {
                if ((i2 & 128) != 0) {
                    z = true;
                }
                this.loop = z;
                IHeliumPlayer iHeliumPlayer = this.player;
                if (iHeliumPlayer != null) {
                    try {
                        iHeliumPlayer.seekTo((int) (Double.longBitsToDouble(j2) * 1000.0d));
                    } catch (IllegalStateException unused) {
                    }
                }
            } else if (i3 == 5) {
                float longBitsToDouble = (float) Double.longBitsToDouble(j2);
                this.volume = longBitsToDouble;
                IHeliumPlayer iHeliumPlayer2 = this.player;
                if (iHeliumPlayer2 != null) {
                    iHeliumPlayer2.setVolume(longBitsToDouble, longBitsToDouble);
                }
            }
            super.setMediaState(heliumApp, i2, j2);
        }

        PlayerContext(HeliumApp heliumApp, Uri uri2, IHeliumPlayer iHeliumPlayer, int i2) {
            super(iHeliumPlayer.getVideoWidth(), iHeliumPlayer.getVideoHeight(), iHeliumPlayer.getDuration(), i2);
            this.app = heliumApp;
            this.uri = uri2;
            this.player = iHeliumPlayer;
        }
    }

    static {
        Covode.recordClassIndex(34181);
    }

    public static ExecutorService com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    private static float getCurrentTime(PlayerContext playerContext) {
        return playerContext.getCurrentTime();
    }

    public static void com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    private static String getInstallPath(HeliumApp heliumApp) {
        return heliumApp.context.getApplicationInfo().nativeLibraryDir;
    }

    public static void com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(String str) {
        MethodCollector.i(4891);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        m.a(uptimeMillis, str);
        MethodCollector.o(4891);
    }

    private static void initSensors(HeliumApp heliumApp) {
        SensorManager sensorManager2 = (SensorManager) com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(heliumApp.context, "sensor");
        sensorManager = sensorManager2;
        gyroscopeSensor = sensorManager2.getDefaultSensor(4);
        rotationSensor = sensorManager.getDefaultSensor(15);
    }

    private static void onFatalError(String str) {
        LLog.a(6, "HeliumLynx", "onFatalError ".concat(String.valueOf(str)));
        if (HeliumApp.fatalErrorHandler != null) {
            HeliumApp.fatalErrorHandler.handle(str);
        }
    }

    private static void onUncaughtException(String str) {
        LLog.a(6, "HeliumLynx", "onUncaughtException ".concat(String.valueOf(str)));
        if (HeliumApp.uncaughtExceptionHandler != null) {
            HeliumApp.uncaughtExceptionHandler.handle(str);
        }
    }

    private static long getTimeStamp(BaseCameraContext baseCameraContext) {
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - baseCameraContext.s_timestamp);
        int i2 = Build.VERSION.SDK_INT;
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - baseCameraContext.s_timestamp);
        return nanoTime - Math.min(Math.min(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - baseCameraContext.s_timestamp));
    }

    private static boolean startSensors(int i2) {
        sensorManager.unregisterListener(orientationListener);
        if (!sensorManager.registerListener(orientationListener, rotationSensor, i2) || !sensorManager.registerListener(orientationListener, gyroscopeSensor, i2)) {
            return false;
        }
        return true;
    }

    public static int getVideoRoration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int i2 = 0;
        if (str != null) {
            try {
                mediaMetadataRetriever.setDataSource(str, new HashMap());
            } catch (Exception e2) {
                LLog.a(6, "HeliumLynx", "getVideoRoration MediaMetadataRetriever exception ".concat(String.valueOf(e2)));
                e2.printStackTrace();
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        i2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
        LLog.a(3, "HeliumLynx", "rotation = ".concat(String.valueOf(i2)));
        mediaMetadataRetriever.release();
        return i2;
    }

    public static boolean loadHelium(String str) {
        boolean z;
        MethodCollector.i(4889);
        if (helium_loaded) {
            MethodCollector.o(4889);
            return true;
        }
        synchronized (Helium.class) {
            try {
                if (!helium_loaded) {
                    if (str != null) {
                        com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(str);
                    } else {
                        com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lynx_helium");
                    }
                    helium_loaded = true;
                }
            } catch (Throwable th) {
                MethodCollector.o(4889);
                throw th;
            }
            z = helium_loaded;
        }
        MethodCollector.o(4889);
        return z;
    }

    public static abstract class BaseCameraContext extends VideoContext {
        static {
            Covode.recordClassIndex(34187);
        }

        public boolean startRecord(HeliumApp heliumApp, String str, int i2, int i3, boolean z) {
            return false;
        }

        public void stopRecord(long j2, BaseCameraContext baseCameraContext) {
        }

        protected BaseCameraContext(int i2, int i3) {
            super(i2, i3, 0, 0);
        }
    }

    public static void onMediaRequest(long j2, Object obj) {
        MethodCollector.i(5048);
        onMediaRequest(j2, obj, "");
        MethodCollector.o(5048);
    }

    public static Object com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(ContextWrapper contextWrapper, String str) {
        Object obj;
        MethodCollector.i(5275);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = contextWrapper.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = contextWrapper.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = contextWrapper.getSystemService(str);
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
                    MethodCollector.o(5275);
                }
            }
        } else {
            obj = contextWrapper.getSystemService(str);
        }
        return obj;
    }

    static abstract class VideoContext implements HeliumApp.StateCallback {
        protected long _ptr;
        protected final int duration;
        protected final int height;
        protected final int rotation;
        protected long s_timestamp;
        protected SurfaceTexture texture;
        protected final int width;

        static {
            Covode.recordClassIndex(34190);
        }

        /* access modifiers changed from: protected */
        public abstract void release();

        /* access modifiers changed from: protected */
        public void setMediaState(HeliumApp heliumApp, int i2, long j2) {
            int i3 = i2 & 15;
            if (i3 == 0) {
                release();
                heliumApp.resumables.remove(this);
            } else if (i3 == 1) {
                resume(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.add(this);
            } else if (i3 == 2) {
                pause(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.remove(this);
            } else if (i3 == 6) {
                this.texture.updateTexImage();
                this.s_timestamp = this.texture.getTimestamp();
            }
        }

        protected VideoContext(int i2, int i3, int i4, int i5) {
            this.width = i2;
            this.height = i3;
            this.duration = i4;
            this.rotation = i5;
        }
    }

    private static void loadMedia(final HeliumApp heliumApp, String str, final long j2) {
        if (heliumApp.mediaLoader != null) {
            final Uri loadMedia = heliumApp.mediaLoader.loadMedia(str);
            if (loadMedia == null) {
                onMediaRequest(j2, null);
                return;
            }
            final IHeliumPlayer createPlayer = heliumApp.createPlayer();
            players.add(createPlayer);
            final AnonymousClass1MediaListener r2 = new IHeliumPlayer.IHeliumPlayerListener() {
                /* class com.he.lynx.Helium.AnonymousClass1MediaListener */
                private PlayerContext handle;
                private boolean hasRotation;
                private boolean prepared;
                private int rotation;

                static {
                    Covode.recordClassIndex(34184);
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onCompletion(IHeliumPlayer iHeliumPlayer) {
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onRenderStart(IHeliumPlayer iHeliumPlayer) {
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onSeekComplete(IHeliumPlayer iHeliumPlayer) {
                }

                private void checkPrepared() {
                    if (this.prepared && this.hasRotation) {
                        PlayerContext playerContext = new PlayerContext(heliumApp, loadMedia, createPlayer, this.rotation);
                        this.handle = playerContext;
                        Helium.onMediaRequest(j2, playerContext);
                    }
                }

                public final void setRotation(int i2) {
                    if (!this.hasRotation) {
                        this.hasRotation = true;
                        this.rotation = i2;
                        checkPrepared();
                    }
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onPrepared(IHeliumPlayer iHeliumPlayer) {
                    if (!this.prepared) {
                        iHeliumPlayer.setListener(null);
                        Helium.players.remove(iHeliumPlayer);
                        this.prepared = true;
                        checkPrepared();
                    }
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final boolean onError(IHeliumPlayer iHeliumPlayer, Object obj) {
                    iHeliumPlayer.setListener(null);
                    Helium.players.remove(iHeliumPlayer);
                    iHeliumPlayer.release();
                    Helium.onMediaRequest(j2, this.handle);
                    return true;
                }
            };
            ExecutorService com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor = com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
            com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor.execute(new Runnable() {
                /* class com.he.lynx.Helium.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(34185);
                }

                public final void run() {
                    final int videoRoration = Helium.getVideoRoration(loadMedia.toString());
                    heliumApp.dispatchToJSThread(new Runnable() {
                        /* class com.he.lynx.Helium.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(34186);
                        }

                        public void run() {
                            r2.setRotation(videoRoration);
                        }
                    });
                }
            });
            com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor.shutdown();
            createPlayer.setListener(r2);
            try {
                createPlayer.setDataSource(loadMedia.toString());
            } catch (Exception unused) {
            }
            createPlayer.prepare();
        }
    }

    private static void setMediaState(HeliumApp heliumApp, VideoContext videoContext, int i2, long j2) {
        videoContext.setMediaState(heliumApp, i2, j2);
    }

    private static void onMonitor(int i2, int i3, int i4, String str) {
        if (i2 == 1) {
            LLog.a(6, "HeliumLynx", "!!! Aurum init fail: ".concat(String.valueOf(str)));
        } else if (i2 == 2) {
            LLog.a(6, "HeliumLynx", "!!! Effect load fail: ".concat(String.valueOf(str)));
        }
    }

    private static void requestMedia(final HeliumApp heliumApp, final int i2, final int i3, final long j2) {
        boolean z;
        boolean z2;
        MediaLoader.FacingMode facingMode;
        if (heliumApp.mediaLoader != null) {
            MediaLoader.RequestParams requestParams = new MediaLoader.RequestParams();
            boolean z3 = false;
            if ((i2 & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            requestParams.audio = z;
            if ((i2 & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            requestParams.video = z2;
            if ((i2 & 400) != 0) {
                z3 = true;
            }
            requestParams.effect = z3;
            if ((i2 & 1) != 0) {
                facingMode = MediaLoader.FacingMode.ENVIRONMENT;
            } else {
                facingMode = MediaLoader.FacingMode.USER;
            }
            requestParams.facingMode = facingMode;
            heliumApp.mediaLoader.onRequest(requestParams, new MediaLoader.Responder() {
                /* class com.he.lynx.Helium.AnonymousClass1Callback */
                private boolean called;

                static {
                    Covode.recordClassIndex(34183);
                }

                @Override // com.he.lynx.loader.MediaLoader.Responder
                public void onResponse(boolean z) {
                    HeliumApp.StateCallback stateCallback;
                    MethodCollector.i(4164);
                    if (this.called) {
                        MethodCollector.o(4164);
                        return;
                    }
                    this.called = true;
                    if (!z) {
                        Helium.onMediaRequest(j2, null, "no authorization");
                        MethodCollector.o(4164);
                    } else if ((i2 & 4) == 0) {
                        Helium.onMediaRequest(j2, heliumApp);
                        MethodCollector.o(4164);
                    } else {
                        try {
                            HeliumApp.PlatformCameraFactory platformCameraFactory = heliumApp.getPlatformCameraFactory();
                            if (platformCameraFactory != null) {
                                LLog.a(5, "HeliumLynx", "Use Host Camera with pageID = " + i3);
                                try {
                                    stateCallback = HostCameraContext.requestHostCameraCtx(i2, platformCameraFactory, i3);
                                } catch (IllegalStateException e2) {
                                    Helium.onMediaRequest(j2, null, e2.getMessage());
                                    MethodCollector.o(4164);
                                    return;
                                }
                            } else {
                                LLog.a(5, "HeliumLynx", "Use Helium Camera");
                                try {
                                    stateCallback = (BaseCameraContext) Class.forName("com.he.lynx.player.HeliumCameraContext").getMethod("requestCamera", Integer.TYPE).invoke(null, Integer.valueOf(i2));
                                } catch (Throwable th) {
                                    LLog.a(5, "HeliumLynx", "No Helium Camera " + th.toString());
                                    Helium.onMediaRequest(j2, null, th.getMessage());
                                    MethodCollector.o(4164);
                                    return;
                                }
                            }
                            if (stateCallback != null) {
                                heliumApp.resumables.add(stateCallback);
                                Helium.onMediaRequest(j2, stateCallback);
                                MethodCollector.o(4164);
                                return;
                            }
                            Helium.onMediaRequest(j2, null, "unknown error");
                            MethodCollector.o(4164);
                        } catch (Throwable th2) {
                            LLog.a(5, "HeliumLynx", "No Helium Camera " + th2.toString());
                            Helium.onMediaRequest(j2, null, th2.getMessage());
                            MethodCollector.o(4164);
                        }
                    }
                }
            });
        }
    }

    private static byte[] encodeBitmap(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        Bitmap.CompressFormat compressFormat;
        MethodCollector.i(5289);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        if (i2 == 1) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else if (i2 == 2) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i3 * i4) / 4) + 256);
        if (createBitmap.compress(compressFormat, i5, byteArrayOutputStream)) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            MethodCollector.o(5289);
            return byteArray;
        }
        MethodCollector.o(5289);
        return null;
    }
}
