package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.s;
import h.a.am;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class dp {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f89818a = Keva.getRepo("remove_onboarding_steps");

    /* renamed from: b  reason: collision with root package name */
    public static final String f89819b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f89820c = i.a((h.f.a.a) b.f89822a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f89821d = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(56422);
        }

        public static Boolean a() {
            return (Boolean) dp.f89820c.getValue();
        }

        private a() {
        }

        public static String b() {
            if (!a().booleanValue()) {
                return null;
            }
            if (c.a() != null) {
                return c.a();
            }
            if (d.a() != null) {
                return d.a();
            }
            return null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f89823a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final c f89824b = new c();

        /* renamed from: c  reason: collision with root package name */
        private static final int f89825c = 1;

        /* renamed from: d  reason: collision with root package name */
        private static final int f89826d = 2;

        /* renamed from: e  reason: collision with root package name */
        private static final int f89827e = 3;

        /* renamed from: f  reason: collision with root package name */
        private static final int f89828f = 4;

        /* renamed from: g  reason: collision with root package name */
        private static final Set<String> f89829g = am.a((Object[]) new String[]{"IL", "PH", "TH", "TW"});

        private c() {
        }

        private static boolean b() {
            if (!f89829g.contains(dp.f89819b)) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(56424);
            a.a();
        }

        public static String a() {
            if (b()) {
                return null;
            }
            int a2 = com.bytedance.ies.abmock.b.a().a("gender_selection_onboarding_countries", ClientExpManager.gender_selection_onboarding_countries());
            if (a2 == f89823a) {
                return "70315650";
            }
            if (a2 == f89825c) {
                return "70315651";
            }
            if (a2 == f89826d) {
                return "70315652";
            }
            if (a2 == f89827e) {
                return "70315653";
            }
            if (a2 == f89828f) {
                return "70315654";
            }
            return null;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f89830a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final d f89831b = new d();

        /* renamed from: c  reason: collision with root package name */
        private static final int f89832c = 1;

        /* renamed from: d  reason: collision with root package name */
        private static final int f89833d = 2;

        /* renamed from: e  reason: collision with root package name */
        private static final int f89834e = 3;

        /* renamed from: f  reason: collision with root package name */
        private static final int f89835f = 4;

        /* renamed from: g  reason: collision with root package name */
        private static final Set<String> f89836g = am.a((Object[]) new String[]{"AE", "BD", "EG", "ID", "MY", "NG", "PK", "SA"});

        private d() {
        }

        private static boolean b() {
            if (!f89836g.contains(dp.f89819b)) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(56425);
        }

        public static String a() {
            if (b()) {
                return null;
            }
            int a2 = com.bytedance.ies.abmock.b.a().a("gender_selection_onboarding_gender_sensitive_countries", ClientExpManager.gender_selection_onboarding_gender_sensitive_countries());
            if (a2 == f89830a) {
                return "70315655";
            }
            if (a2 == f89832c) {
                return "70315656";
            }
            if (a2 == f89833d) {
                return "70315657";
            }
            if (a2 == f89834e) {
                return "70315658";
            }
            if (a2 == f89835f) {
                return "70315659";
            }
            return null;
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89822a = new b();

        static {
            Covode.recordClassIndex(56423);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            if (dp.f89818a.contains("is_new_user_key")) {
                return Boolean.valueOf(dp.f89818a.getBoolean("is_new_user_key", false));
            }
            Boolean a2 = s.a();
            Keva keva = dp.f89818a;
            l.b(a2, "");
            keva.storeBoolean("is_new_user_key", a2.booleanValue());
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(56421);
        String a2 = com.ss.android.ugc.aweme.language.d.a();
        l.b(a2, "");
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a2.toUpperCase(locale);
        l.b(upperCase, "");
        f89819b = upperCase;
    }
}
