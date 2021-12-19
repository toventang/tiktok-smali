package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.adaptation.h;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.property.dc;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.b.f;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.br;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.b.d;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.c;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.f.b;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.g;
import dmt.av.video.k;
import dmt.av.video.n;
import dmt.av.video.q;
import dmt.av.video.w;
import dmt.av.video.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class VEVideoPublishPreviewActivity extends h {
    private static final String u = VEVideoPublishPreviewActivity.class.getSimpleName();
    private String A;
    private bq B;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f131173e;

    /* renamed from: f  reason: collision with root package name */
    z f131174f;

    /* renamed from: g  reason: collision with root package name */
    public SurfaceView f131175g;

    /* renamed from: h  reason: collision with root package name */
    n f131176h = new n(this);

    /* renamed from: i  reason: collision with root package name */
    c f131177i;

    /* renamed from: j  reason: collision with root package name */
    PreviewFakeFeedView f131178j;

    /* renamed from: k  reason: collision with root package name */
    d f131179k = com.ss.android.ugc.aweme.shortvideo.ui.b.c.f131454a;

    /* renamed from: l  reason: collision with root package name */
    d f131180l = com.ss.android.ugc.aweme.shortvideo.ui.b.c.f131454a;

    /* renamed from: m  reason: collision with root package name */
    ImageView f131181m;
    ImageView n;
    ImageView o;
    FrameLayout p;
    public View q;
    public View r;
    TextView s;
    com.ss.android.ugc.aweme.sticker.data.d t;
    private VideoPublishEditModel v;
    private String w;
    private UrlModel x;
    private int y;
    private String z;

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.lifecycle.m
    public i getLifecycle() {
        return this.f131176h;
    }

    static {
        Covode.recordClassIndex(85952);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f131175g, this.B.c(), this.B.d());
    }

    public final void k() {
        this.f131178j.bringToFront();
        this.n.bringToFront();
        this.f131181m.bringToFront();
        this.o.bringToFront();
    }

    public final void l() {
        VideoPublishEditModel videoPublishEditModel = this.v;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            o();
            p();
            q();
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        boolean z2;
        if (this.f131179k != com.ss.android.ugc.aweme.shortvideo.ui.b.a.f131452a) {
            z2 = true;
        } else {
            z2 = false;
        }
        b d2 = d(z2);
        d2.a("click_preview_entrance_time", this.A);
        r.a("click_preview_back_page_button", d2.f149193a);
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        super.onBackPressed();
        if (dc.b()) {
            n();
        }
        m();
        j();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        this.f131176h.a(i.b.DESTROYED);
        this.f131174f.w.L();
        this.f131174f.b();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c.c();
        super.onDestroy();
        com.ss.android.ugc.tools.d.a.c.a(this);
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        PollingStickerView pollingStickerView = (PollingStickerView) findViewById(R.id.d91);
        if (pollingStickerView != null) {
            pollingStickerView.setVisibility(8);
        }
        LiveCDEditStickerView liveCDEditStickerView = (LiveCDEditStickerView) findViewById(R.id.d8z);
        if (liveCDEditStickerView != null) {
            liveCDEditStickerView.setVisibility(8);
        }
        ImageView imageView = this.f131181m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.n;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.o;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        PreviewFakeFeedView previewFakeFeedView = this.f131178j;
        if (previewFakeFeedView != null) {
            previewFakeFeedView.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
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

    private void o() {
        List<InteractStickerStruct> a2;
        VideoPublishEditModel videoPublishEditModel = this.v;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null && (a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.v.getMainBusinessContext(), 11, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT)) != null && !a2.isEmpty() && a2.get(0) != null) {
            InteractStickerStruct interactStickerStruct = a2.get(0);
            if (interactStickerStruct.getCaptionStruct() != null && !com.ss.android.ugc.tools.utils.d.a(interactStickerStruct.getCaptionStruct().getUtterances())) {
                this.t = interactStickerStruct.getCaptionStruct();
                TextView textView = (TextView) findViewById(R.id.ewm);
                this.s = textView;
                if (textView != null) {
                    this.f131177i = new c(this.t.getUtterances());
                    this.s.setMaxWidth(com.ss.android.ugc.gamora.editor.subtitle.d.v);
                    this.s.postDelayed(new bu(this), 300);
                }
            }
        }
    }

    private void p() {
        LiveCDEditStickerView liveCDEditStickerView;
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.v.getMainBusinessContext(), 10, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a2 != null && !a2.isEmpty() && a2.get(0).getCountDownStickerStruct() != null && (liveCDEditStickerView = (LiveCDEditStickerView) findViewById(R.id.d8z)) != null) {
            View findViewById = findViewById(R.id.fiv);
            a(findViewById);
            a(liveCDEditStickerView, a2.get(0).getCountDownStickerStruct());
            NormalTrackTimeStamp a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(a2.get(0));
            if (a3 != null) {
                a(liveCDEditStickerView, findViewById, a3);
            }
        }
    }

    private void q() {
        PollingStickerView pollingStickerView;
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.v.getMainBusinessContext(), 1, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a2 != null && !a2.isEmpty() && a2.get(0).getPollStruct() != null && (pollingStickerView = (PollingStickerView) findViewById(R.id.d91)) != null) {
            View findViewById = findViewById(R.id.fiv);
            a(findViewById);
            a(pollingStickerView, a2.get(0).getPollStruct());
            NormalTrackTimeStamp a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(a2.get(0));
            if (a3 != null) {
                a(pollingStickerView, findViewById, a3);
            }
        }
    }

    private void r() {
        View findViewById;
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.v.getMainBusinessContext(), 16, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a2 != null && !a2.isEmpty() && a2.get(0).getDuetStickerStruct() != null && (findViewById = findViewById(R.id.d8u)) != null) {
            View findViewById2 = findViewById(R.id.fiv);
            a(findViewById2);
            NormalTrackTimeStamp a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(a2.get(0));
            if (a3 != null) {
                a(findViewById, findViewById2, a3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        setResult(-1);
        if (Build.VERSION.SDK_INT >= 21) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
            ofFloat.addUpdateListener(new bt(this));
            ofFloat.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(85953);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    VEVideoPublishPreviewActivity.this.f131175g.setVisibility(4);
                }
            });
            ofFloat.setDuration(100L);
            ofFloat.start();
            this.f131173e.bringToFront();
            this.f131173e.setAlpha(1.0f);
            this.f131173e.setVisibility(0);
            finishAfterTransition();
            return;
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        r.a("click_on_preview_page", d(z2).f149193a);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    private void a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int height = ((FrameLayout.LayoutParams) this.f131175g.getLayoutParams()).topMargin + ((this.f131175g.getHeight() - this.f131174f.w.b().height) / 2);
        if (height > 0) {
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
            view.bringToFront();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z2) {
        float f2;
        PreviewFakeFeedView previewFakeFeedView = this.f131178j;
        float f3 = 62.0f;
        if (previewFakeFeedView != null) {
            if (z2) {
                f2 = 62.0f;
            } else {
                f2 = 1.0f;
            }
            previewFakeFeedView.setBottomMargin((int) com.ss.android.ugc.tools.utils.r.a(this, f2));
        }
        View view = this.r;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (!z2) {
                f3 = 0.0f;
            }
            layoutParams.bottomMargin = (int) com.ss.android.ugc.tools.utils.r.a(this, f3);
            this.r.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public final b d(boolean z2) {
        return new b().a("enter_from", "video_post_page").a("creation_id", this.v.creationId).a("shoot_way", this.v.mShootWay).a("content_source", es.a(this.v)).a("is_virtual_feed", z2 ? 1 : 0).a("content_type", es.c(this.v)).a("from_group_id", dv.a()).a("last_group_id", this.z);
    }

    /* access modifiers changed from: package-private */
    public final Point a(PointF pointF) {
        Point point = new Point();
        point.set((int) (((float) this.f131175g.getWidth()) * pointF.x), (int) (((float) this.f131175g.getHeight()) * pointF.y));
        return point;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z2) {
        int a2 = (int) com.ss.android.ugc.tools.utils.r.a(this, 13.0f);
        int a3 = (int) com.ss.android.ugc.tools.utils.r.a(this, 3.0f);
        ImageView imageView = this.n;
        if (imageView != null) {
            a((View) imageView, true, a3);
        }
        ImageView imageView2 = this.f131181m;
        if (imageView2 != null) {
            a((View) imageView2, true, a3);
        }
        ImageView imageView3 = this.o;
        if (imageView3 != null) {
            a((View) imageView3, true, a3);
        }
        PreviewFakeFeedView previewFakeFeedView = this.f131178j;
        if (!(previewFakeFeedView == null || previewFakeFeedView.getPreviewTitle() == null)) {
            a((View) this.f131178j, true, a2);
        }
        View view = this.q;
        if (view != null) {
            a(view, false, 0);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.cc);
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        this.p = (FrameLayout) findViewById(R.id.c8s);
        if (dc.b()) {
            this.r = findViewById(R.id.d92);
            this.q = findViewById(R.id.d93);
            this.o = (ImageView) findViewById(R.id.d90);
            ImageView imageView = (ImageView) findViewById(R.id.d8r);
            this.f131181m = imageView;
            imageView.setVisibility(0);
            this.f131181m.setOnClickListener(new bq(this));
            ImageView imageView2 = (ImageView) findViewById(R.id.d8n);
            this.n = imageView2;
            imageView2.setVisibility(0);
            this.n.setOnClickListener(new br(this));
            if (dc.b()) {
                PreviewFakeFeedView previewFakeFeedView = (PreviewFakeFeedView) findViewById(R.id.d8v);
                this.f131178j = previewFakeFeedView;
                previewFakeFeedView.setVisibility(0);
            }
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.fgx);
        this.f131173e = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = VideoCoverBitmapHolder.f131084a;
        if (bitmap != null) {
            this.f131173e.setImageBitmap(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float b2 = (float) dh.b(this);
            float f2 = (float) height;
            float f3 = (float) width;
            float f4 = ((f2 * 1.0f) / f3) * b2;
            float a2 = (float) dh.a(this);
            if (f4 > a2) {
                b2 = a2 * ((f3 * 1.0f) / f2);
                f4 = a2;
            }
            ViewGroup.LayoutParams layoutParams = this.f131173e.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) b2;
                layoutParams.height = (int) f4;
                this.f131173e.setLayoutParams(layoutParams);
            }
        }
        v.a(this.f131173e, "transition_view_v1");
        v.a(findViewById(R.id.e7q), "transition_view_v2");
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.d94);
        this.f131175g = surfaceView;
        surfaceView.setVisibility(4);
        this.p.setOnClickListener(new bs(this));
        this.z = a(getIntent(), "extra_publish_preview_last_group_id");
        this.y = getIntent().getIntExtra("extra_publish_preview_permission", -1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) getIntent().getSerializableExtra("args");
        this.v = videoPublishEditModel;
        bq a3 = br.a(videoPublishEditModel);
        this.B = a3;
        a3.a(this.v.getCoverPublishModel().getNeedExpandCompiledSize(), false);
        this.w = a(getIntent(), "extra_publish_preview_anchor_text");
        this.x = (UrlModel) getIntent().getSerializableExtra("extra_publish_preview_anchor_icon_url");
        this.f131174f = new z(this.v.videoEditorType, u);
        VEPreviewParams b3 = com.ss.android.ugc.aweme.shortvideo.edit.model.b.b(this.v);
        b3.mCanvasWidth = this.B.c();
        b3.mCanvasHeight = this.B.d();
        t tVar = new t();
        tVar.setValue(b3);
        t tVar2 = new t();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f156744i = this.v.isFastImport;
        vEPreviewMusicParams.f156743h = 2;
        vEPreviewMusicParams.f156736a = this.v.mMusicPath;
        vEPreviewMusicParams.f156737b = this.v.mMusicStart;
        String str = this.v.mMusicPath;
        l.d(this.v, "");
        vEPreviewMusicParams.f156738c = fa.a(str);
        if (cr.a().f125295a == null || Math.abs(vEPreviewMusicParams.f156738c - cr.a().f125295a.getShootDuration()) < 1000) {
            vEPreviewMusicParams.f156739d = vEPreviewMusicParams.f156738c;
        } else {
            vEPreviewMusicParams.f156739d = cr.a().f125295a.getShootDuration();
        }
        vEPreviewMusicParams.f156740e = this.v.musicVolume;
        vEPreviewMusicParams.f156741f = this.v.musicId;
        vEPreviewMusicParams.f156742g = this.v.previewStartTime;
        if (this.v.getStitchParams() != null) {
            long duration = this.v.getStitchParams().getDuration();
            vEPreviewMusicParams.f156745j = 0;
            vEPreviewMusicParams.f156746k = (int) duration;
        }
        vEPreviewMusicParams.n = this.v.recordBgmDelay;
        if (this.v.loudnessBalanceParam != null) {
            vEPreviewMusicParams.o = this.v.loudnessBalanceParam.getBgmLoudness();
            vEPreviewMusicParams.p = this.v.loudnessBalanceParam.getPeakLoudness();
            vEPreviewMusicParams.q = this.v.loudnessBalanceParam.getAvgLoudness();
        }
        vEPreviewMusicParams.f156747l = this.v.isSoundLoop.booleanValue();
        vEPreviewMusicParams.f156748m = bz.a(this.v);
        tVar2.setValue(vEPreviewMusicParams);
        g gVar = new g();
        t<InfoStickerModel> tVar3 = new t<>();
        tVar3.setValue(this.v.infoStickerModel);
        k<w> kVar = new k<>();
        w a4 = com.ss.android.ugc.aweme.effect.c.b.a.a(this.f131174f.H.d(), this.v);
        if (a4 != null) {
            kVar.setValue(a4);
        }
        t<com.ss.android.ugc.gamora.editor.a.a> tVar4 = new t<>();
        tVar4.setValue(new com.ss.android.ugc.gamora.editor.a.a(this.v.isFastImport, this.v.isAudioEnhance));
        this.f131174f.f156981e = tVar;
        this.f131174f.f156982f = tVar2;
        this.f131174f.f156985i = gVar;
        this.f131174f.f156983g = new t();
        this.f131174f.f156984h = new t();
        this.f131174f.a(new ArrayList<>());
        this.f131174f.f156986j = kVar;
        k<dmt.av.video.n> kVar2 = new k<>();
        this.f131174f.f156987k = kVar2;
        this.f131174f.f156989m = new t();
        this.f131174f.n = new t();
        this.f131174f.o = new t();
        this.f131174f.a(new t<>());
        this.f131174f.p = tVar3;
        t<AudioRecorderParam> tVar5 = new t<>();
        this.f131174f.f156988l = tVar5;
        t tVar6 = new t();
        tVar6.setValue(new com.ss.android.ugc.aweme.shortvideo.edit.b.b(this.v.autoEnhanceOn, this.v.autoEnhanceType, f.a(), f.b()));
        this.f131174f.s = tVar6;
        this.f131174f.u = tVar4;
        this.f131176h.a(i.b.STARTED);
        this.f131174f.a(this, this, this.f131175g, this.v);
        if (this.v.mTimeEffect != null && this.v.mTimeEffect.getKey().equals("1")) {
            if (this.v.isFastImport || this.v.isCutSameVideoType()) {
                this.f131174f.w.a(this.v.getPreviewInfo().getReverseVideoArray(), this.v.getPreviewInfo().getReverseAudioArray());
                this.f131174f.w.a(this.v.getPreviewInfo().getTempVideoArray());
            } else {
                this.f131174f.w.b(this.v.getPreviewInfo().getReverseVideoArray());
            }
            this.f131174f.w.c(true);
            if (this.v.isFastImport || this.v.isCutSameVideoType()) {
                this.f131174f.w.a(this.f131174f.w.a().f151435j, this.f131174f.w.a().f151436k, b3.mVolume);
            }
        }
        if (this.v.mEffectList != null) {
            q.a(this.v.mEffectList, gVar);
        }
        if (this.v.veAudioRecorderParam != null) {
            tVar5.setValue(this.v.veAudioRecorderParam);
        }
        if (this.v.veAudioEffectParam != null) {
            this.v.veAudioEffectParam.setShowErrorToast(false);
            this.v.veAudioEffectParam.setPreprocessResult(null);
            kVar2.setValue(n.a.a(this.v.veAudioEffectParam));
        }
        FilterBean a5 = es.a(this.v, com.ss.android.ugc.aweme.port.in.c.C.r().d());
        float f5 = this.v.mSelectedFilterIntensity;
        if (f5 == -1.0f) {
            f5 = 0.8f;
        }
        this.f131174f.w.c(com.ss.android.ugc.aweme.filter.c.b(a5), f5);
        if (dc.b()) {
            this.f131178j.a(this.v, this.w, this.x, this.y);
        }
        if (!(this.v.mSelectedFilterResId == null || com.ss.android.ugc.aweme.filter.repository.a.a.c.a(com.ss.android.ugc.aweme.port.in.g.a().r().d().f(), this.v.mSelectedFilterResId) == null)) {
            this.f131174f.H.a(a5);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            getWindow().setSharedElementExitTransition(autoTransition);
            autoTransition.addListener((Transition.TransitionListener) new com.ss.android.ugc.aweme.da.a() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(85954);
                }

                @Override // com.ss.android.ugc.aweme.da.a
                public final void onTransitionStart(Transition transition) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bx(this));
                    ofFloat.addListener(new Animator.AnimatorListener() {
                        /* class com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(85955);
                        }

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }

                @Override // com.ss.android.ugc.aweme.da.a
                public final void onTransitionEnd(Transition transition) {
                    VEVideoPublishPreviewActivity.this.f131175g.bringToFront();
                    VEVideoPublishPreviewActivity.this.f131175g.setVisibility(0);
                    if (dc.b()) {
                        VEVideoPublishPreviewActivity.this.r.bringToFront();
                        VEVideoPublishPreviewActivity.this.q.bringToFront();
                        VEVideoPublishPreviewActivity.this.q.setVisibility(0);
                        VEVideoPublishPreviewActivity.this.r.setVisibility(0);
                    }
                    VEVideoPublishPreviewActivity.this.f131173e.setAlpha(0.0f);
                    VEVideoPublishPreviewActivity.this.f131173e.setVisibility(8);
                    VEVideoPublishPreviewActivity.this.l();
                    if (dc.b()) {
                        VEVideoPublishPreviewActivity.this.k();
                    }
                }
            });
            getWindow().setReturnTransition(new AutoTransition());
        } else {
            this.f131175g.setVisibility(0);
            this.f131175g.bringToFront();
            if (dc.b()) {
                this.r.bringToFront();
                this.r.setVisibility(0);
                this.q.bringToFront();
                this.q.setVisibility(0);
            }
            this.f131173e.setVisibility(4);
            this.f131173e.setAlpha(0);
            l();
            if (dc.b()) {
                k();
            }
        }
        this.A = String.valueOf(System.currentTimeMillis() / 1000);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(LiveCDEditStickerView liveCDEditStickerView, CountDownStickerStruct countDownStickerStruct) {
        liveCDEditStickerView.a(countDownStickerStruct);
        liveCDEditStickerView.setTouchEnable(true);
        liveCDEditStickerView.setEditEnable(false);
    }

    private static void a(PollingStickerView pollingStickerView, PollStruct pollStruct) {
        pollingStickerView.a(pollStruct);
        pollingStickerView.setTouchEnable(true);
        pollingStickerView.a();
        pollingStickerView.setEditEnable(false);
    }

    private void a(View view, View view2, NormalTrackTimeStamp normalTrackTimeStamp) {
        view.post(new bv(this, normalTrackTimeStamp, view, view2));
    }

    private void a(View view, boolean z2, int i2) {
        int c2 = dh.c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z2) {
            i2 += c2;
        }
        layoutParams.topMargin = i2;
        view.setLayoutParams(layoutParams);
    }
}
