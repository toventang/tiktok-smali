package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lego.b.c;
import h.f.b.m;
import h.h;
import h.i;

public final class by {

    /* renamed from: a  reason: collision with root package name */
    static final h f89671a = i.a((h.f.a.a) b.f89675a);

    /* renamed from: b  reason: collision with root package name */
    public static final by f89672b = new by();

    /* renamed from: c  reason: collision with root package name */
    private static final h f89673c = i.a((h.f.a.a) a.f89674a);

    public static boolean a() {
        return ((Boolean) f89673c.getValue()).booleanValue();
    }

    private by() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89674a = new a();

        static {
            Covode.recordClassIndex(56353);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!c.a() || (((Number) by.f89671a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89675a = new b();

        static {
            Covode.recordClassIndex(56354);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("delay_ttlivesdk", 1));
        }
    }

    static {
        Covode.recordClassIndex(56352);
    }
}
