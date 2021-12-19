package com.ss.android.ugc.aweme.shortvideo.edit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.a.a;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.j;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.f;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.aj;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class bp {
    static {
        Covode.recordClassIndex(83321);
    }

    public static final boolean c() {
        if (g.a().A().a() || AVCommerceServiceImpl.h().a()) {
            return false;
        }
        if (!a() && !a.a()) {
            return false;
        }
        return true;
    }

    public static final boolean a() {
        if (g.a().A().a() || dh.a() == 0 || AVCommerceServiceImpl.h().a()) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if (g.a().A().a() || dh.a() == 0 || AVCommerceServiceImpl.h().a()) {
            return false;
        }
        return true;
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.getStitchParams() != null) {
            return true;
        }
        return false;
    }

    public static final boolean i(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return f.a();
    }

    public static final boolean j(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return l.a((Object) "change_ban_music", (Object) videoPublishEditModel.mShootWay);
    }

    public static final int a(com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.asve.editor.g value = aVar.C().getValue();
        if (value != null) {
            return value.j();
        }
        return 0;
    }

    public static final boolean c(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType()) {
            return true;
        }
        return false;
    }

    public static final boolean d(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isMultiVideoEditFeature() || b(videoPublishEditModel) || videoPublishEditModel.isCutSameVideoType()) {
            return false;
        }
        return true;
    }

    public static final boolean g(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if ((videoPublishEditModel.isFastImport || videoPublishEditModel.hasOriginalSound()) && !videoPublishEditModel.isMuted) {
            return false;
        }
        return true;
    }

    public static final boolean k(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!com.ss.android.ugc.aweme.shortvideo.subtitle.a.a.a() || videoPublishEditModel.isShoutout()) {
            return false;
        }
        return true;
    }

    public static final boolean l(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!c() || !com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.b(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean m(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mCurMusicLength > 0 && videoPublishEditModel.getVideoLength() < videoPublishEditModel.mCurMusicLength) {
            return true;
        }
        return false;
    }

    public static final String o(VideoPublishEditModel videoPublishEditModel) {
        String resolution;
        l.d(videoPublishEditModel, "");
        VideoFileInfo n = n(videoPublishEditModel);
        if (n == null || (resolution = n.getResolution()) == null) {
            return "";
        }
        return resolution;
    }

    public static final int p(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        VideoFileInfo n = n(videoPublishEditModel);
        if (n != null) {
            return n.getCodecType();
        }
        return -1;
    }

    public static final boolean e(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo previewInfo;
        l.d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isFastImport || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null) {
            return false;
        }
        Iterator<T> it = previewInfo.getVideoList().iterator();
        while (it.hasNext()) {
            if (VEUtils.getAudioFileInfo(it.next().getVideoPath(), new int[10]) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!j.a() || !s(videoPublishEditModel) || videoPublishEditModel.isStickPointMode || b(videoPublishEditModel) || videoPublishEditModel.editMusicSyncMode) {
            return false;
        }
        if ((videoPublishEditModel.isReaction() || c(videoPublishEditModel) || g(videoPublishEditModel) || videoPublishEditModel.isStickPointMode) && !i(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean h(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!f(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.isReaction() || c(videoPublishEditModel) || g(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean r(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
        if (effectPointModel == null) {
            return false;
        }
        if (l.a((Object) effectPointModel.getKey(), (Object) "2") || l.a((Object) effectPointModel.getKey(), (Object) "3")) {
            return true;
        }
        return false;
    }

    private static final boolean s(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mOrigin == 0) {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean forbidVoiceChangeOnEditPage = iESSettingsProxy.getForbidVoiceChangeOnEditPage();
            l.b(forbidVoiceChangeOnEditPage, "");
            if (forbidVoiceChangeOnEditPage.booleanValue()) {
                return false;
            }
        } else if (!videoPublishEditModel.isReaction() && !c(videoPublishEditModel) && !videoPublishEditModel.isStickPointMode) {
            return true;
        } else {
            IESSettingsProxy iESSettingsProxy2 = c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            Boolean forbidVoiceChangeOnEditPage2 = iESSettingsProxy2.getForbidVoiceChangeOnEditPage();
            l.b(forbidVoiceChangeOnEditPage2, "");
            if (forbidVoiceChangeOnEditPage2.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            return true;
        }
        return false;
    }

    public static final VideoFileInfo n(VideoPublishEditModel videoPublishEditModel) {
        String videoPath;
        int[] a2;
        l.d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isUploadVideo()) {
            if (!(videoPublishEditModel.getOriginalVideoInfo() != null || (videoPath = videoPublishEditModel.videoPath()) == null || videoPath.length() == 0 || (a2 = aj.a(videoPublishEditModel.videoPath())) == null)) {
                videoPublishEditModel.setOriginalVideoInfo(new VideoFileInfo(a2[0], a2[1], (long) a2[3], a2[7], a2[6], a2[8], 0, 0, 192, null));
            }
            return videoPublishEditModel.getOriginalVideoInfo();
        }
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        Iterator<ImportVideoInfo> it = videoPublishEditModel.importInfoList.iterator();
        while (it.hasNext()) {
            ImportVideoInfo next = it.next();
            if (next.getBitRate() != 0 && next.getEncodeId() != 0 && next.getOriginFps() != 0) {
                return new VideoFileInfo(next.getVideoWidth(), next.getVideoHeight(), next.getDuration(), next.getOriginFps(), next.getBitRate(), next.getEncodeId(), 0, 0, 192, null);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if ((!h.f.b.l.a((java.lang.Object) r0.getKey(), (java.lang.Object) "0")) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean q(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.bp.q(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final b a(b bVar, VideoPublishEditModel videoPublishEditModel) {
        Float valueOf;
        l.d(bVar, "");
        l.d(videoPublishEditModel, "");
        b b2 = b(bVar, videoPublishEditModel);
        String str = videoPublishEditModel.mSelectedFilterId;
        if (str == null) {
            str = "";
        }
        b a2 = b2.a("edit_filter_id", str);
        String str2 = videoPublishEditModel.mSelectedFilterLabel;
        if (str2 == null) {
            str2 = "";
        }
        b a3 = a2.a("edit_filter_name", str2);
        if (videoPublishEditModel.mSelectedFilterIntensity < 0.0f) {
            valueOf = "";
        } else {
            valueOf = Float.valueOf(videoPublishEditModel.mSelectedFilterIntensity);
        }
        b a4 = a3.a("edit_filter_value", valueOf);
        l.b(a4, "");
        return a4;
    }

    public static final b b(b bVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(bVar, "");
        l.d(videoPublishEditModel, "");
        b a2 = bVar.a("shoot_filter_id_list", videoPublishEditModel.mRecordFilterIds).a("shoot_filter_name_list", videoPublishEditModel.mRecordFilterLabels).a("shoot_filter_value_list", videoPublishEditModel.mRecordFilterValues);
        l.b(a2, "");
        return a2;
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel, String str) {
        int a2;
        l.d(videoPublishEditModel, "");
        if (!TextUtils.isEmpty(str) && !videoPublishEditModel.isDuet() && !videoPublishEditModel.isReaction() && !videoPublishEditModel.isStickPointMode && (a2 = fa.a(str)) > 0 && videoPublishEditModel.getVideoLength() < a2) {
            return true;
        }
        return false;
    }
}
