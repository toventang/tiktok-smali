package com.bytedance.ies.bullet.c.c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.e;
import com.bytedance.ies.bullet.c.c.g;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.m;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.a.q;
import h.f.b.l;
import h.h;

public abstract class o<S extends m, T extends e, U extends i, V extends g> implements d<S, T, U, V>, com.bytedance.ies.bullet.service.base.a.o {

    /* renamed from: a  reason: collision with root package name */
    private final h f32044a = h.i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f32045b = h.i.a(h.m.SYNCHRONIZED, new c(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f32046c = h.i.a(h.m.SYNCHRONIZED, new b(this));

    static {
        Covode.recordClassIndex(18780);
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public String d() {
        return "";
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public boolean e() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final String f() {
        return (String) this.f32044a.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final com.bytedance.ies.bullet.service.base.a.m g() {
        return (com.bytedance.ies.bullet.service.base.a.m) this.f32045b.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public q getLoggerWrapper() {
        return (q) this.f32046c.getValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(18781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            com.bytedance.ies.bullet.c.a.a aVar;
            String str;
            com.bytedance.ies.bullet.c.e.a.b b2 = this.this$0.b();
            if (b2 == null || (aVar = (com.bytedance.ies.bullet.c.a.a) b2.c(com.bytedance.ies.bullet.c.a.a.class)) == null || (str = aVar.f31975a) == null) {
                return "default_bid";
            }
            return str;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<q> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(18782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            com.bytedance.ies.bullet.service.base.m mVar;
            com.bytedance.ies.bullet.c.e.a.b b2 = this.this$0.b();
            if (b2 != null) {
                mVar = (com.bytedance.ies.bullet.service.base.m) b2.c(com.bytedance.ies.bullet.service.base.m.class);
            } else {
                mVar = null;
            }
            return new q(mVar, "KitApi");
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.service.base.a.a> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(18783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.service.base.a.a invoke() {
            Application application;
            boolean z;
            com.bytedance.ies.bullet.c.a.a aVar;
            com.bytedance.ies.bullet.c.a.b bVar;
            com.bytedance.ies.bullet.c.e.a.b b2 = this.this$0.b();
            if (b2 != null) {
                application = (Application) b2.c(Application.class);
            } else {
                application = null;
            }
            com.bytedance.ies.bullet.c.e.a.b b3 = this.this$0.b();
            if (b3 == null || (aVar = (com.bytedance.ies.bullet.c.a.a) b3.c(com.bytedance.ies.bullet.c.a.a.class)) == null || (bVar = aVar.f31976b) == null) {
                z = false;
            } else {
                z = bVar.f31978a;
            }
            return new com.bytedance.ies.bullet.service.base.a.a(application, z);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final <T> T a_(Class<T> cls) {
        l.c(cls, "");
        return (T) o.a.b(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final <T extends com.bytedance.ies.bullet.service.base.a.c> T b_(Class<T> cls) {
        l.c(cls, "");
        return (T) o.a.a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        o.a.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        o.a.a(this, str, pVar, str2);
    }
}
