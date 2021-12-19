package com.google.android.gms.internal.p000authapi;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.a;
import com.google.android.gms.auth.api.identity.f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.c;
import com.ss.android.ugc.aweme.bf.d;

/* renamed from: com.google.android.gms.internal.auth-api.e  reason: invalid package */
public final class e extends h<f> implements a {

    /* renamed from: i  reason: collision with root package name */
    private static final a.g<k> f50553i;

    /* renamed from: j  reason: collision with root package name */
    private static final a.AbstractC1206a<k, f> f50554j;

    /* renamed from: k  reason: collision with root package name */
    private static final com.google.android.gms.common.api.a<f> f50555k;

    static {
        Covode.recordClassIndex(31518);
        a.g<k> gVar = new a.g<>();
        f50553i = gVar;
        h hVar = new h();
        f50554j = hVar;
        f50555k = new com.google.android.gms.common.api.a<>("Auth.Api.Identity.SignIn.API", hVar, gVar);
    }

    @Override // com.google.android.gms.auth.api.identity.a
    public final com.google.android.gms.c.h<Void> a() {
        d.a(this.f49976a, "com.google.android.gms.signin", 0).edit().clear().apply();
        for (i iVar : i.a()) {
            iVar.d();
        }
        com.google.android.gms.common.api.internal.f.b();
        s.a a2 = s.a();
        a2.f50274c = new Feature[]{l.f50563b};
        a2.f50272a = new f(this);
        a2.f50273b = false;
        return a(a2.a());
    }

    @Override // com.google.android.gms.auth.api.identity.a
    public final SignInCredential a(Intent intent) {
        if (intent != null) {
            Status status = (Status) c.a(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new com.google.android.gms.common.api.e(Status.f49964e);
            } else if (status.c()) {
                SignInCredential signInCredential = (SignInCredential) c.a(intent, "sign_in_credential", SignInCredential.CREATOR);
                if (signInCredential != null) {
                    return signInCredential;
                }
                throw new com.google.android.gms.common.api.e(Status.f49962c);
            } else {
                throw new com.google.android.gms.common.api.e(status);
            }
        } else {
            throw new com.google.android.gms.common.api.e(Status.f49962c);
        }
    }

    @Override // com.google.android.gms.auth.api.identity.a
    public final com.google.android.gms.c.h<BeginSignInResult> a(BeginSignInRequest beginSignInRequest) {
        r.a(beginSignInRequest);
        BeginSignInRequest.a a2 = new BeginSignInRequest.a().a(beginSignInRequest.f49767b);
        a2.f49782a = (BeginSignInRequest.PasswordRequestOptions) r.a(beginSignInRequest.f49766a);
        a2.f49784c = beginSignInRequest.f49769d;
        String str = beginSignInRequest.f49768c;
        if (str != null) {
            a2.f49783b = str;
        }
        a2.f49783b = ((f) this.f49978c).f49794a;
        BeginSignInRequest a3 = a2.a();
        s.a a4 = s.a();
        a4.f50274c = new Feature[]{l.f50562a};
        a4.f50272a = new g(this, a3);
        a4.f50273b = false;
        return a(a4.a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.app.Activity r4, com.google.android.gms.auth.api.identity.f r5) {
        /*
            r3 = this;
            com.google.android.gms.common.api.a<com.google.android.gms.auth.api.identity.f> r2 = com.google.android.gms.internal.p000authapi.e.f50555k
            com.google.android.gms.auth.api.identity.f$a r1 = new com.google.android.gms.auth.api.identity.f$a
            r1.<init>()
            java.lang.String r0 = r5.f49794a
            if (r0 == 0) goto L_0x000e
            r1.a(r0)
        L_0x000e:
            java.lang.String r0 = com.google.android.gms.internal.p000authapi.n.a()
            com.google.android.gms.auth.api.identity.f$a r0 = r1.a(r0)
            com.google.android.gms.auth.api.identity.f r1 = r0.a()
            com.google.android.gms.common.api.h$a r0 = com.google.android.gms.common.api.h.a.f49985a
            r3.<init>(r4, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.e.<init>(android.app.Activity, com.google.android.gms.auth.api.identity.f):void");
    }
}
