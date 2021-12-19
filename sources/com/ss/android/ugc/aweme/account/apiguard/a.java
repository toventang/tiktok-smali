package com.ss.android.ugc.aweme.account.apiguard;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f62861a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f62862b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f62863c = true;

    private a() {
    }

    public static final boolean a() {
        boolean z = f62861a;
        try {
            return b.a().a(true, "enable_apiguard_android", false);
        } catch (Throwable unused) {
            return z;
        }
    }

    static {
        Covode.recordClassIndex(38724);
    }
}
