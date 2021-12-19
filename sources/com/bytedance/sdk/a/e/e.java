package com.bytedance.sdk.a.e;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.z;

final class e extends b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f43176e;

    static {
        Covode.recordClassIndex(26473);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.sdk.a.e.b
    public final String c() {
        return "passport_google_smart_lock_query_result";
    }

    public final void d() {
        if (!this.f43176e || a()) {
            CredentialRequest.a aVar = new CredentialRequest.a();
            aVar.f49741a = true;
            if (aVar.f49742b == null) {
                aVar.f49742b = new String[0];
            }
            if (aVar.f49741a || aVar.f49742b.length != 0) {
                q.a(a.f49690g.a(this.f43167a.f49982g, new CredentialRequest(aVar, (byte) 0)), new z(new com.google.android.gms.auth.api.credentials.a())).a(new c<com.google.android.gms.auth.api.credentials.a>() {
                    /* class com.bytedance.sdk.a.e.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(26474);
                    }

                    @Override // com.google.android.gms.c.c
                    public final void a(h<com.google.android.gms.auth.api.credentials.a> hVar) {
                        String message;
                        if (hVar.b()) {
                            com.google.android.gms.auth.api.credentials.a d2 = hVar.d();
                            if (d2 != null) {
                                e.this.a(((b) d2.f50288a).a());
                            } else {
                                e.this.a(102, "task result is null");
                            }
                        } else {
                            Exception e2 = hVar.e();
                            if (e2 instanceof n) {
                                if (e.this.f43176e) {
                                    e.this.a((n) e2);
                                    return;
                                }
                                e.this.a(103, ((com.google.android.gms.common.api.e) e2).getStatusCode(), e2.getMessage());
                            } else if (e2 instanceof com.google.android.gms.common.api.e) {
                                e.this.a(104, ((com.google.android.gms.common.api.e) e2).getStatusCode(), "Unsuccessful credential request, " + e2.getMessage());
                            } else {
                                e eVar = e.this;
                                if (e2 == null) {
                                    message = "unknown";
                                } else {
                                    message = e2.getMessage();
                                }
                                eVar.a(108, message);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
        a(101, "activity destroyed");
    }

    e(Activity activity) {
        super(activity);
    }

    public final void a(Credential credential) {
        String uri;
        if (credential == null) {
            a(107, "credential result == null");
            return;
        }
        a aVar = new a();
        aVar.f43163a = credential.f49708a;
        aVar.f43165c = credential.f49712e;
        Uri uri2 = credential.f49710c;
        if (uri2 == null) {
            uri = "";
        } else {
            uri = uri2.toString();
        }
        aVar.f43166d = uri;
        a(aVar);
    }

    public final void a(n nVar) {
        try {
            if (this.f43168b == null) {
                return;
            }
            if (this.f43168b.get() != null) {
                nVar.startResolutionForResult((Activity) this.f43168b.get(), 101);
                if (this.f43170d != null) {
                    this.f43170d.a("passport_google_smart_lock_dialog_show", new Bundle());
                }
            }
        } catch (IntentSender.SendIntentException e2) {
            a(105, "Failed to send resolution, " + e2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.a.e.h
    public final void a(int i2, Intent intent) {
        if (i2 == -1) {
            a((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"));
        } else {
            a(106, "Resolve result fail, maybe user cancel or choose nothing");
        }
    }
}
