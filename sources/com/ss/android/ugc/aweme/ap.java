package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Objects;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    static final ArrayList<String> f66422a = n.d("US", "CA", "AU", "NZ", "GB", "IE", "IL", "MK", "JE", "IM", "ME", "GG", "CG", "AD", "RS", "FO", "GI", "SJ", "GR", "NL", "LT", "EE", "BA", "LV", "AL", "MT", "SM", "DE", "CH", "LI", "AT", "LU", "FR", "MA", "BE", "GF", "PF", "TF", "RU", "BY", "UA", "KZ", "MD", "GE", "AZ", "UZ", "TM", "KG", "TJ", "AM", "IT", "PL", "SE", "DK", "NO", "IS", "FI", "RO", "BG", "HU", "SK", "SI", "CZ", "HR");

    /* renamed from: b  reason: collision with root package name */
    public static final ap f66423b = new ap();

    private ap() {
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66426a = new b();

        static {
            Covode.recordClassIndex(40817);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) R.string.a46);
        }
    }

    public static int a() {
        return a(com.bytedance.ies.abmock.b.a().a(true, "studio_beauty_button_title_strategy", 0), a.f66424a);
    }

    public static int b() {
        return a(com.bytedance.ies.abmock.b.a().a(true, "beauty_switch_button_title_strategy", 0), b.f66426a);
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66424a = new a();

        static {
            Covode.recordClassIndex(40816);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            String a2 = g.a().y().a();
            l.b(a2, "");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a2.toUpperCase();
            l.b(upperCase, "");
            if (ap.f66422a.contains(upperCase)) {
                i2 = R.string.g_y;
            } else if (l.a((Object) "BR", (Object) upperCase) || l.a((Object) "JP", (Object) upperCase)) {
                i2 = R.string.g_z;
            } else {
                i2 = R.string.bwy;
            }
            return Integer.valueOf(i2);
        }
    }

    static {
        Covode.recordClassIndex(40815);
    }

    private static int a(int i2, h.f.a.a<Integer> aVar) {
        if (i2 == 1) {
            return R.string.bwy;
        }
        if (i2 == 2) {
            return R.string.g_y;
        }
        if (i2 != 3) {
            return aVar.invoke().intValue();
        }
        return R.string.g_z;
    }
}
