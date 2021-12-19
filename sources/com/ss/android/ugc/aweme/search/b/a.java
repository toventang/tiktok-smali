package com.ss.android.ugc.aweme.search.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120978a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f120979b = i.a((h.f.a.a) C3129a.f120980a);

    public static int b() {
        return ((Number) f120979b.getValue()).intValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.b.a$a  reason: collision with other inner class name */
    static final class C3129a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3129a f120980a = new C3129a();

        static {
            Covode.recordClassIndex(78805);
        }

        C3129a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "disable_relationship", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    public static boolean a() {
        if (b() != 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(78804);
    }
}
