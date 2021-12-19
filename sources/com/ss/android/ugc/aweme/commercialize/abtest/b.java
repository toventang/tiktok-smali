package com.ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.p;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final p f73625a = p.DEFAULT_DISABLE_VERSION;

    /* renamed from: b  reason: collision with root package name */
    public static final b f73626b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final p f73627c = p.DEFAULT_ONLINE_VERSION;

    /* renamed from: d  reason: collision with root package name */
    private static final p f73628d = p.DEFAULT_TEST_VERSION;

    private b() {
    }

    static {
        Covode.recordClassIndex(45315);
    }

    public static final p a() {
        try {
            Object a2 = com.bytedance.ies.abmock.b.a().a(true, "aweme_ad_rank", p.class);
            l.b(a2, "");
            return (p) a2;
        } catch (Throwable unused) {
            return f73625a;
        }
    }
}
