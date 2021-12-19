package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.d.a.h;
import com.bytedance.retrofit2.e;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.api.c.d;
import com.ss.android.ugc.aweme.app.api.r;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    String f34972a;

    /* renamed from: b  reason: collision with root package name */
    boolean f34973b;

    /* renamed from: c  reason: collision with root package name */
    boolean f34974c;

    /* renamed from: d  reason: collision with root package name */
    f f34975d;

    /* renamed from: e  reason: collision with root package name */
    List<com.bytedance.retrofit2.c.a> f34976e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    List<e.a> f34977f = null;

    /* renamed from: g  reason: collision with root package name */
    List<c.a> f34978g;

    /* renamed from: h  reason: collision with root package name */
    d f34979h;

    /* renamed from: i  reason: collision with root package name */
    Object f34980i;

    /* renamed from: j  reason: collision with root package name */
    NetworkPartnerGroup f34981j;

    /* renamed from: k  reason: collision with root package name */
    int f34982k;

    static {
        Covode.recordClassIndex(20991);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e a() {
        this.f34974c = true;
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e b() {
        this.f34973b = true;
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e c() {
        this.f34982k = 3;
        return this;
    }

    public final int hashCode() {
        return (((this.f34972a.hashCode() * 31) + (this.f34973b ? 1 : 0)) * 31) + (this.f34974c ? 1 : 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final f d() {
        if (this.f34977f == null) {
            f fVar = this.f34975d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.app.api.a.a());
            arrayList.add(new r(GsonHolder.c().b()));
            arrayList.add(new com.bytedance.ies.ugc.aweme.network.a.c(GsonHolder.c().b()));
            if (fVar == null) {
                fVar = GsonHolder.c().b();
            }
            arrayList.add(new b(fVar));
            this.f34977f = arrayList;
        }
        if (this.f34979h != null) {
            Iterator<e.a> it = this.f34977f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a next = it.next();
                if (next instanceof r) {
                    ((r) next).f66647a = this.f34979h;
                    break;
                }
            }
        }
        return new h(this);
    }

    public final e a(b bVar) {
        this.f34981j.a(bVar);
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e a(com.bytedance.retrofit2.c.a aVar) {
        this.f34976e.add(aVar);
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e a(d dVar) {
        this.f34979h = dVar;
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e a(Object obj) {
        this.f34980i = obj;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f34973b == aVar.f34973b && this.f34974c == aVar.f34974c && this.f34972a.equals(aVar.f34972a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.ss.android.ugc.aweme.app.api.b());
        arrayList.add(new com.ss.android.ugc.aweme.app.api.f());
        arrayList.add(new com.ss.android.ugc.aweme.app.api.e());
        arrayList.add(h.a());
        arrayList.add(new com.ss.android.ugc.aweme.app.api.a((byte) 0));
        this.f34978g = arrayList;
        this.f34979h = null;
        this.f34981j = new NetworkPartnerGroup();
        this.f34982k = 0;
        this.f34972a = str;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e a(List<com.bytedance.retrofit2.c.a> list) {
        this.f34976e.addAll(list);
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.e
    public final e a(boolean z) {
        if (!z) {
            this.f34974c = true;
        }
        return this;
    }
}
