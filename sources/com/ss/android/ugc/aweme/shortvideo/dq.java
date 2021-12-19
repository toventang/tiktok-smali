package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.m;
import com.ss.android.ugc.aweme.df.f;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.photo.b.a;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.question.ForumInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bm;
import com.ss.android.ugc.aweme.shortvideo.util.x;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.data.d;
import com.ss.android.ugc.aweme.utils.it;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public final class dq {

    /* renamed from: a  reason: collision with root package name */
    private final List<CreateAnchorInfo> f126477a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Keva f126478b = Keva.getRepo("allow_show_keva_repo");

    static {
        Covode.recordClassIndex(82963);
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0799  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x085f  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0899  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x08c6  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08e9  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x094d A[SYNTHETIC, Splitter:B:301:0x094d] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x097f A[SYNTHETIC, Splitter:B:314:0x097f] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a07  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0a13  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0a27  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0a62  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0a91  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0aa7  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0ab2  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0abf  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0acb  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0ad5  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0aed  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0b50  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0b5a  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0b66  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0b84  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0bb1  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0c1c  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0c3a  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0c3e  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0c53  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0c68  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0c70  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0c76  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0c7a  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0c7e  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0c81  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0c84  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0cef  */
    /* JADX WARNING: Removed duplicated region for block: B:473:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34, java.util.LinkedHashMap<java.lang.String, java.lang.String> r35) {
        /*
        // Method dump skipped, instructions count: 3380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.dq.a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0425 A[Catch:{ JSONException -> 0x044b }, LOOP:7: B:158:0x041f->B:160:0x0425, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04e5 A[SYNTHETIC, Splitter:B:188:0x04e5] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r20, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r21, java.util.LinkedHashMap<java.lang.String, java.lang.String> r22) {
        /*
        // Method dump skipped, instructions count: 1590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.dq.a(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, java.util.LinkedHashMap):void");
    }

    private static void a(Collection<InteractStickerStruct> collection) {
        if (!b.a((Collection) collection)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                if (interactStickerStruct.getType() == 16) {
                    interactStickerStruct.getDuetStickerStruct().completeSecIdList();
                }
            }
        }
    }

    private static void c(Collection<InteractStickerStruct> collection) {
        if (!b.a((Collection) collection)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                if (interactStickerStruct.getType() == 8 && interactStickerStruct.getMentionInfo() != null && !TextUtils.isEmpty(interactStickerStruct.getMentionInfo().getUserId())) {
                    interactStickerStruct.getMentionInfo().setUserId("");
                }
            }
        }
    }

    public static Bitmap a(VideoPublishEditModel videoPublishEditModel) {
        String videoPath;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            if (e.b(str)) {
                return x.a(str);
            }
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            String str2 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
            if (e.b(str2)) {
                return x.a(str2);
            }
        }
        String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
        if (validVideoCoverPath != null) {
            return x.a(validVideoCoverPath);
        }
        if (videoPublishEditModel.canvasVideoData != null) {
            return x.a(videoPublishEditModel.canvasVideoData.getSourceInfo().get(0));
        }
        if (videoPublishEditModel.getPreviewInfo() == null) {
            videoPath = "";
        } else {
            videoPath = videoPublishEditModel.getPreviewInfo().getVideoList().get(0).getVideoPath();
        }
        it.a();
        return it.a(videoPath);
    }

    private static void b(Collection<InteractStickerStruct> collection) {
        if (!b.a((Collection) collection)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                if (!(interactStickerStruct.getType() != 10 || interactStickerStruct.getCountDownStickerStruct() == null || interactStickerStruct.getCountDownStickerStruct().getExpiredTime() == null)) {
                    interactStickerStruct.getCountDownStickerStruct().setExpiredTime(Long.valueOf(interactStickerStruct.getCountDownStickerStruct().getExpiredTime().longValue() / 1000));
                }
            }
        }
    }

    private static void a(List<InteractStickerStruct> list) {
        if (!b.a((Collection) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                d captionStruct = interactStickerStruct.getCaptionStruct();
                if (captionStruct != null) {
                    captionStruct.setVideoWidth(null);
                    captionStruct.setMarginStart(null);
                    captionStruct.setMarginTop(null);
                    captionStruct.setMarginBottom(null);
                }
            }
        }
    }

    public static boolean a(Object obj) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        boolean isSaveLocal = videoPublishEditModel.isSaveLocal();
        g.a().o().k().a("save_local", "will save locally: ".concat(String.valueOf(isSaveLocal)));
        if (!isSaveLocal) {
            return false;
        }
        String localTempPath = videoPublishEditModel.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = videoPublishEditModel.isSaveToLocalPathInsteadOfAlbum();
        if (videoPublishEditModel.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        String name = new File(localTempPath).getName();
        String str = (Environment.getExternalStorageDirectory().toString() + "/DCIM/Camera/") + name;
        if (c.A.a(cr.a().f125295a, ShareServiceImpl.a().a(videoPublishEditModel.getSaveModel().getSaveType()))) {
            VEUtils.extractVideo(localTempPath, str);
        } else if (!as.a() || Build.VERSION.SDK_INT < 29) {
            e.c(localTempPath, str);
        } else {
            try {
                h.a(i.f115645a, localTempPath, name);
            } catch (Exception e2) {
                e2.printStackTrace();
                e.c(localTempPath, str);
                f.a("saveVideoToMediaStore exception " + e2.getMessage());
            }
        }
        videoPublishEditModel.getSaveModel().setLocalFinalPath(str);
        if (z) {
            a.a(c.f115622a, str);
        }
        return true;
    }

    private void a(VideoPublishEditModel videoPublishEditModel, Collection<InteractStickerStruct> collection) {
        if (!(videoPublishEditModel == null || b.a((Collection) collection) || !bm.b(videoPublishEditModel))) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                List<NormalTrackTimeStamp> list = null;
                try {
                    list = (List) c.w.getRetrofitFactoryGson().a(interactStickerStruct.getTrackList(), new com.google.gson.b.a<List<NormalTrackTimeStamp>>() {
                        /* class com.ss.android.ugc.aweme.shortvideo.dq.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(82964);
                        }
                    }.type);
                } catch (Exception unused) {
                }
                if (com.bytedance.common.utility.h.b(list)) {
                    for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                        if (normalTrackTimeStamp != null) {
                            float[] a2 = bm.a(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                            normalTrackTimeStamp.setX(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(a2[0]));
                            normalTrackTimeStamp.setY(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(a2[1]));
                        }
                    }
                    try {
                        interactStickerStruct.setTrackList(c.f115623b.b(list));
                    } catch (m unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r0 <= (r7 + ((long) r4))) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25, java.util.LinkedHashMap<java.lang.String, java.lang.String> r26) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.dq.b(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    private void a(List<InteractStickerStruct> list, LinkedHashMap<String, String> linkedHashMap) {
        com.ss.android.ugc.aweme.question.b bVar;
        if (!b.a((Collection) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                if (interactStickerStruct.getType() == 17) {
                    QaStruct qaStruct = interactStickerStruct.getQaStruct();
                    long questionId = qaStruct.getQuestionId();
                    int i2 = this.f126478b.getInt(bn.a(g.a().A().c()), com.ss.android.ugc.aweme.question.a.FORUM_UNKNOWN.ordinal());
                    if (questionId == 0) {
                        bVar = com.ss.android.ugc.aweme.question.b.FORUM_QUESTION;
                    } else {
                        bVar = com.ss.android.ugc.aweme.question.b.FORUM_ANSWER;
                    }
                    linkedHashMap.put("forum_info", c.w.getRetrofitFactoryGson().b(new ForumInfo(bVar.ordinal(), i2, qaStruct.getInviteUserList())));
                    return;
                }
            }
        }
    }
}
