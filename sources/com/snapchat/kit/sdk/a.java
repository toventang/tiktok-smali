package com.snapchat.kit.sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.snapchat.kit.sdk.core.a.f;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback;
import java.lang.ref.WeakReference;

public abstract class a extends Activity {

    /* renamed from: a  reason: collision with root package name */
    m f57050a;

    /* renamed from: b  reason: collision with root package name */
    LoginStateController f57051b;

    /* renamed from: c  reason: collision with root package name */
    LoginStateController.OnLoginStateChangedListener f57052c = new b(this);

    static {
        Covode.recordClassIndex(35547);
    }

    /* access modifiers changed from: protected */
    public abstract ConnectFromSnapchatHandler a();

    static final class b implements LoginStateController.OnLoginStateChangedListener {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f57062a;

        static {
            Covode.recordClassIndex(35551);
        }

        @Override // com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener
        public final void onLogout() {
        }

        @Override // com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener
        public final void onLoginFailed() {
            final a aVar = this.f57062a.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.a.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(35553);
                    }

                    public final void run() {
                        a.a(aVar);
                    }
                });
            }
        }

        @Override // com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener
        public final void onLoginSucceeded() {
            final a aVar = this.f57062a.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35552);
                    }

                    public final void run() {
                        a.a(aVar);
                        aVar.finish();
                    }
                });
            }
        }

        b(a aVar) {
            this.f57062a = new WeakReference<>(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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

    /* renamed from: com.snapchat.kit.sdk.a$a  reason: collision with other inner class name */
    static final class C1272a implements FetchCodeVerifierCallback {

        /* renamed from: a  reason: collision with root package name */
        final Uri f57053a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<a> f57054b;

        static {
            Covode.recordClassIndex(35548);
        }

        @Override // com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback
        public final void onCodeVerifierFetchFailed(Throwable th) {
            final a aVar = this.f57054b.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.a.C1272a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(35550);
                    }

                    public final void run() {
                        aVar.finish();
                    }
                });
            }
        }

        @Override // com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback
        public final void onCodeVerifierFetchedSuccessfully(final String str) {
            final a aVar = this.f57054b.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.a.C1272a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35549);
                    }

                    public final void run() {
                        a aVar = aVar;
                        Uri uri = C1272a.this.f57053a;
                        String str = str;
                        aVar.f57051b.addOnLoginStateChangedListener(aVar.f57052c);
                        m mVar = aVar.f57050a;
                        String queryParameter = uri.getQueryParameter("code");
                        String queryParameter2 = uri.getQueryParameter("state");
                        mVar.a(h.a(mVar.f57344b, uri.buildUpon().query(null).build().toString(), mVar.f57346d, queryParameter2, str, new f(), mVar.f57352j, mVar.f57353k, mVar.o), queryParameter, queryParameter2);
                    }
                });
            }
        }

        C1272a(a aVar, Uri uri) {
            this.f57054b = new WeakReference<>(aVar);
            this.f57053a = uri;
        }
    }

    static /* synthetic */ void a(a aVar) {
        aVar.f57051b.removeOnLoginStateChangedListener(aVar.f57052c);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("snapchat://cfs"));
        intent.setPackage(com.snapchat.kit.sdk.b.a.f57077a);
        intent.setFlags(268435456);
        if (intent.resolveActivity(aVar.getPackageManager()) != null) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, aVar);
            aVar.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || intent.getData() == null) {
            finish();
            return;
        }
        SnapKitComponent a2 = c.a(this);
        if (a2 == null) {
            finish();
            return;
        }
        a2.inject(this);
        String queryParameter = intent.getData().getQueryParameter("code");
        String queryParameter2 = intent.getData().getQueryParameter("state");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            finish();
            return;
        }
        ConnectFromSnapchatHandler a3 = a();
        if (a3.needsLoginRedirect()) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("CFS_PENDING_INTENT");
        if (pendingIntent == null || !com.snapchat.kit.sdk.b.a.f57077a.equals(pendingIntent.getCreatorPackage())) {
            finish();
        } else {
            a3.fetchCodeVerifier(queryParameter2, new C1272a(this, intent.getData()));
        }
    }
}
