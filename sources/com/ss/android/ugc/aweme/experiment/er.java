package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class er {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89956a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f89957b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f89958c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final h<Integer> f89959d = i.a((h.f.a.a) a.f89964a);

    /* renamed from: e  reason: collision with root package name */
    public static final h<Boolean> f89960e = i.a((h.f.a.a) b.f89965a);

    /* renamed from: f  reason: collision with root package name */
    public static final er f89961f = new er();

    /* renamed from: g  reason: collision with root package name */
    private static final int f89962g = 1;

    /* renamed from: h  reason: collision with root package name */
    private static final int f89963h = 4;

    private er() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89965a = new b();

        static {
            Covode.recordClassIndex(56475);
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
        public static final a f89964a = new a();

        static {
            Covode.recordClassIndex(56474);
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
                return com.bytedance.ies.abmock.b.a().a("backup_video_opt", ClientExpManager.backup_video_opt());
            } catch (Exception unused) {
                return er.f89956a;
            }
        }
    }

    static {
        Covode.recordClassIndex(56473);
    }

    public static boolean a() {
        if (!c.f29648d) {
            return false;
        }
        Boolean value = f89960e.getValue();
        l.b(value, "");
        if (!value.booleanValue() || f89959d.getValue().intValue() == f89956a) {
            return false;
        }
        return true;
    }
}
