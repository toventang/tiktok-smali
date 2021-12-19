package com.ss.android.ugc.g.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static long f145629a = -1;

    /* renamed from: b  reason: collision with root package name */
    static long f145630b = -1;

    /* renamed from: c  reason: collision with root package name */
    static int f145631c;

    /* renamed from: d  reason: collision with root package name */
    static AtomicBoolean f145632d = new AtomicBoolean(true);

    /* renamed from: e  reason: collision with root package name */
    static Thread f145633e;

    /* renamed from: f  reason: collision with root package name */
    static a f145634f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f145635g = new d();

    /* renamed from: h  reason: collision with root package name */
    private static b f145636h = b.UNKNOWN_STATUS;

    private d() {
    }

    static {
        Covode.recordClassIndex(95641);
    }

    public static void a(long j2) {
        Thread thread;
        a aVar = f145634f;
        if (aVar != null && aVar.f145568b.contains(Long.valueOf(j2)) && (thread = f145633e) != null) {
            thread.interrupt();
        }
    }
}
