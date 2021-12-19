package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableArray;
import com.lynx.tasm.base.LLog;

public final class CallbackImpl implements Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mInvoked = false;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(34734);
    }

    private native void nativeInvoke(long j2, WritableArray writableArray);

    private native void nativeReleaseNativePtr(long j2);

    public final void resetNativePtr() {
        this.mNativePtr = 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.i(13806);
        super.finalize();
        nativeReleaseNativePtr(this.mNativePtr);
        MethodCollector.o(13806);
    }

    public CallbackImpl(long j2) {
        this.mNativePtr = j2;
    }

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        MethodCollector.i(13754);
        if (this.mInvoked) {
            LLog.a(8, "LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            MethodCollector.o(13754);
            return;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            LLog.a(6, "LynxModule", "callback invoke failed: mNativePtr is NULL");
            MethodCollector.o(13754);
            return;
        }
        nativeInvoke(j2, JavaOnlyArray.of(objArr));
        this.mInvoked = true;
        MethodCollector.o(13754);
    }

    public final void invokeCallback(Object... objArr) {
        MethodCollector.i(13755);
        if (this.mInvoked) {
            LLog.a(8, "LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            MethodCollector.o(13755);
            return;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            LLog.a(6, "LynxModule", "callback invoke failed: mNativePtr is NULL");
            MethodCollector.o(13755);
            return;
        }
        nativeInvoke(j2, JavaOnlyArray.of(objArr));
        this.mInvoked = true;
        MethodCollector.o(13755);
    }
}
