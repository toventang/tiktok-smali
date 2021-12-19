package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.signin.internal.f;
import com.google.android.gms.auth.api.signin.internal.k;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;

public class GoogleSignInClient extends h<GoogleSignInOptions> {

    /* renamed from: i  reason: collision with root package name */
    private static final b f49809i = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private static int f49810j = a.f49811a;

    static class b implements q.a<b, GoogleSignInAccount> {
        static {
            Covode.recordClassIndex(31099);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.p] */
        @Override // com.google.android.gms.common.internal.q.a
        public final /* synthetic */ GoogleSignInAccount a(b bVar) {
            return bVar.f49842b;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f49811a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f49812b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f49813c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f49814d = 4;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ int[] f49815e = {1, 2, 3, 4};

        static {
            Covode.recordClassIndex(31098);
        }
    }

    static {
        Covode.recordClassIndex(31097);
    }

    public final synchronized int a() {
        int i2;
        MethodCollector.i(3107);
        if (f49810j == a.f49811a) {
            Context context = this.f49976a;
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context, 12451000);
            if (isGooglePlayServicesAvailable == 0) {
                f49810j = a.f49814d;
            } else if (instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                f49810j = a.f49812b;
            } else {
                f49810j = a.f49813c;
            }
        }
        i2 = f49810j;
        MethodCollector.o(3107);
        return i2;
    }

    public final com.google.android.gms.c.h<Void> b() {
        boolean z;
        BasePendingResult b2;
        i iVar = this.f49982g;
        Context context = this.f49976a;
        if (a() == a.f49813c) {
            z = true;
        } else {
            z = false;
        }
        com.google.android.gms.auth.api.signin.internal.i.f49868a.a("Revoking access", new Object[0]);
        String a2 = com.google.android.gms.auth.api.signin.internal.b.a(context).a("refreshToken");
        com.google.android.gms.auth.api.signin.internal.i.a(context);
        if (!z) {
            b2 = iVar.b(new k(iVar));
        } else if (a2 == null) {
            Status status = new Status(4);
            r.a(status, "Result must not be null");
            r.b(!status.D_().c(), "Status code must not be SUCCESS");
            b2 = new l.a(status);
            b2.a((p) status);
        } else {
            f fVar = new f(a2);
            new Thread(fVar).start();
            b2 = fVar.f49865a;
        }
        return q.a(b2);
    }

    GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, (com.google.android.gms.common.api.a) com.google.android.gms.auth.api.a.f49688e, (a.d) googleSignInOptions, (com.google.android.gms.common.api.internal.q) new com.google.android.gms.common.api.internal.a());
    }

    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, com.google.android.gms.auth.api.a.f49688e, googleSignInOptions, new com.google.android.gms.common.api.internal.a());
    }
}
