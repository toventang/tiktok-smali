package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.identity.c;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.n;
import com.twitter.sdk.android.core.q;
import com.zhiliaoapp.musically.R;

public class OAuthActivity extends Activity implements c.a {

    /* renamed from: a  reason: collision with root package name */
    c f155915a;

    /* renamed from: b  reason: collision with root package name */
    private ProgressBar f155916b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f155917c;

    static {
        Covode.recordClassIndex(103595);
    }

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
    public void onResume() {
        a.b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onBackPressed() {
        this.f155915a.a(0, new n("Authorization failed, request was canceled."));
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

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f155916b.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        a.a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bhy);
        this.f155916b = (ProgressBar) findViewById(R.id.fa6);
        this.f155917c = (WebView) findViewById(R.id.fa7);
        int i2 = 0;
        if (bundle != null) {
            z = bundle.getBoolean("progress", false);
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f155916b;
        if (!z) {
            i2 = 8;
        }
        progressBar.setVisibility(i2);
        c cVar = new c(this.f155916b, this.f155917c, (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config"), new OAuth1aService(q.a(), new com.twitter.sdk.android.core.internal.q()), this);
        this.f155915a = cVar;
        k.c().b();
        OAuth1aService oAuth1aService = cVar.f155933e;
        c.AnonymousClass1 r2 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0063: CONSTRUCTOR  (r2v4 'r2' com.twitter.sdk.android.core.identity.c$1) = (r4v0 'cVar' com.twitter.sdk.android.core.identity.c) call: com.twitter.sdk.android.core.identity.c.1.<init>(com.twitter.sdk.android.core.identity.c):void type: CONSTRUCTOR in method: com.twitter.sdk.android.core.identity.OAuthActivity.onCreate(android.os.Bundle):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.twitter.sdk.android.core.identity.c, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.identity.OAuthActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.twitter.sdk.android.core.identity.c.a
    public final void a(int i2, Intent intent) {
        setResult(i2, intent);
        finish();
    }
}
