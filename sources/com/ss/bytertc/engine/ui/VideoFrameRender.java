package com.ss.bytertc.engine.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureBufferImpl;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

public class VideoFrameRender implements View.OnLayoutChangeListener, EglRenderer.FirstVideoFrameRenderListener, RendererCommon.RendererEvents {
    private boolean enableFixedSize;
    private final VideoFrameConverter frameConverter;
    private volatile EglRenderer mEglRenderer;
    public final AtomicBoolean mEglSurfaceCreatedAtomic = new AtomicBoolean(false);
    private final Object mFirstFrameListenerLock = new Object();
    private final ArrayList<FirstVideoFrameRenderListener> mFirstVideoFrameListeners = new ArrayList<>();
    public final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    private boolean mHasReceivedFirstFrame;
    private final AtomicBoolean mHasRenderViewAtomic = new AtomicBoolean(false);
    private long mReceiveFirstTimeStamp;
    private final Object mRenderLock = new Object();
    private final String mRenderName;
    private volatile Surface mSurface;
    private final SurfaceLifecycleCallback mSurfaceLifecycleCallbackCallback;
    private volatile SurfaceView mSurfaceView;
    private final Object mTextureProcessLock = new Object();
    private Looper mTextureProcessLooper;
    private volatile TextureView mTextureView;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;

    public interface FirstVideoFrameRenderListener {
        static {
            Covode.recordClassIndex(101031);
        }

        void onFirstVideoFrameRender(int i2);
    }

    public interface SurfaceLifecycleCallback {
        static {
            Covode.recordClassIndex(101032);
        }

        void onCreated();

        void onDestroy();
    }

    static {
        Covode.recordClassIndex(101022);
    }

    static final /* synthetic */ void lambda$renderTextureFrame$2$VideoFrameRender() {
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    @Override // org.webrtc.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
        notifyFristRenderCallback();
    }

    public void release() {
        onDispose();
    }

    public void disableFpsReduction() {
        MethodCollector.i(9984);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.disableFpsReduction();
                }
            } finally {
                MethodCollector.o(9984);
            }
        }
    }

    private void initSurfaceView() {
        MethodCollector.i(8669);
        if (this.mSurfaceView == null || !this.mHasInitAtomic.get()) {
            MethodCollector.o(8669);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof SurfaceEglRender) {
                    ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
                    this.mSurfaceView.addOnLayoutChangeListener(this);
                }
            } finally {
                MethodCollector.o(8669);
            }
        }
    }

    private void notifyFristRenderCallback() {
        MethodCollector.i(10144);
        synchronized (this.mFirstFrameListenerLock) {
            try {
                if (!this.mFirstVideoFrameListeners.isEmpty()) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() - this.mReceiveFirstTimeStamp);
                    Iterator<FirstVideoFrameRenderListener> it = this.mFirstVideoFrameListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onFirstVideoFrameRender(currentTimeMillis);
                    }
                    MethodCollector.o(10144);
                }
            } finally {
                MethodCollector.o(10144);
            }
        }
    }

    public void onStart() {
        if (this.mHasRenderViewAtomic.get() && this.mHasInitAtomic.get()) {
            if (this.mTextureView != null) {
                initTextureView();
            } else if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    private void initTextureView() {
        MethodCollector.i(8924);
        if (this.mTextureView == null || this.mEglRenderer == null || !this.mHasInitAtomic.get()) {
            MethodCollector.o(8924);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof TextureEglRenderer) {
                    TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
                    textureEglRenderer.bind(this.mTextureView, this.mSurfaceLifecycleCallbackCallback);
                    if (this.mTextureView.isShown()) {
                        textureEglRenderer.setLayoutAspectRatio(((float) this.mTextureView.getMeasuredWidth()) / ((float) this.mTextureView.getMeasuredHeight()));
                    }
                    this.mTextureView.addOnLayoutChangeListener(this);
                }
            } finally {
                MethodCollector.o(8924);
            }
        }
    }

    public void onDispose() {
        MethodCollector.i(9121);
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            synchronized (this.mRenderLock) {
                try {
                    if (this.mEglRenderer != null) {
                        this.mEglRenderer.release();
                        this.mEglRenderer.createEglSurface((Surface) null);
                    }
                    if (this.mSurfaceView != null) {
                        this.mSurfaceView.removeOnLayoutChangeListener(this);
                    } else if (this.mTextureView != null) {
                        this.mTextureView.setSurfaceTextureListener(null);
                        this.mTextureView.removeOnLayoutChangeListener(this);
                    }
                    this.mEglSurfaceCreatedAtomic.set(false);
                } finally {
                    MethodCollector.o(9121);
                }
            }
            synchronized (this.mFirstFrameListenerLock) {
                try {
                    this.mFirstVideoFrameListeners.clear();
                } finally {
                    MethodCollector.o(9121);
                }
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Try to dispose an not initialized VideoFrameRender");
        MethodCollector.o(9121);
        throw illegalStateException;
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) this.mSurfaceView.getWidth()) / ((float) this.mSurfaceView.getHeight());
        int i2 = this.rotatedFrameWidth;
        int i3 = this.rotatedFrameHeight;
        if (((float) i2) / ((float) i3) > width) {
            i2 = (int) (((float) i3) * width);
        } else {
            i3 = (int) (((float) i2) / width);
        }
        int min = Math.min(this.mSurfaceView.getWidth(), i2);
        int min2 = Math.min(this.mSurfaceView.getHeight(), i3);
        LogUtil.d("VideoFrameRender", "updateSurfaceSize. Layout size: " + this.mSurfaceView.getWidth() + "x" + this.mSurfaceView.getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (min != this.surfaceWidth || min2 != this.surfaceHeight) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            this.mSurfaceView.getHolder().setFixedSize(min, min2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$init$0$VideoFrameRender(EglBase.Context context) {
        this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void setFpsReduction(float f2) {
        MethodCollector.i(9817);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setFpsReduction(f2);
                }
            } finally {
                MethodCollector.o(9817);
            }
        }
    }

    public void setFristVideoFrameRenderListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        MethodCollector.i(9987);
        synchronized (this.mFirstFrameListenerLock) {
            try {
                this.mFirstVideoFrameListeners.add(firstVideoFrameRenderListener);
            } finally {
                MethodCollector.o(9987);
            }
        }
    }

    public void setMirror(boolean z) {
        MethodCollector.i(9491);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setMirror(z);
                }
            } finally {
                MethodCollector.o(9491);
            }
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        MethodCollector.i(9645);
        synchronized (this.mTextureProcessLock) {
            try {
                this.mTextureProcessLooper = looper;
            } finally {
                MethodCollector.o(9645);
            }
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        MethodCollector.i(9490);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setRenderModel(scalingType);
                }
            } finally {
                MethodCollector.o(9490);
            }
        }
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        MethodCollector.i(9311);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglSurfaceCreatedAtomic.get() && this.mEglRenderer != null) {
                    if (!this.mHasReceivedFirstFrame) {
                        this.mReceiveFirstTimeStamp = System.currentTimeMillis();
                        this.mHasReceivedFirstFrame = true;
                    }
                    this.mEglRenderer.onFrame(videoFrame);
                    MethodCollector.o(9311);
                }
            } finally {
                MethodCollector.o(9311);
            }
        }
    }

    public void consumeVideoFrame(RTCVideoFrame rTCVideoFrame) {
        if (rTCVideoFrame != null) {
            if (rTCVideoFrame.format == 1) {
                renderI420Frame(rTCVideoFrame, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
            } else if (rTCVideoFrame.format == 10) {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(rTCVideoFrame.textureId, VideoFrame.TextureBuffer.Type.RGB, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.rotation, rTCVideoFrame.timestamp, rTCVideoFrame.transform, this.mTextureProcessLooper);
            }
        }
    }

    public void setRenderView(Surface surface) {
        MethodCollector.i(8665);
        if (this.mEglSurfaceCreatedAtomic.get() || surface == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            MethodCollector.o(8665);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                this.mSurface = surface;
                new EglRenderer(this.mRenderName).createEglSurface(surface);
            } catch (Throwable th) {
                MethodCollector.o(8665);
                throw th;
            }
        }
        this.mEglSurfaceCreatedAtomic.compareAndSet(false, true);
        MethodCollector.o(8665);
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
        this.frameConverter = new VideoFrameConverter(true);
        this.mSurfaceLifecycleCallbackCallback = new SurfaceLifecycleCallback() {
            /* class com.ss.bytertc.engine.ui.VideoFrameRender.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101028);
            }

            @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
            public void onCreated() {
                if (!VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(false, true)) {
                    LogUtil.e("VideoFrameRender", "Already has an another surface created.");
                }
            }

            @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
            public void onDestroy() {
                if (!VideoFrameRender.this.mHasInitAtomic.get()) {
                    VideoFrameRender.this.mEglSurfaceCreatedAtomic.set(false);
                } else if (!VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(true, false)) {
                    LogUtil.e("VideoFrameRender", "Already has an another surface destroyed.");
                }
            }
        };
    }

    public void init(EglBase.Context context) {
        MethodCollector.i(9124);
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            synchronized (this.mRenderLock) {
                try {
                    if (this.mSurfaceView != null || this.mSurface != null || this.mTextureView != null || this.mEglRenderer != null) {
                        this.rotatedFrameWidth = 0;
                        this.rotatedFrameHeight = 0;
                        if (this.mEglRenderer instanceof SurfaceEglRender) {
                            ThreadUtils.invokeAtFrontUninterruptibly(new Handler(Looper.getMainLooper()), new VideoFrameRender$$Lambda$0(this, context));
                        } else {
                            this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
                        }
                        MethodCollector.o(9124);
                    }
                } finally {
                    MethodCollector.o(9124);
                }
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already initialized");
            MethodCollector.o(9124);
            throw illegalStateException;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onFrameResolutionChanged$1$VideoFrameRender(int i2, int i3) {
        this.rotatedFrameWidth = i2;
        this.rotatedFrameHeight = i3;
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        MethodCollector.i(8662);
        if (this.mEglSurfaceCreatedAtomic.get() || surfaceView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            MethodCollector.o(8662);
            return;
        }
        this.mSurfaceView = surfaceView;
        synchronized (this.mRenderLock) {
            try {
                SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
                surfaceEglRender.setSurfaceHolderCallback(callback);
                surfaceEglRender.setSurfaceLifecycleLisenter(this.mSurfaceLifecycleCallbackCallback);
                this.mEglRenderer = surfaceEglRender;
                this.mEglRenderer.addFristFrameListener(this);
            } finally {
                MethodCollector.o(8662);
            }
        }
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        MethodCollector.i(8668);
        if (this.mEglSurfaceCreatedAtomic.get() || textureView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            MethodCollector.o(8668);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                this.mTextureView = textureView;
                TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
                textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
                this.mEglRenderer = textureEglRenderer;
                this.mEglRenderer.addFristFrameListener(this);
            } finally {
                MethodCollector.o(8668);
            }
        }
    }

    static final /* synthetic */ void lambda$createYUV$3$VideoFrameRender(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        MethodCollector.i(10315);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
        MethodCollector.o(10315);
    }

    static final /* synthetic */ void lambda$createYUV$4$VideoFrameRender(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        MethodCollector.i(10146);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
        MethodCollector.o(10146);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r5 != 0) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r5 == 180) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        postOrRun(new com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$1(r2, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        return;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrameResolutionChanged(int r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L_0x0006
            if (r5 != r0) goto L_0x0015
        L_0x0006:
            r1 = r3
            if (r5 == 0) goto L_0x000b
        L_0x0009:
            if (r5 != r0) goto L_0x000c
        L_0x000b:
            r3 = r4
        L_0x000c:
            com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$1 r0 = new com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$1
            r0.<init>(r2, r1, r3)
            r2.postOrRun(r0)
            return
        L_0x0015:
            r1 = r4
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.ui.VideoFrameRender.onFrameResolutionChanged(int, int, int):void");
    }

    private VideoFrame.Buffer createYUV(final RTCVideoFrame rTCVideoFrame, int i2, int i3) {
        if (rTCVideoFrame == null || rTCVideoFrame.buffer == null || rTCVideoFrame.buffer.remaining() <= 0) {
            return null;
        }
        int i4 = (i2 + 1) / 2;
        int i5 = (i2 * i3) + 0;
        int i6 = ((i3 + 1) / 2) * i4;
        int i7 = i5 + i6;
        rTCVideoFrame.buffer.position(0);
        rTCVideoFrame.buffer.limit(i5);
        ByteBuffer slice = rTCVideoFrame.buffer.slice();
        rTCVideoFrame.buffer.position(i5);
        rTCVideoFrame.buffer.limit(i7);
        ByteBuffer slice2 = rTCVideoFrame.buffer.slice();
        rTCVideoFrame.buffer.position(i7);
        rTCVideoFrame.buffer.limit(i7 + i6);
        ByteBuffer slice3 = rTCVideoFrame.buffer.slice();
        rTCVideoFrame.retain();
        if (this.mEglRenderer instanceof TextureEglRenderer) {
            return CountDownLatchI420Buffer.wrap(i2, i3, slice, i2, slice2, i4, slice3, i4, new Runnable() {
                /* class com.ss.bytertc.engine.ui.VideoFrameRender.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(101029);
                }

                public void run() {
                    rTCVideoFrame.release();
                }
            });
        }
        return JavaI420Buffer.wrap(i2, i3, slice, i2, slice2, i4, slice3, i4, new Runnable() {
            /* class com.ss.bytertc.engine.ui.VideoFrameRender.AnonymousClass3 */

            static {
                Covode.recordClassIndex(101030);
            }

            public void run() {
                rTCVideoFrame.release();
            }
        });
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i2, int i3) {
        MethodCollector.i(9644);
        if (bArr == null || bArr.length == 0) {
            MethodCollector.o(9644);
            return null;
        }
        int i4 = (i2 + 1) / 2;
        int i5 = i2 * i3;
        int i6 = ((i3 + 1) / 2) * i4;
        ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i5);
        ByteBuffer nativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i6);
        ByteBuffer nativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i6);
        nativeAllocateBuffer.put(bArr, 0, i5);
        nativeAllocateBuffer2.put(bArr, i5, i6);
        nativeAllocateBuffer3.put(bArr, i5 + i6, i6);
        nativeAllocateBuffer.position(0);
        nativeAllocateBuffer2.position(0);
        nativeAllocateBuffer3.position(0);
        if (this.mEglRenderer instanceof TextureEglRenderer) {
            CountDownLatchI420Buffer wrap = CountDownLatchI420Buffer.wrap(i2, i3, nativeAllocateBuffer, i2, nativeAllocateBuffer2, i4, nativeAllocateBuffer3, i4, new VideoFrameRender$$Lambda$3(nativeAllocateBuffer, nativeAllocateBuffer2, nativeAllocateBuffer3));
            MethodCollector.o(9644);
            return wrap;
        }
        JavaI420Buffer wrap2 = JavaI420Buffer.wrap(i2, i3, nativeAllocateBuffer, i2, nativeAllocateBuffer2, i4, nativeAllocateBuffer3, i4, new VideoFrameRender$$Lambda$4(nativeAllocateBuffer, nativeAllocateBuffer2, nativeAllocateBuffer3));
        MethodCollector.o(9644);
        return wrap2;
    }

    private void renderI420Frame(RTCVideoFrame rTCVideoFrame, int i2, int i3, int i4, long j2) {
        VideoFrame.Buffer createYUV;
        if (rTCVideoFrame != null && rTCVideoFrame.buffer != null) {
            if (rTCVideoFrame.buffer.isDirect()) {
                createYUV = createYUV(rTCVideoFrame, i2, i3);
            } else {
                createYUV = createYUV(rTCVideoFrame.buffer.array(), i2, i3);
            }
            if (createYUV != null) {
                VideoFrame videoFrame = new VideoFrame(createYUV, i4, j2);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer convertToJavaI420Buffer;
        if (byteBuffer != null && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i2, i3, true);
            } else {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i2, i3, false);
            }
            if (convertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(convertToJavaI420Buffer, i4, j2);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(byte[] bArr, int i2, int i3, int i4, long j2) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer convertToJavaI420Buffer;
        if (bArr != null && bArr.length > 0 && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i2, i3, true);
            } else {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i2, i3, false);
            }
            if (convertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(convertToJavaI420Buffer, i4, j2);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        if (i2 == 1) {
            renderI420Frame(bArr, i3, i4, i5, j2);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2, int i3, int i4, int i5, long j2) {
        if (i2 == 1) {
            renderI420Frame(byteBuffer, i3, i4, i5, j2);
        }
    }

    private void renderTextureFrame(int i2, VideoFrame.TextureBuffer.Type type, int i3, int i4, int i5, long j2, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i3, i4, type, i2, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), VideoFrameRender$$Lambda$2.$instance), i5, j2);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    public void consumeTextureFrame(int i2, ByteBuffer byteBuffer, int i3, int i4, int i5, int i6, long j2, float[] fArr) {
        MethodCollector.i(9640);
        if (i3 != 10) {
            MethodCollector.o(9640);
            return;
        }
        synchronized (this.mTextureProcessLock) {
            try {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(i2, VideoFrame.TextureBuffer.Type.RGB, i4, i5, i6, j2, fArr, this.mTextureProcessLooper);
            } finally {
                MethodCollector.o(9640);
            }
        }
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        MethodCollector.i(9638);
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setLayoutAspectRatio(((float) (i4 - i2)) / ((float) (i5 - i3)));
                }
                if (this.mSurfaceView != null) {
                    updateSurfaceSize();
                }
            } finally {
                MethodCollector.o(9638);
            }
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5, int i6, int i7, long j2, ByteBuffer byteBuffer) {
        renderI420Frame(this.frameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i2, i3, i4, i5, i6), i5, i6, i7, j2);
    }
}
