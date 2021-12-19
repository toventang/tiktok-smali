package com.google.android.gms.auth.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.g;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.p000authapi.u;
import com.google.android.gms.internal.p000authapi.z;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g<z> f49684a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.g<g> f49685b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<c> f49686c = b.f49704a;

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<C1203a> f49687d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f49688e;

    /* renamed from: f  reason: collision with root package name */
    public static final com.google.android.gms.auth.api.b.a f49689f = b.f49705b;

    /* renamed from: g  reason: collision with root package name */
    public static final c f49690g = new u();

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.android.gms.auth.api.signin.a f49691h = new h();

    /* renamed from: i  reason: collision with root package name */
    private static final a.AbstractC1206a<z, C1203a> f49692i;

    /* renamed from: j  reason: collision with root package name */
    private static final a.AbstractC1206a<g, GoogleSignInOptions> f49693j;

    /* renamed from: com.google.android.gms.auth.api.a$a  reason: collision with other inner class name */
    public static class C1203a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final C1203a f49694a = new C1204a().a();

        /* renamed from: b  reason: collision with root package name */
        public final String f49695b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f49696c;

        /* renamed from: d  reason: collision with root package name */
        public final String f49697d;

        /* renamed from: com.google.android.gms.auth.api.a$a$a  reason: collision with other inner class name */
        public static class C1204a {

            /* renamed from: a  reason: collision with root package name */
            protected String f49701a;

            /* renamed from: b  reason: collision with root package name */
            protected Boolean f49702b = false;

            /* renamed from: c  reason: collision with root package name */
            protected String f49703c;

            static {
                Covode.recordClassIndex(31051);
            }

            public C1203a a() {
                return new C1203a(this);
            }

            public C1204a() {
            }

            public C1204a a(String str) {
                this.f49703c = str;
                return this;
            }

            public C1204a(C1203a aVar) {
                this.f49701a = aVar.f49695b;
                this.f49702b = Boolean.valueOf(aVar.f49696c);
                this.f49703c = aVar.f49697d;
            }
        }

        static {
            Covode.recordClassIndex(31050);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f49695b, Boolean.valueOf(this.f49696c), this.f49697d});
        }

        public C1203a(C1204a aVar) {
            this.f49695b = aVar.f49701a;
            this.f49696c = aVar.f49702b.booleanValue();
            this.f49697d = aVar.f49703c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1203a)) {
                return false;
            }
            C1203a aVar = (C1203a) obj;
            if (!p.a(this.f49695b, aVar.f49695b) || this.f49696c != aVar.f49696c || !p.a(this.f49697d, aVar.f49697d)) {
                return false;
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(31049);
        a.g<z> gVar = new a.g<>();
        f49684a = gVar;
        a.g<g> gVar2 = new a.g<>();
        f49685b = gVar2;
        e eVar = new e();
        f49692i = eVar;
        f fVar = new f();
        f49693j = fVar;
        f49687d = new com.google.android.gms.common.api.a<>("Auth.CREDENTIALS_API", eVar, gVar);
        f49688e = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", fVar, gVar2);
    }
}
