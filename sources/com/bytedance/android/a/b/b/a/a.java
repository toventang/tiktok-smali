package com.bytedance.android.a.b.b.a;

import com.bytedance.android.a.b.b.a.e;
import com.bytedance.android.a.b.b.b;
import com.bytedance.android.a.b.b.c;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.a.b.a f6690a;

    static {
        Covode.recordClassIndex(3220);
    }

    /* access modifiers changed from: protected */
    public b a(b bVar) {
        return bVar;
    }

    /* access modifiers changed from: protected */
    public c a(c cVar) {
        return cVar;
    }

    /* renamed from: com.bytedance.android.a.b.b.a.a$a  reason: collision with other inner class name */
    public static class C0090a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private b f6691a;

        /* renamed from: b  reason: collision with root package name */
        private int f6692b = 0;

        /* renamed from: c  reason: collision with root package name */
        private List<e> f6693c;

        static {
            Covode.recordClassIndex(3221);
        }

        @Override // com.bytedance.android.a.b.b.a.e.a
        public final b a() {
            return this.f6691a;
        }

        public C0090a(List<e> list) {
            this.f6693c = list;
        }

        @Override // com.bytedance.android.a.b.b.a.e.a
        public final c a(b bVar) {
            if (bVar == null) {
                com.bytedance.android.a.a.h.a.a("null request");
                return c.a(com.bytedance.android.a.a.h.c.a("null request"), null);
            }
            List<e> list = this.f6693c;
            if (list == null || list.isEmpty()) {
                com.bytedance.android.a.a.h.a.a("no interceptor in the chain");
                return c.a(com.bytedance.android.a.a.h.c.a("no interceptor in the chain"), null);
            } else if (this.f6692b >= this.f6693c.size()) {
                com.bytedance.android.a.a.h.a.a("interceptors index out of bound");
                return c.a(com.bytedance.android.a.a.h.c.a("interceptors index out of bound"), bVar);
            } else {
                e eVar = this.f6693c.get(this.f6692b);
                if (eVar == null) {
                    com.bytedance.android.a.a.h.a.a("null interceptor");
                    return c.a(com.bytedance.android.a.a.h.c.a("null interceptor"), bVar);
                }
                this.f6691a = bVar;
                this.f6692b++;
                return eVar.a(this);
            }
        }
    }

    public a(com.bytedance.android.a.b.a aVar) {
        this.f6690a = aVar;
    }

    @Override // com.bytedance.android.a.b.b.a.e
    public c a(e.a aVar) {
        return a(aVar.a(a(aVar.a())));
    }
}
