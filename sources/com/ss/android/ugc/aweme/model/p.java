package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class p implements n {

    /* renamed from: a  reason: collision with root package name */
    private final String f110799a;

    /* renamed from: b  reason: collision with root package name */
    private String f110800b;

    /* renamed from: c  reason: collision with root package name */
    private final d f110801c;

    /* renamed from: d  reason: collision with root package name */
    private final Effect f110802d;

    /* renamed from: e  reason: collision with root package name */
    private String f110803e;

    static {
        Covode.recordClassIndex(71102);
    }

    @Override // com.ss.android.ugc.aweme.model.s
    public final String a() {
        return this.f110799a;
    }

    @Override // com.ss.android.ugc.aweme.model.s
    public final String b() {
        return this.f110803e;
    }

    @Override // com.ss.android.ugc.aweme.model.s
    public final d c() {
        return this.f110801c;
    }

    @Override // com.ss.android.ugc.aweme.model.n
    public final String d() {
        return this.f110800b;
    }

    @Override // com.ss.android.ugc.aweme.model.n
    public final Effect e() {
        return this.f110802d;
    }

    @Override // com.ss.android.ugc.aweme.model.n
    public final void a(String str) {
        l.d(str, "");
        this.f110800b = str;
    }

    public p(String str, String str2, d dVar, Effect effect, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(dVar, "");
        l.d(effect, "");
        l.d(str3, "");
        this.f110799a = str;
        this.f110800b = str2;
        this.f110801c = dVar;
        this.f110802d = effect;
        this.f110803e = str3;
    }
}
