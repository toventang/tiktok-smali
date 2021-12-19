package com.bytedance.ies.bullet.service.g.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.f;
import h.f.b.l;

public final class b extends com.bytedance.ies.bullet.service.base.b.a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32784a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f32785b;

    static {
        Covode.recordClassIndex(19591);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19592);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ b() {
        this("__prerender");
    }

    private b(String str) {
        l.c(str, "");
        this.f32785b = str;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.f
    public final Object a(Object obj) {
        l.c(obj, "");
        return new a(this.f32785b, this, (com.bytedance.ies.bullet.c.e.a.b) obj);
    }
}
