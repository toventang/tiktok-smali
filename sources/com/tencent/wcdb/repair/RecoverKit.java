package com.tencent.wcdb.repair;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.support.a;

public class RecoverKit implements a.AbstractC4112a {

    /* renamed from: a  reason: collision with root package name */
    private long f154692a;

    static {
        Covode.recordClassIndex(103076);
    }

    private static native void nativeCancel(long j2);

    private static native int nativeFailureCount(long j2);

    private static native void nativeFinish(long j2);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j2);

    private static native int nativeRun(long j2, long j3, boolean z);

    private static native int nativeSuccessCount(long j2);

    @Override // com.tencent.wcdb.support.a.AbstractC4112a
    public final void b() {
        MethodCollector.i(68);
        long j2 = this.f154692a;
        if (j2 != 0) {
            nativeCancel(j2);
        }
        MethodCollector.o(68);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(69);
        long j2 = this.f154692a;
        if (j2 != 0) {
            nativeFinish(j2);
            this.f154692a = 0;
        }
        super.finalize();
        MethodCollector.o(69);
    }
}
