package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class cz {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89753a = i.a((h.f.a.a) a.f89756a);

    /* renamed from: b  reason: collision with root package name */
    public static final cz f89754b = new cz();

    /* renamed from: c  reason: collision with root package name */
    private static final h f89755c = i.a((h.f.a.a) b.f89757a);

    public static int a() {
        return ((Number) f89755c.getValue()).intValue();
    }

    private cz() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89756a = new a();

        static {
            Covode.recordClassIndex(56396);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((cz.a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89757a = new b();

        static {
            Covode.recordClassIndex(56397);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("feed_preload_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(56395);
    }
}
