package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.b.d;
import com.squareup.a.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final v f57931a;

    /* renamed from: b  reason: collision with root package name */
    public final u f57932b;

    /* renamed from: c  reason: collision with root package name */
    public final int f57933c;

    /* renamed from: d  reason: collision with root package name */
    public final String f57934d;

    /* renamed from: e  reason: collision with root package name */
    public final o f57935e;

    /* renamed from: f  reason: collision with root package name */
    public final p f57936f;

    /* renamed from: g  reason: collision with root package name */
    public final y f57937g;

    /* renamed from: h  reason: collision with root package name */
    public x f57938h;

    /* renamed from: i  reason: collision with root package name */
    public x f57939i;

    /* renamed from: j  reason: collision with root package name */
    public final x f57940j;

    /* renamed from: k  reason: collision with root package name */
    private volatile d f57941k;

    static {
        Covode.recordClassIndex(36026);
    }

    public final a a() {
        return new a(this, (byte) 0);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public v f57942a;

        /* renamed from: b  reason: collision with root package name */
        public u f57943b;

        /* renamed from: c  reason: collision with root package name */
        public int f57944c;

        /* renamed from: d  reason: collision with root package name */
        public String f57945d;

        /* renamed from: e  reason: collision with root package name */
        public o f57946e;

        /* renamed from: f  reason: collision with root package name */
        public p.a f57947f;

        /* renamed from: g  reason: collision with root package name */
        public y f57948g;

        /* renamed from: h  reason: collision with root package name */
        public x f57949h;

        /* renamed from: i  reason: collision with root package name */
        public x f57950i;

        /* renamed from: j  reason: collision with root package name */
        public x f57951j;

        static {
            Covode.recordClassIndex(36027);
        }

        public a() {
            this.f57944c = -1;
            this.f57947f = new p.a();
        }

        public final x a() {
            if (this.f57942a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f57943b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f57944c >= 0) {
                return new x(this, (byte) 0);
            } else {
                throw new IllegalStateException("code < 0: " + this.f57944c);
            }
        }

        public final a a(p pVar) {
            this.f57947f = pVar.a();
            return this;
        }

        public final a c(x xVar) {
            if (xVar != null) {
                d(xVar);
            }
            this.f57951j = xVar;
            return this;
        }

        private static void d(x xVar) {
            if (xVar.f57937g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final a a(x xVar) {
            if (xVar != null) {
                a("networkResponse", xVar);
            }
            this.f57949h = xVar;
            return this;
        }

        public final a b(x xVar) {
            if (xVar != null) {
                a("cacheResponse", xVar);
            }
            this.f57950i = xVar;
            return this;
        }

        private a(x xVar) {
            this.f57944c = -1;
            this.f57942a = xVar.f57931a;
            this.f57943b = xVar.f57932b;
            this.f57944c = xVar.f57933c;
            this.f57945d = xVar.f57934d;
            this.f57946e = xVar.f57935e;
            this.f57947f = xVar.f57936f.a();
            this.f57948g = xVar.f57937g;
            this.f57949h = xVar.f57938h;
            this.f57950i = xVar.f57939i;
            this.f57951j = xVar.f57940j;
        }

        /* synthetic */ a(x xVar, byte b2) {
            this(xVar);
        }

        public final a b(String str, String str2) {
            this.f57947f.a(str, str2);
            return this;
        }

        public final a a(String str, String str2) {
            this.f57947f.b(str, str2);
            return this;
        }

        private static void a(String str, x xVar) {
            if (xVar.f57937g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (xVar.f57938h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (xVar.f57939i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (xVar.f57940j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }
    }

    public final d c() {
        d dVar = this.f57941k;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f57936f);
        this.f57941k = a2;
        return a2;
    }

    public final List<g> b() {
        String str;
        int i2 = this.f57933c;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        p pVar = this.f57936f;
        ArrayList arrayList = new ArrayList();
        int length = pVar.f57876a.length / 2;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equalsIgnoreCase(pVar.a(i3))) {
                String b2 = pVar.b(i3);
                int i4 = 0;
                while (i4 < b2.length()) {
                    int a2 = d.a(b2, i4, " ");
                    String trim = b2.substring(i4, a2).trim();
                    int a3 = d.a(b2, a2);
                    if (!b2.regionMatches(true, a3, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i5 = a3 + 7;
                    int a4 = d.a(b2, i5, "\"");
                    String substring = b2.substring(i5, a4);
                    i4 = d.a(b2, d.a(b2, a4 + 1, ",") + 1);
                    arrayList.add(new g(trim, substring));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "Response{protocol=" + this.f57932b + ", code=" + this.f57933c + ", message=" + this.f57934d + ", url=" + this.f57931a.f57919a.toString() + '}';
    }

    public final String a(String str) {
        String a2 = this.f57936f.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    private x(a aVar) {
        this.f57931a = aVar.f57942a;
        this.f57932b = aVar.f57943b;
        this.f57933c = aVar.f57944c;
        this.f57934d = aVar.f57945d;
        this.f57935e = aVar.f57946e;
        this.f57936f = aVar.f57947f.a();
        this.f57937g = aVar.f57948g;
        this.f57938h = aVar.f57949h;
        this.f57939i = aVar.f57950i;
        this.f57940j = aVar.f57951j;
    }

    /* synthetic */ x(a aVar, byte b2) {
        this(aVar);
    }
}
