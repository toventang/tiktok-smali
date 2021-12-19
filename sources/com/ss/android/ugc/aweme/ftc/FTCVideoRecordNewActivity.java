package com.ss.android.ugc.aweme.ftc;

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
import com.bytedance.creativex.recorder.a.a.a;
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
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.experiment.gt;
import com.ss.android.ugc.aweme.ftc.ab;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.port.internal.h;
import com.ss.android.ugc.aweme.property.bd;
import com.ss.android.ugc.aweme.property.o;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ac;
import com.ss.android.ugc.aweme.shortvideo.ui.a.e;
import com.ss.android.ugc.aweme.shortvideo.ui.ba;
import com.ss.android.ugc.aweme.shortvideo.util.aq;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.au;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bc;
import com.ss.android.ugc.aweme.shortvideo.x.k;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.ce;
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

public class FTCVideoRecordNewActivity extends ba implements h, c, i, j {
    public z A;
    public m B;
    public com.ss.android.ugc.aweme.shortvideo.ui.a.i C;
    public a D;
    com.ss.android.ugc.gamora.recorder.sticker.c.j E;
    private List<b> F = new ArrayList();
    private List<com.ss.android.ugc.tools.view.a.a> G = new ArrayList();
    private n H;
    private boolean I = false;
    private boolean J = false;
    private int K;
    private boolean L;

    /* renamed from: e  reason: collision with root package name */
    public final h.h<ApiCenter> f97379e = h.i.a((h.f.a.a) new g(this));

    /* renamed from: f  reason: collision with root package name */
    public f f97380f;

    /* renamed from: g  reason: collision with root package name */
    public ShortVideoContext f97381g;

    /* renamed from: h  reason: collision with root package name */
    public SafeHandler f97382h = new SafeHandler(this);

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.x.m f97383i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f97384j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f97385k;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceView f97386l;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f97387m;
    public List<String> n;
    public Effect o;
    boolean p;
    public String q;
    public String r;
    public com.ss.android.ugc.aweme.shortvideo.l.a s = new com.ss.android.ugc.aweme.shortvideo.l.a();
    public c t;
    Effect u;
    FrameLayout v;
    public volatile boolean w = true;
    boolean x;
    public String y;
    public ArrayList<StickerWrapper> z = new ArrayList<>();

    static {
        Covode.recordClassIndex(61860);
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
        hashMap.put(223, new g(FTCVideoRecordNewActivity.class, "receiveToast", com.ss.android.ugc.aweme.sticker.types.unlock.c.class, ThreadMode.POSTING, 0, true));
        hashMap.put(212, new g(FTCVideoRecordNewActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.h
    public final k p() {
        return this.f97383i;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    public final com.bytedance.creativex.recorder.filter.a.a l() {
        return (com.bytedance.creativex.recorder.filter.a.a) this.f97380f.a((Type) com.bytedance.creativex.recorder.filter.a.a.class, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContextViewModel o() {
        return (ShortVideoContextViewModel) ae.a(this, (ad.b) null).a(ShortVideoContextViewModel.class);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new d());
    }

    public final void q() {
        m mVar = this.B;
        if (mVar != null) {
            mVar.b(false);
        }
    }

    private void t() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new com.bytedance.cukaie.closet.a((byte) 0).a(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final void d() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f97386l, this.f97381g.f124757b.f124708c, this.f97381g.f124757b.f124709d);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (!isFinishing() && getIntent().getBooleanExtra("auto_start_recording", false)) {
            this.B.z();
        }
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j m() {
        if (this.E == null) {
            this.E = (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f97380f.b(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, null);
        }
        return this.E;
    }

    public final com.bytedance.creativex.recorder.sticker.a.c n() {
        return (com.bytedance.creativex.recorder.sticker.a.c) this.f97379e.getValue().b(com.bytedance.creativex.recorder.sticker.a.c.class);
    }

    private void r() {
        this.A.D().a(new l(new com.ss.android.ugc.aweme.shortvideo.record.c(this.f97381g.f124757b.f124713h)), this.f97381g.f124757b.f124713h.e().getAbsolutePath());
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.shortvideo.ui.h.a();
        t();
        com.ss.android.ugc.aweme.port.in.c.f115629h.k().b();
        this.t = null;
        EventBus.a().b(this);
        ar.f132216a.a();
        gr.b();
        cr.a().g();
        b.a.f132249a.leave(this, "record");
        dmt.av.video.a.a();
        com.ss.android.ugc.tools.d.a.c.a(this);
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        com.bytedance.ies.dmt.ui.f.a.f33482a = false;
        this.J = false;
        ar.f132216a.b();
        b.a.f132249a.pause(this, "record", this.f97381g.r, this.f97381g.q);
        a.C4076a.a().b("tool_record");
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        q();
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

    private void s() {
        if (this.f97381g.r != null) {
            String str = FaceStickerBean.sCurPropSource;
            String str2 = this.f97381g.r;
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
    public final void k() {
        MethodCollector.i(13305);
        if (isFinishing()) {
            MethodCollector.o(13305);
            return;
        }
        b.a.f132249a.step("av_video_record_init", "addFragment");
        q.a("addFragment PlanC");
        n nVar = this.H;
        if (nVar != null) {
            nVar.b();
            this.H = null;
            ((ViewGroup) findViewById(R.id.dj9)).removeAllViews();
        }
        c a2 = a(getIntent());
        this.t = a2;
        ((d) a2).f98406e = new x(this);
        i.a a3 = com.bytedance.scene.i.a(this, c.class);
        a3.f42897e = false;
        a3.f42898f = new y(this);
        a3.f42894b = false;
        a3.f42895c = false;
        a3.f42896d = R.id.dj9;
        this.H = a3.a();
        MethodCollector.o(13305);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f97381g.aj && this.f97381g.aL == null) {
            if (Build.VERSION.SDK_INT < 28 || getWindow().getDecorView().getRootWindowInsets() != null) {
                this.A.D().getMediaController().a(0, ce.a((ViewGroup.MarginLayoutParams) this.f97386l.getLayoutParams(), getWindow(), this.L));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void finish() {
        String a2 = a(getIntent(), "backurl");
        if (c(getIntent())) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService().a(((t) getIntent().getSerializableExtra("micro_app_info")).getAppId());
        }
        super.finish();
        if (this.t != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                q();
            } else {
                runOnUiThread(new n(this));
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", true);
        q.a("VideoRecordNewActivity => onResume start");
        super.onResume();
        a.C4076a.a().a("tool_record");
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        this.J = true;
        if (this.I) {
            com.ss.android.ugc.aweme.port.in.c.F.a(this, com.ss.android.ugc.aweme.port.in.c.F.a());
            this.I = false;
        }
        r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "resume_record").a("shoot_way", this.f97381g.r).a("creation_id", this.f97381g.q).a("enter_from", this.f97381g.x).a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
        q.a("VideoRecordNewActivity => onResume end");
        ar.f132216a.a(this, this.f97384j);
        if (this.f97381g != null) {
            this.A.D().f(this.f97381g.f124757b.a());
        }
        boolean a2 = gs.a();
        boolean a3 = gt.a();
        if (a2 || a3) {
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(this, new k(this));
        } else {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            if (!com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.i.a(applicationContext, true)) {
                bc.a(this, new l(this), new m(this));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", false);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.c cVar) {
        finish();
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
        this.G.remove(aVar);
    }

    private static boolean c(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        this.F.add(bVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
        this.G.add(aVar);
    }

    private c a(Intent intent) {
        if (intent == null) {
            ShortVideoContext shortVideoContext = this.f97381g;
            Intent intent2 = getIntent();
            this.A.D();
            return new c(shortVideoContext, intent2);
        }
        ShortVideoContext shortVideoContext2 = this.f97381g;
        this.A.D();
        return new c(shortVideoContext2, intent);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        this.F.remove(bVar);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        bundle.putParcelable("save_state_short_video_context", this.f97381g);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.h.a F2;
        c cVar = this.t;
        if (cVar != null && (F2 = cVar.F()) != null) {
            F2.d(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.h.a F2;
        this.L = z2;
        c cVar = this.t;
        if (cVar != null && (F2 = cVar.F()) != null) {
            F2.c(z2);
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
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.K != configuration.screenWidthDp) {
            this.K = configuration.screenWidthDp;
            com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f97386l, this.f97381g.f124757b.f124708c, this.f97381g.f124757b.f124709d);
        }
    }

    @org.greenrobot.eventbus.r(b = true)
    public void receiveToast(com.ss.android.ugc.aweme.sticker.types.unlock.c cVar) {
        if (TextUtils.equals(cVar.f136178a, "sticker_unlocked")) {
            this.I = true;
            this.u = cVar.f136179b;
            if (this.J && !cVar.f136181d) {
                com.ss.android.ugc.aweme.port.in.c.F.a(this, com.ss.android.ugc.aweme.port.in.c.F.a());
                this.I = false;
            }
            EventBus.a().f(cVar);
        }
    }

    private void a(Bundle bundle) {
        List<String> list;
        boolean z2;
        boolean z3 = true;
        if (bundle != null) {
            this.f97381g = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f97381g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            q.a(sb.append(z2).toString());
        }
        if (this.f97381g == null) {
            com.ss.android.ugc.aweme.port.in.g.a().u();
            this.f97381g = dn.a(getIntent(), this);
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f97381g != null) {
                z3 = false;
            }
            q.a(sb2.append(z3).toString());
        }
        this.q = a(getIntent(), "extra_sticker_from");
        this.r = a(getIntent(), "grade_key");
        s();
        cr.a().f125299e = this.f97381g.r;
        com.ss.android.ugc.aweme.shortvideo.f.a.a(this.f97381g.q);
        ShortVideoContextViewModel o2 = o();
        o2.f124769a = this.f97381g;
        o2.a(this.f97381g.Z);
        this.p = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.n = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.o = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.y = a(getIntent(), "update_effect_id");
        this.z = getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f97381g.r) && this.o == null && ((list = this.n) == null || list.size() == 0)) {
            String a2 = com.ss.android.ugc.aweme.port.in.c.t.a((Context) this);
            if (!TextUtils.isEmpty(a2)) {
                ArrayList arrayList = new ArrayList();
                this.n = arrayList;
                arrayList.add(a2);
            }
        }
        if (!TextUtils.isEmpty(a(getIntent(), "star_atlas_object"))) {
            this.f97381g.af.f124735c = com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.f97381g.af.f124735c, a(getIntent(), "star_atlas_object"));
        }
        String a3 = a(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext = this.f97381g;
        if (a3 == null) {
            a3 = "original";
        }
        shortVideoContext.f124765j = a3;
        com.ss.android.ugc.aweme.beauty.c.a();
    }

    @Override // androidx.fragment.app.e
    public void onNewIntent(Intent intent) {
        com.bytedance.creativex.recorder.b.a.t a2;
        com.ss.android.ugc.aweme.ftc.b.a aVar;
        MethodCollector.i(12228);
        super.onNewIntent(intent);
        q.a("VideoRecordNewActivity onNewIntent");
        com.ss.android.ugc.tools.d.a.c.a(this, intent, (Bundle) null);
        if (this.f97381g == null || !dmt.av.video.d.a.a(this)) {
            q.a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            MethodCollector.o(12228);
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z2 = false;
        if (intExtra == 1) {
            dn.a(intent, this.f97381g);
            r();
            com.ss.android.ugc.aweme.ftc.h.a aVar2 = (com.ss.android.ugc.aweme.ftc.h.a) ApiCenter.a.a(this).b(com.ss.android.ugc.aweme.ftc.h.a.class);
            if (aVar2 != null) {
                aVar2.a(this.f97381g.n());
                aVar2.a(0);
            }
            if (this.t != null) {
                this.B.x();
            }
            this.C.a(true);
        } else if (intExtra == 2) {
            dn.b(intent, this.f97381g);
            r();
            if (this.t != null) {
                if (!this.f97381g.c() || this.f97381g.F.f124774b == null) {
                    a2 = com.bytedance.creativex.recorder.b.a.t.a((List<TimeSpeedModelExtension>) this.f97381g.f124757b.d(), this.f97381g.f124757b.h(), false);
                } else {
                    a2 = com.bytedance.creativex.recorder.b.a.t.a(this.f97381g.f124757b.d(), this.f97381g.f124757b.h(), this.f97381g.F.f124774b);
                }
                this.B.a(a2);
                com.ss.android.ugc.aweme.ftc.b.a aVar3 = (com.ss.android.ugc.aweme.ftc.b.a) this.f97379e.getValue().b(com.ss.android.ugc.aweme.ftc.b.a.class);
                if (aVar3 != null) {
                    aVar3.d();
                }
            }
            this.C.a(false);
        }
        if (this.f97381g.f124757b.e() == null && (aVar = (com.ss.android.ugc.aweme.ftc.b.a) ApiCenter.a.a(this).b(com.ss.android.ugc.aweme.ftc.b.a.class)) != null) {
            aVar.c();
        }
        t();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.p = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            q.a("VideoRecordNewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                com.ss.android.ugc.aweme.j.a.a(this, 3);
            }
            z zVar = this.A;
            if (zVar != null) {
                zVar.a(com.ss.android.ugc.aweme.tools.i.NORMAL);
            }
            this.B.d(true);
            TEMonitorInvoker.nativeReset();
            if (m() != null) {
                m().o();
            }
            com.ss.android.ugc.aweme.port.in.c.C.r().c().a();
            a((Bundle) null);
            k();
        } else if (this.f97381g == null) {
            a((Bundle) null);
        }
        this.A.I();
        ShortVideoContext shortVideoContext = this.f97381g;
        if (booleanExtra2 || shortVideoContext.ah != null) {
            z2 = true;
        }
        shortVideoContext.ai = z2;
        if (this.p && n() != null) {
            n().a(true);
        }
        MethodCollector.o(12228);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.ui.ba
    public void onCreate(Bundle bundle) {
        int i2;
        byte b2;
        boolean z2;
        boolean z3;
        MethodCollector.i(13234);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", true);
        b.a.f132249a.enter(this, "record");
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        a(bundle);
        com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f.a(this);
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null && cVar.getDuration() > 0) {
            this.f97381g.f124764i = cVar.getDuration();
        }
        com.ss.android.ugc.asve.recorder.camera.b.f62211b = o.a();
        h.f.b.l.d(this, "");
        com.bytedance.als.dsl.g.a(this, new ab.l(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.r.class, (String) null, (p) new ab.j(dVar, this));
        alsLogicContainer.a(z.class, com.ss.android.ugc.aweme.shortvideo.ui.a.r.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.shortvideo.w.n.class, (String) null, (p) new ab.k(dVar2, this));
        alsLogicContainer2.a(com.ss.android.ugc.aweme.shortvideo.w.m.class, com.ss.android.ugc.aweme.shortvideo.w.n.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.ad.class, (String) null, (p) new ab.c(dVar3));
        alsLogicContainer3.a(ac.class, com.ss.android.ugc.aweme.shortvideo.ui.a.ad.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar.f6461a;
        alsLogicContainer4.f6437d.a(com.bytedance.creativex.recorder.filter.d.a.class, (String) null, (p) new ab.d(dVar4));
        alsLogicContainer4.a(com.bytedance.creativex.recorder.filter.a.g.class, com.bytedance.creativex.recorder.filter.d.a.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar.f6461a;
        alsLogicContainer5.f6437d.a(com.bytedance.creativex.recorder.a.i.class, (String) null, (p) new ab.e(dVar5));
        alsLogicContainer5.a(com.bytedance.creativex.recorder.a.a.a.class, com.bytedance.creativex.recorder.a.i.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null, (p) new ab.f(dVar6));
        alsLogicContainer6.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, com.ss.android.ugc.gamora.recorder.sticker.c.h.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.h.class, (String) null, (p) new ab.g(dVar7));
        alsLogicContainer7.a(com.ss.android.ugc.aweme.shortvideo.ui.a.c.class, com.ss.android.ugc.aweme.shortvideo.ui.a.h.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar.f6461a;
        alsLogicContainer8.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.j.class, (String) null, (p) new ab.h(dVar8));
        alsLogicContainer8.a(com.ss.android.ugc.aweme.shortvideo.ui.a.i.class, com.ss.android.ugc.aweme.shortvideo.ui.a.j.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar.f6461a;
        alsLogicContainer9.f6437d.a(e.class, (String) null, (p) new ab.i(dVar9));
        alsLogicContainer9.a(com.ss.android.ugc.aweme.shortvideo.ui.a.d.class, e.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.a.a.class, (String) null, (p) new ab.a(dVar10));
        alsLogicContainer10.a(com.ss.android.ugc.aweme.sticker.e.class, com.ss.android.ugc.gamora.recorder.sticker.a.a.class);
        com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer11 = bVar.f6461a;
        alsLogicContainer11.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.g.class, (String) null, (p) new ab.b(dVar11));
        alsLogicContainer11.a(com.ss.android.ugc.aweme.shortvideo.ui.a.f.class, com.ss.android.ugc.aweme.shortvideo.ui.a.g.class);
        bVar.a();
        this.f97380f = com.bytedance.als.dsl.c.a(this).f6438e;
        com.ss.android.ugc.aweme.port.in.g.a();
        this.A = (z) this.f97380f.a((Type) z.class, (String) null);
        this.B = (m) this.f97380f.a((Type) m.class, (String) null);
        this.C = (com.ss.android.ugc.aweme.shortvideo.ui.a.i) this.f97380f.a((Type) com.ss.android.ugc.aweme.shortvideo.ui.a.i.class, (String) null);
        this.f97383i = this.A.aq();
        this.f97386l = this.A.F();
        this.f97382h.postDelayed(new s(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.A.h().a(this, new t(this));
        this.A.q().a(this, new u(this));
        this.B.p().a(this, new v(this));
        this.D = (com.bytedance.creativex.recorder.a.a.a) this.f97380f.a((Type) com.bytedance.creativex.recorder.a.a.a.class, (String) null);
        q.a("VideoRecordNewActivity => onCreate start");
        cr.a().s = false;
        b.a.f132249a.step("av_video_record_init", "onCreate");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new d());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.h(this));
        super.onCreate(bundle);
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            com.ss.android.ugc.aweme.j.a.a(this, 3);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.a2x);
        if (getResources().getConfiguration() != null) {
            i2 = getResources().getConfiguration().screenWidthDp;
        } else {
            i2 = 0;
        }
        this.K = i2;
        if (!dmt.av.video.d.a.a(this)) {
            q.a("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
            MethodCollector.o(13234);
            return;
        }
        if (bd.a()) {
            b2 = 15;
        } else {
            b2 = 7;
        }
        an.a(b2);
        this.f97384j = (FrameLayout) findViewById(R.id.dqe);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c8s);
        this.f97385k = frameLayout;
        frameLayout.addView(this.A.D());
        com.ss.android.ugc.gamora.recorder.sticker.c.h hVar = (com.ss.android.ugc.gamora.recorder.sticker.c.h) this.f97380f.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null);
        hVar.a(new com.ss.android.ugc.aweme.sticker.presenter.g() {
            /* class com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.AnonymousClass3 */

            static {
                Covode.recordClassIndex(61863);
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final void b() {
                FTCVideoRecordNewActivity.this.B.a("ftc sticker stop record");
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final boolean c() {
                if (FTCVideoRecordNewActivity.this.f97381g != null && !com.ss.android.ugc.tools.utils.k.a(FTCVideoRecordNewActivity.this.f97381g.f124757b.d())) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.sticker.presenter.g
            public final boolean a() {
                if (FTCVideoRecordNewActivity.this.t == null || FTCVideoRecordNewActivity.this.t.G() == null || FTCVideoRecordNewActivity.this.B == null) {
                    return true;
                }
                return FTCVideoRecordNewActivity.this.B.c().f6468a.getValue().booleanValue();
            }
        });
        this.B.s().a(this, new o(hVar));
        hVar.u().a(new com.ss.android.ugc.aweme.sticker.d.e() {
            /* class com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(61862);
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
            List<Fragment> a2 = aq.a(f2, z.f98930a);
            if (com.bytedance.common.utility.h.b(a2)) {
                androidx.fragment.app.n a3 = getSupportFragmentManager().a();
                for (Fragment fragment : a2) {
                    a3.a(fragment);
                }
                a3.c();
            }
        }
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.b());
        au.a(this.f97381g);
        com.ss.android.ugc.aweme.port.in.c.f115624c.a("SHOOT");
        getLifecycle().a(AudioFocusManager.a.a(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.c5v);
        this.v = frameLayout2;
        if (this.f97381g.n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f97381g.aj || this.f97381g.ak || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        com.ss.android.ugc.aweme.shortvideo.ui.f.a(this, frameLayout2, z3, true);
        this.f97382h.post(new h(this));
        w.f128061l = true;
        q.a("VideoRecordNewActivity => onCreate end");
        gr.a();
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.e());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new com.ss.android.ugc.aweme.shortvideo.ui.b());
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.a());
        this.f97382h.postDelayed(new p(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
        MethodCollector.o(13234);
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
        com.ss.android.ugc.aweme.ftc.d.a aVar;
        for (com.ss.android.ugc.tools.view.a.a aVar2 : this.G) {
            if (aVar2.onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.t == null) {
            return super.onKeyDown(i2, keyEvent);
        }
        m mVar = this.B;
        if (!(mVar == null || mVar.c().f6468a.getValue().booleanValue())) {
            return true;
        }
        n nVar = this.H;
        if ((nVar == null || !nVar.a()) && (aVar = (com.ss.android.ugc.aweme.ftc.d.a) this.t.E().b(com.ss.android.ugc.aweme.ftc.d.a.class, null)) != null) {
            aVar.a();
        }
        return true;
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        boolean z2;
        for (com.ss.android.ugc.tools.view.a.b bVar : this.F) {
            if (bVar.a(i2, i3, intent)) {
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002 && i3 == -1) {
            ShortVideoContext shortVideoContext = this.f97381g;
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
}
