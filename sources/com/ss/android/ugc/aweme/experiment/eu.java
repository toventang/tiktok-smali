package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class eu {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89982a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final eu f89983b = new eu();

    /* renamed from: c  reason: collision with root package name */
    private static final int f89984c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f89985d = 2;

    /* renamed from: e  reason: collision with root package name */
    private static final int f89986e = 3;

    /* renamed from: f  reason: collision with root package name */
    private static final h<Integer> f89987f = i.a((h.f.a.a) a.f89989a);

    /* renamed from: g  reason: collision with root package name */
    private static final h<Boolean> f89988g = i.a((h.f.a.a) b.f89990a);

    private eu() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89990a = new b();

        static {
            Covode.recordClassIndex(56484);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return s.a();
        }
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89989a = new a();

        static {
            Covode.recordClassIndex(56483);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }

        private static int a() {
            try {
                return com.bytedance.ies.abmock.b.a().a("new_user_feed_total_opt", ClientExpManager.new_user_feed_total_opt());
            } catch (Exception unused) {
                return eu.f89982a;
            }
        }
    }

    static {
        Covode.recordClassIndex(56482);
    }

    public static boolean a() {
        if (!c.f29648d) {
            return false;
        }
        Boolean value = f89988g.getValue();
        l.b(value, "");
        if (value.booleanValue()) {
            h<Integer> hVar = f89987f;
            if (hVar.getValue().intValue() == f89984c || hVar.getValue().intValue() == f89985d) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        if (!c.f29648d) {
            return false;
        }
        Boolean value = f89988g.getValue();
        l.b(value, "");
        if (!value.booleanValue() || f89987f.getValue().intValue() != f89985d) {
            return false;
        }
        return true;
    }
}
