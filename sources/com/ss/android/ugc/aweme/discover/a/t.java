package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f80232a = new t();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80233b = i.a((h.f.a.a) a.f80234a);

    private t() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80234a = new a();

        static {
            Covode.recordClassIndex(49934);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "enable_search_multi_layer_in_fyp", 0);
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
        Covode.recordClassIndex(49933);
    }

    public static boolean a() {
        if (((Number) f80233b.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
