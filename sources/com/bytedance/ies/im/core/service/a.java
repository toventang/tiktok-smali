package com.bytedance.ies.im.core.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.a.c;
import com.bytedance.ies.im.core.a.e;
import com.bytedance.ies.im.core.a.f;
import com.bytedance.ies.im.core.a.g;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.d;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.ies.im.core.api.b.h;
import com.bytedance.ies.im.core.api.b.i;
import com.bytedance.im.core.d.k;
import h.f.b.l;

public final class a implements com.bytedance.ies.im.core.api.h.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0760a f34193a = new C0760a((byte) 0);

    static {
        Covode.recordClassIndex(20364);
    }

    /* renamed from: com.bytedance.ies.im.core.service.a$a  reason: collision with other inner class name */
    public static final class C0760a {
        static {
            Covode.recordClassIndex(20365);
        }

        private C0760a() {
        }

        public /* synthetic */ C0760a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final com.bytedance.ies.im.core.api.b.a b() {
        return com.bytedance.ies.im.core.a.a.f33921b;
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final h d() {
        return f.f33937b;
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final com.bytedance.ies.im.core.api.b.f e() {
        return e.f33936b;
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final i c() {
        return new g();
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final g.b a() {
        return new com.bytedance.ies.im.core.g.e();
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final long a(String str) {
        return k.a(str);
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final b c(String str) {
        l.d(str, "");
        return new com.bytedance.ies.im.core.a.b(str);
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final String b(String str) {
        long a2 = com.bytedance.ies.im.core.api.e.a.a(str);
        if (a2 <= 0) {
            com.bytedance.ies.im.core.api.a.b().c("InternalService", "getConversationIdByUid toUid invalid: ".concat(String.valueOf(str)));
            return null;
        }
        long parseLong = Long.parseLong(com.bytedance.ies.im.core.api.a.e().d());
        if (parseLong > 0) {
            return k.a(a2);
        }
        com.bytedance.ies.im.core.api.a.b().c("InternalService", "getConversationIdByUid self uid invalid: " + parseLong + ", " + com.bytedance.ies.im.core.api.a.e().a());
        return null;
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final d a(String str, int[] iArr) {
        l.d(str, "");
        return new c(str, iArr, 7);
    }

    @Override // com.bytedance.ies.im.core.api.h.a
    public final com.bytedance.ies.im.core.api.b.e a(String str, boolean z) {
        l.d(str, "");
        return new com.bytedance.ies.im.core.a.d(str, z);
    }
}
