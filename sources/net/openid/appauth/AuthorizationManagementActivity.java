package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import net.openid.appauth.e;
import net.openid.appauth.g;
import org.json.JSONException;

public class AuthorizationManagementActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public Intent f159569a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f159570b;

    /* renamed from: c  reason: collision with root package name */
    private f f159571c;

    /* renamed from: d  reason: collision with root package name */
    private PendingIntent f159572d;

    /* renamed from: e  reason: collision with root package name */
    private PendingIntent f159573e;

    static {
        Covode.recordClassIndex(106056);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        a.b(this);
        if (this.f159569a != null) {
            a();
            return;
        }
        try {
            a();
        } catch (NullPointerException unused) {
            finish();
        }
    }

    private void a() {
        super.onResume();
        if (!this.f159570b) {
            a(this, this.f159569a);
            this.f159570b = true;
            return;
        }
        if (getIntent().getData() != null) {
            b();
        } else {
            c();
        }
        finish();
    }

    private void b() {
        Uri data = getIntent().getData();
        Intent a2 = a(data);
        if (a2 == null) {
            net.openid.appauth.c.a.d("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        a2.setData(data);
        if (this.f159572d != null) {
            net.openid.appauth.c.a.a("Authorization complete - invoking completion intent", new Object[0]);
            try {
                this.f159572d.send(this, 0, a2);
            } catch (PendingIntent.CanceledException e2) {
                net.openid.appauth.c.a.d("Failed to send completion intent", e2);
            }
        } else {
            setResult(-1, a2);
        }
    }

    private void c() {
        net.openid.appauth.c.a.a("Authorization flow canceled by user", new Object[0]);
        Intent intent = e.fromTemplate(e.b.f159617b, null).toIntent();
        PendingIntent pendingIntent = this.f159573e;
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
            } catch (PendingIntent.CanceledException e2) {
                net.openid.appauth.c.a.d("Failed to send cancel intent", e2);
            }
        } else {
            setResult(0, intent);
            net.openid.appauth.c.a.a("No cancel intent set - will return to previous activity", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        a.d(this);
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

    static Intent a(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            a(a(getIntent()));
        } else {
            a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f159570b);
        bundle.putParcelable("authIntent", this.f159569a);
        bundle.putString("authRequest", this.f159571c.b().toString());
        bundle.putParcelable("completeIntent", this.f159572d);
        bundle.putParcelable("cancelIntent", this.f159573e);
    }

    private Intent a(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return e.fromOAuthRedirect(uri).toIntent();
        }
        g a2 = new g.a(this.f159571c).a(uri).a();
        if ((this.f159571c.f159642j != null || a2.f159661c == null) && (this.f159571c.f159642j == null || this.f159571c.f159642j.equals(a2.f159661c))) {
            return a2.a();
        }
        net.openid.appauth.c.a.c("State returned in authorization response (%s) does not match state from request (%s) - discarding response", a2.f159661c, this.f159571c.f159642j);
        return e.a.f159614j.toIntent();
    }

    private void a(Bundle bundle) {
        if (bundle == null) {
            net.openid.appauth.c.a.c("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f159569a = (Intent) bundle.getParcelable("authIntent");
        this.f159570b = bundle.getBoolean("authStarted", false);
        f fVar = null;
        try {
            String string = bundle.getString("authRequest", null);
            if (string != null) {
                fVar = f.a(string);
            }
            this.f159571c = fVar;
            this.f159572d = (PendingIntent) bundle.getParcelable("completeIntent");
            this.f159573e = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e2) {
            throw new IllegalStateException("Unable to deserialize authorization request", e2);
        }
    }

    private static void a(AuthorizationManagementActivity authorizationManagementActivity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, authorizationManagementActivity);
        authorizationManagementActivity.startActivity(intent);
    }
}
