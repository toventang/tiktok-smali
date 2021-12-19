package com.ss.android.ugc.aweme.discover.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f80884a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80885b = h.i.a((h.f.a.a) a.f80886a);

    private static int b() {
        return ((Number) f80885b.getValue()).intValue();
    }

    private i() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80886a = new a();

        static {
            Covode.recordClassIndex(50288);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "search_video_auto_play_sound_control", 0);
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
        Covode.recordClassIndex(50287);
    }
}
