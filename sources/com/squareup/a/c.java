package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a.b;
import com.squareup.a.a.b.r;
import com.squareup.a.a.e;
import com.squareup.a.a.j;
import com.squareup.a.p;
import com.squareup.a.v;
import com.squareup.a.x;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.aa;
import k.f;
import k.g;
import k.h;
import k.i;
import k.k;
import k.l;
import k.q;
import k.y;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final e f57781a;

    /* renamed from: b  reason: collision with root package name */
    public final com.squareup.a.a.b f57782b;

    /* renamed from: c  reason: collision with root package name */
    public int f57783c;

    /* renamed from: d  reason: collision with root package name */
    public int f57784d;

    /* renamed from: e  reason: collision with root package name */
    private int f57785e;

    /* renamed from: f  reason: collision with root package name */
    private int f57786f;

    /* renamed from: g  reason: collision with root package name */
    private int f57787g;

    static {
        Covode.recordClassIndex(35987);
    }

    /* access modifiers changed from: package-private */
    public final class a implements com.squareup.a.a.b.b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f57789a;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f57791c;

        /* renamed from: d  reason: collision with root package name */
        private y f57792d;

        /* renamed from: e  reason: collision with root package name */
        private y f57793e;

        static {
            Covode.recordClassIndex(35989);
        }

        @Override // com.squareup.a.a.b.b
        public final y b() {
            return this.f57793e;
        }

        @Override // com.squareup.a.a.b.b
        public final void a() {
            MethodCollector.i(12731);
            synchronized (c.this) {
                try {
                    if (!this.f57789a) {
                        this.f57789a = true;
                        c.this.f57784d++;
                        j.a(this.f57792d);
                        try {
                            this.f57791c.b();
                            MethodCollector.o(12731);
                        } catch (IOException unused) {
                            MethodCollector.o(12731);
                        }
                    }
                } finally {
                    MethodCollector.o(12731);
                }
            }
        }

        public a(final b.a aVar) {
            this.f57791c = aVar;
            this.f57792d = aVar.a(1);
            this.f57793e = new k(this.f57792d, c.this) {
                /* class com.squareup.a.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35990);
                }

                @Override // k.y, java.io.Closeable, k.k, java.lang.AutoCloseable
                public final void close() {
                    MethodCollector.i(12640);
                    synchronized (c.this) {
                        try {
                            if (!a.this.f57789a) {
                                a.this.f57789a = true;
                                c.this.f57783c++;
                                super.close();
                                aVar.a();
                                MethodCollector.o(12640);
                            }
                        } finally {
                            MethodCollector.o(12640);
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends y {

        /* renamed from: a  reason: collision with root package name */
        public final b.c f57797a;

        /* renamed from: b  reason: collision with root package name */
        private final h f57798b;

        /* renamed from: c  reason: collision with root package name */
        private final String f57799c;

        /* renamed from: d  reason: collision with root package name */
        private final String f57800d;

        static {
            Covode.recordClassIndex(35991);
        }

        @Override // com.squareup.a.y
        public final h b() {
            return this.f57798b;
        }

        @Override // com.squareup.a.y
        public final long a() {
            try {
                String str = this.f57800d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public b(final b.c cVar, String str, String str2) {
            this.f57797a = cVar;
            this.f57799c = str;
            this.f57800d = str2;
            this.f57798b = q.a(new l(cVar.f57612c[1]) {
                /* class com.squareup.a.c.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35992);
                }

                @Override // k.aa, java.io.Closeable, k.l, java.lang.AutoCloseable
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.c$c  reason: collision with other inner class name */
    public static final class C1277c {

        /* renamed from: a  reason: collision with root package name */
        final String f57803a;

        /* renamed from: b  reason: collision with root package name */
        final p f57804b;

        /* renamed from: c  reason: collision with root package name */
        final String f57805c;

        /* renamed from: d  reason: collision with root package name */
        final u f57806d;

        /* renamed from: e  reason: collision with root package name */
        final int f57807e;

        /* renamed from: f  reason: collision with root package name */
        final String f57808f;

        /* renamed from: g  reason: collision with root package name */
        final p f57809g;

        /* renamed from: h  reason: collision with root package name */
        final o f57810h;

        static {
            Covode.recordClassIndex(35993);
        }

        private boolean a() {
            return this.f57803a.startsWith("https://");
        }

        public C1277c(x xVar) {
            this.f57803a = xVar.f57931a.f57919a.toString();
            this.f57804b = com.squareup.a.a.b.k.a(xVar.f57938h.f57931a.f57921c, xVar.f57936f);
            this.f57805c = xVar.f57931a.f57920b;
            this.f57806d = xVar.f57932b;
            this.f57807e = xVar.f57933c;
            this.f57808f = xVar.f57934d;
            this.f57809g = xVar.f57936f;
            this.f57810h = xVar.f57935e;
        }

        private static List<Certificate> a(h hVar) {
            int a2 = c.a(hVar);
            if (a2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a2);
                for (int i2 = 0; i2 < a2; i2++) {
                    String s = hVar.s();
                    f fVar = new f();
                    fVar.a(i.decodeBase64(s));
                    arrayList.add(instance.generateCertificate(fVar.f()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public C1277c(aa aaVar) {
            try {
                h a2 = q.a(aaVar);
                this.f57803a = a2.s();
                this.f57805c = a2.s();
                p.a aVar = new p.a();
                int a3 = c.a(a2);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar.a(a2.s());
                }
                this.f57804b = aVar.a();
                r a4 = r.a(a2.s());
                this.f57806d = a4.f57713a;
                this.f57807e = a4.f57714b;
                this.f57808f = a4.f57715c;
                p.a aVar2 = new p.a();
                int a5 = c.a(a2);
                for (int i3 = 0; i3 < a5; i3++) {
                    aVar2.a(a2.s());
                }
                this.f57809g = aVar2.a();
                if (a()) {
                    String s = a2.s();
                    if (s.length() <= 0) {
                        String s2 = a2.s();
                        List<Certificate> a6 = a(a2);
                        List<Certificate> a7 = a(a2);
                        if (s2 != null) {
                            this.f57810h = new o(s2, j.a(a6), j.a(a7));
                        } else {
                            throw new IllegalArgumentException("cipherSuite == null");
                        }
                    } else {
                        throw new IOException("expected \"\" but was \"" + s + "\"");
                    }
                } else {
                    this.f57810h = null;
                }
            } finally {
                aaVar.close();
            }
        }

        public final void a(b.a aVar) {
            g a2 = q.a(aVar.a(0));
            a2.a(this.f57803a);
            a2.a(10);
            a2.a(this.f57805c);
            a2.a(10);
            a2.b((long) (this.f57804b.f57876a.length / 2));
            a2.a(10);
            int length = this.f57804b.f57876a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                a2.a(this.f57804b.a(i2));
                a2.a(": ");
                a2.a(this.f57804b.b(i2));
                a2.a(10);
            }
            a2.a(new r(this.f57806d, this.f57807e, this.f57808f).toString());
            a2.a(10);
            a2.b((long) (this.f57809g.f57876a.length / 2));
            a2.a(10);
            int length2 = this.f57809g.f57876a.length / 2;
            for (int i3 = 0; i3 < length2; i3++) {
                a2.a(this.f57809g.a(i3));
                a2.a(": ");
                a2.a(this.f57809g.b(i3));
                a2.a(10);
            }
            if (a()) {
                a2.a(10);
                a2.a(this.f57810h.f57873a);
                a2.a(10);
                a(a2, this.f57810h.f57874b);
                a(a2, this.f57810h.f57875c);
            }
            a2.close();
        }

        private static void a(g gVar, List<Certificate> list) {
            try {
                gVar.b((long) list.size());
                gVar.a(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    gVar.a(i.of(list.get(i2).getEncoded()).base64());
                    gVar.a(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }
    }

    public final synchronized void a() {
        MethodCollector.i(13815);
        this.f57786f++;
        MethodCollector.o(13815);
    }

    static void a(b.a aVar) {
        if (aVar != null) {
            try {
                aVar.b();
            } catch (IOException unused) {
            }
        }
    }

    private static String c(v vVar) {
        return j.a(vVar.f57919a.toString());
    }

    public final void b(v vVar) {
        this.f57782b.b(c(vVar));
    }

    public final synchronized void a(com.squareup.a.a.b.c cVar) {
        MethodCollector.i(13814);
        this.f57787g++;
        if (cVar.f57615a != null) {
            this.f57785e++;
            MethodCollector.o(13814);
            return;
        }
        if (cVar.f57616b != null) {
            this.f57786f++;
        }
        MethodCollector.o(13814);
    }

    public static int a(h hVar) {
        try {
            long o = hVar.o();
            String s = hVar.s();
            if (o >= 0 && o <= 2147483647L && s.isEmpty()) {
                return (int) o;
            }
            throw new IOException("expected an int but was \"" + o + s + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final com.squareup.a.a.b.b a(x xVar) {
        b.a aVar;
        String str = xVar.f57931a.f57920b;
        if (com.squareup.a.a.b.i.a(xVar.f57931a.f57920b)) {
            try {
                b(xVar.f57931a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals("GET") || com.squareup.a.a.b.k.c(xVar.f57936f).contains("*")) {
            return null;
        } else {
            C1277c cVar = new C1277c(xVar);
            try {
                aVar = this.f57782b.a(c(xVar.f57931a), -1);
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.a(aVar);
                    return new a(aVar);
                } catch (IOException unused2) {
                    a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                a(aVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final x a(v vVar) {
        try {
            b.c a2 = this.f57782b.a(c(vVar));
            if (a2 == null) {
                return null;
            }
            try {
                C1277c cVar = new C1277c(a2.f57612c[0]);
                String a3 = cVar.f57809g.a("Content-Type");
                String a4 = cVar.f57809g.a("Content-Length");
                v.a c2 = new v.a().a(cVar.f57803a).c(cVar.f57805c);
                c2.f57928c = cVar.f57804b.a();
                v a5 = c2.a();
                x.a aVar = new x.a();
                aVar.f57942a = a5;
                aVar.f57943b = cVar.f57806d;
                aVar.f57944c = cVar.f57807e;
                aVar.f57945d = cVar.f57808f;
                x.a a6 = aVar.a(cVar.f57809g);
                a6.f57948g = new b(a2, a3, a4);
                a6.f57946e = cVar.f57810h;
                x a7 = a6.a();
                if (!cVar.f57803a.equals(vVar.f57919a.toString()) || !cVar.f57805c.equals(vVar.f57920b)) {
                    j.a(a7.f57937g);
                    return null;
                }
                p pVar = cVar.f57804b;
                for (String str : com.squareup.a.a.b.k.c(a7.f57936f)) {
                    if (!j.a(pVar.c(str), vVar.f57921c.c(str))) {
                        j.a(a7.f57937g);
                        return null;
                    }
                }
                return a7;
            } catch (IOException unused) {
                j.a(a2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public c(File file, long j2) {
        this(file, j2, com.squareup.a.a.c.a.f57724a);
    }

    private c(File file, long j2, com.squareup.a.a.c.a aVar) {
        this.f57781a = new e() {
            /* class com.squareup.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35988);
            }

            @Override // com.squareup.a.a.e
            public final void a() {
                c.this.a();
            }

            @Override // com.squareup.a.a.e
            public final com.squareup.a.a.b.b a(x xVar) {
                return c.this.a(xVar);
            }

            @Override // com.squareup.a.a.e
            public final void b(v vVar) {
                c.this.b(vVar);
            }

            @Override // com.squareup.a.a.e
            public final x a(v vVar) {
                return c.this.a(vVar);
            }

            @Override // com.squareup.a.a.e
            public final void a(com.squareup.a.a.b.c cVar) {
                c.this.a(cVar);
            }

            @Override // com.squareup.a.a.e
            public final void a(x xVar, x xVar2) {
                b.a aVar;
                C1277c cVar = new C1277c(xVar2);
                b.c cVar2 = ((b) xVar.f57937g).f57797a;
                try {
                    aVar = com.squareup.a.a.b.this.a(cVar2.f57610a, cVar2.f57611b);
                    if (aVar != null) {
                        try {
                            cVar.a(aVar);
                            aVar.a();
                        } catch (IOException unused) {
                            c.a(aVar);
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                    c.a(aVar);
                }
            }
        };
        if (j2 > 0) {
            this.f57782b = new com.squareup.a.a.b(aVar, file, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), j.b("OkHttp DiskLruCache")));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
