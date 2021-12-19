package com.bytedance.ies.bullet.service.base.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface e {

    public static class a implements e {
        static {
            Covode.recordClassIndex(19285);
        }

        @Override // com.bytedance.ies.bullet.service.base.a.e
        public void a(d dVar) {
            l.c(dVar, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.a.e
        public final void a(d dVar, Throwable th) {
            l.c(dVar, "");
            l.c(th, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.a.e
        public void b(d dVar) {
            l.c(dVar, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.a.e
        public final void c(d dVar) {
            l.c(dVar, "");
        }
    }

    static {
        Covode.recordClassIndex(19284);
    }

    void a(d dVar);

    void a(d dVar, Throwable th);

    void b(d dVar);

    void c(d dVar);
}
