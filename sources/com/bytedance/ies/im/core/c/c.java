package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final long f34022a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public static final c f34023b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final long f34024c = 7000;

    /* renamed from: d  reason: collision with root package name */
    private static final long f34025d = 15000;

    /* renamed from: e  reason: collision with root package name */
    private static final h f34026e = i.a((h.f.a.a) a.f34027a);

    public static final long a() {
        return ((Number) f34026e.getValue()).longValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34027a = new a();

        static {
            Covode.recordClassIndex(20263);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(b.a().a(true, "im_extend_report_interval", 1000L));
        }
    }

    static {
        Covode.recordClassIndex(20262);
    }
}
