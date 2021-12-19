package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.bytedance.scene.i;
import com.bytedance.scene.n;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ugc.asve.recorder.l;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.experiment.gt;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.port.internal.h;
import com.ss.android.ugc.aweme.property.bd;
import com.ss.android.ugc.aweme.property.bh;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.property.m;
import com.ss.android.ugc.aweme.property.o;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ch;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dc;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.shortvideo.record.as;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ac;
import com.ss.android.ugc.aweme.shortvideo.ui.f;
import com.ss.android.ugc.aweme.shortvideo.ui.ge;
import com.ss.android.ugc.aweme.shortvideo.ui.task.CacheChooseMediaViewHolderTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMusicListTask;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.aq;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.au;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bc;
import com.ss.android.ugc.aweme.shortvideo.x.k;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.sticker.d.e;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.aweme.utils.ce;
import com.ss.android.ugc.aweme.utils.fw;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.view.a.b;
import com.ss.android.ugc.tools.view.a.c;
import com.ss.android.vesdk.an;
import com.ss.ugc.aweme.performance.a.a;
import com.zhiliaoapp.musically.R;
import dmt.av.video.f.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class VideoRecordNewActivity extends ba implements h, w, l, m, n, c, i, j {
    public boolean A = false;
    a B;
    public String C;
    public ArrayList<StickerWrapper> D = new ArrayList<>();
    public long E;
    public z F;
    public m G;
    public com.ss.android.ugc.aweme.shortvideo.ui.a.i H;
    public com.bytedance.creativex.recorder.a.a.a I;
    public com.ss.android.ugc.gamora.recorder.sticker.c.j J;
    private List<b> K = new ArrayList();
    private List<com.ss.android.ugc.tools.view.a.a> L = new ArrayList();
    private FrameLayout M;
    private n N;
    private boolean O = false;
    private boolean P = false;
    private int Q;
    private boolean R;
    private boolean S;
    private com.ss.android.ugc.aweme.shortvideo.duet.n T;
    private com.ss.android.ugc.gamora.recorder.g.a U;
    private final Cif V = new Cif();
    private boolean W = false;

    /* renamed from: e  reason: collision with root package name */
    public final h.h<ApiCenter> f131226e = h.i.a((h.f.a.a) new fc(this));

    /* renamed from: f  reason: collision with root package name */
    public f f131227f;

    /* renamed from: g  reason: collision with root package name */
    public ShortVideoContext f131228g;

    /* renamed from: h  reason: collision with root package name */
    public SafeHandler f131229h = new SafeHandler(this);

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.x.m f131230i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f131231j;

    /* renamed from: k  reason: collision with root package name */
    public SurfaceView f131232k;

    /* renamed from: l  reason: collision with root package name */
    com.ss.android.ugc.aweme.view.b f131233l = null;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f131234m;
    public List<String> n;
    public Effect o;
    public ArrayList<GreenScreenMaterial> p = new ArrayList<>();
    boolean q;
    public String r;
    public String s;
    public com.ss.android.ugc.aweme.shortvideo.l.a t = new com.ss.android.ugc.aweme.shortvideo.l.a();
    public ch u;
    public ao v;
    Effect w;
    FrameLayout x;
    public volatile boolean y = true;
    boolean z;

    static {
        Covode.recordClassIndex(85968);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean bu_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(223, new g(VideoRecordNewActivity.class, "receiveToast", com.ss.android.ugc.aweme.sticker.types.unlock.c.class, ThreadMode.POSTING, 0, true));
        hashMap.put(224, new g(VideoRecordNewActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.h.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.n
    public final String m() {
        return "VideoRecordNewActivity";
    }

    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.l
    public final f j() {
        return this.f131227f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.m
    public final FrameLayout k() {
        return this.M;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.h
    public final k p() {
        return this.f131230i;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void g() {
        ao aoVar = this.v;
        if (aoVar != null) {
            aoVar.Z = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final boolean i() {
        ao aoVar = this.v;
        if (aoVar != null) {
            return aoVar.Z;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.m
    public final FrameLayout.LayoutParams l() {
        SurfaceView surfaceView = this.f131232k;
        if (surfaceView == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f131228g.aj) {
            w();
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new d());
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContextViewModel t() {
        return (ShortVideoContextViewModel) ae.a(this, (ad.b) null).a(ShortVideoContextViewModel.class);
    }

    public final void u() {
        m mVar = this.G;
        if (mVar != null) {
            mVar.b(false);
        }
    }

    private void z() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new com.bytedance.cukaie.closet.a((byte) 0).a(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a a() {
        ao aoVar = this.v;
        if (aoVar == null || aoVar.f42913m == null) {
            return new w.a(null, null);
        }
        return this.v.a();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final void d() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a e() {
        ao aoVar = this.v;
        if (aoVar == null || aoVar.f42913m == null) {
            return new w.a(null, null);
        }
        return this.v.e();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f131232k, this.f131228g.f124757b.f124708c, this.f131228g.f124757b.f124709d);
        ch chVar = this.u;
        if (chVar != null) {
            chVar.F();
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (!isFinishing() && getIntent().getBooleanExtra("auto_start_recording", false)) {
            this.G.z();
        }
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j r() {
        if (this.J == null) {
            this.J = (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f131227f.b(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, null);
        }
        return this.J;
    }

    public final com.bytedance.creativex.recorder.sticker.a.c s() {
        return (com.bytedance.creativex.recorder.sticker.a.c) this.f131226e.getValue().b(com.bytedance.creativex.recorder.sticker.a.c.class);
    }

    private boolean A() {
        boolean z2;
        if (this.f131228g.n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f131228g.aj || this.f131228g.ak || z2 || com.ss.android.ugc.aweme.setting.i.m.a()) {
            return false;
        }
        return true;
    }

    private void v() {
        this.F.D().a(new l(new com.ss.android.ugc.aweme.shortvideo.record.c(this.f131228g.f124757b.f124713h)), this.f131228g.f124757b.f124713h.e().getAbsolutePath());
        this.F.C();
    }

    private void w() {
        if (this.f131228g.aL == null) {
            if (Build.VERSION.SDK_INT < 28 || getWindow().getDecorView().getRootWindowInsets() != null) {
                this.F.D().getMediaController().a(0, ce.a((ViewGroup.MarginLayoutParams) this.f131232k.getLayoutParams(), getWindow(), this.R));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.analysis.b
    public final Analysis f() {
        if (super.f() == null) {
            return super.f();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.f131228g.q);
        hashMap.put("is_story_shoot", "0");
        return super.f().setExtraMap(hashMap);
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        com.bytedance.ies.dmt.ui.f.a.f33482a = false;
        this.P = false;
        ar.f132216a.b();
        b.a.f132249a.pause(this, "record", this.f131228g.r, this.f131228g.q);
        fw.a("tool_record_enter");
        a.C4076a.a().b("tool_record");
        com.ss.android.vesdk.runtime.d.b().a(1);
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        if (this.f131233l == null) {
            this.f131233l = b.C3836b.a(this, b.a.VISIBLE_AFTER_5S, fg.f131755a);
        }
        this.f131233l.setMessage(getString(R.string.fuh));
        this.f131233l.setCancelable(false);
        this.f131233l.setIndeterminate(true);
        this.f131233l.show();
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        MethodCollector.i(10271);
        if (isFinishing()) {
            MethodCollector.o(10271);
            return;
        }
        b.a.f132249a.step("av_video_record_init", "addFragment");
        q.a("addFragment PlanC");
        n nVar = this.N;
        if (nVar != null) {
            nVar.b();
            this.N = null;
            ((ViewGroup) findViewById(R.id.dj9)).removeAllViews();
        }
        ch a2 = a(getIntent());
        this.u = a2;
        ((dc) a2).f126453e = new gd(this);
        i.a a3 = com.bytedance.scene.i.a(this, ch.class);
        a3.f42897e = false;
        a3.f42898f = new fe(this);
        a3.f42894b = false;
        a3.f42895c = false;
        a3.f42896d = R.id.dj9;
        this.N = a3.a();
        MethodCollector.o(10271);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        u();
        com.ss.android.ugc.gamora.recorder.g.a aVar = this.U;
        if (!(aVar == null || aVar.a() == -1)) {
            long currentTimeMillis = System.currentTimeMillis() - this.U.a();
            if (currentTimeMillis < 10000) {
                this.V.a("click_close_camera", currentTimeMillis);
            }
            this.U.b();
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r5.equals("reuse_giphy_gif") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r5.equals("prop_reuse") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r6 = "prop_reuse";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void x() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.x():void");
    }

    private void y() {
        ArrayList<GreenScreenMaterial> arrayList;
        b.a.f132249a.step("av_video_record_init", "init stickerModule start");
        com.ss.android.ugc.gamora.recorder.sticker.c.h hVar = (com.ss.android.ugc.gamora.recorder.sticker.c.h) this.f131227f.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null);
        if (com.ss.android.ugc.aweme.sticker.p.g.a("gs_enable_tt_effect_page_filter", this.o) && com.ss.android.ugc.tools.utils.k.b(this.p) && (arrayList = this.p) != null) {
            ArrayList<com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j> arrayList2 = hVar.J;
            ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList, 10));
            for (T t2 : arrayList) {
                arrayList3.add(new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j(t2.getLocalPath(), 0, t2.getType(), t2.getResId(), t2.getAuthorName(), "prop_reuse"));
            }
            arrayList2.addAll(arrayList3);
        }
        hVar.a(new com.ss.android.ugc.aweme.sticker.presenter.g() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.AnonymousClass6 */

            static {
                Covode.recordClassIndex(85974);
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final void b() {
                VideoRecordNewActivity.this.G.a("sticker stop record");
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final boolean c() {
                if (VideoRecordNewActivity.this.f131228g != null && !com.ss.android.ugc.tools.utils.k.a(VideoRecordNewActivity.this.f131228g.f124757b.d())) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final boolean a() {
                if (VideoRecordNewActivity.this.u == null || VideoRecordNewActivity.this.u.G() == null || VideoRecordNewActivity.this.G == null) {
                    return true;
                }
                return VideoRecordNewActivity.this.G.c().f6468a.getValue().booleanValue();
            }
        });
        this.G.s().a(this, new fr(hVar));
        hVar.u().a(new e() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.AnonymousClass5 */

            static {
                Covode.recordClassIndex(85973);
            }

            @Override // com.ss.android.ugc.aweme.sticker.d.e
            public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.d dVar) {
                com.ss.android.ugc.aweme.tools.d.b.a(com.ss.android.ugc.aweme.tools.d.a.f139289a);
            }

            @Override // com.ss.android.ugc.aweme.sticker.d.e
            public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
                com.ss.android.ugc.aweme.tools.d.b.a(com.ss.android.ugc.aweme.tools.d.a.f139289a, aVar.f135378a.getName());
            }
        });
        List<Fragment> f2 = getSupportFragmentManager().f();
        if (com.bytedance.common.utility.h.b(f2)) {
            List<Fragment> a2 = aq.a(f2, fj.f131758a);
            if (com.bytedance.common.utility.h.b(a2)) {
                androidx.fragment.app.n a3 = getSupportFragmentManager().a();
                for (Fragment fragment : a2) {
                    a3.a(fragment);
                }
                a3.c();
            }
        }
        b.a.f132249a.step("av_video_record_init", "init stickerModule end");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void finish() {
        String a2 = a(getIntent(), "backurl");
        if (c(getIntent())) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService().a(((t) getIntent().getSerializableExtra("micro_app_info")).getAppId());
        }
        int intExtra = getIntent().getIntExtra("translation_type", 0);
        super.finish();
        if (this.u != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                u();
            } else {
                runOnUiThread(new fq(this));
            }
        }
        if (!TextUtils.isEmpty(a2) && !c(getIntent()) && !TextUtils.isEmpty(a2) && !TextUtils.equals("__BACKURL__", a2)) {
            try {
                Uri parse = Uri.parse(a2);
                Intent intent = new Intent();
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
                startActivityIfNeeded(intent, -1);
                moveTaskToBack(true);
            } catch (Exception unused) {
            }
        }
        if (intExtra == 3) {
            com.ss.android.ugc.aweme.j.a.b(this, 3);
        } else if (intExtra == 7) {
            com.ss.android.ugc.aweme.j.a.b(this, 7);
        } else if (intExtra == 8) {
            com.ss.android.ugc.aweme.j.a.b(this, 8);
        } else if (intExtra == 9) {
            com.ss.android.ugc.aweme.j.a.b(this, 9);
        } else if (intExtra == 5) {
            com.ss.android.ugc.aweme.j.a.b(this, 5);
        }
        cr.a().g();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        h.a();
        z();
        com.ss.android.ugc.aweme.shortvideo.n.b.f129514c.a();
        com.ss.android.ugc.aweme.port.in.c.f115629h.k().b();
        this.u = null;
        EventBus.a().b(this);
        ar.f132216a.a();
        com.ss.android.ugc.aweme.port.in.c.s.c();
        gr.b();
        AVExternalServiceImpl.a().publishService().setFromCommercialSoundPage(false);
        AVExternalServiceImpl.a().publishService().setHasOpenCommercialSoundPage(false);
        com.ss.android.ugc.aweme.port.in.g.a().o().b();
        AVCommerceServiceImpl.h().c();
        AVCommerceServiceImpl.h().g();
        b.a.f132249a.leave(this, "record");
        dmt.av.video.a.a();
        if (!this.W) {
            cr.a().d();
            this.W = false;
        }
        com.ss.android.ugc.aweme.shortvideo.p.c.a("normal").a("at_shoot_page");
        cr.a().f125303i = false;
        cr.a().f125304j = false;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", true);
        q.a("VideoRecordNewActivity => onResume start");
        super.onResume();
        if (this.f131228g.O) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.i());
        }
        a.C4076a.a().a("tool_record");
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        this.P = true;
        if (this.O) {
            com.ss.android.ugc.aweme.port.in.c.F.a(this, com.ss.android.ugc.aweme.port.in.c.F.a());
            this.O = false;
        }
        r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "resume_record").a("shoot_way", this.f131228g.r).a("creation_id", this.f131228g.q).a("enter_from", this.f131228g.x).a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
        q.a("VideoRecordNewActivity => onResume end");
        ar.f132216a.a(this, this.M);
        if (this.f131228g != null) {
            this.F.D().f(this.f131228g.f124757b.a());
            this.F.D().g(this.f131228g.f124757b.a());
        }
        boolean a2 = gs.a();
        boolean a3 = gt.a();
        if (a2 || a3) {
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(this, new fm(this));
        } else {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            if (!com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.i.a(applicationContext, true)) {
                bc.a(this, new fn(this), new fp(this));
            }
        }
        com.ss.android.vesdk.runtime.d.b().a(0);
        this.V.a("click_plus", System.currentTimeMillis() - getIntent().getLongExtra("extra_start_record_time", 0), true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
    }

    private static Bundle b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void c(com.ss.android.ugc.tools.view.a.a aVar) {
        this.L.remove(aVar);
    }

    private void c(boolean z2) {
        com.ss.android.ugc.gamora.recorder.i.a aVar = (com.ss.android.ugc.gamora.recorder.i.a) a(com.ss.android.ugc.gamora.recorder.i.a.class);
        if (aVar != null) {
            aVar.a(z2);
        }
    }

    public final <T> T a(Class<T> cls) {
        ch chVar = this.u;
        if (chVar == null) {
            return null;
        }
        return (T) chVar.E().b(cls, null);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
        this.L.add(aVar);
    }

    private static boolean c(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        this.K.remove(bVar);
    }

    private ch a(Intent intent) {
        if (intent == null) {
            ShortVideoContext shortVideoContext = this.f131228g;
            Intent intent2 = getIntent();
            this.F.D();
            return new ch(shortVideoContext, intent2, this.f131227f, fh.f131756a);
        }
        ShortVideoContext shortVideoContext2 = this.f131228g;
        this.F.D();
        return new ch(shortVideoContext2, intent, this.f131227f, fi.f131757a);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z2) {
        this.R = z2;
        ch chVar = this.u;
        if (chVar != null) {
            chVar.b(z2);
        }
        w();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.E = System.currentTimeMillis();
            com.ss.android.ugc.gamora.recorder.e.a aVar = (com.ss.android.ugc.gamora.recorder.e.a) a(com.ss.android.ugc.gamora.recorder.e.a.class);
            if (aVar != null) {
                aVar.dismissSuperEntranceEvent();
            }
            com.ss.android.ugc.gamora.recorder.e.a aVar2 = (com.ss.android.ugc.gamora.recorder.e.a) a(com.ss.android.ugc.gamora.recorder.e.a.class);
            if (aVar2 != null) {
                aVar2.dismissUploadPopEntranceEvent();
            }
            com.ss.android.ugc.gamora.recorder.e.a aVar3 = (com.ss.android.ugc.gamora.recorder.e.a) a(com.ss.android.ugc.gamora.recorder.e.a.class);
            if (aVar3 != null) {
                aVar3.dismissLivePopupEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.Q != configuration.screenWidthDp) {
            this.Q = configuration.screenWidthDp;
            com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f131232k, this.f131228g.f124757b.f124708c, this.f131228g.f124757b.f124709d);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        if (com.bytedance.ies.abmock.b.a().a(true, "disable_remove_fragment_inrecord_page", true)) {
            bundle.remove("android:support:fragments");
        }
        this.W = true;
        bundle.putParcelable("save_state_short_video_context", this.f131228g);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    @org.greenrobot.eventbus.r(b = true)
    public void receiveToast(com.ss.android.ugc.aweme.sticker.types.unlock.c cVar) {
        if (TextUtils.equals(cVar.f136178a, "sticker_unlocked")) {
            this.O = true;
            this.w = cVar.f136179b;
            if (this.P && !cVar.f136181d) {
                com.ss.android.ugc.aweme.port.in.c.F.a(this, com.ss.android.ugc.aweme.port.in.c.F.a());
                this.O = false;
            }
            EventBus.a().f(cVar);
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.a aVar) {
        this.L.add(0, aVar);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.h hVar) {
        ch chVar;
        if (bk.a() && this.f131228g.f124757b.h() > 0 && this.f131228g.f124757b.h() >= this.f131228g.f124757b.k() && (chVar = this.u) != null && chVar.E().a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null) != null && this.u.E().a((Type) com.ss.android.ugc.gamora.recorder.m.a.class, (String) null) != null) {
            ((com.ss.android.ugc.gamora.recorder.b.b) this.u.E().a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null)).updateBottomTab();
            ((com.ss.android.ugc.gamora.recorder.m.a) this.u.E().a((Type) com.ss.android.ugc.gamora.recorder.m.a.class, (String) null)).d();
        }
        if (hVar.f128593a != null) {
            this.f131228g.af.f124735c = hVar.f128593a;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        this.K.add(bVar);
    }

    private void a(Bundle bundle) {
        List<String> list;
        boolean z2;
        boolean z3;
        if (bundle != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            this.f131228g = shortVideoContext;
            if (!(shortVideoContext == null || shortVideoContext.ab == null)) {
                cr.a().e();
            }
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f131228g == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            q.a(sb.append(z3).toString());
        }
        if (this.f131228g == null) {
            com.ss.android.ugc.aweme.port.in.g.a().u();
            this.f131228g = dn.a(getIntent(), this);
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f131228g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            q.a(sb2.append(z2).toString());
        }
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            this.f131228g.n = (Effect) getIntent().getParcelableExtra("extra_mv_effect");
        }
        this.r = a(getIntent(), "extra_sticker_from");
        this.s = a(getIntent(), "grade_key");
        x();
        cr.a().f125299e = this.f131228g.r;
        com.ss.android.ugc.aweme.shortvideo.f.a.a(this.f131228g.q);
        com.ss.android.ugc.aweme.shortvideo.f.a.b(dv.f126646e);
        ShortVideoContextViewModel t2 = t();
        t2.f124769a = this.f131228g;
        t2.a(this.f131228g.Z);
        this.q = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.n = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        Effect effect = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.o = effect;
        if (effect != null && com.ss.android.ugc.aweme.sticker.p.g.a("gs_enable_tt_effect_page_filter", effect)) {
            ArrayList<GreenScreenMaterial> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("green_screen_material_list");
            this.p = parcelableArrayListExtra;
            this.f131228g.v = VideoPublishEditModel.getGiphyGifIds(parcelableArrayListExtra);
        }
        this.C = a(getIntent(), "update_effect_id");
        this.D = getIntent().getParcelableArrayListExtra("update_effect_extra");
        this.S = getIntent().getBooleanExtra("draft_music_legal", true);
        if (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f131228g.r) && this.o == null && ((list = this.n) == null || list.size() == 0)) {
            String a2 = com.ss.android.ugc.aweme.port.in.c.t.a((Context) this);
            if (!TextUtils.isEmpty(a2)) {
                ArrayList arrayList = new ArrayList();
                this.n = arrayList;
                arrayList.add(a2);
            }
        }
        if (!TextUtils.isEmpty(a(getIntent(), "star_atlas_object"))) {
            this.f131228g.af.f124735c = com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.f131228g.af.f124735c, a(getIntent(), "star_atlas_object"));
        }
        String a3 = a(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext2 = this.f131228g;
        if (a3 == null) {
            a3 = "original";
        }
        shortVideoContext2.f124765j = a3;
        com.ss.android.ugc.aweme.beauty.c.a();
    }

    @Override // androidx.fragment.app.e
    public void onNewIntent(Intent intent) {
        com.bytedance.creativex.recorder.b.a.t a2;
        com.ss.android.ugc.gamora.recorder.choosemusic.a aVar;
        MethodCollector.i(9773);
        super.onNewIntent(intent);
        q.a("VideoRecordNewActivity onNewIntent");
        com.ss.android.ugc.tools.d.a.c.a(this, intent, (Bundle) null);
        if (this.f131228g == null || !dmt.av.video.d.a.a(this)) {
            q.a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            MethodCollector.o(9773);
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z2 = false;
        if (intExtra == 1) {
            dn.a(intent, this.f131228g);
            v();
            com.ss.android.ugc.gamora.recorder.k.a aVar2 = (com.ss.android.ugc.gamora.recorder.k.a) a(com.ss.android.ugc.gamora.recorder.k.a.class);
            if (aVar2 != null) {
                aVar2.a(this.f131228g.n());
                aVar2.a(0);
            }
            if (this.u != null) {
                this.G.x();
            }
            this.H.a(true);
        } else if (intExtra == 2) {
            dn.b(intent, this.f131228g);
            v();
            if (this.u != null) {
                if (!this.f131228g.c() || this.f131228g.F.f124774b == null) {
                    a2 = com.bytedance.creativex.recorder.b.a.t.a((List<TimeSpeedModelExtension>) this.f131228g.f124757b.d(), this.f131228g.f124757b.h(), false);
                } else {
                    a2 = com.bytedance.creativex.recorder.b.a.t.a(this.f131228g.f124757b.d(), this.f131228g.f124757b.h(), this.f131228g.F.f124774b);
                }
                this.G.a(a2);
                com.ss.android.ugc.gamora.recorder.choosemusic.a aVar3 = (com.ss.android.ugc.gamora.recorder.choosemusic.a) this.f131226e.getValue().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
                if (aVar3 != null) {
                    aVar3.changeMusicUi();
                }
            }
            this.H.a(false);
        }
        if (this.f131228g.f124757b.e() == null && (aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.a) a(com.ss.android.ugc.gamora.recorder.choosemusic.a.class)) != null) {
            aVar.handleCancelMusicResultEvent();
        }
        z();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.q = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            q.a("VideoRecordNewActivity isClear");
            setIntent(intent);
            int intExtra2 = getIntent().getIntExtra("translation_type", 0);
            if (intExtra2 == 3) {
                com.ss.android.ugc.aweme.j.a.a(this, 3);
            } else if (intExtra2 == 7) {
                com.ss.android.ugc.aweme.j.a.a(this, 7);
            } else if (intExtra2 == 8) {
                com.ss.android.ugc.aweme.j.a.a(this, 8);
            } else if (intExtra2 == 9) {
                com.ss.android.ugc.aweme.j.a.a(this, 9);
            }
            z zVar = this.F;
            if (zVar != null) {
                zVar.a(com.ss.android.ugc.aweme.tools.i.NORMAL);
            }
            this.G.d(true);
            TEMonitorInvoker.nativeReset();
            if (r() != null) {
                r().o();
            }
            com.ss.android.ugc.aweme.port.in.c.C.r().c().a();
            a((Bundle) null);
            o();
        } else if (this.f131228g == null) {
            a((Bundle) null);
        }
        ShortVideoContext shortVideoContext = this.f131228g;
        if (booleanExtra2 || shortVideoContext.ah != null) {
            z2 = true;
        }
        shortVideoContext.ai = z2;
        if (this.q && s() != null) {
            s().a(true);
        }
        MethodCollector.o(9773);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z2) {
        ch chVar = this.u;
        if (chVar != null) {
            chVar.a(z2);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void onCreate(Bundle bundle) {
        long j2;
        String str;
        int i2;
        MethodCollector.i(10109);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", true);
        cr.a().d();
        b.a.f132249a.enter(this, "record");
        fw.a("tool_record_enter", bh.b(), (long) bh.c());
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        a(bundle);
        com.ss.android.ugc.aweme.port.in.g.a().o().a("record_page_create");
        q.a("VideoRecordNewActivity => onCreate start, creation: " + this.f131228g.q + " shootway: " + this.f131228g.r);
        b.a.f132249a.step("av_video_record_init", "init recorderModule start");
        com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f.a(this);
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null && cVar.getDuration() > 0) {
            this.f131228g.f124764i = cVar.getDuration();
        }
        com.ss.android.ugc.aweme.port.in.c.d();
        com.ss.android.ugc.asve.recorder.camera.b.f62211b = o.a();
        h.f.b.l.d(this, "");
        com.bytedance.als.dsl.f.a(this, ge.l.f131799a);
        com.bytedance.als.dsl.g.a(this, new ge.m(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.r.class, (String) null, (p) new ge.j(dVar, this));
        alsLogicContainer.a(z.class, com.ss.android.ugc.aweme.shortvideo.ui.a.r.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.shortvideo.w.n.class, (String) null, (p) new ge.k(dVar2, this));
        alsLogicContainer2.a(com.ss.android.ugc.aweme.shortvideo.w.m.class, com.ss.android.ugc.aweme.shortvideo.w.n.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.ad.class, (String) null, (p) new ge.c(dVar3));
        alsLogicContainer3.a(ac.class, com.ss.android.ugc.aweme.shortvideo.ui.a.ad.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar.f6461a;
        alsLogicContainer4.f6437d.a(com.bytedance.creativex.recorder.filter.d.a.class, (String) null, (p) new ge.d(dVar4));
        alsLogicContainer4.a(com.bytedance.creativex.recorder.filter.a.g.class, com.bytedance.creativex.recorder.filter.d.a.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar.f6461a;
        alsLogicContainer5.f6437d.a(com.bytedance.creativex.recorder.a.i.class, (String) null, (p) new ge.e(dVar5));
        alsLogicContainer5.a(com.bytedance.creativex.recorder.a.a.a.class, com.bytedance.creativex.recorder.a.i.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null, (p) new ge.f(dVar6));
        alsLogicContainer6.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, com.ss.android.ugc.gamora.recorder.sticker.c.h.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.h.class, (String) null, (p) new ge.g(dVar7));
        alsLogicContainer7.a(com.ss.android.ugc.aweme.shortvideo.ui.a.c.class, com.ss.android.ugc.aweme.shortvideo.ui.a.h.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar.f6461a;
        alsLogicContainer8.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.j.class, (String) null, (p) new ge.h(dVar8));
        alsLogicContainer8.a(com.ss.android.ugc.aweme.shortvideo.ui.a.i.class, com.ss.android.ugc.aweme.shortvideo.ui.a.j.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar.f6461a;
        alsLogicContainer9.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.e.class, (String) null, (p) new ge.i(dVar9));
        alsLogicContainer9.a(com.ss.android.ugc.aweme.shortvideo.ui.a.d.class, com.ss.android.ugc.aweme.shortvideo.ui.a.e.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.a.a.class, (String) null, (p) new ge.a(dVar10));
        alsLogicContainer10.a(com.ss.android.ugc.aweme.sticker.e.class, com.ss.android.ugc.gamora.recorder.sticker.a.a.class);
        com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer11 = bVar.f6461a;
        alsLogicContainer11.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.g.class, (String) null, (p) new ge.b(dVar11));
        alsLogicContainer11.a(com.ss.android.ugc.aweme.shortvideo.ui.a.f.class, com.ss.android.ugc.aweme.shortvideo.ui.a.g.class);
        bVar.a();
        this.f131227f = com.bytedance.als.dsl.c.a(this).f6438e;
        com.ss.android.ugc.aweme.port.in.g.a();
        this.F = (z) this.f131227f.a(z.class);
        this.G = (m) this.f131227f.a(m.class);
        this.H = (com.ss.android.ugc.aweme.shortvideo.ui.a.i) this.f131227f.a(com.ss.android.ugc.aweme.shortvideo.ui.a.i.class);
        this.f131230i = this.F.aq();
        this.f131232k = this.F.F();
        boolean a2 = new aa(this.f131228g).a();
        SafeHandler safeHandler = this.f131229h;
        fo foVar = new fo(this);
        if (a2) {
            j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        } else {
            j2 = 0;
        }
        safeHandler.postDelayed(foVar, j2);
        if (a2) {
            if (this.F.b()) {
                this.F.a(com.bytedance.bpea.store.a.a.d(), true);
            } else {
                this.F.a(false, com.bytedance.bpea.store.a.a.d(), true);
            }
        }
        this.F.h().a(this, new fy(this));
        this.F.q().a(this, new fz(this));
        ASCameraView D2 = this.F.D();
        if (this.f131228g.q == null) {
            str = "";
        } else {
            str = this.f131228g.q;
        }
        D2.setControllerCallback(new as(str));
        this.I = (com.bytedance.creativex.recorder.a.a.a) this.f131227f.a(com.bytedance.creativex.recorder.a.a.a.class);
        if (com.ss.android.ugc.aweme.shortvideo.duet.a.a(this.f131228g)) {
            com.ss.android.ugc.aweme.shortvideo.duet.n nVar = new com.ss.android.ugc.aweme.shortvideo.duet.n(this, this.F.D(), r(), this.f131230i, new com.ss.android.ugc.aweme.shortvideo.duet.aa(this, this.F), this.f131227f);
            this.T = nVar;
            nVar.a();
        }
        this.F.M().a(this, new ga(this));
        this.G.p().a(this, new gb(this));
        b.a.f132249a.step("av_video_record_init", "init recorderModule end");
        com.ss.android.ugc.aweme.port.in.c.C.d().e();
        cr.a().n = false;
        b.a.f132249a.step("av_video_record_init", "onCreate");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new d());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.h(this));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.f(this));
        com.ss.android.ugc.aweme.port.in.g.a();
        com.ss.android.ugc.aweme.property.h.a(this, m.c.f118586a);
        super.onCreate(bundle);
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        int intExtra = getIntent().getIntExtra("translation_type", 0);
        byte b2 = 7;
        if (intExtra == 3) {
            com.ss.android.ugc.aweme.j.a.a(this, 3);
        } else if (intExtra == 1) {
            com.ss.android.ugc.aweme.j.a.a(this, 1);
        } else if (intExtra == 6) {
            com.ss.android.ugc.aweme.j.a.a(this, 6);
        } else if (intExtra == 7) {
            com.ss.android.ugc.aweme.j.a.a(this, 7);
        } else if (intExtra == 8) {
            com.ss.android.ugc.aweme.j.a.a(this, 8);
        } else if (intExtra == 9) {
            com.ss.android.ugc.aweme.j.a.a(this, 9);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.cg);
        if (getResources().getConfiguration() != null) {
            i2 = getResources().getConfiguration().screenWidthDp;
        } else {
            i2 = 0;
        }
        this.Q = i2;
        if (!dmt.av.video.d.a.a(this)) {
            q.a("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
            MethodCollector.o(10109);
            return;
        }
        if (bd.a()) {
            b2 = 15;
        }
        an.a(b2);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.dqe);
        this.M = frameLayout;
        if (!this.S) {
            frameLayout.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(85969);
                }

                public final void run() {
                    new com.ss.android.ugc.aweme.tux.a.i.a(VideoRecordNewActivity.this).a(R.string.dcb).a();
                }
            });
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.c8s);
        this.f131231j = frameLayout2;
        frameLayout2.addView(this.F.D());
        y();
        this.f131228g.ap = getIntent().getIntExtra("tabs", 0);
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.b());
        au.a(this.f131228g);
        com.ss.android.ugc.aweme.port.in.c.f115624c.a("SHOOT");
        getLifecycle().a(AudioFocusManager.a.a(this));
        this.x = (FrameLayout) findViewById(R.id.c5v);
        if (intExtra != 1 || !AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().e()) {
            f.a(this, this.x, A(), !AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().e());
        } else {
            FrameLayout frameLayout3 = this.x;
            boolean A2 = A();
            h.f.b.l.d(this, "");
            h.f.b.l.d(frameLayout3, "");
            if (A2) {
                f.e eVar = new f.e(new f.c(this));
                androidx.b.a.a aVar = new androidx.b.a.a(this);
                f.f131741a = true;
                aVar.a(R.layout.f4, frameLayout3, new f.C3422f(eVar, frameLayout3));
            }
        }
        this.f131229h.post(new fd(this));
        com.ss.android.ugc.aweme.shortvideo.edit.w.f128061l = true;
        q.a("VideoRecordNewActivity => onCreate end");
        gr.a();
        this.f131228g.f124763h = a(getIntent(), "share_id");
        this.f131228g.B = a(getIntent(), "channel");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.e());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new b());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.a());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new com.ss.android.ugc.aweme.shortvideo.ui.task.c(this));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new PreloadMediaDataTask(getLifecycle(), this, System.currentTimeMillis()));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new PreloadMusicListTask(getLifecycle()));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new com.ss.android.ugc.aweme.shortvideo.ui.task.b(this));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new CacheChooseMediaViewHolderTask(this, getLifecycle()));
        b.a.f132249a.step("av_video_record_init", "onCreate end");
        this.F.I();
        if (com.ss.android.ugc.aweme.setting.i.m.a() && !getIntent().getBooleanExtra("auto_start_recording", false)) {
            o();
            this.y = false;
        }
        this.f131228g.aK = System.currentTimeMillis();
        com.ss.android.ugc.aweme.shortvideo.p.c.a("normal").a("at_shoot_page", false);
        String a3 = a(getIntent(), "session");
        String a4 = a(getIntent(), "host_uid");
        String a5 = a(getIntent(), "host_name");
        if (!(a3 == null || this.o == null)) {
            r().F().a(this.o);
            this.f131228g.a(true);
            SharedARModel sharedARModel = this.f131228g.S;
            if (sharedARModel != null) {
                sharedARModel.setSharedARSessionId(a3);
                sharedARModel.setSharedARMultiPlayerUserName(a5);
                sharedARModel.setSharedARMultiPlayerUserId(a4);
                q();
            }
        }
        r().F().b().observe(this, new ff(this));
        com.ss.android.ugc.aweme.poi_api.service.c.a().a(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
        MethodCollector.o(10109);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        for (com.ss.android.ugc.tools.view.a.a aVar : this.L) {
            if (aVar.onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.u != null) {
            com.bytedance.creativex.recorder.b.a.m mVar = this.G;
            if (!(mVar == null || mVar.c().f6468a.getValue().booleanValue())) {
                return true;
            }
            n nVar = this.N;
            if (nVar != null && nVar.a()) {
                return true;
            }
            com.ss.android.ugc.gamora.recorder.g.a aVar2 = (com.ss.android.ugc.gamora.recorder.g.a) this.u.E().b(com.ss.android.ugc.gamora.recorder.g.a.class, null);
            this.U = aVar2;
            if (aVar2 != null) {
                aVar2.a("system_back_button", System.currentTimeMillis());
            }
            return true;
        } else if (getIntent().hasExtra("stitch_params")) {
            return true;
        } else {
            return super.onKeyDown(i2, keyEvent);
        }
    }

    public final void a(boolean z2, boolean z3) {
        int i2;
        if (z2) {
            SurfaceView surfaceView = this.f131232k;
            int i3 = this.f131228g.f124757b.f124708c;
            int i4 = this.f131228g.f124757b.f124709d;
            if (surfaceView != null) {
                Context context = surfaceView.getContext();
                int e2 = dh.e(context);
                int b2 = dh.b(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (e2 * 9 < b2 * 16 || i3 >= i4) {
                    layoutParams.width = b2;
                    layoutParams.height = (i4 * b2) / i3;
                    layoutParams.topMargin = (e2 - layoutParams.height) / 2;
                    if (layoutParams.topMargin >= 0) {
                        i2 = layoutParams.topMargin;
                    } else {
                        i2 = 0;
                    }
                    layoutParams.topMargin = i2;
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.width = (i3 * e2) / i4;
                    layoutParams.height = e2;
                    layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
                    layoutParams.topMargin = 0;
                }
                int i5 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(layoutParams.leftMargin);
                surfaceView.setLayoutParams(layoutParams);
            }
            c(false);
        }
        if (z3) {
            cu_();
            c(true);
        }
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        boolean z2;
        for (com.ss.android.ugc.tools.view.a.b bVar : this.K) {
            if (bVar.a(i2, i3, intent)) {
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002 && i3 == -1) {
            ShortVideoContext shortVideoContext = this.f131228g;
            if (shortVideoContext == null || shortVideoContext.ah == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!(intent == null || b(intent) == null || z2)) {
                Intent intent2 = new Intent();
                intent2.setClass(this, com.ss.android.ugc.aweme.port.in.c.f115624c.e());
                intent2.addFlags(67108864);
                intent2.putExtras(b(intent));
                com.ss.android.ugc.tiktok.security.a.a.a(intent2, this);
                startActivity(intent2);
            }
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void a(boolean z2, MusicModel musicModel, String str) {
        ao aoVar = this.v;
        if (aoVar != null) {
            aoVar.a(z2, musicModel, str);
        }
    }
}
