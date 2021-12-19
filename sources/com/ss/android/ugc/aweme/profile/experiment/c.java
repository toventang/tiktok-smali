package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h f116336a = i.a((h.f.a.a) a.f116339a);

    /* renamed from: b  reason: collision with root package name */
    public static final c f116337b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f116338c = i.a((h.f.a.a) b.f116340a);

    public static int a() {
        return ((Number) f116338c.getValue()).intValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116339a = new a();

        static {
            Covode.recordClassIndex(75114);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (c.a() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116340a = new b();

        static {
            Covode.recordClassIndex(75115);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "guide_user_reach_private_account_setting_user_all", 0));
        }
    }

    static {
        Covode.recordClassIndex(75113);
    }
}
