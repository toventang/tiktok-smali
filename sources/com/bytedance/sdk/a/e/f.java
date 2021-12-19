package com.bytedance.sdk.a.e;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.d;
import com.google.android.gms.auth.api.credentials.e;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.q;

final class f extends b {

    /* renamed from: e  reason: collision with root package name */
    public a f43178e;

    static {
        Covode.recordClassIndex(26475);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.sdk.a.e.b
    public final String c() {
        return "passport_google_smart_lock_save_result";
    }

    public final void d() {
        a aVar = this.f43178e;
        if (aVar == null || TextUtils.isEmpty(aVar.f43163a) || TextUtils.isEmpty(this.f43178e.f43165c)) {
            a(201, "account info check fail");
            return;
        }
        Credential.a aVar2 = new Credential.a(this.f43178e.f43163a);
        aVar2.f49717b = this.f43178e.f43164b;
        aVar2.f49720e = this.f43178e.f43165c;
        if (!TextUtils.isEmpty(this.f43178e.f43166d)) {
            aVar2.f49718c = Uri.parse(this.f43178e.f43166d);
        }
        q.a(a.f49690g.a(this.f43167a.f49982g, new Credential(aVar2.f49716a, aVar2.f49717b, aVar2.f49718c, aVar2.f49719d, aVar2.f49720e, aVar2.f49721f, aVar2.f49722g, aVar2.f49723h))).a(new c() {
            /* class com.bytedance.sdk.a.e.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26476);
            }

            @Override // com.google.android.gms.c.c
            public final void a(h hVar) {
                String message;
                if (hVar.b()) {
                    f fVar = f.this;
                    fVar.a(fVar.f43178e);
                    return;
                }
                Exception e2 = hVar.e();
                if (e2 instanceof n) {
                    n nVar = (n) e2;
                    try {
                        if (f.this.f43168b == null) {
                            return;
                        }
                        if (f.this.f43168b.get() != null) {
                            nVar.startResolutionForResult((Activity) f.this.f43168b.get(), 102);
                            if (f.this.f43170d != null) {
                                f.this.f43170d.a("passport_google_smart_lock_dialog_show", new Bundle());
                            }
                        }
                    } catch (IntentSender.SendIntentException e3) {
                        f.this.a(202, nVar.getStatusCode(), "Failed to send resolution, " + e3.getMessage());
                    }
                } else if (e2 instanceof e) {
                    f.this.a(203, ((e) e2).getStatusCode(), e2.getMessage());
                } else {
                    f fVar2 = f.this;
                    if (e2 == null) {
                        message = "unknown";
                    } else {
                        message = e2.getMessage();
                    }
                    fVar2.a(205, message);
                }
            }
        });
    }

    f(Activity activity) {
        super(activity);
        this.f43167a = new d((Activity) this.f43168b.get(), new e.a().b().a());
    }

    @Override // com.bytedance.sdk.a.e.h
    public final void a(int i2, Intent intent) {
        if (i2 == -1) {
            a(this.f43178e);
        } else {
            a(204, "SAVE: Canceled by user");
        }
    }
}
