package com.he.lynx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.he.lynx.loader.MediaLoader;
import com.he.lynx.player.HeliumPlayerImpl;
import com.he.lynx.player.IHeliumPlayer;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.m;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

public final class HeliumApp {
    static ScriptErrorHandler fatalErrorHandler;
    static LoadSoInHostCallback loadSoInHostCallback;
    static ScriptErrorHandler uncaughtExceptionHandler;
    public ContextWrapper context;
    private final Delegate delegate = new Delegate();
    public final List<Drawable> drawables = new ArrayList(1);
    public WeakReference<LynxDelegate> lynxDelegate = null;
    private PlatformCameraFactory mPlatformCameraFactory;
    public MediaLoader mediaLoader = new MediaLoader() {
        /* class com.he.lynx.HeliumApp.AnonymousClass2 */

        static {
            Covode.recordClassIndex(34193);
        }

        @Override // com.he.lynx.loader.MediaLoader
        public Uri loadMedia(String str) {
            return Uri.parse(str);
        }

        @Override // com.he.lynx.loader.MediaLoader
        public void onRequest(MediaLoader.RequestParams requestParams, MediaLoader.Responder responder) {
            if (responder != null) {
                responder.onResponse(true);
            }
        }
    };
    private IHeliumPlayer.HeliumPlayerFactory playerFactory = new IHeliumPlayer.HeliumPlayerFactory() {
        /* class com.he.lynx.HeliumApp.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34192);
        }

        @Override // com.he.lynx.player.IHeliumPlayer.HeliumPlayerFactory
        public IHeliumPlayer create() {
            return new HeliumPlayerImpl();
        }
    };
    public long ptr;
    public Set<StateCallback> resumables = new CopyOnWriteArraySet();
    private BroadcastReceiver screenReceiver;

    public static class EffectResourceDownloadInfo {
        public String appId;
        public String hostUrl;

        static {
            Covode.recordClassIndex(34200);
        }
    }

    public interface LoadSoCallback {
        static {
            Covode.recordClassIndex(34201);
        }

        void complete(boolean z, String str);
    }

    public interface LoadSoInHostCallback {
        static {
            Covode.recordClassIndex(34202);
        }

        void loadSoInHost(String str, LoadSoCallback loadSoCallback);
    }

    public interface LynxDelegate {
        static {
            Covode.recordClassIndex(34203);
        }

        EffectResourceDownloadInfo effectResourceDownloadInfo();

        void runOnJsThread(Runnable runnable);
    }

    public interface PlatformCameraFactory {
        static {
            Covode.recordClassIndex(34204);
        }

        IPlatformCamera createPlatformCamera();
    }

    public interface ScriptErrorHandler {
        static {
            Covode.recordClassIndex(34205);
        }

        void handle(String str);
    }

    static {
        Covode.recordClassIndex(34191);
    }

    public final PlatformCameraFactory getPlatformCameraFactory() {
        return this.mPlatformCameraFactory;
    }

    public final IHeliumPlayer createPlayer() {
        return this.playerFactory.create();
    }

    public final EffectResourceDownloadInfo effectResourceDownloadInfo() {
        LynxDelegate lynxDelegate2 = this.lynxDelegate.get();
        if (lynxDelegate2 != null) {
            return lynxDelegate2.effectResourceDownloadInfo();
        }
        LLog.a(6, "HeliumApp", "effectResourceDownloadUrl delegate error ");
        return null;
    }

    public interface StateCallback {
        static {
            Covode.recordClassIndex(34206);
        }

        void pause(CallType callType);

        void resume(CallType callType);

        public enum CallType {
            SystemCall,
            JSBridge;

            static {
                Covode.recordClassIndex(34207);
            }
        }
    }

    public static boolean loadEffectInHost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        LoadSoInHostCallback loadSoInHostCallback2 = loadSoInHostCallback;
        if (loadSoInHostCallback2 != null) {
            loadSoInHostCallback2.loadSoInHost("libeffect.so", new LoadSoCallback() {
                /* class com.he.lynx.HeliumApp.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(34194);
                }

                @Override // com.he.lynx.HeliumApp.LoadSoCallback
                public final void complete(boolean z, String str) {
                    zArr[0] = z;
                    if (!z) {
                        LLog.a(6, "HeliumApp", "loadEffectInHost failed with msg : ".concat(String.valueOf(str)));
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                LLog.a(6, "HeliumApp", e2.getMessage());
            }
        }
        return zArr[0];
    }

    public final void cleanup() {
        MethodCollector.i(5880);
        this.delegate.destroyed = true;
        BroadcastReceiver broadcastReceiver = this.screenReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
            this.screenReceiver = null;
        }
        this.context = null;
        for (Drawable drawable : this.drawables) {
            if (drawable.view != null) {
                drawable.view.setOnTouchListener(null);
            }
            drawable.holder.removeCallback(this.delegate);
        }
        this.drawables.clear();
        this.resumables.clear();
        synchronized (this.delegate) {
            try {
                long j2 = this.ptr;
                if (j2 != 0) {
                    Helium.cleanup(j2);
                    this.ptr = 0;
                }
            } finally {
                MethodCollector.o(5880);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r2 = r4.resumables.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.next().pause(com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5897);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void pause() {
        /*
            r4 = this;
            r3 = 5897(0x1709, float:8.263E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L_0x000f
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x000f:
            com.he.lynx.HeliumApp$Delegate r2 = r4.delegate
            monitor-enter(r2)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.destroyed     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x001e
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.paused     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0023:
            com.he.lynx.HeliumApp$Delegate r1 = r4.delegate
            r0 = 1
            r1.paused = r0
            long r0 = r4.ptr
            com.he.lynx.Helium.onPause(r0)
            monitor-exit(r2)
            java.util.Set<com.he.lynx.HeliumApp$StateCallback> r0 = r4.resumables
            java.util.Iterator r2 = r0.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            com.he.lynx.HeliumApp$StateCallback r1 = (com.he.lynx.HeliumApp.StateCallback) r1
            com.he.lynx.HeliumApp$StateCallback$CallType r0 = com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall
            r1.pause(r0)
            goto L_0x0034
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.HeliumApp.pause():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r2 = r4.resumables.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.next().resume(com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5966);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resume() {
        /*
            r4 = this;
            r3 = 5966(0x174e, float:8.36E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L_0x000f
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x000f:
            com.he.lynx.HeliumApp$Delegate r2 = r4.delegate
            monitor-enter(r2)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.destroyed     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x001e
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.paused     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0023
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0023:
            com.he.lynx.HeliumApp$Delegate r1 = r4.delegate
            r0 = 0
            r1.paused = r0
            long r0 = r4.ptr
            com.he.lynx.Helium.onResume(r0)
            monitor-exit(r2)
            java.util.Set<com.he.lynx.HeliumApp$StateCallback> r0 = r4.resumables
            java.util.Iterator r2 = r0.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            com.he.lynx.HeliumApp$StateCallback r1 = (com.he.lynx.HeliumApp.StateCallback) r1
            com.he.lynx.HeliumApp$StateCallback$CallType r0 = com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall
            r1.resume(r0)
            goto L_0x0034
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.HeliumApp.resume():void");
    }

    public static void setFatalErrorHandler(ScriptErrorHandler scriptErrorHandler) {
        fatalErrorHandler = scriptErrorHandler;
    }

    public static void setLoadSoInHostCallback(LoadSoInHostCallback loadSoInHostCallback2) {
        loadSoInHostCallback = loadSoInHostCallback2;
    }

    public static void setUncaughtExceptionHandler(ScriptErrorHandler scriptErrorHandler) {
        uncaughtExceptionHandler = scriptErrorHandler;
    }

    public final void setHeliumPlayerFactory(IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory) {
        this.playerFactory = heliumPlayerFactory;
    }

    public final void setPlatformCameraFactory(PlatformCameraFactory platformCameraFactory) {
        this.mPlatformCameraFactory = platformCameraFactory;
    }

    /* access modifiers changed from: package-private */
    public class Delegate implements SurfaceHolder.Callback, View.OnTouchListener {
        public boolean destroyed;
        public boolean paused;

        static {
            Covode.recordClassIndex(34199);
        }

        Delegate() {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            MethodCollector.i(3671);
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceCreated(HeliumApp.this.ptr, findSurface, surfaceHolder.getSurface());
            }
            MethodCollector.o(3671);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            MethodCollector.i(3674);
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceDestroyed(HeliumApp.this.ptr, findSurface);
            }
            MethodCollector.o(3674);
        }

        private long findSurface(SurfaceHolder surfaceHolder) {
            for (int i2 = 0; i2 < HeliumApp.this.drawables.size(); i2++) {
                Drawable drawable = HeliumApp.this.drawables.get(i2);
                if (drawable.holder == surfaceHolder) {
                    return drawable.ptr;
                }
            }
            return 0;
        }

        public final void doFrame(long j2) {
            MethodCollector.i(3689);
            if (this.destroyed || this.paused) {
                MethodCollector.o(3689);
                return;
            }
            if (HeliumApp.this.ptr != 0) {
                Helium.doFrame(HeliumApp.this.ptr);
            }
            MethodCollector.o(3689);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            for (int i2 = 0; i2 < HeliumApp.this.drawables.size(); i2++) {
                Drawable drawable = HeliumApp.this.drawables.get(i2);
                if (drawable.view == view) {
                    HeliumApp.this.dispatch(drawable, motionEvent);
                }
            }
            return true;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            MethodCollector.i(3672);
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceChanged(HeliumApp.this.ptr, findSurface, i3, i4);
            }
            MethodCollector.o(3672);
        }
    }

    public final void doFrame(long j2) {
        this.delegate.doFrame(j2);
    }

    public final Drawable addView(SurfaceView surfaceView) {
        return addView(surfaceView, surfaceView.getHolder());
    }

    private Surface getSurface(SurfaceHolder surfaceHolder) {
        MethodCollector.i(5810);
        Surface surface = surfaceHolder.getSurface();
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException unused) {
            }
            surface = surfaceHolder.getSurface();
        }
        MethodCollector.o(5810);
        return surface;
    }

    public final void dispatchToJSThread(Runnable runnable) {
        LynxDelegate lynxDelegate2;
        if (runnable != null && (lynxDelegate2 = this.lynxDelegate.get()) != null) {
            lynxDelegate2.runOnJsThread(runnable);
        }
    }

    public final Drawable addView(TextureView textureView) {
        if (Build.VERSION.SDK_INT >= 24 && this.screenReceiver == null) {
            this.screenReceiver = new BroadcastReceiver() {
                /* class com.he.lynx.HeliumApp.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(34195);
                }

                public void onReceive(Context context, Intent intent) {
                    HeliumApp.this.dispatchToJSThread(new Runnable() {
                        /* class com.he.lynx.HeliumApp.AnonymousClass4.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(34196);
                        }

                        public void run() {
                            for (Drawable drawable : HeliumApp.this.drawables) {
                                final View view = drawable.view;
                                m.a(new Runnable() {
                                    /* class com.he.lynx.HeliumApp.AnonymousClass4.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(34197);
                                    }

                                    public void run() {
                                        View view = view;
                                        if (view != null && (view instanceof TextureView) && view.getVisibility() == 0) {
                                            view.setVisibility(4);
                                            view.setVisibility(0);
                                            view.invalidate();
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            com_he_lynx_HeliumApp_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(this.context, this.screenReceiver, intentFilter);
        }
        return addView(textureView, new TextureViewHolder(textureView));
    }

    public final void removeView(Drawable drawable) {
        MethodCollector.i(5870);
        this.drawables.remove(drawable);
        if (drawable.view instanceof TextureView) {
            Helium.onSurfaceDestroyed(this.ptr, drawable.ptr);
        }
        if (drawable.holder != null) {
            drawable.holder.removeCallback(this.delegate);
        }
        if (drawable.view != null) {
            drawable.view.setOnTouchListener(null);
        }
        MethodCollector.o(5870);
    }

    public final Drawable addSurfaceHolder(SurfaceHolder surfaceHolder) {
        MethodCollector.i(5818);
        if (surfaceHolder == null) {
            MethodCollector.o(5818);
            return null;
        }
        Surface surface = getSurface(surfaceHolder);
        if (surface != null) {
            long j2 = this.ptr;
            if (j2 != 0) {
                long addView = Helium.addView(j2, surface);
                if (addView != 0) {
                    Drawable createDrawable = createDrawable(addView, null, surfaceHolder);
                    MethodCollector.o(5818);
                    return createDrawable;
                }
                RuntimeException runtimeException = new RuntimeException("failed to create EGLSurface");
                MethodCollector.o(5818);
                throw runtimeException;
            }
            RuntimeException runtimeException2 = new RuntimeException("heliumAppPtr is null");
            MethodCollector.o(5818);
            throw runtimeException2;
        }
        RuntimeException runtimeException3 = new RuntimeException("surface is null");
        MethodCollector.o(5818);
        throw runtimeException3;
    }

    public HeliumApp(ContextWrapper contextWrapper, LynxDelegate lynxDelegate2) {
        this.context = contextWrapper;
        this.lynxDelegate = new WeakReference<>(lynxDelegate2);
    }

    public static boolean setHostSensitivePermissionStatus(String str, boolean z) {
        MethodCollector.i(5721);
        if (str != null) {
            if (str.equals("camera")) {
                Helium.setSensitivePermissionStatus(0, z);
                Helium.cameraPermission = z;
                MethodCollector.o(5721);
                return true;
            } else if (str.equals("record")) {
                Helium.setSensitivePermissionStatus(1, z);
                MethodCollector.o(5721);
                return true;
            }
        }
        MethodCollector.o(5721);
        return false;
    }

    private Drawable addView(View view, SurfaceHolder surfaceHolder) {
        MethodCollector.i(5861);
        Surface surface = getSurface(surfaceHolder);
        if (surface != null) {
            long j2 = this.ptr;
            if (j2 != 0) {
                long addView = Helium.addView(j2, surface);
                if (addView != 0) {
                    Drawable createDrawable = createDrawable(addView, view, surfaceHolder);
                    MethodCollector.o(5861);
                    return createDrawable;
                }
                RuntimeException runtimeException = new RuntimeException("failed to create EGLSurface");
                MethodCollector.o(5861);
                throw runtimeException;
            }
            RuntimeException runtimeException2 = new RuntimeException("heliumAppPtr is null");
            MethodCollector.o(5861);
            throw runtimeException2;
        }
        RuntimeException runtimeException3 = new RuntimeException("surface is null");
        MethodCollector.o(5861);
        throw runtimeException3;
    }

    public final void dispatch(Drawable drawable, MotionEvent motionEvent) {
        LynxDelegate lynxDelegate2 = this.lynxDelegate.get();
        if (lynxDelegate2 != null) {
            int actionIndex = motionEvent.getActionIndex();
            int i2 = 5;
            if (actionIndex < 5) {
                int pointerCount = motionEvent.getPointerCount();
                if (pointerCount <= 5) {
                    i2 = pointerCount;
                }
                final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(112);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                allocateDirect.clear();
                allocateDirect.put((byte) 1).put((byte) motionEvent.getActionMasked()).put((byte) i2).put((byte) actionIndex);
                float rawX = motionEvent.getRawX() - motionEvent.getX();
                float rawY = motionEvent.getRawY() - motionEvent.getY();
                for (int i3 = 0; i3 < i2; i3++) {
                    allocateDirect.putInt(motionEvent.getPointerId(i3)).putFloat(motionEvent.getX(i3)).putFloat(motionEvent.getY(i3)).putFloat(motionEvent.getX(i3) + rawX).putFloat(motionEvent.getY(i3) + rawY);
                }
                allocateDirect.putLong(104, drawable.ptr);
                lynxDelegate2.runOnJsThread(new Runnable() {
                    /* class com.he.lynx.HeliumApp.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(34198);
                    }

                    public void run() {
                        MethodCollector.i(5525);
                        Helium.dispatch(HeliumApp.this.ptr, allocateDirect);
                        MethodCollector.o(5525);
                    }
                });
            }
        }
    }

    public static Intent com_he_lynx_HeliumApp_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextWrapper contextWrapper, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return contextWrapper.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    private Drawable createDrawable(long j2, View view, SurfaceHolder surfaceHolder) {
        Drawable drawable = new Drawable(j2, view, surfaceHolder);
        this.drawables.add(drawable);
        if (view != null) {
            view.setOnTouchListener(this.delegate);
        }
        surfaceHolder.addCallback(this.delegate);
        return drawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent com_he_lynx_HeliumApp_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.ContextWrapper r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_he_lynx_HeliumApp_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.HeliumApp.com_he_lynx_HeliumApp_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.ContextWrapper, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
