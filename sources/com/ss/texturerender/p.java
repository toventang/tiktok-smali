package com.ss.texturerender;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.texturerender.VideoSurface;
import com.ss.texturerender.a.d;
import com.ss.texturerender.a.f;
import com.ss.texturerender.a.g;
import com.ss.texturerender.b.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public final class p extends SurfaceTexture implements Serializable {
    public static final int ERROR_SR_EXE_FAIL = 2;
    public static final int ERROR_SR_INIT_FAIL = 1;

    /* renamed from: a  reason: collision with root package name */
    private static int[] f151865a = {480, 540, 544, 576, 576, 576};

    /* renamed from: b  reason: collision with root package name */
    private static int[] f151866b = {864, 960, 960, 1024, 648, 1016};
    private d mConfig = new d();
    private Looper mCreateLooper;
    private int mDropCount = 0;
    private EGLConfig mEglConfig;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private HashMap<Surface, EGLSurface> mExtraSurfaceMap;
    private long mIdleTimeStamp;
    private boolean mIgnoreSRResCheck = false;
    private boolean mIsMakeCurrent = false;
    public volatile int mIsMirrorHorizontal = 0;
    public volatile int mIsMirrorVertical = 0;
    private boolean mIsPaused = false;
    private boolean mIsPreRender = false;
    private volatile boolean mIsRelease = false;
    public volatile int mLayoutMode = 1;
    public volatile float mLayoutRatio = 0.5f;
    private ReentrantLock mLock;
    private long mObjectId;
    private VideoSurface mOffScreenSurface = null;
    private a mOnFrameAvailableListener;
    private CopyOnWriteArrayList<Bundle> mParamList;
    private Handler mRenderHandler;
    private Bundle mRenderMsgBundle;
    private Surface mRenderSurface = null;
    public volatile int mRotationType = 0;
    private Bundle mSaveFrameBundle = new Bundle();
    private int mSerial = 0;
    private long mStartPlayTimeNanos = -1;
    private int mState = 3;
    private volatile int mSuperOpen;
    private Message mSyncMsg = new Message();
    private int mSyncUpdateSurface = 0;
    private int mTexHeight;
    private int mTexType;
    private int mTexWidth;
    private b mTextureId;
    private LinkedList<f> mTextureQueue = new LinkedList<>();
    private n mTextureRenderer;
    private long mTid;
    private Surface mUpdateSurface = null;
    private long mUpdateSurfaceTime;
    private HashMap<Integer, Integer> mUsingEffect = new HashMap<>();
    private int mViewportHeight = 0;
    private int mViewportWidth = 0;

    public final void onFocusLoss() {
        this.mIsMakeCurrent = false;
    }

    public final void preRender() {
        this.mIsPreRender = true;
    }

    public final d getEffectConfig() {
        return this.mConfig;
    }

    public final HashMap<Surface, EGLSurface> getExtraRealSurfaces() {
        return this.mExtraSurfaceMap;
    }

    public final long getOjbectId() {
        return this.mObjectId;
    }

    public final CopyOnWriteArrayList<Bundle> getParamList() {
        return this.mParamList;
    }

    public final Surface getRenderSurface() {
        return this.mRenderSurface;
    }

    public final int getSerial() {
        return this.mSerial;
    }

    public final long getSurfaceUpdateTime() {
        return this.mUpdateSurfaceTime;
    }

    public final int getTexHeight() {
        return this.mTexHeight;
    }

    public final b getTexId() {
        return this.mTextureId;
    }

    public final int getTexWidth() {
        return this.mTexWidth;
    }

    public final Surface getUpdateSurface() {
        return this.mUpdateSurface;
    }

    public final int getUseSr() {
        return this.mSuperOpen;
    }

    public final boolean isPreRender() {
        return this.mIsPreRender;
    }

    public final boolean isRelease() {
        return this.mIsRelease;
    }

    /* access modifiers changed from: package-private */
    public static class a implements SurfaceTexture.OnFrameAvailableListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f151867a;

        static {
            Covode.recordClassIndex(101268);
        }

        private a() {
            this.f151867a = true;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (this.f151867a) {
                ((p) surfaceTexture).sendRenderMsg(1);
            } else {
                ((p) surfaceTexture).sendRenderMsg(0);
            }
        }
    }

    public final void lock() {
        this.mLock.lock();
    }

    public final void resetFlag() {
        this.mUsingEffect.clear();
    }

    public final void unlock() {
        this.mLock.unlock();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.SurfaceTexture, java.lang.Object
    public final void finalize() {
        l.a("VideoSurfaceTexture", "finalize");
        releaseInternal();
        super.finalize();
    }

    public final int getViewportHeight() {
        int consumerHeight = getConsumerHeight(this.mEglSurface);
        if (this.mViewportHeight != consumerHeight) {
            this.mViewportHeight = consumerHeight;
        }
        return this.mViewportHeight;
    }

    public final int getViewportWidth() {
        int consumerWidth = getConsumerWidth(this.mEglSurface);
        if (this.mViewportWidth != consumerWidth) {
            this.mViewportWidth = consumerWidth;
        }
        return this.mViewportWidth;
    }

    public final boolean isMakeCurrent() {
        if (!this.mIsMakeCurrent || this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public final boolean makeCurrent() {
        if (!makeCurrent(this.mEglSurface)) {
            return false;
        }
        this.mIsMakeCurrent = true;
        return true;
    }

    public final void release() {
        l.a("VideoSurfaceTexture", "release");
        releaseInternal();
        super.release();
    }

    public final boolean couldForceRelease() {
        if (SystemClock.elapsedRealtime() - this.mIdleTimeStamp > 120000) {
            return true;
        }
        return false;
    }

    public final boolean render() {
        if (!eglSwapBuffer(this.mEglSurface)) {
            return false;
        }
        notifyRenderFrame(this.mSerial);
        return true;
    }

    static {
        Covode.recordClassIndex(101267);
    }

    public final synchronized VideoSurface getOffScreenSurface() {
        MethodCollector.i(11627);
        if (this.mIsRelease) {
            MethodCollector.o(11627);
            return null;
        }
        if (this.mOffScreenSurface == null) {
            this.mOffScreenSurface = new VideoSurface(this);
        }
        this.mIdleTimeStamp = -9223372036854775807L;
        VideoSurface videoSurface = this.mOffScreenSurface;
        MethodCollector.o(11627);
        return videoSurface;
    }

    public final boolean isAlive() {
        l.a("VideoSurfaceTexture", "is alive = " + this.mOffScreenSurface + ", eglsur = " + this.mEglSurface);
        if (this.mOffScreenSurface == null && this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public final synchronized void releaseAllExtraSurface_l() {
        MethodCollector.i(11446);
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = 3;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            obtainMessage.setData(bundle);
            this.mRenderHandler.sendMessage(obtainMessage);
        }
        MethodCollector.o(11446);
    }

    public final boolean needDrop() {
        int i2;
        long j2 = this.mStartPlayTimeNanos;
        if (j2 > 0 && j2 > getTimestamp() && (i2 = this.mDropCount) < 5) {
            this.mDropCount = i2 + 1;
            l.a("VideoSurfaceTexture", "texture" + this + " previous play period,drop count:" + this.mDropCount);
            return true;
        } else if (!this.mIsPaused) {
            return false;
        } else {
            l.a("VideoSurfaceTexture", "texture" + this + " is paused");
            return true;
        }
    }

    public final void releaseAllExtraSurface() {
        Iterator<Map.Entry<Surface, EGLSurface>> it = this.mExtraSurfaceMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Surface, EGLSurface> next = it.next();
            if (!(next.getValue() == EGL14.EGL_NO_SURFACE || next.getValue() == null)) {
                EGL14.eglDestroySurface(this.mEglDisplay, next.getValue());
                l.a("VideoSurfaceTexture", "releaseAllExtraSurface sf:" + this + ", eglSurface:" + next.getValue());
            }
            it.remove();
        }
    }

    public final synchronized void releaseInternal() {
        MethodCollector.i(10797);
        if (!this.mIsRelease) {
            try {
                lock();
                l.a("VideoSurfaceTexture", this + " release internal");
                this.mIsRelease = true;
                this.mTextureId.b();
                this.mRenderHandler = null;
                this.mCreateLooper = null;
                g gVar = this.mTextureRenderer.f151854m;
                while (this.mTextureQueue.size() > 0) {
                    f poll = this.mTextureQueue.poll();
                    if (gVar != null) {
                        gVar.a(poll);
                    } else {
                        g.b(poll.f151795a);
                    }
                    l.a("VideoSurfaceTexture", "return fbotex:" + poll.f151795a + ",st:" + this);
                }
                l.a("VideoSurfaceTexture", this + " release internal done");
            } finally {
                unlock();
                MethodCollector.o(10797);
            }
        } else {
            MethodCollector.o(10797);
        }
    }

    public final void notifyError(int i2) {
        try {
            this.mOffScreenSurface.a(i2);
        } catch (Exception unused) {
        }
    }

    public final boolean isCurrentObject(long j2) {
        if (this.mObjectId == j2) {
            return true;
        }
        return false;
    }

    public final void notifyRenderFrame(int i2) {
        if (i2 == this.mSerial) {
            try {
                this.mOffScreenSurface.a(i2, getTimestamp());
            } catch (Exception unused) {
            }
        }
    }

    public final int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public final int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void ignoreSRResolutionCheck(boolean z) {
        this.mIgnoreSRResCheck = z;
        l.a("VideoSurfaceTexture", "ignoreSRResolutionCheck:".concat(String.valueOf(z)));
    }

    public final boolean eglSwapBuffer(EGLSurface eGLSurface) {
        if (EGL14.eglSwapBuffers(this.mEglDisplay, eGLSurface)) {
            return true;
        }
        notifyError(EGL14.eglGetError());
        l.a("VideoSurfaceTexture", this + "swap buffer failed:" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return false;
    }

    public final void release(boolean z) {
        l.a("VideoSurfaceTexture", "release " + this + ", glthread = " + z);
        releaseOffScreenSurface(z);
        release();
    }

    public final void sendRenderMsg(int i2) {
        MethodCollector.i(10640);
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            try {
                Message obtainMessage = handler.obtainMessage(2);
                obtainMessage.obj = this;
                obtainMessage.arg1 = i2;
                if (!this.mSaveFrameBundle.isEmpty()) {
                    synchronized (this.mSaveFrameBundle) {
                        try {
                            obtainMessage.setData(this.mSaveFrameBundle);
                            this.mSaveFrameBundle = new Bundle();
                        } catch (Throwable th) {
                            MethodCollector.o(10640);
                            throw th;
                        }
                    }
                }
                obtainMessage.sendToTarget();
                MethodCollector.o(10640);
                return;
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(10640);
    }

    public final synchronized void setSuperResolutionMode(int i2) {
        MethodCollector.i(10968);
        l.a("VideoSurfaceTexture", this + " set sr = " + i2);
        this.mSuperOpen = i2;
        this.mConfig.a(5, i2);
        MethodCollector.o(10968);
    }

    public final synchronized void updateVideoState(int i2) {
        MethodCollector.i(11795);
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = this;
            obtainMessage.arg1 = i2;
            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
        }
        MethodCollector.o(11795);
    }

    private static String a(Looper looper) {
        if (looper == null) {
            return null;
        }
        Thread thread = looper.getThread();
        if (thread != null) {
            return "Looper (" + thread.getName() + ", tid " + thread.getId() + ") {" + Integer.toHexString(System.identityHashCode(looper)) + "}";
        }
        return "Looper {" + Integer.toHexString(System.identityHashCode(looper)) + "}";
    }

    public final boolean canReuse(Looper looper) {
        StringBuilder sb;
        StringBuilder sb2;
        boolean z = false;
        try {
            if (looper == this.mCreateLooper) {
                z = true;
            }
            sb = new StringBuilder().append(this).append("ret = ").append(z).append(" looper =");
        } catch (Exception unused) {
            sb2 = new StringBuilder();
            sb = sb2.append(this).append("ret = false looper =");
            l.a("VideoSurfaceTexture", sb.append(a(looper)).append(", mlooper = ").append(a(this.mCreateLooper)).toString());
            return z;
        } catch (Throwable unused2) {
            sb2 = new StringBuilder();
            sb = sb2.append(this).append("ret = false looper =");
            l.a("VideoSurfaceTexture", sb.append(a(looper)).append(", mlooper = ").append(a(this.mCreateLooper)).toString());
            return z;
        }
        l.a("VideoSurfaceTexture", sb.append(a(looper)).append(", mlooper = ").append(a(this.mCreateLooper)).toString());
        return z;
    }

    public final EGLSurface createEGLWindowSurface(Surface surface) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (surface == null || !surface.isValid()) {
            return eGLSurface;
        }
        int[] iArr = {12344};
        try {
            l.a("VideoSurfaceTexture", this + ",create window surface from " + surface);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surface, iArr, 0);
            if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                return eglCreateWindowSurface;
            }
            notifyError(EGL14.eglGetError());
            l.a("VideoSurfaceTexture", "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return eglCreateWindowSurface;
        } catch (Exception unused) {
            notifyError(5);
            l.a("VideoSurfaceTexture", "createEGLWindowSurface exception failed");
            return EGL14.EGL_NO_SURFACE;
        }
    }

    public final void handleUpdateVideoState(int i2) {
        this.mState = i2;
        if (i2 != 1) {
            if (i2 == 2) {
                l.a("VideoSurfaceTexture", "TEXTURE_STATE_STOP mStartPlayTimeNanos:" + this.mStartPlayTimeNanos);
            } else if (i2 == 3) {
                this.mDropCount = 0;
                l.a("VideoSurfaceTexture", "TEXTURE_STATE_STOP");
            }
        } else if (this.mStartPlayTimeNanos <= 0) {
            this.mStartPlayTimeNanos = System.nanoTime();
            l.a("VideoSurfaceTexture", "TEXTURE_STATE_PLAYING mStartPlayTimeNanos:" + this.mStartPlayTimeNanos);
        }
    }

    public final void initExtraSurface(Surface surface) {
        l.a("VideoSurfaceTexture", "initExtraSurface begin sf:" + this + ", surface:" + surface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
        if (surface != null && !this.mExtraSurfaceMap.containsKey(surface)) {
            EGLSurface createEGLWindowSurface = createEGLWindowSurface(surface);
            this.mExtraSurfaceMap.put(surface, createEGLWindowSurface);
            l.a("VideoSurfaceTexture", "initExtraSurface end sf:" + this + ", eglSurface:" + createEGLWindowSurface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
        }
    }

    public final boolean makeCurrent(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            l.a("VideoSurfaceTexture", "no surface for make current");
            return false;
        }
        l.a("VideoSurfaceTexture", this + " make current again");
        GLES20.glFinish();
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            notifyError(EGL14.eglGetError());
            l.a("VideoSurfaceTexture", "make current failed:" + eGLSurface + " error:" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return false;
        }
        l.a("VideoSurfaceTexture", this + "make current done = " + this.mOffScreenSurface);
        return true;
    }

    public final void releaseExtraSurface(Surface surface) {
        l.a("VideoSurfaceTexture", "releaseExtraSurface begin sf:" + this + ", surface:" + surface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
        EGLSurface eGLSurface = this.mExtraSurfaceMap.get(surface);
        if (eGLSurface != null) {
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, eGLSurface);
            }
            this.mExtraSurfaceMap.remove(surface);
        }
        l.a("VideoSurfaceTexture", "releaseExtraSurface end sf:" + this + ", eglSurface:" + eGLSurface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
    }

    private void a(Handler handler) {
        this.mObjectId = new Random().nextLong();
        this.mRenderHandler = handler;
        this.mLock = new ReentrantLock();
        this.mCreateLooper = Looper.myLooper();
        this.mRenderMsgBundle = new Bundle();
        this.mEglSurface = EGL14.EGL_NO_SURFACE;
        this.mSuperOpen = 0;
        a aVar = new a((byte) 0);
        this.mOnFrameAvailableListener = aVar;
        setOnFrameAvailableListener(aVar);
        l.a("VideoSurfaceTexture", this + "gen a texture :" + this.mObjectId + ", thread id " + Thread.currentThread().getId() + ", looper = " + a(this.mCreateLooper));
    }

    public final void releaseOffScreenSurface(boolean z) {
        MethodCollector.i(11787);
        this.mOffScreenSurface = null;
        if (z) {
            this.mUpdateSurface = null;
            if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
                this.mEglSurface = EGL14.EGL_NO_SURFACE;
                this.mIsMakeCurrent = false;
            }
            releaseAllExtraSurface();
        } else {
            updateSurface(null);
            releaseAllExtraSurface_l();
        }
        if ((this.mTexType & 4) > 0) {
            synchronized (this.mSyncMsg) {
                try {
                    this.mSyncMsg.arg1 = Integer.MIN_VALUE;
                    this.mSyncMsg.notify();
                    l.a("VideoSurfaceTexture", "releaseOffScreenSurface mSyncMsg.notify");
                } catch (Throwable th) {
                    MethodCollector.o(11787);
                    throw th;
                }
            }
        }
        this.mIdleTimeStamp = SystemClock.elapsedRealtime();
        this.mState = 3;
        CopyOnWriteArrayList<Bundle> copyOnWriteArrayList = this.mParamList;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.mParamList = null;
        }
        l.a("VideoSurfaceTexture", this + "release offscreen surface done = " + this.mIdleTimeStamp);
        MethodCollector.o(11787);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r2 == 1) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setEffect(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.p.setEffect(android.os.Bundle):void");
    }

    public final synchronized void updateSurface(Surface surface) {
        MethodCollector.i(11441);
        l.a("VideoSurfaceTexture", "update Surface = " + this + ", " + surface + ", " + this.mUpdateSurface);
        if (surface != this.mUpdateSurface || surface == null || !surface.toString().contains("SurfaceTexture")) {
            this.mLock.lock();
            this.mUpdateSurface = surface;
            this.mLock.unlock();
            Handler handler = this.mRenderHandler;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(4);
                this.mRenderMsgBundle.putSerializable("texture", this);
                obtainMessage.setData(this.mRenderMsgBundle);
                if (this.mSyncUpdateSurface != 1) {
                    this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                } else {
                    Object obj = new Object();
                    obtainMessage.obj = obj;
                    synchronized (obj) {
                        try {
                            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                            try {
                                l.a("VideoSurfaceTexture", "update surface wait");
                                obj.wait(100);
                            } catch (Exception unused) {
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(11441);
                            throw th;
                        }
                    }
                }
            }
            l.a("VideoSurfaceTexture", "update Surface end");
            MethodCollector.o(11441);
            return;
        }
        l.a("VideoSurfaceTexture", "prevent the same surface???");
        MethodCollector.o(11441);
    }

    private void a(int i2, int i3) {
        Iterator<Bundle> it = this.mParamList.iterator();
        while (it.hasNext()) {
            Bundle next = it.next();
            if (next.getInt("action") == i2 && next.getInt("effect_type") == i3) {
                this.mParamList.remove(next);
                return;
            }
        }
    }

    public final boolean supportProcessResolution(int i2, int i3) {
        if (this.mIgnoreSRResCheck) {
            return true;
        }
        int i4 = 0;
        while (true) {
            int[] iArr = f151865a;
            if (i4 >= iArr.length) {
                l.a("VideoSurfaceTexture", "sr not support resolution width:" + i2 + ",height：" + i3);
                return false;
            } else if (iArr[i4] == i2 && f151866b[i4] == i3) {
                return true;
            } else {
                i4++;
            }
        }
    }

    public final void updateTexDimension(int i2, int i3) {
        l.a("VideoSurfaceTexture", "update tex dimension : " + i2 + ", " + i3);
        this.mTexWidth = i2;
        this.mTexHeight = i3;
    }

    public final int getIntOption(int i2, int i3) {
        if (i2 == 6) {
            i3 = 5;
        } else if (i2 == 10) {
            n nVar = this.mTextureRenderer;
            if (nVar == null || !nVar.q.f151792a) {
                return 0;
            }
            return 1;
        } else if (i2 == 23) {
            n nVar2 = this.mTextureRenderer;
            if (nVar2 == null || !nVar2.q.a(i3)) {
                return 0;
            }
            return 1;
        } else if (i2 == 15) {
            i3 = 1;
        } else if (i2 != 16) {
            if (i2 == 18) {
                n nVar3 = this.mTextureRenderer;
                if (nVar3 == null || !nVar3.q.f151793b) {
                    return 0;
                }
                return 1;
            } else if (i2 != 19) {
                return -1;
            }
        } else if (this.mConfig.a(1)) {
            return 1;
        } else {
            return 0;
        }
        Integer num = this.mUsingEffect.get(Integer.valueOf(i3));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final synchronized void pause(boolean z, boolean z2) {
        MethodCollector.i(11286);
        if (z2 && !z && this.mRenderHandler != null && (this.mIsPaused || this.mIsPreRender)) {
            l.a("VideoSurfaceTexture", this + "need active , post a resume msg");
            Message obtainMessage = this.mRenderHandler.obtainMessage(10);
            obtainMessage.obj = this;
            this.mIsPreRender = false;
            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
        }
        this.mIsPaused = z;
        l.a("VideoSurfaceTexture", this + "paused = " + this.mIsPaused);
        MethodCollector.o(11286);
    }

    public final synchronized void setExtraSurface(Surface surface, int i2) {
        MethodCollector.i(11443);
        l.a("VideoSurfaceTexture", "setExtraSurface = " + this + ", " + surface + ", opera:" + i2);
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = i2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            bundle.putParcelable("surface", surface);
            obtainMessage.setData(bundle);
            this.mRenderHandler.sendMessage(obtainMessage);
        }
        l.a("VideoSurfaceTexture", "setExtraSurface end");
        MethodCollector.o(11443);
    }

    public final boolean handleSurfaceChange(boolean z, EGLSurface eGLSurface) {
        boolean z2;
        this.mLock.lock();
        Surface surface = this.mRenderSurface;
        Surface surface2 = this.mUpdateSurface;
        if (surface != surface2 || surface2 == null || !surface2.toString().contains("SurfaceTexture")) {
            Surface surface3 = this.mRenderSurface;
            Surface surface4 = this.mUpdateSurface;
            if (surface3 != surface4 || surface4 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.mRenderSurface = surface4;
            this.mOnFrameAvailableListener.f151867a = false;
            a aVar = new a((byte) 0);
            this.mOnFrameAvailableListener = aVar;
            setOnFrameAvailableListener(aVar);
            this.mLock.unlock();
            boolean createEGLWindowSurface = createEGLWindowSurface(z, z2, eGLSurface);
            if (!createEGLWindowSurface) {
                return createEGLWindowSurface;
            }
            this.mSerial++;
            l.a("VideoSurfaceTexture", this + "update surface done serial = " + this.mSerial + "update time = " + this.mUpdateSurfaceTime);
            if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
                return true;
            }
            return false;
        }
        l.a("VideoSurfaceTexture", "surface change the same surface hashcode");
        this.mLock.unlock();
        return false;
    }

    public final Bitmap saveFrame(Bundle bundle, VideoSurface.c cVar) {
        MethodCollector.i(11794);
        Handler handler = this.mRenderHandler;
        if (handler == null) {
            MethodCollector.o(11794);
            return null;
        } else if (cVar != null) {
            synchronized (this.mSaveFrameBundle) {
                try {
                    if (!this.mSaveFrameBundle.isEmpty()) {
                        this.mSaveFrameBundle.clear();
                    }
                    this.mSaveFrameBundle.putAll(bundle);
                    this.mSaveFrameBundle.putSerializable("callback", cVar);
                } finally {
                    MethodCollector.o(11794);
                }
            }
            if (this.mState != 1) {
                sendRenderMsg(1);
            }
            return null;
        } else {
            Message obtainMessage = handler.obtainMessage(14);
            this.mRenderMsgBundle.putSerializable("texture", this);
            obtainMessage.setData(this.mRenderMsgBundle);
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    try {
                        this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                        message.wait(500);
                    } catch (Throwable th) {
                        MethodCollector.o(11794);
                        throw th;
                    }
                }
                if (message.obj == null && this.mRenderHandler.hasMessages(14)) {
                    l.a("VideoSurfaceTexture", "render thread is busy");
                }
                l.a("VideoSurfaceTexture", "save frame done = " + message.obj);
                Bitmap bitmap = (Bitmap) message.obj;
                MethodCollector.o(11794);
                return bitmap;
            } catch (InterruptedException unused) {
                MethodCollector.o(11794);
                return null;
            }
        }
    }

    public final synchronized void setOption(int i2, float f2) {
        MethodCollector.i(12092);
        if (i2 == 4) {
            l.a("VideoSurfaceTexture", "set TEXTURE_OPTION_SET_OVERLAY_RATIO ratio:".concat(String.valueOf(f2)));
            try {
                Message obtainMessage = this.mRenderHandler.obtainMessage(27);
                obtainMessage.obj = this;
                Bundle bundle = new Bundle();
                bundle.putFloat("overlay_ratio", f2);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
                MethodCollector.o(12092);
            } catch (Exception unused) {
                MethodCollector.o(12092);
            }
        } else if (i2 != 27) {
            switch (i2) {
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    Handler handler = this.mRenderHandler;
                    if (handler != null) {
                        try {
                            Message obtainMessage2 = handler.obtainMessage(35);
                            obtainMessage2.obj = this;
                            obtainMessage2.arg1 = i2;
                            Bundle bundle2 = new Bundle();
                            bundle2.putFloat("float_value", f2);
                            obtainMessage2.setData(bundle2);
                            obtainMessage2.sendToTarget();
                            MethodCollector.o(12092);
                            return;
                        } catch (Exception unused2) {
                            break;
                        }
                    } else {
                        MethodCollector.o(12092);
                        return;
                    }
            }
            MethodCollector.o(12092);
        } else {
            this.mLayoutRatio = f2;
            MethodCollector.o(12092);
        }
    }

    public final synchronized void setOption(int i2, int i3) {
        MethodCollector.i(11953);
        if (i2 != 2) {
            if (i2 == 3) {
                l.a("VideoSurfaceTexture", "set TEXTURE_OPTION_SET_OVERLAY_SYNC st:".concat(String.valueOf(this)));
                Message obtainMessage = this.mRenderHandler.obtainMessage(31);
                obtainMessage.obj = this;
                obtainMessage.arg1 = i3;
                obtainMessage.sendToTarget();
                MethodCollector.o(11953);
            } else if (i2 == 5) {
                this.mTexType = i3;
                MethodCollector.o(11953);
            } else if (i2 == 6) {
                this.mUsingEffect.put(5, Integer.valueOf(i3));
                MethodCollector.o(11953);
            } else if (i2 == 9) {
                this.mSyncUpdateSurface = i3;
                MethodCollector.o(11953);
            } else if (i2 == 15) {
                this.mUsingEffect.put(1, Integer.valueOf(i3));
                MethodCollector.o(11953);
            } else if (i2 == 16) {
                this.mConfig.a(1, i3);
                MethodCollector.o(11953);
            } else if (i2 == 25) {
                for (int i4 = 0; i4 < i3; i4++) {
                    sendRenderMsg(1);
                }
                MethodCollector.o(11953);
            } else if (i2 != 26) {
                switch (i2) {
                    case 29:
                        this.mRotationType = i3;
                        MethodCollector.o(11953);
                        return;
                    case 30:
                        this.mIsMirrorHorizontal = i3;
                        MethodCollector.o(11953);
                        return;
                    case 31:
                        this.mIsMirrorVertical = i3;
                        MethodCollector.o(11953);
                        return;
                    default:
                        Handler handler = this.mRenderHandler;
                        if (handler == null) {
                            MethodCollector.o(11953);
                            return;
                        }
                        try {
                            Message obtainMessage2 = handler.obtainMessage(34);
                            obtainMessage2.obj = this;
                            obtainMessage2.arg1 = i2;
                            obtainMessage2.arg2 = i3;
                            obtainMessage2.sendToTarget();
                            MethodCollector.o(11953);
                            return;
                        } catch (Exception unused) {
                            MethodCollector.o(11953);
                            return;
                        }
                }
            } else {
                this.mLayoutMode = i3;
                MethodCollector.o(11953);
            }
        } else if (i3 != 1) {
            MethodCollector.o(11953);
        } else {
            Handler handler2 = this.mRenderHandler;
            if (handler2 == null) {
                MethodCollector.o(11953);
                return;
            }
            try {
                Message obtainMessage3 = handler2.obtainMessage(33);
                obtainMessage3.obj = this;
                this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage3);
                MethodCollector.o(11953);
            } catch (Exception unused2) {
                MethodCollector.o(11953);
            }
        }
    }

    public final void bindEGLEnv(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLContext == null || eGLDisplay == null || eGLConfig == null) {
            throw new RuntimeException("no egl env for texture bind");
        }
        this.mEglContext = eGLContext;
        this.mEglDisplay = eGLDisplay;
        this.mEglConfig = eGLConfig;
    }

    public final void setOption(int i2, int i3, int i4) {
        if (i2 == 19 && i3 >= 0) {
            this.mUsingEffect.put(Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    public p(b bVar, Handler handler, n nVar) {
        super(bVar.c());
        bVar.a();
        this.mTextureId = bVar;
        bVar.d();
        a(handler);
        this.mExtraSurfaceMap = new HashMap<>();
        this.mTextureRenderer = nVar;
    }

    public final boolean createEGLWindowSurface(boolean z, boolean z2, EGLSurface eGLSurface) {
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            l.a("VideoSurfaceTexture", "destory previous surface = " + this.mEglSurface);
            if ((this.mRenderSurface == null && z) || z2) {
                l.a("VideoSurfaceTexture", "make current to dummy surface due to non render surface, force:".concat(String.valueOf(z2)));
                EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext);
            }
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
            this.mIsMakeCurrent = false;
            l.a("VideoSurfaceTexture", "destory previous surface done = " + this.mEglSurface);
        }
        EGLSurface createEGLWindowSurface = createEGLWindowSurface(this.mRenderSurface);
        this.mEglSurface = createEGLWindowSurface;
        if (createEGLWindowSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        try {
            makeCurrent();
            this.mUpdateSurfaceTime = System.nanoTime();
            return true;
        } catch (Exception unused) {
            l.a("VideoSurfaceTexture", "makeCurrent exception failed");
            return false;
        }
    }

    public final void frameMetaCallback(long j2, long j3, Map<Integer, String> map) {
        String str;
        MethodCollector.i(12418);
        l.a("VideoSurfaceTexture", "frameMetaCallback this:" + this + " pts:" + j2 + " mRenderHandler:" + this.mRenderHandler);
        Handler handler = this.mRenderHandler;
        if (handler == null) {
            MethodCollector.o(12418);
        } else if ((this.mTexType & 4) == 0) {
            MethodCollector.o(12418);
        } else if (this.mOffScreenSurface == null) {
            l.a("VideoSurfaceTexture", "mOffScreenSurface null,return this:".concat(String.valueOf(this)));
            MethodCollector.o(12418);
        } else {
            try {
                Message obtainMessage = handler.obtainMessage(32);
                Bundle bundle = new Bundle();
                bundle.putSerializable("update_frame_time", new a.C4064a(j2, j3));
                if (map != null) {
                    str = map.get(46);
                } else {
                    str = null;
                }
                bundle.putString("master_clock", str);
                bundle.putLong("master_clock_diff", SystemClock.elapsedRealtime());
                bundle.putSerializable("texture", this);
                obtainMessage.setData(bundle);
                obtainMessage.obj = this.mSyncMsg;
                synchronized (this.mSyncMsg) {
                    try {
                        obtainMessage.sendToTarget();
                        try {
                            this.mSyncMsg.wait();
                            if (!(this.mSyncMsg.arg1 == Integer.MIN_VALUE || ((long) this.mSyncMsg.arg1) == j2)) {
                                this.mSyncMsg.wait();
                            }
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    } finally {
                        MethodCollector.o(12418);
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                MethodCollector.o(12418);
            }
        }
    }

    public p(b bVar, boolean z, Handler handler, n nVar) {
        super(bVar.c(), z);
        bVar.a();
        this.mTextureId = bVar;
        bVar.d();
        a(handler);
        this.mExtraSurfaceMap = new HashMap<>();
        this.mTextureRenderer = nVar;
    }

    public final synchronized void setSuperResolutionConfig(int i2, String str, String str2, String str3, int i3, int i4, String str4) {
        MethodCollector.i(10966);
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(12);
            obtainMessage.obj = this;
            Bundle bundle = new Bundle();
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", i2);
            bundle.putInt("srMaxSizeWidth", i3);
            bundle.putInt("srMaxSizeHeight", i4);
            bundle.putString("kernelBinPath", str);
            bundle.putString("oclModleName", str2);
            bundle.putString("dspModleName", str3);
            bundle.putString("moduleName", str4);
            obtainMessage.setData(bundle);
            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
        }
        MethodCollector.o(10966);
    }
}
