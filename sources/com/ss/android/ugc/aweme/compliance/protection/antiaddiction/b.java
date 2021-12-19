package com.ss.android.ugc.aweme.compliance.protection.antiaddiction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Calendar;

public class b {

    /* renamed from: g  reason: collision with root package name */
    private static b f77910g;

    /* renamed from: a  reason: collision with root package name */
    public int f77911a = 22;

    /* renamed from: b  reason: collision with root package name */
    public int f77912b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f77913c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f77914d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f77915e;

    /* renamed from: f  reason: collision with root package name */
    public String f77916f;

    static {
        Covode.recordClassIndex(48297);
    }

    public final long b() {
        return (long) (this.f77914d * 1000);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(9021);
        if (f77910g == null) {
            synchronized (b.class) {
                try {
                    if (f77910g == null) {
                        f77910g = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9021);
                    throw th;
                }
            }
        }
        b bVar = f77910g;
        MethodCollector.o(9021);
        return bVar;
    }

    public final boolean a(long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        int i2 = instance.get(11);
        if (i2 >= this.f77911a || i2 < 5) {
            return true;
        }
        return false;
    }
}
