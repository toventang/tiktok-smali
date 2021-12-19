package com.ss.android.ugc.gamora.editor.lightening.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

final class a {
    static {
        Covode.recordClassIndex(96043);
    }

    public static void a(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.title = null;
        videoPublishEditModel.structList = null;
        videoPublishEditModel.isPrivate = 0;
        videoPublishEditModel.challenges = null;
        videoPublishEditModel.commentSetting = 0;
        videoPublishEditModel.compileProbeResult = null;
        videoPublishEditModel.commerceData = null;
        videoPublishEditModel.allowAutoCaptionSetting = 0;
        videoPublishEditModel.allowDownloadSetting = 0;
        videoPublishEditModel.microAppId = null;
        videoPublishEditModel.microAppModel = null;
        videoPublishEditModel.chain = null;
        videoPublishEditModel.disableDeleteChain = false;
        videoPublishEditModel.geofencingSetting = null;
        videoPublishEditModel.excludeUserList = null;
        videoPublishEditModel.allowRecommend = 0;
        videoPublishEditModel.isDraftMusicIllegal = false;
        videoPublishEditModel.playlist_id = null;
        videoPublishEditModel.playlist_name = null;
        videoPublishEditModel.mVideoCoverStartTm = 0.0f;
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            videoPublishEditModel.veAudioRecorderParam.setAudioRecordIndex(-1);
        }
        videoPublishEditModel.setCoverPublishModel(new CoverPublishModel());
    }
}
