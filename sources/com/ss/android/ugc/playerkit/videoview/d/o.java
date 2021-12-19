package com.ss.android.ugc.playerkit.videoview.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.videoview.d.n;
import java.util.List;

public final class o implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private List<n> f148945a;

    /* renamed from: b  reason: collision with root package name */
    private i f148946b;

    /* renamed from: c  reason: collision with root package name */
    private a f148947c;

    /* renamed from: d  reason: collision with root package name */
    private l f148948d;

    /* renamed from: e  reason: collision with root package name */
    private int f148949e;

    static {
        Covode.recordClassIndex(98082);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n.a
    public final i a() {
        return this.f148946b;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n.a
    public final a b() {
        return this.f148947c;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n.a
    public final l c() {
        return this.f148948d;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n.a
    public final j a(a aVar) {
        if (this.f148949e < this.f148945a.size()) {
            return this.f148945a.get(this.f148949e).b(new o(this.f148945a, aVar, this.f148949e + 1));
        }
        throw new AssertionError();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n.a
    public final j a(i iVar) {
        if (this.f148949e < this.f148945a.size()) {
            return this.f148945a.get(this.f148949e).a(new o(this.f148945a, iVar, this.f148949e + 1));
        }
        throw new AssertionError();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n.a
    public final j a(l lVar) {
        if (this.f148949e < this.f148945a.size()) {
            return this.f148945a.get(this.f148949e).c(new o(this.f148945a, lVar, this.f148949e + 1));
        }
        throw new AssertionError();
    }

    public o(List<n> list, a aVar, int i2) {
        this.f148945a = list;
        this.f148949e = i2;
        this.f148947c = aVar;
    }

    public o(List<n> list, i iVar, int i2) {
        this.f148945a = list;
        this.f148946b = iVar;
        this.f148949e = i2;
    }

    public o(List<n> list, l lVar, int i2) {
        this.f148945a = list;
        this.f148949e = i2;
        this.f148948d = lVar;
    }
}
