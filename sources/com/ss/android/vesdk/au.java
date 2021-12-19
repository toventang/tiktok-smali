package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.TEVideoUtils;

public class au {

    /* renamed from: a  reason: collision with root package name */
    private long f150962a;

    /* renamed from: b  reason: collision with root package name */
    private final int f150963b;

    /* renamed from: c  reason: collision with root package name */
    private final int f150964c;

    static {
        Covode.recordClassIndex(99286);
    }

    au(int i2, int i3, int i4, float f2, int i5) {
        this.f150962a = TEVideoUtils.createRTAudioWaveformMgr(i3, i4, f2, i5);
        this.f150963b = i3;
        this.f150964c = i2;
    }
}
