package com.bytedance.lobby.google;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.b;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.c.h;
import com.google.android.gms.c.k;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;
import java.util.List;

public class GoogleAuth extends GoogleProvider<AuthResult> implements d, i.b {

    /* renamed from: b  reason: collision with root package name */
    static final boolean f40188b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    private int f40189d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f40190e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<e> f40191f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f40192g;

    /* renamed from: h  reason: collision with root package name */
    private i f40193h;

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
        if (this.f40193h != null) {
            this.f40193h = null;
        }
    }

    static {
        Covode.recordClassIndex(24776);
    }

    @Override // com.bytedance.lobby.internal.b, com.bytedance.lobby.internal.BaseProvider
    public final boolean t_() {
        boolean z;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(LobbyCore.getApplication()) == 0) {
                z = true;
                if (super.t_() || !z) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        z = false;
        if (super.t_()) {
        }
        return false;
    }

    public GoogleAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    private GoogleSignInOptions b(Bundle bundle) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(GoogleSignInOptions.f49821f);
        if (bundle.getBoolean("google_request_profile", true)) {
            aVar.b();
        }
        if (bundle.getBoolean("google_request_id", true)) {
            aVar.a();
        }
        if (bundle.getBoolean("google_request_email", true)) {
            aVar.f49829a.add(GoogleSignInOptions.f49817b);
        }
        if (bundle.getBoolean("google_request_id_token", true)) {
            String str = this.f40228c.f40177c;
            aVar.f49832d = true;
            aVar.f49833e = aVar.a(str);
        }
        if (bundle.getBoolean("google_request_server_auth_code", false)) {
            boolean z = bundle.getBoolean("google_force_refresh_token", false);
            String str2 = this.f40228c.f40177c;
            aVar.f49830b = true;
            aVar.f49833e = aVar.a(str2);
            aVar.f49831c = z;
        }
        return aVar.c();
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(Bundle bundle) {
        e eVar;
        WeakReference<e> weakReference = this.f40191f;
        if (weakReference != null) {
            eVar = weakReference.get();
        } else {
            eVar = null;
        }
        if (this.f40192g && eVar != null) {
            this.f40192g = false;
            i a2 = a(eVar, b(this.f40190e));
            a(a2, new d(this, eVar, a2));
        }
    }

    static void a(e eVar, i iVar) {
        eVar.startActivityForResult(com.google.android.gms.auth.api.a.f49691h.a(iVar), 101);
    }

    private static void a(i iVar, q<Status> qVar) {
        if (iVar.g()) {
            com.google.android.gms.auth.api.a.f49691h.b(iVar).a(new b(qVar));
        }
    }

    private i a(e eVar, GoogleSignInOptions googleSignInOptions) {
        if (this.f40193h == null) {
            i.a aVar = new i.a(eVar);
            com.google.android.gms.common.api.a<GoogleSignInOptions> aVar2 = com.google.android.gms.auth.api.a.f49688e;
            r.a(aVar2, "Api must not be null");
            r.a(googleSignInOptions, "Null options are not permitted for this Api");
            aVar.f49993c.put(aVar2, googleSignInOptions);
            List<Scope> a2 = aVar2.f49971a.a(googleSignInOptions);
            aVar.f49992b.addAll(a2);
            aVar.f49991a.addAll(a2);
            this.f40193h = aVar.a(this).a();
        }
        return this.f40193h;
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, Bundle bundle) {
        LobbyViewModel a2 = LobbyViewModel.a(eVar);
        if (!t_()) {
            b.a(a2, "google", 1);
            return;
        }
        this.f40191f = new WeakReference<>(eVar);
        this.f40190e = bundle;
        i a3 = a(eVar, b(bundle));
        if (bundle.getBoolean("google_force_sign_out", true)) {
            a3.e();
            if (a3.g()) {
                a(a3, new a(this, eVar, a3));
            } else {
                this.f40192g = true;
            }
        } else {
            a(eVar, a3);
        }
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
        LobbyViewModel a2 = LobbyViewModel.a(eVar);
        if (!t_()) {
            b.a(a2, "google", 2);
            return;
        }
        i a3 = a(eVar, b(bundle));
        if (a3.g()) {
            a(a3, new c(a2));
            return;
        }
        AuthResult.a aVar = new AuthResult.a("google", 2);
        aVar.f40157a = false;
        aVar.f40158b = new c(new IllegalStateException("GoogleApiClient is not connected yet"));
        a2.b(aVar.a());
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, int i2, int i3, Intent intent) {
        com.google.android.gms.auth.api.signin.b bVar;
        h hVar;
        com.google.android.gms.common.api.e e2;
        c cVar;
        this.f40191f = new WeakReference<>(eVar);
        GoogleSignInAccount googleSignInAccount = null;
        if (intent == null) {
            bVar = new com.google.android.gms.auth.api.signin.b(null, Status.f49962c);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.f49962c;
                }
                bVar = new com.google.android.gms.auth.api.signin.b(null, status);
            } else {
                bVar = new com.google.android.gms.auth.api.signin.b(googleSignInAccount2, Status.f49960a);
            }
        }
        GoogleSignInAccount googleSignInAccount3 = bVar.f49842b;
        if (!bVar.f49841a.c() || googleSignInAccount3 == null) {
            hVar = k.a((Exception) com.google.android.gms.common.internal.b.a(bVar.f49841a));
        } else {
            hVar = k.a(googleSignInAccount3);
        }
        try {
            e2 = null;
            googleSignInAccount = (GoogleSignInAccount) hVar.a(com.google.android.gms.common.api.e.class);
        } catch (com.google.android.gms.common.api.e e3) {
            e2 = e3;
        }
        if (googleSignInAccount == null) {
            if (e2 != null) {
                int statusCode = e2.getStatusCode();
                if (statusCode == 7 || statusCode == 8) {
                    int i4 = this.f40189d + 1;
                    this.f40189d = i4;
                    if (i4 <= 3) {
                        a(eVar, this.f40190e);
                        return;
                    }
                }
                if (statusCode == 5) {
                    cVar = new c(3, statusCode, "The client attempted to connect to the service with an invalid account name specified");
                } else if (statusCode == 6) {
                    cVar = new c(3, statusCode, "Completing the operation requires some form of resolution");
                } else if (statusCode == 7) {
                    cVar = new c(5, statusCode, "Google network error occurred. Retrying should resolve the problem");
                } else if (statusCode == 8) {
                    cVar = new c(3, statusCode, "Google internal error occurred. Retrying should resolve the problem");
                } else if (statusCode == 13) {
                    cVar = new c(7, statusCode, "The operation failed with no more detailed information from Google");
                } else if (statusCode == 15) {
                    cVar = new c(-999, statusCode, "Timed out while awaiting the result");
                } else if (statusCode != 16) {
                    switch (statusCode) {
                        case 12500:
                            cVar = new c(3, statusCode, "Sign in failed with the selected Google account. There is nothing user can do to recover from the sign in failure. Switching to another account may or may not help. Check adb log to see details if any");
                            break;
                        case 12501:
                            cVar = new c(4, statusCode, "The sign in was cancelled by the user. i.e. user cancelled some of the sign in resolutions, e.g. account picking or OAuth consent");
                            break;
                        case 12502:
                            cVar = new c(-999, statusCode, "A sign in process is currently in progress and the current one cannot continue. e.g. the user clicks the SignInButton multiple times and more than one sign in intent was launched");
                            break;
                        default:
                            cVar = new c(7, statusCode, "Unknown error code = " + statusCode + ", check documentation");
                            break;
                    }
                } else {
                    cVar = new c(4, statusCode, "The result was canceled either due to client disconnect or cancel()");
                }
            } else {
                cVar = new c(6, "GoogleSignInAccount and ApiException are both null");
            }
            AuthResult.a aVar = new AuthResult.a("google", 1);
            aVar.f40157a = false;
            aVar.f40158b = cVar;
            LobbyViewModel.a(eVar).b(aVar.a());
            return;
        }
        AuthResult.a aVar2 = new AuthResult.a("google", 1);
        aVar2.f40157a = true;
        aVar2.f40160d = googleSignInAccount.f49797b;
        aVar2.f40165i = new com.bytedance.lobby.b.a().a("email", googleSignInAccount.f49799d).a("display_name", googleSignInAccount.f49800e).a("code", googleSignInAccount.f49802g).a();
        aVar2.f40161e = googleSignInAccount.f49798c;
        LobbyViewModel.a(eVar).b(aVar2.a());
    }
}
