package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class bx {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89665a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final bx f89666b = new bx();

    /* renamed from: c  reason: collision with root package name */
    private static final int f89667c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f89668d = 2;

    /* renamed from: e  reason: collision with root package name */
    private static final h<Integer> f89669e = i.a((h.f.a.a) a.f89670a);

    private bx() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89670a = new a();

        static {
            Covode.recordClassIndex(56351);
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
                return b.a().a("cpu_big_core_bound_client", ClientExpManager.cpu_big_core_bound_client());
            } catch (Exception unused) {
                return bx.f89665a;
            }
        }
    }

    static {
        Covode.recordClassIndex(56350);
    }

    public static boolean a() {
        if (c.f29648d && f89669e.getValue().intValue() == f89667c) {
            return true;
        }
        return false;
    }
}
