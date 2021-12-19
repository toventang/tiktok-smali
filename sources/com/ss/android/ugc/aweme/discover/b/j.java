package com.ss.android.ugc.aweme.discover.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f80887a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80888b = i.a((h.f.a.a) a.f80889a);

    public static final int a() {
        return ((Number) f80888b.getValue()).intValue();
    }

    private j() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80889a = new a();

        static {
            Covode.recordClassIndex(50290);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "search_video_player_optimization", 0);
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

    public static boolean c() {
        if (a() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(50289);
    }

    public static boolean b() {
        if (a() == 0 || a() == 3) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (a() == 2 || a() == 4) {
            return true;
        }
        return false;
    }
}
