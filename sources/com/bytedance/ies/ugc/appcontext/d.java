package com.bytedance.ies.ugc.appcontext;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f34594a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Application f34595b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f34596c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Integer f34597d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile String f34598e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile c f34599f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile String f34600g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile a f34601h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile String f34602i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile String f34603j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile a f34604k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static volatile int f34605l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static volatile boolean f34606m;
    public static volatile int n = -1;
    public static volatile String o = "";
    public static volatile String p = "";
    public static volatile String q = "";
    public static volatile String r = "";
    public static volatile String s = "unknown";
    public static volatile boolean t;
    public static volatile String u;
    public static String v;
    public static boolean w;
    public static final d x = new d();
    private static final h y = i.a((h.f.a.a) b.f34610a);

    private d() {
    }

    public static int g() {
        return n;
    }

    public static String j() {
        return s;
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public volatile long f34611a;

        /* renamed from: b  reason: collision with root package name */
        public volatile String f34612b;

        static {
            Covode.recordClassIndex(20748);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34611a == cVar.f34611a && l.a(this.f34612b, cVar.f34612b);
        }

        public final String toString() {
            return "VersionInfo(versionCode=" + this.f34611a + ", versionName=" + this.f34612b + ")";
        }

        private /* synthetic */ c() {
            this(-1, "");
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f34611a;
            int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            String str = this.f34612b;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            return i3 + i2;
        }

        public c(long j2, String str) {
            l.d(str, "");
            this.f34611a = j2;
            this.f34612b = str;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public volatile long f34607a;

        /* renamed from: b  reason: collision with root package name */
        public volatile String f34608b;

        /* renamed from: c  reason: collision with root package name */
        public volatile long f34609c;

        static {
            Covode.recordClassIndex(20746);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f34607a == aVar.f34607a && l.a(this.f34608b, aVar.f34608b) && this.f34609c == aVar.f34609c;
        }

        public final String toString() {
            return "BussinessVersionInfo(versionCode=" + this.f34607a + ", versionName=" + this.f34608b + ", updateVersionCode=" + this.f34609c + ")";
        }

        private /* synthetic */ a() {
            this(-1, "", -1);
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f34607a;
            int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            String str = this.f34608b;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            long j3 = this.f34609c;
            return ((i3 + i2) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public a(long j2, String str, long j3) {
            l.d(str, "");
            this.f34607a = j2;
            this.f34608b = str;
            this.f34609c = j3;
        }
    }

    public static Context a() {
        Application application = f34595b;
        if (application == null) {
            l.a("context");
        }
        return application;
    }

    public static String b() {
        String str = f34598e;
        if (str == null) {
            l.a("appName");
        }
        return str;
    }

    public static String c() {
        String str = f34603j;
        if (str == null) {
            l.a("releaseBuild");
        }
        return str;
    }

    public static long d() {
        a aVar = f34601h;
        if (aVar == null) {
            l.a("bussinessVersionInfo");
        }
        return aVar.f34609c;
    }

    public static long e() {
        a aVar = f34601h;
        if (aVar == null) {
            l.a("bussinessVersionInfo");
        }
        return aVar.f34607a;
    }

    public static String f() {
        a aVar = f34601h;
        if (aVar == null) {
            l.a("bussinessVersionInfo");
        }
        return aVar.f34608b;
    }

    public static long h() {
        c cVar = f34599f;
        if (cVar == null) {
            l.a("versionInfo");
        }
        return cVar.f34611a;
    }

    public static String i() {
        c cVar = f34599f;
        if (cVar == null) {
            l.a("versionInfo");
        }
        return cVar.f34612b;
    }

    public static boolean k() {
        if (f34605l == 5) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34610a = new b();

        static {
            Covode.recordClassIndex(20747);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2;
            Integer num = d.f34597d;
            if (num != null && (a2 = d.a(num.intValue())) != null) {
                return a2;
            }
            String str = d.f34596c;
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    static {
        Covode.recordClassIndex(20745);
    }

    public static String a(int i2) {
        try {
            Application application = f34595b;
            if (application == null) {
                l.a("context");
            }
            String string = application.getString(i2);
            l.b(string, "");
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        a aVar = f34604k;
        aVar.f34586a = str;
        aVar.f34588c = str2;
        aVar.f34587b = str3;
    }
}
