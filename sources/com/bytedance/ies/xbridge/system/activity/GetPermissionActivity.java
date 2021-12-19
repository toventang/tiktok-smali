package com.bytedance.ies.xbridge.system.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import h.f.b.l;

public final class GetPermissionActivity extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36443a = new a((byte) 0);

    static {
        Covode.recordClassIndex(21858);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21859);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void finish() {
        super.finish();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStop() {
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        androidx.core.app.a.a(this, getIntent().getStringArrayExtra("permissions"), 36);
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.c(strArr, "");
        l.c(iArr, "");
        if (i2 == 36) {
            if (iArr.length != 0 && iArr[0] == 0) {
                sendBroadcast(new Intent("GetPermissionActivity.permission_granted"));
            } else if (iArr.length != 0 && !androidx.core.app.a.a((Activity) this, strArr[0])) {
                sendBroadcast(new Intent("GetPermissionActivity.permission_rejected"));
            } else {
                sendBroadcast(new Intent("GetPermissionActivity.permission_denied"));
            }
            finish();
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
