package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.h;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.ss.android.ugc.aweme.draft.model.g;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.tools.c.c;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEPreviewParams;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(83798);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        String draftDir;
        List<EditVideoSegment> videoList;
        l.d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isFastImport) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null)) {
                for (T t : videoList) {
                    i.b(t.getVideoPath());
                    i.b(t.getAudioPath());
                    k.a("[removePreviewRelatedFiles] removeFile = " + t.getVideoPath());
                    k.a("[removePreviewRelatedFiles] removeFile = " + t.getAudioPath());
                }
            }
            i.a(new File(videoPublishEditModel.draftDir()));
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (!(previewInfo2 == null || (draftDir = previewInfo2.getDraftDir()) == null || !h.c(draftDir))) {
            EditPreviewInfo previewInfo3 = videoPublishEditModel.getPreviewInfo();
            String str = null;
            i.a(new File(previewInfo3 != null ? previewInfo3.getDraftDir() : null));
            StringBuilder sb = new StringBuilder("[removePreviewRelatedFiles] removeDir fast import draftDir = ");
            EditPreviewInfo previewInfo4 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo4 != null) {
                str = previewInfo4.getDraftDir();
            }
            k.a(sb.append(str).toString());
        }
        EditPreviewInfo previewInfo5 = videoPublishEditModel.getPreviewInfo();
        if (previewInfo5 != null) {
            b(previewInfo5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final h.u<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment, java.lang.Long, long[]> a(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r24, boolean r25, long r26) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean, long):h.u");
    }

    public static final VideoFileInfo a(String str) {
        int[] iArr = new int[10];
        if (str == null || VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return new VideoFileInfo(0, 0, 0, 0, 0, 0, 0, 0, 240, null);
        }
        return new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7], iArr[6], 0, 0, 0, 224, null);
    }

    public static final String a() {
        return dj.f126463f + "fast_import/" + System.currentTimeMillis() + '/';
    }

    public static final VEPreviewParams a(VideoPublishEditModel videoPublishEditModel, int i2, int i3, int i4) {
        List h2;
        int i5;
        VideoFileInfo videoFileInfo;
        l.d(videoPublishEditModel, "");
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        int size = previewInfo.getVideoList().size();
        String[] strArr = new String[size];
        for (int i6 = 0; i6 < size; i6++) {
            strArr[i6] = "";
        }
        vEPreviewParams.mVideoPaths = strArr;
        String[] strArr2 = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr2[i7] = "";
        }
        vEPreviewParams.mAudioPaths = strArr2;
        int i8 = 0;
        for (T t : previewInfo.getVideoList()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                n.a();
            }
            T t2 = t;
            vEPreviewParams.mVideoPaths[i8] = t2.getVideoPath();
            vEPreviewParams.mAudioPaths[i8] = t2.getAudioPath();
            VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
            if (videoCutInfo != null) {
                if (vEPreviewParams.mSpeedArray == null) {
                    float[] fArr = new float[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        fArr[i10] = 1.0f;
                    }
                    vEPreviewParams.mSpeedArray = fArr;
                }
                if (vEPreviewParams.mRotateArray == null) {
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = 0;
                    }
                    vEPreviewParams.mRotateArray = iArr;
                }
                if (vEPreviewParams.mVTrimIn == null) {
                    int[] iArr2 = new int[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        iArr2[i12] = 0;
                    }
                    vEPreviewParams.mVTrimIn = iArr2;
                }
                if (vEPreviewParams.mVTrimOut == null) {
                    int[] iArr3 = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr3[i13] = -1;
                    }
                    vEPreviewParams.mVTrimOut = iArr3;
                }
                vEPreviewParams.getSpeedArray()[i8] = videoCutInfo.getSpeed();
                vEPreviewParams.getRotateArray()[i8] = videoCutInfo.getRotate();
                vEPreviewParams.mVTrimIn[i8] = (int) videoCutInfo.getStart();
                vEPreviewParams.mVTrimOut[i8] = (int) videoCutInfo.getEnd();
            }
            if (videoPublishEditModel.videoEditorType == 11) {
                if (vEPreviewParams.mSpeedArray == null) {
                    float[] fArr2 = new float[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        fArr2[i14] = 1.0f;
                    }
                    vEPreviewParams.mSpeedArray = fArr2;
                }
                if (vEPreviewParams.mRotateArray == null) {
                    int[] iArr4 = new int[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        iArr4[i15] = 0;
                    }
                    vEPreviewParams.mRotateArray = iArr4;
                }
                if (vEPreviewParams.mVTrimIn == null) {
                    int[] iArr5 = new int[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        iArr5[i16] = 0;
                    }
                    vEPreviewParams.mVTrimIn = iArr5;
                }
                if (vEPreviewParams.mVTrimOut == null) {
                    int[] iArr6 = new int[size];
                    for (int i17 = 0; i17 < size; i17++) {
                        iArr6[i17] = -1;
                    }
                    vEPreviewParams.mVTrimOut = iArr6;
                }
                int[] iArr7 = vEPreviewParams.mVTrimOut;
                if (i4 <= 0) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) n.h((List) videoPublishEditModel.getPreviewInfo().getVideoList());
                    i5 = (editVideoSegment == null || (videoFileInfo = editVideoSegment.getVideoFileInfo()) == null) ? 5000 : (int) videoFileInfo.getDuration();
                } else {
                    i5 = i4;
                }
                iArr7[i8] = i5;
            }
            i8 = i9;
        }
        vEPreviewParams.sceneIn = (int) previewInfo.getSceneIn();
        vEPreviewParams.sceneOut = (int) previewInfo.getSceneOut();
        vEPreviewParams.mPreviewWidth = previewInfo.getPreviewWidth();
        vEPreviewParams.mPreviewHeight = previewInfo.getPreviewHeight();
        if (i2 != -1) {
            vEPreviewParams.mPageType = i2;
        }
        if (i3 != -1) {
            vEPreviewParams.mFps = i3;
        }
        vEPreviewParams.isFromCut = videoPublishEditModel.mFromCut;
        vEPreviewParams.mWorkspace = videoPublishEditModel.draftDir();
        vEPreviewParams.setCanvasWidth(videoPublishEditModel.mVideoCanvasWidth);
        vEPreviewParams.setCanvasHeight(videoPublishEditModel.mVideoCanvasHeight);
        vEPreviewParams.mVolume = videoPublishEditModel.voiceVolume;
        vEPreviewParams.mMusicVolume = videoPublishEditModel.musicVolume;
        vEPreviewParams.mMusicInPoint = videoPublishEditModel.mMusicStart;
        vEPreviewParams.mMusicOutPoint = videoPublishEditModel.mMusicEnd;
        vEPreviewParams.mMusicPath = videoPublishEditModel.mMusicPath;
        vEPreviewParams.isFastImport = videoPublishEditModel.isFastImport;
        vEPreviewParams.isCutSameType = videoPublishEditModel.isCutSameVideoType();
        vEPreviewParams.mIsFromDraft = videoPublishEditModel.mIsFromDraft;
        vEPreviewParams.videoEditorType = videoPublishEditModel.videoEditorType;
        vEPreviewParams.mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
        vEPreviewParams.recordData = videoPublishEditModel.multiEditVideoRecordData;
        vEPreviewParams.stitchParams = videoPublishEditModel.stitchParams;
        if (videoPublishEditModel.veCherEffectParam != null) {
            String[] matrix = videoPublishEditModel.veCherEffectParam.getMatrix();
            double[] duration = videoPublishEditModel.veCherEffectParam.getDuration();
            boolean[] segUseCher = videoPublishEditModel.veCherEffectParam.getSegUseCher();
            if (segUseCher == null) {
                l.b();
            }
            vEPreviewParams.veCherEffectParam = new VECherEffectParam(matrix, duration, segUseCher);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            vEPreviewParams.setVeAudioEffectParam(videoPublishEditModel.veAudioEffectParam);
        }
        if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
            vEPreviewParams.mAudioPaths = null;
        }
        vEPreviewParams.audioAecDelayTime = videoPublishEditModel.audioAecDelayTime;
        vEPreviewParams.isStoryEditMode = videoPublishEditModel.isStoryEditMode;
        vEPreviewParams.canvasVideoPreviewData = videoPublishEditModel.canvasVideoData;
        vEPreviewParams.singleImageCoverBitmapData = videoPublishEditModel.singleImageCoverBitmapData;
        vEPreviewParams.isVideoImageMixFastImport = es.j(videoPublishEditModel);
        vEPreviewParams.setEnableMusicSync(es.k(videoPublishEditModel));
        vEPreviewParams.isMusicSyncMode = videoPublishEditModel.editMusicSyncMode;
        String[] strArr3 = vEPreviewParams.mAudioPaths;
        if (!(strArr3 == null || (h2 = h.a.i.h(strArr3)) == null || !h2.isEmpty())) {
            vEPreviewParams.mAudioPaths = null;
        }
        return vEPreviewParams;
    }

    public static final VEPreviewParams b(VideoPublishEditModel videoPublishEditModel) {
        return a(videoPublishEditModel, 2, 30, -1);
    }

    private static VideoFileInfo a(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        if (vEVideoFileInfo == null) {
            return null;
        }
        return new VideoFileInfo(vEVideoFileInfo.width, vEVideoFileInfo.height, (long) vEVideoFileInfo.duration, vEVideoFileInfo.fps, vEVideoFileInfo.bitrate, vEVideoFileInfo.codec, vEVideoFileInfo.keyFrameCount, 0, 128, null);
    }

    public static final boolean c(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        String str = videoPublishEditModel.mShootWay;
        if (str != null) {
            return p.b(str, "miracle_game", false);
        }
        return false;
    }

    public static final EditVideoSegment a(DraftVideoSegment draftVideoSegment) {
        l.d(draftVideoSegment, "");
        EditVideoSegment editVideoSegment = new EditVideoSegment(draftVideoSegment.f83157h, draftVideoSegment.f83158i, a(draftVideoSegment.f83157h));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo((long) draftVideoSegment.f83152c, (long) draftVideoSegment.f83153d, draftVideoSegment.f83155f, draftVideoSegment.f83156g));
        return editVideoSegment;
    }

    public static final int a(EditPreviewInfo editPreviewInfo) {
        VideoFileInfo a2;
        l.d(editPreviewInfo, "");
        Iterator<EditVideoSegment> it = editPreviewInfo.getVideoList().iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (!com.ss.android.ugc.tools.utils.h.a(it.next().getVideoPath(), false)) {
                break;
            } else {
                i3++;
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() >= 0 && valueOf != null) {
            i2 = valueOf.intValue();
        }
        if (editPreviewInfo.getVideoList().get(i2).getVideoFileInfo().getFps() == -100) {
            VEUtils.VEVideoFileInfo a3 = c.a(editPreviewInfo.getVideoList().get(i2).getVideoPath());
            if (a3 == null || (a2 = a(a3)) == null) {
                editPreviewInfo.getVideoList().set(i2, EditVideoSegment.copy$default(editPreviewInfo.getVideoList().get(i2), null, null, new VideoFileInfo(editPreviewInfo.getVideoList().get(i2).getVideoFileInfo().getWidth(), editPreviewInfo.getVideoList().get(i2).getVideoFileInfo().getHeight(), editPreviewInfo.getVideoList().get(i2).getVideoFileInfo().getDuration(), 0, 0, 0, 0, 0, 248, null), null, 11, null));
            } else {
                editPreviewInfo.getVideoList().set(i2, EditVideoSegment.copy$default(editPreviewInfo.getVideoList().get(i2), null, null, a2, null, 11, null));
            }
        }
        return editPreviewInfo.getVideoList().get(i2).getVideoFileInfo().getFps();
    }

    private static void b(EditPreviewInfo editPreviewInfo) {
        l.d(editPreviewInfo, "");
        String[] reverseVideoArray = editPreviewInfo.getReverseVideoArray();
        if (reverseVideoArray != null) {
            for (String str : reverseVideoArray) {
                i.b(str);
                k.a("[removeRelatedFiles] reverseVideoArray removeFile = ".concat(String.valueOf(str)));
            }
        }
        String[] reverseAudioArray = editPreviewInfo.getReverseAudioArray();
        if (reverseAudioArray != null) {
            for (String str2 : reverseAudioArray) {
                i.b(str2);
                k.a("[removeRelatedFiles] reverseAudioArray removeFile = ".concat(String.valueOf(str2)));
            }
        }
        String[] tempVideoArray = editPreviewInfo.getTempVideoArray();
        if (tempVideoArray != null) {
            for (String str3 : tempVideoArray) {
                i.b(str3);
                k.a("[removeRelatedFiles] tempVideoArray removeFile = ".concat(String.valueOf(str3)));
            }
        }
    }

    public static final EditPreviewInfo a(g gVar) {
        l.d(gVar, "");
        EditPreviewInfo a2 = new h(gVar.f83206a, gVar.f83207b, null, 28).a(a(gVar.f83208c.get(0)));
        String str = gVar.f83208c.get(0).f83159j;
        if (str != null) {
            a2.setReverseVideoArray(new String[]{str});
        }
        String str2 = gVar.f83208c.get(0).f83158i;
        if (str2 != null && p.c(str2, "reverse.wav", false)) {
            a2.setReverseAudioArray(new String[]{str2});
        }
        String str3 = gVar.f83208c.get(0).f83160k;
        if (str3 != null) {
            a2.setTempVideoArray(new String[]{str3});
        }
        return a2;
    }

    public static final EditVideoSegment a(VideoSegment videoSegment) {
        l.d(videoSegment, "");
        EditVideoSegment editVideoSegment = new EditVideoSegment(videoSegment.a(false).toString(), null, new VideoFileInfo(videoSegment.f125482f, videoSegment.f125483g, videoSegment.f125478b, videoSegment.a(), videoSegment.c(), 0, 0, 0, 224, null));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(videoSegment.d(), videoSegment.e(), videoSegment.f(), videoSegment.f125486j));
        return editVideoSegment;
    }

    public static final int a(EditPreviewInfo editPreviewInfo, boolean z) {
        l.d(editPreviewInfo, "");
        if (!z) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getWidth();
        }
        if (editPreviewInfo.getCalculateSourceWidth() <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), com.ss.android.ugc.asve.f.c.a(editPreviewInfo), Integer.MAX_VALUE);
            editPreviewInfo.setCalculateSourceWidth(calcTargetRes.width);
            editPreviewInfo.setCalculateSourceHeight(calcTargetRes.height);
        }
        return editPreviewInfo.getCalculateSourceWidth();
    }

    public static final int b(EditPreviewInfo editPreviewInfo, boolean z) {
        l.d(editPreviewInfo, "");
        if (!z) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getHeight();
        }
        if (editPreviewInfo.getCalculateSourceHeight() <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), com.ss.android.ugc.asve.f.c.a(editPreviewInfo), Integer.MAX_VALUE);
            editPreviewInfo.setCalculateSourceWidth(calcTargetRes.width);
            editPreviewInfo.setCalculateSourceHeight(calcTargetRes.height);
        }
        return editPreviewInfo.getCalculateSourceHeight();
    }

    public static final int a(EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        l.d(editPreviewInfo, "");
        if (z || z3) {
            if (editPreviewInfo.getCalculateWidth() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), com.ss.android.ugc.asve.f.c.a(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                editPreviewInfo.setCalculateWidth(calcTargetRes.width);
                editPreviewInfo.setCalculateHeight(calcTargetRes.height);
            }
            return editPreviewInfo.getCalculateWidth();
        } else if (!z2 || editPreviewInfo.getVideoList().size() < 2) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getWidth();
        } else {
            return editPreviewInfo.getVideoList().get(1).getVideoFileInfo().getWidth();
        }
    }

    public static final int b(EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        l.d(editPreviewInfo, "");
        if (z || z3) {
            if (editPreviewInfo.getCalculateHeight() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), com.ss.android.ugc.asve.f.c.a(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                editPreviewInfo.setCalculateWidth(calcTargetRes.width);
                editPreviewInfo.setCalculateHeight(calcTargetRes.height);
            }
            return editPreviewInfo.getCalculateHeight();
        } else if (!z2 || editPreviewInfo.getVideoList().size() < 2) {
            return editPreviewInfo.getVideoList().get(0).getVideoFileInfo().getHeight();
        } else {
            return editPreviewInfo.getVideoList().get(1).getVideoFileInfo().getHeight();
        }
    }
}
