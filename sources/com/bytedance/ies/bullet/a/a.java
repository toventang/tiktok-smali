package com.bytedance.ies.bullet.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.b;
import com.bytedance.ies.bullet.c.c;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.e;
import com.bytedance.ies.bullet.service.base.b.e;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public g f31937a;

    /* renamed from: b  reason: collision with root package name */
    public b.a f31938b = new b.a();

    /* renamed from: c  reason: collision with root package name */
    private h f31939c;

    static {
        Covode.recordClassIndex(18678);
    }

    /* access modifiers changed from: protected */
    public abstract b.a a();

    /* renamed from: com.bytedance.ies.bullet.a.a$a  reason: collision with other inner class name */
    public static final class C0663a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f31940a;

        static {
            Covode.recordClassIndex(18679);
        }

        @Override // com.bytedance.ies.bullet.c.e
        public final /* bridge */ /* synthetic */ d.b a() {
            return this.f31940a;
        }

        C0663a(b bVar) {
            this.f31940a = bVar;
        }
    }

    public a(h hVar) {
        l.c(hVar, "");
        this.f31939c = hVar;
    }

    public b a(String str) {
        l.c(str, "");
        b.a a2 = a();
        e.a.a().a(str, a2.f31943a.a());
        b a3 = a2.a();
        c.a(str, new C0663a(a3));
        return a3;
    }
}
