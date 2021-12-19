package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f116353a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final h f116354b = h.i.a((h.f.a.a) a.f116355a);

    private static int c() {
        return ((Number) f116354b.getValue()).intValue();
    }

    private i() {
    }

    public static boolean a() {
        if (c() == 2) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116355a = new a();

        static {
            Covode.recordClassIndex(75125);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "recommend_card_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(75124);
    }

    public static boolean b() {
        if (c() == 1 || c() == 2) {
            return true;
        }
        return false;
    }
}
