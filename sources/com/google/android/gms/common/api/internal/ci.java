package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.ss.android.ugc.aweme.lancet.a.a;

/* access modifiers changed from: package-private */
public final class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ch f50161a;

    /* renamed from: b  reason: collision with root package name */
    private final cj f50162b;

    static {
        Covode.recordClassIndex(31281);
    }

    public final void run() {
        if (this.f50161a.f50158d) {
            ConnectionResult connectionResult = this.f50162b.f50164b;
            if (connectionResult.a()) {
                this.f50161a.f50018a.startActivityForResult(GoogleApiActivity.a(this.f50161a.a(), connectionResult.f49943c, this.f50162b.f50163a, false), 1);
            } else if (this.f50161a.f50160f.isUserResolvableError(connectionResult.f49942b)) {
                this.f50161a.f50160f.zaa(this.f50161a.a(), this.f50161a.f50018a, connectionResult.f49942b, 2, this.f50161a);
            } else if (connectionResult.f49942b == 18) {
                Dialog zaa = GoogleApiAvailability.zaa(this.f50161a.a(), this.f50161a);
                GoogleApiAvailability googleApiAvailability = this.f50161a.f50160f;
                Context applicationContext = this.f50161a.a().getApplicationContext();
                if (a.f107168c && applicationContext == null) {
                    applicationContext = a.f107166a;
                }
                googleApiAvailability.zaa(applicationContext, new ck(this, zaa));
            } else {
                this.f50161a.a(connectionResult, this.f50162b.f50163a);
            }
        }
    }

    ci(ch chVar, cj cjVar) {
        this.f50161a = chVar;
        this.f50162b = cjVar;
    }
}
