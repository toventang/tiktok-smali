package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.j;
import com.squareup.a.i;
import com.squareup.a.p;
import com.squareup.a.r;
import com.squareup.a.t;
import com.squareup.a.v;
import com.squareup.a.x;
import com.squareup.a.y;
import java.net.CookieHandler;
import java.net.ProtocolException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.f;
import k.g;
import k.n;
import k.q;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final y f57670a = new y() {
        /* class com.squareup.a.a.b.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35948);
        }

        @Override // com.squareup.a.y
        public final long a() {
            return 0;
        }

        @Override // com.squareup.a.y
        public final k.h b() {
            return new f();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final t f57671b;

    /* renamed from: c  reason: collision with root package name */
    public final s f57672c;

    /* renamed from: d  reason: collision with root package name */
    public final x f57673d;

    /* renamed from: e  reason: collision with root package name */
    public j f57674e;

    /* renamed from: f  reason: collision with root package name */
    public long f57675f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f57676g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f57677h;

    /* renamed from: i  reason: collision with root package name */
    public final v f57678i;

    /* renamed from: j  reason: collision with root package name */
    public v f57679j;

    /* renamed from: k  reason: collision with root package name */
    public x f57680k;

    /* renamed from: l  reason: collision with root package name */
    public x f57681l;

    /* renamed from: m  reason: collision with root package name */
    public k.y f57682m;
    public g n;
    public final boolean o;
    public final boolean p;
    public b q;
    public c r;

    public class a implements r.a {

        /* renamed from: b  reason: collision with root package name */
        private final int f57689b;

        /* renamed from: c  reason: collision with root package name */
        private final v f57690c;

        /* renamed from: d  reason: collision with root package name */
        private int f57691d;

        static {
            Covode.recordClassIndex(35950);
        }

        private i a() {
            return h.this.f57672c.a();
        }

        @Override // com.squareup.a.r.a
        public final x a(v vVar) {
            this.f57691d++;
            if (this.f57689b > 0) {
                r rVar = h.this.f57671b.f57913i.get(this.f57689b - 1);
                com.squareup.a.a aVar = a().a().f57952a;
                if (!vVar.f57919a.f57882d.equals(aVar.f57411a.f57882d) || vVar.f57919a.f57883e != aVar.f57411a.f57883e) {
                    throw new IllegalStateException("network interceptor " + rVar + " must retain the same host and port");
                } else if (this.f57691d > 1) {
                    throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
                }
            }
            if (this.f57689b < h.this.f57671b.f57913i.size()) {
                a aVar2 = new a(this.f57689b + 1, vVar);
                r rVar2 = h.this.f57671b.f57913i.get(this.f57689b);
                x a2 = rVar2.a();
                if (aVar2.f57691d != 1) {
                    throw new IllegalStateException("network interceptor " + rVar2 + " must call proceed() exactly once");
                } else if (a2 != null) {
                    return a2;
                } else {
                    throw new NullPointerException("network interceptor " + rVar2 + " returned null");
                }
            } else {
                h.this.f57674e.a(vVar);
                h.this.f57679j = vVar;
                if (i.c(vVar.f57920b) && vVar.f57922d != null) {
                    q.a(h.this.f57674e.a(vVar, -1)).close();
                }
                x c2 = h.this.c();
                int i2 = c2.f57933c;
                if ((i2 != 204 && i2 != 205) || c2.f57937g.a() <= 0) {
                    return c2;
                }
                throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + c2.f57937g.a());
            }
        }

        public a(int i2, v vVar) {
            this.f57689b = i2;
            this.f57690c = vVar;
        }
    }

    static {
        Covode.recordClassIndex(35947);
    }

    public final void a() {
        if (this.f57675f == -1) {
            this.f57675f = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    public final s b() {
        g gVar = this.n;
        if (gVar != null) {
            j.a(gVar);
        } else {
            k.y yVar = this.f57682m;
            if (yVar != null) {
                j.a(yVar);
            }
        }
        x xVar = this.f57681l;
        if (xVar != null) {
            j.a(xVar.f57937g);
        } else {
            this.f57672c.a(true, false, true);
        }
        return this.f57672c;
    }

    public final x c() {
        this.f57674e.b();
        x.a a2 = this.f57674e.a();
        a2.f57942a = this.f57679j;
        a2.f57946e = this.f57672c.a().f57728c;
        x a3 = a2.a(k.f57693b, Long.toString(this.f57675f)).a(k.f57694c, Long.toString(System.currentTimeMillis())).a();
        if (!this.p) {
            x.a a4 = a3.a();
            a4.f57948g = this.f57674e.a(a3);
            a3 = a4.a();
        }
        if ("close".equalsIgnoreCase(a3.f57931a.a("Connection")) || "close".equalsIgnoreCase(a3.a("Connection"))) {
            this.f57672c.a(true, false, false);
        }
        return a3;
    }

    public static x a(x xVar) {
        if (xVar == null || xVar.f57937g == null) {
            return xVar;
        }
        x.a a2 = xVar.a();
        a2.f57948g = null;
        return a2.a();
    }

    public static boolean c(x xVar) {
        if (xVar.f57931a.f57920b.equals("HEAD")) {
            return false;
        }
        int i2 = xVar.f57933c;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && k.a(xVar.f57936f) == -1 && !"chunked".equalsIgnoreCase(xVar.a("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public final x b(x xVar) {
        if (!this.f57676g || !"gzip".equalsIgnoreCase(this.f57681l.a("Content-Encoding")) || xVar.f57937g == null) {
            return xVar;
        }
        n nVar = new n(xVar.f57937g.b());
        p a2 = xVar.f57936f.a().b("Content-Encoding").b("Content-Length").a();
        x.a a3 = xVar.a().a(a2);
        a3.f57948g = new l(a2, q.a(nVar));
        return a3.a();
    }

    public final void a(p pVar) {
        CookieHandler cookieHandler = this.f57671b.f57915k;
        if (cookieHandler != null) {
            cookieHandler.put(this.f57678i.a(), k.b(pVar));
        }
    }

    public final boolean a(com.squareup.a.q qVar) {
        com.squareup.a.q qVar2 = this.f57678i.f57919a;
        if (!qVar2.f57882d.equals(qVar.f57882d) || qVar2.f57883e != qVar.f57883e || !qVar2.f57879a.equals(qVar.f57879a)) {
            return false;
        }
        return true;
    }

    public static p a(p pVar, p pVar2) {
        p.a aVar = new p.a();
        int length = pVar.f57876a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String a2 = pVar.a(i2);
            String b2 = pVar.b(i2);
            if ((!"Warning".equalsIgnoreCase(a2) || !b2.startsWith("1")) && (!k.a(a2) || pVar2.a(a2) == null)) {
                aVar.a(a2, b2);
            }
        }
        int length2 = pVar2.f57876a.length / 2;
        for (int i3 = 0; i3 < length2; i3++) {
            String a3 = pVar2.a(i3);
            if (!"Content-Length".equalsIgnoreCase(a3) && k.a(a3)) {
                aVar.a(a3, pVar2.b(i3));
            }
        }
        return aVar.a();
    }

    public h(t tVar, v vVar, boolean z, boolean z2, boolean z3, s sVar, o oVar, x xVar) {
        HostnameVerifier hostnameVerifier;
        com.squareup.a.f fVar;
        s sVar2 = sVar;
        this.f57671b = tVar;
        this.f57678i = vVar;
        this.f57677h = z;
        this.o = z2;
        this.p = z3;
        if (sVar2 == null) {
            com.squareup.a.j jVar = tVar.s;
            SSLSocketFactory sSLSocketFactory = null;
            if (vVar.f57919a.c()) {
                sSLSocketFactory = tVar.o;
                hostnameVerifier = tVar.p;
                fVar = tVar.q;
            } else {
                hostnameVerifier = null;
                fVar = null;
            }
            sVar2 = new s(jVar, new com.squareup.a.a(vVar.f57919a.f57882d, vVar.f57919a.f57883e, tVar.t, tVar.n, sSLSocketFactory, hostnameVerifier, fVar, tVar.r, tVar.f57909e, tVar.f57910f, tVar.f57911g, tVar.f57914j));
        }
        this.f57672c = sVar2;
        this.f57682m = oVar;
        this.f57673d = xVar;
    }
}
