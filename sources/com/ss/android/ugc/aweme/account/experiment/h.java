package com.ss.android.ugc.aweme.account.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f62996a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final h f62997b = new h();

    /* renamed from: c  reason: collision with root package name */
    private static final int f62998c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f62999d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static final int f63000e = 4;

    /* renamed from: f  reason: collision with root package name */
    private static final int f63001f = 5;

    /* renamed from: g  reason: collision with root package name */
    private static final int f63002g = 6;

    /* renamed from: h  reason: collision with root package name */
    private static final h.h f63003h = i.a((h.f.a.a) a.f63004a);

    private static int f() {
        return ((Number) f63003h.getValue()).intValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63004a = new a();

        static {
            Covode.recordClassIndex(38807);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a("gm_btn_appearance_optimize", ClientExpManager.gm_btn_appearance_optimize()));
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        if (f() == f62998c || f() == f62999d) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c() && f() == f63002g) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(38806);
    }

    public final boolean d() {
        if (!c()) {
            return false;
        }
        if (f() == f63000e || f() == f63001f || f() == f63002g) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (!c()) {
            return false;
        }
        if (f() == f62999d || f() == f63001f || f() == f63002g) {
            return true;
        }
        return false;
    }

    public final String a(Context context) {
        l.d(context, "");
        if (!c() || f() == f62996a || f() == f62998c || f() == f63000e) {
            return null;
        }
        return context.getString(R.string.c_c);
    }
}
