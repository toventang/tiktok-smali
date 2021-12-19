package com.ttnet.org.chromium.net.impl;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.h;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

public class q extends h.a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f155805b = q.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Pair<String, String>> f155806a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final c f155807c;

    /* renamed from: d  reason: collision with root package name */
    private final String f155808d;

    /* renamed from: e  reason: collision with root package name */
    private final ab.b f155809e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f155810f;

    /* renamed from: g  reason: collision with root package name */
    private String f155811g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f155812h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f155813i;

    /* renamed from: j  reason: collision with root package name */
    private int f155814j = 3;

    /* renamed from: k  reason: collision with root package name */
    private Collection<Object> f155815k;

    /* renamed from: l  reason: collision with root package name */
    private z f155816l;

    /* renamed from: m  reason: collision with root package name */
    private Executor f155817m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;
    private t.a s;
    private int t;
    private int u;
    private int v;
    private int w;

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* bridge */ /* synthetic */ h.a a() {
        this.f155812h = true;
        return this;
    }

    static {
        Covode.recordClassIndex(103539);
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* synthetic */ h b() {
        p a2 = this.f155807c.a(this.f155808d, this.f155809e, this.f155810f, this.f155814j, this.f155815k, this.f155812h, this.f155813i, this.n, this.o, this.p, this.q, this.r, this.s);
        String str = this.f155811g;
        if (str != null) {
            a2.a(str);
        }
        Iterator<Pair<String, String>> it = this.f155806a.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            a2.b((String) next.first, (String) next.second);
        }
        z zVar = this.f155816l;
        if (zVar != null) {
            a2.a(zVar, this.f155817m);
        }
        a2.b(this.t);
        a2.c(this.u);
        a2.d(this.v);
        a2.e(this.w);
        return a2;
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* bridge */ /* synthetic */ h.a c(int i2) {
        this.f155814j = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ab.a
    public final /* bridge */ /* synthetic */ ab.a d(int i2) {
        this.t = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ab.a
    public final /* bridge */ /* synthetic */ ab.a e(int i2) {
        this.u = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ab.a
    public final /* bridge */ /* synthetic */ ab.a f(int i2) {
        this.v = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.ab.a
    public final /* bridge */ /* synthetic */ ab.a g(int i2) {
        this.w = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* bridge */ /* synthetic */ h.a a(int i2) {
        this.o = true;
        this.p = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* bridge */ /* synthetic */ h.a b(int i2) {
        this.q = true;
        this.r = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final h.a a(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f155811g = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* synthetic */ h.a a(z zVar, Executor executor) {
        Objects.requireNonNull(zVar, "Invalid UploadDataProvider.");
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        if (this.f155811g == null) {
            this.f155811g = "POST";
        }
        this.f155816l = zVar;
        this.f155817m = executor;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.h.a
    public final /* synthetic */ h.a a(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f155806a.add(Pair.create(str, str2));
        if ("Accept-Encoding".equalsIgnoreCase(str)) {
            this.f155806a.add(Pair.create(str, str2));
        }
        return this;
    }

    q(String str, ab.b bVar, Executor executor, c cVar) {
        Objects.requireNonNull(str, "URL is required.");
        Objects.requireNonNull(bVar, "Callback is required.");
        Objects.requireNonNull(executor, "Executor is required.");
        this.f155808d = str;
        this.f155809e = bVar;
        this.f155810f = executor;
        this.f155807c = cVar;
    }
}
