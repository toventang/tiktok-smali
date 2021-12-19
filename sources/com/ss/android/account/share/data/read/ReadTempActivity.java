package com.ss.android.account.share.data.read;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import h.f.b.l;

public final class ReadTempActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public int f58211a = 17;

    /* renamed from: b  reason: collision with root package name */
    public String f58212b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f58213c = "";

    static {
        Covode.recordClassIndex(36179);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
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

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", true);
        super.onCreate(bundle);
        String a2 = a(getIntent(), "READ_PKG");
        if (a2 == null) {
            a2 = "";
        }
        this.f58212b = a2;
        String a3 = a(getIntent(), "EXTRA_KEY");
        if (a3 == null) {
            a3 = "";
        }
        this.f58213c = a3;
        if (TextUtils.isEmpty(this.f58212b)) {
            finish();
        }
        try {
            String str = this.f58212b;
            l.c(str, "");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
            Context context = b.f58220a;
            if (context == null) {
                l.a();
            }
            if (intent.resolveActivityInfo(context.getPackageManager(), 65536) == null) {
                b.a(new a(this.f58212b, false, "not support", 8, (byte) 0));
                finish();
            }
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(this.f58212b, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
            intent2.putExtra("EXTRA_KEY", this.f58213c);
            startActivityForResult(intent2, this.f58211a);
        } catch (Exception e2) {
            b.a(new a(this.f58212b, false, String.valueOf(e2.getMessage()), 3));
            com.ss.android.account.share.data.a.a().a("share_sdk_read_start_share_activity_failed").a("err_msg", e2.getMessage()).a("err_msg_stack", Log.getStackTraceString(e2)).b();
        }
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == this.f58211a && intent != null) {
            if (i3 == -1) {
                boolean z = true;
                if (1 != intent.getIntExtra("EXTRA_IS_SUCCESS", -1)) {
                    z = false;
                }
                String str = "";
                if (z) {
                    String a2 = a(intent, "EXTRA_VALUE");
                    if (a2 == null) {
                        a2 = str;
                    }
                    a aVar = new a(this.f58212b, true, null, 12, (byte) 0);
                    String str2 = this.f58213c;
                    l.c(str2, str);
                    aVar.f58214a = str2;
                    aVar.f58219f = 3;
                    l.c(a2, str);
                    aVar.f58215b = a2;
                    b.a(aVar);
                } else {
                    String a3 = a(intent, "ERROR_MSG");
                    if (a3 != null) {
                        str = a3;
                    }
                    b.a(new a(this.f58212b, false, str, 3));
                }
            } else {
                b.a(new a(this.f58212b, false, "resultCode not ok", 3));
            }
        }
        finish();
    }
}
