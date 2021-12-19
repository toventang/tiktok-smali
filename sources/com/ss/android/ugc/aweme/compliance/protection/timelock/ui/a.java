package com.ss.android.ugc.aweme.compliance.protection.timelock.ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public abstract class a extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    protected Fragment f78015a;

    static {
        Covode.recordClassIndex(48370);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract void b();

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) a(this, "input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        if (getSupportFragmentManager().e() != 1) {
            try {
                getSupportFragmentManager().c();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = f.a(this, getPackageName());
            }
            finish();
            if (intent != null) {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
                startActivity(intent);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a());
        b();
    }

    public final void a(Fragment fragment) {
        if (getSupportFragmentManager().f() == null) {
            getSupportFragmentManager().a().a(R.id.b94, fragment).c();
            return;
        }
        n a2 = getSupportFragmentManager().a();
        a2.a(R.anim.dq, R.anim.dv, R.anim.f354do, R.anim.dx);
        a2.b(R.id.b94, fragment);
        a2.a((String) null);
        a2.c();
    }

    private static Object a(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return activity.getSystemService(str);
        } else if (!i.f107219a) {
            return activity.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = activity.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
