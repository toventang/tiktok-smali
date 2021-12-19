package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.draft.model.a;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.draft.model.i;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.b;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.f;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.b.e;
import com.ss.android.ugc.aweme.utils.ds;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bn {

    /* renamed from: a  reason: collision with root package name */
    private final String f126993a;

    static {
        Covode.recordClassIndex(83319);
    }

    public static VideoPublishEditModel a(c cVar) {
        boolean z;
        boolean z2;
        String str;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo(d.h(cVar));
        videoPublishEditModel.mDir = dj.f126461d;
        videoPublishEditModel.uploadMethod = cVar.W.bI;
        if (cVar.k()) {
            videoPublishEditModel.mvCreateVideoData = cVar.W.M;
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.W.P;
        }
        if (cVar.W.bo != null) {
            videoPublishEditModel.videoEditorType = 11;
        }
        videoPublishEditModel.isStickPointMode = cVar.W.ak;
        if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.stickPointData = cVar.W.az;
        }
        videoPublishEditModel.containBackgroundVideo = cVar.W.ay;
        videoPublishEditModel.isFastImport = cVar.W.Q;
        videoPublishEditModel.title = cVar.f83181b.f83161a;
        videoPublishEditModel.chain = cVar.f83181b.f83165e;
        videoPublishEditModel.challenges = cVar.f83181b.f83163c;
        videoPublishEditModel.setTextStickerChallenges(videoPublishEditModel.getTextStickerChallenges());
        videoPublishEditModel.commentVideoModel = cVar.W.aC;
        videoPublishEditModel.qaStruct = cVar.W.bu;
        videoPublishEditModel.hasQaSticker = Boolean.valueOf(videoPublishEditModel.isQaAnswer());
        videoPublishEditModel.isWestWindowExistStr = cVar.W.bt;
        CreativeFlowData creativeFlowData = cVar.W.O;
        if (creativeFlowData != null) {
            videoPublishEditModel.creativeFlowData = creativeFlowData;
        }
        videoPublishEditModel.setSharedARModel(cVar.W.aW);
        videoPublishEditModel.structList = cVar.f83181b.f83162b;
        videoPublishEditModel.musicId = com.ss.android.ugc.aweme.ba.c.a(cVar.f83185f);
        videoPublishEditModel.mMusicPath = cVar.f83187h;
        videoPublishEditModel.mMusicStart = cVar.n;
        videoPublishEditModel.mMusicEnd = cVar.b();
        videoPublishEditModel.mMusicOrigin = cVar.W.n;
        videoPublishEditModel.mSelectedId = cVar.f83192m;
        videoPublishEditModel.mRecordFilterIds = cVar.W.w;
        videoPublishEditModel.mRecordFilterLabels = cVar.W.x;
        videoPublishEditModel.mRecordFilterValues = cVar.W.y;
        videoPublishEditModel.mBeautyMobParam = cVar.W.z;
        videoPublishEditModel.mSelectedFilterId = cVar.W.A;
        videoPublishEditModel.mSelectedFilterLabel = cVar.W.B;
        videoPublishEditModel.mSelectedFilterResId = cVar.W.bn;
        videoPublishEditModel.mFaceBeauty = cVar.G;
        videoPublishEditModel.mCameraPosition = cVar.v;
        videoPublishEditModel.mCurFilterLabels = cVar.u;
        videoPublishEditModel.mCurFilterIds = cVar.W.v;
        videoPublishEditModel.mOrigin = cVar.p;
        videoPublishEditModel.mVideoSegmentsDesc = cVar.K;
        videoPublishEditModel.mHardEncode = cVar.L;
        videoPublishEditModel.mStickerID = cVar.O;
        videoPublishEditModel.isPrivate = cVar.D;
        videoPublishEditModel.excludeUserList = cVar.W.aT;
        videoPublishEditModel.allowRecommend = cVar.W.aV;
        videoPublishEditModel.geofencingSetting = cVar.W.aS;
        videoPublishEditModel.commentSetting = cVar.W.J;
        videoPublishEditModel.maxDuration = cVar.F;
        videoPublishEditModel.audioTrack = cVar.s;
        videoPublishEditModel.videoSpeed = cVar.r;
        videoPublishEditModel.cameraIds = cVar.W.ad;
        videoPublishEditModel.beautyType = cVar.W.ae;
        videoPublishEditModel.mBeautyMetadatas = cVar.W.aD;
        videoPublishEditModel.mUploadPath = cVar.W.al;
        videoPublishEditModel.importInfoList = cVar.W.af;
        videoPublishEditModel.metadataMap = cVar.W.ai;
        videoPublishEditModel.mShoutOutsData = cVar.W.aU;
        videoPublishEditModel.commerceData = l.f115658a.z().a(cVar);
        videoPublishEditModel.mSelectedFilterIntensity = cVar.s();
        videoPublishEditModel.setVideoLength(cVar.f83181b.f83164d);
        videoPublishEditModel.recordBgmDelay = cVar.W.bm.intValue();
        videoPublishEditModel.loudnessBalanceParam = cVar.W.bq;
        if (cVar.E != null) {
            videoPublishEditModel.mEffectList = cVar.E.getEffectPointModels();
        }
        int i2 = cVar.o;
        if (i2 != 0) {
            videoPublishEditModel.mTimeEffect = new EffectPointModel();
            videoPublishEditModel.mTimeEffect.setKey(String.valueOf(i2));
            videoPublishEditModel.mTimeEffect.setStartPoint(cVar.d());
            videoPublishEditModel.mTimeEffect.setEndPoint(cVar.M);
        }
        videoPublishEditModel.mVideoCoverStartTm = cVar.S;
        videoPublishEditModel.setVideoCoverPath(cVar.W.T);
        videoPublishEditModel.mOutVideoWidth = cVar.W.V;
        videoPublishEditModel.mOutVideoHeight = cVar.W.W;
        videoPublishEditModel.mVideoCanvasWidth = cVar.W.X;
        videoPublishEditModel.mVideoCanvasHeight = cVar.W.Y;
        if (cVar.f83185f != null) {
            l.f115658a.g();
            videoPublishEditModel.mId3Album = cVar.f83185f.getAlbum();
            videoPublishEditModel.mId3Author = cVar.f83185f.getSinger();
            videoPublishEditModel.mId3Title = cVar.f83185f.getName();
            videoPublishEditModel.mMusicType = l.f115658a.b().a(cVar.f83185f.getMusicType()) ? 1 : 0;
            videoPublishEditModel.previewStartTime = cVar.f83185f.getPreviewStartTime();
        }
        videoPublishEditModel.mDuetFrom = cVar.T;
        videoPublishEditModel.mSyncPlatforms = cVar.U;
        if (cVar.W.f83168b == 1) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModel.mFromMultiCut = z;
        if (cVar.W.f83168b == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        videoPublishEditModel.mFromCut = z2;
        videoPublishEditModel.mShootMode = cVar.W.f83167a;
        videoPublishEditModel.microAppId = cVar.W.f83178l;
        videoPublishEditModel.microAppModel = cVar.W.F;
        videoPublishEditModel.microAppModel = cVar.W.F;
        videoPublishEditModel.creationId = cVar.f();
        videoPublishEditModel.draftId = cVar.W.f83171e;
        videoPublishEditModel.newDraftId = cVar.W.f83172f;
        int i3 = cVar.R;
        g.a().c();
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (i3 == 3) {
            videoPublishEditModel.voiceVolume = (((float) cVar.f83189j) * 2.0f) / 100.0f;
            f2 = (((float) cVar.f83190k) * 2.0f) / 100.0f;
        } else {
            videoPublishEditModel.voiceVolume = videoPublishEditModel.hasOriginalSound() ? 1.0f : 0.0f;
            if (videoPublishEditModel.isMusic() <= 0) {
                f2 = 0.0f;
            }
        }
        videoPublishEditModel.musicVolume = f2;
        videoPublishEditModel.mShootWay = cVar.W.f83170d;
        videoPublishEditModel.autoEnhanceType = cVar.W.aG;
        videoPublishEditModel.autoEnhanceOn = cVar.W.aF;
        videoPublishEditModel.setShootFrom(cVar.W.br);
        videoPublishEditModel.mDurationMode = cVar.W.f83174h;
        videoPublishEditModel.mIsMultiVideo = cVar.W.f83173g;
        videoPublishEditModel.setNewVersion(cVar.R);
        videoPublishEditModel.reactionParams = cVar.g();
        videoPublishEditModel.isMuted = cVar.h();
        if (!videoPublishEditModel.isMuted) {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = cVar.W.f83175i;
        videoPublishEditModel.gameScore = cVar.W.f83176j;
        videoPublishEditModel.extractFramesModel = cVar.i();
        videoPublishEditModel.setSaveModel(cVar.W.D);
        videoPublishEditModel.infoStickerModel = cVar.j();
        videoPublishEditModel.videoType = cVar.W.G;
        videoPublishEditModel.usePaint = cVar.W.I;
        videoPublishEditModel.texts = cVar.W.H;
        videoPublishEditModel.socialModel = cVar.W.K;
        Workspace a2 = b.a(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = a2.h().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = a2.i().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = a2.j().getPath();
        com.ss.android.ugc.aweme.tools.b.g.a(q.b(cVar.W), q.b(videoPublishEditModel), e.DRAFT, e.PUBLISH);
        videoPublishEditModel.setStickPointType(cVar.W.aH);
        if (cVar.W == null) {
            str = null;
        } else {
            str = cVar.W.L;
        }
        videoPublishEditModel.mFirstStickerMusicIdsJson = str;
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.r(), d.i(cVar));
        videoPublishEditModel.veCherEffectParam = b(cVar);
        videoPublishEditModel.veAudioEffectParam = c(cVar);
        videoPublishEditModel.stickerChallenge = cVar.W.ag;
        if (f.a()) {
            videoPublishEditModel.veAudioRecorderParam = cVar.W.aj;
        }
        videoPublishEditModel.multiEditVideoRecordData = cVar.W.ax;
        videoPublishEditModel.supportRetake = cVar.W.aw;
        videoPublishEditModel.videoCount = cVar.W.aq;
        videoPublishEditModel.photoCount = cVar.W.ar;
        videoPublishEditModel.pic2VideoSource = cVar.W.at;
        videoPublishEditModel.allowDownloadSetting = cVar.W.au;
        videoPublishEditModel.mUseMusicBeforeEdit = cVar.c();
        if (cVar.W.aJ != null) {
            videoPublishEditModel.stitchParams = cVar.W.aJ;
        }
        if (cVar.k()) {
            videoPublishEditModel.mvCreateVideoData = cVar.W.M;
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.W.P;
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.videoEditorType = 7;
        } else if (es.n(videoPublishEditModel)) {
            videoPublishEditModel.videoEditorType = 10;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        }
        videoPublishEditModel.setMainBusinessData(cVar.W.o);
        videoPublishEditModel.stickerInfo = cVar.W.aB;
        videoPublishEditModel.duetLayout = cVar.W.aI;
        videoPublishEditModel.draftDuetExtraInfo = cVar.W.bl;
        videoPublishEditModel.canvasVideoData = cVar.W.bo;
        videoPublishEditModel.cutSameEditData = cVar.W.aQ;
        if (videoPublishEditModel.isCutSameVideoType()) {
            videoPublishEditModel.uploadMiscInfoStruct = cVar.W.P;
        }
        videoPublishEditModel.mentionTextList = cVar.W.bf;
        videoPublishEditModel.hashTagTextList = cVar.W.bg;
        videoPublishEditModel.isCommerceMusic = cVar.W.aK;
        videoPublishEditModel.cameraLensInfo = cVar.W.aM;
        videoPublishEditModel.isPhotoMvMode = cVar.W.aN;
        videoPublishEditModel.isDuetGreenSrceen = cVar.W.aO;
        videoPublishEditModel.isPhotoMvMusic = cVar.W.aY;
        videoPublishEditModel.isPhotoMvMode1080p = cVar.W.aZ;
        videoPublishEditModel.isDraftMusicIllegal = cVar.W.ba;
        if (TextUtils.isEmpty(cVar.W.aP)) {
            videoPublishEditModel.isSoundLoop = false;
        } else {
            videoPublishEditModel.isSoundLoop = Boolean.valueOf(TextUtils.equals("on", cVar.W.aP));
        }
        com.ss.android.ugc.tools.utils.q.a("SoundLoop, convertFromDraft " + videoPublishEditModel.isSoundLoop);
        videoPublishEditModel.setCoverPublishModel(cVar.W.aR);
        List<String> list = cVar.W.aX;
        if (!com.ss.android.ugc.tools.utils.d.a(list)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            videoPublishEditModel.messageBubbleTexts = arrayList;
        }
        cVar.a(videoPublishEditModel.audioAecDelayTime);
        videoPublishEditModel.currentZoomValue = cVar.W.bd;
        videoPublishEditModel.mShootedShootMode = cVar.W.bh;
        videoPublishEditModel.allowAutoCaptionSetting = cVar.W.bk;
        videoPublishEditModel.duetFromDuetSticker = cVar.W.bi;
        videoPublishEditModel.mDuetFromDuetButton = cVar.W.bj;
        videoPublishEditModel.publishStage = cVar.W.bb;
        videoPublishEditModel.tagUserList = cVar.W.bv;
        videoPublishEditModel.isAudioEnhance = cVar.W.bz;
        videoPublishEditModel.autoAttachedAnchor = cVar.W.bw;
        videoPublishEditModel.openPlatformExtra = cVar.W.bx;
        videoPublishEditModel.openPlatformClientKey = cVar.W.by;
        videoPublishEditModel.editMusicSyncMode = cVar.W.bA;
        videoPublishEditModel.cut2EditTransferModel = cVar.W.bB;
        videoPublishEditModel.draftSaveTime = cVar.J;
        videoPublishEditModel.sessionId = cVar.W.bD;
        videoPublishEditModel.ttStoryUploadModel = cVar.W.bE;
        videoPublishEditModel.isStoryEditMode = cVar.W.bG;
        String str2 = cVar.W.bH;
        videoPublishEditModel.fromItemId = str2;
        dv.f126646e = str2;
        return videoPublishEditModel;
    }

    public bn(String str) {
        this.f126993a = str;
    }

    public static c a(VideoPublishEditModel videoPublishEditModel) {
        return b(videoPublishEditModel);
    }

    private static ClientCherEffectParam b(c cVar) {
        if (cVar == null || cVar.W == null || cVar.W.U == null) {
            return null;
        }
        com.ss.android.ugc.aweme.draft.model.e eVar = cVar.W.U;
        return new ClientCherEffectParam(eVar.f83203a, eVar.f83204b, eVar.f83205c);
    }

    private static com.ss.android.ugc.aweme.draft.model.e c(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.veCherEffectParam == null) {
            return null;
        }
        return new com.ss.android.ugc.aweme.draft.model.e(videoPublishEditModel.veCherEffectParam.getMatrix(), videoPublishEditModel.veCherEffectParam.getDuration(), videoPublishEditModel.veCherEffectParam.getSegUseCher());
    }

    private static AudioEffectParam c(c cVar) {
        String str;
        if (cVar == null || cVar.W == null || cVar.q() == null) {
            return null;
        }
        i q = cVar.q();
        if (q.f83214a != null) {
            str = q.f83214a;
        } else {
            str = "";
        }
        return new AudioEffectParam(str, q.f83215b, q.f83216c, q.f83217d, q.f83218e, q.f83219f, q.f83220g, null, q.f83221h);
    }

    private static i d(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.veAudioEffectParam == null) {
            return null;
        }
        return new i(videoPublishEditModel.veAudioEffectParam.getUploadId(), videoPublishEditModel.veAudioEffectParam.getTrackType(), videoPublishEditModel.veAudioEffectParam.getTrackIndex(), videoPublishEditModel.veAudioEffectParam.getEffectPath(), videoPublishEditModel.veAudioEffectParam.getEffectTag(), videoPublishEditModel.veAudioEffectParam.getSeqIn(), videoPublishEditModel.veAudioEffectParam.getSeqOut(), videoPublishEditModel.veAudioEffectParam.getChallenge());
    }

    public static c b(VideoPublishEditModel videoPublishEditModel) {
        String str;
        c cVar = new c();
        cVar.a(videoPublishEditModel.getPreviewInfo());
        cVar.R = videoPublishEditModel.getNewVersion();
        a aVar = new a();
        aVar.f83161a = videoPublishEditModel.title;
        aVar.f83165e = videoPublishEditModel.chain;
        aVar.f83166f = videoPublishEditModel.disableDeleteChain;
        aVar.f83163c = videoPublishEditModel.challenges;
        aVar.f83164d = videoPublishEditModel.getVideoLength();
        aVar.f83162b = videoPublishEditModel.getStructList();
        String str2 = "";
        if (videoPublishEditModel.uploadMethod != null) {
            str = videoPublishEditModel.uploadMethod;
        } else {
            str = str2;
        }
        cVar.a(str);
        cVar.f83181b = aVar;
        cVar.f83185f = cr.a().f125295a;
        cVar.a(videoPublishEditModel.commentVideoModel);
        cVar.a(videoPublishEditModel.qaStruct);
        cVar.u(videoPublishEditModel.isWestWindowExistStr);
        cVar.f83187h = videoPublishEditModel.mMusicPath;
        cVar.n = videoPublishEditModel.mMusicStart;
        cVar.h(videoPublishEditModel.mMusicEnd);
        cVar.l(videoPublishEditModel.mMusicOrigin);
        d.a(cVar, videoPublishEditModel.getFilterIndex());
        cVar.c(videoPublishEditModel.mRecordFilterIds);
        cVar.d(videoPublishEditModel.mRecordFilterLabels);
        cVar.e(videoPublishEditModel.mRecordFilterValues);
        cVar.a(videoPublishEditModel.mBeautyMobParam);
        cVar.f(videoPublishEditModel.mSelectedFilterId);
        cVar.g(videoPublishEditModel.mSelectedFilterLabel);
        cVar.h(videoPublishEditModel.mSelectedFilterResId);
        cVar.a(videoPublishEditModel.mSelectedFilterIntensity);
        cVar.G = videoPublishEditModel.mFaceBeauty;
        cVar.v = videoPublishEditModel.mCameraPosition;
        cVar.u = videoPublishEditModel.mCurFilterLabels;
        cVar.b(videoPublishEditModel.mCurFilterIds);
        cVar.p = videoPublishEditModel.mOrigin;
        cVar.H = g.a().A().c();
        cVar.K = videoPublishEditModel.mVideoSegmentsDesc;
        cVar.L = videoPublishEditModel.mHardEncode;
        cVar.O = videoPublishEditModel.mStickerID;
        cVar.j(videoPublishEditModel.getVideoCoverPath());
        cVar.w = videoPublishEditModel.faceBeautyOpen ? 1 : 0;
        cVar.a(videoPublishEditModel.mBeautyMetadatas);
        cVar.D = videoPublishEditModel.isPrivate;
        cVar.b(videoPublishEditModel.excludeUserList);
        cVar.a(videoPublishEditModel.mShoutOutsData);
        cVar.j(videoPublishEditModel.allowRecommend);
        cVar.k(videoPublishEditModel.commentSetting);
        cVar.F = videoPublishEditModel.maxDuration;
        cVar.s = videoPublishEditModel.audioTrack;
        cVar.r = videoPublishEditModel.videoSpeed;
        cVar.k(videoPublishEditModel.cameraIds);
        cVar.l(videoPublishEditModel.beautyType);
        cVar.b(videoPublishEditModel.importInfoList);
        cVar.a(videoPublishEditModel.metadataMap);
        cVar.d(videoPublishEditModel.mOutVideoWidth);
        cVar.e(videoPublishEditModel.mOutVideoHeight);
        cVar.f(videoPublishEditModel.mVideoCanvasWidth);
        cVar.g(videoPublishEditModel.mVideoCanvasHeight);
        EffectListModel effectListModel = new EffectListModel();
        effectListModel.setEffectPointModels(videoPublishEditModel.mEffectList);
        cVar.E = effectListModel;
        cVar.o = videoPublishEditModel.getEffect();
        cVar.i(videoPublishEditModel.getTimeEffectStartPoint());
        cVar.M = videoPublishEditModel.getSpecialPoints();
        cVar.S = videoPublishEditModel.mVideoCoverStartTm;
        cVar.T = videoPublishEditModel.mDuetFrom;
        cVar.i(videoPublishEditModel.mUploadPath);
        cVar.U = videoPublishEditModel.mSyncPlatforms;
        cVar.o(videoPublishEditModel.getFrom());
        cVar.p(videoPublishEditModel.mShootMode);
        cVar.q(videoPublishEditModel.microAppId);
        cVar.a(videoPublishEditModel.microAppModel);
        cVar.m(videoPublishEditModel.creationId);
        cVar.s(videoPublishEditModel.draftId);
        cVar.p(videoPublishEditModel.newDraftId);
        cVar.n(videoPublishEditModel.mShootWay);
        cVar.j(videoPublishEditModel.autoEnhanceOn);
        cVar.v(videoPublishEditModel.autoEnhanceType);
        cVar.o(videoPublishEditModel.getShootFrom());
        cVar.c(videoPublishEditModel.mDurationMode);
        cVar.d(videoPublishEditModel.mIsMultiVideo);
        cVar.a(videoPublishEditModel.reactionParams);
        cVar.e(videoPublishEditModel.isMuted);
        cVar.a(videoPublishEditModel.geofencingSetting);
        cVar.q(videoPublishEditModel.recordMode);
        cVar.r(videoPublishEditModel.gameScore);
        cVar.a(videoPublishEditModel.extractFramesModel);
        cVar.a(videoPublishEditModel.getSaveModel());
        cVar.a(videoPublishEditModel.infoStickerModel);
        cVar.u(videoPublishEditModel.videoType);
        cVar.e(videoPublishEditModel.texts);
        cVar.f(videoPublishEditModel.usePaint);
        cVar.a(videoPublishEditModel.socialModel);
        cVar.a(videoPublishEditModel.stickerChallenge);
        cVar.a(videoPublishEditModel.getTextStickerChallenges());
        int newVersion = videoPublishEditModel.getNewVersion();
        g.a().c();
        if (newVersion == 3) {
            cVar.f83190k = (int) ((videoPublishEditModel.musicVolume / 2.0f) * 100.0f);
            cVar.f83189j = (int) ((videoPublishEditModel.voiceVolume / 2.0f) * 100.0f);
        }
        com.ss.android.ugc.aweme.tools.b.g.a(q.a(videoPublishEditModel), q.a(cVar.W), e.PUBLISH, e.DRAFT);
        cVar.W.aH = videoPublishEditModel.getStickPointType();
        cVar.W.bm = Integer.valueOf(videoPublishEditModel.recordBgmDelay);
        cVar.W.bq = videoPublishEditModel.loudnessBalanceParam;
        cVar.W.L = videoPublishEditModel.mFirstStickerMusicIdsJson;
        cVar.W.bh = videoPublishEditModel.mShootedShootMode;
        com.ss.android.ugc.aweme.draft.model.b bVar = cVar.W;
        if (dv.f126646e != null) {
            str2 = dv.f126646e;
        }
        bVar.bH = str2;
        cVar.r(videoPublishEditModel.commerceData);
        cVar.i(videoPublishEditModel.isFastImport);
        cVar.a(videoPublishEditModel.mvCreateVideoData);
        cVar.g(videoPublishEditModel.isStickPointMode);
        cVar.h(videoPublishEditModel.containBackgroundVideo);
        cVar.a(videoPublishEditModel.uploadMiscInfoStruct);
        cVar.a(videoPublishEditModel.creativeFlowData);
        if (videoPublishEditModel.draftEditTransferModel != null) {
            cVar.f83184e = videoPublishEditModel.draftEditTransferModel.getPrimaryKey();
            if (videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy() != null) {
                cVar.f(videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy());
            }
        }
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.r(), d.i(cVar));
        cVar.a(c(videoPublishEditModel));
        cVar.a(d(videoPublishEditModel));
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            d.a(cVar, videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.metadataMap == null) {
            videoPublishEditModel.metadataMap = com.ss.android.ttve.editorInfo.a.a();
        } else {
            Map<String, Object> a2 = com.ss.android.ttve.editorInfo.a.a();
            if (a2 != null) {
                videoPublishEditModel.metadataMap.putAll(a2);
            }
        }
        cVar.a(videoPublishEditModel.metadataMap);
        cVar.m(videoPublishEditModel.videoCount);
        cVar.n(videoPublishEditModel.photoCount);
        cVar.s(videoPublishEditModel.pic2VideoSource);
        cVar.w(videoPublishEditModel.allowDownloadSetting);
        cVar.a(videoPublishEditModel.mUseMusicBeforeEdit);
        SharedARModel sharedARModel = videoPublishEditModel.getSharedARModel();
        if (sharedARModel != null) {
            cVar.W.aW = sharedARModel;
        }
        cVar.a(videoPublishEditModel.multiEditVideoRecordData);
        cVar.k(videoPublishEditModel.supportRetake);
        cVar.a(videoPublishEditModel.stickPointData);
        cVar.v(com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c.a(videoPublishEditModel));
        cVar.w(videoPublishEditModel.getMainBusinessData());
        cVar.a(videoPublishEditModel.stickerInfo);
        cVar.W.aE = false;
        cVar.x(videoPublishEditModel.duetLayout);
        cVar.a(videoPublishEditModel.stitchParams);
        cVar.l(videoPublishEditModel.isCommerceMusic);
        cVar.c(videoPublishEditModel.cameraLensInfo);
        cVar.m(videoPublishEditModel.isPhotoMvMode);
        cVar.o(videoPublishEditModel.isPhotoMvMusic);
        cVar.p(videoPublishEditModel.isPhotoMvMode1080p);
        cVar.n(videoPublishEditModel.isDuetGreenSrceen);
        if (videoPublishEditModel.isSoundLoop.booleanValue()) {
            cVar.y("on");
        } else {
            cVar.y("off");
        }
        cVar.q(videoPublishEditModel.isDraftMusicIllegal);
        cVar.g(videoPublishEditModel.messageBubbleTexts);
        com.ss.android.ugc.tools.utils.q.a("SoundLoop, convertToDraft " + videoPublishEditModel.isSoundLoop);
        cVar.a(videoPublishEditModel.cutSameEditData);
        cVar.a(videoPublishEditModel.getCoverPublishModel());
        cVar.a(videoPublishEditModel.audioAecDelayTime);
        cVar.b(videoPublishEditModel.currentZoomValue);
        cVar.c(videoPublishEditModel.mentionTextList);
        cVar.d(videoPublishEditModel.hashTagTextList);
        cVar.a(videoPublishEditModel.allowAutoCaptionSetting);
        cVar.b(videoPublishEditModel.duetFromDuetSticker);
        cVar.c(videoPublishEditModel.mDuetFromDuetButton);
        cVar.W.bo = videoPublishEditModel.canvasVideoData;
        cVar.W.bv = videoPublishEditModel.tagUserList;
        cVar.b(videoPublishEditModel.isAudioEnhance);
        cVar.W.bw = videoPublishEditModel.autoAttachedAnchor;
        cVar.W.bx = videoPublishEditModel.openPlatformExtra;
        cVar.W.by = videoPublishEditModel.openPlatformClientKey;
        cVar.W.bA = videoPublishEditModel.editMusicSyncMode;
        cVar.W.bB = videoPublishEditModel.cut2EditTransferModel;
        cVar.W.bC = true;
        cVar.J = videoPublishEditModel.draftSaveTime;
        cVar.W.bD = videoPublishEditModel.sessionId;
        cVar.W.bE = videoPublishEditModel.ttStoryUploadModel;
        cVar.W.bG = videoPublishEditModel.isStoryEditMode;
        return cVar;
    }

    public static VideoPublishEditModel a(Intent intent) {
        String str;
        int i2;
        float f2;
        float f3;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.uploadMethod = a(intent, "upload_method");
        videoPublishEditModel.setPreviewInfo((EditPreviewInfo) intent.getParcelableExtra("extra_edit_preview_info"));
        videoPublishEditModel.setAvetParameter(AVETParameterKt.generateAVETParam(intent));
        videoPublishEditModel.mWorkspace = (Workspace) intent.getParcelableExtra("workspace");
        if (videoPublishEditModel.mWorkspace == null) {
            videoPublishEditModel.mWorkspace = com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a();
        }
        videoPublishEditModel.mFromCut = intent.getBooleanExtra("fromCut", false);
        videoPublishEditModel.mFromMultiCut = intent.getBooleanExtra("fromMultiCut", false);
        videoPublishEditModel.startTime = intent.getLongExtra("record_timer", 0);
        videoPublishEditModel.mDir = a(intent, "dir");
        if (TextUtils.isEmpty(videoPublishEditModel.mDir)) {
            str = di.f126461d;
        } else {
            str = videoPublishEditModel.mDir;
        }
        videoPublishEditModel.mDir = str;
        videoPublishEditModel.mEncodedAudioOutputFile = videoPublishEditModel.mWorkspace.i().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = videoPublishEditModel.mWorkspace.j().getPath();
        videoPublishEditModel.mFaceBeauty = intent.getIntExtra("face_beauty", 0);
        videoPublishEditModel.faceBeautyOpen = intent.getBooleanExtra("face_beauty_open", false);
        if (intent.hasExtra("extra_beauty_data")) {
            videoPublishEditModel.mBeautyMetadatas = intent.getParcelableArrayListExtra("extra_beauty_data");
        }
        videoPublishEditModel.mSelectedId = intent.getIntExtra("filter_id", 0);
        videoPublishEditModel.mSelectedFilterId = a(intent, "selected_filter_id");
        videoPublishEditModel.mSelectedFilterLabel = a(intent, "selected_filter_name");
        videoPublishEditModel.mSelectedFilterResId = a(intent, "selected_filter_res_id");
        videoPublishEditModel.mSelectedFilterIntensity = intent.getFloatExtra("extra_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mRecordVideoSelectedFilterIndex = intent.getIntExtra("extra_record_video_selected_filter_index", 0);
        videoPublishEditModel.mRecordVideoSelectedFilterIntensity = intent.getFloatExtra("extra_record_video_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mCameraPosition = intent.getIntExtra("camera", 0);
        videoPublishEditModel.mRecordFilterIds = a(intent, "record_filter_ids");
        videoPublishEditModel.mRecordFilterLabels = a(intent, "record_filter_names");
        videoPublishEditModel.mRecordFilterValues = a(intent, "record_filter_values");
        videoPublishEditModel.mBeautyMobParam = (BeautyMobParam) intent.getParcelableExtra("record_beauty_mob_param");
        videoPublishEditModel.mCurFilterLabels = a(intent, "filter_lables");
        videoPublishEditModel.mCurFilterIds = a(intent, "filter_ids");
        videoPublishEditModel.mSmoothSkinLabels = a(intent, "smooth_skin_labels");
        videoPublishEditModel.mReshapeLabels = a(intent, "smooth_reshape_labels");
        videoPublishEditModel.mTanningLabels = a(intent, "smooth_tanning_labels");
        videoPublishEditModel.mEyesLabels = a(intent, "smooth_eyes_labels");
        videoPublishEditModel.recordBgmDelay = intent.getIntExtra("record_bgm_delay", 0);
        videoPublishEditModel.loudnessBalanceParam = (LoudnessBalanceParam) intent.getParcelableExtra("edit_loudness_param");
        videoPublishEditModel.commentVideoModel = (CommentVideoModel) intent.getSerializableExtra("comment_video_model");
        videoPublishEditModel.qaStruct = (QaStruct) intent.getSerializableExtra("question_answer_video_model");
        videoPublishEditModel.hasQaSticker = Boolean.valueOf(videoPublishEditModel.isQaAnswer());
        videoPublishEditModel.setSharedARModel((SharedARModel) intent.getParcelableExtra("extra_shared_ar_effect"));
        videoPublishEditModel.videoSpeed = a(intent, "extra_aweme_speed");
        videoPublishEditModel.cameraIds = a(intent, "extra_av_camera_ids");
        videoPublishEditModel.beautyType = intent.getIntExtra("extra_beauty_type", 0);
        videoPublishEditModel.metadataMap = ds.a(a(intent, "extra_video_record_metadata"));
        if (videoPublishEditModel.mWorkspace.c() != null) {
            videoPublishEditModel.mMusicPath = videoPublishEditModel.mWorkspace.c();
            videoPublishEditModel.mMusicStart = intent.getIntExtra("music_start", 0);
            videoPublishEditModel.mMusicEnd = intent.getIntExtra("extra_music_end", 0);
        }
        videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.h().getPath();
        if (intent.getBooleanExtra("enable_music_path_check", true) && videoPublishEditModel.mMusicPath == null) {
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
        }
        videoPublishEditModel.maxDuration = intent.getLongExtra("max_duration", 15000);
        videoPublishEditModel.audioTrack = (UrlModel) intent.getSerializableExtra("wav_form");
        if (!videoPublishEditModel.mFromCut) {
            videoPublishEditModel.mVideoSegmentsDesc = a(intent, "video_segment");
        }
        videoPublishEditModel.mHardEncode = intent.getIntExtra("hard_encode", 0);
        videoPublishEditModel.mStickerPath = a(intent, "sticker_path");
        videoPublishEditModel.mStickerID = a(intent, "sticker_id");
        videoPublishEditModel.mDesignerIdList = a(intent, "original_designer_uid_list");
        videoPublishEditModel.mOriginalStickerCount = intent.getIntExtra("original_sticker_count", 0);
        videoPublishEditModel.stickerInfo = (StickerInfo) intent.getSerializableExtra("sticker_info");
        videoPublishEditModel.mFirstStickerMusicIdsJson = a(intent, "first_sticker_music_ids");
        videoPublishEditModel.draftFromShoot = intent.getBooleanExtra("draft_from_shoot", false);
        videoPublishEditModel.mRestoreType = intent.getIntExtra("restore", 0);
        if (videoPublishEditModel.mSelectedId == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        videoPublishEditModel.mUseFilter = i2;
        videoPublishEditModel.mWillGoOnShortVideo = intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", false);
        videoPublishEditModel.mShootWay = a(intent, "shoot_way");
        if (bp.j(videoPublishEditModel)) {
            videoPublishEditModel.replaceMusicModel = new com.ss.android.ugc.aweme.shortvideo.edit.model.g();
            videoPublishEditModel.replaceMusicModel.setAid(a(intent, "id"));
            videoPublishEditModel.replaceMusicModel.setVid(a(intent, "video_id"));
            videoPublishEditModel.replaceMusicModel.setCover(a(intent, "video_cover"));
            String a2 = a(intent, "music_id");
            if (!TextUtils.isEmpty(a2)) {
                videoPublishEditModel.replaceMusicModel.setMid(a2);
            }
        }
        videoPublishEditModel.setShootFrom(a(intent, "shoot_from"));
        videoPublishEditModel.mIsFromDraft = intent.getBooleanExtra("isFromDraft", false);
        videoPublishEditModel.mDraftToEditFrom = intent.getIntExtra("draft_to_edit_from", -1);
        if (videoPublishEditModel.mIsFromDraft) {
            videoPublishEditModel.mVideoCanvasWidth = intent.getIntExtra("extra_video_canvas_width", 0);
            videoPublishEditModel.mVideoCanvasHeight = intent.getIntExtra("extra_video_canvas_height", 0);
        }
        videoPublishEditModel.mVideoCoverStartTm = intent.getFloatExtra("videoCoverStartTm", 0.0f);
        videoPublishEditModel.setCoverPublishModel((CoverPublishModel) intent.getParcelableExtra("cover_publish_model"));
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.mEffectList = intent.getParcelableArrayListExtra("effectList");
        videoPublishEditModel.mTimeEffect = (EffectPointModel) intent.getParcelableExtra("time_effect");
        videoPublishEditModel.mOrigin = intent.getIntExtra("origin", 0);
        videoPublishEditModel.challenges = (List) intent.getSerializableExtra("challenge");
        videoPublishEditModel.geofencingSetting = (List) intent.getSerializableExtra("geo_fencing");
        videoPublishEditModel.tagId = a(intent, "tag_id");
        videoPublishEditModel.mDuetFrom = a(intent, "duet_from");
        videoPublishEditModel.mDuetAuthor = (User) intent.getSerializableExtra("duet_author");
        videoPublishEditModel.mDuetHashTag = a(intent, "duet_hash_tag");
        videoPublishEditModel.mShoutOutsData = (com.ss.android.ugc.aweme.shoutouts.d) intent.getSerializableExtra("shout_out_data");
        if (videoPublishEditModel.mShoutOutsData != null) {
            cr.a().e();
        }
        CreativeFlowData creativeFlowData = (CreativeFlowData) intent.getParcelableExtra("creative_flow_data");
        if (creativeFlowData != null) {
            videoPublishEditModel.creativeFlowData = creativeFlowData;
        }
        videoPublishEditModel.mSyncPlatforms = a(intent, "sync_platform");
        videoPublishEditModel.mShootMode = intent.getIntExtra("shoot_mode", 0);
        videoPublishEditModel.mShootedShootMode = intent.getIntExtra("shooted_shoot_mode", -1);
        videoPublishEditModel.creationId = a(intent, "creation_id");
        videoPublishEditModel.ccVid = a(intent, "cc_vid");
        videoPublishEditModel.draftId = intent.getIntExtra("draft_id", 0);
        videoPublishEditModel.newDraftId = a(intent, "new_draft_id");
        if (videoPublishEditModel.newDraftId == null) {
            videoPublishEditModel.newDraftId = "";
        }
        float f4 = 1.0f;
        if (videoPublishEditModel.hasOriginalSound()) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        videoPublishEditModel.voiceVolume = f2;
        if (videoPublishEditModel.isMusic() <= 0) {
            f4 = 0.0f;
        }
        videoPublishEditModel.musicVolume = f4;
        videoPublishEditModel.title = a(intent, "video_title");
        videoPublishEditModel.chain = a(intent, "video_title_chain");
        videoPublishEditModel.duetFromDuetSticker = intent.getIntExtra("duet_from_duet_sticker", 0);
        videoPublishEditModel.mDuetFromDuetButton = intent.getIntExtra("duet_from_duet_button", 0);
        videoPublishEditModel.disableDeleteChain = intent.getBooleanExtra("disable_delete_title_chain", false);
        videoPublishEditModel.isPrivate = intent.getIntExtra("is_rivate", 0);
        videoPublishEditModel.excludeUserList = (List) intent.getSerializableExtra("exclude_user_list");
        videoPublishEditModel.allowRecommend = intent.getIntExtra("allow_recommend", 0);
        videoPublishEditModel.commentSetting = intent.getIntExtra("comment_setting", com.ss.android.ugc.aweme.cs.g.b.f79063c);
        videoPublishEditModel.structList = (List) intent.getSerializableExtra("struct_list");
        videoPublishEditModel.mDurationMode = intent.getBooleanExtra("duration_mode", false);
        videoPublishEditModel.mIsMultiVideo = intent.getBooleanExtra("upload_video_type", false);
        videoPublishEditModel.autoEnhanceType = intent.getIntExtra("extra_auto_enhance_type", 0);
        videoPublishEditModel.autoEnhanceOn = intent.getBooleanExtra("extra_auto_enhance_state", false);
        com.ss.android.ugc.aweme.tools.b.g.a(intent, q.b(videoPublishEditModel));
        videoPublishEditModel.reactionParams = (ReactionParams) intent.getParcelableExtra("reaction_params");
        videoPublishEditModel.isMuted = intent.getBooleanExtra("is_muted", false);
        if (videoPublishEditModel.isMuted) {
            f3 = 0.0f;
        } else {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = intent.getIntExtra("record_mode", 0);
        videoPublishEditModel.gameScore = intent.getIntExtra("record_game_score", 0);
        videoPublishEditModel.mMusicOrigin = a(intent, "music_origin");
        videoPublishEditModel.microAppId = a(intent, "micro_app_id");
        videoPublishEditModel.isDuetGreenSrceen = intent.getBooleanExtra("duet_green_srceen", false);
        videoPublishEditModel.microAppModel = (t) intent.getSerializableExtra("micro_app_info");
        videoPublishEditModel.extractFramesModel = (ExtractFramesModel) intent.getSerializableExtra("extract_model");
        videoPublishEditModel.infoStickerModel = (InfoStickerModel) intent.getParcelableExtra("infosticker_model");
        videoPublishEditModel.md5 = a(intent, "md5");
        if (intent.hasExtra("extra_import_video_info_list")) {
            videoPublishEditModel.importInfoList = intent.getParcelableArrayListExtra("extra_import_video_info_list");
        }
        videoPublishEditModel.videoCount = intent.getIntExtra("extra_video_count", 0);
        videoPublishEditModel.photoCount = intent.getIntExtra("extra_photo_count", 0);
        videoPublishEditModel.enterFrom = a(intent, "enter_from");
        videoPublishEditModel.sendToUserHead = (UrlModel) intent.getSerializableExtra("send_to_user_head");
        videoPublishEditModel.isFastImport = intent.getBooleanExtra("extra_av_is_fast_import", false);
        videoPublishEditModel.fastImportErrorCode = intent.getIntExtra("extra_fast_import_error_code", -1);
        videoPublishEditModel.isStickPointMode = intent.getBooleanExtra("extra_stickpoint_mode", false);
        videoPublishEditModel.isPhotoMvMode = intent.getBooleanExtra("extra_photo_mv_mode", false);
        videoPublishEditModel.isPhotoMvMode1080p = intent.getBooleanExtra("extra_photo_mv_mode_1080p", false);
        videoPublishEditModel.isPhotoMvMusic = intent.getBooleanExtra("is_photo_mv_music", false);
        videoPublishEditModel.successEnableAEC = intent.getBooleanExtra("extra_success_enable_aec", false);
        videoPublishEditModel.audioAecDelayTime = intent.getLongExtra("extra_audio_aec_delay_time", -1);
        videoPublishEditModel.currentZoomValue = intent.getFloatExtra("extra_current_zoom_value", -1.0f);
        if (intent.hasExtra("extra_share_context")) {
            ad adVar = (ad) intent.getSerializableExtra("extra_share_context");
            if (adVar != null) {
                com.ss.android.ugc.aweme.ah.g.a(videoPublishEditModel, adVar);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e eVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e();
            eVar.setShareContext(adVar);
            videoPublishEditModel.creativeFlowData.setExtraShareOptions(adVar.mExtraShareOptions);
            videoPublishEditModel.setMainBusinessContext(eVar);
        }
        if (intent.hasExtra("extra_mention_user_model")) {
            videoPublishEditModel.mentionUserModel = (ExtraMentionUserModel) intent.getSerializableExtra("extra_mention_user_model");
        }
        if (intent.hasExtra("extra_ar_text")) {
            videoPublishEditModel.arTextList = intent.getStringArrayListExtra("extra_ar_text");
        }
        if (intent.hasExtra("extra_sticker_text")) {
            videoPublishEditModel.messageBubbleTexts = intent.getStringArrayListExtra("extra_sticker_text");
        }
        if (intent.hasExtra("extra_countdown_mode")) {
            videoPublishEditModel.countDownModes = intent.getIntegerArrayListExtra("extra_countdown_mode");
        }
        if (intent.hasExtra("extra_draft_transform_model")) {
            videoPublishEditModel.draftEditTransferModel = (DraftEditTransferModel) intent.getParcelableExtra("extra_draft_transform_model");
        }
        if (intent.hasExtra("av_upload_struct")) {
            videoPublishEditModel.uploadMiscInfoStruct = (com.ss.android.ugc.aweme.shortvideo.i) intent.getSerializableExtra("av_upload_struct");
        }
        videoPublishEditModel.containBackgroundVideo = intent.getBooleanExtra("contain_backgroundvideo", false);
        videoPublishEditModel.supportRetake = intent.getBooleanExtra("support_retake", true);
        if (intent.hasExtra("extra_multi_edit_video_data")) {
            videoPublishEditModel.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) intent.getParcelableExtra("extra_multi_edit_video_data");
        }
        if (intent.hasExtra("key_mv_theme_data")) {
            videoPublishEditModel.mvCreateVideoData = (com.ss.android.ugc.aweme.mvtheme.d) intent.getSerializableExtra("key_mv_theme_data");
            if (videoPublishEditModel.mvCreateVideoData != null) {
                if (videoPublishEditModel.mvCreateVideoData.mvType == 1) {
                    videoPublishEditModel.videoEditorType = 3;
                } else {
                    videoPublishEditModel.videoEditorType = 2;
                }
            }
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (intent.hasExtra("stitch_params") || videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.videoEditorType = 7;
            videoPublishEditModel.stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            if (!(videoPublishEditModel.stitchParams == null || Float.compare(videoPublishEditModel.mVideoCoverStartTm, 0.0f) != 0 || videoPublishEditModel.getPreviewInfo().getVideoList().get(0).getVideoFileInfo() == null)) {
                videoPublishEditModel.mVideoCoverStartTm = ((float) (videoPublishEditModel.getPreviewInfo().getVideoList().get(0).getVideoFileInfo().getDuration() + 1)) / 1000.0f;
            }
        } else if (es.n(videoPublishEditModel)) {
            videoPublishEditModel.videoEditorType = 10;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        } else if (intent.hasExtra("photo_canvas_data")) {
            videoPublishEditModel.videoEditorType = 11;
        }
        if (intent.hasExtra("key_stick_point_data")) {
            videoPublishEditModel.stickPointData = (com.ss.android.ugc.aweme.shortvideo.ac.a) intent.getSerializableExtra("key_stick_point_data");
        }
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            videoPublishEditModel.veCherEffectParam = (ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param");
        }
        if (intent.hasExtra("extra_ve_audio_effect_param")) {
            videoPublishEditModel.veAudioEffectParam = (AudioEffectParam) intent.getParcelableExtra("extra_ve_audio_effect_param");
        }
        if (intent.hasExtra("sticker_challenge")) {
            videoPublishEditModel.stickerChallenge = (StickerChallenge) intent.getParcelableExtra("sticker_challenge");
        }
        if (intent.hasExtra("audio_record_param")) {
            videoPublishEditModel.veAudioRecorderParam = (AudioRecorderParam) intent.getParcelableExtra("audio_record_param");
        }
        videoPublishEditModel.singleImageCoverBitmapData = (SingleImageCoverBitmapData) intent.getParcelableExtra("key_choose_media_item_cover_bitmap_data");
        videoPublishEditModel.pic2VideoSource = a(intent, "picture_source");
        videoPublishEditModel.allowDownloadSetting = intent.getIntExtra("download_setting", 0);
        videoPublishEditModel.mUseMusicBeforeEdit = intent.getBooleanExtra("use_music_before_edit", false);
        videoPublishEditModel.duetLayout = a(intent, "extra_duet_layout");
        videoPublishEditModel.draftDuetExtraInfo = (DuetExtraInfo) intent.getParcelableExtra(DuetExtraInfo.class.getName());
        videoPublishEditModel.greenScreenMaterialList = intent.getParcelableArrayListExtra("green_screen_material_list");
        videoPublishEditModel.cameraLensInfo = intent.getStringArrayListExtra("extra_camera_lens_info");
        videoPublishEditModel.cutSameEditData = (CutSameEditData) intent.getParcelableExtra("cutsame_data");
        videoPublishEditModel.isDraftMusicIllegal = intent.getBooleanExtra("draft_music_legal_param", false);
        videoPublishEditModel.videoDurationFromVideoCutPage = intent.getIntExtra("preview_video_length", -1);
        videoPublishEditModel.fromPropId = a(intent, "from_prop_id");
        videoPublishEditModel.isDefaultProp = intent.getBooleanExtra("is_default_prop", false);
        videoPublishEditModel.publishStage = intent.getIntExtra("extra_publish_stage", 0);
        if (intent.hasExtra("photo_canvas_data")) {
            videoPublishEditModel.canvasVideoData = (CanvasVideoData) intent.getSerializableExtra("photo_canvas_data");
        }
        videoPublishEditModel.isWestWindowExistStr = a(intent, "is_west_window_exist");
        if (intent.hasExtra("enter_method")) {
            videoPublishEditModel.shootEnterMethod = a(intent, "enter_method");
        }
        videoPublishEditModel.autoAttachedAnchor = (com.ss.android.ugc.aweme.common.a) intent.getSerializableExtra("auto_selected_anchor");
        videoPublishEditModel.tagUserList = (ArrayList) intent.getSerializableExtra("extra_social_video_tag_list");
        videoPublishEditModel.isAudioEnhance = intent.getBooleanExtra("is_audio_enhance", false);
        if (videoPublishEditModel.autoAttachedAnchor == null) {
            videoPublishEditModel.autoAttachedAnchor = (com.ss.android.ugc.aweme.common.a) intent.getSerializableExtra("auto_selected_anchor");
        }
        if (videoPublishEditModel.openPlatformExtra == null) {
            videoPublishEditModel.openPlatformExtra = a(intent, "open_platform_extra");
        }
        if (videoPublishEditModel.openPlatformClientKey == null) {
            videoPublishEditModel.openPlatformClientKey = a(intent, "open_platform_client_key");
        }
        videoPublishEditModel.cut2EditTransferModel = (Cut2EditTransferModel) intent.getParcelableExtra("cut_to_edit_transfer_model");
        videoPublishEditModel.editMusicSyncMode = intent.getBooleanExtra("edit_music_sync_mode", false);
        videoPublishEditModel.draftSaveTime = intent.getLongExtra("draft_save_time", 0);
        videoPublishEditModel.fromItemId = dv.f126646e;
        return videoPublishEditModel;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
