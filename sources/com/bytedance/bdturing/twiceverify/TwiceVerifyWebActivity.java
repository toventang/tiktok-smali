package com.bytedance.bdturing.twiceverify;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.d;
import com.bytedance.bdturing.VerifyWebView;
import com.bytedance.bdturing.c.b;
import com.bytedance.bdturing.e;
import com.bytedance.bdturing.n;
import com.bytedance.bdturing.twiceverify.c;
import com.bytedance.bdturing.verify.a.a;
import com.bytedance.bdturing.verify.a.h;
import com.bytedance.bdturing.verify.a.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public class TwiceVerifyWebActivity extends d {

    /* renamed from: a  reason: collision with root package name */
    private VerifyWebView f26551a;

    /* renamed from: b  reason: collision with root package name */
    private View f26552b;

    /* renamed from: c  reason: collision with root package name */
    private a f26553c;

    /* renamed from: d  reason: collision with root package name */
    private b f26554d;

    /* renamed from: e  reason: collision with root package name */
    private n f26555e = new n() {
        /* class com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15600);
        }

        @Override // com.bytedance.bdturing.n
        public final void a() {
            e.a(0, "success");
        }

        @Override // com.bytedance.bdturing.n
        public final void a(int i2, String str) {
            e.a(i2, str);
        }
    };

    static {
        Covode.recordClassIndex(15599);
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

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        finish();
        c.a aVar = c.a().f26561b;
        if (aVar != null) {
            aVar.a(2);
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        this.f26551a = null;
        c a2 = c.a();
        a2.f26561b = null;
        a2.f26563d = null;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
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

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        setFinishOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) decorView.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.width = com.bytedance.common.utility.n.a(this);
        if (c.a().f26562c == null || c.a().f26562c.f26557a <= 0) {
            layoutParams.height = (int) com.bytedance.common.utility.n.b(this, 304.0f);
            a aVar = this.f26553c;
            if (aVar instanceof com.bytedance.bdturing.verify.a.b) {
                layoutParams.height = (int) com.bytedance.common.utility.n.b(this, 290.0f);
            } else if (aVar instanceof m) {
                layoutParams.height = (int) com.bytedance.common.utility.n.b(this, 304.0f);
            } else if (aVar instanceof h) {
                layoutParams.height = (int) com.bytedance.common.utility.n.b(this, 272.0f);
            }
        } else {
            layoutParams.height = c.a().f26562c.f26557a;
        }
        getWindowManager().updateViewLayout(decorView, layoutParams);
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    public final void a(int i2) {
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.a2a));
        a(Toast.makeText(this, "ERROR:".concat(String.valueOf(i2)), 1));
        VerifyWebView verifyWebView = this.f26551a;
        if (verifyWebView != null) {
            verifyWebView.setVisibility(4);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.lv);
        c.a();
        this.f26553c = c.a().f26563d;
        if (this.f26551a == null) {
            VerifyWebView verifyWebView = (VerifyWebView) findViewById(R.id.s5);
            this.f26551a = verifyWebView;
            verifyWebView.a(this.f26555e);
        }
        VerifyWebView verifyWebView2 = this.f26551a;
        if (verifyWebView2 != null) {
            verifyWebView2.setParentActivity(this);
        }
        this.f26551a.getSettings().setJavaScriptEnabled(true);
        this.f26554d = new b(new com.bytedance.bdturing.c.d(this), this.f26551a);
        HashMap hashMap = new HashMap();
        VerifyWebView verifyWebView3 = this.f26551a;
        String e2 = this.f26553c.e();
        String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(verifyWebView3, e2);
        if (!TextUtils.isEmpty(a2)) {
            e2 = a2;
        }
        verifyWebView3.loadUrl(e2, hashMap);
        this.f26552b = findViewById(R.id.en8);
        if (c.a().f26562c != null) {
            Drawable e3 = androidx.core.graphics.drawable.a.e(getResources().getDrawable(R.drawable.p0));
            androidx.core.graphics.drawable.a.a(e3, c.a().f26562c.f26558b);
            this.f26552b.setBackgroundDrawable(e3);
        }
    }
}
