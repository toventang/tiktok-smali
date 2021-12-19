package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.GlClearWorkaround;
import org.webrtc.RendererCommon;

public class EglRenderer implements VideoSink {
    private static GlClearWorkaround.WORKAROUND_STATUS enableGLWorkaround = GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown;
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private final Matrix drawMatrix = new Matrix();
    private RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    private final Object firstRenderLock = new Object();
    private final ArrayList<FirstVideoFrameRenderListener> firstVideoFrameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object frameLock = new Object();
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final GlClearWorkaround glClearWorkaround = new GlClearWorkaround();
    public final Object handlerLock = new Object();
    private boolean haveRenderFirstVideoFrame;
    private float layoutAspectRatio;
    private final Object layoutLock = new Object();
    public final Runnable logStatisticsRunnable = new Runnable() {
        /* class org.webrtc.EglRenderer.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106574);
        }

        public void run() {
            MethodCollector.i(11035);
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                try {
                    if (EglRenderer.this.renderThreadHandler != null) {
                        EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                        EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                    }
                } finally {
                    MethodCollector.o(11035);
                }
            }
        }
    };
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private volatile RendererCommon.ScalingType renderModel = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    private long renderSwapBufferTimeNs;
    public Handler renderThreadHandler;
    private long renderTimeNs;
    private final Object statisticsLock = new Object();
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;

    public interface FirstVideoFrameRenderListener {
        static {
            Covode.recordClassIndex(106578);
        }

        void onFirstVideoFrameRender();
    }

    public interface FrameListener {
        static {
            Covode.recordClassIndex(106579);
        }

        void onFrame(Bitmap bitmap);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    static {
        Covode.recordClassIndex(106565);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.EglRenderer$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 106576(0x1a050, float:1.49345E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.RendererCommon$ScalingType[] r0 = org.webrtc.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.EglRenderer.AnonymousClass3.$SwitchMap$org$webrtc$RendererCommon$ScalingType = r2
                org.webrtc.RendererCommon$ScalingType r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.EglRenderer.AnonymousClass3.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.RendererCommon$ScalingType r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.webrtc.EglRenderer.AnonymousClass3.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x002e }
                org.webrtc.RendererCommon$ScalingType r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.AnonymousClass3.<clinit>():void");
        }
    }

    private void notifyFristRenderCallback() {
        MethodCollector.i(8536);
        synchronized (this.firstRenderLock) {
            try {
                Iterator<FirstVideoFrameRenderListener> it = this.firstVideoFrameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFirstVideoFrameRender();
                }
            } finally {
                MethodCollector.o(8536);
            }
        }
    }

    public void printStackTrace() {
        Thread thread;
        MethodCollector.i(8022);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (!(handler == null || (thread = handler.getLooper().getThread()) == null)) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
                MethodCollector.o(8022);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        static {
            Covode.recordClassIndex(106577);
        }

        public synchronized void run() {
            MethodCollector.i(9465);
            if (!(this.surface == null || EglRenderer.this.eglBase == null || EglRenderer.this.eglBase.hasSurface())) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Invalid surface: " + this.surface);
                    MethodCollector.o(9465);
                    throw illegalStateException;
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
            MethodCollector.o(9465);
        }

        private EglSurfaceCreation() {
        }

        public synchronized void setSurface(Object obj) {
            MethodCollector.i(9462);
            this.surface = obj;
            MethodCollector.o(9462);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        org.webrtc.ThreadUtils.awaitUninterruptibly(r4);
        r1 = r6.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r6.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r0.release();
        r6.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        logD("Releasing done.");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7959);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7959);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void logStatistics() {
        MethodCollector.i(8854);
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j2 = nanoTime - this.statisticsStartTimeNs;
                if (j2 > 0) {
                    logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j2) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format((double) (((float) (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1))) / ((float) j2))) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                    resetStatistics(nanoTime);
                    MethodCollector.o(8854);
                }
            } finally {
                MethodCollector.o(8854);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = r28.eglBase;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r0 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0.hasSurface() != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        logD("Dropping frame - No surface");
        r2.release();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8362);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r8 = r28.fpsReductionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = r28.minRenderPeriodNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r4 != Long.MAX_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r4 > 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r4 = java.lang.System.nanoTime();
        r0 = r28.nextFrameTimeNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r4 >= r0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        logD("Skipping frame rendering - fps reduction is active.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r0 = r0 + r28.minRenderPeriodNs;
        r28.nextFrameTimeNs = r0;
        r28.nextFrameTimeNs = java.lang.Math.max(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r13 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r2.getRotatedHeight() > 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8362);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        r8 = ((float) r2.getRotatedWidth()) / ((float) r2.getRotatedHeight());
        r1 = r28.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r9 = r28.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r9 == 0.0f) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r5 = r28.eglBase.surfaceWidth();
        r1 = r28.eglBase.surfaceHeight();
        r0 = org.webrtc.EglRenderer.AnonymousClass3.$SwitchMap$org$webrtc$RendererCommon$ScalingType[r28.renderModel.ordinal()];
        r6 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        if (r0 == 1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r0 == 2) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        if (r8 <= r9) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ac, code lost:
        r9 = r9 / r8;
        r8 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00af, code lost:
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b1, code lost:
        r25 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b3, code lost:
        r28.drawMatrix.reset();
        r28.drawMatrix.preTranslate(0.5f, 0.5f);
        r10 = r28.drawMatrix;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (r28.mirrorHorizontally == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        r7 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        if (r28.mirrorVertically == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cd, code lost:
        r6 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cf, code lost:
        r10.preScale(r7, r6);
        r28.drawMatrix.preScale(r9, r8);
        r28.drawMatrix.preTranslate(-0.5f, -0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        if (r4 == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e0, code lost:
        glClear(r28.eglBase.surfaceWidth(), r28.eglBase.surfaceHeight(), 16384, 0.0f, 0.0f, 0.0f, 0.0f);
        r7 = true;
        r28.frameDrawer.drawFrame(r2, r28.drawer, r28.drawMatrix, r24, r25, r5, r1);
        r11 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        if (r28.usePresentationTimeStamp == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
        r28.eglBase.swapBuffers(r2.getTimestampNs());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0122, code lost:
        r9 = java.lang.System.nanoTime();
        r8 = r28.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0128, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012a, code lost:
        r28.eglBase.swapBuffers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0130, code lost:
        r7 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0133, code lost:
        r8 = r8 / r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0135, code lost:
        r8 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0137, code lost:
        r9 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013d, code lost:
        if (r8 <= r9) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013f, code lost:
        r1 = (int) (((float) r28.eglBase.surfaceWidth()) / r8);
        r25 = (r28.eglBase.surfaceHeight() - r1) / 2;
        r8 = 1.0f;
        r9 = 1.0f;
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015a, code lost:
        r5 = (int) (((float) r28.eglBase.surfaceHeight()) * r8);
        r24 = (r28.eglBase.surfaceWidth() - r5) / 2;
        r8 = 1.0f;
        r9 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r28.framesRendered++;
        r28.renderTimeNs += r9 - r13;
        r28.renderSwapBufferTimeNs += r9 - r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0185, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0187, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018d, code lost:
        r4 = false;
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018f, code lost:
        notifyCallbacks(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0194, code lost:
        if (r28.haveRenderFirstVideoFrame != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0196, code lost:
        notifyFristRenderCallback();
        r28.haveRenderFirstVideoFrame = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019b, code lost:
        r2.release();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8362);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a4, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8362);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8362);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ad, code lost:
        throw r0;
     */
    /* renamed from: renderFrameOnRenderThread */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bridge$lambda$0$EglRenderer() {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.bridge$lambda$0$EglRenderer():void");
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void setRenderModel(RendererCommon.ScalingType scalingType) {
        this.renderModel = scalingType;
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$release$2$EglRenderer(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$releaseEglSurface$5$EglRenderer(Runnable runnable) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null) {
            eglBase2.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        static {
            Covode.recordClassIndex(106581);
        }

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e2) {
                Logging.e("EglRenderer", "Exception on EglRenderer thread", e2);
                this.exceptionCallback.run();
                throw e2;
            }
        }

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }
    }

    private void logD(String str) {
        Logging.i("EglRenderer", this.name + str);
    }

    private void logW(String str) {
        Logging.w("EglRenderer", this.name + str);
    }

    private void postToRenderThread(Runnable runnable) {
        MethodCollector.i(8345);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } finally {
                MethodCollector.o(8345);
            }
        }
    }

    public void addFristFrameListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        MethodCollector.i(8321);
        synchronized (this.firstRenderLock) {
            try {
                this.firstVideoFrameListeners.add(firstVideoFrameRenderListener);
            } finally {
                MethodCollector.o(8321);
            }
        }
    }

    private void resetStatistics(long j2) {
        MethodCollector.i(8017);
        synchronized (this.statisticsLock) {
            try {
                this.statisticsStartTimeNs = j2;
                this.framesReceived = 0;
                this.framesDropped = 0;
                this.framesRendered = 0;
                this.renderTimeNs = 0;
                this.renderSwapBufferTimeNs = 0;
            } finally {
                MethodCollector.o(8017);
            }
        }
    }

    public void releaseEglSurface(Runnable runnable) {
        MethodCollector.i(8343);
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.renderThreadHandler.postAtFrontOfQueue(new EglRenderer$$Lambda$6(this, runnable));
                    return;
                }
                runnable.run();
                MethodCollector.o(8343);
            } finally {
                MethodCollector.o(8343);
            }
        }
    }

    public void setLayoutAspectRatio(float f2) {
        MethodCollector.i(8300);
        logD("setLayoutAspectRatio: ".concat(String.valueOf(f2)));
        synchronized (this.layoutLock) {
            try {
                this.layoutAspectRatio = f2;
            } finally {
                MethodCollector.o(8300);
            }
        }
    }

    public void setMirror(boolean z) {
        MethodCollector.i(8131);
        logD("setMirrorHorizontally: ".concat(String.valueOf(z)));
        synchronized (this.layoutLock) {
            try {
                this.mirrorHorizontally = z;
            } finally {
                MethodCollector.o(8131);
            }
        }
    }

    public void setMirrorVertically(boolean z) {
        MethodCollector.i(8253);
        logD("setMirrorVertically: ".concat(String.valueOf(z)));
        synchronized (this.layoutLock) {
            try {
                this.mirrorVertically = z;
            } finally {
                MethodCollector.o(8253);
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
        this.haveRenderFirstVideoFrame = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$release$1$EglRenderer(CountDownLatch countDownLatch) {
        MethodCollector.i(8863);
        this.glClearWorkaround.release();
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        synchronized (this.firstRenderLock) {
            try {
                this.firstVideoFrameListeners.clear();
            } catch (Throwable th) {
                MethodCollector.o(8863);
                throw th;
            }
        }
        countDownLatch.countDown();
        MethodCollector.o(8863);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r2 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r1 = r7.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0050, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8340);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8340);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        return;
     */
    @Override // org.webrtc.VideoSink
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r8) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void removeFrameListener(FrameListener frameListener) {
        MethodCollector.i(8326);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler != null) {
                    if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                        postToRenderThread(new EglRenderer$$Lambda$4(this, countDownLatch, frameListener));
                        ThreadUtils.awaitUninterruptibly(countDownLatch);
                        MethodCollector.o(8326);
                        return;
                    }
                    RuntimeException runtimeException = new RuntimeException("removeFrameListener must not be called on the render thread.");
                    MethodCollector.o(8326);
                    throw runtimeException;
                }
            } finally {
                MethodCollector.o(8326);
            }
        }
    }

    public void setFpsReduction(float f2) {
        MethodCollector.i(8304);
        logD("setFpsReduction: ".concat(String.valueOf(f2)));
        synchronized (this.fpsReductionLock) {
            try {
                long j2 = this.minRenderPeriodNs;
                if (f2 <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f2);
                }
                if (this.minRenderPeriodNs != j2) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } finally {
                MethodCollector.o(8304);
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f2) {
        addFrameListener(frameListener, f2, null, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$init$0$EglRenderer(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = EglBase$$CC.createEgl10$$STATIC$$(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = EglBase$$CC.create$$STATIC$$(context, iArr);
        }
        this.glClearWorkaround.init();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$removeFrameListener$4$EglRenderer(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private String averageTimeAsString(long j2, int i2) {
        if (i2 <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j2 / ((long) i2)) + " us";
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f2;
        float f3;
        MethodCollector.i(8372);
        if (this.frameListeners.isEmpty()) {
            MethodCollector.o(8372);
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        Matrix matrix = this.drawMatrix;
        if (this.mirrorHorizontally) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        if (this.mirrorVertically) {
            f3 = -1.0f;
        } else {
            f3 = 1.0f;
        }
        matrix.preScale(f2, f3);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * ((float) videoFrame.getRotatedWidth()));
                int rotatedHeight = (int) (next.scale * ((float) videoFrame.getRotatedHeight()));
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    glClear(rotatedWidth, rotatedHeight, 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.listener.onFrame(createBitmap);
                }
            }
        }
        MethodCollector.o(8372);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f2, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f2, glDrawer, false);
    }

    /* access modifiers changed from: package-private */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        static {
            Covode.recordClassIndex(106580);
        }

        public FrameListenerAndParams(FrameListener frameListener, float f2, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f2;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$addFrameListener$3$EglRenderer(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f2, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f2, glDrawer, z));
    }

    public void addFrameListener(FrameListener frameListener, float f2, RendererCommon.GlDrawer glDrawer, boolean z) {
        postToRenderThread(new EglRenderer$$Lambda$3(this, glDrawer, frameListener, f2, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$6$EglRenderer(float f2, float f3, float f4, float f5) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasSurface()) {
            logD("clearSurface");
            glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, f2, f3, f4, f5);
            this.eglBase.swapBuffers();
        }
    }

    public void clearImage(float f2, float f3, float f4, float f5) {
        MethodCollector.i(8350);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.postAtFrontOfQueue(new EglRenderer$$Lambda$7(this, f2, f3, f4, f5));
                    MethodCollector.o(8350);
                }
            } finally {
                MethodCollector.o(8350);
            }
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        MethodCollector.i(7880);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Initializing EglRenderer");
                    this.drawer = glDrawer;
                    this.usePresentationTimeStamp = z;
                    HandlerThread handlerThread = new HandlerThread(this.name + "EglRenderer");
                    handlerThread.start();
                    HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() {
                        /* class org.webrtc.EglRenderer.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(106575);
                        }

                        public void run() {
                            MethodCollector.i(10862);
                            synchronized (EglRenderer.this.handlerLock) {
                                try {
                                    EglRenderer.this.renderThreadHandler = null;
                                } finally {
                                    MethodCollector.o(10862);
                                }
                            }
                        }
                    });
                    this.renderThreadHandler = handlerWithExceptionCallback;
                    ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new EglRenderer$$Lambda$0(this, context, iArr));
                    this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                    resetStatistics(System.nanoTime());
                    this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(this.name + "Already initialized");
                    MethodCollector.o(7880);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.o(7880);
            }
        }
    }

    private void glClear(int i2, int i3, int i4, float f2, float f3, float f4, float f5) {
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown) {
            enableGLWorkaround = GlClearWorkaround.isNeedWorkaround();
        }
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusEnable) {
            this.glClearWorkaround.clear(i2, i3, i4, f2, f3, f4, f5, 1.0f, 8);
            return;
        }
        GLES20.glClearColor(f2, f3, f4, f5);
        GLES20.glClear(16384);
    }
}
