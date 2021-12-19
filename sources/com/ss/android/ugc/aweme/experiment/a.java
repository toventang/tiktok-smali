package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89513a = i.a((h.f.a.a) c.f89519a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f89514b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f89515c = i.a((h.f.a.a) C2166a.f89517a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f89516d = i.a((h.f.a.a) b.f89518a);

    public static int a() {
        return ((Number) f89515c.getValue()).intValue();
    }

    private a() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89518a = new b();

        static {
            Covode.recordClassIndex(56257);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (a.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89519a = new c();

        static {
            Covode.recordClassIndex(56258);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((a.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.a$a  reason: collision with other inner class name */
    static final class C2166a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2166a f89517a = new C2166a();

        static {
            Covode.recordClassIndex(56256);
        }

        C2166a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("ab_earse_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(56255);
    }
}
