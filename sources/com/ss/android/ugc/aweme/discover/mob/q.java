package com.ss.android.ugc.aweme.discover.mob;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f81943a = true;

    /* renamed from: b  reason: collision with root package name */
    public static long f81944b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final q f81945c = new q();

    /* renamed from: d  reason: collision with root package name */
    private static final long f81946d = a.b.f109011a.f109007h;

    /* renamed from: e  reason: collision with root package name */
    private static final SparseArray<Long> f81947e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private static final SparseArray<Long> f81948f = new SparseArray<>();

    private q() {
    }

    public static void a() {
        if (f81943a) {
            f81944b = System.currentTimeMillis() - f81946d;
        }
    }

    static {
        Covode.recordClassIndex(50864);
    }

    public static void a(int i2) {
        if (i2 >= 0) {
            f81947e.put(i2, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static long c(int i2) {
        Long l2 = f81948f.get(i2);
        if (l2 != null) {
            return l2.longValue();
        }
        return -1;
    }

    public static void b(int i2) {
        SparseArray<Long> sparseArray;
        Long l2;
        if (i2 >= 0 && (l2 = (sparseArray = f81947e).get(i2)) != null && l2.longValue() > 0) {
            sparseArray.put(i2, -1L);
            f81948f.put(i2, Long.valueOf(System.currentTimeMillis() - l2.longValue()));
        }
    }
}
