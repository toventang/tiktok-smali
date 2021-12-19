package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ev {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89991a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final ev f89992b = new ev();

    /* renamed from: c  reason: collision with root package name */
    private static final int f89993c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f89994d = 2;

    /* renamed from: e  reason: collision with root package name */
    private static final int f89995e = 3;

    /* renamed from: f  reason: collision with root package name */
    private static final h<Integer> f89996f = i.a((h.f.a.a) a.f89998a);

    /* renamed from: g  reason: collision with root package name */
    private static final h<Boolean> f89997g = i.a((h.f.a.a) b.f89999a);

    private ev() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89999a = new b();

        static {
            Covode.recordClassIndex(56487);
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
        public static final a f89998a = new a();

        static {
            Covode.recordClassIndex(56486);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a("new_user_guide_animation", ClientExpManager.new_user_guide_animation()));
        }
    }

    static {
        Covode.recordClassIndex(56485);
    }

    public static boolean a() {
        if (!c.f29648d) {
            return false;
        }
        Boolean value = f89997g.getValue();
        l.b(value, "");
        if (!value.booleanValue() || f89996f.getValue().intValue() == f89991a) {
            return false;
        }
        return true;
    }

    public static int b() {
        if (c.f29648d && f89997g.getValue().booleanValue()) {
            int intValue = f89996f.getValue().intValue();
            if (intValue == f89994d) {
                return 1;
            }
            if (intValue == f89995e) {
                return 2;
            }
        }
        return 0;
    }
}
