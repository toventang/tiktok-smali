package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class as {

    /* renamed from: a  reason: collision with root package name */
    public static final as f80184a = new as();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80185b = i.a((h.f.a.a) a.f80186a);

    public static int a() {
        return ((Number) f80185b.getValue()).intValue();
    }

    private as() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80186a = new a();

        static {
            Covode.recordClassIndex(49906);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "video_layout_optimization", 0);
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

    static {
        Covode.recordClassIndex(49905);
    }

    public static boolean b() {
        if (a() == 0 || a() == 1 || a() == 2) {
            return true;
        }
        return false;
    }
}
