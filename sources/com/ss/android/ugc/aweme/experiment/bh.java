package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class bh {

    /* renamed from: a  reason: collision with root package name */
    public static final bh f89607a = new bh();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89608b = i.a((h.f.a.a) a.f89609a);

    private bh() {
    }

    public static int a() {
        return ((Number) f89608b.getValue()).intValue();
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89609a = new a();

        static {
            Covode.recordClassIndex(56315);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("preload_feed_count", 0));
        }
    }

    static {
        Covode.recordClassIndex(56314);
    }
}
