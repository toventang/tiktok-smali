package com.ss.android.ugc.aweme.notice.api.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112652a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f112653b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final h f112654c = i.a((h.f.a.a) C2883a.f112655a);

    public static int a() {
        return ((Number) f112654c.getValue()).intValue();
    }

    private a() {
    }

    public static boolean b() {
        if (a() == f112653b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ab.a$a  reason: collision with other inner class name */
    static final class C2883a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2883a f112655a = new C2883a();

        static {
            Covode.recordClassIndex(72398);
        }

        C2883a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "refactor_notification_code", 0));
        }
    }

    static {
        Covode.recordClassIndex(72397);
    }
}
