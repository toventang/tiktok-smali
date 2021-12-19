package com.ss.android.ugc.aweme.setting.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f122206a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f122207b = i.a((h.f.a.a) a.f122208a);

    private static int b() {
        return ((Number) f122207b.getValue()).intValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122208a = new a();

        static {
            Covode.recordClassIndex(80120);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "creative_tools_enter_animation_opti", 0));
        }
    }

    static {
        Covode.recordClassIndex(80119);
    }

    public static final int a() {
        int b2 = b();
        if (b2 == 1) {
            return 7;
        }
        if (b2 == 2) {
            return 8;
        }
        if (b2 != 3) {
            return 3;
        }
        return 9;
    }
}
