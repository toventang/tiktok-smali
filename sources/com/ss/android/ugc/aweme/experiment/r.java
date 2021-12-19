package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f90272a = i.a((h.f.a.a) a.f90274a);

    /* renamed from: b  reason: collision with root package name */
    public static final r f90273b = new r();

    private r() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90274a = new a();

        static {
            Covode.recordClassIndex(56620);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 1).getBoolean("keva_multiple_memcache", true));
        }
    }

    static {
        Covode.recordClassIndex(56619);
    }
}
