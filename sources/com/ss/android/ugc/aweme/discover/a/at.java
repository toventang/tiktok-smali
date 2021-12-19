package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static final at f80187a = new at();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80188b = i.a((h.f.a.a) a.f80189a);

    private at() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80189a = new a();

        static {
            Covode.recordClassIndex(49908);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "reverse_layout_optimization", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(49907);
    }

    public static boolean a() {
        if (((Number) f80188b.getValue()).intValue() == 0) {
            return true;
        }
        return false;
    }
}
