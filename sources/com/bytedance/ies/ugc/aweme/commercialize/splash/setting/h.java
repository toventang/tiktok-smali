package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h.h f34819a = i.a((h.f.a.a) b.f34824a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f34820b = new h();

    /* renamed from: c  reason: collision with root package name */
    private static final h.h f34821c = i.a((h.f.a.a) c.f34825a);

    /* renamed from: d  reason: collision with root package name */
    private static final h.h f34822d = i.a((h.f.a.a) a.f34823a);

    public static int a() {
        return ((Number) f34821c.getValue()).intValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34823a = new a();

        static {
            Covode.recordClassIndex(20887);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (h.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34824a = new b();

        static {
            Covode.recordClassIndex(20888);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((h.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34825a = new c();

        static {
            Covode.recordClassIndex(20889);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("splash_new_factory_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(20886);
    }
}
