package com.ss.android.ugc.aweme.qrcode.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.d;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.powerpermissions.l;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.utils.cp;
import com.ss.android.ugc.aweme.utils.permission.e;
import com.zhiliaoapp.musically.R;

public class QRCodePermissionActivity extends d {

    /* renamed from: c  reason: collision with root package name */
    public static long f119804c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f119805a;

    /* renamed from: b  reason: collision with root package name */
    public int f119806b = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f119807d;

    static {
        Covode.recordClassIndex(77849);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getShortVideoPluginService().a(new bb.a() {
            /* class com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.AnonymousClass4 */

            static {
                Covode.recordClassIndex(77853);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bb.a
            public final void onSuccess() {
                if (QRCodePermissionActivity.this.f119806b != -1) {
                    QRCodePermissionActivity qRCodePermissionActivity = QRCodePermissionActivity.this;
                    int i2 = qRCodePermissionActivity.f119806b;
                    boolean z = QRCodePermissionActivity.this.f119807d;
                    Intent intent = new Intent(qRCodePermissionActivity, ScanQRCodeActivityV2.class);
                    intent.putExtra("scan_page_from", i2);
                    intent.putExtra("camera_only", z);
                    ScanQRCodeActivityV2.a(qRCodePermissionActivity, intent);
                } else {
                    QRCodePermissionActivity qRCodePermissionActivity2 = QRCodePermissionActivity.this;
                    boolean z2 = qRCodePermissionActivity2.f119805a;
                    Intent intent2 = new Intent(qRCodePermissionActivity2, ScanQRCodeActivityV2.class);
                    intent2.putExtra("enter_from", z2);
                    ScanQRCodeActivityV2.a(qRCodePermissionActivity2, intent2);
                }
                QRCodePermissionActivity.this.finish();
            }
        });
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
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

    /* access modifiers changed from: package-private */
    public final void a() {
        Dialog b2 = new a.C0731a(this).b(R.string.dox).b(R.string.a9e, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(77851);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                QRCodePermissionActivity.this.finish();
            }
        }, false).a(R.string.asi, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77850);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                cp.a(QRCodePermissionActivity.this);
                QRCodePermissionActivity.this.finish();
            }
        }, false).a().b();
        b2.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.AnonymousClass3 */

            static {
                Covode.recordClassIndex(77852);
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                QRCodePermissionActivity.this.finish();
            }
        });
        b2.show();
    }

    public static void a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f119804c >= 1000) {
            f119804c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", false);
            intent.putExtra("page_from", -1);
            a(context, intent);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        if (e.a(this) != 0) {
            z = false;
        }
        this.f119805a = getIntent().getBooleanExtra("enter_from", false);
        this.f119806b = getIntent().getIntExtra("page_from", -1);
        this.f119807d = getIntent().getBooleanExtra("camera_only", false);
        if (z) {
            b();
        } else if (e.a()) {
            l.a(this).a("android.permission.CAMERA").a(new c(this));
        } else {
            a();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", false);
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(Context context, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f119804c >= 1000) {
            f119804c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            intent.putExtra("enter_from", z2);
            a(context, intent);
        }
    }
}
