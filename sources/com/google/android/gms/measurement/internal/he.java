package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class he implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ gk f51753a;

    static {
        Covode.recordClassIndex(32280);
    }

    public final void run() {
        ke keVar = this.f51753a.f51686b;
        keVar.f51989a.p().c();
        if (keVar.b()) {
            if (keVar.a()) {
                keVar.f51989a.b().w.a(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                keVar.f51989a.d().a("auto", "_cmpx", bundle);
            } else {
                String a2 = keVar.f51989a.b().w.a();
                if (TextUtils.isEmpty(a2)) {
                    keVar.f51989a.q().f51469d.a("Cache still valid but referrer not found");
                } else {
                    long a3 = ((keVar.f51989a.b().x.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a3);
                    keVar.f51989a.d().a((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                keVar.f51989a.b().w.a(null);
            }
            keVar.f51989a.b().x.a(0);
        }
    }

    he(gk gkVar) {
        this.f51753a = gkVar;
    }
}
