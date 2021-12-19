package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.k;
import com.google.android.gms.common.internal.r;
import com.google.firebase.b;
import com.google.firebase.c.c;
import com.google.firebase.f.h;
import com.google.firebase.installations.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final b f54479a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f54480b;

    /* renamed from: c  reason: collision with root package name */
    private final aj f54481c;

    /* renamed from: d  reason: collision with root package name */
    private final h f54482d;

    /* renamed from: e  reason: collision with root package name */
    private final c f54483e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.installations.h f54484f;

    static {
        Covode.recordClassIndex(33813);
    }

    private String a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f54479a.b().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final com.google.android.gms.c.h<String> a(com.google.android.gms.c.h<Bundle> hVar) {
        return hVar.a(g.f54460a, new r(this));
    }

    public final com.google.android.gms.c.h<Bundle> a(String str, String str2, String str3, Bundle bundle) {
        b(str, str2, str3, bundle);
        return this.f54481c.a(bundle);
    }

    private Bundle b(String str, String str2, String str3, Bundle bundle) {
        String str4;
        Object a2;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f54479a.c().f54357b);
        bundle.putString("gmsv", Integer.toString(this.f54480b.e()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f54480b.c());
        bundle.putString("app_ver_name", this.f54480b.d());
        bundle.putString("firebase-app-name-hash", a());
        try {
            com.google.android.gms.c.h<l> b2 = this.f54484f.b();
            r.c("Must not be called on the main application thread");
            r.a(b2, "Task must not be null");
            if (b2.a()) {
                a2 = k.a((com.google.android.gms.c.h) b2);
            } else {
                k.a aVar = new k.a((byte) 0);
                k.a(b2, aVar);
                aVar.f49906a.await();
                a2 = k.a((com.google.android.gms.c.h) b2);
            }
            String a3 = ((l) a2).a();
            if (!TextUtils.isEmpty(a3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a3);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        if ("20.2.3".length() != 0) {
            str4 = "fiid-".concat("20.2.3");
        } else {
            str4 = new String("fiid-");
        }
        bundle.putString("cliv", str4);
        c.a a4 = this.f54483e.a("fire-iid");
        if (a4 != c.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a4.getCode()));
            bundle.putString("Firebase-Client", this.f54482d.a());
        }
        return bundle;
    }

    public q(b bVar, ae aeVar, h hVar, c cVar, com.google.firebase.installations.h hVar2) {
        this(bVar, aeVar, new aj(bVar.a(), aeVar), hVar, cVar, hVar2);
    }

    private q(b bVar, ae aeVar, aj ajVar, h hVar, c cVar, com.google.firebase.installations.h hVar2) {
        this.f54479a = bVar;
        this.f54480b = aeVar;
        this.f54481c = ajVar;
        this.f54482d = hVar;
        this.f54483e = cVar;
        this.f54484f = hVar2;
    }
}
