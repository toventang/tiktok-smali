package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class es {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89966a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f89967b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final h<Integer> f89968c = i.a((h.f.a.a) a.f89973a);

    /* renamed from: d  reason: collision with root package name */
    public static final h<Boolean> f89969d = i.a((h.f.a.a) b.f89974a);

    /* renamed from: e  reason: collision with root package name */
    public static boolean f89970e;

    /* renamed from: f  reason: collision with root package name */
    public static final es f89971f = new es();

    /* renamed from: g  reason: collision with root package name */
    private static final int f89972g = 1;

    private es() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89974a = new b();

        static {
            Covode.recordClassIndex(56478);
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
        public static final a f89973a = new a();

        static {
            Covode.recordClassIndex(56477);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a("is_opt_new_user_boot", ClientExpManager.is_opt_new_user_boot()));
        }
    }

    static {
        Covode.recordClassIndex(56476);
    }

    public static boolean a() {
        if (!c.f29648d) {
            return false;
        }
        Boolean value = f89969d.getValue();
        l.b(value, "");
        if (value.booleanValue() && f89970e) {
            h<Integer> hVar = f89968c;
            if (hVar.getValue().intValue() == f89972g || hVar.getValue().intValue() == f89967b) {
                return true;
            }
        }
        return false;
    }
}
