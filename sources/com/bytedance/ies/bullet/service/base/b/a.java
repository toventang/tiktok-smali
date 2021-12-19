package com.bytedance.ies.bullet.service.base.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.c;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.b.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class a implements c, j {

    /* renamed from: e  reason: collision with root package name */
    public static final C0700a f32572e = new C0700a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h f32573a = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    public String f32574d = "default_bid";

    static {
        Covode.recordClassIndex(19330);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.c
    public void a() {
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public q getLoggerWrapper() {
        return (q) this.f32573a.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.b.a$a  reason: collision with other inner class name */
    public static final class C0700a {
        static {
            Covode.recordClassIndex(19331);
        }

        private C0700a() {
        }

        public /* synthetic */ C0700a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.c
    public final String c() {
        return this.f32574d;
    }

    static final class b extends m implements h.f.a.a<q> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q((com.bytedance.ies.bullet.service.base.m) e.a.a().a(this.this$0.f32574d, com.bytedance.ies.bullet.service.base.m.class), "Service");
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.c
    public void b(String str) {
        l.c(str, "");
        this.f32574d = str;
    }

    public final <T extends c> T a(Class<T> cls) {
        l.c(cls, "");
        return (T) e.a.a().a(this.f32574d, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }
}
