package com.bytedance.jedi.a.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.b;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.l.e;
import f.a.d.f;
import h.v;

public final class c {
    static {
        Covode.recordClassIndex(23978);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f<RESP> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f39128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f39129b;

        static {
            Covode.recordClassIndex(23979);
        }

        a(b bVar, Object obj) {
            this.f39128a = bVar;
            this.f39129b = obj;
        }

        @Override // f.a.d.f
        public final void accept(RESP resp) {
            Object a2 = this.f39128a.a(this.f39129b, resp);
            if (a2 != null) {
                e a3 = b.a(this.f39128a);
                if (!(a3 instanceof com.bytedance.jedi.a.l.c)) {
                    a3 = null;
                }
                com.bytedance.jedi.a.l.c cVar = (com.bytedance.jedi.a.l.c) a3;
                if (cVar != null) {
                    cVar.a(e.a.a(v.a(this.f39128a.b(this.f39129b), a2)));
                }
            }
        }
    }
}
