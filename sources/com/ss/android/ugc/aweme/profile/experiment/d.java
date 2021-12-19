package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final h f116341a = i.a((h.f.a.a) b.f116345a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f116342b = i.a((h.f.a.a) a.f116344a);

    /* renamed from: c  reason: collision with root package name */
    public static final d f116343c = new d();

    private d() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116344a = new a();

        static {
            Covode.recordClassIndex(75117);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (((Number) d.f116341a.getValue()).intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116345a = new b();

        static {
            Covode.recordClassIndex(75118);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "guide_user_reach_private_account_setting_user_new", 0));
        }
    }

    static {
        Covode.recordClassIndex(75116);
    }
}
