package com.google.b.a.c.a.a;

import com.bytedance.covode.number.Covode;
import com.google.b.a.a.a.a;
import com.google.b.a.a.a.c;
import com.google.b.a.d.h;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

public final class b extends c {
    private static a p = new a();

    /* renamed from: j  reason: collision with root package name */
    public String f53524j;

    /* renamed from: k  reason: collision with root package name */
    public String f53525k;

    /* renamed from: l  reason: collision with root package name */
    public Collection<String> f53526l;

    /* renamed from: m  reason: collision with root package name */
    public PrivateKey f53527m;
    public String n;
    public String o;

    public static class a extends c.b {

        /* renamed from: i  reason: collision with root package name */
        public String f53528i;

        /* renamed from: j  reason: collision with root package name */
        public Collection<String> f53529j;

        /* renamed from: k  reason: collision with root package name */
        public PrivateKey f53530k;

        /* renamed from: l  reason: collision with root package name */
        public String f53531l;

        /* renamed from: m  reason: collision with root package name */
        public String f53532m;
        public String n;

        static {
            Covode.recordClassIndex(33132);
        }

        public a() {
            super(new a.C1224a());
            a("https://accounts.google.com/o/oauth2/token");
        }

        public final b a() {
            return new b(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public a a(com.google.b.a.d.c cVar) {
            return (a) super.a(cVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public a a(String str) {
            return (a) super.a(str);
        }

        /* renamed from: b */
        public final a a(h hVar) {
            return (a) super.a(hVar);
        }

        /* renamed from: b */
        public final a a(com.google.b.a.e.b bVar) {
            return (a) super.a(bVar);
        }

        public final a b(String str) {
            a(new com.google.b.a.a.a.b(str));
            return this;
        }
    }

    static {
        Covode.recordClassIndex(33131);
    }

    public b() {
        this(new a());
    }

    @Override // com.google.b.a.a.a.c
    public final /* bridge */ /* synthetic */ c a(Long l2) {
        return super.a(l2);
    }

    /* renamed from: c */
    public final b b(Long l2) {
        return (b) super.b(l2);
    }

    /* renamed from: c */
    public final b a(String str) {
        return (b) super.a(str);
    }

    /* renamed from: d */
    public final b b(String str) {
        boolean z;
        if (str != null) {
            if (this.f53504f == null || this.f53502d == null || this.f53503e == null) {
                z = false;
            } else {
                z = true;
            }
            com.google.b.a.f.a.a.a.a.b.a(z, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (b) super.b(str);
    }

    protected b(a aVar) {
        super(aVar);
        Collection<String> unmodifiableCollection;
        boolean z;
        if (aVar.f53530k == null) {
            if (aVar.f53528i == null && aVar.f53529j == null && aVar.n == null) {
                z = true;
            } else {
                z = false;
            }
            com.google.b.a.f.a.a.a.a.b.a(z);
            return;
        }
        this.f53524j = (String) com.google.b.a.f.a.a.a.a.b.a(aVar.f53528i);
        this.f53525k = aVar.f53532m;
        if (aVar.f53529j == null) {
            unmodifiableCollection = Collections.emptyList();
        } else {
            unmodifiableCollection = Collections.unmodifiableCollection(aVar.f53529j);
        }
        this.f53526l = unmodifiableCollection;
        this.f53527m = aVar.f53530k;
        this.n = aVar.f53531l;
        this.o = aVar.n;
    }
}
