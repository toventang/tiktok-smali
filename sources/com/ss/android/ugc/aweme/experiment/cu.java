package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.cache.e;
import h.f.b.m;
import h.h;
import h.i;

public final class cu {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f89727a;

    /* renamed from: b  reason: collision with root package name */
    public static final cu f89728b = new cu();

    /* renamed from: c  reason: collision with root package name */
    private static final h f89729c = i.a((h.f.a.a) a.f89730a);

    public static boolean a() {
        return ((Boolean) f89729c.getValue()).booleanValue();
    }

    private cu() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89730a = new a();

        static {
            Covode.recordClassIndex(56383);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (e.n() || Keva.getRepo("ab_repo_cold_boot").getInt("first_feed_ok", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56382);
    }
}
