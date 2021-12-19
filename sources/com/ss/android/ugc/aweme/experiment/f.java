package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f90016a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f90017b = i.a((h.f.a.a) a.f90018a);

    private static int d() {
        return ((Number) f90017b.getValue()).intValue();
    }

    private f() {
    }

    public static final boolean a() {
        if ((d() & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if ((d() & 2) == 2) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if ((d() & 4) == 4) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90018a = new a();

        static {
            Covode.recordClassIndex(56498);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "add_comment_and_like_bubble", 0));
        }
    }

    static {
        Covode.recordClassIndex(56497);
    }
}
