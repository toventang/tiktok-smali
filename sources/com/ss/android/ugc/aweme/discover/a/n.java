package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f80220a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80221b = i.a((h.f.a.a) a.f80222a);

    private static int b() {
        return ((Number) f80221b.getValue()).intValue();
    }

    private n() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80222a = new a();

        static {
            Covode.recordClassIndex(49927);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "search_live_paging", 0);
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
        if (b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(49926);
    }
}
