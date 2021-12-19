package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.internal.IShoutOutApiService;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shoutouts.f;
import com.ss.android.ugc.aweme.shoutouts.g;
import com.zhiliaoapp.musically.R;
import dmt.av.video.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;

public final class VEVideoPublishPreviewActivityShoutOut extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f131185h = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private static final String f131186j = VEVideoPublishPreviewActivityShoutOut.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public z f131187d;

    /* renamed from: e  reason: collision with root package name */
    public View f131188e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f131189f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f131190g;

    /* renamed from: i  reason: collision with root package name */
    private final n f131191i = new n(this);

    /* renamed from: k  reason: collision with root package name */
    private HashMap f131192k;

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f131192k == null) {
            this.f131192k = new HashMap();
        }
        View view = (View) this.f131192k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f131192k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85957);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f131191i;
    }

    static {
        Covode.recordClassIndex(85956);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f131191i.a(i.b.DESTROYED);
        z zVar = this.f131187d;
        if (zVar != null) {
            zVar.b();
        }
        com.ss.android.ugc.tools.d.a.c.a(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        z zVar;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onResume", true);
        super.onResume();
        if (!this.f131189f && !this.f131190g && (zVar = this.f131187d) != null) {
            zVar.e();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
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

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f131195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f131196b;

        static {
            Covode.recordClassIndex(85960);
        }

        d(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut, VideoPublishEditModel videoPublishEditModel) {
            this.f131195a = vEVideoPublishPreviewActivityShoutOut;
            this.f131196b = videoPublishEditModel;
        }

        public final void run() {
            if (this.f131196b.mShoutOutsData.getPrice() != null && this.f131196b.mShoutOutsData.getBuyerMoneyDes() != null) {
                com.ss.android.ugc.aweme.shoutouts.a buyerMoneyDes = this.f131196b.mShoutOutsData.getBuyerMoneyDes();
                if (buyerMoneyDes == null) {
                    l.b();
                }
                if (!TextUtils.isEmpty(buyerMoneyDes.getCurrencyCharacter())) {
                    IShoutOutApiService b2 = ShoutOutServiceImpl.b();
                    View findViewById = this.f131195a.findViewById(R.id.c8s);
                    l.b(findViewById, "");
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    g price = this.f131196b.mShoutOutsData.getPrice();
                    if (price == null) {
                        l.b();
                    }
                    int coin = price.getCoin();
                    com.ss.android.ugc.aweme.shoutouts.a buyerMoneyDes2 = this.f131196b.mShoutOutsData.getBuyerMoneyDes();
                    if (buyerMoneyDes2 == null) {
                        l.b();
                    }
                    float money = (float) buyerMoneyDes2.getMoney();
                    com.ss.android.ugc.aweme.shoutouts.a buyerMoneyDes3 = this.f131196b.mShoutOutsData.getBuyerMoneyDes();
                    if (buyerMoneyDes3 == null) {
                        l.b();
                    }
                    String currencyCharacter = buyerMoneyDes3.getCurrencyCharacter();
                    if (currencyCharacter == null) {
                        l.b();
                    }
                    b2.a(viewGroup, coin, money, currencyCharacter, this.f131196b.mShoutOutsData.getDesc(), new com.ss.android.ugc.aweme.internal.d(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut.d.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f131197a;

                        static {
                            Covode.recordClassIndex(85961);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f131197a = r1;
                        }

                        @Override // com.ss.android.ugc.aweme.internal.d
                        public final void a(boolean z) {
                            z zVar;
                            if (z) {
                                this.f131197a.f131195a.f131190g = true;
                                z zVar2 = this.f131197a.f131195a.f131187d;
                                if (zVar2 != null) {
                                    zVar2.d();
                                    return;
                                }
                                return;
                            }
                            this.f131197a.f131195a.f131190g = false;
                            if (!this.f131197a.f131195a.f131189f && (zVar = this.f131197a.f131195a.f131187d) != null) {
                                zVar.e();
                            }
                        }
                    });
                }
            }
        }
    }

    public final void setPlayView(View view) {
        l.d(view, "");
        this.f131188e = view;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f131198a;

        static {
            Covode.recordClassIndex(85962);
        }

        e(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut) {
            this.f131198a = vEVideoPublishPreviewActivityShoutOut;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131198a.finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f131193a;

        static {
            Covode.recordClassIndex(85958);
        }

        b(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut) {
            this.f131193a = vEVideoPublishPreviewActivityShoutOut;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f131193a.f131189f) {
                this.f131193a.f131189f = false;
                VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut = this.f131193a;
                z zVar = vEVideoPublishPreviewActivityShoutOut.f131187d;
                if (zVar != null) {
                    zVar.e();
                }
                View view2 = vEVideoPublishPreviewActivityShoutOut.f131188e;
                if (view2 == null) {
                    l.a("playView");
                }
                view2.setVisibility(4);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f131194a;

        static {
            Covode.recordClassIndex(85959);
        }

        c(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut) {
            this.f131194a = vEVideoPublishPreviewActivityShoutOut;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f131194a.f131189f) {
                this.f131194a.f131189f = true;
                VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut = this.f131194a;
                z zVar = vEVideoPublishPreviewActivityShoutOut.f131187d;
                if (zVar != null) {
                    zVar.d();
                }
                View view2 = vEVideoPublishPreviewActivityShoutOut.f131188e;
                if (view2 == null) {
                    l.a("playView");
                }
                view2.setVisibility(0);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.cd);
        View findViewById = findViewById(R.id.d5j);
        l.b(findViewById, "");
        this.f131188e = findViewById;
        if (findViewById == null) {
            l.a("playView");
        }
        findViewById.setTranslationY((-((float) com.ss.android.ttve.utils.b.b(this))) * 0.16f);
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        View view = this.f131188e;
        if (view == null) {
            l.a("playView");
        }
        view.setOnClickListener(new b(this));
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        View findViewById2 = findViewById(R.id.d94);
        l.b(findViewById2, "");
        SurfaceView surfaceView = (SurfaceView) findViewById2;
        Serializable serializableExtra = getIntent().getSerializableExtra("args");
        if (serializableExtra != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
            z zVar = new z(videoPublishEditModel.videoEditorType, f131186j);
            this.f131187d = zVar;
            zVar.f156980d = true;
            z zVar2 = this.f131187d;
            if (zVar2 == null) {
                l.b();
            }
            f.a(this, videoPublishEditModel, zVar2, this.f131191i, surfaceView);
            surfaceView.setVisibility(0);
            surfaceView.setOnClickListener(new c(this));
            new SafeHandler(this).post(new d(this, videoPublishEditModel));
            findViewById(R.id.q9).setOnClickListener(new e(this));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", false);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", false);
        throw nullPointerException;
    }
}
