package com.bef.effectsdk.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.GLTextureView;
import com.bef.effectsdk.ResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.view.ViewControllerInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class BEFView extends GLTextureView implements GLSurfaceView.Renderer, MessageCenter.Listener, ViewControllerInterface.NativeMessageListener {
    protected String mAdBundlePath;
    private AssetResourceFinder mAssetResourceFinder;
    private long mAttachedEffect;
    protected Queue<Runnable> mCacheMessages;
    private boolean mDestroyed;
    protected long mHandle;
    private long mLastAttachedEffect;
    private long mLastTickInNanoSeconds;
    protected HashSet<MessageListener> mListeners;
    protected float[] mMatrix;
    private boolean mMultipleTouchEnabled;
    protected boolean mNativeInited;
    private Builder.Params mParams;
    protected int mSourceTexture;
    private int[] mTouch_ids;
    private float[] mTouch_xs;
    private float[] mTouch_ys;

    public interface MessageListener {
        static {
            Covode.recordClassIndex(2921);
        }

        void onMessageReceived(long j2, long j3, long j4, String str);
    }

    static {
        Covode.recordClassIndex(2902);
    }

    public static int com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
    }

    public static class Color {

        /* renamed from: a  reason: collision with root package name */
        private float f5996a;

        /* renamed from: b  reason: collision with root package name */
        private float f5997b;

        /* renamed from: g  reason: collision with root package name */
        private float f5998g;
        private float r;

        static {
            Covode.recordClassIndex(2919);
        }

        public float alpha() {
            return this.f5996a;
        }

        public float blue() {
            return this.f5997b;
        }

        public float green() {
            return this.f5998g;
        }

        public float red() {
            return this.r;
        }

        public Color() {
            setColor(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public Color(float f2, float f3, float f4, float f5) {
            setColor(f2, f3, f4, f5);
        }

        public void setColor(float f2, float f3, float f4, float f5) {
            this.r = f2;
            this.f5998g = f3;
            this.f5997b = f4;
            this.f5996a = f5;
        }
    }

    public static final class Builder {
        private Params mParams = new Params();

        static {
            Covode.recordClassIndex(2917);
        }

        private Builder() {
        }

        public static Builder obtain() {
            Builder builder = new Builder();
            builder.mParams.mRenderWidth = 720;
            builder.mParams.mRenderHeight = 1280;
            builder.mParams.mFPS = 30.0d;
            builder.mParams.mFitMode = FitMode.FILL_SCREEN;
            builder.mParams.mResourceFinder = null;
            builder.mParams.mSceneKey = BEFViewSceneKey.SHOOT;
            builder.mParams.mNeglectTouchEvent = false;
            return builder;
        }

        /* access modifiers changed from: package-private */
        public class Params {
            public double mFPS;
            public FitMode mFitMode;
            public boolean mNeglectTouchEvent;
            public int mRenderHeight;
            public int mRenderWidth;
            public ResourceFinder mResourceFinder;
            public BEFViewSceneKey mSceneKey;

            static {
                Covode.recordClassIndex(2918);
            }

            private Params() {
            }
        }

        public final Builder setFPS(double d2) {
            this.mParams.mFPS = d2;
            return this;
        }

        public final Builder setFitMode(FitMode fitMode) {
            this.mParams.mFitMode = fitMode;
            return this;
        }

        public final Builder setNeglectTouchEvent(boolean z) {
            this.mParams.mNeglectTouchEvent = z;
            return this;
        }

        public final Builder setResourceFinder(ResourceFinder resourceFinder) {
            this.mParams.mResourceFinder = resourceFinder;
            return this;
        }

        public final Builder setSceneKey(BEFViewSceneKey bEFViewSceneKey) {
            this.mParams.mSceneKey = bEFViewSceneKey;
            return this;
        }

        public final BEFView build(Context context) {
            BEFView bEFView = new BEFView(context);
            bEFView.setParams(this.mParams);
            return bEFView;
        }

        public final Builder setRenderSize(int i2, int i3) {
            this.mParams.mRenderWidth = i2;
            this.mParams.mRenderHeight = i3;
            return this;
        }

        public final BEFView build(Context context, AttributeSet attributeSet) {
            BEFView bEFView = new BEFView(context, attributeSet);
            bEFView.setParams(this.mParams);
            return bEFView;
        }
    }

    public synchronized boolean getNativeInited() {
        boolean z;
        MethodCollector.i(1349);
        z = this.mNativeInited;
        MethodCollector.o(1349);
        return z;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onDestroy() {
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "onDestroy start");
        if (this.mDestroyed) {
            com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_e("BEFView", "onDestroy Duplicate!");
            return;
        }
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass8 */

            static {
                Covode.recordClassIndex(2914);
            }

            public void run() {
                BEFView.this.destoryRender();
            }
        });
        super.onDestroy();
        this.mDestroyed = true;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onPause() {
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "onPause start");
        if (this.mDestroyed) {
            com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_e("BEFView", "onPause called after onDestroy!");
            return;
        }
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass6 */

            static {
                Covode.recordClassIndex(2912);
            }

            public void run() {
                BEFView.this.destoryRender();
            }
        });
        super.onPause();
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onResume() {
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "onResume start");
        if (this.mDestroyed) {
            com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_e("BEFView", "onResume called after onDestroy!");
            return;
        }
        super.onResume();
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass7 */

            static {
                Covode.recordClassIndex(2913);
            }

            public void run() {
                if (!BEFView.this.getNativeInited()) {
                    BEFView.this.initRender();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.view.BEFView$12  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass12 {
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 2906(0xb5a, float:4.072E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bef.effectsdk.view.BEFView$FitMode[] r0 = com.bef.effectsdk.view.BEFView.FitMode.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bef.effectsdk.view.BEFView.AnonymousClass12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode = r2
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.FIT_WIDTH     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bef.effectsdk.view.BEFView.AnonymousClass12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.FIT_HEIGHT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bef.effectsdk.view.BEFView.AnonymousClass12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.FILL_SCREEN     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bef.effectsdk.view.BEFView.AnonymousClass12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.NO_CLIP     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.view.BEFView.AnonymousClass12.<clinit>():void");
        }
    }

    public enum BEFViewSceneKey {
        SHOOT,
        LIVE,
        LIVE_OGC;

        static {
            Covode.recordClassIndex(2916);
        }
    }

    public enum FitMode {
        FIT_WIDTH,
        FIT_HEIGHT,
        FILL_SCREEN,
        FIT_WIDTH_BOTTOM,
        NO_CLIP;

        static {
            Covode.recordClassIndex(2920);
        }
    }

    public void destoryRender() {
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "destoryRender start");
        if (getNativeInited()) {
            com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "destoryRender do destroy");
            setNativeInited(false);
            if (this.mParams.mResourceFinder != null) {
                this.mParams.mResourceFinder.release(this.mHandle);
            }
            AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
            if (assetResourceFinder != null) {
                assetResourceFinder.release(0);
            }
            ViewControllerInterface.removeMessageListener(this.mHandle, this);
            ViewControllerInterface.destroy(this.mHandle);
            this.mHandle = 0;
            ViewControllerInterface.deleteTexture(this.mSourceTexture);
            this.mSourceTexture = 0;
            MessageCenter.removeListener(this);
            MessageCenter.destroy();
            this.mLastAttachedEffect = 0;
        }
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "destoryRender end");
    }

    public void initRender() {
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "initRender start");
        setNativeInited(false);
        long j2 = this.mHandle;
        if (j2 != 0) {
            try {
                ViewControllerInterface.destroy(j2);
                this.mHandle = 0;
            } catch (Exception unused) {
                com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_e("BEFView", "Destroy old effect handle failed");
            }
        }
        int i2 = this.mSourceTexture;
        if (i2 > 0) {
            ViewControllerInterface.deleteTexture(i2);
        }
        if (this.mHandle == 0) {
            long[] jArr = new long[2];
            ViewControllerInterface.createHandle(jArr, this.mParams.mSceneKey.ordinal());
            this.mHandle = jArr[0];
            if (this.mParams.mResourceFinder != null) {
                ViewControllerInterface.setResourceFinder(this.mHandle, this.mParams.mResourceFinder.createNativeResourceFinder(this.mHandle), 0);
            } else {
                ViewControllerInterface.setResourceFinder(this.mHandle, 0, 0);
            }
            ViewControllerInterface.init(this.mHandle, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        }
        ViewControllerInterface.addMessageListener(this.mHandle, this);
        MessageCenter.init();
        MessageCenter.addListener(this);
        this.mLastTickInNanoSeconds = System.nanoTime();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.mParams.mRenderWidth, this.mParams.mRenderHeight, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glViewport(0, 0, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        this.mSourceTexture = iArr[0];
        String str = this.mAdBundlePath;
        if (str != "") {
            ViewControllerInterface.setStickerPath(this.mHandle, str);
        }
        this.mLastAttachedEffect = 0;
        setNativeInited(true);
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "initRender end");
    }

    public void setParams(Builder.Params params) {
        this.mParams = params;
    }

    public synchronized void attachEffect(long j2) {
        MethodCollector.i(1321);
        this.mAttachedEffect = j2;
        MethodCollector.o(1321);
    }

    /* access modifiers changed from: protected */
    public synchronized void setNativeInited(boolean z) {
        MethodCollector.i(1350);
        this.mNativeInited = z;
        MethodCollector.o(1350);
    }

    public synchronized int addMessageListener(MessageListener messageListener) {
        MethodCollector.i(1352);
        if (messageListener == null) {
            MethodCollector.o(1352);
            return -1;
        }
        this.mListeners.add(messageListener);
        MethodCollector.o(1352);
        return 0;
    }

    public synchronized int removeMessageListener(MessageListener messageListener) {
        MethodCollector.i(1353);
        if (messageListener == null) {
            MethodCollector.o(1353);
            return -1;
        }
        this.mListeners.remove(messageListener);
        MethodCollector.o(1353);
        return 0;
    }

    public synchronized void setStickerPath(final String str) {
        MethodCollector.i(1351);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2903);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    BEFView.this.mAdBundlePath = str;
                    ViewControllerInterface.setStickerPath(BEFView.this.mHandle, str);
                }
            }
        });
        MethodCollector.o(1351);
    }

    private BEFView(Context context) {
        super(context);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    private void init(Context context) {
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        AssetResourceFinder assetResourceFinder = new AssetResourceFinder(context.getAssets(), "");
        this.mAssetResourceFinder = assetResourceFinder;
        assetResourceFinder.createNativeResourceFinder(0);
        this.mDestroyed = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r3 != 6) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.view.BEFView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onDrawFrame(GL10 gl10) {
        MethodCollector.i(1345);
        if (!getNativeInited()) {
            MethodCollector.o(1345);
            return;
        }
        if (this.mAttachedEffect != this.mLastAttachedEffect) {
            com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "attach new effectHandle");
            ViewControllerInterface.attachEffect(this.mHandle, this.mAttachedEffect);
            this.mLastAttachedEffect = this.mAttachedEffect;
        }
        long nanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
        double d2 = (1.0d / this.mParams.mFPS) * 1.0E9d;
        double d3 = (double) nanoTime;
        if (d3 < d2) {
            Double.isNaN(d3);
            try {
                Thread.sleep((long) (((d2 - d3) * 1.0d) / 1000000.0d));
            } catch (Exception unused) {
            }
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        while (!this.mCacheMessages.isEmpty()) {
            this.mCacheMessages.poll().run();
        }
        double nanoTime2 = (double) System.nanoTime();
        Double.isNaN(nanoTime2);
        double d4 = nanoTime2 / 1.0E9d;
        int width = getWidth();
        int height = getHeight();
        Matrix.setIdentityM(this.mMatrix, 0);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight);
        float f2 = (float) width;
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, (float) height);
        PointF fitResolution = fitResolution(new PointF(0.0f, 0.0f), rectF, rectF2, this.mParams.mFitMode);
        PointF fitResolution2 = fitResolution(new PointF((float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), rectF, rectF2, this.mParams.mFitMode);
        if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
            fitResolution = new PointF(0.0f, 0.0f);
            fitResolution2 = new PointF(f2, (float) ((this.mParams.mRenderHeight * width) / this.mParams.mRenderWidth));
        }
        ViewControllerInterface.processFrame(this.mHandle, this.mSourceTexture, this.mParams.mRenderWidth, this.mParams.mRenderHeight, this.mMatrix, new float[]{fitResolution.x, fitResolution.y, fitResolution2.x - fitResolution.x, fitResolution2.y - fitResolution.y}, d4);
        MethodCollector.o(1345);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d("BEFView", "onSurfaceCreated start");
        initRender();
    }

    public synchronized void setRenderCacheData(final String str, final String str2) {
        MethodCollector.i(1367);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass9 */

            static {
                Covode.recordClassIndex(2915);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheData(BEFView.this.mHandle, str, str2);
                }
            }
        });
        MethodCollector.o(1367);
    }

    public synchronized void setRenderCacheTexture(final String str, final String str2) {
        MethodCollector.i(1368);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass10 */

            static {
                Covode.recordClassIndex(2904);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTexture(BEFView.this.mHandle, str, str2);
                }
            }
        });
        MethodCollector.o(1368);
    }

    private BEFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    private void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i2) {
        PointF fitResolution;
        int width = getWidth();
        int height = getHeight();
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            float f3 = fArr2[i3];
            PointF pointF = new PointF(f2, f3);
            float f4 = (float) width;
            float f5 = (float) height;
            RectF rectF = new RectF(0.0f, 0.0f, f4, f5);
            new PointF();
            if (this.mParams.mFitMode == FitMode.FILL_SCREEN) {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), FitMode.NO_CLIP);
            } else if (this.mParams.mFitMode == FitMode.NO_CLIP) {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), FitMode.FILL_SCREEN);
            } else if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
                float f6 = ((f4 * 1.0f) / ((float) this.mParams.mRenderWidth)) * ((float) this.mParams.mRenderHeight);
                fArr[i3] = (f2 * 1.0f) / f4;
                fArr2[i3] = ((f3 - (f5 - f6)) * 1.0f) / f6;
            } else {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), this.mParams.mFitMode);
            }
            fArr[i3] = fitResolution.x / ((float) this.mParams.mRenderWidth);
            fArr2[i3] = fitResolution.y / ((float) this.mParams.mRenderHeight);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i2, int i3, int i4, String str) {
        postMessage((long) i2, (long) i3, (long) i4, str);
    }

    public synchronized int postMessage(final long j2, final long j3, final long j4, final String str) {
        MethodCollector.i(1354);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2907);
            }

            public void run() {
                BEFView.this.mCacheMessages.add(new Runnable() {
                    /* class com.bef.effectsdk.view.BEFView.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(2908);
                    }

                    public void run() {
                        ViewControllerInterface.postMessage(BEFView.this.mHandle, j2, j3, j4, str);
                    }
                });
            }
        });
        MethodCollector.o(1354);
        return 0;
    }

    public synchronized void setRenderCacheTextureWithBuffer(final String str, final byte[] bArr, final int i2, final int i3) {
        MethodCollector.i(1369);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass11 */

            static {
                Covode.recordClassIndex(2905);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTextureWithBuffer(BEFView.this.mHandle, str, bArr, i2, i3);
                }
            }
        });
        MethodCollector.o(1369);
    }

    @Override // com.bef.effectsdk.view.ViewControllerInterface.NativeMessageListener
    public synchronized int nativeOnMsgReceived(long j2, long j3, long j4, String str) {
        MethodCollector.i(1356);
        Iterator<MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(j2, j3, j4, str);
        }
        MethodCollector.o(1356);
        return 0;
    }

    private PointF fitResolution(PointF pointF, RectF rectF, RectF rectF2, FitMode fitMode) {
        PointF pointF2;
        while (true) {
            pointF2 = new PointF();
            float f2 = rectF2.left;
            float f3 = rectF2.top;
            float width = rectF2.width();
            float height = rectF2.height();
            float width2 = (pointF.x - rectF.left) / rectF.width();
            float height2 = (pointF.y - rectF.top) / rectF.height();
            int i2 = AnonymousClass12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[fitMode.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    float height3 = height / rectF.height();
                    pointF2.x = (float) ((int) (f2 + ((width - (rectF.width() * height3)) / 2.0f) + (width2 * height3 * rectF.width())));
                    pointF2.y = (float) ((int) (f3 + (height2 * height)));
                    break;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        break;
                    } else if (width / rectF.width() > height / rectF.height()) {
                        fitMode = FitMode.FIT_HEIGHT;
                    } else {
                        fitMode = FitMode.FIT_WIDTH;
                    }
                } else if (width / rectF.width() < height / rectF.height()) {
                    fitMode = FitMode.FIT_HEIGHT;
                } else {
                    fitMode = FitMode.FIT_WIDTH;
                }
            } else {
                float width3 = width / rectF.width();
                pointF2.x = (float) ((int) (f2 + (width2 * width)));
                pointF2.y = (float) ((int) (f3 + ((height - (rectF.height() * width3)) / 2.0f) + (height2 * width3 * rectF.height())));
                break;
            }
        }
        return pointF2;
    }
}
