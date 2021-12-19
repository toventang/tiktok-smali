package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.t;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.bh;
import com.ss.android.ugc.aweme.property.m;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.e;
import com.ss.android.ugc.aweme.shortvideo.j.k;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.ae;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.ss.android.ugc.aweme.tools.draft.az;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.aweme.utils.fw;
import com.ss.android.ugc.tools.d.a.c;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.runtime.d;
import com.ss.ugc.aweme.performance.a.a;
import com.zhiliaoapp.musically.R;
import dmt.av.video.aj;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class VideoPublishActivity extends b implements SelectSaveLocalOptionActivity.b, k {

    /* renamed from: d  reason: collision with root package name */
    public cj f131214d;

    /* renamed from: e  reason: collision with root package name */
    public VideoPublishEditModel f131215e;

    /* renamed from: f  reason: collision with root package name */
    public long f131216f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f131217g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f131218h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f131219i;

    /* renamed from: j  reason: collision with root package name */
    private int f131220j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f131221k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f131222l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f131223m;
    private boolean n;

    static {
        Covode.recordClassIndex(85966);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final String bt_() {
        return "video_post_page";
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.k
    public final boolean bs_() {
        return this.f131221k;
    }

    private boolean j() {
        if (getIntent().getIntExtra("fromDraft", 0) != 0) {
            return true;
        }
        return false;
    }

    public void finish() {
        this.f131221k = false;
        super.finish();
        overridePendingTransition(0, R.anim.x);
    }

    public final VideoPublishViewModel h() {
        return (VideoPublishViewModel) t.a(this).a(VideoPublishViewModel.class);
    }

    private void m() {
        ae.a(this, new cf(this));
        ae.b(this, new cg(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
    public final void b() {
        if (this.f131214d.I != null) {
            this.f131214d.I.b().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
    public final void a() {
        if (this.f131214d.I != null) {
            this.f131214d.I.b().a();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.analysis.b
    public final Analysis f() {
        if (super.f() == null) {
            return super.f();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.f131215e.creationId);
        hashMap.put("is_story_shoot", "0");
        return super.f().setExtraMap(hashMap);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.tools.f.b g() {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_post_page").a("creation_id", this.f131215e.creationId);
        if (!TextUtils.isEmpty(this.f131215e.newDraftId)) {
            a2.a("new_draft_id", this.f131215e.newDraftId);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        cj cjVar = (cj) getSupportFragmentManager().a(R.id.b94);
        if (cjVar != null) {
            cjVar.c("enter_video_edit_page");
            cjVar.k();
            cjVar.l();
            Intent a2 = az.a(cjVar.K, this.f131220j);
            a2.setClass(this, VEVideoPublishEditActivity.class);
            c.a(this, a2);
        }
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        this.f131216f = System.currentTimeMillis();
        if (getSupportFragmentManager().e() > 0) {
            getSupportFragmentManager().c();
            return;
        }
        h().a(j(), this.f131215e.mIsFromDraft);
        q.a("VideoPublishActivity", "system back event");
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        this.f131221k = false;
        super.onDestroy();
        b.a.f132249a.leave(this, "video_publish");
        AVCommerceServiceImpl.h().g();
        c.a(this);
        AVCommerceServiceImpl.h().g();
        com.ss.android.ugc.aweme.shortvideo.p.c.a("normal").a("at_post_page");
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
        if (this.f131215e != null) {
            b.a.f132249a.pause(this, "video_publish", this.f131215e.creationId, this.f131215e.mShootWay);
        }
        fw.a("tool_publish_enter");
        a.C4076a.a().b("tool_publish");
        d.b().a(5);
    }

    private void n() {
        long currentTimeMillis;
        long longExtra = getIntent().getLongExtra("draft_to_edit_start_time", -1);
        if (longExtra == -1) {
            currentTimeMillis = -1;
        } else {
            currentTimeMillis = System.currentTimeMillis() - longExtra;
        }
        long longExtra2 = getIntent().getLongExtra("draft_modify_time", -1);
        long longExtra3 = getIntent().getLongExtra("draft_file_size", -1);
        int i2 = 1;
        EditPreviewInfo previewInfo = this.f131215e.getPreviewInfo();
        if (previewInfo != null) {
            i2 = previewInfo.getVideoList().size();
        }
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_draft_to_publish", new com.ss.android.ugc.tools.f.b().a("duration", currentTimeMillis).a("video_size", longExtra3).a("video_count", i2).a("music_id", this.f131215e.musicId).a("modify_time", longExtra2).f149193a);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (this.f131216f != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f131216f;
            if (currentTimeMillis < 10000) {
                Cif.a.a("click_back_in_publish", currentTimeMillis);
            }
            this.f131216f = -1;
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

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public void onResume() {
        VideoPublishEditModel videoPublishEditModel;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", true);
        super.onResume();
        a.C4076a.a().a("tool_publish");
        d.b().a(4);
        if (!(this.n || (videoPublishEditModel = this.f131215e) == null || videoPublishEditModel.clickGoNextBtnTime == -1)) {
            this.n = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f131215e.clickGoNextBtnTime;
            com.ss.android.ugc.aweme.utils.d.a("tool_performance_publish_first_frame", new com.ss.android.ugc.tools.f.b().a("shoot_way", this.f131215e.mShootWay).a("enter_from", this.f131215e.enterFrom).a("content_type", es.c(this.f131215e)).a("content_source", es.a(this.f131215e)).a("creation_id", this.f131215e.creationId).a("first_frame_duration", currentTimeMillis).f149193a);
            Cif.a.a("click_next_in_edit", currentTimeMillis);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", false);
    }

    private void k() {
        final boolean j2 = j();
        if (!j2) {
            if (this.f131215e.mIsFromDraft) {
                this.f131218h.setVisibility(0);
            }
            this.f131215e.challenges = (List) getIntent().getSerializableExtra("challenge");
            this.f131215e.tagId = a(getIntent(), "tag_id");
        } else {
            this.f131217g.setText(R.string.a2j);
            this.f131218h.setVisibility(0);
            if (this.f131215e.isShoutout()) {
                this.f131217g.setText("");
                this.f131218h.setVisibility(8);
            }
            this.f131215e.mIsFromDraft = true;
            VideoLengthChecker.a().a(this, this.f131215e);
            n();
            q.a("[Filter Intensity] VideoPublishActivity FromDraftBox mSelectedFilterIntensity:" + this.f131215e.mSelectedFilterIntensity + " mSelectedId:" + this.f131215e.mSelectedId + " mUseFilter:" + this.f131215e.mUseFilter);
        }
        this.f131218h.setOnClickListener(new ce(this, j2));
        this.f131217g.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85967);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                VideoPublishActivity.this.f131216f = System.currentTimeMillis();
                VideoPublishActivity.this.h().a(j2, VideoPublishActivity.this.f131215e.mIsFromDraft);
            }
        });
        m();
        Bundle bundle = new Bundle();
        bundle.putSerializable("args", this.f131215e);
        bundle.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
        bundle.putInt("extra_stick_point_type", getIntent().getIntExtra("extra_stick_point_type", 0));
        bundle.putBoolean("enter_record_from_other_platform", this.f131219i);
        bundle.putBoolean("extra_enter_from_live", this.f131222l);
        bundle.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        if (getIntent().getBooleanExtra("review_video_fast_publish", false)) {
            bundle.putBoolean("review_video_fast_publish", true);
        }
        i supportFragmentManager = getSupportFragmentManager();
        cj cjVar = (cj) supportFragmentManager.a(R.id.b94);
        this.f131214d = cjVar;
        if (cjVar == null) {
            cj cjVar2 = new cj();
            this.f131214d = cjVar2;
            cjVar2.setArguments(bundle);
            supportFragmentManager.a().a(R.id.b94, this.f131214d).b();
        }
        a(j2);
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        c.a(this, bundle);
    }

    private void a(boolean z) {
        e.a(this.f131215e, z);
        e.a(this.f131215e);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
    public final void a(int i2) {
        if (this.f131214d.I != null) {
            this.f131214d.I.b().a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Boolean bool) {
        com.ss.android.ugc.aweme.shortvideo.j.a aVar;
        if (this.f131215e.isShoutout()) {
            new a.C0731a(this).b(R.string.bow).a(R.string.bov, (DialogInterface.OnClickListener) new ch(this), false).b(R.string.box, ci.f131593a, false).a().c();
            return null;
        } else if (com.ss.android.ugc.gamora.recorder.m.d.a(this.f131215e)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.ob).a();
            return null;
        } else {
            if (!bool.booleanValue()) {
                r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                if (this.f131215e == null) {
                    q.c("VideoPublishActivity model == null saveInfoForEdit failed");
                } else {
                    int a2 = com.ss.android.ugc.aweme.common.e.a(this);
                    VideoPublishEditModel videoPublishEditModel = this.f131215e;
                    bl.a(a2, videoPublishEditModel, (Intent) null, aj.a(videoPublishEditModel.videoPath()), "click_back_button");
                    cj cjVar = (cj) getSupportFragmentManager().a(R.id.b94);
                    cjVar.c("enter_video_edit_page");
                    cjVar.k();
                    cjVar.l();
                    VideoPublishEditModel videoPublishEditModel2 = cjVar.K;
                    String str = videoPublishEditModel2.title;
                    String str2 = videoPublishEditModel2.chain;
                    boolean z = videoPublishEditModel2.disableDeleteChain;
                    List list = videoPublishEditModel2.structList;
                    int i2 = videoPublishEditModel2.isPrivate;
                    List list2 = videoPublishEditModel2.challenges;
                    l.d(videoPublishEditModel2, "");
                    if (videoPublishEditModel2.isMvThemeVideoType()) {
                        aVar = new com.ss.android.ugc.aweme.shortvideo.j.a(videoPublishEditModel2.mvCreateVideoData.videoCoverStartTime, videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath, videoPublishEditModel2.getCoverPublishModel());
                    } else {
                        aVar = new com.ss.android.ugc.aweme.shortvideo.j.a((int) (videoPublishEditModel2.mVideoCoverStartTm * 1000.0f), videoPublishEditModel2.getCoverPublishModel());
                    }
                    k kVar = new k(str, str2, z, list, i2, list2, aVar, videoPublishEditModel2.stickerChallenge, videoPublishEditModel2.compileProbeResult, videoPublishEditModel2.geofencingSetting, videoPublishEditModel2.changeStickerStruct);
                    kVar.f128606g = videoPublishEditModel2.commentSetting;
                    kVar.f128610k = videoPublishEditModel2.commerceData;
                    kVar.p = videoPublishEditModel2.allowAutoCaptionSetting;
                    kVar.f128611l = videoPublishEditModel2.allowDownloadSetting;
                    kVar.n = videoPublishEditModel2.excludeUserList;
                    kVar.o = videoPublishEditModel2.allowRecommend;
                    kVar.q = videoPublishEditModel2.isDraftMusicIllegal;
                    kVar.r = videoPublishEditModel2.playlist_name;
                    kVar.s = videoPublishEditModel2.playlist_id;
                    kVar.v = videoPublishEditModel2.musicUsageConfirmation;
                    kVar.w = videoPublishEditModel2.tagUserList;
                    DuetStickerStruct a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(videoPublishEditModel2.getMainBusinessContext());
                    if (!(a3 == null || a3.getUserList() == null || a3.getUserList().size() <= 0)) {
                        for (DuetStickerUserStruct duetStickerUserStruct : a3.getUserList()) {
                            kVar.x.add(duetStickerUserStruct.f134788e);
                        }
                    }
                    com.ss.android.ugc.d.a.c.a(kVar);
                }
            } else {
                i();
            }
            a("back event");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        cj cjVar = this.f131214d;
        if (SettingsManager.a().a("tool_enable_publish_area_config", true)) {
            cjVar.w.setEnabled(false);
            cjVar.x.setEnabled(false);
        }
        g.a().o().a("publish_page_finish");
        if (!TextUtils.isEmpty(str)) {
            q.a("VideoPublishActivity", "finish video publish page, reason: ".concat(String.valueOf(str)));
            cr.a().q = "";
            finish();
            h.b(b.a.a().a("publish_page_finish").a());
            return;
        }
        throw new IllegalArgumentException("finish reason can't be empty");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        VideoPublishActivity videoPublishActivity;
        boolean z;
        int i2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", true);
        q.d("VideoPublishActivity onCreate");
        b.a.f132249a.enter(this, "video_publish");
        fw.a("tool_publish_enter", bh.b(), (long) bh.c());
        com.ss.android.ugc.aweme.property.h.a(this, m.b.f118585a);
        try {
            super.onCreate(bundle);
        } catch (Exception e2) {
            if (!com.ss.android.ugc.aweme.shortvideo.util.az.a(bundle, e2) || !com.ss.android.ugc.aweme.shortvideo.util.az.a(this)) {
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
                throw e2;
            }
            q.a("VideoPublishActivity", "view state restore crash fixed");
        }
        this.f131221k = true;
        setContentView(R.layout.ce);
        this.f131217g = (TextView) findViewById(R.id.q9);
        this.f131218h = (TextView) findViewById(R.id.a1p);
        Intent intent = getIntent();
        c.a(this, intent, bundle);
        try {
            this.f131215e = (VideoPublishEditModel) intent.getSerializableExtra("args");
            this.f131219i = intent.getBooleanExtra("enter_record_from_other_platform", false);
            this.f131222l = intent.getBooleanExtra("extra_enter_from_live", false);
            this.f131223m = intent.getBooleanExtra("extra_enter_from_shoutout_sync", false);
        } catch (RuntimeException e3) {
            if (a(getIntent()) != null) {
                i2 = com.ss.android.ugc.tools.d.a.a.a(a(getIntent()));
            } else {
                i2 = 0;
            }
            q.b("StickerInfo, " + e3.getMessage() + ", bundleSize: " + i2);
            g.a().I().a("bundle_stickerinfo", 0, new ar().a("exception", e3.getMessage()).a("bundleSize", Integer.valueOf(i2)).a());
        }
        if (this.f131215e == null) {
            if (this.f131223m) {
                new bn("shoutOuts");
                String a2 = a(intent, "extra_shoutout_video_path");
                String a3 = a(intent, "extra_shoutout_pid");
                String a4 = a(intent, "extra_shoutout_music_id");
                VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
                this.f131215e = videoPublishEditModel;
                videoPublishEditModel.creationId = UUID.randomUUID().toString();
                videoPublishEditModel.mOrigin = 0;
                videoPublishEditModel.mFromCut = true;
                videoPublishEditModel.isFastImport = true;
                videoPublishEditModel.mShootWay = com.ss.android.ugc.aweme.shoutouts.d.shootWay;
                int[] iArr = new int[10];
                if (VEUtils.getVideoFileInfo(a2, iArr) == 0) {
                    EditVideoSegment editVideoSegment = new EditVideoSegment(a2, null, new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7], iArr[6]));
                    editVideoSegment.setVideoCutInfo(new VideoCutInfo(0, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(editVideoSegment);
                    videoPublishEditModel.setPreviewInfo(new com.ss.android.ugc.aweme.shortvideo.edit.model.e(g.a().i().getVideoWidth(), g.a().i().getVideoHeight()).a(arrayList));
                    videoPublishEditModel.videoWidth();
                    ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
                    arrayList2.add(new ImportVideoInfo(iArr[0], iArr[1], iArr[6], iArr[8], a2, (long) iArr[3], (long) iArr[3], null, null, iArr[7], 1.0f, a2));
                    videoPublishEditModel.importInfoList = arrayList2;
                    videoPublishEditModel.mDir = dj.f126461d;
                    Workspace a5 = com.ss.android.ugc.aweme.shortvideo.WorkSpace.b.a(videoPublishEditModel);
                    videoPublishEditModel.mOutputFile = a5.h().getPath();
                    videoPublishEditModel.mEncodedAudioOutputFile = a5.i().getPath();
                    videoPublishEditModel.mParallelUploadOutputFile = a5.j().getPath();
                    videoPublishEditModel.videoCount = 1;
                    videoPublishEditModel.voiceVolume = 1.0f;
                    videoPublishEditModel.mShootMode = -1;
                    videoPublishEditModel.mDuetFrom = null;
                    videoPublishEditModel.musicVolume = 1.0f;
                    g.a().c();
                    videoPublishEditModel.setNewVersion(3);
                    videoPublishEditModel.generateVideoCoverPath();
                    com.ss.android.ugc.aweme.shortvideo.edit.q qVar = new com.ss.android.ugc.aweme.shortvideo.edit.q(videoPublishEditModel);
                    videoPublishEditModel.mShoutOutsData = new com.ss.android.ugc.aweme.shoutouts.d();
                    videoPublishEditModel.mShoutOutsData.setShoutOutsMode(com.ss.android.ugc.aweme.shoutouts.d.MODE_POST);
                    videoPublishEditModel.mShoutOutsData.setProductId(a3);
                    videoPublishEditModel.mShoutOutsData.setMusicId(a4);
                    videoPublishEditModel.mShoutOutsData.setPostVideoPath(a2);
                    qVar.a(false, false);
                }
                k();
            } else {
                q.b("VideoPublishActivity onCreate error, model == null");
                HashMap hashMap = new HashMap();
                hashMap.put("intent", intent.toString());
                com.bytedance.services.apm.api.a.a("VideoPublishActivity onCreate error, model == null", hashMap);
            }
            videoPublishActivity = this;
        } else {
            k();
            videoPublishActivity = this;
            if (bz.a(videoPublishActivity.f131215e) && !bz.b(videoPublishActivity.f131215e)) {
                bz.c(videoPublishActivity.f131215e);
                EditPreviewInfo previewInfo = videoPublishActivity.f131215e.getPreviewInfo();
                l.d(previewInfo, "");
                if (previewInfo.getPreviewVideoLength() == 0 || previewInfo.getPreviewVideoLength() < 61000) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    new a.C0731a(videoPublishActivity).b(R.string.bcq, (DialogInterface.OnClickListener) new ca(videoPublishActivity), false).a(R.string.bcr, (DialogInterface.OnClickListener) new cb(videoPublishActivity), false).a(R.string.bct).b(R.string.bd3).a().b();
                } else {
                    new a.C0731a(videoPublishActivity).b(R.string.bcq, (DialogInterface.OnClickListener) new cc(videoPublishActivity), false).a(R.string.bcr, (DialogInterface.OnClickListener) new cd(videoPublishActivity), false).a(R.string.bct).b(R.string.bcs).a().b();
                }
                r.a("show_audio_clear_popup", g().f149193a);
            }
        }
        if (videoPublishActivity.f131215e != null) {
            int intExtra = intent.getIntExtra("draft_to_edit_from", 0);
            videoPublishActivity.f131220j = intExtra;
            videoPublishActivity.f131215e.mDraftToEditFrom = intExtra;
            VideoPublishEditModel videoPublishEditModel2 = videoPublishActivity.f131215e;
            videoPublishEditModel2.mCropVideo = videoPublishEditModel2.isChangeMultiEditData();
        }
        com.ss.android.ugc.aweme.shortvideo.p.c.a("normal").a("at_post_page", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Boolean bool, Boolean bool2) {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_post_page").a("creation_id", this.f131215e.creationId);
        if (this.f131215e.draftId != 0) {
            a2.a("draft_id", this.f131215e.draftId);
        }
        if (!TextUtils.isEmpty(this.f131215e.newDraftId)) {
            a2.a("new_draft_id", this.f131215e.newDraftId);
        }
        if (this.f131215e.mDraftToEditFrom == 0) {
            a2.a("draft_way", "general_draft_list");
        }
        com.ss.android.ugc.aweme.utils.d.a("click_draft_edit_cancel", a2.f149193a);
        if (!bool.booleanValue() && bool2.booleanValue()) {
            Intent intent = new Intent();
            if (this.f131220j == 0) {
                intent.setFlags(536870912);
                com.ss.android.ugc.aweme.shortvideo.r.a.a().a((Activity) this, intent, false);
            }
        }
        if (bool.booleanValue()) {
            g.a().c().a(false);
            a("cancel draft box edit");
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f131215e.creationId).a("shoot_way", this.f131215e.mShootWay);
            if (this.f131215e.draftId != 0) {
                a3.a("draft_id", this.f131215e.draftId);
            }
            if (!TextUtils.isEmpty(this.f131215e.newDraftId)) {
                a3.a("new_draft_id", this.f131215e.newDraftId);
            }
            r.a("video_post_page_cancel", a3.f149193a);
        }
        g.a().o().b();
        return null;
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        com.ss.android.ugc.aweme.utils.permission.a.a(this, i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        cj cjVar = this.f131214d;
        if (cjVar != null && cjVar.isAdded()) {
            this.f131214d.onActivityResult(i2, i3, intent);
        }
    }
}
