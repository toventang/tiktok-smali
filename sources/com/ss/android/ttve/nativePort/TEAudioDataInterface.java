package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.audio.h;
import com.ss.android.vesdk.audio.j;
import com.ss.android.vesdk.m;
import java.nio.ByteBuffer;

public class TEAudioDataInterface implements h {
    private long handle = nativeCreate();

    private native long nativeCreate();

    private native int nativeInit(long j2, int i2, int i3, int i4);

    private native void nativeRelease(long j2);

    private native int nativeSendData(long j2, ByteBuffer byteBuffer, int i2, long j3, long j4);

    @Override // com.ss.android.vesdk.audio.h
    public void onError(int i2, int i3, String str) {
    }

    public long getHandle() {
        return this.handle;
    }

    static {
        Covode.recordClassIndex(37713);
        d.c();
    }

    public TEAudioDataInterface() {
        MethodCollector.i(2618);
        MethodCollector.o(2618);
    }

    public synchronized void release() {
        MethodCollector.i(2640);
        long j2 = this.handle;
        if (j2 != 0) {
            nativeRelease(j2);
            this.handle = 0;
        }
        MethodCollector.o(2640);
    }

    @Override // com.ss.android.vesdk.audio.h
    public synchronized void onReceive(j jVar) {
        MethodCollector.i(2627);
        long j2 = this.handle;
        if (j2 != 0) {
            nativeSendData(j2, ((j.b) jVar.f150986a).f150990a, jVar.f150987b, jVar.f150988c, (System.nanoTime() / 1000) - jVar.f150988c);
        }
        MethodCollector.o(2627);
    }

    @Override // com.ss.android.vesdk.audio.h
    public void onInfo(int i2, int i3, double d2, Object obj) {
        MethodCollector.i(2635);
        if (i2 == aj.M) {
            m mVar = (m) obj;
            long j2 = this.handle;
            if (j2 != 0) {
                nativeInit(j2, mVar.f151352b, mVar.f151351a, mVar.f151353c);
            }
        }
        MethodCollector.o(2635);
    }
}
