package com.lynx.devtoolwrapper;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import java.lang.ref.WeakReference;

public class LynxInspectorManager {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f55438a;

    static {
        Covode.recordClassIndex(34714);
    }

    private native long nativeCreateInspectorManager(LynxInspectorManager lynxInspectorManager);

    private native void nativeDestroy(long j2);

    private native long nativeGetFirstPerfContainer(long j2);

    private native long nativeGetFunction(long j2, int i2);

    private native long nativeGetTemplateApiDefaultProcessor(long j2);

    private native long nativeGetTemplateApiProcessorMap(long j2);

    private native void nativeOnTASMCreated(long j2, long j3);

    private native void nativeRunOnJSThread(long j2, long j3);

    private native void nativeSetLynxEnv(long j2, String str, boolean z);

    public long getJavascriptDebugger() {
        if (this.f55438a.get() != null) {
            return this.f55438a.get().c();
        }
        return 0;
    }

    public long createInspectorRuntimeManager() {
        if (!LynxEnv.b().f55537g || !LynxEnv.b().d() || this.f55438a.get() == null) {
            return 0;
        }
        return this.f55438a.get().b();
    }

    public long getLepusDebugger(String str) {
        a aVar = this.f55438a.get();
        if (aVar != null) {
            return aVar.d();
        }
        return 0;
    }

    public long getLynxDevtoolFunction(int i2) {
        if (this.f55438a.get() != null) {
            return this.f55438a.get().a();
        }
        return 0;
    }

    public void call(String str, String str2) {
        if (this.f55438a.get() != null) {
            this.f55438a.get();
        }
    }

    public void sendConsoleMessage(String str, int i2, long j2) {
        if (this.f55438a.get() != null) {
            this.f55438a.get();
        }
    }
}
