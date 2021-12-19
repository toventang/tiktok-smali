package com.ss.android.ugc.aweme.tools.draft;

import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import b.g;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.p;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.utils.ds;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicInteger f139422a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    static com.ss.android.ugc.aweme.widgetcompat.a f139423b;

    /* renamed from: c  reason: collision with root package name */
    public static final az f139424c = new az();

    private az() {
    }

    public static final class e implements FetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f139428a;

        static {
            Covode.recordClassIndex(91160);
        }

        @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onSuccess() {
            q.d("fetchRequirement onSuccess");
            this.f139428a.a((Object) null);
        }

        e(j jVar) {
            this.f139428a = jVar;
        }

        @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onFailed(Exception exc) {
            q.b("fetchRequirement fail : ".concat(String.valueOf(exc)));
            this.f139428a.a((Object) null);
        }
    }

    static {
        Covode.recordClassIndex(91155);
    }

    public static final class a implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f139425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f139426b;

        static {
            Covode.recordClassIndex(91156);
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            this.f139426b.editMusicSyncMode = false;
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            this.f139425a.a(z.f158842a);
        }

        a(j jVar, VideoPublishEditModel videoPublishEditModel) {
            this.f139425a = jVar;
            this.f139426b = videoPublishEditModel;
        }
    }

    public static final class d implements IFetchEffectListListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f139427a;

        static {
            Covode.recordClassIndex(91159);
        }

        d(j jVar) {
            this.f139427a = jVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            q.b("uniformFetchList fail : ".concat(String.valueOf(exceptionResult)));
            this.f139427a.a((Object) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            l.d(list, "");
            q.d("uniformFetchList onSuccess");
            this.f139427a.a((Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ j $downloadTaskSource;

        static {
            Covode.recordClassIndex(91158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(1);
            this.$downloadTaskSource = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            this.$downloadTaskSource.a((Object) null);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f139429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f139430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f139431c;

        static {
            Covode.recordClassIndex(91161);
        }

        f(long j2, androidx.fragment.app.e eVar, h.f.a.a aVar) {
            this.f139429a = j2;
            this.f139430b = eVar;
            this.f139431c = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            q.d("VideoPublish finish prepareEffectPlatform, cost: " + (System.currentTimeMillis() - this.f139429a) + "ms.");
            androidx.fragment.app.e eVar = this.f139430b;
            if (az.f139422a.decrementAndGet() == 0 && az.f139423b != null) {
                com.ss.android.ugc.aweme.widgetcompat.a aVar = az.f139423b;
                if (aVar == null) {
                    l.b();
                }
                if (aVar.isShowing() && eVar != null && !eVar.isFinishing()) {
                    com.ss.android.ugc.aweme.widgetcompat.a aVar2 = az.f139423b;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    az.f139423b = null;
                }
            }
            this.f139431c.invoke();
            return z.f158842a;
        }
    }

    public static Intent a(VideoPublishEditModel videoPublishEditModel, int i2) {
        String str;
        l.d(videoPublishEditModel, "");
        Intent intent = new Intent();
        intent.putExtra("upload_method", videoPublishEditModel.uploadMethod);
        intent.putExtra("draft_to_edit_from", i2);
        intent.putExtra("workspace", com.ss.android.ugc.aweme.shortvideo.WorkSpace.b.a(videoPublishEditModel));
        intent.putExtra("sticker_challenge", (Parcelable) videoPublishEditModel.stickerChallenge);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("dir", di.f126461d);
        intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
        intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
        if (videoPublishEditModel.mBeautyMetadatas != null && !videoPublishEditModel.mBeautyMetadatas.isEmpty()) {
            intent.putParcelableArrayListExtra("extra_beauty_data", videoPublishEditModel.mBeautyMetadatas);
        }
        intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
        intent.putExtra("selected_filter_id", videoPublishEditModel.mSelectedFilterId);
        intent.putExtra("selected_filter_name", videoPublishEditModel.mSelectedFilterLabel);
        intent.putExtra("selected_filter_res_id", videoPublishEditModel.mSelectedFilterResId);
        intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
        intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
        intent.putExtra("record_filter_names", videoPublishEditModel.mRecordFilterLabels);
        intent.putExtra("record_filter_values", videoPublishEditModel.mRecordFilterValues);
        intent.putExtra("record_beauty_mob_param", (Parcelable) videoPublishEditModel.mBeautyMobParam);
        intent.putExtra("record_filter_ids", videoPublishEditModel.mRecordFilterIds);
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
        intent.putExtra("new_draft_id", videoPublishEditModel.newDraftId);
        intent.putExtra("isFromDraft", true);
        intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
        intent.putExtra("cover_publish_model", (Parcelable) videoPublishEditModel.getCoverPublishModel());
        intent.putExtra("effectList", videoPublishEditModel.mEffectList);
        if (videoPublishEditModel.mEffectList != null) {
            Integer.valueOf(videoPublishEditModel.mEffectList.size());
        }
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
        intent.putExtra("origin", videoPublishEditModel.mOrigin);
        intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
        intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
        intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
        intent.putExtra("challenge", (Serializable) videoPublishEditModel.challenges);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.chain);
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("exclude_user_list", (Serializable) videoPublishEditModel.excludeUserList);
        intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
        if (!com.bytedance.common.utility.collection.b.a((Collection) videoPublishEditModel.geofencingSetting)) {
            intent.putExtra("geo_fencing", (Serializable) videoPublishEditModel.geofencingSetting);
        }
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
        intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
        intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
        intent.putExtra("edit_video_length", videoPublishEditModel.mCropVideo);
        intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
        intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
        intent.putExtra("shooted_shoot_mode", videoPublishEditModel.mShootedShootMode);
        intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
        intent.putExtra("tag_id", videoPublishEditModel.tagId);
        intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
        intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
        intent.putExtra("record_mode", videoPublishEditModel.recordMode);
        intent.putExtra("record_game_score", videoPublishEditModel.gameScore);
        intent.putExtra("extra_auto_enhance_state", videoPublishEditModel.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", videoPublishEditModel.autoEnhanceType);
        intent.putExtra("time_effect", (Parcelable) videoPublishEditModel.mTimeEffect);
        intent.putExtra("reaction_params", (Parcelable) videoPublishEditModel.reactionParams);
        intent.putExtra("is_muted", videoPublishEditModel.isMuted);
        intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
        intent.putExtra("record_bgm_delay", videoPublishEditModel.recordBgmDelay);
        intent.putExtra("edit_loudness_param", (Parcelable) videoPublishEditModel.loudnessBalanceParam);
        intent.putExtra("music_origin", videoPublishEditModel.getMusicOrigin());
        intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.veCherEffectParam);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", (Parcelable) videoPublishEditModel.veAudioEffectParam);
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            intent.putExtra("audio_record_param", (Parcelable) videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.creativeFlowData != null) {
            intent.putExtra("creative_flow_data", (Parcelable) videoPublishEditModel.creativeFlowData);
        }
        if (videoPublishEditModel.commentVideoModel != null) {
            intent.putExtra("comment_video_model", videoPublishEditModel.commentVideoModel);
        }
        com.ss.android.ugc.aweme.tools.b.g.a(intent, com.ss.android.ugc.aweme.shortvideo.q.a(videoPublishEditModel), com.ss.android.ugc.aweme.tools.b.e.PUBLISH, com.ss.android.ugc.aweme.tools.b.e.EDIT);
        intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
        intent.putExtra("infosticker_model", (Parcelable) videoPublishEditModel.infoStickerModel);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        if (dh.a() != 0) {
            com.ss.android.ugc.aweme.port.in.g.a().A().a();
        }
        intent.putExtra("av_upload_struct", videoPublishEditModel.uploadMiscInfoStruct);
        if (videoPublishEditModel.isMvThemeVideoType()) {
            intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
        }
        intent.putExtra("extra_multi_edit_video_data", (Parcelable) videoPublishEditModel.multiEditVideoRecordData);
        SharedARModel sharedARModel = videoPublishEditModel.getSharedARModel();
        if (sharedARModel != null) {
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        intent.putExtra("extra_stickpoint_mode", videoPublishEditModel.isStickPointMode);
        intent.putExtra("key_stick_point_data", videoPublishEditModel.stickPointData);
        intent.putExtra("cutsame_data", videoPublishEditModel.cutSameEditData);
        intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
        if (videoPublishEditModel.getPreviewInfo() != null) {
            intent.putExtra("extra_edit_preview_info", (Parcelable) videoPublishEditModel.getPreviewInfo());
        }
        if (videoPublishEditModel.draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) videoPublishEditModel.draftEditTransferModel);
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) videoPublishEditModel.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
        }
        intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
        intent.putExtra("use_music_before_edit", videoPublishEditModel.mUseMusicBeforeEdit);
        w.f128061l = false;
        intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
        intent.putStringArrayListExtra("extra_camera_lens_info", videoPublishEditModel.cameraLensInfo);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
        intent.putExtra("extra_publish_stage", videoPublishEditModel.publishStage);
        intent.putExtra("extra_photo_mv_mode", videoPublishEditModel.isPhotoMvMode);
        intent.putExtra("extra_photo_mv_mode_1080p", videoPublishEditModel.isPhotoMvMode1080p);
        intent.putExtra("is_photo_mv_music", videoPublishEditModel.isPhotoMvMusic);
        Boolean bool = videoPublishEditModel.isSoundLoop;
        l.b(bool, "");
        intent.putExtra("extra_is_sound_loop", bool.booleanValue());
        intent.putExtra("draft_music_legal_param", videoPublishEditModel.isDraftMusicIllegal);
        intent.putExtra("extra_audio_aec_delay_time", videoPublishEditModel.audioAecDelayTime);
        intent.putExtra("enter_edit_page_method", "click_back_button");
        intent.putExtra("extra_current_zoom_value", videoPublishEditModel.currentZoomValue);
        if (videoPublishEditModel.isDuet()) {
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel.draftDuetExtraInfo);
            intent.putExtra("extra_duet_layout", videoPublishEditModel.duetLayout);
            intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        }
        intent.putExtra("is_west_window_exist", videoPublishEditModel.isWestWindowExistStr);
        if (videoPublishEditModel.canvasVideoData != null) {
            intent.putExtra("photo_canvas_data", videoPublishEditModel.canvasVideoData);
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) videoPublishEditModel.tagUserList)) {
            intent.putExtra("extra_social_video_tag_list", videoPublishEditModel.tagUserList);
        }
        intent.putExtra("is_audio_enhance", videoPublishEditModel.isAudioEnhance);
        intent.putExtra("edit_music_sync_mode", videoPublishEditModel.editMusicSyncMode);
        Cut2EditTransferModel cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel;
        if (!(cut2EditTransferModel instanceof Parcelable)) {
            cut2EditTransferModel = null;
        }
        intent.putExtra("cut_to_edit_transfer_model", (Parcelable) cut2EditTransferModel);
        intent.putExtra("draft_save_time", videoPublishEditModel.draftSaveTime);
        return intent;
    }

    public static void a(VideoPublishEditModel videoPublishEditModel, androidx.fragment.app.e eVar, h.f.a.a<z> aVar) {
        String str;
        i<TResult> iVar;
        l.d(videoPublishEditModel, "");
        l.d(eVar, "");
        l.d(aVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        j jVar = new j();
        f139422a.incrementAndGet();
        if (f139423b == null && eVar != null && !eVar.isFinishing()) {
            f139423b = com.ss.android.ugc.aweme.widgetcompat.a.a(eVar, eVar.getString(R.string.fe8));
        }
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        if (videoPublishEditModel.mEffectList == null || videoPublishEditModel.mEffectList.isEmpty()) {
            q.d("ignore fetch specialfilter because of empty effects");
            jVar.a((Object) null);
        } else {
            HashSet hashSet = new HashSet();
            Iterator<EffectPointModel> it = videoPublishEditModel.mEffectList.iterator();
            while (it.hasNext()) {
                EffectPointModel next = it.next();
                l.b(next, "");
                if (TextUtils.equals(next.getCategory(), "motion")) {
                    hashSet.add(next.getKey());
                } else if (!com.ss.android.ugc.aweme.video.e.b(next.getResDir())) {
                    hashSet.add(next.getKey());
                }
            }
            if (!hashSet.isEmpty()) {
                com.ss.android.ugc.aweme.effectplatform.f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(eVar, null);
                a2.a(eVar);
                a2.a((List<String>) new ArrayList(hashSet), (Map<String, String>) null, true, (IFetchEffectListListener) new d(jVar));
            } else {
                q.d("All effects needn't download");
                jVar.a((Object) null);
            }
        }
        i a3 = i.a((Object) null);
        j jVar2 = new j();
        ArrayList arrayList = new ArrayList();
        if (videoPublishEditModel.mIsFromDraft && com.ss.android.ugc.aweme.shortvideo.edit.b.g.a()) {
            arrayList.add("lens_hdr");
        }
        if (videoPublishEditModel.isAudioEnhance && !com.ss.android.ugc.gamora.editor.a.c.b()) {
            arrayList.add("unet_denoise_44k_music_model_v1.0");
        }
        if (!arrayList.isEmpty()) {
            p pVar = new p();
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            pVar.a((String[]) array, new e(jVar2));
        } else {
            jVar2.a((Object) null);
        }
        i[] iVarArr = new i[5];
        iVarArr[0] = a3;
        iVarArr[1] = jVar.f4869a;
        iVarArr[2] = jVar2.f4869a;
        j jVar3 = new j();
        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
        List<EditVideoSegment> videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        if (!com.ss.android.ugc.tools.utils.d.a(videoList)) {
            str = videoList.get(0).getVideoPath();
        } else {
            str = null;
        }
        if (e2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(videoPublishEditModel.videoWidth()));
            arrayList2.add(Integer.valueOf(videoPublishEditModel.videoHeight()));
            com.ss.android.ugc.aweme.port.in.g.a().p().a(arrayList2, String.valueOf(str), e2, new b(jVar3), new c(jVar3));
        } else {
            jVar3.a((Object) null);
        }
        i<TResult> iVar2 = jVar3.f4869a;
        l.b(iVar2, "");
        iVarArr[3] = iVar2;
        if (!es.k(videoPublishEditModel) || !com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d) {
            iVar = i.a(z.f158842a);
            l.b(iVar, "");
        } else {
            j jVar4 = new j();
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.a(new a(jVar4, videoPublishEditModel));
            iVar = jVar4.f4869a;
            l.b(iVar, "");
        }
        iVarArr[4] = iVar;
        ArrayList a4 = ap.a(iVarArr);
        l.b(a4, "");
        i.b((Collection<? extends i<?>>) a4).a(new f(currentTimeMillis, eVar, aVar), i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements r<Boolean, List<? extends String>, String, String, z> {
        final /* synthetic */ j $downloadTaskSource;

        static {
            Covode.recordClassIndex(91157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.$downloadTaskSource = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* bridge */ /* synthetic */ z a(Boolean bool, List<? extends String> list, String str, String str2) {
            this.$downloadTaskSource.a((Object) null);
            return z.f158842a;
        }
    }
}
