package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.a;
import com.linecorp.linesdk.auth.internal.c;
import com.linecorp.linesdk.auth.internal.d;
import com.linecorp.linesdk.b;
import com.zhiliaoapp.musically.R;

public class LineAuthenticationActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private boolean f55001a;

    /* renamed from: b  reason: collision with root package name */
    private d f55002b;

    /* renamed from: c  reason: collision with root package name */
    private c f55003c;

    static {
        Covode.recordClassIndex(34536);
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
    public void onStop() {
        a.d(this);
        super.onStop();
        this.f55001a = true;
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

    /* access modifiers changed from: protected */
    public void onResume() {
        a.b(this);
        super.onResume();
        if (this.f55002b.f55034d == d.a.f55035a) {
            c cVar = this.f55003c;
            cVar.f55027h.f55034d = d.a.f55036b;
            new c.AsyncTaskC1251c(cVar, (byte) 0).execute(new Void[0]);
        } else if (this.f55002b.f55034d != d.a.f55037c) {
            new Handler(Looper.getMainLooper()).postDelayed(new c.b(this.f55003c, (byte) 0), 1000);
        }
        this.f55001a = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.f55002b);
    }

    /* access modifiers changed from: package-private */
    public final void a(LineLoginResult lineLoginResult) {
        d dVar = this.f55002b;
        if (dVar == null) {
            finish();
        } else if ((dVar.f55034d == d.a.f55036b && !this.f55001a) || this.f55002b.f55034d == d.a.f55038d) {
            Intent intent = new Intent();
            intent.putExtra("authentication_result", lineLoginResult);
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        d dVar;
        a.a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.aji);
        Intent intent = getIntent();
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        if (lineAuthenticationConfig == null) {
            a(new LineLoginResult(b.INTERNAL_ERROR, new LineApiError("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null) {
            dVar = new d();
        } else {
            dVar = (d) bundle.getParcelable("authenticationStatus");
            if (dVar == null) {
                dVar = new d();
            }
        }
        this.f55002b = dVar;
        this.f55003c = new c(this, lineAuthenticationConfig, this.f55002b, intent.getStringArrayExtra("permissions"));
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        a.c a2;
        b bVar;
        super.onNewIntent(intent);
        if (this.f55002b.f55034d == d.a.f55036b) {
            c cVar = this.f55003c;
            cVar.f55027h.f55034d = d.a.f55037c;
            a aVar = cVar.f55024e;
            Uri data = intent.getData();
            if (data == null) {
                a2 = a.c.a("Illegal redirection from external application.");
            } else {
                String str = aVar.f55005b.f55033c;
                String queryParameter = data.getQueryParameter("state");
                if (str == null || !str.equals(queryParameter)) {
                    a2 = a.c.a("Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        a2 = new a.c(queryParameter2, null, null, null);
                    } else {
                        a2 = new a.c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
                    }
                }
            }
            if (!a2.a()) {
                cVar.f55027h.f55034d = d.a.f55038d;
                LineAuthenticationActivity lineAuthenticationActivity = cVar.f55020a;
                if (a2.b()) {
                    bVar = b.AUTHENTICATION_AGENT_ERROR;
                } else {
                    bVar = b.INTERNAL_ERROR;
                }
                lineAuthenticationActivity.a(new LineLoginResult(bVar, a2.c()));
                return;
            }
            c.a aVar2 = new c.a(cVar, (byte) 0);
            String[] strArr = new String[1];
            if (!TextUtils.isEmpty(a2.f55013a)) {
                strArr[0] = a2.f55013a;
                aVar2.execute(strArr);
                return;
            }
            throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (this.f55002b.f55034d == d.a.f55036b) {
            c cVar = this.f55003c;
            if (i2 == 3 && cVar.f55027h.f55034d != d.a.f55037c) {
                new Handler(Looper.getMainLooper()).postDelayed(new c.b(cVar, (byte) 0), 1000);
            }
        }
    }
}
