package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.core.a.a.a.a;
import com.facebook.internal.k;
import com.facebook.internal.y;
import com.facebook.m.b;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class FacebookActivity extends e {

    /* renamed from: a  reason: collision with root package name */
    public static String f46518a = "PassThrough";

    /* renamed from: c  reason: collision with root package name */
    private static String f46519c = "SingleFragment";

    /* renamed from: d  reason: collision with root package name */
    private static final String f46520d = FacebookActivity.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public Fragment f46521b;

    @Override // androidx.fragment.app.e
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
        super.onResume();
    }

    @Override // androidx.fragment.app.e
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(28385);
    }

    @Override // androidx.fragment.app.e
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

    @Override // androidx.fragment.app.e
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f46521b;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        if (!m.a()) {
            m.a(d.a());
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!m.a()) {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            m.a(applicationContext);
        }
        setContentView(R.layout.nb);
        if (f46518a.equals(intent.getAction())) {
            setResult(0, y.a(getIntent(), (Bundle) null, y.a(y.b(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        i supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.a(f46519c);
        k kVar = a2;
        if (a2 == null) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                k kVar2 = new k();
                kVar2.setRetainInstance(true);
                kVar2.show(supportFragmentManager, f46519c);
                kVar = kVar2;
            } else if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.setRetainInstance(true);
                deviceShareDialogFragment.f49049b = (ShareContent) intent2.getParcelableExtra("content");
                deviceShareDialogFragment.show(supportFragmentManager, f46519c);
                kVar = deviceShareDialogFragment;
            } else if ("ReferralFragment".equals(intent2.getAction())) {
                b bVar = new b();
                bVar.setRetainInstance(true);
                supportFragmentManager.a().a(R.id.a8y, bVar, f46519c).b();
                kVar = bVar;
            } else {
                com.facebook.login.e eVar = new com.facebook.login.e();
                eVar.setRetainInstance(true);
                supportFragmentManager.a().a(R.id.a8y, eVar, f46519c).b();
                kVar = eVar;
            }
        }
        this.f46521b = kVar;
    }

    @Override // androidx.fragment.app.e
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            int i2 = 1;
            if (strArr != null) {
                try {
                    if (strArr.length > 0 && "e2e".equals(strArr[0])) {
                        if (com.facebook.core.a.a.a.b.f47154a == null) {
                            com.facebook.core.a.a.a.b.f47154a = new com.facebook.core.a.a.a.b();
                        }
                        com.facebook.core.a.a.a.b bVar = com.facebook.core.a.a.a.b.f47154a;
                        printWriter.print(str);
                        printWriter.println("Top Level Window View Hierarchy:");
                        boolean a2 = com.facebook.core.a.a.a.b.a(strArr, "all-roots");
                        boolean a3 = com.facebook.core.a.a.a.b.a(strArr, "top-root");
                        boolean a4 = com.facebook.core.a.a.a.b.a(strArr, "webview");
                        boolean a5 = com.facebook.core.a.a.a.b.a(strArr, "props");
                        try {
                            List<a.C1168a> a6 = bVar.f47156b.a();
                            if (a6 == null) {
                                return;
                            }
                            if (!a6.isEmpty()) {
                                Collections.reverse(a6);
                                WindowManager.LayoutParams layoutParams = null;
                                for (a.C1168a aVar : a6) {
                                    if (aVar.f47152a.getVisibility() == 0) {
                                        if (!(a2 || layoutParams == null || Math.abs(aVar.f47153b.type - layoutParams.type) == i2)) {
                                            break;
                                        }
                                        bVar.a(str + "  ", printWriter, aVar.f47152a, 0, 0, a4, a5);
                                        layoutParams = aVar.f47153b;
                                        if (a3) {
                                            break;
                                        }
                                        i2 = 1;
                                    }
                                }
                                bVar.f47157c.a(printWriter);
                                return;
                            }
                            return;
                        } catch (Exception e2) {
                            printWriter.println("Failure in view hierarchy dump: " + e2.getMessage());
                            return;
                        }
                    }
                } catch (Throwable th) {
                    com.facebook.internal.a.b.a.a(th, this);
                    return;
                }
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
