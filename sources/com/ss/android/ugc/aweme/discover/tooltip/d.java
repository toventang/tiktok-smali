package com.ss.android.ugc.aweme.discover.tooltip;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static c f82062a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f82063b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f82064c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f82065d = true;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f82066e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f82067f;

    /* renamed from: g  reason: collision with root package name */
    public static String f82068g = "";

    /* renamed from: h  reason: collision with root package name */
    public static long f82069h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static long f82070i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static String f82071j = "";

    /* renamed from: k  reason: collision with root package name */
    public static String f82072k = "automatic_dismissal";

    /* renamed from: l  reason: collision with root package name */
    public static final Keva f82073l = Keva.getRepo("first_time_discovery");

    /* renamed from: m  reason: collision with root package name */
    public static int f82074m;
    public static final h n = i.a((h.f.a.a) b.f82075a);
    public static final a o = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(51075);
        }

        public static Boolean a() {
            return (Boolean) d.n.getValue();
        }

        private a() {
        }

        public static void f() {
            c cVar = d.f82062a;
            if (cVar != null) {
                cVar.b();
            }
        }

        public static int c() {
            if (d.f82073l.getBoolean("first_time", true)) {
                return 1;
            }
            return 0;
        }

        public static int e() {
            if (d.f82073l.getBoolean("tooltip_shown", false)) {
                return 1;
            }
            return 0;
        }

        public static void b() {
            Boolean a2 = a();
            l.b(a2, "");
            if (a2.booleanValue()) {
                d.f82074m = 1;
            }
        }

        public static int d() {
            Boolean a2 = a();
            l.b(a2, "");
            if (a2.booleanValue()) {
                return 1;
            }
            return 0;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void b(String str) {
            l.d(str, "");
            d.f82071j = str;
        }

        public static void c(String str) {
            l.d(str, "");
            d.f82068g = str;
        }

        public static void a(String str) {
            l.d(str, "");
            if (com.bytedance.ies.abmock.b.a().a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) != 0) {
                d.f82072k = str;
            }
        }

        public static void a(boolean z) {
            d.f82063b = z;
            if (!z) {
                d.f82073l.storeBoolean("tooltip_shown", true);
            }
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f82075a = new b();

        static {
            Covode.recordClassIndex(51076);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            if (d.f82073l.contains("is_new_user_key")) {
                return Boolean.valueOf(d.f82073l.getBoolean("is_new_user_key", false));
            }
            Boolean a2 = s.a();
            Keva keva = d.f82073l;
            l.b(a2, "");
            keva.storeBoolean("is_new_user_key", a2.booleanValue());
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(51074);
        a.b();
    }
}
