package com.ss.android.ugc.aweme.discover.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f80976a = 3;

    /* renamed from: b  reason: collision with root package name */
    public static final c f80977b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f80978c = i.a((h.f.a.a) a.f80979a);

    public static boolean a() {
        return ((Boolean) f80978c.getValue()).booleanValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80979a = new a();

        static {
            Covode.recordClassIndex(50343);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private static boolean a() {
            int i2;
            try {
                i2 = SettingsManager.a().a("discover_fps_phone_performance_2", 3);
            } catch (Exception e2) {
                e2.printStackTrace();
                i2 = c.f80976a;
            }
            if (i2 == 3) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(50342);
    }
}
