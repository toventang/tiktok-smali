package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.internal.ad;
import com.facebook.internal.f;
import com.facebook.internal.y;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final String f46509a = (CustomTabMainActivity.class.getSimpleName() + ".extra_action");

    /* renamed from: b  reason: collision with root package name */
    public static final String f46510b = (CustomTabMainActivity.class.getSimpleName() + ".extra_params");

    /* renamed from: c  reason: collision with root package name */
    public static final String f46511c = (CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage");

    /* renamed from: d  reason: collision with root package name */
    public static final String f46512d = (CustomTabMainActivity.class.getSimpleName() + ".extra_url");

    /* renamed from: e  reason: collision with root package name */
    public static final String f46513e = (CustomTabMainActivity.class.getSimpleName() + ".action_refresh");

    /* renamed from: f  reason: collision with root package name */
    public static final String f46514f = (CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception");

    /* renamed from: g  reason: collision with root package name */
    private boolean f46515g = true;

    /* renamed from: h  reason: collision with root package name */
    private BroadcastReceiver f46516h;

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
        super.onResume();
        if (this.f46515g) {
            a(0, (Intent) null);
        }
        this.f46515g = true;
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

    static {
        Covode.recordClassIndex(28383);
    }

    private static Bundle a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c2 = ad.c(parse.getQuery());
        c2.putAll(ad.c(parse.getFragment()));
        return c2;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f46513e.equals(intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.f46506b));
            a(-1, intent);
        } else if (CustomTabActivity.f46505a.equals(intent.getAction())) {
            a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        if (CustomTabActivity.f46505a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String a2 = a(getIntent(), f46509a);
            Bundle bundleExtra = getIntent().getBundleExtra(f46510b);
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            boolean a3 = new f(a2, bundleExtra).a(this, a(getIntent(), f46511c));
            this.f46515g = false;
            if (!a3) {
                setResult(0, getIntent().putExtra(f46514f, true));
                finish();
                return;
            }
            this.f46516h = new BroadcastReceiver() {
                /* class com.facebook.CustomTabMainActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28384);
                }

                private static String a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f46513e);
                    intent2.putExtra(CustomTabMainActivity.f46512d, a(intent, CustomTabMainActivity.f46512d));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
                    com.ss.android.ugc.tiktok.security.a.a.a(intent2, customTabMainActivity);
                    customTabMainActivity.startActivity(intent2);
                }
            };
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f46516h, new IntentFilter(CustomTabActivity.f46505a));
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(int i2, Intent intent) {
        Bundle bundle;
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f46516h);
        if (intent != null) {
            String a2 = a(intent, f46512d);
            if (a2 != null) {
                bundle = a(a2);
            } else {
                bundle = new Bundle();
            }
            Intent a3 = y.a(getIntent(), bundle, (j) null);
            if (a3 != null) {
                intent = a3;
            }
            setResult(i2, intent);
        } else {
            setResult(i2, y.a(getIntent(), (Bundle) null, (j) null));
        }
        finish();
    }
}
