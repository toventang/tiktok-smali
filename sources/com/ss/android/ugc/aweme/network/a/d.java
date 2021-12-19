package com.ss.android.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f112539a = i.a((h.f.a.a) a.f112541a);

    /* renamed from: b  reason: collision with root package name */
    public static final d f112540b = new d();

    private d() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112541a = new a();

        static {
            Covode.recordClassIndex(72327);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("no_network_opt", false));
        }
    }

    static {
        Covode.recordClassIndex(72326);
    }
}
