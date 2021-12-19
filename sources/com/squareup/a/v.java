package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.b.i;
import com.squareup.a.p;
import java.io.IOException;
import java.net.URI;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final q f57919a;

    /* renamed from: b  reason: collision with root package name */
    public final String f57920b;

    /* renamed from: c  reason: collision with root package name */
    public final p f57921c;

    /* renamed from: d  reason: collision with root package name */
    public final w f57922d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f57923e;

    /* renamed from: f  reason: collision with root package name */
    private volatile URI f57924f;

    /* renamed from: g  reason: collision with root package name */
    private volatile d f57925g;

    static {
        Covode.recordClassIndex(36023);
    }

    public final a b() {
        return new a(this, (byte) 0);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public q f57926a;

        /* renamed from: b  reason: collision with root package name */
        public String f57927b;

        /* renamed from: c  reason: collision with root package name */
        public p.a f57928c;

        /* renamed from: d  reason: collision with root package name */
        public w f57929d;

        /* renamed from: e  reason: collision with root package name */
        public Object f57930e;

        static {
            Covode.recordClassIndex(36024);
        }

        public a() {
            this.f57927b = "GET";
            this.f57928c = new p.a();
        }

        public final v a() {
            if (this.f57926a != null) {
                return new v(this, (byte) 0);
            }
            throw new IllegalStateException("url == null");
        }

        public final a b(String str) {
            this.f57928c.b(str);
            return this;
        }

        public final a a(q qVar) {
            if (qVar != null) {
                this.f57926a = qVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        private a(v vVar) {
            this.f57926a = vVar.f57919a;
            this.f57927b = vVar.f57920b;
            this.f57929d = vVar.f57922d;
            this.f57930e = vVar.f57923e;
            this.f57928c = vVar.f57921c.a();
        }

        public final a a(d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return b("Cache-Control");
            }
            return a("Cache-Control", dVar2);
        }

        public final a c(String str) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (!i.b(str)) {
                this.f57927b = str;
                this.f57929d = null;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public final a a(String str) {
            String str2 = str;
            if (str2 != null) {
                if (str2.regionMatches(true, 0, "ws:", 0, 3)) {
                    str2 = "http:" + str2.substring(3);
                } else if (str2.regionMatches(true, 0, "wss:", 0, 4)) {
                    str2 = "https:" + str2.substring(4);
                }
                q c2 = q.c(str2);
                if (c2 != null) {
                    return a(c2);
                }
                throw new IllegalArgumentException("unexpected url: ".concat(String.valueOf(str2)));
            }
            throw new IllegalArgumentException("url == null");
        }

        /* synthetic */ a(v vVar, byte b2) {
            this(vVar);
        }

        public final a a(String str, String str2) {
            this.f57928c.b(str, str2);
            return this;
        }

        public final a b(String str, String str2) {
            this.f57928c.a(str, str2);
            return this;
        }
    }

    public final d c() {
        d dVar = this.f57925g;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f57921c);
        this.f57925g = a2;
        return a2;
    }

    public final URI a() {
        try {
            URI uri = this.f57924f;
            if (uri != null) {
                return uri;
            }
            URI b2 = this.f57919a.b();
            this.f57924f = b2;
            return b2;
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("Request{method=").append(this.f57920b).append(", url=").append(this.f57919a).append(", tag=");
        Object obj = this.f57923e;
        if (obj == this) {
            obj = null;
        }
        return append.append(obj).append('}').toString();
    }

    public final String a(String str) {
        return this.f57921c.a(str);
    }

    private v(a aVar) {
        Object obj;
        this.f57919a = aVar.f57926a;
        this.f57920b = aVar.f57927b;
        this.f57921c = aVar.f57928c.a();
        this.f57922d = aVar.f57929d;
        if (aVar.f57930e != null) {
            obj = aVar.f57930e;
        } else {
            obj = this;
        }
        this.f57923e = obj;
    }

    /* synthetic */ v(a aVar, byte b2) {
        this(aVar);
    }
}
