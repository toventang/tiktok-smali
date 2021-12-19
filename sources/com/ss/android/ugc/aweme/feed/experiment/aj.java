package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static final aj f93043a = new aj();

    /* renamed from: b  reason: collision with root package name */
    private static final h f93044b = i.a((h.f.a.a) a.f93045a);

    private static int c() {
        return ((Number) f93044b.getValue()).intValue();
    }

    private aj() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93045a = new a();

        static {
            Covode.recordClassIndex(59011);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "ux_opt_card_exp", 1));
        }
    }

    static {
        Covode.recordClassIndex(59010);
    }

    public static final boolean a() {
        if (c() == 2 || c() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (c() == 3 || c() == 4) {
            return true;
        }
        return false;
    }
}
