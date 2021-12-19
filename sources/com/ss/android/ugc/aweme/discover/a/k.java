package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.language.d;
import h.a.am;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Locale;
import java.util.Set;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final j f80209a = new j((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final k f80210b = new k();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f80211c = am.a((Object[]) new String[]{"NP", "AE", "MY", "PH", "TR", "KH", "TH", "SA", "CA"});

    /* renamed from: d  reason: collision with root package name */
    private static final h f80212d = i.a((h.f.a.a) a.f80213a);

    public static j b() {
        return (j) f80212d.getValue();
    }

    private k() {
    }

    static final class a extends m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80213a = new a();

        static {
            Covode.recordClassIndex(49921);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return b.a().a(true, "search_icon_on_feed", j.class, k.f80209a);
        }
    }

    static {
        Covode.recordClassIndex(49920);
    }

    public static boolean a() {
        Integer num;
        String a2 = d.a();
        if (a2 != null) {
            Set<String> set = f80211c;
            String upperCase = a2.toUpperCase(Locale.ROOT);
            l.b(upperCase, "");
            if (!set.contains(upperCase)) {
                return true;
            }
        }
        j b2 = b();
        if (b2 == null || (num = b2.f80206a) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
