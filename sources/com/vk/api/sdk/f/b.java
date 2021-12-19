package com.vk.api.sdk.f;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f156315d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile long f156316a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f156317b;

    /* renamed from: c  reason: collision with root package name */
    public final long f156318c;

    /* renamed from: e  reason: collision with root package name */
    private final Random f156319e;

    /* renamed from: f  reason: collision with root package name */
    private final long f156320f;

    /* renamed from: g  reason: collision with root package name */
    private final float f156321g;

    /* renamed from: h  reason: collision with root package name */
    private final float f156322h;

    static {
        Covode.recordClassIndex(103812);
    }

    public b() {
        this(0, 0, 0.0f, 0.0f, 15);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103813);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        if (this.f156317b > 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f156316a = (long) Math.min(((float) this.f156316a) * this.f156321g, (float) this.f156320f);
        this.f156316a += a(((float) this.f156316a) * this.f156322h);
        this.f156317b++;
    }

    private final long a(float f2) {
        double nextGaussian = this.f156319e.nextGaussian();
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (long) (nextGaussian * d2);
    }

    private b(long j2, long j3, float f2, float f3) {
        this.f156318c = j2;
        this.f156320f = j3;
        this.f156321g = f2;
        this.f156322h = f3;
        this.f156319e = new Random(System.currentTimeMillis());
        this.f156316a = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j2, long j3, float f2, float f3, int i2) {
        this((i2 & 1) != 0 ? TimeUnit.MILLISECONDS.toMillis(100) : j2, (i2 & 2) != 0 ? TimeUnit.MINUTES.toMillis(5) : j3, (i2 & 4) != 0 ? 2.0f : f2, (i2 & 8) != 0 ? 0.1f : f3);
    }
}
