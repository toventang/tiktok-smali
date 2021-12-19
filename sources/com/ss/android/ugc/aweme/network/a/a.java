package com.ss.android.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final h f112527a = i.a((h.f.a.a) C2876a.f112530a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f112528b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f112529c = i.a((h.f.a.a) b.f112531a);

    public static boolean a() {
        return ((Boolean) f112529c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.a$a  reason: collision with other inner class name */
    static final class C2876a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2876a f112530a = new C2876a();

        static {
            Covode.recordClassIndex(72321);
        }

        C2876a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("enable_request_tag", 0));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112531a = new b();

        static {
            Covode.recordClassIndex(72322);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) a.f112527a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(72320);
    }
}
