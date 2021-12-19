package com.lynx.tasm.behavior.ui.canvas;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.b.b.b;
import com.he.lynx.Drawable;
import com.he.lynx.Helium;
import com.he.lynx.HeliumApp;
import com.he.lynx.TextureViewHolder;
import com.he.lynx.loader.MediaLoader;
import com.he.lynx.loader.TTAppLoader;
import com.he.lynx.player.IHeliumPlayer;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.f;
import com.lynx.tasm.j;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.h;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class LynxHelium extends CanvasProvider implements h.a {
    private static LynxHelium mInstance = new LynxHelium();
    private final HashMap<Long, ArrayList> mCanvasMap = new HashMap<>();
    private ContextWrapper mContextWrapper = null;
    public LynxHeliumEffectInfoInterface mEffect = null;
    private ErrorHandler mErrorHandler = null;
    private ArrayList<WeakReference<ErrorHandler>> mErrorHandlers = new ArrayList<>();
    private boolean mExternalPauseResume = false;
    private h mFrameRateControl;
    private volatile boolean mHasCanvasView = false;
    private Runnable mHeliumOnFrameRunable;
    private Runnable mHeliumPauseRunnable;
    private Runnable mHeliumResumeRunable;
    public HeliumApp mHeliumapp;
    private volatile boolean mInited;
    private LynxDelegateImpl mLynxDelegate;
    private f mNativeSoLoader = null;
    public PermissionHandler mPermissionHandler = null;
    private IHeliumPlayer.HeliumPlayerFactory mPlayerFactory = null;
    public TTAppLoader mResourceLoader;

    public interface ErrorHandler {
        static {
            Covode.recordClassIndex(35077);
        }

        void onReceivedError(j jVar);
    }

    public interface OnPermissionListener {
        static {
            Covode.recordClassIndex(35081);
        }

        void onPermissionDenied();

        void onPermissionGranted();
    }

    public interface PermissionHandler {
        static {
            Covode.recordClassIndex(35082);
        }

        void requestPermissions(String[] strArr, OnPermissionListener onPermissionListener);

        boolean verifyHasPermission(String[] strArr);
    }

    public static LynxHelium getInstance() {
        return mInstance;
    }

    public ContextWrapper contextWrapper() {
        return this.mContextWrapper;
    }

    public ErrorHandler errorHandler() {
        return this.mErrorHandler;
    }

    public boolean isHeliumInitSuccess() {
        return this.mInited;
    }

    public f libraryLoader() {
        return this.mNativeSoLoader;
    }

    public PermissionHandler permissionHandler() {
        return this.mPermissionHandler;
    }

    public void onPause() {
        this.mExternalPauseResume = true;
        pause();
    }

    public void onResume() {
        this.mExternalPauseResume = true;
        resume();
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean onValidateEffectFromJS() {
        return validateEffect(true);
    }

    /* access modifiers changed from: package-private */
    public class CanvasViewInfo {
        private WeakReference<LynxHeliumCanvas> weakCanvas;
        private WeakReference<LynxHeliumCanvasView> weakView;

        static {
            Covode.recordClassIndex(35076);
        }

        /* access modifiers changed from: package-private */
        public LynxHeliumCanvas getCanvas() {
            return this.weakCanvas.get();
        }

        /* access modifiers changed from: package-private */
        public LynxHeliumCanvasView getView() {
            return this.weakView.get();
        }

        public void updateView() {
            T t;
            LynxHeliumCanvas lynxHeliumCanvas = this.weakCanvas.get();
            if (lynxHeliumCanvas != null) {
                t = lynxHeliumCanvas.mView;
            } else {
                t = null;
            }
            this.weakView = new WeakReference<>(t);
        }

        public CanvasViewInfo(LynxHeliumCanvas lynxHeliumCanvas) {
            this.weakCanvas = new WeakReference<>(lynxHeliumCanvas);
            updateView();
        }
    }

    static {
        Covode.recordClassIndex(35065);
    }

    private void updatePlayerFactory() {
        IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory;
        HeliumApp heliumApp = this.mHeliumapp;
        if (heliumApp != null && (heliumPlayerFactory = this.mPlayerFactory) != null) {
            heliumApp.setHeliumPlayerFactory(heliumPlayerFactory);
        }
    }

    public String getCacheDirAbsolutePath() {
        ContextWrapper contextWrapper = this.mContextWrapper;
        if (contextWrapper != null) {
            return contextWrapper.getCacheDir().getAbsolutePath();
        }
        return null;
    }

    private void initHeliumErrorHandler() {
        HeliumApp.setFatalErrorHandler(new HeliumApp.ScriptErrorHandler() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35069);
            }

            @Override // com.he.lynx.HeliumApp.ScriptErrorHandler
            public void handle(String str) {
                LynxHelium.this.onHeliumError(true, str);
            }
        });
        HeliumApp.setUncaughtExceptionHandler(new HeliumApp.ScriptErrorHandler() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass4 */

            static {
                Covode.recordClassIndex(35070);
            }

            @Override // com.he.lynx.HeliumApp.ScriptErrorHandler
            public void handle(String str) {
                LynxHelium.this.onHeliumError(false, str);
            }
        });
    }

    private void initHeliumRunables() {
        this.mHeliumPauseRunnable = new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass6 */

            static {
                Covode.recordClassIndex(35072);
            }

            public void run() {
                LynxHelium.this.mHeliumapp.pause();
            }
        };
        this.mHeliumResumeRunable = new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass7 */

            static {
                Covode.recordClassIndex(35073);
            }

            public void run() {
                LynxHelium.this.mHeliumapp.resume();
            }
        };
        this.mHeliumOnFrameRunable = new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass8 */

            static {
                Covode.recordClassIndex(35074);
            }

            public void run() {
                LynxHelium.this.mHeliumapp.doFrame(0);
            }
        };
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public String onPreloadEffectModuleFromJS() {
        MethodCollector.i(6402);
        if (this.mEffect == null) {
            MethodCollector.o(6402);
            return null;
        }
        String preloadLiteEffectModules = Helium.preloadLiteEffectModules();
        MethodCollector.o(6402);
        return preloadLiteEffectModules;
    }

    /* access modifiers changed from: package-private */
    public class LynxDelegateImpl implements HeliumApp.LynxDelegate {
        static {
            Covode.recordClassIndex(35078);
        }

        @Override // com.he.lynx.HeliumApp.LynxDelegate
        public HeliumApp.EffectResourceDownloadInfo effectResourceDownloadInfo() {
            if (LynxHelium.this.mEffect == null) {
                return null;
            }
            HeliumApp.EffectResourceDownloadInfo effectResourceDownloadInfo = new HeliumApp.EffectResourceDownloadInfo();
            effectResourceDownloadInfo.appId = LynxHelium.this.mEffect.getEffectAppId();
            effectResourceDownloadInfo.hostUrl = LynxHelium.this.mEffect.getEffectResourceDownloadUrl();
            return effectResourceDownloadInfo;
        }

        LynxDelegateImpl() {
        }

        @Override // com.he.lynx.HeliumApp.LynxDelegate
        public void runOnJsThread(Runnable runnable) {
            LynxHelium.this.nativeRunOnJSThread(runnable);
        }
    }

    private void pause() {
        if (this.mInited) {
            LLog.a(4, "LynxHelium", "Pause");
            h hVar = this.mFrameRateControl;
            if (hVar != null) {
                hVar.f57038e = hVar.f57037d;
                if (hVar.f57037d) {
                    hVar.b();
                }
            }
            Runnable runnable = this.mHeliumPauseRunnable;
            if (runnable != null) {
                nativeCallRunnableInstanceOnJSThread(runnable, 1);
            }
        }
    }

    private void resume() {
        if (this.mInited) {
            LLog.a(4, "LynxHelium", "Resume");
            h hVar = this.mFrameRateControl;
            if (hVar != null && hVar.f57038e) {
                hVar.a();
            }
            Runnable runnable = this.mHeliumResumeRunable;
            if (runnable != null) {
                nativeCallRunnableInstanceOnJSThread(runnable, 2);
            }
        }
    }

    private LynxHeliumEffectInfoInterface tryToLoadEffectInfoImpl() {
        try {
            Class<?> cls = Class.forName("com.lynx.tasm.behavior.ui.canvas.LynxHeliumEffectInfo");
            LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = (LynxHeliumEffectInfoInterface) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (lynxHeliumEffectInfoInterface != null) {
                cls.getMethod("init", LynxHelium.class).invoke(lynxHeliumEffectInfoInterface, this);
                return lynxHeliumEffectInfoInterface;
            }
            LLog.a(5, "LynxHelium", "tryToLoadEffectInfoImpl error");
            return null;
        } catch (Throwable th) {
            LLog.c("LynxHelium", "tryToLoadEffectInfoImpl exception " + th.toString());
            return null;
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onLynxViewFrameCallbackInit(Context context) {
        initForFrameCallback(context);
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.mErrorHandler = errorHandler;
    }

    public void setPermissionHandler(PermissionHandler permissionHandler) {
        this.mPermissionHandler = permissionHandler;
    }

    /* access modifiers changed from: package-private */
    public class LynxMediaLoaderImpl implements MediaLoader {
        static {
            Covode.recordClassIndex(35079);
        }

        LynxMediaLoaderImpl() {
        }

        @Override // com.he.lynx.loader.MediaLoader
        public Uri loadMedia(String str) {
            if (LynxHelium.this.mResourceLoader != null) {
                return LynxHelium.this.mResourceLoader.loadMedia(str);
            }
            return null;
        }

        @Override // com.he.lynx.loader.MediaLoader
        public void onRequest(MediaLoader.RequestParams requestParams, final MediaLoader.Responder responder) {
            String str;
            if (responder != null) {
                if (requestParams == null || (!requestParams.video && !requestParams.audio)) {
                    responder.onResponse(true);
                    return;
                }
                if (requestParams.video && requestParams.effect && LynxHelium.this.mEffect != null) {
                    LynxHelium.this.mEffect.validateLibrary(true);
                }
                if (LynxHelium.this.mPermissionHandler == null) {
                    LLog.a(5, "LynxHelium", "WARNING: PermissionHandler not set!!!");
                    responder.onResponse(true);
                    return;
                }
                String[] strArr = new String[1];
                if (requestParams.audio) {
                    str = "android.permission.RECORD_AUDIO";
                } else {
                    str = "android.permission.CAMERA";
                }
                strArr[0] = str;
                if (LynxHelium.this.mPermissionHandler.verifyHasPermission(strArr)) {
                    responder.onResponse(true);
                } else {
                    LynxHelium.this.mPermissionHandler.requestPermissions(strArr, new OnPermissionListener() {
                        /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.LynxMediaLoaderImpl.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(35080);
                        }

                        @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionDenied() {
                            MediaLoader.Responder responder = responder;
                            if (responder != null) {
                                responder.onResponse(false);
                            }
                        }

                        @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionGranted() {
                            MediaLoader.Responder responder = responder;
                            if (responder != null) {
                                responder.onResponse(true);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void executeRunnableCalledOnJSThread(Runnable runnable) {
        if (this.mInited) {
            runnable.run();
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onJSException(String str) {
        onHeliumError(true, str);
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onLynxRuntimeDestroy(Long l2) {
        removeCanvasByRuntimeId(l2, Boolean.FALSE);
    }

    public void setPlayerFactory(IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory) {
        this.mPlayerFactory = heliumPlayerFactory;
        updatePlayerFactory();
    }

    public static void com_lynx_tasm_behavior_ui_canvas_LynxHelium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public void onLynxCanvasDetach(LynxBaseUI lynxBaseUI) {
        LLog.a(3, "LynxHelium", "onLynxCanvasDetach");
    }

    private static boolean checkGLES30Support(Context context) {
        try {
            if (((ActivityManager) com_lynx_tasm_behavior_ui_canvas_LynxHelium_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.lynx.tasm.utils.h.a
    public void OnVSync(long j2) {
        Runnable runnable;
        if (this.mInited && this.mHasCanvasView && (runnable = this.mHeliumOnFrameRunable) != null) {
            nativeCallRunnableInstanceOnJSThread(runnable, 0);
        }
    }

    public void removeAllCanvasRefs(LynxView lynxView) {
        if (lynxView != null && this.mInited) {
            removeCanvasByRuntimeId(lynxView.getLynxContext().d(), Boolean.TRUE);
        }
    }

    public void useLocalEffectPlatformAndRender(boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setUseLocalEffectPlatformAndRender(z);
        } else {
            LLog.a(5, "LynxHelium", "Error: Please call useLocalEffectPlatformAndRender after LynxHelium init.");
        }
    }

    public boolean validateEffect(boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface == null) {
            return false;
        }
        if (lynxHeliumEffectInfoInterface.validateLibrary(false)) {
            return true;
        }
        if (z) {
            this.mEffect.backendPreloadLibrary();
        }
        return false;
    }

    private ArrayList addCanvasMapWithLynxRuntimeId(Long l2) {
        ArrayList arrayList = this.mCanvasMap.get(l2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.mCanvasMap.put(l2, arrayList);
        }
        if (!this.mHasCanvasView) {
            this.mHasCanvasView = true;
        }
        h hVar = this.mFrameRateControl;
        if (hVar != null) {
            hVar.a();
        }
        return arrayList;
    }

    private CanvasViewInfo findCanvasInfo(LynxBaseUI lynxBaseUI) {
        Long runtimeId;
        ArrayList arrayList;
        if (!(lynxBaseUI == null || !(lynxBaseUI instanceof LynxHeliumCanvas) || (runtimeId = ((LynxHeliumCanvas) lynxBaseUI).getRuntimeId()) == null || (arrayList = this.mCanvasMap.get(runtimeId)) == null)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                CanvasViewInfo canvasViewInfo = (CanvasViewInfo) arrayList.get(size);
                if (canvasViewInfo.getCanvas() == lynxBaseUI) {
                    return canvasViewInfo;
                }
            }
        }
        return null;
    }

    private void initHeliumApp(ContextWrapper contextWrapper) {
        int i2 = Build.VERSION.SDK_INT;
        initHeliumErrorHandler();
        HeliumApp.setLoadSoInHostCallback(new HeliumApp.LoadSoInHostCallback() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass5 */

            static {
                Covode.recordClassIndex(35071);
            }

            @Override // com.he.lynx.HeliumApp.LoadSoInHostCallback
            public void loadSoInHost(String str, HeliumApp.LoadSoCallback loadSoCallback) {
                boolean z;
                String str2;
                try {
                    if (str.endsWith(".so") && str.startsWith("lib")) {
                        str = str.substring(3, str.length() - 3);
                    }
                    z = LynxHelium.this.loadNativeLibrary(str);
                    str2 = "";
                } catch (Throwable th) {
                    str2 = th.getMessage();
                    z = false;
                }
                if (loadSoCallback != null) {
                    loadSoCallback.complete(z, str2);
                }
            }
        });
        this.mHeliumapp = new HeliumApp(contextWrapper, this.mLynxDelegate);
        this.mResourceLoader = new TTAppLoader(new LynxHeliumResourceLoader(contextWrapper, null));
        this.mHeliumapp.mediaLoader = new LynxMediaLoaderImpl();
        this.mInited = false;
        initHeliumRunables();
        initForFrameCallback(contextWrapper);
    }

    public void initForFrameCallback(final Context context) {
        if (!com.lynx.tasm.utils.m.a()) {
            if (this.mFrameRateControl == null) {
                com.lynx.tasm.utils.m.a(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35066);
                    }

                    public void run() {
                        LynxHelium.this.initForFrameCallback(context);
                    }
                });
            }
        } else if (this.mFrameRateControl == null) {
            LLog.a(3, "LynxHelium", "initForFrameCallback");
            this.mFrameRateControl = new h(this);
            if (this.mHasCanvasView) {
                LLog.a(3, "LynxHelium", "initForFrameCallback mFrameRateControl.start()");
                this.mFrameRateControl.a();
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onEnsureHeliumLoaded(Long l2) {
        MethodCollector.i(6346);
        if (l2 == null) {
            LLog.a(6, "LynxHelium", "registerLynxRuntimeWithId error");
            MethodCollector.o(6346);
            return;
        }
        synchronized (this.mCanvasMap) {
            try {
                addCanvasMapWithLynxRuntimeId(l2);
            } finally {
                MethodCollector.o(6346);
            }
        }
    }

    public void onLynxCanvasAttatch(LynxBaseUI lynxBaseUI) {
        MethodCollector.i(6295);
        synchronized (this.mCanvasMap) {
            try {
                CanvasViewInfo findCanvasInfo = findCanvasInfo(lynxBaseUI);
                if (findCanvasInfo != null) {
                    LLog.a(3, "LynxHelium", "onLynxCanvasAttatch");
                    findCanvasInfo.updateView();
                }
            } finally {
                MethodCollector.o(6295);
            }
        }
    }

    public void removeWeakErrorHandler(ErrorHandler errorHandler) {
        MethodCollector.i(6058);
        synchronized (this.mErrorHandlers) {
            if (errorHandler != null) {
                try {
                    Iterator<WeakReference<ErrorHandler>> it = this.mErrorHandlers.iterator();
                    while (it.hasNext()) {
                        WeakReference<ErrorHandler> next = it.next();
                        ErrorHandler errorHandler2 = next.get();
                        if (errorHandler2 != null && errorHandler2.equals(errorHandler)) {
                            this.mErrorHandlers.remove(next);
                            return;
                        }
                    }
                } finally {
                    MethodCollector.o(6058);
                }
            }
            MethodCollector.o(6058);
        }
    }

    public void addWeakErrorHandler(ErrorHandler errorHandler) {
        MethodCollector.i(6049);
        synchronized (this.mErrorHandlers) {
            if (errorHandler == null) {
                MethodCollector.o(6049);
                return;
            }
            try {
                Iterator<WeakReference<ErrorHandler>> it = this.mErrorHandlers.iterator();
                while (it.hasNext()) {
                    ErrorHandler errorHandler2 = it.next().get();
                    if (errorHandler2 != null && errorHandler2.equals(errorHandler)) {
                        return;
                    }
                }
                this.mErrorHandlers.add(new WeakReference<>(errorHandler));
                MethodCollector.o(6049);
            } finally {
                MethodCollector.o(6049);
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean autoLoadNativeCanvasProvider(boolean z) {
        if (this.mInited) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        ContextWrapper contextWrapper = this.mContextWrapper;
        if (contextWrapper == null || !checkGLES30Support(contextWrapper)) {
            onHeliumError(true, "Helium do not support, do not support openglES3");
            return false;
        } else if (this.mHeliumapp == null) {
            onHeliumError(true, "LynxHelium init should be run before this function.");
            return false;
        } else if (!loadNativeLibrary("lynx_helium")) {
            onHeliumError(true, "Helium load lynx_helium failed.");
            return false;
        } else {
            Helium.setupEngine();
            if (!nativeInit(z) || this.mHeliumapp.ptr == 0) {
                onHeliumError(true, "Helium setup failed.");
                return false;
            }
            this.mResourceLoader.setup(null);
            LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
            if (lynxHeliumEffectInfoInterface != null) {
                lynxHeliumEffectInfoInterface.updateEffectPathToHelium();
            }
            updatePlayerFactory();
            this.mInited = true;
            return true;
        }
    }

    public boolean loadNativeLibrary(String str) {
        try {
            f fVar = this.mNativeSoLoader;
            if (fVar != null) {
                fVar.a(str);
            } else {
                com_lynx_tasm_behavior_ui_canvas_LynxHelium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            }
            LLog.b("LynxHelium", "Native Library " + str + " load success");
            return true;
        } catch (UnsatisfiedLinkError e2) {
            String str2 = "Native Library " + str + " load with error message " + e2.getMessage();
            LLog.d("LynxHelium", str2);
            onHeliumError(true, str2);
            return false;
        }
    }

    public void onLynxCanvasUIInit(LynxBaseUI lynxBaseUI) {
        Long runtimeId;
        MethodCollector.i(6292);
        if (!(lynxBaseUI instanceof LynxHeliumCanvas) || (runtimeId = ((LynxHeliumCanvas) lynxBaseUI).getRuntimeId()) == null) {
            LLog.a(6, "LynxHelium", "onLynxCanvasUIInit canvas error");
            MethodCollector.o(6292);
            return;
        }
        synchronized (this.mCanvasMap) {
            try {
                addCanvasMapWithLynxRuntimeId(runtimeId).add(new CanvasViewInfo((LynxHeliumCanvas) lynxBaseUI));
                LLog.a("LynxHelium", "onLynxCanvasUIInit " + runtimeId + ", name " + lynxBaseUI.mName);
            } finally {
                MethodCollector.o(6292);
            }
        }
    }

    public void init(ContextWrapper contextWrapper, f fVar) {
        init(contextWrapper, fVar, null, null);
    }

    public void setEffectLibraryUrlFallback(String str, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setEffectLibraryUrlFallback(str, z);
        } else {
            LLog.a(5, "LynxHelium", "Error: Please call setEffectLibraryUrlFallback after LynxHelium init.");
        }
    }

    public void setSmashUrlFallback(String str, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setSmashUrlFallback(str, z);
        } else {
            LLog.a(5, "LynxHelium", "Error: Please call setSmashUrlFallback after LynxHelium init.");
        }
    }

    public void useExternalEffectLibrary(String str, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setUseExternalEffectLibrary(str, z);
        } else {
            LLog.a(5, "LynxHelium", "Error: Please call useExternalEffectLibrary after LynxHelium init.");
        }
    }

    public static Object com_lynx_tasm_behavior_ui_canvas_LynxHelium_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(6241);
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
                    MethodCollector.o(6241);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onHeliumError(boolean z, String str) {
        int i2;
        MethodCollector.i(6168);
        if (z) {
            LLog.a(6, "LynxHelium", "!!! on helium fatal error ".concat(String.valueOf(str)));
            i2 = 501;
        } else {
            LLog.a(6, "LynxHelium", "on helium error ".concat(String.valueOf(str)));
            i2 = 502;
        }
        j jVar = new j(str, i2);
        ErrorHandler errorHandler = this.mErrorHandler;
        if (errorHandler != null) {
            errorHandler.onReceivedError(jVar);
        }
        synchronized (this.mErrorHandlers) {
            try {
                Iterator<WeakReference<ErrorHandler>> it = this.mErrorHandlers.iterator();
                while (it.hasNext()) {
                    ErrorHandler errorHandler2 = it.next().get();
                    if (errorHandler2 != null) {
                        errorHandler2.onReceivedError(jVar);
                    }
                }
            } finally {
                MethodCollector.o(6168);
            }
        }
    }

    public void removeCanvasFromHeliumOnJSThread(View view, boolean z) {
        HeliumApp heliumApp;
        if (!(view == null || (heliumApp = this.mHeliumapp) == null)) {
            ArrayList arrayList = null;
            for (Drawable drawable : heliumApp.drawables) {
                if (drawable.view == view) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(drawable);
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Drawable drawable2 = (Drawable) it.next();
                    this.mHeliumapp.removeView(drawable2);
                    if (z && drawable2.holder != null && (drawable2.holder instanceof TextureViewHolder)) {
                        ((TextureViewHolder) drawable2.holder).releaseSurfaceTexture();
                    }
                }
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean setupHeliumApp(long j2, long[] jArr) {
        boolean z;
        MethodCollector.i(6250);
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            z = lynxHeliumEffectInfoInterface.getUseLocalEffectPlatformAndRender();
        } else {
            z = false;
        }
        this.mHeliumapp.ptr = Helium.setupLite(DisplayMetricsHolder.a().density, this.mHeliumapp, j2, jArr, this.mContextWrapper.getAssets(), this.mContextWrapper.getCacheDir().getAbsolutePath(), z, z);
        if (this.mHeliumapp.ptr != 0) {
            MethodCollector.o(6250);
            return true;
        }
        MethodCollector.o(6250);
        return false;
    }

    private void removeCanvasByRuntimeId(Long l2, Boolean bool) {
        h hVar;
        MethodCollector.i(6362);
        if (l2 == null) {
            LLog.a(6, "LynxHelium", "onLynxRuntimeDestroy runtimeId error");
            MethodCollector.o(6362);
            return;
        }
        LLog.a(3, "LynxHelium", "onLynxRuntimeDestroy ".concat(String.valueOf(l2)));
        final ArrayList arrayList = new ArrayList();
        synchronized (this.mCanvasMap) {
            try {
                ArrayList arrayList2 = this.mCanvasMap.get(l2);
                boolean z = true;
                if (arrayList2 != null) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        LynxHeliumCanvasView view = ((CanvasViewInfo) arrayList2.get(size)).getView();
                        if (view != null) {
                            arrayList.add(view);
                        }
                    }
                    if (!bool.booleanValue()) {
                        this.mCanvasMap.remove(l2);
                    }
                }
                if (this.mCanvasMap.isEmpty()) {
                    z = false;
                }
                this.mHasCanvasView = z;
                if (!this.mHasCanvasView && (hVar = this.mFrameRateControl) != null) {
                    hVar.b();
                }
            } catch (Throwable th) {
                MethodCollector.o(6362);
                throw th;
            }
        }
        if (!this.mInited || arrayList.isEmpty()) {
            MethodCollector.o(6362);
            return;
        }
        nativeRunOnJSThread(new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass9 */

            static {
                Covode.recordClassIndex(35075);
            }

            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LynxHelium.this.removeCanvasFromHeliumOnJSThread((View) it.next(), true);
                }
            }
        });
        MethodCollector.o(6362);
    }

    public LynxHeliumCanvas findCanvasById(String str, Long l2) {
        MethodCollector.i(6389);
        synchronized (this.mCanvasMap) {
            try {
                ArrayList arrayList = this.mCanvasMap.get(l2);
                if (arrayList != null && !arrayList.isEmpty()) {
                    LynxHeliumCanvas lynxHeliumCanvas = null;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        LynxHeliumCanvas canvas = ((CanvasViewInfo) arrayList.get(size)).getCanvas();
                        if (canvas != null && str.equals(canvas.mName)) {
                            int i2 = Build.VERSION.SDK_INT;
                            if (canvas.mView == null || !((LynxHeliumCanvasView) canvas.mView).isAttachedToWindow()) {
                                lynxHeliumCanvas = canvas;
                            } else {
                                LLog.a("LynxHelium", "findCanvasById " + str + ", runtime: " + l2);
                                return canvas;
                            }
                        }
                    }
                    if (lynxHeliumCanvas != null) {
                        LLog.a("LynxHelium", "findCanvasById " + str + " not showing , runtime: " + l2);
                        MethodCollector.o(6389);
                        return lynxHeliumCanvas;
                    }
                }
                LLog.a("LynxHelium", "findCanvasById " + str + " result null , runtime: " + l2);
                MethodCollector.o(6389);
                return null;
            } finally {
                MethodCollector.o(6389);
            }
        }
    }

    public void setEffectResourceDownloadInfo(String str, String str2, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setEffectResourceDownloadInfo(str, str2, z);
        } else {
            LLog.a(5, "LynxHelium", "Error: Please call setEffectResourceDownloadInfo after LynxHelium init.");
        }
    }

    private void createCanvasAsyncOnJSThread(final String str, final Long l2, final JSProxy jSProxy, final int i2) {
        LLog.a("LynxHelium", "createCanvas should wait for surface ready in async thread, runtime:" + l2 + ", canvasId:" + str);
        new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35067);
            }

            public void run() {
                MethodCollector.i(6462);
                TextureView textureView = null;
                int i2 = 0;
                do {
                    LynxHeliumCanvas findCanvasById = LynxHelium.this.findCanvasById(str, l2);
                    if (findCanvasById != null && (textureView = (TextureView) findCanvasById.mView) != null) {
                        int i3 = 0;
                        do {
                            try {
                                Thread.sleep(17);
                                if (textureView.getSurfaceTexture() != null) {
                                    break;
                                }
                                i3++;
                            } catch (InterruptedException unused) {
                            }
                        } while (i3 < 8);
                    }
                    i2++;
                } while (i2 < 20);
                if (textureView == null) {
                    LLog.a("LynxHelium", "createCanvas error timeout, runtime:" + l2 + ", canvasId:" + str);
                    jSProxy.a(i2, 0);
                    MethodCollector.o(6462);
                    return;
                }
                final WeakReference weakReference = new WeakReference(textureView);
                LynxHelium.this.nativeRunOnJSThread(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.canvas.LynxHelium.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35068);
                    }

                    public void run() {
                        long j2;
                        Drawable addView;
                        TextureView textureView = (TextureView) weakReference.get();
                        if (textureView == null || (addView = LynxHelium.this.mHeliumapp.addView(textureView)) == null) {
                            j2 = 0;
                        } else {
                            j2 = addView.ptr;
                        }
                        LLog.a("LynxHelium", "createCanvas async result " + j2 + ", runtime:" + l2 + ", canvasId:" + str);
                        jSProxy.a(i2, j2);
                    }
                });
                MethodCollector.o(6462);
            }
        }).start();
    }

    public void init(ContextWrapper contextWrapper, f fVar, ErrorHandler errorHandler, PermissionHandler permissionHandler) {
        if (this.mLynxDelegate == null) {
            this.mLynxDelegate = new LynxDelegateImpl();
        }
        this.mNativeSoLoader = fVar;
        if (errorHandler != null) {
            this.mErrorHandler = errorHandler;
        }
        if (permissionHandler != null) {
            this.mPermissionHandler = permissionHandler;
        }
        this.mContextWrapper = contextWrapper;
        if (this.mEffect == null) {
            this.mEffect = tryToLoadEffectInfoImpl();
        }
        if (this.mHeliumapp == null) {
            initHeliumApp(contextWrapper);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (r7 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
        return 0;
     */
    @Override // com.lynx.tasm.provider.CanvasProvider
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long createCanvasOnJSThread(java.lang.String r9, java.lang.Long r10, boolean r11, com.lynx.tasm.core.JSProxy r12, int r13) {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.canvas.LynxHelium.createCanvasOnJSThread(java.lang.String, java.lang.Long, boolean, com.lynx.tasm.core.JSProxy, int):long");
    }
}
