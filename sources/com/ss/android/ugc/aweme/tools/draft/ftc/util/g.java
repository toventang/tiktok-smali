package com.ss.android.ugc.aweme.tools.draft.ftc.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.fa;
import dmt.av.video.VEPreviewMusicParams;
import h.f.b.l;
import h.p;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f139676a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(91321);
    }

    public static p<Integer, Integer> a(VideoPublishEditModel videoPublishEditModel) {
        int videoWidth;
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mVideoCanvasWidth <= 0 || videoPublishEditModel.mVideoCanvasHeight <= 0) {
            videoWidth = videoPublishEditModel.videoWidth();
            videoHeight = videoPublishEditModel.videoHeight();
            if (videoHeight == 0 || videoWidth == 0) {
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService = c.p;
                } else {
                    iVideoConfigService = c.o;
                }
                l.b(iVideoConfigService, "");
                videoWidth = iVideoConfigService.getVideoWidth();
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService2 = c.p;
                } else {
                    iVideoConfigService2 = c.o;
                }
                l.b(iVideoConfigService2, "");
                videoHeight = iVideoConfigService2.getVideoHeight();
            }
        } else {
            videoWidth = videoPublishEditModel.mVideoCanvasWidth;
            videoHeight = videoPublishEditModel.mVideoCanvasHeight;
        }
        return new p<>(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    private static VEPreviewMusicParams b(VideoPublishEditModel videoPublishEditModel) {
        int i2;
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f156744i = videoPublishEditModel.isFastImport;
        vEPreviewMusicParams.f156743h = 2;
        vEPreviewMusicParams.f156736a = videoPublishEditModel.mMusicPath;
        vEPreviewMusicParams.f156737b = videoPublishEditModel.mMusicStart;
        String str = videoPublishEditModel.mMusicPath;
        l.d(videoPublishEditModel, "");
        vEPreviewMusicParams.f156738c = fa.a(str);
        if (cr.a().f125295a != null) {
            int i3 = vEPreviewMusicParams.f156738c;
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null) {
                l.b();
            }
            if (Math.abs(i3 - cVar.getShootDuration()) >= 1000) {
                com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
                if (cVar2 == null) {
                    l.b();
                }
                i2 = cVar2.getShootDuration();
                vEPreviewMusicParams.f156739d = i2;
                vEPreviewMusicParams.f156740e = videoPublishEditModel.musicVolume;
                vEPreviewMusicParams.f156741f = videoPublishEditModel.musicId;
                vEPreviewMusicParams.f156742g = videoPublishEditModel.previewStartTime;
                Boolean bool = videoPublishEditModel.isSoundLoop;
                l.b(bool, "");
                vEPreviewMusicParams.f156747l = bool.booleanValue();
                return vEPreviewMusicParams;
            }
        }
        i2 = vEPreviewMusicParams.f156738c;
        vEPreviewMusicParams.f156739d = i2;
        vEPreviewMusicParams.f156740e = videoPublishEditModel.musicVolume;
        vEPreviewMusicParams.f156741f = videoPublishEditModel.musicId;
        vEPreviewMusicParams.f156742g = videoPublishEditModel.previewStartTime;
        Boolean bool2 = videoPublishEditModel.isSoundLoop;
        l.b(bool2, "");
        vEPreviewMusicParams.f156747l = bool2.booleanValue();
        return vEPreviewMusicParams;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, androidx.lifecycle.m r12, android.view.SurfaceView r13, dmt.av.video.z r14, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15) {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ftc.util.g.a(android.content.Context, androidx.lifecycle.m, android.view.SurfaceView, dmt.av.video.z, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}
