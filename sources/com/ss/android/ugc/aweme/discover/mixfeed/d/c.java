package com.ss.android.ugc.aweme.discover.mixfeed.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f81721a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f81722b = i.a((h.f.a.a) a.f81723a);

    public static int a() {
        return ((Number) f81722b.getValue()).intValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81723a = new a();

        static {
            Covode.recordClassIndex(50768);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "enable_show_related_searches", 0);
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
        Covode.recordClassIndex(50767);
    }
}
