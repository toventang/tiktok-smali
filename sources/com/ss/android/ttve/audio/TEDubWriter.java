package com.ss.android.ttve.audio;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TEDubWriter implements b {

    /* renamed from: a  reason: collision with root package name */
    long f61038a = nativeCreate();

    /* renamed from: b  reason: collision with root package name */
    public long f61039b;

    static {
        Covode.recordClassIndex(37596);
    }

    public native int nativeAddPCMData(long j2, byte[] bArr, int i2);

    public native int nativeCloseWavFile(long j2);

    public native long nativeCreate();

    public native void nativeDestroy(long j2);

    public native long nativeGetCurrentTime(long j2);

    public native int nativeInitWavFile(long j2, String str, int i2, int i3, double d2, int i4, int i5);

    public TEDubWriter() {
        MethodCollector.i(10406);
        MethodCollector.o(10406);
    }

    @Override // com.ss.android.ttve.audio.b
    public final int a() {
        MethodCollector.i(10564);
        long j2 = this.f61038a;
        if (j2 == 0) {
            MethodCollector.o(10564);
            return -112;
        }
        int nativeCloseWavFile = nativeCloseWavFile(j2);
        MethodCollector.o(10564);
        return nativeCloseWavFile;
    }

    @Override // com.ss.android.ttve.audio.b
    public final void b() {
        MethodCollector.i(10720);
        long j2 = this.f61038a;
        if (j2 != 0) {
            nativeDestroy(j2);
        }
        MethodCollector.o(10720);
    }

    @Override // com.ss.android.ttve.audio.b
    public final int a(byte[] bArr, int i2) {
        MethodCollector.i(10562);
        long j2 = this.f61038a;
        if (j2 == 0) {
            MethodCollector.o(10562);
            return -112;
        }
        int nativeAddPCMData = nativeAddPCMData(j2, bArr, i2);
        this.f61039b = nativeGetCurrentTime(this.f61038a);
        MethodCollector.o(10562);
        return nativeAddPCMData;
    }

    @Override // com.ss.android.ttve.audio.b
    public final int a(String str, int i2, double d2, int i3, int i4) {
        MethodCollector.i(10407);
        long j2 = this.f61038a;
        if (j2 == 0) {
            MethodCollector.o(10407);
            return -112;
        }
        int nativeInitWavFile = nativeInitWavFile(j2, str, i2, 2, d2, i3, i4);
        MethodCollector.o(10407);
        return nativeInitWavFile;
    }
}
