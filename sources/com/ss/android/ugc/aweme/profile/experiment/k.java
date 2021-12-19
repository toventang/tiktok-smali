package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final h f116357a = i.a((h.f.a.a) b.f116363a);

    /* renamed from: b  reason: collision with root package name */
    public static final k f116358b = new k();

    /* renamed from: c  reason: collision with root package name */
    private static final h f116359c = i.a((h.f.a.a) d.f116365a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f116360d = i.a((h.f.a.a) a.f116362a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f116361e = i.a((h.f.a.a) c.f116364a);

    public static int a() {
        return ((Number) f116359c.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f116360d.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f116361e.getValue()).booleanValue();
    }

    private k() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116362a = new a();

        static {
            Covode.recordClassIndex(75128);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (k.a() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116363a = new b();

        static {
            Covode.recordClassIndex(75129);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (k.a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f116364a = new c();

        static {
            Covode.recordClassIndex(75130);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (k.a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f116365a = new d();

        static {
            Covode.recordClassIndex(75131);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "blank_profile_recommend_users", 0));
        }
    }

    static {
        Covode.recordClassIndex(75127);
    }
}
