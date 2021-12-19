package com.ss.android.ugc.aweme.commercialize.util.adrouter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.ag;
import h.a.z;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C1718b f75407a;

    /* renamed from: b  reason: collision with root package name */
    public final g f75408b;

    /* renamed from: c  reason: collision with root package name */
    public final f f75409c;

    /* renamed from: d  reason: collision with root package name */
    public final e f75410d;

    /* renamed from: e  reason: collision with root package name */
    public final d f75411e;

    /* renamed from: f  reason: collision with root package name */
    public c f75412f;

    static {
        Covode.recordClassIndex(46545);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$b  reason: collision with other inner class name */
    public static final class C1718b {

        /* renamed from: a  reason: collision with root package name */
        public AwemeRawAd f75414a;

        /* renamed from: b  reason: collision with root package name */
        public long f75415b;

        /* renamed from: c  reason: collision with root package name */
        public long f75416c;

        /* renamed from: d  reason: collision with root package name */
        public String f75417d;

        /* renamed from: e  reason: collision with root package name */
        public long f75418e;

        /* renamed from: f  reason: collision with root package name */
        public String f75419f;

        /* renamed from: g  reason: collision with root package name */
        public int f75420g;

        /* renamed from: h  reason: collision with root package name */
        public String f75421h;

        /* renamed from: i  reason: collision with root package name */
        public String f75422i;

        static {
            Covode.recordClassIndex(46547);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1718b)) {
                return false;
            }
            C1718b bVar = (C1718b) obj;
            return l.a(this.f75414a, bVar.f75414a) && this.f75415b == bVar.f75415b && this.f75416c == bVar.f75416c && l.a(this.f75417d, bVar.f75417d) && this.f75418e == bVar.f75418e && l.a(this.f75419f, bVar.f75419f) && this.f75420g == bVar.f75420g && l.a(this.f75421h, bVar.f75421h) && l.a(this.f75422i, bVar.f75422i);
        }

        public final String toString() {
            return "CommonData(awemeRawAd=" + this.f75414a + ", adId=" + this.f75415b + ", creativeId=" + this.f75416c + ", logExtra=" + this.f75417d + ", groupId=" + this.f75418e + ", adType=" + this.f75419f + ", adSystemOrigin=" + this.f75420g + ", awemeId=" + this.f75421h + ", authorUid=" + this.f75422i + ")";
        }

        public /* synthetic */ C1718b() {
            this("", "");
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            AwemeRawAd awemeRawAd = this.f75414a;
            int i6 = 0;
            if (awemeRawAd != null) {
                i2 = awemeRawAd.hashCode();
            } else {
                i2 = 0;
            }
            long j2 = this.f75415b;
            long j3 = this.f75416c;
            int i7 = ((((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            String str = this.f75417d;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            long j4 = this.f75418e;
            int i8 = (((i7 + i3) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            String str2 = this.f75419f;
            if (str2 != null) {
                i4 = str2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (((i8 + i4) * 31) + this.f75420g) * 31;
            String str3 = this.f75421h;
            if (str3 != null) {
                i5 = str3.hashCode();
            } else {
                i5 = 0;
            }
            int i10 = (i9 + i5) * 31;
            String str4 = this.f75422i;
            if (str4 != null) {
                i6 = str4.hashCode();
            }
            return i10 + i6;
        }

        public final void a(String str) {
            l.d(str, "");
            this.f75417d = str;
        }

        public final void b(String str) {
            l.d(str, "");
            this.f75419f = str;
        }

        private C1718b(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f75414a = null;
            this.f75415b = 0;
            this.f75416c = 0;
            this.f75417d = str;
            this.f75418e = 0;
            this.f75419f = str2;
            this.f75420g = 0;
            this.f75421h = null;
            this.f75422i = null;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public String f75435a;

        /* renamed from: b  reason: collision with root package name */
        public String f75436b;

        static {
            Covode.recordClassIndex(46549);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.a(this.f75435a, dVar.f75435a) && l.a(this.f75436b, dVar.f75436b);
        }

        public final int hashCode() {
            String str = this.f75435a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f75436b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "LogData(tag=" + this.f75435a + ", refer=" + this.f75436b + ")";
        }

        public /* synthetic */ d() {
            this("", "");
        }

        public final void a(String str) {
            l.d(str, "");
            this.f75435a = str;
        }

        private d(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f75435a = str;
            this.f75436b = str2;
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public String f75437a;

        /* renamed from: b  reason: collision with root package name */
        public Object f75438b;

        /* renamed from: c  reason: collision with root package name */
        public String f75439c;

        static {
            Covode.recordClassIndex(46550);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return l.a(this.f75437a, eVar.f75437a) && l.a(this.f75438b, eVar.f75438b) && l.a(this.f75439c, eVar.f75439c);
        }

        public final int hashCode() {
            String str = this.f75437a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.f75438b;
            int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
            String str2 = this.f75439c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "MiniAppData(url=" + this.f75437a + ", extraParams=" + this.f75438b + ", openFrom=" + this.f75439c + ")";
        }

        public /* synthetic */ e() {
            this("", "");
        }

        private e(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f75437a = str;
            this.f75438b = null;
            this.f75439c = str2;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public String f75440a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f75441b;

        /* renamed from: c  reason: collision with root package name */
        public String f75442c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f75443d;

        static {
            Covode.recordClassIndex(46551);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return l.a(this.f75440a, fVar.f75440a) && this.f75441b == fVar.f75441b && l.a(this.f75442c, fVar.f75442c) && this.f75443d == fVar.f75443d;
        }

        public final int hashCode() {
            String str = this.f75440a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f75441b;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (hashCode + i4) * 31;
            String str2 = this.f75442c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i8 = (i7 + i2) * 31;
            if (!this.f75443d) {
                i3 = 0;
            }
            return i8 + i3;
        }

        public final String toString() {
            return "OpenUrlData(openUrl=" + this.f75440a + ", forbiddenOpen3rdApp=" + this.f75441b + ", backUrlTag=" + this.f75442c + ", useAdxDeepLink=" + this.f75443d + ")";
        }

        public /* synthetic */ f() {
            this("", "");
        }

        public final void a(String str) {
            l.d(str, "");
            this.f75440a = str;
        }

        private f(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f75440a = str;
            this.f75441b = false;
            this.f75442c = str2;
            this.f75443d = false;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public b f75413a = new b();

        static {
            Covode.recordClassIndex(46546);
        }

        public final a a() {
            this.f75413a.f75408b.o = 1;
            return this;
        }

        public final a a(int i2) {
            this.f75413a.f75407a.f75420g = i2;
            return this;
        }

        public final a b(long j2) {
            this.f75413a.f75407a.f75418e = j2;
            return this;
        }

        public final a c(int i2) {
            this.f75413a.f75408b.f75453j = i2;
            return this;
        }

        public final a d(int i2) {
            this.f75413a.f75408b.f75456m = i2;
            return this;
        }

        public final a e(int i2) {
            this.f75413a.f75408b.n = i2;
            return this;
        }

        public final a f(int i2) {
            this.f75413a.f75408b.s = i2;
            return this;
        }

        public final a g(int i2) {
            this.f75413a.f75408b.u = i2;
            return this;
        }

        public final a h(int i2) {
            this.f75413a.f75408b.C = i2;
            return this;
        }

        public final a i(int i2) {
            this.f75413a.f75412f.f75429g = i2;
            return this;
        }

        public final a j(int i2) {
            this.f75413a.f75412f.f75430h = i2;
            return this;
        }

        public final a b(int i2) {
            this.f75413a.f75408b.f75450g = Integer.valueOf(i2);
            return this;
        }

        public final a c(long j2) {
            this.f75413a.f75408b.p = j2;
            return this;
        }

        public final a d(String str) {
            C1718b bVar = this.f75413a.f75407a;
            if (str == null) {
                str = "";
            }
            bVar.a(str);
            return this;
        }

        public final a e(String str) {
            C1718b bVar = this.f75413a.f75407a;
            if (str == null) {
                str = "";
            }
            bVar.b(str);
            return this;
        }

        public final a f(String str) {
            f fVar = this.f75413a.f75409c;
            if (str == null) {
                str = "";
            }
            fVar.a(str);
            return this;
        }

        public final a g(String str) {
            g gVar = this.f75413a.f75408b;
            if (str == null) {
                str = "";
            }
            gVar.a(str);
            return this;
        }

        public final a h(String str) {
            g gVar = this.f75413a.f75408b;
            if (str == null) {
                str = "";
            }
            gVar.b(str);
            return this;
        }

        public final a i(String str) {
            l.d(str, "");
            this.f75413a.f75408b.c(str);
            return this;
        }

        public final a j(String str) {
            this.f75413a.f75408b.r = str;
            return this;
        }

        public final a k(String str) {
            l.d(str, "");
            this.f75413a.f75408b.d(str);
            return this;
        }

        public final a l(String str) {
            l.d(str, "");
            this.f75413a.f75408b.e(str);
            return this;
        }

        public final a m(String str) {
            l.d(str, "");
            this.f75413a.f75408b.f(str);
            return this;
        }

        public final a n(String str) {
            l.d(str, "");
            this.f75413a.f75408b.g(str);
            return this;
        }

        public final a o(String str) {
            l.d(str, "");
            this.f75413a.f75408b.h(str);
            return this;
        }

        public final a p(String str) {
            l.d(str, "");
            this.f75413a.f75408b.i(str);
            return this;
        }

        public final a q(String str) {
            l.d(str, "");
            this.f75413a.f75408b.j(str);
            return this;
        }

        public final a r(String str) {
            this.f75413a.f75411e.a(str);
            return this;
        }

        public final a s(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.a(str);
            return this;
        }

        public final a t(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.b(str);
            return this;
        }

        public final a u(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.c(str);
            return this;
        }

        public final a v(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.d(str);
            return this;
        }

        public final a w(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.e(str);
            return this;
        }

        public final a x(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.f(str);
            return this;
        }

        public final a y(String str) {
            c cVar = this.f75413a.f75412f;
            if (str == null) {
                str = "";
            }
            cVar.g(str);
            return this;
        }

        public final a a(long j2) {
            this.f75413a.f75407a.f75416c = j2;
            return this;
        }

        public final a b(String str) {
            this.f75413a.f75407a.f75422i = str;
            return this;
        }

        public final a c(String str) {
            if (str != null) {
                try {
                    this.f75413a.f75407a.f75416c = Long.parseLong(str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return this;
        }

        public final a d(boolean z) {
            this.f75413a.f75412f.f75426d = z;
            return this;
        }

        public final a e(boolean z) {
            this.f75413a.f75412f.f75431i = z;
            return this;
        }

        public final a a(AwemeRawAd awemeRawAd) {
            this.f75413a.f75407a.f75414a = awemeRawAd;
            return this;
        }

        public final a b(boolean z) {
            this.f75413a.f75408b.f75449f = z;
            return this;
        }

        public final a c(boolean z) {
            this.f75413a.f75408b.q = z;
            return this;
        }

        public final a a(String str) {
            this.f75413a.f75407a.f75421h = str;
            return this;
        }

        public final a a(List<String> list) {
            l.d(list, "");
            this.f75413a.f75408b.a(list);
            return this;
        }

        public final a a(boolean z) {
            this.f75413a.f75408b.f75448e = z;
            return this;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public String f75423a;

        /* renamed from: b  reason: collision with root package name */
        public String f75424b;

        /* renamed from: c  reason: collision with root package name */
        public String f75425c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f75426d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f75427e;

        /* renamed from: f  reason: collision with root package name */
        public String f75428f;

        /* renamed from: g  reason: collision with root package name */
        public int f75429g;

        /* renamed from: h  reason: collision with root package name */
        public int f75430h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f75431i;

        /* renamed from: j  reason: collision with root package name */
        public String f75432j;

        /* renamed from: k  reason: collision with root package name */
        public String f75433k;

        /* renamed from: l  reason: collision with root package name */
        public String f75434l;

        static {
            Covode.recordClassIndex(46548);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f75423a, cVar.f75423a) && l.a(this.f75424b, cVar.f75424b) && l.a(this.f75425c, cVar.f75425c) && this.f75426d == cVar.f75426d && this.f75427e == cVar.f75427e && l.a(this.f75428f, cVar.f75428f) && this.f75429g == cVar.f75429g && this.f75430h == cVar.f75430h && this.f75431i == cVar.f75431i && l.a(this.f75432j, cVar.f75432j) && l.a(this.f75433k, cVar.f75433k) && l.a(this.f75434l, cVar.f75434l);
        }

        public final int hashCode() {
            String str = this.f75423a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f75424b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f75425c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.f75426d;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (hashCode3 + i4) * 31;
            boolean z2 = this.f75427e;
            if (z2) {
                z2 = true;
            }
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = (i7 + i8) * 31;
            String str4 = this.f75428f;
            int hashCode4 = (((((i11 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f75429g) * 31) + this.f75430h) * 31;
            if (!this.f75431i) {
                i3 = 0;
            }
            int i12 = (hashCode4 + i3) * 31;
            String str5 = this.f75432j;
            int hashCode5 = (i12 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f75433k;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.f75434l;
            if (str7 != null) {
                i2 = str7.hashCode();
            }
            return hashCode6 + i2;
        }

        public final String toString() {
            return "DownloadData(downloadUrl=" + this.f75423a + ", packageName=" + this.f75424b + ", quickAppUrl=" + this.f75425c + ", disableDownloadingDialog=" + this.f75426d + ", isFromAppAd=" + this.f75427e + ", appName=" + this.f75428f + ", downloadMode=" + this.f75429g + ", linkMode=" + this.f75430h + ", isSupportMultiple=" + this.f75431i + ", webUrl=" + this.f75432j + ", webTitle=" + this.f75433k + ", openUrl=" + this.f75434l + ")";
        }

        public /* synthetic */ c() {
            this("", "", "", "", "", "", "");
        }

        public final void a(String str) {
            l.d(str, "");
            this.f75423a = str;
        }

        public final void b(String str) {
            l.d(str, "");
            this.f75424b = str;
        }

        public final void c(String str) {
            l.d(str, "");
            this.f75425c = str;
        }

        public final void d(String str) {
            l.d(str, "");
            this.f75428f = str;
        }

        public final void e(String str) {
            l.d(str, "");
            this.f75432j = str;
        }

        public final void f(String str) {
            l.d(str, "");
            this.f75433k = str;
        }

        public final void g(String str) {
            l.d(str, "");
            this.f75434l = str;
        }

        private c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            l.d(str7, "");
            this.f75423a = str;
            this.f75424b = str2;
            this.f75425c = str3;
            this.f75426d = false;
            this.f75427e = false;
            this.f75428f = str4;
            this.f75429g = 0;
            this.f75430h = 0;
            this.f75431i = false;
            this.f75432j = str5;
            this.f75433k = str6;
            this.f75434l = str7;
        }
    }

    public static final class g {
        public String A;
        public List<String> B;
        public int C;

        /* renamed from: a  reason: collision with root package name */
        public String f75444a;

        /* renamed from: b  reason: collision with root package name */
        public String f75445b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f75446c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String> f75447d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f75448e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f75449f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f75450g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f75451h;

        /* renamed from: i  reason: collision with root package name */
        public com.ss.android.ugc.aweme.commercialize.feed.c.a f75452i;

        /* renamed from: j  reason: collision with root package name */
        public int f75453j;

        /* renamed from: k  reason: collision with root package name */
        public int f75454k;

        /* renamed from: l  reason: collision with root package name */
        public String f75455l;

        /* renamed from: m  reason: collision with root package name */
        public int f75456m;
        public int n;
        public int o;
        public long p;
        public boolean q;
        public String r;
        public int s;
        public String t;
        public int u;
        public String v;
        public String w;
        public String x;
        public String y;
        public String z;

        static {
            Covode.recordClassIndex(46552);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return l.a(this.f75444a, gVar.f75444a) && l.a(this.f75445b, gVar.f75445b) && this.f75446c == gVar.f75446c && l.a(this.f75447d, gVar.f75447d) && this.f75448e == gVar.f75448e && this.f75449f == gVar.f75449f && l.a(this.f75450g, gVar.f75450g) && this.f75451h == gVar.f75451h && l.a(this.f75452i, gVar.f75452i) && this.f75453j == gVar.f75453j && this.f75454k == gVar.f75454k && l.a(this.f75455l, gVar.f75455l) && this.f75456m == gVar.f75456m && this.n == gVar.n && this.o == gVar.o && this.p == gVar.p && this.q == gVar.q && l.a(this.r, gVar.r) && this.s == gVar.s && l.a(this.t, gVar.t) && this.u == gVar.u && l.a(this.v, gVar.v) && l.a(this.w, gVar.w) && l.a(this.x, gVar.x) && l.a(this.y, gVar.y) && l.a(this.z, gVar.z) && l.a(this.A, gVar.A) && l.a(this.B, gVar.B) && this.C == gVar.C;
        }

        public final String toString() {
            return "WebUrlData(webUrl=" + this.f75444a + ", webTitle=" + this.f75445b + ", hideNavBar=" + this.f75446c + ", queryParams=" + this.f75447d + ", useOrdinaryWeb=" + this.f75448e + ", showReport=" + this.f75449f + ", backgroundColor=" + this.f75450g + ", forbiddenJump=" + this.f75451h + ", preloadData=" + this.f75452i + ", preloadWeb=" + this.f75453j + ", preloadWebNew=" + this.f75454k + ", webChannelName=" + this.f75455l + ", useWebUrl=" + this.f75456m + ", webType=" + this.n + ", appAdFrom=" + this.o + ", userClickTime=" + this.p + ", isFromLynxLandPage=" + this.q + ", secondPagePreloadChannelName=" + this.r + ", landingStyle=" + this.s + ", landingPageInfo=" + this.t + ", landingAccessStyle=" + this.u + ", renderType=" + this.v + ", fullScreenBgImageUrl=" + this.w + ", lynxChannelName=" + this.x + ", nativeSiteCustomData=" + this.y + ", nativeSiteAdInfo=" + this.z + ", nativeSiteAppData=" + this.A + ", secondPageGeckoChannels=" + this.B + ", lynxLandPageStyle=" + this.C + ")";
        }

        public /* synthetic */ g() {
            this("", "", ag.a(), "", "", "", "", "", "", "", "", z.INSTANCE);
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            String str = this.f75444a;
            int i16 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i17 = i2 * 31;
            String str2 = this.f75445b;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i18 = (i17 + i3) * 31;
            boolean z2 = this.f75446c;
            int i19 = 1;
            if (z2) {
                z2 = true;
            }
            int i20 = z2 ? 1 : 0;
            int i21 = z2 ? 1 : 0;
            int i22 = z2 ? 1 : 0;
            int i23 = (i18 + i20) * 31;
            Map<String, String> map = this.f75447d;
            if (map != null) {
                i4 = map.hashCode();
            } else {
                i4 = 0;
            }
            int i24 = (i23 + i4) * 31;
            boolean z3 = this.f75448e;
            if (z3) {
                z3 = true;
            }
            int i25 = z3 ? 1 : 0;
            int i26 = z3 ? 1 : 0;
            int i27 = z3 ? 1 : 0;
            int i28 = (i24 + i25) * 31;
            boolean z4 = this.f75449f;
            if (z4) {
                z4 = true;
            }
            int i29 = z4 ? 1 : 0;
            int i30 = z4 ? 1 : 0;
            int i31 = z4 ? 1 : 0;
            int i32 = (i28 + i29) * 31;
            Integer num = this.f75450g;
            if (num != null) {
                i5 = num.hashCode();
            } else {
                i5 = 0;
            }
            int i33 = (i32 + i5) * 31;
            boolean z5 = this.f75451h;
            if (z5) {
                z5 = true;
            }
            int i34 = z5 ? 1 : 0;
            int i35 = z5 ? 1 : 0;
            int i36 = z5 ? 1 : 0;
            int i37 = (i33 + i34) * 31;
            com.ss.android.ugc.aweme.commercialize.feed.c.a aVar = this.f75452i;
            if (aVar != null) {
                i6 = aVar.hashCode();
            } else {
                i6 = 0;
            }
            int i38 = (((((i37 + i6) * 31) + this.f75453j) * 31) + this.f75454k) * 31;
            String str3 = this.f75455l;
            if (str3 != null) {
                i7 = str3.hashCode();
            } else {
                i7 = 0;
            }
            long j2 = this.p;
            int i39 = (((((((((i38 + i7) * 31) + this.f75456m) * 31) + this.n) * 31) + this.o) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            if (!this.q) {
                i19 = 0;
            }
            int i40 = (i39 + i19) * 31;
            String str4 = this.r;
            if (str4 != null) {
                i8 = str4.hashCode();
            } else {
                i8 = 0;
            }
            int i41 = (((i40 + i8) * 31) + this.s) * 31;
            String str5 = this.t;
            if (str5 != null) {
                i9 = str5.hashCode();
            } else {
                i9 = 0;
            }
            int i42 = (((i41 + i9) * 31) + this.u) * 31;
            String str6 = this.v;
            if (str6 != null) {
                i10 = str6.hashCode();
            } else {
                i10 = 0;
            }
            int i43 = (i42 + i10) * 31;
            String str7 = this.w;
            if (str7 != null) {
                i11 = str7.hashCode();
            } else {
                i11 = 0;
            }
            int i44 = (i43 + i11) * 31;
            String str8 = this.x;
            if (str8 != null) {
                i12 = str8.hashCode();
            } else {
                i12 = 0;
            }
            int i45 = (i44 + i12) * 31;
            String str9 = this.y;
            if (str9 != null) {
                i13 = str9.hashCode();
            } else {
                i13 = 0;
            }
            int i46 = (i45 + i13) * 31;
            String str10 = this.z;
            if (str10 != null) {
                i14 = str10.hashCode();
            } else {
                i14 = 0;
            }
            int i47 = (i46 + i14) * 31;
            String str11 = this.A;
            if (str11 != null) {
                i15 = str11.hashCode();
            } else {
                i15 = 0;
            }
            int i48 = (i47 + i15) * 31;
            List<String> list = this.B;
            if (list != null) {
                i16 = list.hashCode();
            }
            return ((i48 + i16) * 31) + this.C;
        }

        public final void a(String str) {
            l.d(str, "");
            this.f75444a = str;
        }

        public final void b(String str) {
            l.d(str, "");
            this.f75445b = str;
        }

        public final void c(String str) {
            l.d(str, "");
            this.f75455l = str;
        }

        public final void d(String str) {
            l.d(str, "");
            this.t = str;
        }

        public final void e(String str) {
            l.d(str, "");
            this.v = str;
        }

        public final void f(String str) {
            l.d(str, "");
            this.w = str;
        }

        public final void g(String str) {
            l.d(str, "");
            this.x = str;
        }

        public final void h(String str) {
            l.d(str, "");
            this.y = str;
        }

        public final void i(String str) {
            l.d(str, "");
            this.z = str;
        }

        public final void j(String str) {
            l.d(str, "");
            this.A = str;
        }

        public final void a(List<String> list) {
            l.d(list, "");
            this.B = list;
        }

        private g(String str, String str2, Map<String, String> map, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list) {
            l.d(str, "");
            l.d(str2, "");
            l.d(map, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            l.d(str7, "");
            l.d(str8, "");
            l.d(str9, "");
            l.d(str10, "");
            l.d(list, "");
            this.f75444a = str;
            this.f75445b = str2;
            this.f75446c = false;
            this.f75447d = map;
            this.f75448e = true;
            this.f75449f = false;
            this.f75450g = null;
            this.f75451h = true;
            this.f75452i = null;
            this.f75453j = 0;
            this.f75454k = 0;
            this.f75455l = str3;
            this.f75456m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = false;
            this.r = null;
            this.s = 0;
            this.t = str4;
            this.u = 0;
            this.v = str5;
            this.w = str6;
            this.x = str7;
            this.y = str8;
            this.z = str9;
            this.A = str10;
            this.B = list;
            this.C = 0;
        }
    }

    public /* synthetic */ b() {
        this(new C1718b(), new g(), new f(), new e(), new d(), new c());
    }

    private b(C1718b bVar, g gVar, f fVar, e eVar, d dVar, c cVar) {
        l.d(bVar, "");
        l.d(gVar, "");
        l.d(fVar, "");
        l.d(eVar, "");
        l.d(dVar, "");
        l.d(cVar, "");
        this.f75407a = bVar;
        this.f75408b = gVar;
        this.f75409c = fVar;
        this.f75410d = eVar;
        this.f75411e = dVar;
        this.f75412f = cVar;
    }
}
