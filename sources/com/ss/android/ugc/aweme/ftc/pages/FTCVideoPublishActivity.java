package com.ss.android.ugc.aweme.ftc.pages;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.tools.b.e;
import com.ss.android.ugc.aweme.tools.b.g;
import com.ss.android.ugc.aweme.utils.ds;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.tools.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class FTCVideoPublishActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f98815e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public VideoPublishEditModel f98816d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f98817f;

    /* renamed from: g  reason: collision with root package name */
    private int f98818g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f98819h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f98820i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f98821j;

    static {
        Covode.recordClassIndex(62832);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f98821j == null) {
            this.f98821j = new HashMap();
        }
        View view = (View) this.f98821j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f98821j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62833);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.x);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        c.a(this);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
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

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        String str;
        if (getIntent().getIntExtra("fromDraft", 0) == 1) {
            Fragment a2 = getSupportFragmentManager().a(R.id.b94);
            DraftEditTransferModel draftEditTransferModel = null;
            if (!(a2 instanceof d)) {
                a2 = null;
            }
            d dVar = (d) a2;
            if (dVar != null) {
                VideoPublishEditModel videoPublishEditModel = dVar.f98878a;
                if (videoPublishEditModel == null) {
                    l.a("mModel");
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("draft_to_edit_from", this.f98818g);
                    intent.putExtra("workspace", com.ss.android.ugc.aweme.shortvideo.WorkSpace.b.a(videoPublishEditModel));
                    StickerChallenge stickerChallenge = videoPublishEditModel.stickerChallenge;
                    if (!(stickerChallenge instanceof Parcelable)) {
                        stickerChallenge = null;
                    }
                    intent.putExtra("sticker_challenge", (Parcelable) stickerChallenge);
                    intent.putExtra("creation_id", videoPublishEditModel.creationId);
                    intent.putExtra("dir", di.f126461d);
                    intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
                    intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
                    if (videoPublishEditModel.mBeautyMetadatas != null) {
                        ArrayList<BeautyMetadata> arrayList = videoPublishEditModel.mBeautyMetadatas;
                        l.b(arrayList, "");
                        if (!arrayList.isEmpty()) {
                            intent.putParcelableArrayListExtra("extra_beauty_data", videoPublishEditModel.mBeautyMetadatas);
                        }
                    }
                    intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
                    intent.putExtra("selected_filter_id", videoPublishEditModel.mSelectedFilterId);
                    intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
                    intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
                    intent.putExtra("filter_lables", videoPublishEditModel.mCurFilterLabels);
                    intent.putExtra("filter_ids", videoPublishEditModel.mCurFilterIds);
                    intent.putExtra("smooth_skin_labels", videoPublishEditModel.mSmoothSkinLabels);
                    intent.putExtra("smooth_reshape_labels", videoPublishEditModel.mReshapeLabels);
                    intent.putExtra("smooth_eyes_labels", videoPublishEditModel.mEyesLabels);
                    intent.putExtra("smooth_tanning_labels", videoPublishEditModel.mTanningLabels);
                    intent.putExtra("extra_aweme_speed", videoPublishEditModel.videoSpeed);
                    intent.putExtra("extra_av_camera_ids", videoPublishEditModel.cameraIds);
                    intent.putExtra("extra_beauty_type", videoPublishEditModel.beautyType);
                    intent.putExtra("extra_video_record_metadata", ds.a(videoPublishEditModel.metadataMap));
                    intent.putExtra("music_start", videoPublishEditModel.mMusicStart);
                    intent.putExtra("extra_music_end", videoPublishEditModel.mMusicEnd);
                    intent.putExtra("max_duration", videoPublishEditModel.maxDuration);
                    intent.putExtra("wav_form", videoPublishEditModel.audioTrack);
                    intent.putExtra("video_segment", videoPublishEditModel.mVideoSegmentsDesc);
                    intent.putExtra("content_type", es.c(videoPublishEditModel));
                    if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
                        str = "upload";
                    } else {
                        str = "shoot";
                    }
                    intent.putExtra("content_source", str);
                    intent.putExtra("hard_encode", videoPublishEditModel.mHardEncode);
                    intent.putExtra("sticker_path", videoPublishEditModel.mStickerPath);
                    intent.putExtra("sticker_id", videoPublishEditModel.mStickerID);
                    intent.putExtra("first_sticker_music_ids", videoPublishEditModel.mFirstStickerMusicIdsJson);
                    intent.putExtra("draft_id", videoPublishEditModel.draftId);
                    intent.putExtra("isFromDraft", true);
                    intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    if (!(coverPublishModel instanceof Parcelable)) {
                        coverPublishModel = null;
                    }
                    intent.putExtra("cover_publish_model", (Parcelable) coverPublishModel);
                    intent.putExtra("effectList", videoPublishEditModel.mEffectList);
                    intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
                    intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
                    intent.putExtra("origin", videoPublishEditModel.mOrigin);
                    intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
                    intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
                    intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
                    List list = videoPublishEditModel.challenges;
                    if (!(list instanceof Serializable)) {
                        list = null;
                    }
                    intent.putExtra("challenge", (Serializable) list);
                    intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
                    intent.putExtra("video_title", videoPublishEditModel.title);
                    intent.putExtra("video_title_chain", videoPublishEditModel.chain);
                    intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
                    List list2 = videoPublishEditModel.structList;
                    if (!(list2 instanceof Serializable)) {
                        list2 = null;
                    }
                    intent.putExtra("struct_list", (Serializable) list2);
                    intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
                    List list3 = videoPublishEditModel.excludeUserList;
                    if (!(list3 instanceof Serializable)) {
                        list3 = null;
                    }
                    intent.putExtra("exclude_user_list", (Serializable) list3);
                    intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
                    if (!com.bytedance.common.utility.collection.b.a((Collection) videoPublishEditModel.geofencingSetting)) {
                        List list4 = videoPublishEditModel.geofencingSetting;
                        if (!(list4 instanceof Serializable)) {
                            list4 = null;
                        }
                        intent.putExtra("geo_fencing", (Serializable) list4);
                    }
                    intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
                    intent.putExtra("edit_loudness_param", (Parcelable) videoPublishEditModel.loudnessBalanceParam);
                    intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
                    intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
                    intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
                    intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
                    intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
                    intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
                    intent.putExtra("tag_id", videoPublishEditModel.tagId);
                    intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
                    intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
                    intent.putExtra("record_mode", videoPublishEditModel.recordMode);
                    EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
                    if (!(effectPointModel instanceof Parcelable)) {
                        effectPointModel = null;
                    }
                    intent.putExtra("time_effect", (Parcelable) effectPointModel);
                    ReactionParams reactionParams = videoPublishEditModel.reactionParams;
                    if (!(reactionParams instanceof Parcelable)) {
                        reactionParams = null;
                    }
                    intent.putExtra("reaction_params", (Parcelable) reactionParams);
                    intent.putExtra("is_muted", videoPublishEditModel.isMuted);
                    intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
                    intent.putExtra("music_origin", videoPublishEditModel.getMusicOrigin());
                    intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
                    ClientCherEffectParam clientCherEffectParam = videoPublishEditModel.veCherEffectParam;
                    if (clientCherEffectParam != null) {
                        Objects.requireNonNull(clientCherEffectParam, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
                    }
                    AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
                    if (audioEffectParam != null) {
                        Objects.requireNonNull(audioEffectParam, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("extra_ve_audio_effect_param", (Parcelable) audioEffectParam);
                    }
                    AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
                    if (audioRecorderParam != null) {
                        Objects.requireNonNull(audioRecorderParam, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("audio_record_param", (Parcelable) audioRecorderParam);
                    }
                    g.a(getIntent(), q.a(videoPublishEditModel), e.PUBLISH, e.EDIT);
                    intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
                    InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                    if (!(infoStickerModel instanceof Parcelable)) {
                        infoStickerModel = null;
                    }
                    intent.putExtra("infosticker_model", (Parcelable) infoStickerModel);
                    intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
                    if (videoPublishEditModel.isMvThemeVideoType()) {
                        intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
                    }
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                    if (!(multiEditVideoStatusRecordData instanceof Parcelable)) {
                        multiEditVideoStatusRecordData = null;
                    }
                    intent.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
                    intent.setClass(this, VEVideoPublishEditActivity.class);
                    intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
                    EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                    if (previewInfo != null) {
                        Objects.requireNonNull(previewInfo, "null cannot be cast to non-null type android.os.Parcelable");
                        intent.putExtra("extra_edit_preview_info", (Parcelable) previewInfo);
                    }
                    DraftEditTransferModel draftEditTransferModel2 = videoPublishEditModel.draftEditTransferModel;
                    if (draftEditTransferModel2 != null) {
                        if (draftEditTransferModel2 instanceof Parcelable) {
                            draftEditTransferModel = draftEditTransferModel2;
                        }
                        intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
                    }
                    if (!com.bytedance.common.utility.collection.b.a((Collection) videoPublishEditModel.messageBubbleTexts)) {
                        intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
                    }
                    intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
                    intent.putExtra("use_music_before_edit", videoPublishEditModel.mUseMusicBeforeEdit);
                    intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
                    intent.putStringArrayListExtra("extra_camera_lens_info", videoPublishEditModel.cameraLensInfo);
                    intent.putExtra("extra_photo_mv_mode", videoPublishEditModel.isPhotoMvMode);
                    Boolean bool = videoPublishEditModel.isSoundLoop;
                    l.b(bool, "");
                    intent.putExtra("extra_is_sound_loop", bool.booleanValue());
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
                    startActivity(intent);
                    finish();
                    return;
                }
            }
            throw new IllegalStateException("Empty VideoPublishEditModel in FTC Publish Page.");
        }
        super.onBackPressed();
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCVideoPublishActivity f98822a;

        static {
            Covode.recordClassIndex(62834);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FTCVideoPublishActivity fTCVideoPublishActivity) {
            this.f98822a = fTCVideoPublishActivity;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String str;
            String str2;
            String obj;
            this.f98822a.onBackPressed();
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            VideoPublishEditModel videoPublishEditModel = this.f98822a.f98816d;
            Integer num = null;
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.creationId;
            } else {
                str = null;
            }
            com.ss.android.ugc.tools.f.b a2 = bVar.a("creation_id", str).a("enter_from", "video_post_page");
            DmtEditText dmtEditText = (DmtEditText) this.f98822a.d_(R.id.axx);
            l.b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            if (text == null || (obj = text.toString()) == null) {
                str2 = null;
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                str2 = p.b((CharSequence) obj).toString();
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("desc_detail", str2);
            VideoPublishEditModel videoPublishEditModel2 = this.f98822a.f98816d;
            if (videoPublishEditModel2 == null || videoPublishEditModel2.draftId != 0) {
                VideoPublishEditModel videoPublishEditModel3 = this.f98822a.f98816d;
                if (videoPublishEditModel3 != null) {
                    num = Integer.valueOf(videoPublishEditModel3.draftId);
                }
                a3.a("draft_id", num);
            }
            r.a("click_back", a3.f149193a);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        getIntent();
        c.a(this, bundle);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        boolean z;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bb);
        c.a(this, getIntent(), bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("args");
        if (!(serializableExtra instanceof VideoPublishEditModel)) {
            serializableExtra = null;
        }
        this.f98816d = (VideoPublishEditModel) serializableExtra;
        if (getIntent().getIntExtra("fromDraft", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f98820i = z;
        this.f98817f = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        this.f98819h = getIntent().getBooleanExtra("extra_enter_from_live", false);
        this.f98818g = getIntent().getIntExtra("draft_to_edit_from", 0);
        if (this.f98816d == null) {
            com.ss.android.ugc.tools.utils.q.b("VideoPublishActivity onCreate error, model == null");
            finish();
        } else {
            a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("args", this.f98816d);
            bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
            bundle2.putBoolean("enter_record_from_other_platform", this.f98817f);
            bundle2.putBoolean("extra_enter_from_live", this.f98819h);
            bundle2.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
            bundle2.putBoolean("fromDraft", this.f98820i);
            i supportFragmentManager = getSupportFragmentManager();
            Fragment a2 = supportFragmentManager.a(R.id.b94);
            if (!(a2 instanceof d) || a2 == null) {
                d dVar = new d();
                dVar.setArguments(bundle2);
                supportFragmentManager.a().a(R.id.b94, dVar).b();
            }
            ((TuxCompoundIconTextView) d_(R.id.q9)).setOnClickListener(new b(this));
            Typeface a3 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b);
            if (a3 != null) {
                ((TuxTextView) d_(R.id.euz)).setTypeface(a3);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.d(strArr, "");
        l.d(iArr, "");
        com.ss.android.ugc.aweme.utils.permission.a.a(this, i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Fragment a2 = getSupportFragmentManager().a(R.id.b94);
        if ((a2 instanceof d) && a2 != null && a2.isAdded()) {
            a2.onActivityResult(i2, i3, intent);
        }
    }
}
