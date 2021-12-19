package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.adaptation.b;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.cover.b;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.m;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.c;
import com.ss.android.ugc.aweme.utils.fa;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.f;
import dmt.av.video.k;
import dmt.av.video.n;
import dmt.av.video.q;
import dmt.av.video.w;
import dmt.av.video.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChooseCoverActivity extends b implements b.a, VEEditorAutoStartStopArbiter.a {

    /* renamed from: j  reason: collision with root package name */
    private static final String f132502j = ChooseCoverActivity.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public VideoPublishEditModel f132503d;

    /* renamed from: e  reason: collision with root package name */
    public z f132504e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cover.b f132505f;

    /* renamed from: g  reason: collision with root package name */
    public SurfaceView f132506g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f132507h;

    /* renamed from: i  reason: collision with root package name */
    c f132508i;

    /* renamed from: k  reason: collision with root package name */
    private final n f132509k = new n(this);

    /* renamed from: l  reason: collision with root package name */
    private final t<Bitmap> f132510l = new t<>();

    /* renamed from: m  reason: collision with root package name */
    private final t<Boolean> f132511m = new t<>();
    private final t<dmt.av.video.t> n = new t<>();

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.b.a
    public final t<dmt.av.video.t> b() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.b.a
    public final VideoPublishEditModel c() {
        return this.f132503d;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.lifecycle.m
    public i getLifecycle() {
        return this.f132509k;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.b.a
    public final g a() {
        return this.f132504e.w;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.w, R.anim.x);
    }

    @Override // dmt.av.video.VEEditorAutoStartStopArbiter.a
    public final void g() {
        runOnUiThread(new g(this));
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        com.ss.android.ugc.aweme.shortvideo.cover.b bVar = this.f132505f;
        if (bVar != null) {
            bVar.a(new h(this));
        }
    }

    static {
        Covode.recordClassIndex(86731);
        com.ss.android.ugc.aweme.sticker.text.b.a();
        com.ss.android.ugc.aweme.sticker.text.c.a();
        com.ss.android.ugc.aweme.sticker.text.c.b();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f132509k.b(i.b.DESTROYED);
        this.f132504e.w.z();
        this.f132504e.b();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c.c();
        super.onDestroy();
        com.ss.android.ugc.tools.d.a.c.a(this);
        if (m.f132564a != null) {
            com.ss.android.ugc.aweme.df.c cVar = c.C1870c.f80046a;
            c.a aVar = m.f132564a;
            if (aVar == null) {
                l.a("appLifecycleCallback");
            }
            cVar.b(aVar);
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
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

    class a extends i.b {
        static {
            Covode.recordClassIndex(86733);
        }

        a() {
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentDetached(androidx.fragment.app.i iVar, Fragment fragment) {
            super.onFragmentDetached(iVar, fragment);
            if (fragment instanceof com.ss.android.ugc.aweme.shortvideo.cover.b) {
                Intent intent = new Intent();
                intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) ChooseCoverActivity.this.f132503d);
                ChooseCoverActivity.this.setResult(-1, intent);
                ChooseCoverActivity.this.finish();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3, int i4) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ChooseCoverActivity.this.f132507h.getLayoutParams();
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            ChooseCoverActivity.this.f132507h.setLayoutParams(layoutParams);
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentActivityCreated(androidx.fragment.app.i iVar, Fragment fragment, Bundle bundle) {
            super.onFragmentActivityCreated(iVar, fragment, bundle);
            if (fragment instanceof com.ss.android.ugc.aweme.shortvideo.cover.b) {
                com.ss.android.ugc.aweme.shortvideo.cover.b bVar = (com.ss.android.ugc.aweme.shortvideo.cover.b) fragment;
                if (ChooseCoverActivity.this.f132504e.v != null) {
                    ChooseCoverActivity.this.f132504e.v.a(true, false);
                }
                View view = bVar.getView();
                if (view != null) {
                    view.postDelayed(new j(this, bVar), 300);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(Boolean bool) {
        if (!bool.booleanValue()) {
            super.onBackPressed();
        }
        return bool;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        int videoWidth;
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().setSoftInputMode(34);
        setContentView(R.layout.cb);
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        if (!com.ss.android.ugc.aweme.app.b.a.a(this)) {
            eu.a((Activity) this);
        }
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        this.f132507h = (ImageView) findViewById(R.id.fgx);
        this.f132506g = (SurfaceView) findViewById(R.id.d94);
        this.f132503d = (VideoPublishEditModel) getIntent().getSerializableExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL");
        z zVar = new z(this.f132503d.videoEditorType, f132502j);
        this.f132504e = zVar;
        zVar.a(2);
        if (this.f132503d.notUseCanvasSize()) {
            int[] c2 = f.c(this.f132503d);
            videoWidth = c2[0];
            videoHeight = c2[1];
        } else if (this.f132503d.mVideoCanvasWidth <= 0 || this.f132503d.mVideoCanvasHeight <= 0) {
            videoWidth = this.f132503d.videoWidth();
            videoHeight = this.f132503d.videoHeight();
            if (videoHeight == 0 || videoWidth == 0) {
                if (this.f132503d.getOriginal() == 0) {
                    iVideoConfigService = com.ss.android.ugc.aweme.port.in.c.p;
                } else {
                    iVideoConfigService = com.ss.android.ugc.aweme.port.in.c.o;
                }
                videoWidth = iVideoConfigService.getVideoWidth();
                if (this.f132503d.getOriginal() == 0) {
                    iVideoConfigService2 = com.ss.android.ugc.aweme.port.in.c.p;
                } else {
                    iVideoConfigService2 = com.ss.android.ugc.aweme.port.in.c.o;
                }
                videoHeight = iVideoConfigService2.getVideoHeight();
            }
        } else {
            videoWidth = this.f132503d.mVideoCanvasWidth;
            videoHeight = this.f132503d.mVideoCanvasHeight;
        }
        VEPreviewParams b2 = com.ss.android.ugc.aweme.shortvideo.edit.model.b.b(this.f132503d);
        if (this.f132503d.notUseCanvasSize()) {
            int[] c3 = f.c(this.f132503d);
            b2.mCanvasWidth = c3[0];
            b2.mCanvasHeight = c3[1];
        } else {
            b2.mCanvasWidth = this.f132503d.mVideoCanvasWidth;
            b2.mCanvasHeight = this.f132503d.mVideoCanvasHeight;
        }
        t tVar = new t();
        tVar.setValue(b2);
        t tVar2 = new t();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f156744i = this.f132503d.isFastImport;
        vEPreviewMusicParams.f156736a = this.f132503d.mMusicPath;
        vEPreviewMusicParams.f156737b = this.f132503d.mMusicStart;
        String str = this.f132503d.mMusicPath;
        l.d(this.f132503d, "");
        vEPreviewMusicParams.f156738c = fa.a(str);
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar == null || cVar.getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f156738c - cVar.getShootDuration()) < 1000) {
            vEPreviewMusicParams.f156739d = vEPreviewMusicParams.f156738c;
        } else {
            vEPreviewMusicParams.f156739d = cVar.getShootDuration();
        }
        vEPreviewMusicParams.f156740e = this.f132503d.musicVolume;
        vEPreviewMusicParams.f156741f = this.f132503d.musicId;
        vEPreviewMusicParams.f156742g = this.f132503d.previewStartTime;
        if (this.f132503d.getStitchParams() != null) {
            long duration = this.f132503d.getStitchParams().getDuration();
            vEPreviewMusicParams.f156745j = 0;
            vEPreviewMusicParams.f156746k = (int) duration;
        }
        vEPreviewMusicParams.n = this.f132503d.recordBgmDelay;
        if (this.f132503d.loudnessBalanceParam != null) {
            vEPreviewMusicParams.o = this.f132503d.loudnessBalanceParam.getBgmLoudness();
            vEPreviewMusicParams.q = this.f132503d.loudnessBalanceParam.getAvgLoudness();
            vEPreviewMusicParams.p = this.f132503d.loudnessBalanceParam.getPeakLoudness();
        }
        tVar2.setValue(vEPreviewMusicParams);
        dmt.av.video.g gVar = new dmt.av.video.g();
        t<InfoStickerModel> tVar3 = new t<>();
        tVar3.setValue(this.f132503d.infoStickerModel);
        k<w> kVar = new k<>();
        w a2 = com.ss.android.ugc.aweme.effect.c.b.a.a(this.f132504e.H.d(), this.f132503d);
        if (a2 != null) {
            kVar.setValue(a2);
        }
        t tVar4 = new t();
        tVar4.setValue(new com.ss.android.ugc.aweme.shortvideo.edit.b.b(this.f132503d.autoEnhanceOn, this.f132503d.autoEnhanceType, com.ss.android.ugc.aweme.shortvideo.edit.b.f.a(), com.ss.android.ugc.aweme.shortvideo.edit.b.f.b()));
        t<com.ss.android.ugc.gamora.editor.a.a> tVar5 = new t<>();
        tVar5.setValue(new com.ss.android.ugc.gamora.editor.a.a(this.f132503d.isFastImport, this.f132503d.isAudioEnhance));
        this.f132504e.f156981e = tVar;
        this.f132504e.f156982f = tVar2;
        this.f132504e.f156985i = gVar;
        this.f132504e.f156983g = new t();
        this.f132504e.f156984h = this.n;
        this.f132504e.a(new ArrayList<>());
        this.f132504e.f156986j = kVar;
        k<dmt.av.video.n> kVar2 = new k<>();
        t<AudioRecorderParam> tVar6 = new t<>();
        this.f132504e.f156988l = tVar6;
        this.f132504e.f156987k = kVar2;
        this.f132504e.f156989m = new t();
        this.f132504e.n = new t();
        this.f132504e.o = new t();
        this.f132504e.a(new t<>());
        this.f132504e.p = tVar3;
        this.f132504e.s = tVar4;
        this.f132504e.u = tVar5;
        this.f132509k.b(i.b.STARTED);
        this.f132504e.a(this, this, this.f132506g, this.f132503d);
        if (this.f132503d.mTimeEffect != null && this.f132503d.mTimeEffect.getKey().equals("1")) {
            if (this.f132503d.isFastImport || this.f132503d.isCutSameVideoType()) {
                this.f132504e.w.a(this.f132503d.getPreviewInfo().getReverseVideoArray(), this.f132503d.getPreviewInfo().getReverseAudioArray());
                this.f132504e.w.a(this.f132503d.getPreviewInfo().getTempVideoArray());
            } else {
                this.f132504e.w.b(this.f132503d.getPreviewInfo().getReverseVideoArray());
            }
            this.f132504e.w.c(true);
            if (this.f132503d.isFastImport || this.f132503d.isCutSameVideoType()) {
                this.f132504e.w.a(this.f132504e.w.a().f151435j, this.f132504e.w.a().f151436k, b2.mVolume);
            }
        }
        if (this.f132503d.mEffectList != null) {
            q.a(this.f132503d.mEffectList, gVar);
        }
        if (this.f132503d.veAudioRecorderParam != null) {
            tVar6.setValue(this.f132503d.veAudioRecorderParam);
        }
        if (this.f132503d.veAudioEffectParam != null) {
            this.f132503d.veAudioEffectParam.setShowErrorToast(false);
            this.f132503d.veAudioEffectParam.setPreprocessResult(null);
            kVar2.setValue(n.a.a(this.f132503d.veAudioEffectParam));
        }
        o d2 = com.ss.android.ugc.aweme.port.in.c.C.r().d();
        FilterBean a3 = es.a(this.f132503d, d2);
        float f2 = this.f132503d.mSelectedFilterIntensity;
        if (f2 == -1.0f) {
            f2 = 0.8f;
        }
        this.f132504e.w.c(com.ss.android.ugc.aweme.filter.c.b(a3), f2);
        if (!(this.f132503d.mSelectedFilterResId == null || com.ss.android.ugc.aweme.filter.repository.a.a.c.a(d2.f(), this.f132503d.mSelectedFilterResId) == null || this.f132503d.mSelectedFilterIntensity == -1.0f)) {
            this.f132504e.H.a(a3);
        }
        dg.a(this.f132506g, videoWidth, videoHeight);
        final View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86732);
            }

            public final boolean onPreDraw() {
                decorView.getViewTreeObserver().removeOnPreDrawListener(this);
                ImmersionBar.with(ChooseCoverActivity.this).fitsSystemWindows(true).statusBarColor(R.color.f159921e).statusBarDarkFont(true).init();
                return true;
            }
        });
        if (bundle != null && (getSupportFragmentManager().a("cover") instanceof com.ss.android.ugc.aweme.shortvideo.cover.b)) {
            this.f132505f = (com.ss.android.ugc.aweme.shortvideo.cover.b) getSupportFragmentManager().a("cover");
        } else {
            this.f132505f = new com.ss.android.ugc.aweme.shortvideo.cover.b();
            getSupportFragmentManager().a().a(R.id.c8s, this.f132505f, "cover").c();
        }
        this.f132511m.observe(this, new c(this));
        this.f132510l.observe(this, new d(this));
        this.f132505f.t = this.f132511m;
        this.f132505f.s = this.f132510l;
        getSupportFragmentManager().a((i.b) new a(), false);
        b bVar = new b(this);
        l.d(bVar, "");
        c.C1870c.f80046a.a(new m.a(bVar));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", false);
    }

    private void a(View view, int i2) {
        view.setBackgroundColor(-1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int top = this.f132506g.getTop() + i2;
        if (top > 0) {
            layoutParams.height = top;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        View findViewById;
        PollingStickerView pollingStickerView;
        LiveCDEditStickerView liveCDEditStickerView;
        List<InteractStickerStruct> a2;
        TextView textView;
        float b2;
        float f2;
        float f3;
        int i6;
        VideoPublishEditModel videoPublishEditModel = this.f132503d;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f132503d;
            if (!(videoPublishEditModel2 == null || videoPublishEditModel2.getMainBusinessContext() == null || (a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.f132503d.getMainBusinessContext(), 11, d.TRACK_PAGE_EDIT)) == null || a2.isEmpty() || a2.get(0).getCaptionStruct() == null || (textView = (TextView) findViewById(R.id.ewm)) == null)) {
                com.ss.android.ugc.aweme.sticker.data.d captionStruct = a2.get(0).getCaptionStruct();
                if (captionStruct.getVideoWidth() == null || captionStruct.getVideoWidth().intValue() == 0) {
                    b2 = (((float) i4) * 1.0f) / ((float) dh.b(this));
                    f2 = ((float) com.ss.android.ugc.gamora.editor.subtitle.d.t) * b2;
                    f3 = ((float) com.ss.android.ugc.gamora.editor.subtitle.d.s) * b2;
                    i6 = com.ss.android.ugc.gamora.editor.subtitle.d.r;
                } else {
                    b2 = (((float) i4) * 1.0f) / ((float) captionStruct.getVideoWidth().intValue());
                    f2 = ((float) captionStruct.getMarginStart().intValue()) * b2;
                    f3 = ((float) captionStruct.getMarginTop().intValue()) * b2;
                    i6 = captionStruct.getMarginBottom().intValue();
                }
                this.f132508i = new com.ss.android.ugc.aweme.sticker.data.c(captionStruct.getUtterances());
                textView.post(new f(this, textView, i2, f2, captionStruct, i3, f3, i5, ((float) i6) * b2, b2));
            }
            List<InteractStickerStruct> a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.f132503d.getMainBusinessContext(), 10, d.TRACK_PAGE_EDIT);
            if (!(a3 == null || a3.isEmpty() || a3.get(0).getCountDownStickerStruct() == null || (liveCDEditStickerView = (LiveCDEditStickerView) findViewById(R.id.d8z)) == null)) {
                a(findViewById(R.id.fiv), i3);
                liveCDEditStickerView.a(a3.get(0).getCountDownStickerStruct());
                liveCDEditStickerView.setTouchEnable(true);
                liveCDEditStickerView.setEditEnable(false);
                NormalTrackTimeStamp a4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(a3.get(0));
                if (a4 != null) {
                    a(liveCDEditStickerView, i2, i3, i4, i5, a4);
                }
            }
            List<InteractStickerStruct> a5 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.f132503d.getMainBusinessContext(), 1, d.TRACK_PAGE_EDIT);
            if (!(a5 == null || a5.isEmpty() || a5.get(0).getPollStruct() == null || (pollingStickerView = (PollingStickerView) findViewById(R.id.d91)) == null)) {
                a(findViewById(R.id.fiv), i3);
                pollingStickerView.a(a5.get(0).getPollStruct());
                pollingStickerView.setTouchEnable(true);
                pollingStickerView.a();
                pollingStickerView.setEditEnable(false);
                NormalTrackTimeStamp a6 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(a5.get(0));
                if (a6 != null) {
                    a(pollingStickerView, i2, i3, i4, i5, a6);
                }
            }
            List<InteractStickerStruct> a7 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.f132503d.getMainBusinessContext(), 16, d.TRACK_PAGE_EDIT);
            if (a7 != null && !a7.isEmpty() && a7.get(0).getDuetStickerStruct() != null && (findViewById = findViewById(R.id.d8u)) != null) {
                a(findViewById(R.id.fiv), i3);
                NormalTrackTimeStamp a8 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(a7.get(0));
                if (a8 != null) {
                    a(findViewById, i2, i3, i4, i5, a8);
                }
            }
        }
    }

    private void a(View view, int i2, int i3, int i4, int i5, NormalTrackTimeStamp normalTrackTimeStamp) {
        int i6 = this.f132504e.w.b().width;
        int i7 = this.f132504e.w.b().height;
        view.post(new e(this, normalTrackTimeStamp, i6, Math.min(((float) i4) / ((float) i6), ((float) i5) / ((float) i7)), i7, view, i2, i3, i5));
    }
}
