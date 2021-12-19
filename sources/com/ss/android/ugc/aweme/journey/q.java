package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import h.a.am;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.Objects;
import java.util.Set;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    static Set<String> f104893a = am.a((Object[]) new String[]{"BR", "ID", "IN", "TH", "US", "VN"});

    /* renamed from: b  reason: collision with root package name */
    static Set<String> f104894b = am.a((Object[]) new String[]{"BR", "GB", "US", "AU", "DE", "FR", "JP", "KR", "TH", "VN", "ID", "KR"});

    /* renamed from: c  reason: collision with root package name */
    static final Set<String> f104895c = am.a("IN");

    /* renamed from: d  reason: collision with root package name */
    static final Set<String> f104896d = am.a((Object[]) new String[]{"AE", "SA", "KW", "QA", "OM", "BH", "MA", "TN", "LB"});

    /* renamed from: e  reason: collision with root package name */
    static final Set<String> f104897e = am.a("RU");

    /* renamed from: f  reason: collision with root package name */
    static final Set<String> f104898f = am.a("MY");

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f104899g = am.a("US");

    /* renamed from: h  reason: collision with root package name */
    public static final h f104900h = i.a(m.NONE, c.f104905a);

    /* renamed from: i  reason: collision with root package name */
    private static final h f104901i = i.a((h.f.a.a) b.f104904a);

    /* renamed from: j  reason: collision with root package name */
    private static final h f104902j = i.a((h.f.a.a) a.f104903a);

    public static final String a() {
        return (String) f104901i.getValue();
    }

    public static final int b() {
        return ((Number) f104902j.getValue()).intValue();
    }

    static final class b extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104904a = new b();

        static {
            Covode.recordClassIndex(67261);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = d.a();
            l.b(a2, "");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a2.toUpperCase();
            l.b(upperCase, "");
            return upperCase;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104905a = new c();

        static {
            Covode.recordClassIndex(67262);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (q.f104893a.contains(q.a())) {
                return q.a();
            }
            return "US";
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104903a = new a();

        static {
            Covode.recordClassIndex(67260);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            String a2 = q.a();
            if (q.f104895c.contains(a2)) {
                i2 = 7;
            } else if (q.f104896d.contains(a2)) {
                i2 = 12;
            } else if (q.f104897e.contains(a2) || q.f104898f.contains(a2) || !q.f104894b.contains(a2)) {
                i2 = 11;
            } else {
                i2 = 1;
            }
            return Integer.valueOf(i2);
        }
    }

    static {
        Covode.recordClassIndex(67259);
    }
}
