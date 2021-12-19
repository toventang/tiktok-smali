package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.r;
import com.ss.android.ugc.aweme.lancet.a.a;
import org.json.JSONObject;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f49871a;

    /* renamed from: b  reason: collision with root package name */
    private b f49872b;

    /* renamed from: c  reason: collision with root package name */
    private GoogleSignInAccount f49873c;

    /* renamed from: d  reason: collision with root package name */
    private GoogleSignInOptions f49874d = this.f49872b.b();

    static {
        Covode.recordClassIndex(31130);
    }

    public final synchronized void a() {
        MethodCollector.i(2481);
        b bVar = this.f49872b;
        bVar.f49860a.lock();
        try {
            bVar.f49861b.edit().clear().apply();
            bVar.f49860a.unlock();
            this.f49873c = null;
            this.f49874d = null;
            MethodCollector.o(2481);
        } catch (Throwable th) {
            bVar.f49860a.unlock();
            MethodCollector.o(2481);
            throw th;
        }
    }

    private p(Context context) {
        b a2 = b.a(context);
        this.f49872b = a2;
        this.f49873c = a2.a();
    }

    private static synchronized p b(Context context) {
        synchronized (p.class) {
            MethodCollector.i(2480);
            p pVar = f49871a;
            if (pVar != null) {
                MethodCollector.o(2480);
                return pVar;
            }
            p pVar2 = new p(context);
            f49871a = pVar2;
            MethodCollector.o(2480);
            return pVar2;
        }
    }

    public static synchronized p a(Context context) {
        p b2;
        synchronized (p.class) {
            MethodCollector.i(2479);
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            b2 = b(applicationContext);
            MethodCollector.o(2479);
        }
        return b2;
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        MethodCollector.i(2484);
        b bVar = this.f49872b;
        r.a(googleSignInAccount);
        r.a(googleSignInOptions);
        bVar.a("defaultGoogleSignInAccount", googleSignInAccount.f49803h);
        r.a(googleSignInAccount);
        r.a(googleSignInOptions);
        String str = googleSignInAccount.f49803h;
        String b2 = b.b("googleSignInAccount", str);
        JSONObject c2 = googleSignInAccount.c();
        c2.remove("serverAuthCode");
        bVar.a(b2, c2.toString());
        bVar.a(b.b("googleSignInOptions", str), googleSignInOptions.b().toString());
        this.f49873c = googleSignInAccount;
        this.f49874d = googleSignInOptions;
        MethodCollector.o(2484);
    }
}
