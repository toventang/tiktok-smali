package com.ss.android.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f59594a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f59595b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f59596c = i.a((h.f.a.a) C1298a.f59597a);

    private static boolean b() {
        return ((Boolean) f59596c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.j.a$a  reason: collision with other inner class name */
    static final class C1298a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1298a f59597a = new C1298a();

        static {
            Covode.recordClassIndex(36785);
        }

        C1298a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "btm_switch", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(36784);
    }

    public static boolean a() {
        if (f59594a) {
            return b();
        }
        if (b.a().a(true, "btm_switch", 0) == 1) {
            return true;
        }
        return false;
    }
}
