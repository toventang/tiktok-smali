package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class o extends x.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f155792a = o.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final c f155793b;

    /* renamed from: c  reason: collision with root package name */
    private final x.b f155794c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f155795d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f155796e;

    /* renamed from: f  reason: collision with root package name */
    private int f155797f;

    /* renamed from: g  reason: collision with root package name */
    private String f155798g;

    /* renamed from: h  reason: collision with root package name */
    private long f155799h;

    /* renamed from: i  reason: collision with root package name */
    private int f155800i;

    /* renamed from: j  reason: collision with root package name */
    private long f155801j;

    /* renamed from: k  reason: collision with root package name */
    private String f155802k;

    /* renamed from: l  reason: collision with root package name */
    private int f155803l;

    /* renamed from: m  reason: collision with root package name */
    private String f155804m;
    private Map<String, String> n;
    private Map<String, String> o;
    private boolean p = true;
    private boolean q = true;

    static {
        Covode.recordClassIndex(103537);
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x a() {
        if (this.q) {
            return this.f155793b.a(this.f155794c, this.f155795d, this.f155796e, this.f155797f, this.f155798g, this.f155799h, this.f155800i, this.f155801j, this.f155802k, this.f155803l, this.f155804m, this.n, this.o, this.p);
        }
        return this.f155793b.a(this.f155794c, this.f155795d, this.f155796e, this.n, this.o, this.p);
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a a(int i2) {
        this.f155797f = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a b(int i2) {
        this.f155800i = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a c(int i2) {
        this.f155803l = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a a(long j2) {
        this.f155799h = j2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a b(long j2) {
        this.f155801j = j2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a a(String str) {
        this.f155798g = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a b(String str) {
        this.f155802k = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a a(List<String> list) {
        this.f155796e = list;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a b(Map<String, String> map) {
        this.o = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a a(Map<String, String> map) {
        this.n = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a b(boolean z) {
        this.q = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.x.a
    public final x.a a(boolean z) {
        this.p = z;
        return this;
    }

    o(x.b bVar, Executor executor, c cVar) {
        this.f155793b = cVar;
        this.f155794c = bVar;
        this.f155795d = executor;
    }
}
