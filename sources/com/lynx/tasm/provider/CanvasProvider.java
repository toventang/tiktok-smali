package com.lynx.tasm.provider;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.core.JSProxy;

public abstract class CanvasProvider {
    static {
        Covode.recordClassIndex(35378);
    }

    public abstract boolean autoLoadNativeCanvasProvider(boolean z);

    public abstract long createCanvasOnJSThread(String str, Long l2, boolean z, JSProxy jSProxy, int i2);

    /* access modifiers changed from: protected */
    public abstract void executeRunnableCalledOnJSThread(Runnable runnable);

    /* access modifiers changed from: protected */
    public native void nativeCallRunnableInstanceOnJSThread(Runnable runnable, int i2);

    /* access modifiers changed from: protected */
    public native boolean nativeInit(boolean z);

    public native void nativeRunOnJSThread(Runnable runnable);

    public abstract void onEnsureHeliumLoaded(Long l2);

    /* access modifiers changed from: protected */
    public abstract void onJSException(String str);

    public abstract void onLynxRuntimeDestroy(Long l2);

    public abstract void onLynxViewFrameCallbackInit(Context context);

    /* access modifiers changed from: protected */
    public abstract String onPreloadEffectModuleFromJS();

    /* access modifiers changed from: protected */
    public abstract boolean onValidateEffectFromJS();

    /* access modifiers changed from: protected */
    public abstract boolean setupHeliumApp(long j2, long[] jArr);
}
