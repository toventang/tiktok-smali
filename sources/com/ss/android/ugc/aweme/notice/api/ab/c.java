package com.ss.android.ugc.aweme.notice.api.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f112659a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f112660b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final int f112661c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final c f112662d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static final int f112663e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final h f112664f = i.a((h.f.a.a) a.f112665a);

    public static int a() {
        return ((Number) f112664f.getValue()).intValue();
    }

    private c() {
    }

    public static final boolean c() {
        if (a() == f112661c) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112665a = new a();

        static {
            Covode.recordClassIndex(72402);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "social_reverse_ws_ability", 0));
        }
    }

    public static final boolean b() {
        if (a() == f112663e || a() == f112660b || a() == f112661c) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(72401);
    }
}
