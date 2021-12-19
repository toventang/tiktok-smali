package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ChunkedCursorWindow extends c {

    /* renamed from: a  reason: collision with root package name */
    long f154542a;

    static {
        Covode.recordClassIndex(103010);
    }

    private static native void nativeClear(long j2);

    private static native long nativeCreate(int i2);

    private static native void nativeDispose(long j2);

    private static native void nativeEndRow(long j2, long j3);

    private static native byte[] nativeGetBlob(long j2, int i2);

    private static native double nativeGetDouble(long j2, int i2);

    private static native long nativeGetLong(long j2, int i2);

    private static native int nativeGetNumChunks(long j2);

    private static native long nativeGetRow(long j2, int i2);

    private static native String nativeGetString(long j2, int i2);

    private static native int nativeGetType(long j2, int i2);

    private static native long nativeRemoveChunk(long j2, int i2);

    private static native boolean nativeSetNumColumns(long j2, int i2);

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.c
    public final void c() {
        a();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    private void a() {
        MethodCollector.i(151);
        long j2 = this.f154542a;
        if (j2 != 0) {
            nativeDispose(j2);
            this.f154542a = 0;
        }
        MethodCollector.o(151);
    }
}
