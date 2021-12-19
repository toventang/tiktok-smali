package com.ss.android.ugc.aweme.ttep;

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
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.a.a;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.bytedance.scene.i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.experiment.gt;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.port.internal.h;
import com.ss.android.ugc.aweme.property.bd;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.property.m;
import com.ss.android.ugc.aweme.property.o;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ch;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dc;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.shortvideo.record.as;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.a.e;
import com.ss.android.ugc.aweme.shortvideo.ui.ba;
import com.ss.android.ugc.aweme.shortvideo.ui.l;
import com.ss.android.ugc.aweme.shortvideo.ui.m;
import com.ss.android.ugc.aweme.shortvideo.ui.n;
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
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.ttep.ab;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
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

public class TTEPEffectPreviewActivity extends ba implements h, w, l, m, n, c, i, j {
    public String A;
    public ArrayList<StickerWrapper> B = new ArrayList<>();
    public z C;
    public com.bytedance.creativex.recorder.b.a.m D;
    public com.ss.android.ugc.aweme.shortvideo.ui.a.i E;
    public a F;
    public com.ss.android.ugc.gamora.recorder.sticker.c.j G;
    private List<b> H = new ArrayList();
    private List<com.ss.android.ugc.tools.view.a.a> I = new ArrayList();
    private FrameLayout J;
    private com.bytedance.scene.n K;
    private boolean L = false;
    private boolean M = false;
    private int N;
    private com.ss.android.ugc.aweme.shortvideo.duet.n O;
    private boolean P = false;

    /* renamed from: e  reason: collision with root package name */
    public final h.h<ApiCenter> f141207e = h.i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    public f f141208f;

    /* renamed from: g  reason: collision with root package name */
    public ShortVideoContext f141209g;

    /* renamed from: h  reason: collision with root package name */
    public SafeHandler f141210h = new SafeHandler(this);

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.x.m f141211i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f141212j;

    /* renamed from: k  reason: collision with root package name */
    public SurfaceView f141213k;

    /* renamed from: l  reason: collision with root package name */
    public FrameLayout f141214l;

    /* renamed from: m  reason: collision with root package name */
    public List<String> f141215m;
    public Effect n;
    boolean o;
    public String p;
    public String q;
    public com.ss.android.ugc.aweme.shortvideo.l.a r = new com.ss.android.ugc.aweme.shortvideo.l.a();
    public ch s;
    public ao t;
    Effect u;
    FrameLayout v;
    public volatile boolean w = true;
    boolean x;
    public boolean y = false;
    com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a z;

    static {
        Covode.recordClassIndex(92202);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean bu_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(223, new g(TTEPEffectPreviewActivity.class, "receiveToast", com.ss.android.ugc.aweme.sticker.types.unlock.c.class, ThreadMode.POSTING, 0, true));
        hashMap.put(224, new g(TTEPEffectPreviewActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.h.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.n
    public final String m() {
        return "TTEPEffectPreviewActivity";
    }

    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.l
    public final f j() {
        return this.f141208f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.m
    public final FrameLayout k() {
        return this.J;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.h
    public final k p() {
        return this.f141211i;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void g() {
        ao aoVar = this.t;
        if (aoVar != null) {
            aoVar.Z = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final boolean i() {
        ao aoVar = this.t;
        if (aoVar != null) {
            return aoVar.Z;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.m
    public final FrameLayout.LayoutParams l() {
        SurfaceView surfaceView = this.f141213k;
        if (surfaceView == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new d());
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContextViewModel s() {
        return (ShortVideoContextViewModel) ae.a(this, (ad.b) null).a(ShortVideoContextViewModel.class);
    }

    public final void t() {
        com.bytedance.creativex.recorder.b.a.m mVar = this.D;
        if (mVar != null) {
            mVar.b(false);
        }
    }

    private void w() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new com.bytedance.cukaie.closet.a((byte) 0).a(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a a() {
        ao aoVar = this.t;
        if (aoVar == null || aoVar.f42913m == null) {
            return new w.a(null, null);
        }
        return this.t.a();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final void d() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a e() {
        ao aoVar = this.t;
        if (aoVar == null || aoVar.f42913m == null) {
            return new w.a(null, null);
        }
        return this.t.e();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f141213k, this.f141209g.f124757b.f124708c, this.f141209g.f124757b.f124709d);
        ch chVar = this.s;
        if (chVar != null) {
            chVar.F();
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (!isFinishing() && getIntent().getBooleanExtra("auto_start_recording", false)) {
            this.D.z();
        }
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j q() {
        if (this.G == null) {
            this.G = (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f141208f.b(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, null);
        }
        return this.G;
    }

    public final com.bytedance.creativex.recorder.sticker.a.c r() {
        return (com.bytedance.creativex.recorder.sticker.a.c) this.f141207e.getValue().b(com.bytedance.creativex.recorder.sticker.a.c.class);
    }

    private void u() {
        this.C.D().a(new com.ss.android.ugc.asve.recorder.l(new com.ss.android.ugc.aweme.shortvideo.record.c(this.f141209g.f124757b.f124713h)), this.f141209g.f124757b.f124713h.e().getAbsolutePath());
        this.C.C();
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        com.bytedance.ies.dmt.ui.f.a.f33482a = false;
        this.M = false;
        ar.f132216a.b();
        b.a.f132249a.pause(this, "record", this.f141209g.r, this.f141209g.q);
        a.C4076a.a().b("tool_record");
        com.ss.android.vesdk.runtime.d.b().a(1);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        t();
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

    private void v() {
        if (this.f141209g.r != null) {
            String str = FaceStickerBean.sCurPropSource;
            String str2 = this.f141209g.r;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1731750228:
                    if (str2.equals("single_song")) {
                        str = "single_song";
                        break;
                    }
                    break;
                case -1098262888:
                    if (str2.equals("prop_reuse")) {
                        str = "prop_reuse";
                        break;
                    }
                    break;
                case 3449699:
                    if (str2.equals("prop")) {
                        str = "homepage_prop_maker";
                        break;
                    }
                    break;
                case 3524221:
                    if (str2.equals("scan")) {
                        str = "qr_code";
                        break;
                    }
                    break;
                case 669986889:
                    if (str2.equals("direct_shoot")) {
                        str = "direct_shoot";
                        break;
                    }
                    break;
                case 1402633315:
                    if (str2.equals("challenge")) {
                        str = "challenge";
                        break;
                    }
                    break;
            }
            FaceStickerBean.sCurPropSource = str;
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        MethodCollector.i(10813);
        if (isFinishing()) {
            MethodCollector.o(10813);
            return;
        }
        b.a.f132249a.step("av_video_record_init", "addFragment");
        q.a("addFragment PlanC");
        com.bytedance.scene.n nVar = this.K;
        if (nVar != null) {
            nVar.b();
            this.K = null;
            ((ViewGroup) findViewById(R.id.dj9)).removeAllViews();
        }
        ch a2 = a(getIntent());
        this.s = a2;
        ((dc) a2).f126453e = new aa(this);
        i.a a3 = com.bytedance.scene.i.a(this, ch.class);
        a3.f42897e = false;
        a3.f42898f = new d(this);
        a3.f42894b = false;
        a3.f42895c = false;
        a3.f42896d = R.id.dj9;
        this.K = a3.a();
        MethodCollector.o(10813);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.shortvideo.ui.h.a();
        w();
        com.ss.android.ugc.aweme.shortvideo.n.b.f129514c.a();
        com.ss.android.ugc.aweme.port.in.c.f115629h.k().b();
        this.s = null;
        EventBus.a().b(this);
        ar.f132216a.a();
        gr.b();
        AVExternalServiceImpl.a().publishService().setFromCommercialSoundPage(false);
        AVExternalServiceImpl.a().publishService().setHasOpenCommercialSoundPage(false);
        AVCommerceServiceImpl.h().c();
        AVCommerceServiceImpl.h().g();
        b.a.f132249a.leave(this, "record");
        dmt.av.video.a.a();
        if (!this.P) {
            cr.a().d();
            this.P = false;
        }
        com.ss.android.ugc.tools.d.a.c.a(this);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void finish() {
        String a2 = a(getIntent(), "backurl");
        if (c(getIntent())) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService().a(((t) getIntent().getSerializableExtra("micro_app_info")).getAppId());
        }
        super.finish();
        if (this.s != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                t();
            } else {
                runOnUiThread(new m(this));
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
        com.ss.android.ugc.aweme.j.a.b(this, 3);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", true);
        q.a("TTEPEffectPreviewActivity => onResume start");
        super.onResume();
        if (this.f141209g.O) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.i());
        }
        a.C4076a.a().a("tool_record");
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        this.M = true;
        if (this.L) {
            com.ss.android.ugc.aweme.port.in.c.F.a(this, com.ss.android.ugc.aweme.port.in.c.F.a());
            this.L = false;
        }
        r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "resume_record").a("shoot_way", this.f141209g.r).a("creation_id", this.f141209g.q).a("enter_from", this.f141209g.x).a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
        q.a("TTEPEffectPreviewActivity => onResume end");
        ar.f132216a.a(this, this.J);
        if (this.f141209g != null) {
            this.C.D().f(this.f141209g.f124757b.a());
            this.C.D().g(this.f141209g.f124757b.a());
        }
        boolean a2 = gs.a();
        boolean a3 = gt.a();
        if (a2 || a3) {
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(this, new j(this));
        } else {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            if (!com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.h.a(applicationContext, true)) {
                bc.a(this, new k(this), new l(this));
            }
        }
        com.ss.android.vesdk.runtime.d.b().a(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", false);
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
        this.I.remove(aVar);
    }

    private static boolean c(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        this.H.add(bVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
        this.I.add(aVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        this.H.remove(bVar);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        this.P = true;
        bundle.putParcelable("save_state_short_video_context", this.f141209g);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    private ch a(Intent intent) {
        if (intent == null) {
            ShortVideoContext shortVideoContext = this.f141209g;
            Intent intent2 = getIntent();
            this.C.D();
            return new ch(shortVideoContext, intent2, this.f141208f, e.f141333a);
        }
        ShortVideoContext shortVideoContext2 = this.f141209g;
        this.C.D();
        return new ch(shortVideoContext2, intent, this.f141208f, f.f141339a);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z2) {
        ch chVar = this.s;
        if (chVar != null) {
            chVar.b(z2);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            com.ss.android.ugc.gamora.recorder.e.a aVar = (com.ss.android.ugc.gamora.recorder.e.a) ApiCenter.a.a(this).b(com.ss.android.ugc.gamora.recorder.e.a.class);
            if (aVar != null) {
                aVar.dismissSuperEntranceEvent();
            }
            com.ss.android.ugc.gamora.recorder.e.a aVar2 = (com.ss.android.ugc.gamora.recorder.e.a) ApiCenter.a.a(this).b(com.ss.android.ugc.gamora.recorder.e.a.class);
            if (aVar2 != null) {
                aVar2.dismissUploadPopEntranceEvent();
            }
            com.ss.android.ugc.gamora.recorder.e.a aVar3 = (com.ss.android.ugc.gamora.recorder.e.a) ApiCenter.a.a(this).b(com.ss.android.ugc.gamora.recorder.e.a.class);
            if (aVar3 != null) {
                aVar3.dismissLivePopupEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.N != configuration.screenWidthDp) {
            this.N = configuration.screenWidthDp;
            com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f141213k, this.f141209g.f124757b.f124708c, this.f141209g.f124757b.f124709d);
        }
    }

    @org.greenrobot.eventbus.r(b = true)
    public void receiveToast(com.ss.android.ugc.aweme.sticker.types.unlock.c cVar) {
        if (TextUtils.equals(cVar.f136178a, "sticker_unlocked")) {
            this.L = true;
            this.u = cVar.f136179b;
            if (this.M && !cVar.f136181d) {
                com.ss.android.ugc.aweme.port.in.c.F.a(this, com.ss.android.ugc.aweme.port.in.c.F.a());
                this.L = false;
            }
            EventBus.a().f(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z2) {
        ch chVar = this.s;
        if (chVar != null) {
            chVar.a(z2);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.h hVar) {
        ch chVar;
        if (!(!bk.a() || (chVar = this.s) == null || chVar.E() == null || this.s.E().a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null) == null || this.s.E().a((Type) com.ss.android.ugc.gamora.recorder.m.a.class, (String) null) == null)) {
            ((com.ss.android.ugc.gamora.recorder.b.b) this.s.E().a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null)).updateBottomTab();
            ((com.ss.android.ugc.gamora.recorder.m.a) this.s.E().a((Type) com.ss.android.ugc.gamora.recorder.m.a.class, (String) null)).d();
        }
        if (hVar.f128593a != null) {
            this.f141209g.af.f124735c = hVar.f128593a;
        }
    }

    private void a(Bundle bundle) {
        List<String> list;
        boolean z2;
        boolean z3 = true;
        if (bundle != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            this.f141209g = shortVideoContext;
            if (!(shortVideoContext == null || shortVideoContext.ab == null)) {
                cr.a().e();
            }
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f141209g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            q.a(sb.append(z2).toString());
        }
        if (this.f141209g == null) {
            com.ss.android.ugc.aweme.port.in.g.a().u();
            this.f141209g = dn.a(getIntent(), this);
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f141209g != null) {
                z3 = false;
            }
            q.a(sb2.append(z3).toString());
        }
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            this.f141209g.n = (Effect) getIntent().getParcelableExtra("extra_mv_effect");
        }
        this.p = a(getIntent(), "extra_sticker_from");
        this.q = a(getIntent(), "grade_key");
        v();
        cr.a().f125299e = this.f141209g.r;
        com.ss.android.ugc.aweme.shortvideo.f.a.a(this.f141209g.q);
        ShortVideoContextViewModel s2 = s();
        s2.f124769a = this.f141209g;
        s2.a(this.f141209g.Z);
        this.o = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.f141215m = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.n = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.A = a(getIntent(), "update_effect_id");
        this.B = getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f141209g.r) && this.n == null && ((list = this.f141215m) == null || list.size() == 0)) {
            String a2 = com.ss.android.ugc.aweme.port.in.c.t.a((Context) this);
            if (!TextUtils.isEmpty(a2)) {
                ArrayList arrayList = new ArrayList();
                this.f141215m = arrayList;
                arrayList.add(a2);
            }
        }
        if (!TextUtils.isEmpty(a(getIntent(), "star_atlas_object"))) {
            this.f141209g.af.f124735c = com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.f141209g.af.f124735c, a(getIntent(), "star_atlas_object"));
        }
        String a3 = a(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext2 = this.f141209g;
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
        MethodCollector.i(10798);
        super.onNewIntent(intent);
        q.a("TTEPEffectPreviewActivity onNewIntent");
        com.ss.android.ugc.tools.d.a.c.a(this, intent, (Bundle) null);
        if (this.f141209g == null || !dmt.av.video.d.a.a(this)) {
            q.a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            MethodCollector.o(10798);
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z2 = false;
        if (intExtra == 1) {
            dn.a(intent, this.f141209g);
            u();
            com.ss.android.ugc.gamora.recorder.k.a aVar2 = (com.ss.android.ugc.gamora.recorder.k.a) ApiCenter.a.a(this).b(com.ss.android.ugc.gamora.recorder.k.a.class);
            if (aVar2 != null) {
                aVar2.a(this.f141209g.n());
                aVar2.a(0);
            }
            if (this.s != null) {
                this.D.x();
            }
            this.E.a(true);
        } else if (intExtra == 2) {
            dn.b(intent, this.f141209g);
            u();
            if (this.s != null) {
                if (!this.f141209g.c() || this.f141209g.F.f124774b == null) {
                    a2 = com.bytedance.creativex.recorder.b.a.t.a((List<TimeSpeedModelExtension>) this.f141209g.f124757b.d(), this.f141209g.f124757b.h(), false);
                } else {
                    a2 = com.bytedance.creativex.recorder.b.a.t.a(this.f141209g.f124757b.d(), this.f141209g.f124757b.h(), this.f141209g.F.f124774b);
                }
                this.D.a(a2);
                com.ss.android.ugc.gamora.recorder.choosemusic.a aVar3 = (com.ss.android.ugc.gamora.recorder.choosemusic.a) this.f141207e.getValue().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
                if (aVar3 != null) {
                    aVar3.changeMusicUi();
                }
            }
            this.E.a(false);
        }
        if (this.f141209g.f124757b.e() == null && (aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.a) ApiCenter.a.a(this).b(com.ss.android.ugc.gamora.recorder.choosemusic.a.class)) != null) {
            aVar.handleCancelMusicResultEvent();
        }
        w();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.o = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            q.a("TTEPEffectPreviewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                com.ss.android.ugc.aweme.tools.a.a(this, 3);
            }
            z zVar = this.C;
            if (zVar != null) {
                zVar.a(com.ss.android.ugc.aweme.tools.i.NORMAL);
            }
            this.D.d(true);
            TEMonitorInvoker.nativeReset();
            if (q() != null) {
                q().o();
            }
            com.ss.android.ugc.aweme.port.in.c.C.r().c().a();
            a((Bundle) null);
            o();
        } else if (this.f141209g == null) {
            a((Bundle) null);
        }
        ShortVideoContext shortVideoContext = this.f141209g;
        if (booleanExtra2 || shortVideoContext.ah != null) {
            z2 = true;
        }
        shortVideoContext.ai = z2;
        if (this.o && r() != null) {
            r().a(true);
        }
        MethodCollector.o(10798);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void onCreate(Bundle bundle) {
        long j2;
        int i2;
        byte b2;
        boolean z2;
        boolean z3;
        MethodCollector.i(10809);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", true);
        cy.a.a();
        cr.a().d();
        b.a.f132249a.enter(this, "record");
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        a(bundle);
        b.a.f132249a.step("av_video_record_init", "init recorderModule start");
        com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f.a(this);
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null && cVar.getDuration() > 0) {
            this.f141209g.f124764i = cVar.getDuration();
        }
        com.ss.android.ugc.aweme.port.in.c.d();
        com.ss.android.ugc.asve.recorder.camera.b.f62211b = o.a();
        String str = "";
        h.f.b.l.d(this, str);
        com.bytedance.als.dsl.g.a(this, new ab.k(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.r.class, (String) null, (p) new ab.i(dVar, this));
        alsLogicContainer.a(z.class, com.ss.android.ugc.aweme.shortvideo.ui.a.r.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.shortvideo.w.n.class, (String) null, (p) new ab.j(dVar2, this));
        alsLogicContainer2.a(com.ss.android.ugc.aweme.shortvideo.w.m.class, com.ss.android.ugc.aweme.shortvideo.w.n.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(com.bytedance.creativex.recorder.filter.b.c.class, (String) null, (p) new ab.b(dVar3));
        alsLogicContainer3.a(com.bytedance.creativex.recorder.filter.a.a.class, com.bytedance.creativex.recorder.filter.b.c.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar.f6461a;
        alsLogicContainer4.f6437d.a(com.bytedance.creativex.recorder.filter.d.a.class, (String) null, (p) new ab.c(dVar4));
        alsLogicContainer4.a(com.bytedance.creativex.recorder.filter.a.g.class, com.bytedance.creativex.recorder.filter.d.a.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar.f6461a;
        alsLogicContainer5.f6437d.a(com.bytedance.creativex.recorder.a.i.class, (String) null, (p) new ab.d(dVar5));
        alsLogicContainer5.a(com.bytedance.creativex.recorder.a.a.a.class, com.bytedance.creativex.recorder.a.i.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null, (p) new ab.e(dVar6));
        alsLogicContainer6.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, com.ss.android.ugc.gamora.recorder.sticker.c.h.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.h.class, (String) null, (p) new ab.f(dVar7));
        alsLogicContainer7.a(com.ss.android.ugc.aweme.shortvideo.ui.a.c.class, com.ss.android.ugc.aweme.shortvideo.ui.a.h.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar.f6461a;
        alsLogicContainer8.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.j.class, (String) null, (p) new ab.g(dVar8));
        alsLogicContainer8.a(com.ss.android.ugc.aweme.shortvideo.ui.a.i.class, com.ss.android.ugc.aweme.shortvideo.ui.a.j.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar.f6461a;
        alsLogicContainer9.f6437d.a(e.class, (String) null, (p) new ab.h(dVar9));
        alsLogicContainer9.a(com.ss.android.ugc.aweme.shortvideo.ui.a.d.class, e.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.a.a.class, (String) null, (p) new ab.a(dVar10));
        alsLogicContainer10.a(com.ss.android.ugc.aweme.sticker.e.class, com.ss.android.ugc.gamora.recorder.sticker.a.a.class);
        bVar.a();
        this.f141208f = com.bytedance.als.dsl.c.a(this).f6438e;
        com.ss.android.ugc.aweme.port.in.g.a();
        this.C = (z) this.f141208f.a((Type) z.class, (String) null);
        this.D = (com.bytedance.creativex.recorder.b.a.m) this.f141208f.a((Type) com.bytedance.creativex.recorder.b.a.m.class, (String) null);
        this.E = (com.ss.android.ugc.aweme.shortvideo.ui.a.i) this.f141208f.a((Type) com.ss.android.ugc.aweme.shortvideo.ui.a.i.class, (String) null);
        this.f141211i = this.C.aq();
        this.f141213k = this.C.F();
        boolean a2 = new aa(this.f141209g).a();
        SafeHandler safeHandler = this.f141210h;
        n nVar = new n(this);
        if (a2) {
            j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        } else {
            j2 = 0;
        }
        safeHandler.postDelayed(nVar, j2);
        if (a2) {
            PrivacyCert build = PrivacyCert.Builder.with("bpea-131").usage(str).tag("TTEP preview function").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            if (this.C.b()) {
                this.C.a(build, true);
            } else {
                this.C.a(false, build, true);
            }
        }
        this.C.h().a(this, new v(this));
        this.C.q().a(this, new w(this));
        ASCameraView D2 = this.C.D();
        if (this.f141209g.q != null) {
            str = this.f141209g.q;
        }
        D2.setControllerCallback(new as(str));
        this.F = (com.bytedance.creativex.recorder.a.a.a) this.f141208f.a((Type) com.bytedance.creativex.recorder.a.a.a.class, (String) null);
        if (com.ss.android.ugc.aweme.shortvideo.duet.a.a(this.f141209g)) {
            com.ss.android.ugc.aweme.shortvideo.duet.n nVar2 = new com.ss.android.ugc.aweme.shortvideo.duet.n(this, this.C.D(), q(), this.f141211i, new com.ss.android.ugc.aweme.shortvideo.duet.aa(this, this.C), this.f141208f);
            this.O = nVar2;
            nVar2.a();
        }
        this.C.M().a(this, new x(this));
        this.D.p().a(this, new y(this));
        b.a.f132249a.step("av_video_record_init", "init recorderModule end");
        q.a("TTEPEffectPreviewActivity => onCreate start");
        cr.a().s = false;
        cr.a().n = false;
        b.a.f132249a.step("av_video_record_init", "onCreate");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new d());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.h(this));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.f(this));
        com.ss.android.ugc.aweme.port.in.g.a();
        com.ss.android.ugc.aweme.property.h.a(this, m.c.f118586a);
        super.onCreate(bundle);
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            com.ss.android.ugc.aweme.j.a.a(this, 3);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.cg);
        if (getResources().getConfiguration() != null) {
            i2 = getResources().getConfiguration().screenWidthDp;
        } else {
            i2 = 0;
        }
        this.N = i2;
        if (!dmt.av.video.d.a.a(this)) {
            q.a("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
            MethodCollector.o(10809);
            return;
        }
        if (bd.a()) {
            b2 = 15;
        } else {
            b2 = 7;
        }
        an.a(b2);
        this.J = (FrameLayout) findViewById(R.id.dqe);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c8s);
        this.f141212j = frameLayout;
        frameLayout.addView(this.C.D());
        b.a.f132249a.step("av_video_record_init", "init stickerModule start");
        com.ss.android.ugc.gamora.recorder.sticker.c.h hVar = (com.ss.android.ugc.gamora.recorder.sticker.c.h) this.f141208f.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null);
        hVar.a(new com.ss.android.ugc.aweme.sticker.presenter.g() {
            /* class com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.AnonymousClass5 */

            static {
                Covode.recordClassIndex(92207);
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final void b() {
                TTEPEffectPreviewActivity.this.D.a("sticker stop record");
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final boolean c() {
                if (TTEPEffectPreviewActivity.this.f141209g != null && !com.ss.android.ugc.tools.utils.k.a(TTEPEffectPreviewActivity.this.f141209g.f124757b.d())) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final boolean a() {
                if (TTEPEffectPreviewActivity.this.s == null || TTEPEffectPreviewActivity.this.s.G() == null || TTEPEffectPreviewActivity.this.D == null) {
                    return true;
                }
                return TTEPEffectPreviewActivity.this.D.c().f6468a.getValue().booleanValue();
            }
        });
        this.D.s().a(this, new o(hVar));
        hVar.u().a(new com.ss.android.ugc.aweme.sticker.d.e() {
            /* class com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.AnonymousClass4 */

            static {
                Covode.recordClassIndex(92206);
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
            List<Fragment> a3 = aq.a(f2, g.f141340a);
            if (com.bytedance.common.utility.h.b(a3)) {
                androidx.fragment.app.n a4 = getSupportFragmentManager().a();
                for (Fragment fragment : a3) {
                    a4.a(fragment);
                }
                a4.c();
            }
        }
        b.a.f132249a.step("av_video_record_init", "init stickerModule end");
        this.f141209g.ap = getIntent().getIntExtra("tabs", 0);
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.b());
        au.a(this.f141209g);
        com.ss.android.ugc.aweme.port.in.c.f115624c.a("SHOOT");
        getLifecycle().a(AudioFocusManager.a.a(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.c5v);
        this.v = frameLayout2;
        if (this.f141209g.n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f141209g.aj || this.f141209g.ak || z2 || com.ss.android.ugc.aweme.setting.i.m.a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        com.ss.android.ugc.aweme.shortvideo.ui.f.a(this, frameLayout2, z3, true);
        this.f141210h.post(new c(this));
        com.ss.android.ugc.aweme.shortvideo.edit.w.f128061l = true;
        q.a("TTEPEffectPreviewActivity => onCreate end");
        gr.a();
        this.f141209g.f124763h = a(getIntent(), "share_id");
        this.f141209g.B = a(getIntent(), "channel");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.e());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new com.ss.android.ugc.aweme.shortvideo.ui.b());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.a());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new com.ss.android.ugc.aweme.shortvideo.ui.task.c(this));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new PreloadMediaDataTask(getLifecycle(), this, System.currentTimeMillis()));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new PreloadMusicListTask(getLifecycle()));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new com.ss.android.ugc.aweme.shortvideo.ui.task.b(this));
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new CacheChooseMediaViewHolderTask(this, getLifecycle()));
        b.a.f132249a.step("av_video_record_init", "onCreate end");
        this.C.I();
        if (com.ss.android.ugc.aweme.setting.i.m.a() && !getIntent().getBooleanExtra("auto_start_recording", false)) {
            o();
            this.w = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
        MethodCollector.o(10809);
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
        com.ss.android.ugc.gamora.recorder.g.a aVar;
        for (com.ss.android.ugc.tools.view.a.a aVar2 : this.I) {
            if (aVar2.onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.s != null) {
            com.bytedance.creativex.recorder.b.a.m mVar = this.D;
            if (!(mVar == null || mVar.c().f6468a.getValue().booleanValue())) {
                return true;
            }
            com.bytedance.scene.n nVar = this.K;
            if ((nVar == null || !nVar.a()) && (aVar = (com.ss.android.ugc.gamora.recorder.g.a) this.s.E().b(com.ss.android.ugc.gamora.recorder.g.a.class, null)) != null) {
                aVar.a("system_back_button", System.currentTimeMillis());
            }
            return true;
        } else if (getIntent().hasExtra("stitch_params")) {
            return true;
        } else {
            return super.onKeyDown(i2, keyEvent);
        }
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        boolean z2;
        for (com.ss.android.ugc.tools.view.a.b bVar : this.H) {
            if (bVar.a(i2, i3, intent)) {
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002 && i3 == -1) {
            ShortVideoContext shortVideoContext = this.f141209g;
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
        ao aoVar = this.t;
        if (aoVar != null) {
            aoVar.a(z2, musicModel, str);
        }
    }
}
