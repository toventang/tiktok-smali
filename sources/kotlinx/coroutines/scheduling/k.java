package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import h.j.h;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final long f159205a = w.a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f159206b = w.a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f159207c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f159208d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f159209e = TimeUnit.SECONDS.toNanos(w.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f  reason: collision with root package name */
    public static l f159210f = f.f159199a;

    static {
        Covode.recordClassIndex(105707);
        int a2 = w.a("kotlinx.coroutines.scheduler.core.pool.size", h.b(x.f159159a, 2), 1, 0, 8);
        f159207c = a2;
        f159208d = w.a("kotlinx.coroutines.scheduler.max.pool.size", h.a(x.f159159a * 128, a2, 2097150), 0, 2097150, 4);
    }
}
