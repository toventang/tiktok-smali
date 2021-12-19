package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ab f116426a;

    /* renamed from: b  reason: collision with root package name */
    public static final l f116427b = new l();

    public static final class a implements aa {
        static {
            Covode.recordClassIndex(75162);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.profile.f.aa
        public final void a(boolean z) {
            ab abVar = l.f116426a;
            if (abVar != null) {
                abVar.a("homepage_other_aweme_post", !z ? 1 : 0, false);
            }
        }
    }

    private l() {
    }

    public static void a() {
        ab abVar = f116426a;
        if (abVar != null) {
            abVar.a();
        }
    }

    public static void b() {
        ab abVar = f116426a;
        if (abVar != null) {
            abVar.b();
        }
    }

    public static void c() {
        ab abVar = f116426a;
        if (abVar != null) {
            abVar.d();
        }
    }

    public static aa d() {
        return new a();
    }

    static {
        Covode.recordClassIndex(75161);
    }

    public static void a(aa aaVar, String str) {
        h.f.b.l.d(aaVar, "");
        f116426a = new ab(new ah(System.currentTimeMillis(), 123), str, aaVar);
    }
}
