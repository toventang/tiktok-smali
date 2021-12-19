package com.bytedance.apm.f;

import com.bytedance.apm.f.c;
import com.bytedance.apm.trace.b;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private c f24926a;

    /* renamed from: b  reason: collision with root package name */
    private b.a f24927b;

    static {
        Covode.recordClassIndex(14564);
    }

    private a() {
    }

    /* renamed from: com.bytedance.apm.f.a$a  reason: collision with other inner class name */
    public static final class C0529a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24928a = new a((byte) 0);

        static {
            Covode.recordClassIndex(14565);
        }
    }

    public final synchronized b.a b() {
        if (this.f24927b == null) {
            this.f24927b = new b.a(new b.a.C0532a(), (byte) 0);
        }
        return this.f24927b;
    }

    public final synchronized c a() {
        if (this.f24926a == null) {
            c.a aVar = new c.a();
            this.f24926a = new c(aVar.f24962a, aVar.f24963b, aVar.f24964c, aVar.f24967f, aVar.f24965d, aVar.f24968g, aVar.f24966e);
        }
        return this.f24926a;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final synchronized void a(c cVar) {
        this.f24926a = cVar;
    }
}
