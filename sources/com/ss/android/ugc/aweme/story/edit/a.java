package com.ss.android.ugc.aweme.story.edit;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.base.a.e;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditMusicModel;
import com.ss.android.ugc.aweme.utils.ds;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(89595);
    }

    public static final Bundle a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        Bundle bundle = new Bundle();
        bundle.putString("creation_id", videoPublishEditModel.creationId);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("publish_private_state", 0);
        bundle.putInt("publish_permission", 0);
        bundle.putInt("extra_auto_retry", e.a());
        return bundle;
    }

    public static final VideoPublishEditModel a(StoryEditModel storyEditModel) {
        l.d(storyEditModel, "");
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creationId = storyEditModel.getCreationId();
        videoPublishEditModel.mShootWay = storyEditModel.getShootWay();
        videoPublishEditModel.mOrigin = storyEditModel.getOrigin();
        boolean z = false;
        videoPublishEditModel.isPrivate = 0;
        EditContext editContext = storyEditModel.getEditContext();
        if (editContext != null) {
            videoPublishEditModel.containBackgroundVideo = editContext.getContainBackgroundVideo();
            videoPublishEditModel.mStickerID = editContext.getStickers();
            videoPublishEditModel.extractFramesModel = editContext.getExtractFramesModel();
            videoPublishEditModel.mVideoSegmentsDesc = editContext.getVideoSegmentDesc();
            videoPublishEditModel.mCameraPosition = editContext.getCameraPosition();
            List<String> arTextList = editContext.getArTextList();
            if (arTextList == null) {
                arTextList = z.INSTANCE;
            }
            videoPublishEditModel.arTextList = new ArrayList(arTextList);
            List<String> messageBubbleTexts = editContext.getMessageBubbleTexts();
            if (messageBubbleTexts == null) {
                messageBubbleTexts = z.INSTANCE;
            }
            videoPublishEditModel.messageBubbleTexts = new ArrayList(messageBubbleTexts);
            List<String> cameraLensInfo = editContext.getCameraLensInfo();
            if (cameraLensInfo == null) {
                cameraLensInfo = z.INSTANCE;
            }
            videoPublishEditModel.cameraLensInfo = new ArrayList<>(cameraLensInfo);
            videoPublishEditModel.cameraIds = editContext.getCameraIds();
            String metadataMapStr = editContext.getMetadataMapStr();
            if (!(metadataMapStr == null || metadataMapStr.length() == 0 || metadataMapStr == null)) {
                videoPublishEditModel.metadataMap = ds.a(metadataMapStr);
            }
            videoPublishEditModel.stickerInfo = editContext.getStickerInfo();
        }
        videoPublishEditModel.maxDuration = 15000;
        if (storyEditModel.getOrigin() == 0) {
            z = true;
        }
        videoPublishEditModel.mFromCut = z;
        l.d(storyEditModel, "");
        videoPublishEditModel.storyEditEtParam = new StoryEditEtParam("story_shoot_page", "story", b.b(storyEditModel), b.a(storyEditModel), storyEditModel.isMultiContent(), storyEditModel.getClips().size());
        StoryEditClipModel storyEditClipModel = (StoryEditClipModel) n.h((List) storyEditModel.getClips());
        if (storyEditClipModel != null) {
            a(storyEditClipModel, videoPublishEditModel);
        }
        return videoPublishEditModel;
    }

    public static final void b(VideoPublishEditModel videoPublishEditModel, StoryEditClipModel storyEditClipModel) {
        l.d(videoPublishEditModel, "");
        l.d(storyEditClipModel, "");
        storyEditClipModel.setInfoStickerModel(videoPublishEditModel.infoStickerModel);
        storyEditClipModel.setMainBusinessContextStr(videoPublishEditModel.getMainBusinessData());
        String str = videoPublishEditModel.textEffectIds;
        l.b(str, "");
        storyEditClipModel.setTextEffectIds(str);
        String str2 = videoPublishEditModel.textTypes;
        l.b(str2, "");
        storyEditClipModel.setTextTypes(str2);
        storyEditClipModel.setMentionTextList(videoPublishEditModel.mentionTextList);
        storyEditClipModel.setHashTagTextList(videoPublishEditModel.hashTagTextList);
    }

    public static final void d(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        l.d(storyEditClipModel, "");
        l.d(videoPublishEditModel, "");
        videoPublishEditModel.infoStickerModel = storyEditClipModel.getInfoStickerModel();
        videoPublishEditModel.setMainBusinessData(storyEditClipModel.getMainBusinessContextStr());
        videoPublishEditModel.textEffectIds = storyEditClipModel.getTextEffectIds();
        videoPublishEditModel.textTypes = storyEditClipModel.getTextTypes();
        videoPublishEditModel.mentionTextList = storyEditClipModel.getMentionTextList();
        videoPublishEditModel.hashTagTextList = storyEditClipModel.getHashTagTextList();
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, StoryEditClipModel storyEditClipModel) {
        l.d(videoPublishEditModel, "");
        l.d(storyEditClipModel, "");
        storyEditClipModel.setVoiceVolume(videoPublishEditModel.voiceVolume);
        storyEditClipModel.setMusicVolume(videoPublishEditModel.musicVolume);
        String str = videoPublishEditModel.mMusicPath;
        String str2 = videoPublishEditModel.musicId;
        String str3 = videoPublishEditModel.mMusicOrigin;
        int i2 = videoPublishEditModel.mMusicStart;
        int i3 = videoPublishEditModel.mMusicEnd;
        int i4 = videoPublishEditModel.mCurMusicLength;
        int i5 = videoPublishEditModel.mMusicShowRank;
        int i6 = videoPublishEditModel.mMusicRecType;
        Boolean bool = videoPublishEditModel.isSoundLoop;
        l.b(bool, "");
        storyEditClipModel.setEditMusicModel(new StoryEditMusicModel(str, str2, str3, i2, i3, i4, i5, i6, bool.booleanValue(), cr.a().f125295a));
    }

    public static final void b(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        l.d(storyEditClipModel, "");
        l.d(videoPublishEditModel, "");
        videoPublishEditModel.videoEditorType = storyEditClipModel.getVideoEditorType();
        videoPublishEditModel.mWorkspace = storyEditClipModel.getWorkspace();
        videoPublishEditModel.setPreviewInfo(storyEditClipModel.getPreviewMediaInfo());
        videoPublishEditModel.isFastImport = storyEditClipModel.isFastImport();
        videoPublishEditModel.mOutputFile = storyEditClipModel.getOutputFile();
        videoPublishEditModel.mParallelUploadOutputFile = storyEditClipModel.getParallelUploadOutputFile();
        videoPublishEditModel.mEncodedAudioOutputFile = storyEditClipModel.getEncodedAudioOutputFile();
        videoPublishEditModel.mOutVideoWidth = storyEditClipModel.getOutVideoWidth();
        videoPublishEditModel.mOutVideoHeight = storyEditClipModel.getOutVideoHeight();
        videoPublishEditModel.mVideoCanvasWidth = storyEditClipModel.getVideoCanvasWidth();
        videoPublishEditModel.mVideoCanvasHeight = storyEditClipModel.getVideoCanvasHeight();
        videoPublishEditModel.multiEditVideoRecordData = storyEditClipModel.getMultiEditVideoRecordData();
    }

    public static final void c(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        l.d(storyEditClipModel, "");
        l.d(videoPublishEditModel, "");
        videoPublishEditModel.voiceVolume = storyEditClipModel.getVoiceVolume();
        videoPublishEditModel.musicVolume = storyEditClipModel.getMusicVolume();
        videoPublishEditModel.mMusicPath = storyEditClipModel.getEditMusicModel().getMusicPath();
        videoPublishEditModel.musicId = storyEditClipModel.getEditMusicModel().getMusicId();
        videoPublishEditModel.mMusicOrigin = storyEditClipModel.getEditMusicModel().getMusicOrigin();
        videoPublishEditModel.mMusicStart = storyEditClipModel.getEditMusicModel().getMusicStart();
        videoPublishEditModel.mMusicEnd = storyEditClipModel.getEditMusicModel().getMusicEnd();
        videoPublishEditModel.mCurMusicLength = storyEditClipModel.getEditMusicModel().getMusicLength();
        videoPublishEditModel.mMusicShowRank = storyEditClipModel.getEditMusicModel().getMusicShowRank();
        videoPublishEditModel.mMusicRecType = storyEditClipModel.getEditMusicModel().getMusicRecType();
        videoPublishEditModel.isSoundLoop = Boolean.valueOf(storyEditClipModel.getEditMusicModel().isMusicLoop());
    }

    public static final void a(StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel) {
        l.d(storyEditClipModel, "");
        l.d(videoPublishEditModel, "");
        if (storyEditClipModel.getSourceContentType() == 1) {
            videoPublishEditModel.videoCount = 1;
            videoPublishEditModel.photoCount = 0;
        } else {
            videoPublishEditModel.videoCount = 0;
            videoPublishEditModel.photoCount = 1;
        }
        videoPublishEditModel.canvasVideoData = storyEditClipModel.getCanvasVideoData();
        videoPublishEditModel.mCurFilterIds = storyEditClipModel.getMCurFilterIds();
        videoPublishEditModel.mSelectedFilterId = storyEditClipModel.getMSelectedFilterId();
        videoPublishEditModel.mSelectedFilterLabel = storyEditClipModel.getMSelectedFilterLabel();
        videoPublishEditModel.mSelectedFilterResId = storyEditClipModel.getMSelectedFilterResId();
        videoPublishEditModel.mCurFilterLabels = storyEditClipModel.getMCurFilterLabels();
        videoPublishEditModel.mSelectedId = storyEditClipModel.getSelectFilterIndex();
        videoPublishEditModel.mSelectedFilterIntensity = storyEditClipModel.getMSelectedFilterIntensity();
        videoPublishEditModel.setCoverPublishModel(storyEditClipModel.getCoverPublishModel());
        videoPublishEditModel.mEffectList = storyEditClipModel.getEffectList();
        videoPublishEditModel.isStoryEditMode = true;
        videoPublishEditModel.sessionId = storyEditClipModel.getSessionId();
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(storyEditClipModel.getSessionId(), null);
        g.a().c();
        videoPublishEditModel.setNewVersion(3);
        b(storyEditClipModel, videoPublishEditModel);
        c(storyEditClipModel, videoPublishEditModel);
        d(storyEditClipModel, videoPublishEditModel);
    }
}
