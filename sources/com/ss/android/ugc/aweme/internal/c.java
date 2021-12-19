package com.ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f104779a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final c f104780b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final int f104781c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f104782d = 2;

    private c() {
    }

    static {
        Covode.recordClassIndex(67190);
    }

    public static final boolean a() {
        try {
            if (b.a().a(true, "cla_consumer_group", 0) != f104779a) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
