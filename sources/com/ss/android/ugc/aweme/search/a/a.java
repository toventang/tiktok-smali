package com.ss.android.ugc.aweme.search.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120964a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f120965b = i.a((h.f.a.a) C3128a.f120966a);

    private static int e() {
        return ((Number) f120965b.getValue()).intValue();
    }

    private a() {
    }

    public static boolean a() {
        if (e() == 0) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (e() == 0 || e() == 1) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (e() == 2) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (e() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.search.a.a$a  reason: collision with other inner class name */
    static final class C3128a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3128a f120966a = new C3128a();

        static {
            Covode.recordClassIndex(78793);
        }

        C3128a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "playlist_interactive_optimization", 0));
        }
    }

    static {
        Covode.recordClassIndex(78792);
    }
}
