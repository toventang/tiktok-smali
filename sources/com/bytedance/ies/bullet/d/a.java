package com.bytedance.ies.bullet.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.l;

public final class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final C0674a f32102a;

    /* renamed from: com.bytedance.ies.bullet.d.a$a  reason: collision with other inner class name */
    public static final class C0674a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f32103a = true;

        static {
            Covode.recordClassIndex(18824);
        }
    }

    static {
        Covode.recordClassIndex(18823);
    }

    @Override // com.bytedance.ies.bullet.service.base.l
    public final boolean a() {
        return this.f32102a.f32103a;
    }

    public a(C0674a aVar) {
        h.f.b.l.c(aVar, "");
        this.f32102a = aVar;
    }
}
