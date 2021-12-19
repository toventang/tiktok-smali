package com.ss.avframework.opengl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES10;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class GLThreadManager {
    private static boolean sForceFinish = true;
    private static GLThreadManager sGLThreadManager;
    private static int sGLVersion = 2;
    public static String sGPUGLVersion = "";
    public static String sGPURender = "";
    public static String sGPUVendor = "";
    public static boolean sNeedFinish;
    public EGLContext mEGLContext;
    public int[] mEGLVersion = {0, 0};
    private ArrayList<String> mGlFinishDeviceList;
    public Handler mHandler;
    private AtomicInteger mInteger = new AtomicInteger(1);

    private static native boolean nativeIsEnableGlobalGlContextMutex();

    private static native void nativeLockGlShareContext();

    private static native void nativeSetEnableGlobalGlContextMutex(boolean z);

    public static native void nativeSetupOpenGlRecycler();

    private static native void nativeUnLockGlShareContext();

    public static int getConfigGLVersion() {
        return sGLVersion;
    }

    public static String getGPUGLVersoin() {
        return sGPUGLVersion;
    }

    public static String getGPURender() {
        return sGPURender;
    }

    public static String getGPUVendor() {
        return sGPUVendor;
    }

    public static boolean isEnableForceGLFinish() {
        return sForceFinish;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
    }

    public static EGLContext getEGLContext() {
        return get().mEGLContext;
    }

    public static int[] getEGLVersion() {
        return get().mEGLVersion;
    }

    public static Handler getMainGlHandle() {
        return get().mHandler;
    }

    public static GLThreadManager get() {
        return get(null, getConfigGLVersion());
    }

    public static long getNativeEGLContext() {
        return toNativeEGLContext(getEGLContext());
    }

    public static boolean isEnableGlobalGlContextMutex() {
        MethodCollector.i(12492);
        boolean nativeIsEnableGlobalGlContextMutex = nativeIsEnableGlobalGlContextMutex();
        MethodCollector.o(12492);
        return nativeIsEnableGlobalGlContextMutex;
    }

    public static boolean isNeedFinish() {
        if (sForceFinish || sNeedFinish) {
            return true;
        }
        return false;
    }

    public static void lockSharedGLContext() {
        MethodCollector.i(12484);
        nativeLockGlShareContext();
        MethodCollector.o(12484);
    }

    public static void unlockSharedGLContext() {
        MethodCollector.i(12486);
        nativeUnLockGlShareContext();
        MethodCollector.o(12486);
    }

    public void fillGPUDescription() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.opengl.GLThreadManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100529);
            }

            public void run() {
                try {
                    GLThreadManager.sGPUGLVersion = GLES10.glGetString(7938);
                    GLThreadManager.sGPURender = GLES10.glGetString(7937);
                    GLThreadManager.sGPUVendor = GLES10.glGetString(7936);
                    GLThreadManager.sNeedFinish = GLThreadManager.this.isContainVendoOnBlackList(GLThreadManager.sGPURender);
                } catch (Throwable th) {
                    AVLog.ioe("GLThreadManager", th.getMessage(), th);
                }
                AVLog.ioi("GLThreadManager", "GPU version: " + GLThreadManager.sGPUGLVersion);
                AVLog.ioi("GLThreadManager", "GPU Render: " + GLThreadManager.sGPURender);
                AVLog.ioi("GLThreadManager", "GPU Vendor: " + GLThreadManager.sGPUVendor);
                AVLog.ioi("GLThreadManager", "GPU render with finish: " + GLThreadManager.isNeedFinish());
                AVLog.ioi("GLThreadManager", "GPU render with global mutex: " + GLThreadManager.isEnableGlobalGlContextMutex());
            }
        });
    }

    /* access modifiers changed from: package-private */
    public class MainGlThread extends HandlerThread {
        static {
            Covode.recordClassIndex(100530);
        }

        public Handler getHandler() {
            Looper looper = getLooper();
            if (GLThreadManager.this.mHandler == null && looper != null) {
                GLThreadManager.this.mHandler = new Handler(looper);
            }
            return GLThreadManager.this.mHandler;
        }

        public void run() {
            MethodCollector.i(10374);
            AVLog.ioi("GLThreadManager", "thread " + getName() + " is runing...");
            super.run();
            GlUtil.nativeDetachThreadToOpenGl();
            AVLog.ioi("GLThreadManager", "thread " + getName() + " is exit.");
            GLTracer.removeTraceStack();
            MethodCollector.o(10374);
        }

        public MainGlThread(String str) {
            super(str);
            GLTracer.traceStack(this);
        }
    }

    static {
        Covode.recordClassIndex(100527);
    }

    public static synchronized void dispose() {
        synchronized (GLThreadManager.class) {
            MethodCollector.i(12728);
            AVLog.iow("GLThreadManager", "GLThreadManager dispose");
            GLThreadManager gLThreadManager = sGLThreadManager;
            if (gLThreadManager != null) {
                gLThreadManager.decrementRef();
            }
            MethodCollector.o(12728);
        }
    }

    private void initNeedGlFinishDeviceList() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.mGlFinishDeviceList = arrayList;
        arrayList.add("Adreno (TM) 506");
        this.mGlFinishDeviceList.add("Mali-T860");
    }

    public void addRef() {
        AVLog.iow("GLThreadManager", "addRef ".concat(String.valueOf(this.mInteger.incrementAndGet())));
    }

    public void decrementRef() {
        Looper looper;
        int decrementAndGet = this.mInteger.decrementAndGet();
        if (decrementAndGet <= 0) {
            AVLog.iow("GLThreadManager", "Release GLManager ...");
            Handler handler = this.mHandler;
            if (!(handler == null || (looper = handler.getLooper()) == null)) {
                sGLThreadManager = null;
                int i2 = Build.VERSION.SDK_INT;
                looper.quitSafely();
            }
        }
        AVLog.iow("GLThreadManager", "decrementRef ".concat(String.valueOf(decrementAndGet)));
    }

    public static void enableForceGLFinish(boolean z) {
        sForceFinish = z;
    }

    public static void setGLVersion(int i2) {
        sGLVersion = i2;
    }

    public static synchronized void addRefWithEnableAutoGlRecycler(boolean z) {
        synchronized (GLThreadManager.class) {
            MethodCollector.i(12848);
            AVLog.iow("GLThreadManager", "GLThreadManager start by livecoreImpl initialization");
            GLThreadManager gLThreadManager = sGLThreadManager;
            if (gLThreadManager != null) {
                gLThreadManager.addRef();
            }
            MethodCollector.o(12848);
        }
    }

    public static long toNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return eGLContext.getNativeHandle();
        }
        int i2 = Build.VERSION.SDK_INT;
        return (long) eGLContext.getHandle();
    }

    public static void enableGlobalGlContextMutex(boolean z) {
        MethodCollector.i(12491);
        nativeSetEnableGlobalGlContextMutex(z);
        AVLog.iod("GLThreadManager", "Using global mutex " + isEnableGlobalGlContextMutex());
        MethodCollector.o(12491);
    }

    public boolean isContainVendoOnBlackList(String str) {
        ArrayList<String> arrayList = this.mGlFinishDeviceList;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<String> it = this.mGlFinishDeviceList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private GLThreadManager(EGLContext eGLContext, int i2) {
        MediaEngineFactory.loadLibrary();
        initNeedGlFinishDeviceList();
        setupSharedOpenGlContext(eGLContext, i2);
    }

    public static GLThreadManager get(EGLContext eGLContext, int i2) {
        MethodCollector.i(12726);
        if (sGLThreadManager == null) {
            synchronized (GLThreadManager.class) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (sGLThreadManager == null) {
                        sGLThreadManager = new GLThreadManager(eGLContext, i2);
                    } else if (eGLContext != null) {
                        AVLog.iow("GLThreadManager", "OpenGl env already init and ignore shared context");
                    }
                    AVLog.ioi("GLThreadManager", "Create GLThreadManager cost time " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                } catch (Throwable th) {
                    MethodCollector.o(12726);
                    throw th;
                }
            }
        }
        GLThreadManager gLThreadManager = sGLThreadManager;
        MethodCollector.o(12726);
        return gLThreadManager;
    }

    private void setupSharedOpenGlContext(EGLContext eGLContext, final int i2) {
        final int[] iArr = {0};
        MainGlThread mainGlThread = new MainGlThread("OpenGlMgrThread");
        mainGlThread.start();
        Handler handler = mainGlThread.getHandler();
        this.mHandler = handler;
        if (handler != null) {
            final long nativeEGLContext = toNativeEGLContext(eGLContext);
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.ss.avframework.opengl.GLThreadManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100528);
                }

                public void run() {
                    MethodCollector.i(10734);
                    AVLog.ioi("GLThreadManager", "Init GLThreadManager with context " + nativeEGLContext + " version " + i2);
                    iArr[0] = GlUtil.nativeAttachThreadToOpenGl(nativeEGLContext, i2, 0);
                    int i2 = Build.VERSION.SDK_INT;
                    GLThreadManager.this.mEGLContext = EGL14.eglGetCurrentContext();
                    int[] iArr = {0, 0};
                    if (GLThreadManager.this.mEGLContext != null) {
                        EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), GLThreadManager.this.mEGLContext, 12440, iArr, 0);
                        GLThreadManager.this.mEGLVersion = iArr;
                        GLThreadManager.nativeSetupOpenGlRecycler();
                        GLThreadManager.this.fillGPUDescription();
                    }
                    MethodCollector.o(10734);
                }
            });
            AVLog.ioi("GLThreadManager", "EGLClient version " + (this.mEGLVersion[0] + "." + this.mEGLVersion[1]) + " result:" + iArr[0]);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! not found handler");
        AVLog.ioe("GLThreadManager", androidRuntimeException.getMessage(), androidRuntimeException);
        throw androidRuntimeException;
    }
}
