package com.ss.android.ugc.aweme.external.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.MediaInfo;
import com.ss.android.ugc.aweme.services.external.ui.MultiVideoMedia;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cr;
import dmt.av.video.aj;
import h.f.a.a;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b implements IEditService {
    static {
        Covode.recordClassIndex(56697);
    }

    private static Intent a(EditConfig editConfig) {
        Intent intent = new Intent();
        intent.putExtra("creation_id", editConfig.getCreationId());
        intent.putExtra("shoot_way", editConfig.getShootway());
        intent.putExtra("share_id", editConfig.getShareID());
        intent.putExtra("channel", editConfig.getChannel());
        intent.putExtra("hashtag", editConfig.getHashtag());
        AVChallenge challenge = editConfig.getChallenge();
        if (challenge != null) {
            Objects.requireNonNull(challenge, "null cannot be cast to non-null type java.io.Serializable");
            intent.putExtra("av_challenge", (Serializable) challenge);
        }
        String musicOrigin = editConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        Integer launchFlag = editConfig.getLaunchFlag();
        if (launchFlag != null) {
            intent.addFlags(launchFlag.intValue());
        }
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig) {
        MediaInfo mediaInfo;
        c cVar;
        l.d(editConfig, "");
        if (context != null) {
            if (editConfig.getClear() && (cVar = c.f109414a) != null) {
                cVar.b();
            }
            if (editConfig.getMediaInfo() != null && (mediaInfo = editConfig.getMediaInfo()) != null) {
                int i2 = -1;
                if (mediaInfo instanceof VideoMedia) {
                    VideoMedia videoMedia = (VideoMedia) mediaInfo;
                    String filePath = videoMedia.getFilePath();
                    Intent a2 = a(editConfig);
                    Bundle extraBundle = videoMedia.getExtraBundle();
                    if (extraBundle != null) {
                        a2.putExtras(extraBundle);
                    }
                    a<z> onEnterEditListener = editConfig.getOnEnterEditListener();
                    a2.putExtra("file_path", filePath);
                    if (a2.getBooleanExtra("extra_enter_from_live", false)) {
                        i2 = 8;
                    }
                    com.ss.android.ugc.aweme.shortvideo.r.a.a().a(context, a2, i2, onEnterEditListener);
                } else if (mediaInfo instanceof MultiVideoMedia) {
                    MultiVideoMedia multiVideoMedia = (MultiVideoMedia) mediaInfo;
                    ArrayList<MediaModel> videoMedias = multiVideoMedia.getVideoMedias();
                    Intent a3 = a(editConfig);
                    Bundle extraBundle2 = multiVideoMedia.getExtraBundle();
                    if (extraBundle2 != null) {
                        a3.putExtras(extraBundle2);
                    }
                    Integer requestCode = editConfig.getRequestCode();
                    a<z> onEnterEditListener2 = editConfig.getOnEnterEditListener();
                    a3.putExtra("open_sdk_import_media_list", videoMedias);
                    if (requestCode != null) {
                        i2 = requestCode.intValue();
                    }
                    com.ss.android.ugc.aweme.shortvideo.r.a.a().a(context, a3, i2, onEnterEditListener2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig) {
        l.d(editConfig, "");
        l.d(shareConfig, "");
        if (context != null) {
            int type = shareConfig.getType();
            if (type == 2) {
                Bundle bundle = new Bundle();
                bundle.putString("creation_id", editConfig.getCreationId());
                bundle.putString("shoot_way", editConfig.getShootway());
                AVChallenge challenge = editConfig.getChallenge();
                if (challenge != null) {
                    Objects.requireNonNull(challenge, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable("av_challenge", challenge);
                }
                List<AVChallenge> challenges = editConfig.getChallenges();
                if (challenges != null) {
                    Objects.requireNonNull(challenges, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable("av_challenge_list", (Serializable) challenges);
                }
                bundle.putBoolean("is_from_sys_share", true);
                bundle.putString("extra_share_app_name", shareConfig.getAppName());
                bundle.putSerializable("extra_share_context", shareConfig.getShareContext());
                bundle.putString("open_platform_client_key", shareConfig.getShareContext().mClientKey);
                bundle.putString("open_platform_extra", shareConfig.getShareContext().mOpenPlatformExtra);
                bundle.putString("anchor_source_type", shareConfig.getShareContext().mAnchorSourceType);
                bundle.putSerializable("_aweme_open_sdk_extra_share_options", shareConfig.getShareContext().mExtraShareOptions);
                shareConfig.getShareContext();
                String file = shareConfig.getFile();
                if (file == null) {
                    l.b();
                }
                VideoMedia videoMedia = new VideoMedia(file);
                videoMedia.setExtraBundle(bundle);
                editConfig.setMediaInfo(videoMedia);
            } else if (type == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("shoot_way", editConfig.getShootway());
                AVChallenge challenge2 = editConfig.getChallenge();
                if (!(challenge2 instanceof Serializable)) {
                    challenge2 = null;
                }
                bundle2.putSerializable("av_challenge", challenge2);
                if (editConfig.getChallenges() != null) {
                    List<AVChallenge> challenges2 = editConfig.getChallenges();
                    Objects.requireNonNull(challenges2, "null cannot be cast to non-null type java.io.Serializable");
                    bundle2.putSerializable("av_challenge_list", (Serializable) challenges2);
                }
                bundle2.putBoolean("is_from_sys_share", true);
                bundle2.putString("extra_share_app_name", shareConfig.getAppName());
                bundle2.putSerializable("extra_share_context", shareConfig.getShareContext());
                List<String> videoList = shareConfig.getVideoList();
                if (videoList != null) {
                    ArrayList arrayList = new ArrayList();
                    long j2 = 0;
                    for (T t : videoList) {
                        MediaModel mediaModel = new MediaModel(j2);
                        int[] a2 = aj.a(t);
                        mediaModel.f109396h = (long) a2[3];
                        mediaModel.f109400l = a2[0];
                        mediaModel.f109401m = a2[1];
                        mediaModel.f109390b = t;
                        arrayList.add(mediaModel);
                        j2++;
                    }
                    MultiVideoMedia multiVideoMedia = new MultiVideoMedia(arrayList);
                    multiVideoMedia.setExtraBundle(bundle2);
                    editConfig.setMediaInfo(multiVideoMedia);
                }
            }
            startEdit(context, editConfig);
            cr.a().f125295a = null;
        }
    }
}
