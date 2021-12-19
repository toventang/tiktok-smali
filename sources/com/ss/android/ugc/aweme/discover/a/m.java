package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.h;
import h.i;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f80217a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80218b = i.a((h.f.a.a) a.f80219a);

    public static int b() {
        return ((Number) f80218b.getValue()).intValue();
    }

    private m() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80219a = new a();

        static {
            Covode.recordClassIndex(49925);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "discover_placeholder_style", 0);
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

    public static boolean a() {
        if (b() != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(49924);
    }
}
