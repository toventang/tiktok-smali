package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.api.internal.bl;
import com.google.android.gms.common.api.internal.br;
import com.google.android.gms.common.api.internal.cb;
import com.google.android.gms.common.api.internal.cd;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;
import java.util.Collections;
import java.util.Set;

public class h<O extends a.d> implements j<O> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f49976a;

    /* renamed from: b  reason: collision with root package name */
    public final a<O> f49977b;

    /* renamed from: c  reason: collision with root package name */
    public final O f49978c;

    /* renamed from: d  reason: collision with root package name */
    public final b<O> f49979d;

    /* renamed from: e  reason: collision with root package name */
    public final Looper f49980e;

    /* renamed from: f  reason: collision with root package name */
    public final int f49981f;

    /* renamed from: g  reason: collision with root package name */
    public final i f49982g;

    /* renamed from: h  reason: collision with root package name */
    protected final f f49983h;

    /* renamed from: i  reason: collision with root package name */
    private final q f49984i;

    static {
        Covode.recordClassIndex(31205);
    }

    @Override // com.google.android.gms.common.api.j
    public final b<O> c() {
        return this.f49979d;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f49985a = new C1208a().a();

        /* renamed from: b  reason: collision with root package name */
        public final q f49986b;

        /* renamed from: c  reason: collision with root package name */
        public final Looper f49987c;

        /* renamed from: com.google.android.gms.common.api.h$a$a  reason: collision with other inner class name */
        public static class C1208a {

            /* renamed from: a  reason: collision with root package name */
            private q f49988a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f49989b;

            static {
                Covode.recordClassIndex(31207);
            }

            public final a a() {
                if (this.f49988a == null) {
                    this.f49988a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f49989b == null) {
                    this.f49989b = Looper.getMainLooper();
                }
                return new a(this.f49988a, this.f49989b, (byte) 0);
            }

            public final C1208a a(Looper looper) {
                r.a(looper, "Looper must not be null.");
                this.f49989b = looper;
                return this;
            }

            public final C1208a a(q qVar) {
                r.a(qVar, "StatusExceptionMapper must not be null.");
                this.f49988a = qVar;
                return this;
            }
        }

        static {
            Covode.recordClassIndex(31206);
        }

        private a(q qVar, Looper looper) {
            this.f49986b = qVar;
            this.f49987c = looper;
        }

        /* synthetic */ a(q qVar, Looper looper, byte b2) {
            this(qVar, looper);
        }
    }

    private d.a a() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        d.a aVar = new d.a();
        O o = this.f49978c;
        if (!(o instanceof a.d.b) || (a3 = ((a.d.b) o).a()) == null) {
            O o2 = this.f49978c;
            if (o2 instanceof a.d.AbstractC1207a) {
                account = ((a.d.AbstractC1207a) o2).a();
            } else {
                account = null;
            }
        } else {
            account = a3.a();
        }
        aVar.f50393a = account;
        O o3 = this.f49978c;
        if (!(o3 instanceof a.d.b) || (a2 = ((a.d.b) o3).a()) == null) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = a2.b();
        }
        d.a a4 = aVar.a(emptySet);
        a4.f50395c = this.f49976a.getClass().getName();
        a4.f50394b = this.f49976a.getPackageName();
        return a4;
    }

    public final <TResult, A extends a.b> com.google.android.gms.c.h<TResult> a(s<A, TResult> sVar) {
        return a(0, sVar);
    }

    public final <TResult, A extends a.b> com.google.android.gms.c.h<TResult> b(s<A, TResult> sVar) {
        return a(1, sVar);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        return (T) a(1, t);
    }

    public final <A extends a.b, T extends d.a<? extends p, A>> T a(T t) {
        return (T) a(0, t);
    }

    public a.f a(Looper looper, f.a<O> aVar) {
        return this.f49977b.a().a(this.f49976a, looper, a().a(), this.f49978c, (i.b) aVar, (i.c) aVar);
    }

    private final <TResult, A extends a.b> com.google.android.gms.c.h<TResult> a(int i2, s<A, TResult> sVar) {
        com.google.android.gms.c.i iVar = new com.google.android.gms.c.i();
        f fVar = this.f49983h;
        fVar.o.sendMessage(fVar.o.obtainMessage(4, new bl(new cd(i2, sVar, iVar, this.f49984i), fVar.f50232k.get(), this)));
        return iVar.f49902a;
    }

    private final <A extends a.b, T extends d.a<? extends p, A>> T a(int i2, T t) {
        t.e();
        f fVar = this.f49983h;
        fVar.o.sendMessage(fVar.o.obtainMessage(4, new bl(new cb(i2, t), fVar.f50232k.get(), this)));
        return t;
    }

    public br a(Context context, Handler handler) {
        return new br(context, handler, a().a());
    }

    public h(Context context, a<O> aVar, Looper looper) {
        r.a(context, "Null context is not permitted.");
        r.a(aVar, "Api must not be null.");
        r.a(looper, "Looper must not be null.");
        Context a2 = a(context);
        this.f49976a = a2;
        this.f49977b = aVar;
        this.f49978c = null;
        this.f49980e = looper;
        this.f49979d = new b<>(aVar);
        this.f49982g = new bf(this);
        f a3 = f.a(a2);
        this.f49983h = a3;
        this.f49981f = a3.f50231j.getAndIncrement();
        this.f49984i = new com.google.android.gms.common.api.internal.a();
    }

    public h(Activity activity, a<O> aVar, O o, q qVar) {
        this(activity, (a) aVar, (a.d) o, new a.C1208a().a(qVar).a(activity.getMainLooper()).a());
    }

    public h(Activity activity, a<O> aVar, O o, a aVar2) {
        r.a(activity, "Null activity is not permitted.");
        r.a(aVar, "Api must not be null.");
        r.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f49976a = applicationContext;
        this.f49977b = aVar;
        this.f49978c = o;
        this.f49980e = aVar2.f49987c;
        b<O> a2 = b.a(aVar, o);
        this.f49979d = a2;
        this.f49982g = new bf(this);
        f a3 = f.a(applicationContext);
        this.f49983h = a3;
        this.f49981f = a3.f50231j.getAndIncrement();
        this.f49984i = aVar2.f49986b;
        if (!(activity instanceof GoogleApiActivity)) {
            j a4 = x.a(activity);
            x xVar = (x) a4.a("ConnectionlessLifecycleHelper", x.class);
            xVar = xVar == null ? new x(a4) : xVar;
            xVar.f50282c = a3;
            r.a(a2, "ApiKey cannot be null");
            xVar.f50281b.add(a2);
            a3.a(xVar);
        }
        a3.a((h<?>) this);
    }

    public h(Context context, a<O> aVar, O o, a aVar2) {
        r.a(context, "Null context is not permitted.");
        r.a(aVar, "Api must not be null.");
        r.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context a2 = a(context);
        this.f49976a = a2;
        this.f49977b = aVar;
        this.f49978c = o;
        this.f49980e = aVar2.f49987c;
        this.f49979d = b.a(aVar, o);
        this.f49982g = new bf(this);
        f a3 = f.a(a2);
        this.f49983h = a3;
        this.f49981f = a3.f50231j.getAndIncrement();
        this.f49984i = aVar2.f49986b;
        a3.a((h<?>) this);
    }

    public h(Context context, a<O> aVar, O o, q qVar) {
        this(context, aVar, o, new a.C1208a().a(qVar).a());
    }

    public h(Context context, a<O> aVar, O o, Looper looper, q qVar) {
        this(context, aVar, o, new a.C1208a().a(looper).a(qVar).a());
    }
}
