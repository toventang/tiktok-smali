package com.bytedance.sdk.a.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.e.g;
import com.google.android.gms.common.GoogleApiAvailability;

public class d implements g {

    /* renamed from: a  reason: collision with root package name */
    static g f43171a;

    /* renamed from: b  reason: collision with root package name */
    private h f43172b;

    /* renamed from: c  reason: collision with root package name */
    private h f43173c;

    /* renamed from: d  reason: collision with root package name */
    private h f43174d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f43175e;

    static {
        Covode.recordClassIndex(26472);
    }

    private d() {
    }

    private void c() {
        if (this.f43175e == null) {
            throw new IllegalStateException("AppLogDepend is needed, please call method setAppLogDepend(AppLogDepend) first");
        }
    }

    @Override // com.bytedance.sdk.a.e.g
    public final void b() {
        h hVar = this.f43172b;
        if (hVar != null) {
            hVar.b();
        }
        h hVar2 = this.f43173c;
        if (hVar2 != null) {
            hVar2.b();
        }
        h hVar3 = this.f43174d;
        if (hVar3 != null) {
            hVar3.b();
        }
    }

    public static g a() {
        MethodCollector.i(667);
        if (f43171a == null) {
            synchronized (d.class) {
                try {
                    if (f43171a == null) {
                        f43171a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(667);
                    throw th;
                }
            }
        }
        g gVar = f43171a;
        MethodCollector.o(667);
        return gVar;
    }

    @Override // com.bytedance.sdk.a.e.g
    public final void a(g.a aVar) {
        this.f43175e = aVar;
    }

    private static boolean a(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private void a(String str) {
        if (this.f43175e != null) {
            Bundle bundle = new Bundle();
            bundle.putString("gsl_action", str);
            this.f43175e.a("passport_google_smart_lock_google_service_unavailable", bundle);
        }
    }

    @Override // com.bytedance.sdk.a.e.g
    public final void a(int i2, int i3, Intent intent) {
        h hVar;
        if (i2 == 101) {
            h hVar2 = this.f43172b;
            if (hVar2 != null) {
                hVar2.a(i3, intent);
            }
        } else if (i2 == 102 && (hVar = this.f43173c) != null) {
            hVar.a(i3, intent);
        }
    }

    @Override // com.bytedance.sdk.a.e.g
    public final void a(Activity activity, a aVar, c cVar) {
        h hVar = this.f43173c;
        if (hVar != null) {
            hVar.b();
        }
        if (!a(activity)) {
            cVar.a(401, 0);
            a("save");
            return;
        }
        c();
        f fVar = new f(activity);
        fVar.a(cVar);
        fVar.f43170d = this.f43175e;
        fVar.f43178e = aVar;
        fVar.d();
        this.f43173c = fVar;
    }

    @Override // com.bytedance.sdk.a.e.g
    public final void a(Activity activity, boolean z, c cVar) {
        h hVar = this.f43172b;
        if (hVar != null) {
            hVar.b();
        }
        if (!a(activity)) {
            cVar.a(401, 0);
            a("query");
            return;
        }
        c();
        e eVar = new e(activity);
        eVar.a(cVar);
        eVar.f43170d = this.f43175e;
        eVar.f43176e = z;
        eVar.d();
        this.f43172b = eVar;
    }
}
