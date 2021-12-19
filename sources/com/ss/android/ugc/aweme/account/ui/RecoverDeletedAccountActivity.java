package com.ss.android.ugc.aweme.account.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.legacy.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.i;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class RecoverDeletedAccountActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f65412a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f65413b;

    /* renamed from: l  reason: collision with root package name */
    private static final boolean f65414l = false;

    /* renamed from: c  reason: collision with root package name */
    TuxTextView f65415c;

    /* renamed from: d  reason: collision with root package name */
    TuxTextView f65416d;

    /* renamed from: e  reason: collision with root package name */
    TuxTextView f65417e;

    /* renamed from: f  reason: collision with root package name */
    TuxTextView f65418f;

    /* renamed from: g  reason: collision with root package name */
    String f65419g;

    /* renamed from: h  reason: collision with root package name */
    i f65420h;

    /* renamed from: i  reason: collision with root package name */
    boolean f65421i;

    /* renamed from: j  reason: collision with root package name */
    IAccountUserService f65422j = cj.f71084b.e();

    /* renamed from: k  reason: collision with root package name */
    b f65423k = ((bf) com.ss.android.ugc.aweme.a.a(bf.class)).f();

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(40214);
        String str = Api.f66569d;
        f65412a = str;
        f65413b = str + "/passport/cancel/do/";
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f65419g = a(intent, "enter_from");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        String string;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fn);
        this.f65419g = a(getIntent(), "enter_from");
        this.f65415c = (TuxTextView) findViewById(R.id.z1);
        this.f65416d = (TuxTextView) findViewById(R.id.a1s);
        this.f65417e = (TuxTextView) findViewById(R.id.bwa);
        this.f65418f = (TuxTextView) findViewById(R.id.f9l);
        User curUser = this.f65422j.getCurUser();
        if (curUser != null) {
            if (curUser.getCancelType() == 1) {
                if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.compliance.api.a.n().d())) {
                    this.f65417e.setText(com.ss.android.ugc.aweme.compliance.api.a.n().a(this, com.ss.android.ugc.aweme.compliance.api.a.n().d(), com.ss.android.ugc.aweme.compliance.api.a.n().e()));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new PolicyBodyLinkList(getString(R.string.bqt), "aweme://webview/?url=https://www.tiktok.com/legal/new-terms-of-service?", false, 0, false, ""));
                    arrayList.add(new PolicyBodyLinkList(getString(R.string.bqs), "aweme://webview/?url=https://www.tiktok.com/legal/new-privacy-policy?", false, 0, false, ""));
                    this.f65417e.setText(com.ss.android.ugc.aweme.compliance.api.a.n().a(this, getString(R.string.b4s), arrayList));
                }
                this.f65417e.setMovementMethod(LinkMovementMethod.getInstance());
                TuxTextView tuxTextView = this.f65418f;
                if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.compliance.api.a.n().c())) {
                    string = com.ss.android.ugc.aweme.compliance.api.a.n().c();
                } else {
                    string = getString(R.string.b4t);
                }
                tuxTextView.setText(string);
                this.f65416d.setText(R.string.b4r);
            } else {
                this.f65417e.setText(R.string.fac);
                this.f65418f.setText(R.string.b4t);
                this.f65416d.setText(R.string.fab);
            }
        }
        this.f65415c.setOnClickListener(new d(this));
        this.f65416d.setOnClickListener(new e(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
