package com.ss.android.ugc.aweme.share.gif.ui;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.utils.gp;
import com.zhiliaoapp.musically.R;
import java.io.File;

public class VideoShare2GifPreviewActivity extends a implements au {

    /* renamed from: a  reason: collision with root package name */
    RemoteImageView f123535a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f123536b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f123537c;

    /* renamed from: d  reason: collision with root package name */
    VideoShare2GifEditContext f123538d;

    /* renamed from: e  reason: collision with root package name */
    boolean f123539e;

    static {
        Covode.recordClassIndex(81100);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f123539e) {
            setResult(-1);
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", false);
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

    private void a() {
        b a2;
        MethodCollector.i(10925);
        String[] b2 = ah.f123353b.b();
        if (b2 == null || b2.length <= 0) {
            this.f123537c.setVisibility(8);
            MethodCollector.o(10925);
            return;
        }
        for (String str : b2) {
            if (!TextUtils.isEmpty(str) && (a2 = a.C3201a.a(str, this)) != null) {
                String b3 = a2.b();
                Drawable a3 = a2.a(this);
                i iVar = new i(this, a2, str);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int b4 = (int) n.b(this, 10.0f);
                layoutParams.leftMargin = b4;
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(b4);
                com.ss.android.ugc.aweme.share.j.a aVar = new com.ss.android.ugc.aweme.share.j.a(this);
                aVar.setLayoutParams(layoutParams);
                aVar.setOnClickListener(iVar);
                if (b3 != null) {
                    aVar.setText(b3);
                }
                if (a3 != null) {
                    aVar.setIcon(a3);
                }
                aVar.setTextColor(R.color.c4);
                if (a2.b(this)) {
                    this.f123536b.addView(aVar);
                }
            }
        }
        MethodCollector.o(10925);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", true);
        activityConfiguration(g.f123548a);
        super.onCreate(bundle);
        setContentView(R.layout.ch);
        this.f123535a = (RemoteImageView) findViewById(R.id.bx9);
        this.f123536b = (LinearLayout) findViewById(R.id.cgm);
        this.f123537c = (LinearLayout) findViewById(R.id.cgn);
        View findViewById = findViewById(R.id.evy);
        if (findViewById != null) {
            findViewById.setOnClickListener(new h(this));
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.f123538d = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null) {
            finish();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f123535a.setClipToOutline(true);
            this.f123535a.setOutlineProvider(new gp(com.ss.android.ugc.aweme.base.utils.n.a(4.0d)));
        }
        if (!TextUtils.isEmpty(this.f123538d.f123492e) && this.f123538d.f123497j > 0 && this.f123538d.f123496i > 0) {
            ViewGroup.LayoutParams layoutParams = this.f123535a.getLayoutParams();
            layoutParams.width = this.f123538d.f123496i;
            layoutParams.height = this.f123538d.f123497j;
            this.f123535a.setLayoutParams(layoutParams);
            Uri fromFile = Uri.fromFile(new File(this.f123538d.f123492e));
            k.a().e().a(fromFile);
            e.a(this.f123535a, fromFile.toString(), this.f123538d.f123496i, this.f123538d.f123497j);
        }
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", false);
    }
}
