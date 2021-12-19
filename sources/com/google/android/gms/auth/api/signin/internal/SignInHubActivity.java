package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.e;
import androidx.loader.a.c;
import androidx.loader.app.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.p000authapi.m;

public class SignInHubActivity extends e {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f49849c;

    /* renamed from: a  reason: collision with root package name */
    int f49850a;

    /* renamed from: b  reason: collision with root package name */
    Intent f49851b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f49852d;

    /* renamed from: e  reason: collision with root package name */
    private SignInConfiguration f49853e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49854f;

    static {
        Covode.recordClassIndex(31113);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.e
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    private final void a() {
        getSupportLoaderManager().a(0, null, new a(this, (byte) 0));
        f49849c = false;
    }

    @Override // androidx.fragment.app.e
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements a.AbstractC0052a<Void> {
        static {
            Covode.recordClassIndex(31114);
        }

        @Override // androidx.loader.app.a.AbstractC0052a
        public final void a() {
        }

        private a() {
        }

        @Override // androidx.loader.app.a.AbstractC0052a
        public final c<Void> a(Bundle bundle) {
            return new e(SignInHubActivity.this, i.a());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.loader.app.a.AbstractC0052a
        public final /* synthetic */ void a(Void r4) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f49850a, SignInHubActivity.this.f49851b);
            SignInHubActivity.this.finish();
        }

        /* synthetic */ a(SignInHubActivity signInHubActivity, byte b2) {
            this();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f49854f);
        if (this.f49854f) {
            bundle.putInt("signInResultCode", this.f49850a);
            bundle.putParcelable("signInResultData", this.f49851b);
        }
    }

    private final void a(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f49849c = false;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) m.a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            a(12500);
        } else if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) m.a(bundleExtra)).getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.f49853e = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f49854f = z;
                if (z) {
                    this.f49850a = bundle.getInt("signInResultCode");
                    this.f49851b = (Intent) m.a(bundle.getParcelable("signInResultData"));
                    a();
                }
            } else if (f49849c) {
                setResult(0);
                a(12502);
            } else {
                f49849c = true;
                Intent intent2 = new Intent(str);
                if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f49853e);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f49852d = true;
                    a(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            } else {
                new String("Unknown action: ");
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f49852d) {
            setResult(0);
            if (i2 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.f49838a != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.f49838a;
                        p.a(this).a(this.f49853e.f49847a, (GoogleSignInAccount) m.a(googleSignInAccount));
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f49854f = true;
                        this.f49850a = i3;
                        this.f49851b = intent;
                        a();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        a(intExtra);
                        return;
                    }
                }
                a(8);
            }
        }
    }
}
