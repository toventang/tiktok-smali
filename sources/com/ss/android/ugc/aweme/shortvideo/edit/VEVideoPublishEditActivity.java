package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.o.f;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.h;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz.a.m;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.experiment.ce;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.setting.q;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.c;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.n;
import com.ss.android.ugc.aweme.shortvideo.ui.k;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.aweme.utils.fw;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.c.b;
import com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel;
import com.ss.android.ugc.gamora.editor.rootscene.d;
import com.ss.android.ugc.gamora.editor.rootscene.e;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.y;
import com.ss.android.ugc.tools.view.a.a;
import com.ss.android.ugc.tools.view.a.b;
import com.ss.android.ugc.tools.view.a.c;
import com.ss.android.vesdk.VEListener;
import com.ss.ugc.aweme.performance.a.a;
import com.zhiliaoapp.musically.R;
import dmt.av.video.CompileProbeViewModel;
import dmt.av.video.n;
import f.a.aa;
import f.a.t;
import h.f.b.l;
import h.u;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class VEVideoPublishEditActivity extends h implements k, c, i, j {

    /* renamed from: e  reason: collision with root package name */
    public static String f126700e = "VEVideoPublishEditActivity";
    private f A;
    private boolean B;
    private bq C;
    private final List<a> D = new ArrayList();
    private w.a E;
    private final com.ss.android.ugc.aweme.shortvideo.edit.a.a F = new com.ss.android.ugc.aweme.shortvideo.edit.a.a();
    private y G;
    private e H;
    private final Cif I = new Cif();
    private final z.b J = ac.f126732a;

    /* renamed from: f  reason: collision with root package name */
    protected ViewGroup f126701f;

    /* renamed from: g  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.shortvideo.c f126702g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f126703h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f126704i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f126705j;

    /* renamed from: k  reason: collision with root package name */
    protected VideoPublishEditModel f126706k;

    /* renamed from: l  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.infoSticker.i f126707l;

    /* renamed from: m  reason: collision with root package name */
    boolean f126708m;
    boolean n = false;
    public boolean o = false;
    protected com.ss.android.ugc.gamora.editor.e.c p;
    protected EditGestureViewModel q;
    protected EditStickerViewModel r;
    protected EditToolbarViewModel s;
    protected CompileProbeViewModel t;
    public d u;
    public com.ss.android.ugc.aweme.widgetcompat.a v;
    boolean w = true;
    View x;
    private ViewGroup y;
    private int z;

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(a aVar) {
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(b bVar) {
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final String bt_() {
        return "video_edit_page";
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean bu_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(218, new g(VEVideoPublishEditActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.k.class, ThreadMode.MAIN, 0, false));
        hashMap.put(212, new g(VEVideoPublishEditActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(219, new g(VEVideoPublishEditActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(220, new g(VEVideoPublishEditActivity.class, "onEvent", com.ss.android.ugc.aweme.shortvideo.j.i.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.k
    public final boolean bs_() {
        return this.f126705j;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final boolean cv_() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        if (!"success".equals(str)) {
            com.ss.android.ugc.aweme.draft.k.a("draft recover failed, cause : ".concat(String.valueOf(str)));
            com.ss.android.ugc.aweme.port.in.g.a().c().b().a(1, this.f126706k.creationId, str);
        }
        com.ss.android.ugc.aweme.port.in.g.a().c().b().a(0, this.f126706k.creationId, str);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.b(this.f126706k.draftDir() + File.separator, di.f126462e, this.f126706k.multiEditVideoRecordData);
        this.f126704i = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2) {
        this.f126706k.mUploadPath = str;
        com.ss.android.ugc.aweme.shortvideo.publish.b.f129738a.put(str2, str);
        if (TextUtils.isEmpty(this.f126706k.commerceData) && this.f126706k.microAppModel == null) {
            runOnUiThread(new ax(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(u uVar) {
        boolean booleanValue = ((Boolean) uVar.getFirst()).booleanValue();
        boolean booleanValue2 = ((Boolean) uVar.getSecond()).booleanValue();
        boolean booleanValue3 = ((Boolean) uVar.getThird()).booleanValue();
        this.G.a(booleanValue, booleanValue2, booleanValue3);
        this.q.c(new EditGestureViewModel.c(booleanValue3));
        if (!booleanValue) {
            Q();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.asve.editor.g gVar) {
        if (gVar != null) {
            this.f126706k.setVideoLength(gVar.j());
            this.G.a();
            bj.a("VideoPublishEditActivity, video duration " + gVar.j());
            VideoLengthChecker.a().a(this, this.f126706k, this.u);
            VideoPublishEditModel videoPublishEditModel = this.f126706k;
            l.d(videoPublishEditModel, "");
            if (b.a()) {
                b.i.b(new c.a(videoPublishEditModel), b.i.f4824a);
            }
            if (this.f126706k.isMvThemeVideoType() && gVar.j() > 0) {
                EditVideoSegment editVideoSegment = this.f126706k.getPreviewInfo().getVideoList().get(0);
                this.f126706k.getPreviewInfo().getVideoList().set(0, editVideoSegment.copy(editVideoSegment.getVideoPath(), editVideoSegment.getAudioPath(), new VideoFileInfo(editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), (long) gVar.j(), 30, 0)));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z2) {
        this.H.a(z2);
    }

    public final void a(Boolean bool) {
        boolean a2 = com.ss.android.vesdk.runtime.d.b().a();
        this.u.ag();
        if ((!q.a() || F() == null) && !a2) {
            com.ss.android.ugc.aweme.shortvideo.r.a.a().a(this, new Intent(), bool.booleanValue());
            com.ss.android.ugc.gamora.editor.c.c.a(new b.a(this));
            return;
        }
        b(false, null, null);
    }

    public final void a(boolean z2, Intent intent, VideoPublishEditModel videoPublishEditModel) {
        if (z2) {
            b(intent, videoPublishEditModel);
        } else {
            com.ss.android.ugc.gamora.editor.c.c.a(new b.a(this));
        }
    }

    public final void a(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        boolean a2 = com.ss.android.vesdk.runtime.d.b().a();
        if ((!q.a() || F() == null) && !a2) {
            b(intent, videoPublishEditModel);
        } else {
            b(true, intent, videoPublishEditModel);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        com.ss.android.ugc.aweme.port.in.g.a().c().b().a(-1, this.f126706k.creationId, th.toString());
        com.ss.android.ugc.aweme.draft.k.a(th.toString());
        finish();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z u() {
        b("cancel");
        return null;
    }

    private com.ss.android.ugc.asve.editor.g F() {
        return this.p.C().getValue();
    }

    private boolean O() {
        return c((Boolean) true);
    }

    private void Q() {
        this.u.G().K();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z v() {
        b("discard");
        a((Boolean) false);
        return null;
    }

    static {
        Covode.recordClassIndex(83113);
        com.ss.android.ugc.aweme.sticker.text.b.a();
        com.ss.android.ugc.aweme.sticker.text.c.a();
    }

    private boolean I() {
        if (!this.f126706k.isPhotoMvMode || this.f126706k.getOriginal() != 1) {
            return false;
        }
        return true;
    }

    private boolean N() {
        if (this.f126706k.veAudioRecorderParam == null) {
            return false;
        }
        if (this.f126706k.veAudioRecorderParam.hasRecord() || !this.f126706k.veAudioRecorderParam.getNeedOriginalSound()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void A() {
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        ai z2 = com.ss.android.ugc.aweme.port.in.l.f115658a.z();
        new com.ss.android.ugc.aweme.shortvideo.edit.a.b(videoPublishEditModel);
        z2.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z B() {
        r.a("click_audio_clear_popup", E().a("click_type", "not_now").f149193a);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z C() {
        this.s.a(1);
        r.a("click_audio_clear_popup", E().a("click_type", "select").f149193a);
        return null;
    }

    public final Map m() {
        HashMap hashMap = new HashMap();
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        if (videoPublishEditModel != null) {
            hashMap.put("creation_id", videoPublishEditModel.creationId);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
            R();
        }
        this.u.a(true, this.f126703h, this.B, (Runnable) new av(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
            R();
        }
        L();
        j();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z w() {
        b("save");
        this.u.a(this.f126703h, this.B, new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.AnonymousClass3 */

            static {
                Covode.recordClassIndex(83116);
            }

            public final void run() {
            }
        }, new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.AnonymousClass4 */

            static {
                Covode.recordClassIndex(83117);
            }

            public final void run() {
                VEVideoPublishEditActivity.this.k();
            }
        });
        return null;
    }

    private com.ss.android.ugc.tools.f.b E() {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("creation_id", this.f126706k.creationId);
        if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
            a2.a("new_draft_id", this.f126706k.newDraftId);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void t() {
        if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
            R();
        }
        com.ss.android.ugc.aweme.port.in.g.a().j().a();
        cr.a().a(this.f126702g, cr.a().f125296b);
        cr.a().q = "";
        L();
        j();
    }

    private void K() {
        new a.C0731a(this).b(R.string.g8x).a(R.string.g8y).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.asg, (DialogInterface.OnClickListener) new ap(this), false).a().b();
    }

    private void L() {
        ad adVar;
        if (getIntent().hasExtra("extra_share_context") && (adVar = (ad) getIntent().getSerializableExtra("extra_share_context")) != null && com.ss.android.ugc.aweme.port.in.l.f115658a.g().a(adVar) && adVar.mTargetSceneType == 1) {
            com.ss.android.ugc.aweme.port.in.l.f115658a.g().a(this, adVar, "Sharing canceled", 20013);
        }
    }

    private void M() {
        new a.C0731a(this).b(R.string.za).b(getString(R.string.a9e), (DialogInterface.OnClickListener) new as(this), false).a(getString(R.string.cui), (DialogInterface.OnClickListener) new at(this), false).a().b();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.analysis.b
    public final Analysis f() {
        if (super.f() == null) {
            return super.f();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.f126706k.creationId);
        hashMap.put("is_story_shoot", "0");
        return super.f().setExtraMap(hashMap);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        if (this.C.b() <= 0 || this.C.a() <= 0) {
            com.bytedance.services.apm.api.a.a("edit page modifyDisplayView failed");
        }
        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.x, this.C.a(), this.C.b());
        this.p.Z();
    }

    public final void j() {
        boolean a2 = com.ss.android.vesdk.runtime.d.b().a();
        this.u.ag();
        if ((!q.a() || F() == null) && !a2) {
            com.ss.android.ugc.gamora.editor.c.c.a(new b.a(this));
        } else {
            b(false, null, null);
        }
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        com.bytedance.ies.dmt.ui.f.a.f33482a = false;
        b.a.f132249a.pause(this, "video_edit", this.f126706k.mShootWay, this.f126706k.creationId);
        fw.a("tool_edit_enter");
        a.C4076a.a().b("tool_edit");
        com.ss.android.vesdk.runtime.d.b().a(3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        if (this.f126706k.recordMode == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f126706k;
            l.d(videoPublishEditModel, "");
            r.a("back_to_shoot_confirm", new com.ss.android.ugc.tools.f.b().a("to_status", "cancel").a("prop_id", videoPublishEditModel.mStickerID).a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).f149193a);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x() {
        this.f126706k.clickGoNextBtnTime = System.currentTimeMillis();
        Q();
        this.t.a().a();
        this.n = true;
        this.u.a(this.f126703h, this.B, new aw(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void s() {
        if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
            R();
        }
        com.ss.android.ugc.aweme.port.in.g.a().j().a();
        cr.a().a(this.f126702g, cr.a().f125296b);
        cr.a().q = "";
        L();
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        c.a(videoPublishEditModel);
        c(videoPublishEditModel);
        a(b(videoPublishEditModel), this.f126706k);
    }

    private void R() {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("creation_id", this.f126706k.creationId);
        if (this.f126706k.draftId != 0) {
            a2.a("draft_id", this.f126706k.draftId);
        }
        if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
            a2.a("new_draft_id", this.f126706k.newDraftId);
        }
        if (this.f126706k.mDraftToEditFrom == 0) {
            a2.a("draft_way", "general_draft_list");
        }
        com.ss.android.ugc.aweme.utils.d.a("click_draft_edit_cancel", a2.f149193a);
    }

    public void finish() {
        this.f126705j = false;
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        if (videoPublishEditModel != null && videoPublishEditModel.commerceData != null) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.h(this.f126706k.commerceData));
        } else if (bk.a()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.h(null));
        }
        overridePendingTransition(0, R.anim.x);
        super.finish();
        VideoPublishEditModel videoPublishEditModel2 = this.f126706k;
        if (videoPublishEditModel2 != null && videoPublishEditModel2.mShootMode == 15) {
            overridePendingTransition(0, 0);
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f126706k;
        if (videoPublishEditModel3 != null && videoPublishEditModel3.isFromCrash() && com.ss.android.ugc.aweme.port.in.g.a().d().h()) {
            overridePendingTransition(0, R.anim.x);
        }
    }

    public final void k() {
        new bn("VideoPublishFragment");
        final com.ss.android.ugc.aweme.draft.model.c b2 = bn.b(this.f126706k);
        b2.I = System.currentTimeMillis();
        final com.ss.android.ugc.aweme.port.internal.c c2 = com.ss.android.ugc.aweme.port.in.g.a().c();
        if (!isFinishing()) {
            this.v = com.ss.android.ugc.aweme.widgetcompat.a.a(this, getString(R.string.ewe));
        }
        com.ss.android.ugc.aweme.port.in.g.a().o().n().a(b2, this.f126706k, new IDraftService.DraftSaveListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.AnonymousClass5 */

            static {
                Covode.recordClassIndex(83118);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveSuccess() {
                c2.c(b2);
                c2.a(b2, false);
                Context applicationContext = VEVideoPublishEditActivity.this.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(VEVideoPublishEditActivity.this.getString(R.string.ffy)).a();
                VEVideoPublishEditActivity.this.a((Boolean) true);
                if (VEVideoPublishEditActivity.this.v != null) {
                    VEVideoPublishEditActivity.this.v.dismiss();
                }
                bj.a("zyc draft save success");
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                VEVideoPublishEditActivity.this.a((Boolean) false);
                if (VEVideoPublishEditActivity.this.v != null) {
                    VEVideoPublishEditActivity.this.v.dismiss();
                }
                bj.a("zyc draft save failed");
            }
        });
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", true);
        bj.a("VEVideoPublishEditActivity onResume");
        super.onResume();
        a.C4076a.a().a("tool_edit");
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        b.a.f132249a.step("av_video_edit", "onResume");
        this.f126708m = false;
        this.w = true;
        d dVar = this.u;
        if (dVar != null) {
            dVar.af();
        }
        com.ss.android.vesdk.runtime.d.b().a(2);
        long longExtra = getIntent().getLongExtra("extra_start_enter_edit_page", 0);
        String a2 = a(getIntent(), "extra_start_enter_edit_reason");
        if (a2 != null && TextUtils.equals(a2, "click_next")) {
            this.I.a("click_record_next", System.currentTimeMillis() - longExtra, true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        com.ss.android.ugc.aweme.port.in.g.a().o().g().c();
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        if (this.f126706k.recordMode == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f126706k;
            l.d(videoPublishEditModel, "");
            r.a("back_to_shoot_confirm", new com.ss.android.ugc.tools.f.b().a("to_status", "confirm").a("prop_id", videoPublishEditModel.mStickerID).a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).f149193a);
        }
        L();
        j();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void y() {
        this.u.G().O();
        cr.a().a(this.f126702g, cr.a().f125296b);
        if (this.f126706k.mIsFromDraft) {
            this.f126706k.mMusicPath = this.u.u.j();
            if (!this.f126704i) {
                new com.ss.android.ugc.aweme.tux.a.i.a(a(this)).a(R.string.bwq).a();
                return;
            }
            if (!com.ss.android.ugc.aweme.video.e.b(this.f126706k.mStickerPath)) {
                this.f126706k.mStickerPath = null;
                this.f126706k.mStickerID = "";
            }
            Intent a2 = a(this.f126706k);
            if (a2 != null) {
                a(a2, this.f126706k);
            }
        } else if (this.f126706k.hasRetake()) {
            Intent intent = new Intent();
            a(intent, this.f126706k.multiEditVideoRecordData);
            cr.a().a(this.f126706k.getOriginalRecordMusic());
            com.ss.android.ugc.aweme.shortvideo.r.a.a().c((Activity) this, intent);
            j();
        } else if (this.f126706k.isCutSameVideoType()) {
            setResult(-1, com.ss.android.ugc.aweme.port.in.l.f115658a.d().a().a(this.f126706k.cutSameEditData));
            j();
        } else {
            bl.e(this.f126706k);
            cr.a().g();
            cr.a().a(this.f126706k.challenges);
            L();
            if (this.f126706k.mShootMode == 15 || I()) {
                setResult(-1);
            }
            Intent intent2 = new Intent();
            intent2.putExtra("edit_to_record_time", System.currentTimeMillis());
            setResult(-1, intent2);
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void D() {
        com.ss.android.ugc.aweme.draft.k.a("VEVideoPublishEditActivity onCreate remove tmpDir and restoreDraftCopyFile mModel.draftDir() = " + this.f126706k.draftDir());
        com.ss.android.ugc.aweme.video.e.b(new File(di.f126462e));
        if (this.f126706k.isMultiVideoEdit()) {
            t.b(this.f126706k).b((aa) new f.a.e.g.d(com.ss.android.ugc.aweme.tools.b.f138752a)).d(ay.f126937a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ba(this), new bb(this));
        } else {
            if (this.f126706k.stitchParams == null) {
                com.ss.android.ugc.aweme.video.e.b(this.f126706k.draftDir(), di.f126462e);
            }
            s.a(new bc(this));
        }
        if (this.f126706k.containBackgroundVideo) {
            VideoPublishEditModel videoPublishEditModel = this.f126706k;
            l.d(videoPublishEditModel, "");
            String a2 = com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c.a(videoPublishEditModel);
            String str = dj.f126465h;
            com.ss.android.ugc.aweme.video.e.e(str);
            com.ss.android.ugc.aweme.video.e.b(a2, str);
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.sticker.text.c.a(new com.ss.android.ugc.aweme.editSticker.a.f());
        com.ss.android.ugc.gamora.editor.sticker.permission.a.f146748a = false;
        com.ss.android.ugc.aweme.port.in.g.a().A().b(this.J);
        com.ss.android.ugc.aweme.port.in.g.a().d().i();
        n.f129512a = false;
        com.ss.android.ugc.aweme.port.in.l.f115658a.b().a((com.ss.android.ugc.aweme.cz.a.f) null);
        com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a(true);
        this.f126705j = false;
        com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        if (videoPublishEditModel != null && bp.l(videoPublishEditModel)) {
            com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a((com.ss.android.ugc.aweme.cz.a.i) null);
            if (bp.a()) {
                com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a((m) null);
            }
        }
        b.a.f132249a.leave(this, "video_edit");
        com.ss.android.ugc.tools.d.a.c.a(this);
        com.ss.android.ugc.aweme.shortvideo.p.c.a("normal").a("at_edit_page");
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        if (!TextUtils.isEmpty(this.f126706k.mMusicPath) && this.f126706k.mCurMusicLength <= 0) {
            this.f126706k.mCurMusicLength = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(this.f126706k.mMusicPath);
        }
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = bl.l(videoPublishEditModel).a("scene", "start_edit").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_edit_page");
        ar arVar = ar.f132216a;
        l.b(arVar, "");
        com.ss.android.ugc.tools.f.b a3 = a2.a("dalvikPss", arVar.f132218c);
        ar arVar2 = ar.f132216a;
        l.b(arVar2, "");
        com.ss.android.ugc.tools.f.b a4 = a3.a("nativePss", arVar2.f132219d);
        ar arVar3 = ar.f132216a;
        l.b(arVar3, "");
        com.ss.android.ugc.tools.f.b a5 = a4.a("otherPss", arVar3.f132221f);
        ar arVar4 = ar.f132216a;
        l.b(arVar4, "");
        r.a("av_memory_log", a5.a("totalPss", arVar4.f132220e).f149193a);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public boolean z() {
        float f2;
        z a2;
        boolean a3 = com.ss.android.ugc.aweme.port.in.g.a().A().a();
        if (this.u.W()) {
            this.u.af();
            return false;
        }
        if (com.ss.android.ugc.gamora.editor.lightening.a.a(this.f126706k)) {
            if (this.f126706k.getOriginal() == 1 && ((this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot) && (this.f126706k.mShootMode == 15 || this.f126706k.mShootMode == 2))) {
                if (ce.a() && !a3) {
                    d(this.f126706k.draftFromShoot);
                    return true;
                } else if (this.f126706k.mIsFromDraft) {
                    K();
                    return true;
                }
            }
        } else if (this.f126706k.getOriginal() == 1 && com.ss.android.ugc.aweme.canvas.s.f69749a && ((this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot) && this.f126706k.mShootMode == 2)) {
            if (ce.a() && !a3) {
                d(this.f126706k.draftFromShoot);
                return true;
            } else if (this.f126706k.mIsFromDraft) {
                K();
                return true;
            }
        }
        if (this.f126706k.isDuet()) {
            if (!this.f126706k.mIsFromDraft || this.f126706k.duetFilesExist()) {
                if ((this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot) && ce.a() && !a3) {
                    d(this.f126706k.draftFromShoot);
                } else if (O()) {
                    y();
                }
                return false;
            }
            j();
            return true;
        } else if (this.f126706k.isFromCrash()) {
            if (O()) {
                y();
            }
            return false;
        } else {
            this.t.a().a();
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a(this.f126706k);
            VideoPublishEditModel videoPublishEditModel = this.f126706k;
            com.ss.android.ugc.gamora.editor.e.c cVar = this.p;
            if (F() != null) {
                f2 = F().F();
            } else {
                f2 = -1.0f;
            }
            bl.a(videoPublishEditModel, cVar, f2, "exit_edit");
            if (this.f126706k.recordMode != 1 && (!com.bytedance.common.utility.m.a(this.f126706k.getDuetFrom()) || this.f126706k.isReaction())) {
                L();
                if (!TextUtils.isEmpty(this.f126706k.newDraftId)) {
                    R();
                    j();
                    return true;
                }
                if (O()) {
                    y();
                }
                return false;
            } else if (this.f126706k.recordMode == 1) {
                if (this.f126706k.draftFromShoot || this.f126706k.mIsFromDraft) {
                    if (!ce.a() || a3) {
                        z a4 = z.a(Integer.valueOf((int) R.string.f7v), Integer.valueOf((int) R.string.a9e), Integer.valueOf((int) R.string.c52));
                        a(a4.f128064a.intValue(), a4.f128065b.intValue(), a4.f128066c.intValue());
                    } else {
                        d(this.f126706k.draftFromShoot);
                    }
                    return false;
                }
                new a.C0731a(this).a(R.string.a2l).b(R.string.a2k).b(R.string.a9e, (DialogInterface.OnClickListener) new aq(this), false).a(R.string.a2h, (DialogInterface.OnClickListener) new ar(this), false).a().b();
                return false;
            } else if (this.f126706k.isCutSameVideoType()) {
                if (this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot) {
                    if (!ce.a() || a3) {
                        M();
                    } else {
                        d(this.f126706k.draftFromShoot);
                    }
                } else if (c((Boolean) false)) {
                    y();
                }
                return false;
            } else if (this.f126706k.mOrigin == 0 && (this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot)) {
                if (!ce.a() || a3) {
                    M();
                } else {
                    d(this.f126706k.draftFromShoot);
                }
                return false;
            } else if (this.f126706k.isMvThemeVideoType() && !I() && (this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot)) {
                if (!ce.a() || a3) {
                    M();
                } else {
                    d(this.f126706k.draftFromShoot);
                }
                return false;
            } else if (this.f126706k.mOrigin == 0 && this.f126706k.canvasVideoData != null) {
                if (c((Boolean) false)) {
                    y();
                }
                return false;
            } else if (this.f126706k.mFromCut || this.f126706k.mOrigin == 0 || this.f126706k.mFromMultiCut) {
                if (this.f126706k.mIsFromDraft && (this.f126706k.mFromMultiCut || this.f126706k.mFromCut)) {
                    a2 = z.a(Integer.valueOf((int) R.string.f7v), Integer.valueOf((int) R.string.a9e), Integer.valueOf((int) R.string.c52));
                } else if (this.f126706k.mFromMultiCut || this.f126706k.mFromCut || this.f126706k.isPhotoMvMode || this.f126706k.canvasVideoData != null) {
                    a2 = z.a(Integer.valueOf((int) R.string.hat), Integer.valueOf((int) R.string.a9e), Integer.valueOf((int) R.string.c52));
                } else {
                    a2 = z.a(Integer.valueOf((int) R.string.has), Integer.valueOf((int) R.string.a9e), Integer.valueOf((int) R.string.c52));
                }
                a(a2.f128064a.intValue(), a2.f128065b.intValue(), a2.f128066c.intValue());
                return false;
            } else if ((this.f126706k.mIsFromDraft || this.f126706k.draftFromShoot) && ce.a() && !a3) {
                d(this.f126706k.draftFromShoot);
                return true;
            } else {
                if (O()) {
                    y();
                }
                return false;
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.c cVar) {
        finish();
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
        this.D.add(aVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void c(com.ss.android.ugc.tools.view.a.a aVar) {
        this.D.remove(aVar);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.i iVar) {
        finish();
    }

    private static Context a(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        Context applicationContext = vEVideoPublishEditActivity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!com.ss.android.ugc.asve.f.b.f62082a) {
            com.ss.android.ugc.asve.f.b.f62083b = true;
            bj.d("ASVEPerformance EditorSceneLazyInit : " + com.ss.android.ugc.asve.f.b.f62083b);
        }
    }

    private static RecordScene c(VideoPublishEditModel videoPublishEditModel) {
        RecordScene audioTrack = new RecordScene().musicPath(videoPublishEditModel.mMusicPath).musicStart(videoPublishEditModel.mMusicStart).faceBeauty(videoPublishEditModel.mFaceBeauty).videoSegment(videoPublishEditModel.mVideoSegmentsDesc).hardEncode(videoPublishEditModel.mHardEncode).mp4Path(videoPublishEditModel.videoPath()).maxDuration(videoPublishEditModel.maxDuration).audioTrack(videoPublishEditModel.audioTrack);
        cr.a().r = audioTrack;
        return audioTrack;
    }

    public final void b(int i2) {
        this.f126701f.setBackgroundColor(i2);
        this.y.setBackgroundColor(i2);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.g gVar) {
        if (this.f126706k.mShoutOutsData != null) {
            this.f126706k.mShoutOutsData.setPrice(gVar.f128591b);
            this.f126706k.mShoutOutsData.setDesc(gVar.f128590a);
            this.f126706k.mShoutOutsData.setBuyerMoneyDes(gVar.f128592c);
        }
    }

    private void b(String str) {
        String str2;
        if (this.f126706k.mDraftToEditFrom == 0) {
            str2 = "general_draft_list";
        } else {
            str2 = "shoot_page";
        }
        com.ss.android.ugc.aweme.utils.d.a("click_draft_edit_answer_sheet", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("creation_id", this.f126706k.creationId).a("draft_id", this.f126706k.draftId).a("new_draft_id", this.f126706k.newDraftId).a("shoot_way", this.f126706k.mShootWay).a("draft_way", str2).a("click_choice", str).f149193a);
    }

    private boolean c(Boolean bool) {
        boolean z2;
        if (this.u.G().N() || this.f126706k.hasInfoStickers()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!com.bytedance.common.utility.h.b(this.f126706k.mEffectList) && this.f126706k.mTimeEffect == null && !N() && !this.f126706k.isChangeMultiEditData() && !z2) {
            return true;
        }
        a.C0731a a2 = new a.C0731a(this).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.aue, (DialogInterface.OnClickListener) new au(this), false);
        if (bool.booleanValue()) {
            a2.a(R.string.feu).b(R.string.fet);
        } else {
            a2.b(R.string.hat);
        }
        a2.a().b().show();
        return false;
    }

    private void d(boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        if (this.f126706k.recordMode == 1 || this.f126706k.mFromCut || this.f126706k.mOrigin == 0 || this.f126706k.mFromMultiCut) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f126706k.mShootMode == 15 || this.f126706k.mShootMode == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.u.G().N() || this.f126706k.hasInfoStickers()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!com.bytedance.common.utility.h.b(this.f126706k.mEffectList) && this.f126706k.mTimeEffect == null && !N() && !this.f126706k.isChangeMultiEditData() && ((this.f126706k.getFilterName() == null || this.f126706k.getFilterName().equals("normal")) && !z5 && (this.f126706k.mMusicPath == null || this.f126706k.mMusicPath.equals("")))) {
            if (!z3) {
                a((Boolean) true);
                return;
            } else if (this.f126706k.draftFromShoot) {
                y();
                return;
            }
        }
        if (z4) {
            i2 = R.string.bdf;
            i3 = R.string.bde;
        } else {
            i2 = R.string.bdc;
            i3 = R.string.bdb;
        }
        aa.a(i2, i3, new aj(this, z4), new ak(this), new al(this), new am(this), z2, z3, getSupportFragmentManager());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            this.p.a(n.a.a(this.f126706k.veAudioEffectParam));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z c(boolean z2) {
        b("back_to_camera");
        if (z2 && this.f126706k.mIsFromDraft) {
            s();
            return null;
        } else if (this.f126706k.recordMode == 1) {
            t();
            return null;
        } else {
            y();
            return null;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.j.k kVar) {
        this.f126706k.title = kVar.f128600a;
        this.f126706k.structList = kVar.f128603d;
        this.f126706k.isPrivate = kVar.f128604e;
        this.f126706k.challenges = kVar.f128605f;
        this.f126706k.commentSetting = kVar.f128606g;
        this.f126706k.compileProbeResult = kVar.f128609j;
        this.f126706k.commerceData = kVar.f128610k;
        this.f126706k.allowAutoCaptionSetting = kVar.p;
        this.f126706k.allowDownloadSetting = kVar.f128611l;
        this.f126706k.microAppId = null;
        this.f126706k.microAppModel = null;
        this.f126706k.chain = kVar.f128601b;
        this.f126706k.disableDeleteChain = kVar.f128602c;
        this.f126706k.geofencingSetting = kVar.f128612m;
        this.f126706k.excludeUserList = kVar.n;
        this.f126706k.allowRecommend = kVar.o;
        this.f126706k.isDraftMusicIllegal = kVar.q;
        this.f126706k.playlist_id = kVar.s;
        this.f126706k.playlist_name = kVar.r;
        this.f126706k.publishDuetMentionedUserList.clear();
        this.f126706k.publishDuetMentionedUserList.addAll(kVar.x);
        if (kVar.t) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(this.f126706k);
            this.r.c(new EditStickerViewModel.n());
        }
        com.ss.android.ugc.aweme.shortvideo.j.a aVar = kVar.f128607h;
        VideoPublishEditModel videoPublishEditModel = this.f126706k;
        l.d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.mvCreateVideoData == null) {
            videoPublishEditModel.mVideoCoverStartTm = ((float) aVar.f128572a) / 1000.0f;
            videoPublishEditModel.setCoverPublishModel(aVar.f128574c);
        } else {
            com.ss.android.ugc.aweme.mvtheme.d dVar = videoPublishEditModel.mvCreateVideoData;
            dVar.videoCoverStartTime = aVar.f128572a;
            dVar.videoCoverImgPath = aVar.f128573b;
            videoPublishEditModel.setCoverPublishModel(aVar.f128574c);
        }
        if (kVar.v != 0) {
            this.f126706k.musicUsageConfirmation = kVar.v;
        }
        this.u.an();
    }

    private Intent b(VideoPublishEditModel videoPublishEditModel) {
        Intent intent = new Intent();
        com.ss.android.ugc.aweme.shortvideo.r.a.a().a((Activity) this, intent);
        intent.putExtra("draft_to_edit_from", this.z);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.veCherEffectParam);
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        intent.putExtra("translation_type", 3);
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(videoPublishEditModel.getMainBusinessContext(), 12, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a2 != null && a2.size() > 0) {
            videoPublishEditModel.qaStruct = a2.get(0).getQaStruct();
        }
        intent.putExtra("video_edit_model", (Serializable) videoPublishEditModel);
        intent.putExtra("path", videoPublishEditModel.mMusicPath);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        intent.putExtra("new_draft_id", videoPublishEditModel.newDraftId);
        intent.putExtra("fromDraft", videoPublishEditModel.mIsFromDraft);
        ah.f109483a = "video_post_page";
        videoPublishEditModel.removeChallengeFromTitleAndStruct(this.f126707l.b());
        if (!(videoPublishEditModel.veAudioEffectParam == null || videoPublishEditModel.veAudioEffectParam.getChallenge() == null)) {
            videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(videoPublishEditModel.veAudioEffectParam.getChallenge());
        }
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.chain);
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("exclude_user_list", (Serializable) videoPublishEditModel.excludeUserList);
        intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        intent.putExtra("extra_publish_stage", videoPublishEditModel.publishStage);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
        if (videoPublishEditModel.hasRetake()) {
            a(intent, videoPublishEditModel.multiEditVideoRecordData);
        }
        intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel.draftDuetExtraInfo);
        intent.putExtra("extra_duet_layout", videoPublishEditModel.duetLayout);
        intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        return intent;
    }

    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
        if (z2) {
            w.a aVar = this.E;
            l.d(aVar, "");
            HashSet hashSet = new HashSet();
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "ai_music", 0);
            if (a2.getBoolean("ai_music_guide_show", false) || w.f128060k.getBoolean("show_combine_shoot_mode_tip", false)) {
                hashSet.add("music");
                hashSet.add("effect");
                hashSet.add("sticker");
                hashSet.add("voice");
                hashSet.add("text");
            }
            SharedPreferences.Editor edit = a2.edit();
            l.b(edit, "");
            edit.remove("ai_music_guide_show").apply();
            SharedPreferences.Editor edit2 = w.f128060k.edit();
            l.b(edit2, "");
            edit2.remove("show_combine_shoot_mode_tip").apply();
            w.a(hashSet);
            if (w.f128061l) {
                w.f128061l = false;
                Set<String> a3 = w.a();
                if (!a3.isEmpty()) {
                    com.ss.android.ugc.aweme.ah.b.a(w.f128059j, a3);
                }
                int i2 = Integer.MAX_VALUE;
                String str = "";
                for (String str2 : w.f128059j.keySet()) {
                    Integer num = w.f128059j.get(str2);
                    if (num == null) {
                        l.b();
                    }
                    Integer num2 = num;
                    if (num2 == null || num2.intValue() != -1) {
                        Integer num3 = w.f128059j.get(str2);
                        if (num3 == null) {
                            l.b();
                        }
                        if (l.a(num3.intValue(), i2) < 0) {
                            Integer num4 = w.f128059j.get(str2);
                            if (num4 == null) {
                                l.b();
                            }
                            i2 = num4.intValue();
                            l.b(str2, "");
                            str = str2;
                        }
                    }
                }
                if (com.ss.android.ugc.aweme.property.a.a.a() && w.f128059j.containsKey("music")) {
                    Integer num5 = w.f128059j.get("music");
                    if (num5 == null) {
                        l.b();
                    }
                    Integer num6 = num5;
                    if ((num6 == null || num6.intValue() != -1) && s.b() && (!l.a((Object) str, (Object) "canvas_gesture"))) {
                        s.a().storeBoolean("shown", true);
                        str = "music";
                    }
                }
                if (str.length() > 0) {
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (!str.equals("sticker")) {
                                return;
                            }
                            break;
                        case -1306084975:
                            if (str.equals("effect")) {
                                aVar.a();
                                return;
                            }
                            return;
                        case 3556653:
                            if (str.equals("text")) {
                                aVar.g();
                                return;
                            }
                            return;
                        case 104263205:
                            if (str.equals("music")) {
                                aVar.b();
                                return;
                            }
                            return;
                        case 112386354:
                            if (str.equals("voice")) {
                                aVar.d();
                                return;
                            }
                            return;
                        case 568411439:
                            if (!str.equals("countdown_sticker")) {
                                return;
                            }
                            break;
                        case 1302272874:
                            if (str.equals("cut_optimized")) {
                                aVar.f();
                                return;
                            }
                            return;
                        case 1523687778:
                            if (str.equals("canvas_gesture")) {
                                aVar.e();
                                return;
                            }
                            return;
                        case 1878342255:
                            if (!str.equals("custom_sticker")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    aVar.c();
                }
            }
        }
    }

    public final Intent a(VideoPublishEditModel videoPublishEditModel) {
        c.a(videoPublishEditModel);
        if (!c(videoPublishEditModel).isSegmentsNotValid() || I()) {
            return b(videoPublishEditModel);
        }
        if (this.f126706k.isPhotoMvMode) {
            a(R.string.hat, R.string.a9e, R.string.asg);
            return null;
        }
        a(R.string.has, R.string.a9e, R.string.c52);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z2) {
        this.H.b(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0282, code lost:
        if (r0.booleanValue() == false) goto L_0x0289;
     */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 1978
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.onCreate(android.os.Bundle):void");
    }

    private void b(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        this.f126705j = false;
        com.ss.android.ugc.gamora.editor.c.c.a(new b.e(this, intent, videoPublishEditModel));
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity, Intent intent) {
        intent.setClass(activity, VEVideoPublishEditActivity.class);
        com.ss.android.ugc.tools.d.a.c.a(activity, intent, intent.getIntExtra("extra_request_code", 1002));
    }

    @Override // androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        VideoPublishEditModel videoPublishEditModel;
        if (i2 != 4 || (videoPublishEditModel = this.f126706k) == null || !bp.j(videoPublishEditModel)) {
            for (com.ss.android.ugc.tools.view.a.a aVar : this.D) {
                if (aVar.onKeyDown(i2, keyEvent)) {
                    return true;
                }
            }
            if (i2 != 4) {
                return super.onKeyDown(i2, keyEvent);
            }
            Fragment a2 = getSupportFragmentManager().a(R.id.doz);
            if (a2 != null) {
                getSupportFragmentManager().a().a(a2).b();
                return true;
            }
            z();
            return true;
        }
        finish();
        return true;
    }

    public static void a(Context context, Intent intent) {
        intent.setClass(context, VEVideoPublishEditActivity.class);
        com.ss.android.ugc.tools.d.a.c.a(context, intent);
    }

    private void a(Intent intent, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        intent.putParcelableArrayListExtra("original_segments", multiEditVideoStatusRecordData.originalSegments);
        intent.putExtra("original_music_start", multiEditVideoStatusRecordData.originalMusicStart);
        intent.putExtra("retake_shoot_mode", 2);
        if (this.f126706k.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) this.f126706k.getStitchParams());
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(int i2, int i3) {
        this.H.a(i2, i3);
        this.p.c(i2);
        this.p.d(i3);
    }

    private void b(final boolean z2, final Intent intent, final VideoPublishEditModel videoPublishEditModel) {
        this.o = false;
        F().a(new VEListener.p() {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(83115);
            }

            @Override // com.ss.android.vesdk.VEListener.p
            public final void a() {
                VEVideoPublishEditActivity.this.o = false;
                VEVideoPublishEditActivity.this.a(z2, intent, videoPublishEditModel);
            }

            @Override // com.ss.android.vesdk.VEListener.p
            public final void b() {
                VEVideoPublishEditActivity.this.o = true;
                VEVideoPublishEditActivity.this.a(z2, intent, videoPublishEditModel);
            }
        });
    }

    private void a(int i2, int i3, int i4) {
        new a.C0731a(this).b(i2).b(i3, (DialogInterface.OnClickListener) null, false).a(i4, (DialogInterface.OnClickListener) new an(this), false).a().b();
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || a(intent) == null)) {
                intent2.putExtra("edit result", "PublishEditActivity success".concat(String.valueOf(a(intent).getString("publish result"))));
                intent2.putExtras(a(intent));
            }
            setResult(i3, intent2);
            if (i3 == -1) {
                finish();
            }
        } else if (i2 == 8) {
            if (i3 == 9) {
                Intent intent3 = new Intent();
                if (!(intent == null || a(intent) == null)) {
                    intent3.putExtras(a(intent));
                }
                setResult(i3, intent3);
                finish();
            }
        } else if (i2 == 10004 && i3 == -1 && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
            this.u.a((Effect) intent.getParcelableExtra("custom_sticker"), (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info"));
        }
    }
}
