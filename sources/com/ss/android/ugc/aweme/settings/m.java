package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.h;
import h.i;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final int f123115a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f123116b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f123117c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f123118d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final m f123119e = new m();

    /* renamed from: f  reason: collision with root package name */
    private static final h f123120f = i.a((h.f.a.a) a.f123121a);

    private static int e() {
        return ((Number) f123120f.getValue()).intValue();
    }

    private m() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f123121a = new a();

        static {
            Covode.recordClassIndex(80860);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "enable_publish_parallel", 1));
        }
    }

    public static boolean b() {
        int e2 = e();
        if (e2 == f123116b || e2 == f123117c) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (e() == f123118d) {
            return true;
        }
        return false;
    }

    public static final boolean d() {
        int e2 = e();
        if (e2 == f123116b || e2 == f123118d) {
            return true;
        }
        return false;
    }

    public static final boolean a() {
        int e2 = e();
        if (e2 == f123116b || e2 == f123117c || e2 == f123118d) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(80859);
    }
}
