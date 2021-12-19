package com.ss.android.ugc.aweme.infoSticker.customsticker.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.common.d.j;
import com.ss.android.ugc.aweme.adaptation.h;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class CustomStickerPreviewActivity extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f104658f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.infoSticker.customsticker.a.a f104659e;

    /* renamed from: g  reason: collision with root package name */
    private EditCornerViewModel f104660g;

    /* renamed from: h  reason: collision with root package name */
    private EditPreviewStickerViewModel f104661h;

    /* renamed from: i  reason: collision with root package name */
    private String f104662i;

    /* renamed from: j  reason: collision with root package name */
    private String f104663j;

    /* renamed from: k  reason: collision with root package name */
    private String f104664k;

    /* renamed from: l  reason: collision with root package name */
    private String f104665l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap f104666m;

    static {
        Covode.recordClassIndex(67060);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f104666m == null) {
            this.f104666m = new HashMap();
        }
        View view = (View) this.f104666m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f104666m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {

        /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity$a$a  reason: collision with other inner class name */
        public static final class C2668a<T> implements j {

            /* renamed from: a  reason: collision with root package name */
            public static final C2668a f104667a = new C2668a();

            static {
                Covode.recordClassIndex(67062);
            }

            C2668a() {
            }

            @Override // com.facebook.common.d.j
            public final /* bridge */ /* synthetic */ boolean a(Object obj) {
                return true;
            }
        }

        static {
            Covode.recordClassIndex(67061);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        if (Build.VERSION.SDK_INT >= 21) {
            overridePendingTransition(0, 0);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
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

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        com.ss.android.ugc.aweme.infoSticker.customsticker.a.a aVar = this.f104659e;
        if (aVar == null) {
            l.a("rootScene");
        }
        if (aVar.E().b()) {
            super.onBackPressed();
            return;
        }
        com.ss.android.ugc.aweme.infoSticker.customsticker.a.a aVar2 = this.f104659e;
        if (aVar2 == null) {
            l.a("rootScene");
        }
        if (!aVar2.E().J) {
            com.ss.android.ugc.aweme.infoSticker.customsticker.a.a aVar3 = this.f104659e;
            if (aVar3 == null) {
                l.a("rootScene");
            }
            if (aVar3.E().a()) {
                EditPreviewStickerViewModel editPreviewStickerViewModel = this.f104661h;
                if (editPreviewStickerViewModel == null) {
                    l.a("customStickerViewModel");
                }
                editPreviewStickerViewModel.a();
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z) {
        View findViewById = findViewById(R.id.q9);
        l.b(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = Math.max(n.a() - ((int) com.ss.android.ttve.utils.b.b(this, 8.0f)), 0) + ((int) com.ss.android.ttve.utils.b.b(this, 24.5f));
        findViewById.setLayoutParams(layoutParams2);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b6);
        JediViewModel a2 = t.a(this).a(EditCornerViewModel.class);
        l.b(a2, "");
        this.f104660g = (EditCornerViewModel) a2;
        this.f104662i = a(getIntent(), "shoot_way");
        this.f104663j = a(getIntent(), "content_source");
        this.f104664k = a(getIntent(), "content_type");
        this.f104665l = a(getIntent(), "creation_id");
        MediaModel mediaModel = (MediaModel) getIntent().getParcelableExtra("preview_sticker_params");
        if (mediaModel != null) {
            l.b(mediaModel, "");
            this.f104659e = new com.ss.android.ugc.aweme.infoSticker.customsticker.a.a(mediaModel, (Effect) getIntent().getParcelableExtra("custom_sticker"), this.f104662i, this.f104663j, this.f104664k, this.f104665l);
            i.a a3 = i.a(this, com.ss.android.ugc.aweme.infoSticker.customsticker.a.a.class);
            a3.f42897e = false;
            a3.f42898f = new b(this);
            a3.f42894b = false;
            a3.f42895c = false;
            a3.f42896d = R.id.doz;
            a3.a();
        }
        JediViewModel a4 = t.a(this).a(EditPreviewStickerViewModel.class);
        l.b(a4, "");
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) a4;
        this.f104661h = editPreviewStickerViewModel;
        if (editPreviewStickerViewModel == null) {
            l.a("customStickerViewModel");
        }
        editPreviewStickerViewModel.c(new EditPreviewStickerViewModel.l((MediaModel) getIntent().getParcelableExtra("preview_sticker_params")));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CustomStickerPreviewActivity f104668a;

        static {
            Covode.recordClassIndex(67063);
        }

        b(CustomStickerPreviewActivity customStickerPreviewActivity) {
            this.f104668a = customStickerPreviewActivity;
        }

        @Override // com.bytedance.scene.l
        public final com.bytedance.scene.j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (!l.a((Object) com.ss.android.ugc.aweme.infoSticker.customsticker.a.a.class.getName(), (Object) str)) {
                return null;
            }
            com.ss.android.ugc.aweme.infoSticker.customsticker.a.a aVar = this.f104668a.f104659e;
            if (aVar == null) {
                l.a("rootScene");
            }
            return aVar;
        }
    }
}
