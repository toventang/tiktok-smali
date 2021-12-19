package com.ss.android.ugc.aweme.story.base.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.bytedance.scene.i;
import com.bytedance.scene.j;
import com.bytedance.scene.n;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.aweme.utils.ds;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class StoryEditActivity extends com.ss.android.ugc.aweme.adaptation.b implements com.ss.android.ugc.tools.view.a.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f136897d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private n f136898e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.ss.android.ugc.tools.view.a.a> f136899f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final h f136900g = i.a((h.f.a.a) d.f136904a);

    /* renamed from: h  reason: collision with root package name */
    private HashMap f136901h;

    static {
        Covode.recordClassIndex(89476);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f136901h == null) {
            this.f136901h = new HashMap();
        }
        View view = (View) this.f136901h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f136901h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.story.edit.c g() {
        return (com.ss.android.ugc.aweme.story.edit.c) this.f136900g.getValue();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89477);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, StoryEditModel storyEditModel) {
            l.d(activity, "");
            l.d(storyEditModel, "");
            Intent intent = new Intent(activity, StoryEditActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_edit_model", storyEditModel);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, 531);
            activity.overridePendingTransition(0, 0);
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f136904a = new d();

        static {
            Covode.recordClassIndex(89481);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.c invoke() {
            return new com.ss.android.ugc.aweme.story.edit.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    public final void finish() {
        setResult(10, new Intent());
        super.finish();
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

    static final class b extends m implements h.f.a.b<com.bytedance.o.n, z> {
        final /* synthetic */ StoryEditActivity this$0;

        static {
            Covode.recordClassIndex(89478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryEditActivity storyEditActivity) {
            super(1);
            this.this$0 = storyEditActivity;
        }

        public static final class a extends p<StoryEditActivity> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f136902a;

            static {
                Covode.recordClassIndex(89479);
            }

            public a(b bVar) {
                this.f136902a = bVar;
            }

            @Override // com.bytedance.o.p
            public final StoryEditActivity get(f fVar) {
                l.d(fVar, "");
                return this.f136902a.this$0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            l.d(nVar2, "");
            l.b(nVar2.a(StoryEditActivity.class, (String) null, (p) new a(this)), "");
            return z.f158842a;
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
        l.d(aVar, "");
        this.f136899f.add(aVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void c(com.ss.android.ugc.tools.view.a.a aVar) {
        l.d(aVar, "");
        this.f136899f.remove(aVar);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onCreate", true);
        g.a().u();
        super.onCreate(bundle);
        com.bytedance.als.dsl.g.a(this, new b(this));
        new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this)).a();
        i.a a2 = com.bytedance.scene.i.a(this, com.ss.android.ugc.aweme.story.edit.c.class);
        a2.f42898f = new c(this);
        Intent intent = getIntent();
        l.b(intent, "");
        a2.f42893a = a(intent);
        a2.f42897e = false;
        this.f136898e = a2.a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onCreate", false);
    }

    @Override // androidx.appcompat.app.d
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        for (com.ss.android.ugc.tools.view.a.a aVar : this.f136899f) {
            if (aVar.onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        com.ss.android.ugc.aweme.story.edit.business.shared.c cVar = (com.ss.android.ugc.aweme.story.edit.business.shared.c) g().a("StorySharedClipEditRootScene");
        if (cVar != null) {
            cVar.P();
        }
        return true;
    }

    static final class c implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryEditActivity f136903a;

        static {
            Covode.recordClassIndex(89480);
        }

        c(StoryEditActivity storyEditActivity) {
            this.f136903a = storyEditActivity;
        }

        @Override // com.bytedance.scene.l
        public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (!l.a((Object) str, (Object) com.ss.android.ugc.aweme.story.edit.c.class.getName())) {
                return null;
            }
            com.ss.android.ugc.aweme.story.edit.c g2 = this.f136903a.g();
            if (bundle == null) {
                bundle = new Bundle();
            }
            g2.r = bundle;
            return g2;
        }
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.ss.android.ugc.aweme.story.edit.business.shared.c cVar = (com.ss.android.ugc.aweme.story.edit.business.shared.c) g().a("StorySharedClipEditRootScene");
        if (cVar != null && intent != null && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("custom_sticker");
            if (parcelableExtra == null) {
                l.b();
            }
            Effect effect = (Effect) parcelableExtra;
            Parcelable parcelableExtra2 = intent.getParcelableExtra("custom_sticker_image_info");
            if (parcelableExtra2 == null) {
                l.b();
            }
            cVar.F().v().setValue(t.b(0));
            cVar.I().a(effect, ds.a(((CustomStickerInfo) parcelableExtra2).a()));
        }
    }
}
