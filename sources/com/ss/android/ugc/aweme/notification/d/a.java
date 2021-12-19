package com.ss.android.ugc.aweme.notification.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f113323a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final a f113324b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f113325c = i.a((h.f.a.a) C2895a.f113326a);

    private static int a() {
        return ((Number) f113325c.getValue()).intValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.d.a$a  reason: collision with other inner class name */
    static final class C2895a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2895a f113326a = new C2895a();

        static {
            Covode.recordClassIndex(72868);
        }

        C2895a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "notice_report_boot_rate", 0);
            } catch (Throwable unused) {
                return a.f113323a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(72867);
    }

    public static boolean a(long j2, long j3) {
        if (a() > 0 && j3 - j2 > ((long) a()) * 3600000) {
            return true;
        }
        return false;
    }
}
