package com.ss.android.ugc.aweme.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.legoImp.inflate.f;
import h.h;
import h.m;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final h f79344a = h.i.a(m.SYNCHRONIZED, c.f79350a);

    /* renamed from: b  reason: collision with root package name */
    public static final i f79345b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static final h f79346c = h.i.a(m.SYNCHRONIZED, a.f79348a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f79347d = h.i.a(m.SYNCHRONIZED, b.f79349a);

    public static int a() {
        return ((Number) f79346c.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f79347d.getValue()).booleanValue();
    }

    private i() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79348a = new a();

        static {
            Covode.recordClassIndex(49258);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(f.a());
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f79349a = new b();

        static {
            Covode.recordClassIndex(49259);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (i.a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f79350a = new c();

        static {
            Covode.recordClassIndex(49260);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (i.a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(49257);
    }
}
