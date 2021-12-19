package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.d;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.shortvideo.util.a;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.at;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.k;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.ss.android.ugc.tools.f.b;
import h.a.n;
import h.m.l;
import h.m.p;
import java.util.Map;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128470a = new a((byte) 0);

    static {
        Covode.recordClassIndex(84237);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84238);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x056d A[SYNTHETIC, Splitter:B:223:0x056d] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06c7  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0735  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x075a  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0792  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x07ae  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x07f4  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0819  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0862  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0874  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0888  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x088a  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x088d  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0895  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x08a0  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x08b1  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x08ca  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x08d5  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x08d7  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x092d  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x09c7  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0a1b  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0a2a  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0a34  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0a4d  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0a69  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0a9e  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0ac7  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0acd  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0ad0  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0b07  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b5e  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0b77  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0bb3  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0bed  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0bf0  */
    /* JADX WARNING: Removed duplicated region for block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0306  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r22, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r23, android.widget.CheckBox r24, int r25, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r26, com.ss.android.ugc.aweme.shortvideo.p r27, java.lang.String r28, java.lang.String r29, com.ss.android.ugc.aweme.shortvideo.model.Mission r30, java.lang.String r31, boolean r32, int r33) {
        /*
        // Method dump skipped, instructions count: 3103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.eventtrack.e.a(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.widget.CheckBox, int, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText, com.ss.android.ugc.aweme.shortvideo.p, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.Mission, java.lang.String, boolean, int):void");
    }

    private static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Object[] array = new l(";").split(str, 0).toArray(new String[0]);
            if (array != null) {
                StringBuilder sb = new StringBuilder();
                for (String str3 : (String[]) array) {
                    int parseInt = Integer.parseInt(str3);
                    if (parseInt == 1) {
                        str2 = "local";
                    } else if (parseInt == 2) {
                        str2 = "instagram";
                    } else if (parseInt == 3) {
                        str2 = "instagram_story";
                    } else if (parseInt != 101) {
                        str2 = "";
                    } else {
                        str2 = "twitter";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(",");
                    }
                }
                String sb2 = sb.toString();
                h.f.b.l.b(sb2, "");
                if (p.c(sb2, ",", false)) {
                    sb2 = sb2.substring(0, sb2.length() - 1);
                    h.f.b.l.b(sb2, "");
                }
                return sb2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        h.f.b.l.d(videoPublishEditModel, "");
        b a2 = new b().a("scene", "create_publish").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).a("enter_from", "publish");
        ar arVar = ar.f132216a;
        h.f.b.l.b(arVar, "");
        b a3 = a2.a("dalvikPss", arVar.f132218c);
        ar arVar2 = ar.f132216a;
        h.f.b.l.b(arVar2, "");
        b a4 = a3.a("nativePss", arVar2.f132219d);
        ar arVar3 = ar.f132216a;
        h.f.b.l.b(arVar3, "");
        b a5 = a4.a("otherPss", arVar3.f132221f);
        ar arVar4 = ar.f132216a;
        h.f.b.l.b(arVar4, "");
        r.a("av_memory_log", a5.a("totalPss", arVar4.f132220e).f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i6;
        String str8;
        h.f.b.l.d(videoPublishEditModel, "");
        b a2 = new b().a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("shoot_tab_name", es.e(videoPublishEditModel)).a("shoot_enter_method", videoPublishEditModel.shootEnterMethod);
        h.f.b.l.b(a2, "");
        b a3 = d.a(bp.a(a2, videoPublishEditModel), videoPublishEditModel.mBeautyMobParam);
        String str9 = "0";
        if (com.ss.android.ugc.aweme.property.b.a()) {
            str = "1";
        } else {
            str = str9;
        }
        b a4 = a3.a("is_hardcode", str).a("bite_rate", String.valueOf(com.ss.android.ugc.aweme.property.b.c())).a("video_quality", com.ss.android.ugc.aweme.property.b.d()).a("resolution", videoPublishEditModel.getVideoResolution()).a("content_type", es.c(videoPublishEditModel));
        if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        b b2 = a4.a("is_dubbed", i2).a("is_subtitle", videoPublishEditModel.hasSubtitle() ? 1 : 0).a("original_resolution", bp.o(videoPublishEditModel)).b("is_restore_crash", videoPublishEditModel.isFromCrash());
        CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
        if (commentVideoModel == null || (str2 = commentVideoModel.getEnterMethod()) == null) {
            str2 = "";
        }
        b a5 = b2.a("enter_method", str2);
        if (es.c(videoPublishEditModel).equals("photo_canvas")) {
            a5.a("content_source", "upload");
        } else {
            a5.a("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        }
        if (videoPublishEditModel.draftId != 0) {
            a5.a("draft_id", videoPublishEditModel.draftId);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.clientId)) {
            a5.a("channel", videoPublishEditModel.clientId);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.shareId)) {
            a5.a("open_platform_share_id", videoPublishEditModel.shareId);
        }
        if (!z || videoPublishEditModel.isFromCrash()) {
            a5.a("enter_method", "click_next_button");
            a5.a("enter_from", "video_edit_page");
        } else if (!TextUtils.isEmpty(videoPublishEditModel.newDraftId)) {
            a5.a("new_draft_id", videoPublishEditModel.newDraftId);
            if (videoPublishEditModel.mDraftToEditFrom == 0) {
                a5.a("enter_method", "click_draft");
                if ("general_draft_list" != 0) {
                    a5.a("draft_way", "general_draft_list");
                }
            }
        }
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i3 = videoPublishEditModel.videoCount;
            i4 = videoPublishEditModel.photoCount;
            if (videoPublishEditModel.mFromMultiCut) {
                str8 = "multiple_content";
            } else {
                str8 = "single_content";
            }
            a5.a("upload_type", str8);
        } else {
            if (videoPublishEditModel.extractFramesModel != null) {
                i3 = videoPublishEditModel.extractFramesModel.getFrames().size();
            } else if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null) {
                i3 = 0;
            } else {
                i4 = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
                i3 = 0;
            }
            i4 = 0;
        }
        StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
        if (stickerInfo != null) {
            if (stickerInfo.hasTabOrder()) {
                a5.a("prop_tab_order", stickerInfo.getTabOrder());
            }
            if (stickerInfo.hasImprPosition()) {
                a5.a("prop_impr_position", stickerInfo.getImprPosition());
            }
        }
        a5.a("video_cnt", i3);
        a5.a("pic_cnt", i4);
        a5.a("music_selected_from", videoPublishEditModel.getMusicOrigin());
        if (i3 + i4 > 1) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        a5.a("is_multi_content", i5);
        a5.a("mix_type", com.ss.android.ugc.aweme.shortvideo.ac.b.a(i3, i4));
        if (CommentUtils.needMob(videoPublishEditModel)) {
            str3 = videoPublishEditModel.commentVideoModel.getCommentId();
        } else {
            str3 = "";
        }
        a5.a("reply_comment_id", str3);
        if (CommentUtils.needMob(videoPublishEditModel)) {
            str4 = videoPublishEditModel.commentVideoModel.getUserId();
        } else {
            str4 = "";
        }
        a5.a("reply_user_id", str4);
        if (!TextUtils.isEmpty(videoPublishEditModel.getBindMvId())) {
            a5.a("mv_id", videoPublishEditModel.getBindMvId());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            StringBuilder sb = new StringBuilder();
            String str10 = videoPublishEditModel.pic2VideoSource;
            h.f.b.l.b(str10, "");
            Object[] array = new l(",").split(str10, 0).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            if (!com.ss.android.ugc.aweme.base.utils.d.a(strArr)) {
                for (String str11 : strArr) {
                    if (str11.length() != 0) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str11);
                    }
                }
            }
            if (!TextUtils.isEmpty(sb)) {
                a5.a("picture_source", sb.toString());
            }
        }
        if (videoPublishEditModel.stickerInfo != null && !TextUtils.isEmpty(videoPublishEditModel.stickerInfo.getRecId())) {
            a5.a("prop_rec_id", videoPublishEditModel.stickerInfo.getRecId());
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            h.f.b.l.b(infoStickerModel, "");
            boolean[] a6 = k.a(infoStickerModel);
            a5.a("is_diy_prop", a6[0] ? 1 : 0);
            a5.a("remove_background", a6[1] ? 1 : 0);
        }
        a5.a("app_mem_use", a.C3430a.a("av_video_record_init").getFirst().intValue());
        a5.a("availble_mem", a.C3430a.a("av_video_record_init").getSecond().intValue());
        a5.a("text_added", videoPublishEditModel.hasTextSticker() ? 1 : 0);
        a5.a("is_text_reading", videoPublishEditModel.hasReadTextAudio() ? 1 : 0);
        if (videoPublishEditModel.hasReadTextAudio()) {
            a5.a("tone_list", videoPublishEditModel.getReadTextAllSpeakerId());
        }
        a5.a("brightness", com.ss.android.ugc.aweme.common.e.a(i.f115645a));
        a5.a("zoom_value", Float.valueOf(videoPublishEditModel.currentZoomValue));
        a5.a("prop_id", videoPublishEditModel.getStickers());
        a5.a("prop_list", videoPublishEditModel.getStickers());
        a5.a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
        a5.a("effect_list", videoPublishEditModel.getEditEffectList());
        if (videoPublishEditModel.isDuet()) {
            a5.a("is_through_duet_sticker", videoPublishEditModel.duetFromDuetSticker).a("is_from_duet_button", videoPublishEditModel.mDuetFromDuetButton);
        }
        String giphyGifIds = VideoPublishEditModel.getGiphyGifIds(videoPublishEditModel.greenScreenMaterialList);
        a5.a("is_giphy", !TextUtils.isEmpty(giphyGifIds) ? 1 : 0);
        a5.a("giphy_id", giphyGifIds);
        if (TextUtils.equals(videoPublishEditModel.enterFrom, "super_entrance")) {
            a5.a("is_special_icon", 1);
        }
        if (videoPublishEditModel.isShoutout()) {
            a5.a("shoot_entrance", com.ss.android.ugc.aweme.shoutouts.d.shootWay);
            a5.a("enter_from", "shoutouts_detail_page");
        }
        a5.a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
        if (videoPublishEditModel.isAutoEnhanceEnable(com.ss.android.ugc.aweme.shortvideo.edit.b.a.a())) {
            a5.a("is_quality_improve", videoPublishEditModel.autoEnhanceOn ? 1 : 0);
        }
        if (videoPublishEditModel.commentVideoModel != null) {
            str5 = videoPublishEditModel.commentVideoModel.getCommentId();
        } else {
            str5 = null;
        }
        a5.a("comment_id", str5);
        QaStruct b3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(videoPublishEditModel.getMainBusinessContext());
        if (b3 != null) {
            if (b3.getQuestionId() != 0) {
                a5.a("question_id", b3.getQuestionId());
                a5.a("qa_type", "answer");
                a5.a("is_qa_sticker", 1);
            } else {
                a5.a("shoot_way", "question");
                a5.a("question_id", (String) null);
                a5.a("qa_type", "question");
                a5.a("is_qa_sticker", 1);
            }
        }
        if (com.ss.android.ugc.aweme.port.in.l.f115658a.C().b()) {
            str6 = "1";
        } else {
            str6 = str9;
        }
        a5.a("awareness_dot", str6);
        a5.a("prop_selected_from", videoPublishEditModel.getPropSource());
        a5.a("original_prop_count", videoPublishEditModel.mOriginalStickerCount);
        String str12 = videoPublishEditModel.mDesignerIdList;
        if (str12 == null) {
            str12 = "";
        }
        a5.a("prop_author_id", str12);
        if (!TextUtils.isEmpty(videoPublishEditModel.mMusicPath)) {
            FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.creativeFlowData.getFlowDataMusicInfo();
            if (flowDataMusicInfo == null || !flowDataMusicInfo.isSelectedByAuto()) {
                a5.a("music_selected_method", "manual");
            } else {
                a5.a("music_selected_method", "auto");
            }
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            if (videoPublishEditModel.veAudioRecorderParam.getNeedOriginalSound()) {
                str9 = "1";
            }
            a5.a("has_original_sound", str9);
        } else {
            a5.a("has_original_sound", "1");
        }
        VideoInfoData videoInfoData = EditVideoInfoServiceImpl.a().getVideoInfoData(videoPublishEditModel.creationId);
        if (videoInfoData != null) {
            a5.a("volume_original_delta", (int) ((videoPublishEditModel.voiceVolume - videoInfoData.getRusumeVolumeOrigin()) * 100.0f));
            a5.a("volume_music_delta", (int) ((videoPublishEditModel.musicVolume - videoInfoData.getRusumeVolumeMusic()) * 100.0f));
        }
        if (videoPublishEditModel.isAudioEnhance) {
            str7 = "on";
        } else {
            str7 = "off";
        }
        a5.a("noise_reducer_status", str7);
        a5.a("tag_id_list", n.a(videoPublishEditModel.getTextStickerChallenges().getReadTextChallengeIds(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
        if (g.a().o().c()) {
            i6 = g.a().o().d();
        } else {
            i6 = 0;
        }
        a5.a("publish_cnt", i6);
        String str13 = videoPublishEditModel.uploadMethod;
        if (str13 == null) {
            str13 = "";
        }
        a5.a("upload_method", str13);
        at.a("enter_video_post_page");
        Map<String, String> map = a5.f149193a;
        h.f.b.l.b(map, "");
        com.ss.android.ugc.aweme.shortvideo.util.performance.a.a("enter_video_post_page", map);
    }
}
