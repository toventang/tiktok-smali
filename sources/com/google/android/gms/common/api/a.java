package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.r;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1206a<?, O> f49971a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49972b;

    /* renamed from: c  reason: collision with root package name */
    private final i<?, O> f49973c = null;

    /* renamed from: d  reason: collision with root package name */
    private final g<?> f49974d;

    /* renamed from: e  reason: collision with root package name */
    private final j<?> f49975e;

    public interface b {
        static {
            Covode.recordClassIndex(31188);
        }
    }

    public static class c<C extends b> {
        static {
            Covode.recordClassIndex(31189);
        }
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface AbstractC1207a extends b, c {
            static {
                Covode.recordClassIndex(31191);
            }

            Account a();
        }

        public interface b extends b {
            static {
                Covode.recordClassIndex(31192);
            }

            GoogleSignInAccount a();
        }

        static {
            Covode.recordClassIndex(31190);
        }
    }

    public interface f extends b {
        static {
            Covode.recordClassIndex(31194);
        }

        void a(c.AbstractC1210c cVar);

        void a(c.e eVar);

        void a(l lVar, Set<Scope> set);

        void a(String str, PrintWriter printWriter);

        boolean c();

        Intent d();

        int e();

        void f();

        boolean g();

        boolean h();

        boolean i();

        String j();

        Feature[] k();

        Set<Scope> l();
    }

    public static final class g<C extends f> extends c<C> {
        static {
            Covode.recordClassIndex(31195);
        }
    }

    public interface h<T extends IInterface> extends b {
        static {
            Covode.recordClassIndex(31196);
        }

        String a();

        String b();

        T c();
    }

    public static abstract class i<T extends h<? extends IInterface>, O> extends e<T, O> {
        static {
            Covode.recordClassIndex(31197);
        }
    }

    public static final class j<C extends h<? extends IInterface>> extends c<C> {
        static {
            Covode.recordClassIndex(31198);
        }
    }

    static {
        Covode.recordClassIndex(31186);
    }

    public final AbstractC1206a<?, O> a() {
        boolean z;
        if (this.f49971a != null) {
            z = true;
        } else {
            z = false;
        }
        r.a(z, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f49971a;
    }

    public final c<?> b() {
        g<?> gVar = this.f49974d;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public static abstract class e<T extends b, O> {
        static {
            Covode.recordClassIndex(31193);
        }

        public List<Scope> a(O o) {
            return Collections.emptyList();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC1206a<C, O> aVar, g<C> gVar) {
        r.a(aVar, "Cannot construct an Api with a null ClientBuilder");
        r.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f49972b = str;
        this.f49971a = aVar;
        this.f49974d = gVar;
        this.f49975e = null;
    }

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC1206a<T extends f, O> extends e<T, O> {
        static {
            Covode.recordClassIndex(31187);
        }

        public T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, i.b bVar, i.c cVar) {
            return a(context, looper, dVar, (Object) o, (com.google.android.gms.common.api.internal.e) bVar, (m) cVar);
        }

        public T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, com.google.android.gms.common.api.internal.e eVar, m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }
}
