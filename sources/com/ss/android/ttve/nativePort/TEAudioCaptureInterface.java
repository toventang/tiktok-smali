package com.ss.android.ttve.nativePort;

import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.model.f;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.audio.b;
import com.ss.android.vesdk.audio.d;
import com.ss.android.vesdk.audio.i;
import com.ss.android.vesdk.m;

public class TEAudioCaptureInterface implements b {
    private d mCallback;
    private long mHandle;

    private native long nativeCreate(boolean z, boolean z2);

    private native int nativeDestroy(long j2);

    private native int nativeInit(long j2, int i2, int i3, int i4, int i5);

    private native int nativeStart(long j2);

    private native int nativeStop(long j2);

    public void setAudioDevice(i iVar) {
    }

    @Override // com.ss.android.vesdk.audio.b
    public void setHandler(Handler handler) {
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    static {
        Covode.recordClassIndex(37712);
        d.c();
    }

    @Override // com.ss.android.vesdk.audio.b
    public void setAudioCallback(d dVar) {
        this.mCallback = dVar;
    }

    @Override // com.ss.android.vesdk.audio.a
    public int stop(PrivacyCert privacyCert) {
        MethodCollector.i(2613);
        int nativeStop = nativeStop(this.mHandle);
        MethodCollector.o(2613);
        return nativeStop;
    }

    @Override // com.ss.android.vesdk.audio.a
    public void release(PrivacyCert privacyCert) {
        MethodCollector.i(2611);
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
        MethodCollector.o(2611);
    }

    @Override // com.ss.android.vesdk.audio.a
    public int start(PrivacyCert privacyCert) {
        MethodCollector.i(2609);
        int nativeStart = nativeStart(this.mHandle);
        d dVar = this.mCallback;
        if (dVar != null) {
            dVar.a(aj.N, nativeStart, 0.0d, "");
        }
        MethodCollector.o(2609);
        return nativeStart;
    }

    @Override // com.ss.android.vesdk.audio.a
    public int init(m mVar) {
        boolean z;
        MethodCollector.i(2616);
        if (TESystemUtils.getOutputAudioDeviceType() == f.WIRED.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        long nativeCreate = nativeCreate(mVar.f151358h, z);
        this.mHandle = nativeCreate;
        int nativeInit = nativeInit(nativeCreate, mVar.f151352b, mVar.f151351a, mVar.f151353c, mVar.f151356f);
        d dVar = this.mCallback;
        if (dVar != null) {
            dVar.a(aj.M, nativeInit, 0.0d, mVar);
        }
        MethodCollector.o(2616);
        return nativeInit;
    }

    public void onNativeExtCallback(int i2, int i3) {
        d dVar = this.mCallback;
        if (dVar == null) {
            return;
        }
        if (i2 == aj.S) {
            dVar.a(aj.S, i3, "");
        } else {
            dVar.a(i2, i3, 0.0d, "");
        }
    }
}
