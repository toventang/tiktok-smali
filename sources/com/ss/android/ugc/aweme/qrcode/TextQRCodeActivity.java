package com.ss.android.ugc.aweme.qrcode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.utils.av;
import com.zhiliaoapp.musically.R;

public class TextQRCodeActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f119692a = "";

    /* renamed from: b  reason: collision with root package name */
    private View f119693b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f119694c;

    /* renamed from: d  reason: collision with root package name */
    private View f119695d;

    /* renamed from: e  reason: collision with root package name */
    private View f119696e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f119697f;

    static {
        Covode.recordClassIndex(77753);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c9);
        this.f119696e = findViewById(R.id.bu7);
        this.f119693b = findViewById(R.id.f67);
        this.f119695d = findViewById(R.id.exi);
        this.f119694c = (TextView) findViewById(R.id.exf);
        this.f119693b.setVisibility(8);
        this.f119697f = (TextView) findViewById(R.id.f3s);
        Intent intent = getIntent();
        if (intent != null) {
            this.f119692a = a(intent, "intent_extra_content");
        }
        this.f119694c.setText(this.f119692a);
        String str = this.f119692a;
        if (str != null && ((!TextUtils.isEmpty(str) && str.startsWith("aweme://webview/")) || this.f119692a.contains("snssdk1128"))) {
            this.f119697f.setText(getResources().getText(R.string.fgo));
        }
        this.f119695d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77754);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                try {
                    av.a("label", TextQRCodeActivity.this.f119692a, TextQRCodeActivity.this, PrivacyCert.Builder.with("bpea-218").usage("Copy text recognized by the QR code").tag("copy_qr_text").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                } catch (com.bytedance.bpea.basics.a e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(TextQRCodeActivity.this).a(R.string.aup).a();
            }
        });
        this.f119696e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(77755);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TextQRCodeActivity.this.finish();
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
