package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.aj;
import com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class es {
    static {
        Covode.recordClassIndex(84224);
    }

    public static final String f(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.isStoryEditMode) {
            return "story-filter";
        }
        return "colorfilternew";
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.mShoutOutsData == null) {
            return false;
        }
        return p.a(videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), d.MODE_POST, false);
    }

    public static final boolean h(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.isPhotoMvMode || videoPublishEditModel.canvasVideoData != null) {
            return true;
        }
        return false;
    }

    public static final boolean j(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.photoCount <= 0 || videoPublishEditModel.videoCount <= 0 || !videoPublishEditModel.isFastImport) {
            return false;
        }
        return true;
    }

    public static final boolean k(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.editMusicSyncMode) {
            return true;
        }
        if (videoPublishEditModel.mIsFromDraft || (cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel) == null || !cut2EditTransferModel.getMusicSyncMode()) {
            return false;
        }
        return true;
    }

    public static final boolean p(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        Cut2EditTransferModel cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel;
        if (cut2EditTransferModel == null) {
            return videoPublishEditModel.isFastImport;
        }
        if (!cut2EditTransferModel.isVideoCompressed()) {
            return true;
        }
        return false;
    }

    public static final String d(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || l.a((Object) c(videoPublishEditModel), (Object) "photo_canvas")) {
            return "upload";
        }
        return "shoot";
    }

    public static final int g(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.ttStoryUploadModel != null) {
            return 40;
        }
        if (b.a(videoPublishEditModel)) {
            return 54;
        }
        if (videoPublishEditModel.isPhotoMvMode) {
            return 61;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return 53;
        }
        if (videoPublishEditModel.isStitchMode()) {
            return 58;
        }
        if (videoPublishEditModel.isStickPointMode) {
            return 55;
        }
        if (videoPublishEditModel.isDuet()) {
            return 51;
        }
        return -1;
    }

    public static final void i(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        l.d(videoPublishEditModel, "");
        if (!(videoPublishEditModel.mIsFromDraft || !videoPublishEditModel.isStitchMode() || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null)) {
            for (T t : videoList) {
                i.b(t.getVideoPath());
                i.b(t.getAudioPath());
            }
        }
    }

    public static final boolean l(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mOrigin != 1) {
            return aj.a();
        }
        if (!com.bytedance.ies.abmock.b.a().a(true, "enable_shoot_adjust_addfeature", false) || g.a().A().a()) {
            return false;
        }
        return true;
    }

    public static final boolean m(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        l.d(videoPublishEditModel, "");
        if (!l(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.getStitchParams() != null) {
            z = false;
        } else {
            z = true;
        }
        if (videoPublishEditModel.multiEditVideoRecordData != null) {
            videoPublishEditModel.multiEditVideoRecordData.isSupportMultiEdit = z;
        }
        if (!z || videoPublishEditModel.multiEditVideoRecordData == null || videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
            return false;
        }
        return true;
    }

    public static final boolean n(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!m(videoPublishEditModel) || videoPublishEditModel.getSharedARModel() != null || videoPublishEditModel.isDuet() || videoPublishEditModel.isReaction() || videoPublishEditModel.containBackgroundVideo || !videoPublishEditModel.supportRetake || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.isPhotoMvMode) {
            return false;
        }
        return true;
    }

    public static final String a(VideoPublishEditModel videoPublishEditModel) {
        String contentSource;
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam == null || (contentSource = storyEditEtParam.getContentSource()) == null) {
                return "";
            }
            return contentSource;
        } else if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentSource();
        } else {
            if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
                return "upload";
            }
            return "shoot";
        }
    }

    public static final String c(VideoPublishEditModel videoPublishEditModel) {
        String contentType;
        if (videoPublishEditModel == null) {
            return "";
        }
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam == null || (contentType = storyEditEtParam.getContentType()) == null) {
                return "";
            }
            return contentType;
        } else if (videoPublishEditModel.isPhotoMvMode) {
            return "slideshow";
        } else {
            if (videoPublishEditModel.isMvThemeVideoType()) {
                return "mv";
            }
            if (videoPublishEditModel.isStickPointMode || videoPublishEditModel.editMusicSyncMode) {
                return "sound_sync";
            }
            if (videoPublishEditModel.getAvetParameter() != null) {
                return videoPublishEditModel.getAvetParameter().getContentType();
            }
            if (videoPublishEditModel.canvasVideoData != null) {
                return "photo_canvas";
            }
            return "video";
        }
    }

    public static final String e(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.getOriginal() != 1) {
            return "";
        }
        if (videoPublishEditModel.isPhotoMvMode) {
            return UGCMonitor.TYPE_PHOTO;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return "mv";
        }
        int i2 = videoPublishEditModel.mShootMode;
        if (i2 == 2) {
            return "fast_shoot";
        }
        if (i2 == 8) {
            return "video";
        }
        if (i2 == 10) {
            return "video_15";
        }
        if (i2 == 11) {
            return "video_60";
        }
        if (i2 == 14) {
            return "video_180";
        }
        if (i2 != 15) {
            return "";
        }
        return "fast_shoot";
    }

    public static final boolean o(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list2;
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mOrigin != 1) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        if (!(!(multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null || (list2 = multiEditVideoRecordData2.segmentDataList) == null || !list2.isEmpty()) || (multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (hashSet.add(Integer.valueOf(t.rotate))) {
                    arrayList.add(t);
                }
            }
            if (arrayList.size() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.filter.FilterBean a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, com.ss.android.ugc.aweme.filter.repository.a.o r4) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            h.f.b.l.d(r4, r0)
            java.lang.String r0 = r3.mSelectedFilterId
            r2 = 0
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.q r1 = r4.f()     // Catch:{ NumberFormatException -> 0x001a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x001a }
            com.ss.android.ugc.aweme.filter.FilterBean r0 = com.ss.android.ugc.aweme.filter.repository.a.a.c.b(r1, r0)     // Catch:{ NumberFormatException -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 != 0) goto L_0x0029
        L_0x001d:
            java.lang.String r1 = r3.mSelectedFilterResId
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.filter.repository.a.q r0 = r4.f()     // Catch:{ NumberFormatException -> 0x002a }
            com.ss.android.ugc.aweme.filter.FilterBean r0 = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(r0, r1)     // Catch:{ NumberFormatException -> 0x002a }
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r2 != 0) goto L_0x0036
            com.ss.android.ugc.aweme.filter.repository.a.q r1 = r4.f()
            int r0 = r3.mSelectedId
            com.ss.android.ugc.aweme.filter.FilterBean r2 = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(r1, r0)
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.es.a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.filter.repository.a.o):com.ss.android.ugc.aweme.filter.FilterBean");
    }
}
