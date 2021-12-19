package com.ss.android.ugc.aweme.comment.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f71788a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f71789b = i.a((h.f.a.a) a.f71790a);

    public static int a() {
        return ((Number) f71789b.getValue()).intValue();
    }

    private g() {
    }

    public static boolean b() {
        if (a() > 0) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        int a2 = a();
        if (1 <= a2 && 4 >= a2) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71790a = new a();

        static {
            Covode.recordClassIndex(44147);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "social_video_tag", 0));
        }
    }

    static {
        Covode.recordClassIndex(44146);
    }

    public static boolean c() {
        if (a() <= 0 || a() == 4) {
            return false;
        }
        return true;
    }
}
