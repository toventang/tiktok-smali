package com.ss.android.ugc.aweme.discover.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f80881a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f80882b = i.a((h.f.a.a) a.f80883a);

    public static final int a() {
        return ((Number) f80882b.getValue()).intValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80883a = new a();

        static {
            Covode.recordClassIndex(50286);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "enable_line_trigger_auto_play_in_search", 0);
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

    public static final boolean b() {
        if (a() != 0) {
            return true;
        }
        return false;
    }

    public static final boolean d() {
        if (!b() || c()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(50285);
    }

    public static final boolean c() {
        if (a() == 4 || a() == 5) {
            return true;
        }
        return false;
    }
}
