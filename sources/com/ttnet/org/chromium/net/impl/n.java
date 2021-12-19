package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.w;
import java.util.List;
import java.util.concurrent.Executor;

public class n extends w.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f155784a = n.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final c f155785b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f155786c = null;

    /* renamed from: d  reason: collision with root package name */
    private final w.b f155787d;

    /* renamed from: e  reason: collision with root package name */
    private int f155788e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f155789f;

    /* renamed from: g  reason: collision with root package name */
    private int f155790g;

    /* renamed from: h  reason: collision with root package name */
    private int f155791h;

    static {
        Covode.recordClassIndex(103536);
    }

    @Override // com.ttnet.org.chromium.net.w.a
    public final w a() {
        return this.f155785b.a(this.f155787d, this.f155786c, this.f155788e, this.f155789f, this.f155790g, this.f155791h);
    }

    @Override // com.ttnet.org.chromium.net.w.a
    public final w.a a(int i2) {
        this.f155788e = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.w.a
    public final w.a b(int i2) {
        this.f155790g = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.w.a
    public final w.a c(int i2) {
        this.f155791h = i2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.w.a
    public final w.a a(List<String> list) {
        this.f155789f = list;
        return this;
    }

    n(w.b bVar, c cVar) {
        this.f155785b = cVar;
        this.f155787d = bVar;
    }
}
