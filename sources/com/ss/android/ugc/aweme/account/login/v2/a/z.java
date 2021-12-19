package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.d.k;
import f.a.n;
import h.f.b.l;
import h.f.b.z;

public final class z {
    static {
        Covode.recordClassIndex(39748);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f64695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64696b;

        static {
            Covode.recordClassIndex(39751);
        }

        c(z.a aVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64695a = aVar;
            this.f64696b = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            if (!this.f64695a.element) {
                this.f64696b.b_(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64697a;

        static {
            Covode.recordClassIndex(39752);
        }

        d(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64697a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64697a.b_(1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f64692b;

        static {
            Covode.recordClassIndex(39749);
        }

        a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, z.a aVar) {
            this.f64691a = cVar;
            this.f64692b = aVar;
        }

        @Override // f.a.d.f
        public final void accept(T t) {
            this.f64691a.b_(0);
            this.f64692b.element = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64693a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f64694b;

        static {
            Covode.recordClassIndex(39750);
        }

        b(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, z.a aVar) {
            this.f64693a = cVar;
            this.f64694b = aVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "";
            l.d(th, str);
            this.f64693a.b_(0);
            this.f64694b.element = true;
            if (th instanceof w) {
                com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64693a;
                w wVar = (w) th;
                int errorCode = wVar.getErrorCode();
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, errorCode, str, wVar.getScene(), wVar.getStep(), wVar.getExtra());
            }
            return true;
        }
    }

    public static final <T> n<T> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, n<T> nVar) {
        l.d(cVar, "");
        l.d(nVar, "");
        z.a aVar = new z.a();
        aVar.element = false;
        n<T> b2 = nVar.b(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(b2, "");
        n<T> c2 = com.ss.android.ugc.aweme.account.login.v2.base.f.a(b2, cVar).d(new a(cVar, aVar)).b(new b(cVar, aVar)).b(new c(aVar, cVar)).c(new d(cVar));
        l.b(c2, "");
        return c2;
    }
}
