package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;

public class SensorData {

    /* renamed from: a  reason: collision with root package name */
    private long f151962a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f151963b = new float[3];

    /* renamed from: c  reason: collision with root package name */
    private float[] f151964c = new float[3];

    static {
        Covode.recordClassIndex(101314);
    }

    private static final native void _writeData(long j2, int i2, float f2, float f3, float f4);

    /* access modifiers changed from: protected */
    public void finalize() {
        stop();
    }

    public void stop() {
        this.f151962a = 0;
    }

    public int start() {
        Boolean bool = false;
        if (bool.booleanValue()) {
            return 0;
        }
        return -1;
    }

    public void setHandle(long j2, TTPlayer tTPlayer) {
        this.f151962a = j2;
    }
}
