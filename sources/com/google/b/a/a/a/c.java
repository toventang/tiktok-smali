package com.google.b.a.a.a;

import com.bytedance.covode.number.Covode;
import com.google.b.a.d.g;
import com.google.b.a.d.h;
import com.google.b.a.g.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class c implements com.google.b.a.d.c, g {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f53499a = Logger.getLogger(c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final a f53500b;

    /* renamed from: c  reason: collision with root package name */
    public final e f53501c;

    /* renamed from: d  reason: collision with root package name */
    public final h f53502d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.b.a.d.c f53503e;

    /* renamed from: f  reason: collision with root package name */
    public final com.google.b.a.e.b f53504f;

    /* renamed from: g  reason: collision with root package name */
    public final String f53505g;

    /* renamed from: h  reason: collision with root package name */
    public final Collection<Object> f53506h;

    /* renamed from: i  reason: collision with root package name */
    public final g f53507i;

    /* renamed from: j  reason: collision with root package name */
    private final Lock f53508j = new ReentrantLock();

    /* renamed from: k  reason: collision with root package name */
    private String f53509k;

    /* renamed from: l  reason: collision with root package name */
    private Long f53510l;

    /* renamed from: m  reason: collision with root package name */
    private String f53511m;

    public interface a {
        static {
            Covode.recordClassIndex(33126);
        }
    }

    static {
        Covode.recordClassIndex(33125);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f53512a;

        /* renamed from: b  reason: collision with root package name */
        public h f53513b;

        /* renamed from: c  reason: collision with root package name */
        public com.google.b.a.e.b f53514c;

        /* renamed from: d  reason: collision with root package name */
        public com.google.b.a.d.a f53515d;

        /* renamed from: e  reason: collision with root package name */
        public e f53516e = e.f53627a;

        /* renamed from: f  reason: collision with root package name */
        public com.google.b.a.d.c f53517f;

        /* renamed from: g  reason: collision with root package name */
        public g f53518g;

        /* renamed from: h  reason: collision with root package name */
        public Collection<Object> f53519h = new ArrayList();

        static {
            Covode.recordClassIndex(33127);
        }

        public b a(com.google.b.a.d.c cVar) {
            this.f53517f = cVar;
            return this;
        }

        public b a(h hVar) {
            this.f53513b = hVar;
            return this;
        }

        public b a(com.google.b.a.e.b bVar) {
            this.f53514c = bVar;
            return this;
        }

        public b(a aVar) {
            this.f53512a = (a) com.google.b.a.f.a.a.a.a.b.a(aVar);
        }

        public b a(String str) {
            com.google.b.a.d.a aVar;
            if (str == null) {
                aVar = null;
            } else {
                aVar = new com.google.b.a.d.a(str);
            }
            this.f53515d = aVar;
            return this;
        }
    }

    public c a(Long l2) {
        this.f53508j.lock();
        try {
            this.f53510l = l2;
            return this;
        } finally {
            this.f53508j.unlock();
        }
    }

    public c b(Long l2) {
        Long valueOf;
        if (l2 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(this.f53501c.a() + (l2.longValue() * 1000));
        }
        return a(valueOf);
    }

    public c a(String str) {
        this.f53508j.lock();
        try {
            this.f53509k = str;
            return this;
        } finally {
            this.f53508j.unlock();
        }
    }

    public c b(String str) {
        boolean z;
        this.f53508j.lock();
        if (str != null) {
            try {
                if (this.f53504f == null || this.f53502d == null || this.f53503e == null || this.f53505g == null) {
                    z = false;
                } else {
                    z = true;
                }
                com.google.b.a.f.a.a.a.a.b.a(z, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f53508j.unlock();
                throw th;
            }
        }
        this.f53511m = str;
        this.f53508j.unlock();
        return this;
    }

    public c(b bVar) {
        String a2;
        this.f53500b = (a) com.google.b.a.f.a.a.a.a.b.a(bVar.f53512a);
        this.f53502d = bVar.f53513b;
        this.f53504f = bVar.f53514c;
        if (bVar.f53515d == null) {
            a2 = null;
        } else {
            a2 = bVar.f53515d.a();
        }
        this.f53505g = a2;
        this.f53503e = bVar.f53517f;
        this.f53507i = bVar.f53518g;
        this.f53506h = Collections.unmodifiableCollection(bVar.f53519h);
        this.f53501c = (e) com.google.b.a.f.a.a.a.a.b.a(bVar.f53516e);
    }
}
