package com.ss.android.ugc.gamora.recorder.sticker.support;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bef.effectsdk.view.BEFView;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.o.f;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import java.io.File;
import org.json.JSONObject;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148489a = {new y(b.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public BEFView f148490b;

    /* renamed from: c  reason: collision with root package name */
    public final e f148491c = ((e) getDiContainer().a(e.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    private final d f148492d = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: e  reason: collision with root package name */
    private final d f148493e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: f  reason: collision with root package name */
    private final h f148494f = h.i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final StickerSupportLogicComponent$lifecycleObserver$1 f148495g = new StickerSupportLogicComponent$lifecycleObserver$1(this);

    /* renamed from: h  reason: collision with root package name */
    private final f f148496h;

    static {
        Covode.recordClassIndex(97885);
    }

    private com.bytedance.creativex.recorder.b.a.d c() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f148492d.a(this, f148489a[0]);
    }

    /* access modifiers changed from: package-private */
    public final FrameLayout a() {
        return (FrameLayout) this.f148494f.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148496h;
    }

    static final class c extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.f148491c.findViewById(R.id.dja);
        }
    }

    public final void b() {
        long am = c().am();
        BEFView bEFView = this.f148490b;
        if (bEFView != null) {
            bEFView.attachEffect(am);
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        MethodCollector.i(11854);
        super.onDestroy();
        BEFView bEFView = this.f148490b;
        if (bEFView != null) {
            bEFView.onPause();
            a().removeView(bEFView);
            bEFView.onDestroy();
        }
        this.f148490b = null;
        this.f148491c.getLifecycle().b(this.f148495g);
        MethodCollector.o(11854);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        c().j().a(this, new a(this));
        ((com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f148493e.a(this, f148489a[1])).t().n().b().observe(this, new C4012b(this));
        this.f148491c.getLifecycle().a(this.f148495g);
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148497a;

        static {
            Covode.recordClassIndex(97886);
        }

        a(b bVar) {
            this.f148497a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f148497a.b();
            }
        }
    }

    static BEFView.FitMode a(int i2) {
        if (i2 == 0) {
            return BEFView.FitMode.FIT_WIDTH;
        }
        if (i2 == 1) {
            return BEFView.FitMode.FIT_HEIGHT;
        }
        if (i2 == 2) {
            return BEFView.FitMode.FILL_SCREEN;
        }
        if (i2 == 3) {
            return BEFView.FitMode.FIT_WIDTH_BOTTOM;
        }
        if (i2 != 4) {
            return null;
        }
        return BEFView.FitMode.NO_CLIP;
    }

    public b(f fVar) {
        l.d(fVar, "");
        this.f148496h = fVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.support.b$b  reason: collision with other inner class name */
    static final class C4012b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148498a;

        static {
            Covode.recordClassIndex(97887);
        }

        C4012b(b bVar) {
            this.f148498a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            MethodCollector.i(11851);
            EffectTemplate effectTemplate = (EffectTemplate) obj;
            b bVar = this.f148498a;
            BEFView bEFView = bVar.f148490b;
            if (bEFView != null) {
                bEFView.setStickerPath("");
            }
            BEFView bEFView2 = bVar.f148490b;
            if (bEFView2 != null) {
                bEFView2.onPause();
                bVar.a().removeView(bEFView2);
                bEFView2.onDestroy();
            }
            bVar.f148490b = null;
            if (effectTemplate != null && !TextUtils.isEmpty(effectTemplate.getSdkExtra())) {
                try {
                    JSONObject jSONObject = new JSONObject(effectTemplate.getSdkExtra());
                    String optString = jSONObject.optString("befViewResRoot");
                    if (!TextUtils.isEmpty(optString)) {
                        e eVar = bVar.f148491c;
                        double optDouble = jSONObject.optDouble("befViewRenderFPS");
                        int optInt = jSONObject.optInt("befViewFitMode", -1);
                        int[] g2 = com.ss.android.ugc.aweme.property.b.g();
                        BEFView.Builder obtain = BEFView.Builder.obtain();
                        if (g2 != null && g2.length >= 2) {
                            obtain = obtain.setRenderSize(g2[0], g2[1]);
                        }
                        if (!Double.isNaN(optDouble)) {
                            obtain = obtain.setFPS(optDouble);
                        }
                        if (b.a(optInt) != null) {
                            obtain = obtain.setFitMode(b.a(optInt));
                        }
                        bVar.f148490b = obtain.build(eVar);
                        BEFView bEFView3 = bVar.f148490b;
                        if (bEFView3 != null) {
                            bEFView3.setOpaque(false);
                        }
                        bVar.b();
                        bVar.a().addView(bVar.f148490b);
                        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(bVar.f148490b, 576, 1024);
                        String str = effectTemplate.getUnzipPath() + File.separator + optString;
                        BEFView bEFView4 = bVar.f148490b;
                        if (bEFView4 != null) {
                            bEFView4.setStickerPath(str);
                            MethodCollector.o(11851);
                            return;
                        }
                        MethodCollector.o(11851);
                        return;
                    }
                } catch (Exception e2) {
                    q.b("fail to get sticker support resource path from sticker.sdkExtra");
                    e2.printStackTrace();
                }
            }
            MethodCollector.o(11851);
        }
    }
}
