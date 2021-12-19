package com.ss.android.ugc.aweme.shortvideo.stitch;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.i;
import com.bytedance.scene.j;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.adaptation.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ad;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.j.i;
import com.ss.android.ugc.d.a.c;
import com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public final class StitchTrimmingActivity extends h {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f130801f = true;

    /* renamed from: g  reason: collision with root package name */
    public static final a f130802g = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public g f130803e;

    /* renamed from: h  reason: collision with root package name */
    private CutVideoViewModel f130804h;

    /* renamed from: i  reason: collision with root package name */
    private EditCornerViewModel f130805i;

    /* renamed from: j  reason: collision with root package name */
    private String f130806j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f130807k;

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f130807k == null) {
            this.f130807k = new HashMap();
        }
        View view = (View) this.f130807k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f130807k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85721);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(85720);
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

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public final void onResume() {
        String str;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", true);
        super.onResume();
        String str2 = this.f130806j;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = f130801f;
        l.d(str2, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", "stitch").a("enter_from", "video_stitch_page").a("creation_id", str2).a("content_source", "shoot").a("content_type", "video");
        if (z) {
            str = "normal";
        } else {
            str = "back";
        }
        r.a("enter_video_stitch_page", a2.a("enter_method", str).f149193a);
        f130801f = false;
        c.a(new i());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        CutVideoViewModel cutVideoViewModel = this.f130804h;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            g gVar = this.f130803e;
            if (gVar == null) {
                l.a("mRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = gVar.f130828f;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            if (!cutVideoViewModel2.g()) {
                VideoEditViewModel videoEditViewModel = gVar.f130830h;
                if (videoEditViewModel == null) {
                    l.a("videoEditViewModel");
                }
                int i2 = videoEditViewModel.k().get(0).f125482f;
                VideoEditViewModel videoEditViewModel2 = gVar.f130830h;
                if (videoEditViewModel2 == null) {
                    l.a("videoEditViewModel");
                }
                int min = Math.min(i2, videoEditViewModel2.k().get(0).f125483g);
                VideoEditViewModel videoEditViewModel3 = gVar.f130830h;
                if (videoEditViewModel3 == null) {
                    l.a("videoEditViewModel");
                }
                int i3 = videoEditViewModel3.k().get(0).f125482f;
                VideoEditViewModel videoEditViewModel4 = gVar.f130830h;
                if (videoEditViewModel4 == null) {
                    l.a("videoEditViewModel");
                }
                int max = Math.max(i3, videoEditViewModel4.k().get(0).f125483g);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = gVar.f130829g;
                if (cutVideoPreviewViewModel == null) {
                    l.a("previewViewModel");
                }
                cutVideoPreviewViewModel.a(min, max);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z) {
        int i2;
        CutVideoViewModel cutVideoViewModel = this.f130804h;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            EditCornerViewModel editCornerViewModel = this.f130805i;
            if (editCornerViewModel == null) {
                l.a("cornerViewModel");
            }
            if (z) {
                i2 = dh.c(this);
            } else {
                i2 = 0;
            }
            editCornerViewModel.a(i2);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        CutVideoViewModel cutVideoViewModel = this.f130804h;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.j()) {
            CutVideoViewModel cutVideoViewModel2 = this.f130804h;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            bundle.putParcelable("workspace", cutVideoViewModel2.b().f125560i);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z) {
        int b2;
        int i2;
        CutVideoViewModel cutVideoViewModel = this.f130804h;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            g gVar = this.f130803e;
            if (gVar == null) {
                l.a("mRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = gVar.f130828f;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            int i3 = 0;
            if (!cutVideoViewModel2.g()) {
                f E = gVar.E();
                int c2 = com.ss.android.ugc.aweme.adaptation.a.c();
                View view = E.E().n;
                l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    b2 = c2;
                } else {
                    b2 = (int) n.b(E.f42913m, 132.0f);
                }
                marginLayoutParams.height = b2;
                View view2 = E.E().n;
                l.b(view2, "");
                view2.setLayoutParams(marginLayoutParams);
                View view3 = E.F().n;
                l.b(view3, "");
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z) {
                    i2 = (int) (n.b(E.f42913m, 5.5f) + ((float) c2));
                } else {
                    i2 = 0;
                }
                marginLayoutParams2.bottomMargin = i2;
                View view4 = E.F().n;
                l.b(view4, "");
                view4.setLayoutParams(marginLayoutParams2);
            }
            EditCornerViewModel editCornerViewModel = this.f130805i;
            if (editCornerViewModel == null) {
                l.a("cornerViewModel");
            }
            if (z) {
                i3 = com.ss.android.ugc.aweme.adaptation.a.c();
            }
            editCornerViewModel.b(i3);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        Workspace workspace;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", true);
        super.onCreate(bundle);
        g.a().u();
        setContentView(R.layout.b6);
        if (!getIntent().hasExtra("stitch_params")) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
            return;
        }
        JediViewModel a2 = t.a(this).a(CutVideoViewModel.class);
        l.b(a2, "");
        this.f130804h = (CutVideoViewModel) a2;
        JediViewModel a3 = t.a(this).a(EditCornerViewModel.class);
        l.b(a3, "");
        this.f130805i = (EditCornerViewModel) a3;
        ad adVar = new ad();
        StitchParams stitchParams = (StitchParams) getIntent().getParcelableExtra("stitch_params");
        if (stitchParams != null) {
            String a4 = a(getIntent(), "creation_id");
            this.f130806j = a4;
            if (TextUtils.isEmpty(a4)) {
                this.f130806j = UUID.randomUUID().toString();
            }
            adVar.x = stitchParams;
            String videoPath = stitchParams.getVideoPath();
            if (TextUtils.isEmpty(videoPath)) {
                finish();
            } else {
                ArrayList<MediaModel> arrayList = new ArrayList<>();
                MediaModel mediaModel = new MediaModel(1);
                mediaModel.f109390b = videoPath;
                arrayList.add(mediaModel);
                adVar.a(arrayList);
                adVar.f125554c = true;
                adVar.f125555d = getIntent().getLongExtra("min_duration", 3000);
                if (bundle == null) {
                    workspace = com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a();
                } else {
                    workspace = (Workspace) bundle.getParcelable("workspace");
                }
                adVar.f125560i = workspace;
                CutVideoViewModel cutVideoViewModel = this.f130804h;
                if (cutVideoViewModel == null) {
                    l.a("cutVideoViewModel");
                }
                cutVideoViewModel.a(adVar);
                q.b("cutVideoModel initialized");
            }
        }
        g gVar = new g();
        this.f130803e = gVar;
        gVar.f130833k = this.f130806j;
        i.a a5 = com.bytedance.scene.i.a(this, g.class);
        a5.f42897e = false;
        a5.f42898f = new b(this);
        a5.f42894b = false;
        a5.f42895c = false;
        a5.f42896d = R.id.doz;
        a5.a();
        CutVideoViewModel cutVideoViewModel2 = this.f130804h;
        if (cutVideoViewModel2 == null) {
            l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.f125546a != null) {
            CutVideoViewModel cutVideoViewModel3 = this.f130804h;
            if (cutVideoViewModel3 == null) {
                l.a("cutVideoViewModel");
            }
            if (cutVideoViewModel3.g()) {
                ((h) this).f66250d = false;
            }
            q.b("cutVideoModel initialized state: ".concat(String.valueOf(z)));
            JediViewModel a6 = t.a(this).a(EditCornerViewModel.class);
            l.b(a6, "");
            this.f130805i = (EditCornerViewModel) a6;
        } else {
            z = false;
            q.b("cutVideoModel initialized state: ".concat(String.valueOf(z)));
            JediViewModel a62 = t.a(this).a(EditCornerViewModel.class);
            l.b(a62, "");
            this.f130805i = (EditCornerViewModel) a62;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002 && i3 == -1) {
            finish();
        }
    }

    static final class b implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StitchTrimmingActivity f130808a;

        static {
            Covode.recordClassIndex(85722);
        }

        b(StitchTrimmingActivity stitchTrimmingActivity) {
            this.f130808a = stitchTrimmingActivity;
        }

        @Override // com.bytedance.scene.l
        public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (!l.a((Object) g.class.getName(), (Object) str)) {
                return null;
            }
            g gVar = this.f130808a.f130803e;
            if (gVar == null) {
                l.a("mRootScene");
            }
            return gVar;
        }
    }
}
