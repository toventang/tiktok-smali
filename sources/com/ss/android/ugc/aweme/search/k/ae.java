package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ae implements q {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Integer, ad> f121176a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f121177b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f121178c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(78934);
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final int a() {
        return this.f121177b;
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final Map<String, Object> b() {
        return this.f121178c;
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final ad c() {
        return b(this.f121177b);
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final void d() {
        this.f121176a.clear();
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final void a(int i2) {
        this.f121177b = i2;
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final ad b(int i2) {
        ad adVar = this.f121176a.get(Integer.valueOf(i2));
        if (adVar == null) {
            return new ad();
        }
        return adVar;
    }

    @Override // com.ss.android.ugc.aweme.search.k.q
    public final void a(int i2, ad adVar) {
        l.d(adVar, "");
        this.f121176a.put(Integer.valueOf(i2), adVar);
    }
}
