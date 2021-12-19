package com.bytedance.lobby.google;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.b;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.a;
import com.google.android.gms.auth.api.identity.f;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.r;
import java.security.SecureRandom;

public class GoogleOneTapAuth extends GoogleOneTapProvider<AuthResult> implements d {

    /* renamed from: b  reason: collision with root package name */
    a f40194b;

    /* renamed from: d  reason: collision with root package name */
    private BeginSignInRequest f40195d;

    /* renamed from: e  reason: collision with root package name */
    private final int f40196e = 1;

    /* renamed from: f  reason: collision with root package name */
    private LobbyViewModel f40197f;

    static {
        Covode.recordClassIndex(24777);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        return null;
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

    public GoogleOneTapAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    public final void a(c cVar) {
        AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
        aVar.f40157a = false;
        aVar.f40158b = cVar;
        this.f40197f.b(aVar.a());
    }

    public static c a(String str) {
        int parseInt = Integer.parseInt(str.replaceAll("[^0-9]", ""));
        if (!(parseInt == 5 || parseInt == 6)) {
            if (parseInt == 7) {
                return new c(5, parseInt, str);
            }
            if (parseInt != 8) {
                if (parseInt != 15) {
                    if (parseInt != 16) {
                        switch (parseInt) {
                            case 12500:
                                break;
                            case 12501:
                                break;
                            case 12502:
                                break;
                            default:
                                return new c(3, 8, str);
                        }
                    }
                    return new c(4, parseInt, str);
                }
                return new c(-999, parseInt, str);
            }
        }
        return new c(3, parseInt, str);
    }

    /* access modifiers changed from: package-private */
    public final BeginSignInRequest a(Boolean bool) {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        BeginSignInRequest.a aVar = new BeginSignInRequest.a();
        BeginSignInRequest.GoogleIdTokenRequestOptions.a aVar2 = new BeginSignInRequest.GoogleIdTokenRequestOptions.a();
        aVar2.f49776a = true;
        aVar2.f49778c = encodeToString;
        aVar2.f49777b = r.a(this.f40228c.f40177c);
        aVar2.f49779d = bool.booleanValue();
        BeginSignInRequest.a a2 = aVar.a(aVar2.a());
        a2.f49784c = false;
        BeginSignInRequest a3 = a2.a();
        this.f40195d = a3;
        return a3;
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
        if (!t_()) {
            b.a(this.f40197f, "google_onetap", 2);
        } else {
            this.f40194b.a();
        }
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(final e eVar, Bundle bundle) {
        this.f40197f = LobbyViewModel.a(eVar);
        if (!t_()) {
            b.a(this.f40197f, "google_onetap", 1);
            return;
        }
        this.f40194b = new com.google.android.gms.internal.p000authapi.e((Activity) r.a(eVar), new f.a((byte) 0).a());
        this.f40194b.a(a((Boolean) true)).a(eVar, new com.google.android.gms.c.e<BeginSignInResult>() {
            /* class com.bytedance.lobby.google.GoogleOneTapAuth.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24779);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.gms.c.e
            public final /* synthetic */ void a(BeginSignInResult beginSignInResult) {
                try {
                    eVar.startIntentSenderForResult(beginSignInResult.f49786a.getIntentSender(), 1, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e2) {
                    GoogleOneTapAuth.this.a(GoogleOneTapAuth.a(e2.getLocalizedMessage()));
                }
            }
        }).a(eVar, new com.google.android.gms.c.d() {
            /* class com.bytedance.lobby.google.GoogleOneTapAuth.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24778);
            }

            @Override // com.google.android.gms.c.d
            public final void a(Exception exc) {
                GoogleOneTapAuth googleOneTapAuth = GoogleOneTapAuth.this;
                e eVar = eVar;
                googleOneTapAuth.f40194b.a(googleOneTapAuth.a((Boolean) false)).a(eVar, new com.google.android.gms.c.e<BeginSignInResult>(eVar) {
                    /* class com.bytedance.lobby.google.GoogleOneTapAuth.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f40203a;

                    static {
                        Covode.recordClassIndex(24781);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.android.gms.c.e
                    public final /* synthetic */ void a(BeginSignInResult beginSignInResult) {
                        try {
                            this.f40203a.startIntentSenderForResult(beginSignInResult.f49786a.getIntentSender(), 1, null, 0, 0, 0, null);
                        } catch (IntentSender.SendIntentException e2) {
                            GoogleOneTapAuth.this.a(GoogleOneTapAuth.a(e2.getLocalizedMessage()));
                        }
                    }

                    {
                        this.f40203a = r2;
                    }
                }).a(eVar, new com.google.android.gms.c.d() {
                    /* class com.bytedance.lobby.google.GoogleOneTapAuth.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(24780);
                    }

                    @Override // com.google.android.gms.c.d
                    public final void a(Exception exc) {
                        GoogleOneTapAuth.this.a(GoogleOneTapAuth.a(exc.getLocalizedMessage()));
                    }
                });
            }
        });
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, int i2, int i3, Intent intent) {
        c cVar;
        if (i2 == 1) {
            try {
                SignInCredential a2 = this.f40194b.a(intent);
                String str = a2.f49793g;
                String str2 = a2.f49787a;
                if (str != null) {
                    AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
                    aVar.f40157a = true;
                    aVar.f40161e = str;
                    aVar.f40160d = str2;
                    this.f40197f.b(aVar.a());
                    return;
                }
                a(new c(6, -1, "No ID token or password!"));
            } catch (com.google.android.gms.common.api.e e2) {
                int statusCode = e2.getStatusCode();
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
                a(cVar);
            }
        }
    }
}
