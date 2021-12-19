package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ab f116476a;

    /* renamed from: b  reason: collision with root package name */
    public static final z f116477b = new z();

    public static final class a implements aa {
        static {
            Covode.recordClassIndex(75184);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.profile.f.aa
        public final void a(boolean z) {
            ab abVar = z.f116476a;
            if (abVar != null) {
                abVar.a("homepage_other_profile_info", !z ? 1 : 0, false);
            }
        }
    }

    private z() {
    }

    public static aa a() {
        return new a();
    }

    static {
        Covode.recordClassIndex(75183);
    }

    public static void a(aa aaVar, String str) {
        l.d(aaVar, "");
        f116476a = new ab(new ah(System.currentTimeMillis(), 123), str, aaVar);
    }
}
