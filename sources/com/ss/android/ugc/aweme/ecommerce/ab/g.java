package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.language.d;
import h.m.p;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f84219a = 3;

    /* renamed from: b  reason: collision with root package name */
    public static final int f84220b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f84221c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f84222d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static final g f84223e = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(52523);
    }

    public static int a() {
        int a2 = b.a().a(true, "ecom_combine_payment_config", -1);
        if (f84222d != a2) {
            return a2;
        }
        if (p.a("ID", d.a(), true)) {
            return f84220b;
        }
        if (p.a("GB", d.a(), true)) {
            return f84219a;
        }
        return f84220b;
    }
}
