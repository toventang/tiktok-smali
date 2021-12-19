package com.ss.android.vesdk;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f151320a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f151321b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceTexture.OnFrameAvailableListener f151322c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f151323d = new float[16];

    /* renamed from: e  reason: collision with root package name */
    public boolean f151324e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f151325f;

    /* renamed from: g  reason: collision with root package name */
    private a f151326g = a.Detached;

    static {
        Covode.recordClassIndex(99514);
    }

    public final void a() {
        if (this.f151324e) {
            c();
            this.f151324e = false;
        }
        this.f151321b.updateTexImage();
    }

    private boolean c() {
        if (a.Detached != this.f151326g) {
            return false;
        }
        this.f151321b.attachToGLContext(this.f151320a);
        this.f151326g = a.Attached;
        return true;
    }

    /* access modifiers changed from: package-private */
    public enum a {
        Attached,
        Detached;

        static {
            Covode.recordClassIndex(99516);
        }
    }

    public final double b() {
        if (this.f151321b == null) {
            return -1.0d;
        }
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - this.f151321b.getTimestamp());
        int i2 = Build.VERSION.SDK_INT;
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - this.f151321b.getTimestamp());
        double min = (double) (nanoTime - Math.min(Math.min(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.f151321b.getTimestamp())));
        Double.isNaN(min);
        return min / 1000000.0d;
    }
}
