package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Printer;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.k.b;
import com.ss.android.ttvecamera.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public enum k {
    INSTANCE;
    
    public PrivacyCert cachedClosePrivacyCert = null;
    public PrivacyCert cachedOpenPrivacyCert = null;
    public long mBeginTime = 0;
    public TECameraCapture mCameraClient;
    public final ConditionVariable mCameraClientCondition = new ConditionVariable();
    private int mCameraCloseTaskHandlerId = -1;
    public g.a mCameraEvent = new g.a() {
        /* class com.ss.android.ttvecamera.k.AnonymousClass43 */

        static {
            Covode.recordClassIndex(37959);
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void b(String str) {
            o.a("TECameraServer", "stopCapture success!");
            a(4, 0, str);
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void a(g gVar) {
            MethodCollector.i(2189);
            o.a("TECameraServer", "onCameraClosed, CameraState = " + k.this.mCurrentCameraState);
            if (gVar == k.this.mCameraInstance) {
                synchronized (k.this.mStateLock) {
                    try {
                        k.this.updateCameraState(0);
                    } finally {
                        MethodCollector.o(2189);
                    }
                }
                k.this.mCameraObserver.onCaptureStopped(0);
            }
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void a(String str) {
            o.a("TECameraServer", "startCapture success!");
            k.this.mStartPreviewError = false;
            int i2 = k.this.mCameraSettings.v - k.this.mCameraInstance.y;
            a(0, i2, str + ", Retry preview times = " + i2);
            j.a("te_record_camera_preview_ret", 0L);
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void c(int i2, String str) {
            String str2;
            StringBuilder append = new StringBuilder("onTorchSuccess ").append(str);
            if (i2 == 0) {
                str2 = " close";
            } else {
                str2 = " open";
            }
            o.a("TECameraServer", append.append(str2).toString());
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void d(int i2, String str) {
            String str2;
            StringBuilder append = new StringBuilder("onTorchError ").append(str);
            if (i2 == 0) {
                str2 = " close";
            } else {
                str2 = " open";
            }
            o.a("TECameraServer", append.append(str2).toString());
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void a(int i2, String str) {
            o.d("TECameraServer", "onCameraError: code = " + i2 + ", msg = " + str);
            k.this.mCameraObserver.onError(i2, "Open camera failed @" + k.this.mCameraSettings.f61800c + ",face:" + k.this.mCameraSettings.f61802e + " " + k.this.mCameraSettings.p.toString() + " " + str);
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void b(int i2, String str) {
            MethodCollector.i(2198);
            if (!k.this.mCameraSettings.ae || i2 != -437) {
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCameraInstance == null || k.this.mCameraInstance.y <= 0) {
                            a(i2, str);
                            j.a("te_record_camera_preview_ret", (long) i2);
                        } else {
                            k.this.mStartPreviewError = true;
                            o.c("TECameraServer", "Retry to startPreview. " + k.this.mCameraInstance.y + " times is waiting to retry.");
                            g gVar = k.this.mCameraInstance;
                            if (gVar.y > 0) {
                                gVar.y--;
                            }
                            Handler handler = k.this.mHandler;
                            if (handler != null) {
                                handler.postDelayed(new Runnable() {
                                    /* class com.ss.android.ttvecamera.k.AnonymousClass43.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(37961);
                                    }

                                    public final void run() {
                                        k.this.start(k.this.mCameraClient);
                                    }
                                }, 100);
                            } else {
                                return;
                            }
                        }
                        MethodCollector.o(2198);
                    } finally {
                        MethodCollector.o(2198);
                    }
                }
            } else {
                j.a("te_record_camera_preview_ret", (long) i2);
                Handler handler2 = k.this.mHandler;
                if (handler2 == null) {
                    MethodCollector.o(2198);
                    return;
                }
                handler2.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.k.AnonymousClass43.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37960);
                    }

                    public final void run() {
                        k.this.handlePreviewingFallback();
                    }
                });
                MethodCollector.o(2198);
            }
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void a(int i2, int i3) {
            MethodCollector.i(2182);
            k.this.mOpenTime = System.currentTimeMillis() - k.this.mBeginTime;
            o.a("TECameraServer", "onCameraOpened: CameraType = " + k.this.mCameraSettings.f61800c + ", Ret = " + i3 + ",retryCnt = " + k.this.mRetryCnt);
            k.this.mOpenInfoMap.put("CamType" + k.this.mRetryCnt, String.valueOf(k.this.mCameraSettings.f61800c));
            k.this.mOpenInfoMap.put("Ret" + k.this.mRetryCnt, String.valueOf(i3));
            k.this.mOpenInfoMap.put("OpenTime" + k.this.mRetryCnt, String.valueOf(k.this.mOpenTime));
            if (i3 == 0) {
                k kVar = k.this;
                kVar.mRetryCnt = kVar.mCameraSettings.u;
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState == 1) {
                            k.this.updateCameraState(2);
                            k.this.mCameraObserver.onCaptureStarted(i2, i3);
                            int i4 = k.this.mCameraSettings.u - k.this.mRetryCnt;
                            k.this.mCameraObserver.onInfo(120, i4, "Retry open camera times = ".concat(String.valueOf(i4)));
                            k.this.mOpenInfoMap.put("ResultType", "Open Success");
                            j.a("te_record_camera_open_ret", (long) i3);
                            j.a("te_record_camera_open_cost", k.this.mOpenTime);
                            j.a("te_record_camera_open_info", k.this.mOpenInfoMap.toString());
                            o.a("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + k.this.mOpenTime);
                            k.this.mOpenInfoMap.clear();
                            MethodCollector.o(2182);
                            return;
                        }
                        o.c("TECameraServer", "Open camera error ? May be closed now!!, state = " + k.this.mCurrentCameraState);
                    } finally {
                        MethodCollector.o(2182);
                    }
                }
            } else if (k.this.mCameraSettings.f61800c == 11 && i3 == -428) {
                o.a("TECameraServer", "CameraUnit auth failed, fall back to camera2");
                k kVar2 = k.this;
                kVar2.mRetryCnt = kVar2.mCameraSettings.u;
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState == 0) {
                            o.c("TECameraServer", "onCameraOpened, no need to close camera, state: " + k.this.mCurrentCameraState);
                            k.this.mCameraInstance = null;
                        } else {
                            k.this.updateCameraState(0);
                            if (k.this.mCameraInstance != null) {
                                k.this.mCameraInstance.b(k.this.cachedOpenPrivacyCert);
                                k.this.mCameraInstance = null;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2182);
                        throw th;
                    }
                }
                k.this.mCameraSettings.f61800c = 2;
                k.INSTANCE.open(k.this.mCameraClient, k.this.mCameraSettings, k.this.cachedOpenPrivacyCert);
                k.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                j.a("te_record_camera_open_info", k.this.mOpenInfoMap.toString());
                k.this.mOpenInfoMap.clear();
                MethodCollector.o(2182);
            } else if (i3 != -403 && k.this.mRetryCnt > 0 && k.this.isCameraPermitted()) {
                k.this.mCameraObserver.onError(-404, "Retry to Open Camera Failed @" + k.this.mCameraSettings.f61800c + ",face:" + k.this.mCameraSettings.f61802e + " " + k.this.mCameraSettings.p.toString());
                if (k.this.mIsCameraPendingClose) {
                    k.this.mIsCameraPendingClose = false;
                    o.d("TECameraServer", "retry to open camera, but camera close was called");
                    k.this.mRetryCnt = -1;
                    k.this.mOpenInfoMap.put("ResultType" + k.this.mRetryCnt, "retry to open camera");
                    j.a("te_record_camera_open_info", k.this.mOpenInfoMap.toString());
                    MethodCollector.o(2182);
                    return;
                }
                if (i2 == 2 && k.this.mRetryCnt == k.this.mCameraSettings.u && (i3 == 4 || i3 == 5 || i3 == 1)) {
                    o.a("TECameraServer", "camera2 is not available");
                    k kVar3 = k.this;
                    kVar3.mRetryCnt = kVar3.mCameraSettings.w;
                }
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                o.a("TECameraServer", "retry to open camera, mRetryCnt = " + k.this.mRetryCnt);
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState == 0) {
                            o.c("TECameraServer", "onCameraOpened, no need to close camera, state: " + k.this.mCurrentCameraState);
                            k.this.mCameraInstance = null;
                        } else {
                            k.this.updateCameraState(0);
                            if (k.this.mCameraInstance != null) {
                                k.this.mCameraInstance.b(k.this.cachedOpenPrivacyCert);
                                k.this.mCameraInstance = null;
                            }
                        }
                    } catch (Throwable th2) {
                        MethodCollector.o(2182);
                        throw th2;
                    }
                }
                k.this.mRetryCnt--;
                k.INSTANCE.open(k.this.mCameraClient, k.this.mCameraSettings, k.this.cachedOpenPrivacyCert);
                k.this.mOpenInfoMap.put("ResultType" + k.this.mRetryCnt, "retry to open camera");
                j.a("te_record_camera_open_info", k.this.mOpenInfoMap.toString());
                MethodCollector.o(2182);
            } else if ((!k.this.mCameraSettings.I || i2 == 1) && i3 != -403) {
                k.this.mCameraObserver.onCaptureStarted(i2, i3);
                o.a("TECameraServer", "finally go to the error.");
                j.a("te_record_camera_open_ret", (long) i3);
                k.this.mCameraObserver.onError(i3, "Open camera failed @" + k.this.mCameraSettings.f61800c + ",face:" + k.this.mCameraSettings.f61802e + " " + k.this.mCameraSettings.p.toString());
                k.INSTANCE.close(k.this.cachedOpenPrivacyCert);
                k.this.mRetryCnt = -1;
                j.a("te_record_camera_open_info", k.this.mOpenInfoMap.toString());
                k.this.mOpenInfoMap.clear();
                MethodCollector.o(2182);
            } else {
                o.a("TECameraServer", "Open camera failed, fall back to camera1");
                k kVar4 = k.this;
                kVar4.mRetryCnt = kVar4.mCameraSettings.u;
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState == 0) {
                            o.c("TECameraServer", "onCameraOpened, no need to close camera, state: " + k.this.mCurrentCameraState);
                            k.this.mCameraInstance = null;
                        } else {
                            k.this.updateCameraState(0);
                            if (k.this.mCameraInstance != null) {
                                k.this.mCameraInstance.b(k.this.cachedOpenPrivacyCert);
                                k.this.mCameraInstance = null;
                            }
                        }
                    } catch (Throwable th3) {
                        MethodCollector.o(2182);
                        throw th3;
                    }
                }
                k.this.mCameraSettings.f61800c = 1;
                k.INSTANCE.open(k.this.mCameraClient, k.this.mCameraSettings, k.this.cachedOpenPrivacyCert);
                k.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                j.a("te_record_camera_open_info", k.this.mOpenInfoMap.toString());
                MethodCollector.o(2182);
            }
        }

        @Override // com.ss.android.ttvecamera.g.a
        public final void a(int i2, int i3, String str) {
            o.b("TECameraServer", "onCameraInfo: " + i2 + ", ext: " + i3 + " msg: " + str);
            k.this.mCameraObserver.onInfo(i2, i3, str);
        }
    };
    public volatile g mCameraInstance;
    public TECameraCapture.a mCameraObserver = new TECameraCapture.b();
    public l mCameraSettings;
    private Runnable mCheckCloseTask;
    public volatile int mCurrentCameraState = 0;
    private float mCurrentZoom;
    private boolean mEnableVBoost = false;
    private boolean mFirstEC = true;
    public boolean mFirstZoom = true;
    public Handler mHandler;
    private volatile boolean mHandlerDestroyed = true;
    private HandlerThread mHandlerThread;
    public volatile boolean mIsCameraPendingClose;
    private volatile boolean mIsCameraProviderChanged;
    private boolean mIsForegroundVisible = false;
    private volatile boolean mIsInitialized;
    private final Object mLock = new Object();
    public Handler mMainHandler = new Handler(Looper.getMainLooper());
    private boolean mOnBackGround = false;
    public final ConcurrentHashMap<String, String> mOpenInfoMap = new ConcurrentHashMap<>();
    public long mOpenTime = 0;
    private final g.c mPictureSizeCallBack = new g.c() {
        /* class com.ss.android.ttvecamera.k.AnonymousClass44 */

        static {
            Covode.recordClassIndex(37962);
        }

        @Override // com.ss.android.ttvecamera.g.c
        public final TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (k.this.mPictureSizeCallback != null) {
                return k.this.mPictureSizeCallback.a(list, list2);
            }
            return null;
        }
    };
    public TECameraCapture.c mPictureSizeCallback;
    c mProviderManager;
    private c.a mProviderSettings;
    public int mRetryCnt = -1;
    public l.m mSATZoomCallback;
    public boolean mStartPreviewError = false;
    public final Object mStateLock = new Object();
    private b mSystemResManager;
    private int mVBoostTimeoutMS = 0;
    private volatile int sClientCount = 0;
    private g.d satZoomCallback = new g.d() {
        /* class com.ss.android.ttvecamera.k.AnonymousClass46 */

        static {
            Covode.recordClassIndex(37964);
        }
    };

    public final void changeCaptureFormat() {
    }

    public final int getCameraState() {
        return getCameraState(false);
    }

    public final int startRecording() {
        return this.mCameraInstance.v();
    }

    public final int stopRecording() {
        return this.mCameraInstance.w();
    }

    public final int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.h();
    }

    public final int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.f();
    }

    static {
        Covode.recordClassIndex(37921);
    }

    private synchronized int c() {
        int i2;
        MethodCollector.i(413);
        this.sClientCount++;
        o.b("TECameraServer", "sClientCount = " + this.sClientCount);
        i2 = this.sClientCount;
        MethodCollector.o(413);
        return i2;
    }

    public final synchronized int decreaseClientCount() {
        int i2;
        MethodCollector.i(420);
        this.sClientCount--;
        o.b("TECameraServer", "sClientCount = " + this.sClientCount);
        if (this.sClientCount < 0) {
            o.c("TECameraServer", "Invalid ClientCount = " + this.sClientCount);
            this.sClientCount = 0;
        }
        i2 = this.sClientCount;
        MethodCollector.o(420);
        return i2;
    }

    public final synchronized int destroy() {
        MethodCollector.i(3224);
        o.a("TECameraServer", "destroy...start");
        this.mIsInitialized = false;
        this.mCheckCloseTask = null;
        this.mCameraClient = null;
        this.mPictureSizeCallback = null;
        this.cachedClosePrivacyCert = null;
        this.cachedOpenPrivacyCert = null;
        this.mProviderSettings = null;
        g gVar = this.mCameraInstance;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37922);
                }

                public final void run() {
                    com.ss.android.ttvecamera.j.b bVar = k.this.mProviderManager.f61616b;
                    if (bVar != null) {
                        bVar.e();
                    }
                    o.a("TECameraServer", "provider release...");
                }
            });
        }
        if (this.mHandlerThread != null) {
            int i2 = Build.VERSION.SDK_INT;
            this.mHandlerThread.quitSafely();
            this.mHandlerThread = null;
            this.mHandlerDestroyed = true;
            this.mHandler = null;
        }
        this.mCameraObserver = TECameraCapture.b.a();
        o.a("TECameraServer", "destroy...end");
        MethodCollector.o(3224);
        return 0;
    }

    public final void handlePreviewingFallback() {
        boolean z;
        MethodCollector.i(409);
        if (this.mCameraSettings.f61800c == 1) {
            MethodCollector.o(409);
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.b();
                        updateCameraState(2);
                        this.mCameraInstance.b(this.cachedOpenPrivacyCert);
                        this.mCameraInstance = null;
                        updateCameraState(0);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(409);
            }
        }
        if (z) {
            this.mCameraSettings.f61800c = 1;
            this.mCameraEvent.a(51, 0, "need recreate surfacetexture");
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    public final boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (androidx.core.content.b.a(this.mCameraSettings.f61799b, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e2) {
            o.d("TECameraServer", "test camera permission failed!: " + e2.toString());
        }
        this.mOpenInfoMap.put("CamPerm" + this.mRetryCnt, String.valueOf(z));
        return z;
    }

    private synchronized void a() {
        MethodCollector.i(2562);
        o.a("TECameraServer", "init...start");
        if (this.mIsInitialized) {
            MethodCollector.o(2562);
            return;
        }
        this.mHandler = a("TECameraServer");
        this.mHandlerDestroyed = false;
        this.mProviderManager = new c();
        this.mIsInitialized = true;
        this.mCurrentZoom = 0.0f;
        this.mOnBackGround = false;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mSystemResManager = new b();
        o.a("TECameraServer", "init...end");
        MethodCollector.o(2562);
    }

    private g b() {
        boolean z;
        if (Build.VERSION.SDK_INT < 24) {
            return b.a(this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if (this.mCameraSettings.ao) {
            z = m.b(this.mCameraSettings.f61799b);
        } else {
            z = true;
        }
        if (this.mCameraSettings.f61800c == 1) {
            return b.a(this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if (this.mCameraSettings.f61800c == 7 && z) {
            this.mCameraSettings.f61800c = 2;
            return e.a(this.mCameraSettings.f61800c, this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        } else if ((10 == this.mCameraSettings.f61800c || 11 == this.mCameraSettings.f61800c) && Build.VERSION.SDK_INT >= 28) {
            try {
                g gVar = (g) Class.forName("com.ss.android.ttvecamera.TEVendorCamera").getMethod("create", Integer.TYPE, Context.class, g.a.class, Handler.class, g.c.class).invoke(null, Integer.valueOf(this.mCameraSettings.f61800c), this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
                if (gVar != null) {
                    o.a("TECameraServer", "createCameraInstance TEVendorCamera");
                    return gVar;
                }
            } catch (Exception e2) {
                if ((o.f61856b & 2) != 0) {
                    o.f61857c.Log((byte) 2, o.f61855a + "TECameraServer", "createCameraInstance for TEVendorCamera class failed, exception occurred" + e2.getMessage() + "stack: " + Log.getStackTraceString(e2));
                }
            }
            if (!z) {
                this.mCameraSettings.f61800c = 1;
                return b.a(this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            }
            this.mCameraSettings.f61800c = 2;
            return e.a(this.mCameraSettings.f61800c, this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        } else if (z) {
            return e.a(this.mCameraSettings.f61800c, this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        } else {
            this.mCameraSettings.f61800c = 1;
            return b.a(this.mCameraSettings.f61799b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
    }

    public final void appLifeCycleChanged(boolean z) {
        this.mOnBackGround = z;
    }

    public final void setSATZoomCallback(l.m mVar) {
        this.mSATZoomCallback = mVar;
    }

    public final int close(PrivacyCert privacyCert) {
        return close(true, privacyCert);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<k> f61792a;

        static {
            Covode.recordClassIndex(37976);
        }

        public a(k kVar) {
            this.f61792a = new WeakReference<>(kVar);
        }

        public final boolean handleMessage(Message message) {
            MethodCollector.i(2288);
            int i2 = message.what;
            Object obj = message.obj;
            k kVar = this.f61792a.get();
            if (i2 == 1) {
                o.b("TECameraServer", "startZoom...");
                synchronized (kVar.mStateLock) {
                    try {
                        if (kVar.mCameraInstance != null) {
                            kVar.mCameraInstance.a(((float) message.arg1) / 100.0f, (l.p) obj);
                        }
                        if (kVar.mFirstZoom) {
                            g.a aVar = kVar.mCameraEvent;
                            g gVar = kVar.mCameraInstance;
                            aVar.a(114, 0, "startzoom");
                            kVar.mFirstZoom = false;
                        }
                    } finally {
                        MethodCollector.o(2288);
                    }
                }
            }
            return false;
        }
    }

    public final int getFlashMode(TECameraCapture tECameraCapture) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.j();
    }

    public final l.d getCameraECInfo(TECameraCapture tECameraCapture) {
        if (a(tECameraCapture) && this.mCameraInstance != null) {
            return this.mCameraInstance.o.H;
        }
        return null;
    }

    public final int getCameraState(boolean z) {
        int i2;
        MethodCollector.i(3323);
        if (z) {
            synchronized (this.mStateLock) {
                try {
                    i2 = this.mCurrentCameraState;
                } finally {
                    MethodCollector.o(3323);
                }
            }
        } else {
            i2 = this.mCurrentCameraState;
        }
        return i2;
    }

    public final int[] getPictureSize(TECameraCapture tECameraCapture) {
        if (a(tECameraCapture) && this.mCameraInstance != null) {
            return this.mCameraInstance.k();
        }
        return null;
    }

    public final boolean isTorchSupported(TECameraCapture tECameraCapture) {
        g gVar;
        if (a(tECameraCapture) && (gVar = this.mCameraInstance) != null && gVar.s()) {
            return true;
        }
        return false;
    }

    public final void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings != null && this.mCameraInstance != null) {
            this.mCameraSettings.f61801d = tEFrameRateRange;
            this.mCameraSettings.L = 1;
            this.mCameraInstance.g();
        }
    }

    private boolean a(TECameraCapture tECameraCapture) {
        MethodCollector.i(370);
        synchronized (this.mLock) {
            try {
                TECameraCapture tECameraCapture2 = this.mCameraClient;
                if (tECameraCapture2 != tECameraCapture) {
                    if (tECameraCapture2 == null) {
                        o.c("TECameraServer", "Internal CameraClient is null. Must call connect first!");
                    } else {
                        o.c("TECameraServer", "Invalid CameraClient, need : " + this.mCameraClient);
                    }
                    return false;
                }
                MethodCollector.o(370);
                return true;
            } finally {
                MethodCollector.o(370);
            }
        }
    }

    public final int abortSession(TECameraCapture tECameraCapture) {
        if (!a(tECameraCapture)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            o.d("TECameraServer", "abortSession, mHandler is null!");
            return -112;
        }
        handler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.k.AnonymousClass51 */

            static {
                Covode.recordClassIndex(37970);
            }

            public final void run() {
                if (k.this.mCameraInstance != null) {
                    k.this.mCameraInstance.y();
                }
            }
        });
        return 0;
    }

    public final boolean isSupportWhileBalance(TECameraCapture tECameraCapture) {
        MethodCollector.i(4768);
        boolean z = false;
        if (!a(tECameraCapture)) {
            MethodCollector.o(4768);
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.r()) {
                    z = true;
                }
            } finally {
                MethodCollector.o(4768);
            }
        }
        return z;
    }

    public final boolean isSupportedExposureCompensation(TECameraCapture tECameraCapture) {
        if (!a(tECameraCapture)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.o();
        }
        o.c("TECameraServer", "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public final void updateCameraState(int i2) {
        if (this.mCurrentCameraState == i2) {
            o.c("TECameraServer", "No need update state: ".concat(String.valueOf(i2)));
            return;
        }
        o.a("TECameraServer", "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i2);
        this.mCurrentCameraState = i2;
    }

    private k(String str) {
    }

    private Handler a(String str) {
        Looper mainLooper;
        try {
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread(str);
            handlerThread2.start();
            handlerThread2.getLooper().setMessageLogging(new Printer() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass42 */

                /* renamed from: b  reason: collision with root package name */
                private long f61753b;

                /* renamed from: c  reason: collision with root package name */
                private int f61754c;

                /* renamed from: d  reason: collision with root package name */
                private long f61755d;

                static {
                    Covode.recordClassIndex(37958);
                }

                public final void println(String str) {
                    if (str.startsWith(">>>>> Dispatching to Handler")) {
                        this.f61753b = System.currentTimeMillis();
                    } else if (str.startsWith("<<<<< Finished to Handler")) {
                        long currentTimeMillis = System.currentTimeMillis() - this.f61753b;
                        if (currentTimeMillis > 1000) {
                            int i2 = this.f61754c + 1;
                            this.f61754c = i2;
                            j.a("te_record_camera_task_time_out_count", (long) i2);
                            if (currentTimeMillis > this.f61755d) {
                                this.f61755d = currentTimeMillis;
                                j.a("te_record_camera_max_lag_task_cost", currentTimeMillis);
                                o.a("TECameraServer", "task: " + str + ", cost: " + currentTimeMillis + "ms");
                            }
                        }
                    }
                }
            });
            this.mHandlerThread = handlerThread2;
            return new Handler(handlerThread2.getLooper(), new a(this));
        } catch (Exception e2) {
            o.d("TECameraServer", "CreateHandler failed!: " + e2.toString());
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            return new Handler(mainLooper);
        }
    }

    public final int cancelFocus(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4283);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4283);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(37926);
                }

                public final void run() {
                    k.this.cancelFocus(tECameraCapture);
                }
            });
        } else {
            o.a("TECameraServer", "cancelFocus...");
            synchronized (this.mStateLock) {
                try {
                    this.mCameraInstance.m();
                } catch (Throwable th) {
                    MethodCollector.o(4283);
                    throw th;
                }
            }
        }
        MethodCollector.o(4283);
        return 0;
    }

    public final boolean couldForwardState(int i2) {
        if (i2 == this.mCurrentCameraState) {
            o.c("TECameraServer", "No need this");
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    o.d("TECameraServer", "Invalidate camera state = ".concat(String.valueOf(i2)));
                    return false;
                } else if (this.mCurrentCameraState == 1) {
                    return true;
                } else {
                    return false;
                }
            } else if (this.mCurrentCameraState != 0) {
                o.c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public final int enableCaf(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4299);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4299);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(37927);
                }

                public final void run() {
                    k.this.enableCaf(tECameraCapture);
                }
            });
        } else {
            o.a("TECameraServer", "enableCaf...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.n();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4299);
                    throw th;
                }
            }
        }
        MethodCollector.o(4299);
        return 0;
    }

    public final int getExposureCompensation(TECameraCapture tECameraCapture) {
        int i2;
        MethodCollector.i(4624);
        if (a(tECameraCapture)) {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        g gVar = this.mCameraInstance;
                        if (gVar.o.H != null) {
                            i2 = gVar.o.H.f61824b;
                        } else {
                            i2 = 0;
                        }
                        MethodCollector.o(4624);
                        return i2;
                    }
                    this.mCameraObserver.onError(-105, "Can not get ec on state : " + this.mCurrentCameraState);
                    return -105;
                } finally {
                    MethodCollector.o(4624);
                }
            }
        } else {
            RuntimeException runtimeException = new RuntimeException("Client is not connected!!!");
            MethodCollector.o(4624);
            throw runtimeException;
        }
    }

    public final boolean isAutoExposureLockSupported(TECameraCapture tECameraCapture) {
        MethodCollector.i(4720);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4720);
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    boolean p = this.mCameraInstance.p();
                    MethodCollector.o(4720);
                    return p;
                }
                o.c("TECameraServer", "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } finally {
                MethodCollector.o(4720);
            }
        }
    }

    public final boolean isAutoFocusLockSupported(TECameraCapture tECameraCapture) {
        MethodCollector.i(4758);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4758);
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    boolean q = this.mCameraInstance.q();
                    MethodCollector.o(4758);
                    return q;
                }
                o.c("TECameraServer", "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } finally {
                MethodCollector.o(4758);
            }
        }
    }

    public final void realCloseCamera(PrivacyCert privacyCert) {
        MethodCollector.i(4085);
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 0) {
                    o.c("TECameraServer", "realCloseCamera, no need to close camera, state: " + this.mCurrentCameraState);
                } else {
                    if (this.mCameraInstance != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.mCameraInstance.b(privacyCert);
                        o.a("TECameraServer", "system call close() cost: ".concat(String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    }
                    updateCameraState(0);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance = null;
                }
            } finally {
                MethodCollector.o(4085);
            }
        }
    }

    public final int removeCameraProvider(final TECameraCapture tECameraCapture) {
        MethodCollector.i(3779);
        if (!a(tECameraCapture)) {
            MethodCollector.o(3779);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass49 */

                static {
                    Covode.recordClassIndex(37967);
                }

                public final void run() {
                    k.this.removeCameraProvider(tECameraCapture);
                }
            });
        } else {
            o.a("TECameraServer", "removeCameraProvider");
            synchronized (this.mStateLock) {
                try {
                    c cVar = this.mProviderManager;
                    if (cVar.f61616b != null) {
                        cVar.f61616b.e();
                        cVar.f61616b = null;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3779);
                    throw th;
                }
            }
        }
        MethodCollector.o(3779);
        return 0;
    }

    public final int startCameraFaceDetect(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4195);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4195);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(37968);
                }

                public final void run() {
                    k.this.startCameraFaceDetect(tECameraCapture);
                }
            });
        } else {
            o.a("TECameraServer", "startCameraFaceDetect");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Can not start face detect on state : " + this.mCurrentCameraState);
                        return -105;
                    }
                    this.mCameraInstance.c();
                } finally {
                    MethodCollector.o(4195);
                }
            }
        }
        MethodCollector.o(4195);
        return 0;
    }

    public final int stopCameraFaceDetect(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4204);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4204);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(37972);
                }

                public final void run() {
                    k.this.stopCameraFaceDetect(tECameraCapture);
                }
            });
        } else {
            o.a("TECameraServer", "stopCameraFaceDetect");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Can not stop face detect on state : " + this.mCurrentCameraState);
                        return -105;
                    }
                    this.mCameraInstance.d();
                } finally {
                    MethodCollector.o(4204);
                }
            }
        }
        MethodCollector.o(4204);
        return 0;
    }

    private boolean b(l lVar) {
        if (this.mCameraSettings == null) {
            return true;
        }
        if (lVar.z != 2) {
            return false;
        }
        if (this.mCameraSettings.at != null && this.mCameraSettings.at.f61811a.ordinal() == lVar.at.f61811a.ordinal() && this.mCameraSettings.at.f61812b.ordinal() == lVar.at.f61812b.ordinal() && this.mCameraSettings.at.f61813c.ordinal() == lVar.at.f61813c.ordinal() && this.mCameraSettings.at.f61814d.ordinal() == lVar.at.f61814d.ordinal() && this.mCameraSettings.at.f61815e.ordinal() == lVar.at.f61815e.ordinal() && this.mCameraSettings.at.f61816f.ordinal() == lVar.at.f61816f.ordinal()) {
            return false;
        }
        return true;
    }

    public final void downExposureCompensation(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4709);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4709);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass28 */

                static {
                    Covode.recordClassIndex(37942);
                }

                public final void run() {
                    k.this.downExposureCompensation(tECameraCapture);
                }
            });
            MethodCollector.o(4709);
        } else {
            o.a("TECameraServer", "downExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        l.d dVar = this.mCameraInstance.o.H;
                        if (dVar == null) {
                            this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                            MethodCollector.o(4709);
                            return;
                        }
                        this.mCameraInstance.c(dVar.f61824b - 1);
                        MethodCollector.o(4709);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.o(4709);
                }
            }
        }
    }

    public final int stop(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4061);
        o.a("TECameraServer", "stop: client ".concat(String.valueOf(tECameraCapture)));
        if (!a(tECameraCapture)) {
            MethodCollector.o(4061);
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            o.d("TECameraServer", "stop, mHandler is null!");
            MethodCollector.o(4061);
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass52 */

                static {
                    Covode.recordClassIndex(37971);
                }

                public final void run() {
                    k.this.stop(tECameraCapture);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 2) {
                        o.c("TECameraServer", "stop, no need to stop capture, state: " + this.mCurrentCameraState);
                        return 0;
                    } else if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                        MethodCollector.o(4061);
                        return -105;
                    } else {
                        updateCameraState(2);
                        this.mCameraInstance.b();
                    }
                } finally {
                    MethodCollector.o(4061);
                }
            }
        }
        MethodCollector.o(4061);
        return 0;
    }

    public final void upExposureCompensation(final TECameraCapture tECameraCapture) {
        MethodCollector.i(4689);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4689);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass27 */

                static {
                    Covode.recordClassIndex(37941);
                }

                public final void run() {
                    k.this.upExposureCompensation(tECameraCapture);
                }
            });
            MethodCollector.o(4689);
        } else {
            o.a("TECameraServer", "upExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        l.d dVar = this.mCameraInstance.o.H;
                        if (dVar == null) {
                            this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                            MethodCollector.o(4689);
                            return;
                        }
                        this.mCameraInstance.c(dVar.f61824b + 1);
                        MethodCollector.o(4689);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.o(4689);
                }
            }
        }
    }

    private boolean a(l lVar) {
        l lVar2 = this.mCameraSettings;
        if (lVar2 == null) {
            return false;
        }
        if (lVar2.f61800c == lVar.f61800c && this.mCameraSettings.p.f61374a == lVar.p.f61374a && this.mCameraSettings.p.f61375b == lVar.p.f61375b && this.mCameraSettings.f61802e == lVar.f61802e && this.mCameraSettings.K == lVar.K && this.mCameraSettings.R == lVar.R && this.mCameraSettings.B == lVar.B && this.mCameraSettings.t == lVar.t && this.mCameraSettings.x == lVar.x && this.mCameraSettings.z == lVar.z && !b(lVar)) {
            return false;
        }
        return true;
    }

    public final int start(final TECameraCapture tECameraCapture) {
        MethodCollector.i(3794);
        o.a("TECameraServer", "start: client ".concat(String.valueOf(tECameraCapture)));
        if (!a(tECameraCapture)) {
            MethodCollector.o(3794);
            return -108;
        }
        l lVar = this.mCameraSettings;
        if (lVar == null || lVar.f61799b == null) {
            o.d("TECameraServer", "mCameraSettings has some error");
            MethodCollector.o(3794);
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            o.d("TECameraServer", "start, mHandler is null!");
            MethodCollector.o(3794);
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass50 */

                static {
                    Covode.recordClassIndex(37969);
                }

                public final void run() {
                    k.this.start(tECameraCapture);
                    if (k.this.mCameraSettings.f61809l) {
                        k.this.mCameraClientCondition.open();
                    }
                }
            });
            if (this.mCameraSettings.f61809l) {
                long currentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                o.a("TECameraServer", "Camera start cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3) {
                        o.c("TECameraServer", "start, no need to start capture, state: " + this.mCurrentCameraState);
                        if (!this.mIsCameraProviderChanged && !this.mStartPreviewError) {
                            return 0;
                        }
                        this.mCameraInstance.b();
                        updateCameraState(2);
                        this.mIsCameraProviderChanged = false;
                    }
                    if (this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        MethodCollector.o(3794);
                        return -105;
                    }
                    this.mCameraObserver.onInfo(3, this.mCurrentCameraState, "Camera state: opened");
                    this.mCameraInstance.a();
                    updateCameraState(3);
                    j.a("te_record_camera_type", (long) this.mCameraInstance.e());
                    j.a("te_preview_camera_resolution", this.mCameraSettings.p.f61374a + "*" + this.mCameraSettings.p.f61375b);
                    j.a("te_record_camera_frame_rate", (double) this.mCameraSettings.f61801d.f61372b);
                    j.a("te_record_camera_direction", (long) this.mCameraSettings.f61802e);
                } finally {
                    MethodCollector.o(3794);
                }
            }
        }
        MethodCollector.o(3794);
        return 0;
    }

    public final int disConnect(TECameraCapture tECameraCapture, PrivacyCert privacyCert) {
        return disConnect(tECameraCapture, true, privacyCert);
    }

    public final void notifyHostForegroundVisible(TECameraCapture tECameraCapture, boolean z) {
        if (a(tECameraCapture)) {
            this.mIsForegroundVisible = z;
            o.a("TECameraServer", "is foreground visible: ".concat(String.valueOf(z)));
        }
    }

    public final int getISO(final TECameraCapture tECameraCapture, final l.g gVar) {
        MethodCollector.i(176);
        int i2 = -1;
        if (!a(tECameraCapture)) {
            MethodCollector.o(176);
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass35 */

                static {
                    Covode.recordClassIndex(37950);
                }

                public final void run() {
                    k.this.getISO(tECameraCapture, gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        i2 = this.mCameraInstance.B();
                    }
                } finally {
                    MethodCollector.o(176);
                }
            }
        }
        return i2;
    }

    public final float getManualFocusAbility(final TECameraCapture tECameraCapture, final l.i iVar) {
        MethodCollector.i(4306);
        float f2 = -1.0f;
        if (!a(tECameraCapture)) {
            MethodCollector.o(4306);
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(37928);
                }

                public final void run() {
                    k.this.getManualFocusAbility(tECameraCapture, iVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        f2 = this.mCameraInstance.z();
                    }
                } finally {
                    MethodCollector.o(4306);
                }
            }
        }
        return f2;
    }

    public final void setAperture(final TECameraCapture tECameraCapture, final float f2) {
        MethodCollector.i(277);
        if (!a(tECameraCapture)) {
            MethodCollector.o(277);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass39 */

                static {
                    Covode.recordClassIndex(37954);
                }

                public final void run() {
                    k.this.setAperture(tECameraCapture, f2);
                }
            });
            MethodCollector.o(277);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.b(f2);
                    }
                } finally {
                    MethodCollector.o(277);
                }
            }
        }
    }

    public final void setISO(final TECameraCapture tECameraCapture, final int i2) {
        MethodCollector.i(171);
        if (!a(tECameraCapture)) {
            MethodCollector.o(171);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass33 */

                static {
                    Covode.recordClassIndex(37948);
                }

                public final void run() {
                    k.this.setISO(tECameraCapture, i2);
                }
            });
            MethodCollector.o(171);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.e(i2);
                    }
                } finally {
                    MethodCollector.o(171);
                }
            }
        }
    }

    public final void setManualFocusDistance(final TECameraCapture tECameraCapture, final float f2) {
        MethodCollector.i(4424);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4424);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass16 */

                static {
                    Covode.recordClassIndex(37929);
                }

                public final void run() {
                    k.this.setManualFocusDistance(tECameraCapture, f2);
                }
            });
            MethodCollector.o(4424);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(f2);
                    }
                } finally {
                    MethodCollector.o(4424);
                }
            }
        }
    }

    public final void setSceneMode(TECameraCapture tECameraCapture, final int i2) {
        if (a(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.k.AnonymousClass18 */

                    static {
                        Covode.recordClassIndex(37931);
                    }

                    public final void run() {
                        if (k.this.mCameraInstance != null) {
                            k.this.mCameraInstance.a(i2);
                        }
                    }
                });
                return;
            }
            return;
        }
        o.c("TECameraServer", "set scnen failed: ".concat(String.valueOf(i2)));
    }

    public final void setShutterTime(final TECameraCapture tECameraCapture, final long j2) {
        MethodCollector.i(181);
        if (!a(tECameraCapture)) {
            MethodCollector.o(181);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass37 */

                static {
                    Covode.recordClassIndex(37952);
                }

                public final void run() {
                    k.this.setShutterTime(tECameraCapture, j2);
                }
            });
            MethodCollector.o(181);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(j2);
                    }
                } finally {
                    MethodCollector.o(181);
                }
            }
        }
    }

    public final int takePicture(TECameraCapture tECameraCapture, final l.AbstractC1345l lVar) {
        if (!a(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.k.AnonymousClass10 */

            static {
                Covode.recordClassIndex(37923);
            }

            public final void run() {
                MethodCollector.i(162);
                o.a("TECameraServer", "takePicture");
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState != 3) {
                            String str = "Can not takePicture on state : " + k.this.mCurrentCameraState;
                            k.this.mCameraObserver.onError(-105, str);
                            o.d("TECameraServer", str);
                            if (lVar != null) {
                                new Exception(str);
                            }
                            return;
                        }
                        if (k.this.mCameraSettings.f61800c == 1) {
                            k.this.updateCameraState(2);
                        }
                        k.this.mCameraInstance.a(lVar);
                        MethodCollector.o(162);
                    } finally {
                        MethodCollector.o(162);
                    }
                }
            }
        });
        return 0;
    }

    public final int enableMulticamZoom(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.i(435);
        if (!a(tECameraCapture)) {
            MethodCollector.o(435);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass48 */

                static {
                    Covode.recordClassIndex(37966);
                }

                public final void run() {
                    k.this.enableMulticamZoom(tECameraCapture, z);
                }
            });
        } else {
            o.a("TECameraServer", "enableMulticamZoom: ".concat(String.valueOf(z)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.d(z);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(435);
                    throw th;
                }
            }
        }
        MethodCollector.o(435);
        return 0;
    }

    public final int focusAtPoint(final TECameraCapture tECameraCapture, final n nVar) {
        MethodCollector.i(4238);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4238);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(37924);
                }

                public final void run() {
                    int focusAtPoint = k.this.focusAtPoint(tECameraCapture, nVar);
                    if (focusAtPoint != 0 && nVar.f61854m != null) {
                        nVar.f61854m.a(focusAtPoint, k.this.mCameraSettings.f61802e, "");
                    }
                }
            });
        } else {
            o.a("TECameraServer", "focusAtPoint at: ".concat(String.valueOf(nVar)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.a(nVar);
                    } else {
                        this.mCameraObserver.onError(-105, "Can not set focus on state : " + this.mCurrentCameraState);
                        return -105;
                    }
                } finally {
                    MethodCollector.o(4238);
                }
            }
        }
        MethodCollector.o(4238);
        return 0;
    }

    public final float[] getApertureRange(final TECameraCapture tECameraCapture, final l.b bVar) {
        MethodCollector.i(276);
        float[] fArr = {0.0f};
        if (!a(tECameraCapture)) {
            float[] fArr2 = {-1.0f, -1.0f};
            MethodCollector.o(276);
            return fArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass38 */

                static {
                    Covode.recordClassIndex(37953);
                }

                public final void run() {
                    k.this.getApertureRange(tECameraCapture, bVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        fArr = this.mCameraInstance.D();
                    }
                } finally {
                    MethodCollector.o(276);
                }
            }
        }
        return fArr;
    }

    public final float[] getFOV(final TECameraCapture tECameraCapture, final l.e eVar) {
        MethodCollector.i(4215);
        float[] fArr = new float[2];
        if (!a(tECameraCapture)) {
            float[] fArr2 = {-2.0f, -2.0f};
            MethodCollector.o(4215);
            return fArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(37973);
                }

                public final void run() {
                    float[] fov = k.this.getFOV(tECameraCapture, eVar);
                    l.e eVar = eVar;
                    if (eVar != null) {
                        eVar.a(fov);
                    }
                }
            });
        } else {
            o.a("TECameraServer", "getFOV");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Can not getFOV on state : " + this.mCurrentCameraState);
                        return new float[]{-2.0f, -2.0f};
                    }
                    fArr = this.mCameraInstance.l();
                } finally {
                    MethodCollector.o(4215);
                }
            }
        }
        MethodCollector.o(4215);
        return fArr;
    }

    public final int[] getISORange(final TECameraCapture tECameraCapture, final l.h hVar) {
        MethodCollector.i(169);
        int[] iArr = new int[2];
        if (!a(tECameraCapture)) {
            int[] iArr2 = {-1, -1};
            MethodCollector.o(169);
            return iArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass32 */

                static {
                    Covode.recordClassIndex(37947);
                }

                public final void run() {
                    int[] iSORange = k.this.getISORange(tECameraCapture, hVar);
                    if (iSORange != null) {
                        hVar.a(iSORange);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        iArr = this.mCameraInstance.A();
                    }
                } finally {
                    MethodCollector.o(169);
                }
            }
        }
        return iArr;
    }

    public final long[] getShutterTimeRange(final TECameraCapture tECameraCapture, final l.o oVar) {
        MethodCollector.i(179);
        long[] jArr = new long[2];
        if (!a(tECameraCapture)) {
            long[] jArr2 = {-1, -1};
            MethodCollector.o(179);
            return jArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass36 */

                static {
                    Covode.recordClassIndex(37951);
                }

                public final void run() {
                    k.this.getShutterTimeRange(tECameraCapture, oVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        jArr = this.mCameraInstance.C();
                    }
                } finally {
                    MethodCollector.o(179);
                }
            }
        }
        return jArr;
    }

    public final int process(final TECameraCapture tECameraCapture, final l.j jVar) {
        MethodCollector.i(4594);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4594);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass25 */

                static {
                    Covode.recordClassIndex(37939);
                }

                public final void run() {
                    k.this.process(tECameraCapture, jVar);
                }
            });
        } else {
            o.a("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        g gVar = this.mCameraInstance;
                        if (jVar != null && jVar.f61828a == 2) {
                            gVar.A.set(true);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4594);
                    throw th;
                }
            }
        }
        MethodCollector.o(4594);
        return 0;
    }

    public final float queryShaderZoomStep(final TECameraCapture tECameraCapture, final l.n nVar) {
        MethodCollector.i(4512);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4512);
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass20 */

                static {
                    Covode.recordClassIndex(37934);
                }

                public final void run() {
                    k.this.queryShaderZoomStep(tECameraCapture, nVar);
                }
            });
        } else {
            o.a("TECameraServer", "queryShaderZoomStep...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(nVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4512);
                    throw th;
                }
            }
        }
        MethodCollector.o(4512);
        return 0.0f;
    }

    public final void setAutoExposureLock(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.i(4718);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4718);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass29 */

                static {
                    Covode.recordClassIndex(37943);
                }

                public final void run() {
                    k.this.setAutoExposureLock(tECameraCapture, z);
                }
            });
            MethodCollector.o(4718);
        } else {
            o.a("TECameraServer", "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.a(z);
                        MethodCollector.o(4718);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.o(4718);
                }
            }
        }
    }

    public final void setAutoFocusLock(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.i(4747);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4747);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass30 */

                static {
                    Covode.recordClassIndex(37945);
                }

                public final void run() {
                    k.this.setAutoFocusLock(tECameraCapture, z);
                }
            });
            MethodCollector.o(4747);
        } else {
            o.b("TECameraServer", "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.b(z);
                        MethodCollector.o(4747);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.o(4747);
                }
            }
        }
    }

    public final int setFeatureParameters(final TECameraCapture tECameraCapture, final Bundle bundle) {
        MethodCollector.i(4563);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4563);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass24 */

                static {
                    Covode.recordClassIndex(37938);
                }

                public final void run() {
                    k.this.setFeatureParameters(tECameraCapture, bundle);
                }
            });
        } else {
            o.a("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(bundle);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4563);
                    throw th;
                }
            }
        }
        MethodCollector.o(4563);
        return 0;
    }

    public final int stopZoom(final TECameraCapture tECameraCapture, final l.p pVar) {
        MethodCollector.i(4538);
        if (!a(tECameraCapture)) {
            o.d("TECameraServer", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            MethodCollector.o(4538);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass21 */

                static {
                    Covode.recordClassIndex(37935);
                }

                public final void run() {
                    k.this.stopZoom(tECameraCapture, pVar);
                }
            });
        } else {
            o.a("TECameraServer", "stopZoom...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(pVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4538);
                    throw th;
                }
            }
        }
        MethodCollector.o(4538);
        return 0;
    }

    public final int switchFlashMode(final TECameraCapture tECameraCapture, final int i2) {
        MethodCollector.i(363);
        if (!a(tECameraCapture)) {
            MethodCollector.o(363);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass41 */

                static {
                    Covode.recordClassIndex(37957);
                }

                public final void run() {
                    k.this.switchFlashMode(tECameraCapture, i2);
                }
            });
        } else {
            o.a("TECameraServer", "switchFlashMode: ".concat(String.valueOf(i2)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.d(i2);
                        this.mCameraEvent.a(116, i2, "");
                    }
                } catch (Throwable th) {
                    MethodCollector.o(363);
                    throw th;
                }
            }
        }
        MethodCollector.o(363);
        return 0;
    }

    public final int toggleTorch(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.i(361);
        if (!a(tECameraCapture)) {
            o.d("TECameraServer", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            MethodCollector.o(361);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass40 */

                static {
                    Covode.recordClassIndex(37956);
                }

                public final void run() {
                    k.this.toggleTorch(tECameraCapture, z);
                }
            });
        } else {
            o.a("TECameraServer", "toggleTorch: ".concat(String.valueOf(z)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.c(z);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(361);
                    throw th;
                }
            }
        }
        MethodCollector.o(361);
        return 0;
    }

    public final void queryFeatures(String str, Bundle bundle) {
        Class cls;
        if (this.mCameraInstance != null) {
            Bundle bundle2 = this.mCameraInstance.B.get(str);
            if (bundle2 == null) {
                o.d("TECameraServer", "queryFeatures: getFeatures is null");
                return;
            }
            for (String str2 : bundle.keySet()) {
                if (bundle2.containsKey(str2)) {
                    if (l.f.f61827a.containsKey(str2)) {
                        cls = l.f.f61827a.get(str2);
                    } else {
                        cls = null;
                    }
                    if (cls == Boolean.class) {
                        bundle.putBoolean(str2, bundle2.getBoolean(str2));
                    } else if (cls == Integer.class) {
                        bundle.putInt(str2, bundle2.getInt(str2));
                    } else if (cls == Long.class) {
                        bundle.putLong(str2, bundle2.getLong(str2));
                    } else if (cls == Float.class) {
                        bundle.putFloat(str2, bundle2.getFloat(str2));
                    } else if (cls == Double.class) {
                        bundle.putDouble(str2, bundle2.getDouble(str2));
                    } else if (cls == String.class) {
                        bundle.putString(str2, bundle2.getString(str2));
                    } else if (cls == ArrayList.class) {
                        bundle.putParcelableArrayList(str2, bundle2.getParcelableArrayList(str2));
                    } else if (cls == TEFrameSizei.class) {
                        bundle.putParcelable(str2, bundle2.getParcelable(str2));
                    } else if (cls == TEFocusParameters.class) {
                        bundle.putParcelable(str2, bundle2.getParcelable(str2));
                    } else {
                        o.c("TECameraServer", "Not supported key:".concat(String.valueOf(str2)));
                    }
                }
            }
            return;
        }
        o.d("TECameraServer", "queryFeatures: camera instance null");
    }

    public final void setExposureCompensation(final TECameraCapture tECameraCapture, final int i2) {
        MethodCollector.i(4632);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4632);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass26 */

                static {
                    Covode.recordClassIndex(37940);
                }

                public final void run() {
                    k.this.setExposureCompensation(tECameraCapture, i2);
                }
            });
            MethodCollector.o(4632);
        } else {
            o.a("TECameraServer", "setExposureCompensation: ".concat(String.valueOf(i2)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.c(i2);
                        if (this.mFirstEC) {
                            this.mCameraEvent.a(115, 0, "exposure compensation");
                            this.mFirstEC = false;
                        }
                        MethodCollector.o(4632);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.o(4632);
                }
            }
        }
    }

    public final int switchCameraMode(final TECameraCapture tECameraCapture, final int i2) {
        MethodCollector.i(3749);
        if (!a(tECameraCapture)) {
            MethodCollector.o(3749);
            return -108;
        } else if (tECameraCapture.mCameraSettings.f61800c == 1 || !(i2 == 1 || i2 == 0 || i2 == 2)) {
            MethodCollector.o(3749);
            return -100;
        } else if (tECameraCapture.mCameraSettings.z == i2) {
            MethodCollector.o(3749);
            return 0;
        } else {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.k.AnonymousClass34 */

                    static {
                        Covode.recordClassIndex(37949);
                    }

                    public final void run() {
                        k.this.switchCameraMode(tECameraCapture, i2);
                    }
                });
            } else {
                o.a("TECameraServer", "switchCameraMode");
                synchronized (this.mStateLock) {
                    try {
                        if (this.mCurrentCameraState != 3) {
                            this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                            return -105;
                        }
                        this.mCameraInstance.b(i2);
                    } finally {
                        MethodCollector.o(3749);
                    }
                }
            }
            MethodCollector.o(3749);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addCameraProvider(final com.ss.android.ttvecamera.TECameraCapture r11, final com.ss.android.ttvecamera.j.c.a r12) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.k.addCameraProvider(com.ss.android.ttvecamera.TECameraCapture, com.ss.android.ttvecamera.j.c$a):int");
    }

    public final int close(final boolean z, final PrivacyCert privacyCert) {
        Handler handler = this.mHandler;
        if (handler == null) {
            this.mCameraCloseTaskHandlerId = -1;
            o.d("TECameraServer", "call camera close process, handler is null");
            if (this.mCameraInstance != null) {
                this.mCameraInstance.a(this.cachedClosePrivacyCert);
            }
            updateCameraState(0);
            o.c("TECameraServer", "call camera close process, handler is null, force close done");
            return -112;
        }
        o.a("TECameraServer", "call camera close process...sync: " + z + ", handler: " + handler);
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            this.mCameraCloseTaskHandlerId = -1;
            if (this.mEnableVBoost) {
                new b.a(b.EnumC1343b.BOOST_CPU, this.mVBoostTimeoutMS);
                realCloseCamera(privacyCert);
                new b.a(b.EnumC1343b.RESTORE_CPU);
            } else {
                realCloseCamera(privacyCert);
            }
            this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
            if (!z && decreaseClientCount() == 0) {
                return destroy();
            }
        } else {
            int hashCode = handler.hashCode();
            int i2 = this.mCameraCloseTaskHandlerId;
            if (i2 == -1 || i2 == hashCode) {
                this.mCameraCloseTaskHandlerId = hashCode;
                final long currentTimeMillis = System.currentTimeMillis();
                if (z) {
                    this.mCameraClientCondition.close();
                }
                this.mIsCameraPendingClose = true;
                handler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.k.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(37933);
                    }

                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        o.a("TECameraServer", "Push close task cost: ".concat(String.valueOf(currentTimeMillis)));
                        k.this.close(z, privacyCert);
                        k.this.mIsCameraPendingClose = false;
                        if (z) {
                            k.this.mCameraClientCondition.open();
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        j.a("te_record_camera_push_close_task_time", currentTimeMillis);
                        j.a("te_record_camera_close_cost", currentTimeMillis2);
                        Long.valueOf(currentTimeMillis2);
                    }
                });
                if (z) {
                    boolean z2 = !this.mCameraClientCondition.block(1500);
                    this.mIsCameraPendingClose = false;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (z2) {
                        this.mCameraCloseTaskHandlerId = -1;
                        o.d("TECameraServer", "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                        if (this.mCameraInstance != null) {
                            this.mCameraInstance.a(this.cachedClosePrivacyCert);
                        }
                        updateCameraState(0);
                    } else {
                        o.a("TECameraServer", "Camera close cost: " + currentTimeMillis2 + "ms");
                    }
                }
            } else {
                this.mCameraCloseTaskHandlerId = -1;
                o.d("TECameraServer", "camera close task discard...handler id has changed");
                return 0;
            }
        }
        return 0;
    }

    public final int captureBurst(TECameraCapture tECameraCapture, final l.c cVar, final com.ss.android.ttvecamera.i.a aVar) {
        if (!a(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.k.AnonymousClass8 */

            static {
                Covode.recordClassIndex(37974);
            }

            public final void run() {
                MethodCollector.i(2352);
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState != 3) {
                            String str = "Can not takePicture on state : " + k.this.mCurrentCameraState;
                            k.this.mCameraObserver.onError(-105, str);
                            o.d("TECameraServer", str);
                            if (cVar != null) {
                                new Exception(str);
                            }
                            return;
                        }
                        if (k.this.mCameraSettings.f61800c == 1) {
                            k.this.updateCameraState(2);
                        }
                        k.this.mCameraInstance.a(aVar, cVar);
                        MethodCollector.o(2352);
                    } finally {
                        MethodCollector.o(2352);
                    }
                }
            }
        });
        return 0;
    }

    public final TEFrameSizei getBestPreviewSize(TECameraCapture tECameraCapture, float f2, TEFrameSizei tEFrameSizei) {
        if (!a(tECameraCapture) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.a(f2, tEFrameSizei);
    }

    public final void setPictureSize(TECameraCapture tECameraCapture, final int i2, final int i3) {
        if (a(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.k.AnonymousClass17 */

                    static {
                        Covode.recordClassIndex(37930);
                    }

                    public final void run() {
                        if (k.this.mCurrentCameraState != 3) {
                            o.d("TECameraServer", "set picture size failed, w: " + i2 + ", h: " + i3 + ", state: " + k.this.mCurrentCameraState);
                        } else {
                            k.this.mCameraInstance.a(i2, i3);
                        }
                    }
                });
                return;
            }
            return;
        }
        o.c("TECameraServer", "set picture size failed, w: " + i2 + ", h: " + i3);
    }

    public final int changeRecorderState(final TECameraCapture tECameraCapture, final int i2, final g.b bVar) {
        MethodCollector.i(429);
        if (!a(tECameraCapture)) {
            MethodCollector.o(429);
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance == null) {
                        this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                        return -100;
                    }
                } finally {
                    MethodCollector.o(429);
                }
            }
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass47 */

                static {
                    Covode.recordClassIndex(37965);
                }

                public final void run() {
                    k.this.changeRecorderState(tECameraCapture, i2, bVar);
                }
            });
        }
        MethodCollector.o(429);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (decreaseClientCount() != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = destroy();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2615);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r5.mMainHandler.removeCallbacks(r5.mCheckCloseTask);
        r5.mMainHandler.postDelayed(r5.mCheckCloseTask, com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2615);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r5.cachedClosePrivacyCert = r8;
        close(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r7 == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int disConnect(com.ss.android.ttvecamera.TECameraCapture r6, boolean r7, com.bytedance.bpea.basics.PrivacyCert r8) {
        /*
            r5 = this;
            r4 = 2615(0xa37, float:3.664E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.lang.String r2 = "TECameraServer"
            java.lang.String r1 = "disConnect with client: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r1.concat(r0)
            com.ss.android.ttvecamera.o.a(r2, r0)
            java.lang.Object r2 = r5.mLock
            monitor-enter(r2)
            com.ss.android.ttvecamera.TECameraCapture r0 = r5.mCameraClient     // Catch:{ all -> 0x0057 }
            if (r0 != r6) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            r1 = 0
            r5.mCameraClient = r1     // Catch:{ all -> 0x0057 }
            android.os.Handler r0 = r5.mHandler     // Catch:{ all -> 0x0057 }
            r0.removeCallbacksAndMessages(r1)     // Catch:{ all -> 0x0057 }
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            r5.cachedClosePrivacyCert = r8
            r5.close(r7, r8)
            if (r7 == 0) goto L_0x003b
            int r0 = r5.decreaseClientCount()
            if (r0 != 0) goto L_0x004b
            int r0 = r5.destroy()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x003b:
            android.os.Handler r1 = r5.mMainHandler
            java.lang.Runnable r0 = r5.mCheckCloseTask
            r1.removeCallbacks(r0)
            android.os.Handler r3 = r5.mMainHandler
            java.lang.Runnable r2 = r5.mCheckCloseTask
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L_0x004b:
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0050:
            r0 = -100
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0057:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.k.disConnect(com.ss.android.ttvecamera.TECameraCapture, boolean, com.bytedance.bpea.basics.PrivacyCert):int");
    }

    public final int queryZoomAbility(final TECameraCapture tECameraCapture, final l.p pVar, final boolean z) {
        MethodCollector.i(4460);
        if (!a(tECameraCapture)) {
            MethodCollector.o(4460);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass19 */

                static {
                    Covode.recordClassIndex(37932);
                }

                public final void run() {
                    k.this.queryZoomAbility(tECameraCapture, pVar, z);
                }
            });
        } else {
            o.a("TECameraServer", "queryZoomAbility...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(pVar, z);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4460);
                    throw th;
                }
            }
        }
        MethodCollector.o(4460);
        return 0;
    }

    public final void setWhileBalance(final TECameraCapture tECameraCapture, final boolean z, final String str) {
        MethodCollector.i(167);
        if (!a(tECameraCapture)) {
            MethodCollector.o(167);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass31 */

                static {
                    Covode.recordClassIndex(37946);
                }

                public final void run() {
                    k.this.setWhileBalance(tECameraCapture, z, str);
                }
            });
            MethodCollector.o(167);
        } else {
            synchronized (this.mStateLock) {
                try {
                    o.a("TECameraServer", "setWhileBalance...");
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.a(str);
                    }
                } finally {
                    MethodCollector.o(167);
                }
            }
        }
    }

    public final int startZoom(TECameraCapture tECameraCapture, float f2, l.p pVar) {
        Message obtainMessage;
        if (!a(tECameraCapture)) {
            o.d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        g gVar = this.mCameraInstance;
        if (gVar == null) {
            o.d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            o.c("TECameraServer", "camera is null, no need to start zoom");
            return -105;
        }
        float abs = Math.abs(f2 - this.mCurrentZoom);
        if (Math.abs(f2 - gVar.x) < 0.1f) {
            f2 = gVar.x;
        } else if (Math.abs(f2) < 0.1f) {
            f2 = 0.0f;
        } else if (abs < 0.1f) {
            return 0;
        }
        this.mCurrentZoom = f2;
        Handler handler = this.mHandler;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            obtainMessage = new Message();
        } else {
            obtainMessage = handler.obtainMessage();
        }
        obtainMessage.what = 1;
        obtainMessage.arg1 = (int) (f2 * 100.0f);
        obtainMessage.obj = pVar;
        this.mHandler.sendMessage(obtainMessage);
        return 0;
    }

    public final int zoomV2(final TECameraCapture tECameraCapture, final float f2, final l.p pVar) {
        MethodCollector.i(4549);
        if (!a(tECameraCapture)) {
            o.d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            MethodCollector.o(4549);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.k.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(37936);
                }

                public final void run() {
                    k.this.zoomV2(tECameraCapture, f2, pVar);
                }
            });
        } else {
            o.a("TECameraServer", "zoomV2...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.b(f2, pVar);
                    }
                    if (this.mFirstZoom) {
                        this.mCameraEvent.a(114, 0, "zoomV2");
                        this.mFirstZoom = false;
                    }
                } finally {
                    MethodCollector.o(4549);
                }
            }
        }
        return 0;
    }

    public final int open(final TECameraCapture tECameraCapture, final l lVar, final PrivacyCert privacyCert) {
        int i2;
        MethodCollector.i(3408);
        if (!a(tECameraCapture)) {
            MethodCollector.o(3408);
            return -108;
        } else if (this.mIsCameraPendingClose) {
            o.d("TECameraServer", "pending close");
            MethodCollector.o(3408);
            return -105;
        } else if (!lVar.af || !this.mOnBackGround) {
            Handler handler = this.mHandler;
            if (handler == null) {
                o.d("TECameraServer", "open, mHandler is null!");
                MethodCollector.o(3408);
                return -112;
            } else if (this.mIsCameraPendingClose) {
                o.d("TECameraServer", "had called disConnect(), abandon open camera!");
                MethodCollector.o(3408);
                return -113;
            } else {
                if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
                    this.mCameraSettings = lVar;
                    o.a("TECameraServer", "is force close camera=" + this.mCameraSettings.O + ", Camera2Detect=" + this.mCameraSettings.ao);
                    this.mCheckCloseTask = new Runnable() {
                        /* class com.ss.android.ttvecamera.k.AnonymousClass23 */

                        static {
                            Covode.recordClassIndex(37937);
                        }

                        public final void run() {
                            if (k.this.mCurrentCameraState > 1) {
                                o.a("TECameraServer", "close camera in main thread");
                                if (!k.this.mCameraSettings.O || k.this.mCameraInstance == null) {
                                    k kVar = k.this;
                                    kVar.realCloseCamera(kVar.cachedClosePrivacyCert);
                                } else {
                                    k.this.mCameraInstance.a(k.this.cachedClosePrivacyCert);
                                }
                                if (k.this.decreaseClientCount() == 0) {
                                    k.this.destroy();
                                    return;
                                }
                                return;
                            }
                            k.this.mMainHandler.postDelayed(this, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                    };
                    this.mCurrentZoom = 0.0f;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = lVar.u;
                    }
                    synchronized (this.mStateLock) {
                        try {
                            if (this.mCurrentCameraState != 0) {
                                o.c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
                                if (this.mCurrentCameraState != 1) {
                                    this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                                }
                                return 0;
                            }
                            updateCameraState(1);
                            if (this.mCameraInstance == null) {
                                this.mCameraInstance = b();
                                if (this.mCameraInstance == null) {
                                    if (this.mCameraSettings.f61800c == 11) {
                                        updateCameraState(0);
                                        this.mCameraEvent.a(this.mCameraSettings.f61800c, -428);
                                    } else {
                                        updateCameraState(0);
                                        this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                    }
                                    MethodCollector.o(3408);
                                    return -1;
                                }
                            }
                            this.mBeginTime = System.currentTimeMillis();
                            if (this.mEnableVBoost) {
                                new b.a(b.EnumC1343b.BOOST_CPU, this.mVBoostTimeoutMS);
                                i2 = this.mCameraInstance.a(this.mCameraSettings, privacyCert);
                                new b.a(b.EnumC1343b.RESTORE_CPU);
                            } else {
                                i2 = this.mCameraInstance.a(this.mCameraSettings, privacyCert);
                            }
                            if (i2 != 0) {
                                o.c("TECameraServer", "Open camera failed, ret = ".concat(String.valueOf(i2)));
                            }
                        } finally {
                            MethodCollector.o(3408);
                        }
                    }
                } else {
                    final long currentTimeMillis = System.currentTimeMillis();
                    handler.post(new Runnable() {
                        /* class com.ss.android.ttvecamera.k.AnonymousClass12 */

                        static {
                            Covode.recordClassIndex(37925);
                        }

                        public final void run() {
                            o.b("TECameraServer", "Push open task cost: " + (System.currentTimeMillis() - currentTimeMillis));
                            j.a("te_record_camera_push_open_task_time", System.currentTimeMillis() - currentTimeMillis);
                            k.this.open(tECameraCapture, lVar, privacyCert);
                            o.a("TECameraServer", "Camera open cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        }
                    });
                }
                MethodCollector.o(3408);
                return 0;
            }
        } else {
            o.d("TECameraServer", "in background");
            MethodCollector.o(3408);
            return -105;
        }
    }

    public final int switchCamera(final TECameraCapture tECameraCapture, final int i2, final PrivacyCert privacyCert) {
        MethodCollector.i(4091);
        o.a("TECameraServer", "switchCamera: ".concat(String.valueOf(i2)));
        if (!a(tECameraCapture)) {
            MethodCollector.o(4091);
            return -108;
        }
        l lVar = this.mCameraSettings;
        if (lVar == null) {
            o.d("TECameraServer", "switchCamera failed: ".concat(String.valueOf(i2)));
            MethodCollector.o(4091);
            return -108;
        } else if (lVar.f61802e == i2) {
            MethodCollector.o(4091);
            return -423;
        } else {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.k.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(37944);
                    }

                    public final void run() {
                        k.this.switchCamera(tECameraCapture, i2, privacyCert);
                    }
                });
            } else {
                synchronized (this.mStateLock) {
                    try {
                        if (this.mCurrentCameraState == 1) {
                            this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                            return -105;
                        }
                        this.mCameraSettings.f61802e = i2;
                        this.mCurrentZoom = 0.0f;
                        if (this.mCameraInstance == null) {
                            this.mCameraInstance = b();
                            if (this.mCameraInstance == null) {
                                this.mCurrentCameraState = 0;
                                if (this.mCameraSettings.f61800c == 11) {
                                    this.mCameraEvent.a(this.mCameraSettings.f61800c, -428);
                                } else {
                                    this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                }
                                MethodCollector.o(4091);
                                return -1;
                            }
                        }
                        if (this.mCurrentCameraState != 0) {
                            this.mCameraInstance.b(privacyCert);
                            updateCameraState(0);
                        }
                        updateCameraState(1);
                        if (this.mRetryCnt < 0) {
                            this.mRetryCnt = this.mCameraSettings.u;
                        }
                        this.mBeginTime = System.currentTimeMillis();
                        int a2 = this.mCameraInstance.a(this.mCameraSettings, privacyCert);
                        if (a2 != 0) {
                            this.mCameraObserver.onError(a2, "Switch camera failed @" + this.mCameraSettings.f61800c + ",face:" + this.mCameraSettings.f61802e + " " + this.mCameraSettings.p.toString());
                        }
                    } finally {
                        MethodCollector.o(4091);
                    }
                }
            }
            MethodCollector.o(4091);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        close(r10);
        open(r8, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int switchCamera(final com.ss.android.ttvecamera.TECameraCapture r8, final com.ss.android.ttvecamera.l r9, final com.bytedance.bpea.basics.PrivacyCert r10) {
        /*
        // Method dump skipped, instructions count: 463
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.k.switchCamera(com.ss.android.ttvecamera.TECameraCapture, com.ss.android.ttvecamera.l, com.bytedance.bpea.basics.PrivacyCert):int");
    }

    public final int takePicture(TECameraCapture tECameraCapture, final int i2, final int i3, final l.AbstractC1345l lVar) {
        if (!a(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.k.AnonymousClass9 */

            static {
                Covode.recordClassIndex(37975);
            }

            public final void run() {
                MethodCollector.i(2663);
                synchronized (k.this.mStateLock) {
                    try {
                        if (k.this.mCurrentCameraState != 3) {
                            String str = "Can not takePicture on state : " + k.this.mCurrentCameraState;
                            k.this.mCameraObserver.onError(-105, str);
                            o.d("TECameraServer", str);
                            if (lVar != null) {
                                new Exception(str);
                            }
                            return;
                        }
                        if (k.this.mCameraSettings.f61800c == 1) {
                            k.this.updateCameraState(2);
                        }
                        k.this.mCameraInstance.a(i2, i3, lVar);
                        MethodCollector.o(2663);
                    } finally {
                        MethodCollector.o(2663);
                    }
                }
            }
        });
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r4 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        com.ss.android.ttvecamera.o.a("TECameraServer", "reopen camera.");
        close(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r6.mIsCameraPendingClose = false;
        r6.cachedOpenPrivacyCert = r11;
        r0 = open(r7, r9, r11);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2574);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int connect(com.ss.android.ttvecamera.TECameraCapture r7, com.ss.android.ttvecamera.TECameraCapture.a r8, com.ss.android.ttvecamera.l r9, com.ss.android.ttvecamera.TECameraCapture.c r10, com.bytedance.bpea.basics.PrivacyCert r11) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.k.connect(com.ss.android.ttvecamera.TECameraCapture, com.ss.android.ttvecamera.TECameraCapture$a, com.ss.android.ttvecamera.l, com.ss.android.ttvecamera.TECameraCapture$c, com.bytedance.bpea.basics.PrivacyCert):int");
    }
}
