package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f103858a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final h f103859b = i.a((h.f.a.a) a.f103860a);

    private static int e() {
        return ((Number) f103859b.getValue()).intValue();
    }

    private k() {
    }

    public static boolean b() {
        int e2 = e();
        if (4 <= e2 && 5 >= e2) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (e() > 0) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        int e2 = e();
        if (1 <= e2 && 5 >= e2) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103860a = new a();

        static {
            Covode.recordClassIndex(66526);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "separate_share_more_strategy", 0));
        }
    }

    static {
        Covode.recordClassIndex(66525);
    }

    public static boolean a() {
        if (e() == 1 || e() == 4) {
            return true;
        }
        return false;
    }
}
