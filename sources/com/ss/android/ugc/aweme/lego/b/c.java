package com.ss.android.ugc.aweme.lego.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f107430a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final c f107431b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f107432c = true;

    /* renamed from: d  reason: collision with root package name */
    private static final h f107433d = i.a((h.f.a.a) a.f107434a);

    public static boolean a() {
        return ((Boolean) f107433d.getValue()).booleanValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107434a = new a();

        static {
            Covode.recordClassIndex(68764);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("grade_6_device", c.f107430a));
        }
    }

    static {
        Covode.recordClassIndex(68763);
    }
}
