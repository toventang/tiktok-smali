package com.ss.android.ugc.aweme.search.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f120981a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f120982b = i.a((h.f.a.a) a.f120983a);

    private static int b() {
        return ((Number) f120982b.getValue()).intValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120983a = new a();

        static {
            Covode.recordClassIndex(78807);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return com.bytedance.ies.abmock.b.a().a(true, "bellagio_search_for_accounts_music_tags", 0);
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
        if (b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(78806);
    }

    public final String a(int i2) {
        int i3;
        if (a()) {
            i3 = R.string.fs;
        } else {
            i3 = R.string.drv;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            if (i2 == j.f121156d) {
                i3 = R.string.fja;
            }
            String b2 = com.ss.android.ugc.aweme.base.utils.h.b(i3);
            l.b(b2, "");
            return b2;
        }
        String b3 = com.ss.android.ugc.aweme.base.utils.h.b(i3);
        l.b(b3, "");
        return b3;
    }
}
