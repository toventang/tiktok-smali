package com.ss.android.ugc.aweme.notice.api.ab;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f112656a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f112657b = i.a((h.f.a.a) a.f112658a);

    public static int a() {
        return ((Number) f112657b.getValue()).intValue();
    }

    private b() {
    }

    public static boolean b() {
        if (a() != 0) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112658a = new a();

        static {
            Covode.recordClassIndex(72400);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "notice_red_point_show_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(72399);
    }
}
