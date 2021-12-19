package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class hh {

    /* renamed from: a  reason: collision with root package name */
    public static final hh f90216a = new hh();

    /* renamed from: b  reason: collision with root package name */
    private static final h f90217b = i.a((h.f.a.a) a.f90218a);

    public static int a() {
        return ((Number) f90217b.getValue()).intValue();
    }

    private hh() {
    }

    public static boolean b() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90218a = new a();

        static {
            Covode.recordClassIndex(56589);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "feed_user_suggestion_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(56588);
    }
}
