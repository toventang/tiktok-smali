package dmt.av.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.n.a;
import com.ss.android.ugc.aweme.n.b;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.f;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.tools.extract.w;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.x;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    int f156709a = -999;

    /* renamed from: b  reason: collision with root package name */
    private a f156710b = new b();

    static {
        Covode.recordClassIndex(104082);
    }

    public final void a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String audioPath;
        String concatAudioPath;
        List<EditVideoSegment> videoList;
        q.d("OriginalSoundSeparator separateOriginalSoundVESDK");
        if (w.a.a(videoPublishEditModel)) {
            new File(dj.f126467j).mkdirs();
            if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord() || !f.a()) {
                z = false;
            } else {
                z = true;
            }
            int i2 = -999;
            if (videoPublishEditModel.isFastImport) {
                if (es.j(videoPublishEditModel)) {
                    videoList = e.a(videoPublishEditModel.getPreviewInfo());
                } else {
                    videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
                }
                int size = videoList.size();
                String[] strArr = new String[size];
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                long[] jArr3 = new long[2];
                float[] fArr = new float[size];
                a(videoPublishEditModel.getPreviewInfo(), videoList, strArr, jArr, jArr2, fArr, jArr3);
                if (z) {
                    new File(dj.n).mkdirs();
                    String str = dj.n + System.currentTimeMillis() + "_a";
                    if (videoPublishEditModel.voiceVolume == 0.0f) {
                        this.f156709a = this.f156710b.a("FastImport_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                    } else {
                        this.f156709a = this.f156710b.a("FastImport_with_voice_record", str, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
                        i2 = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
                        e.c(str);
                    }
                } else {
                    this.f156709a = this.f156710b.a("FastImport_without_voice_record", videoPublishEditModel.mEncodedAudioOutputFile, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                }
            } else if (videoPublishEditModel.isMultiVideoEdit()) {
                VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData);
                Pair<Integer, Integer> playInOutTime = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData.getPlayInOutTime();
                if (playInOutTime != null) {
                    a2.a(((long) ((Integer) playInOutTime.first).intValue()) * 1000, ((long) ((Integer) playInOutTime.second).intValue()) * 1000);
                }
                if (!z) {
                    this.f156709a = this.f156710b.a("MultiVideoEdit_without_voice_record", videoPublishEditModel.mEncodedAudioOutputFile, a2);
                } else if (videoPublishEditModel.voiceVolume == 0.0f || !videoPublishEditModel.hasOriginalSound()) {
                    this.f156709a = this.f156710b.a("MultiVideoEdit_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                } else {
                    new File(dj.n).mkdirs();
                    String str2 = dj.n + System.currentTimeMillis() + "_a";
                    this.f156709a = this.f156710b.a("MultiVideoEdit_with_voice_record", str2, a2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str2);
                    arrayList2.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
                    i2 = VEUtils.mixAudio(arrayList2, videoPublishEditModel.mEncodedAudioOutputFile, null);
                    e.c(str2);
                }
            } else if (videoPublishEditModel.isStitchMode()) {
                if (TextUtils.isEmpty(((StitchParams) Objects.requireNonNull(videoPublishEditModel.stitchParams)).getConcatAudioPath())) {
                    concatAudioPath = videoPublishEditModel.audioPath();
                } else {
                    concatAudioPath = videoPublishEditModel.stitchParams.getConcatAudioPath();
                }
                if (z) {
                    if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
                        this.f156709a = this.f156710b.a("stitch_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                    } else {
                        x xVar = new x(videoPublishEditModel.draftDir());
                        xVar.a(new String[]{videoPublishEditModel.veAudioRecorderParam.getAudioUrl()}, new int[]{0}, new int[]{-1}, new float[]{1.0f});
                        int a3 = xVar.a(concatAudioPath, 0, xVar.s() - ((int) videoPublishEditModel.stitchParams.getDuration()), (int) videoPublishEditModel.stitchParams.getDuration(), xVar.s(), false);
                        xVar.a(0, 1, videoPublishEditModel.voiceVolume);
                        xVar.a(a3, 1, videoPublishEditModel.voiceVolume);
                        xVar.d(1);
                        VEAudioEncodeSettings.a aVar = new VEAudioEncodeSettings.a();
                        aVar.f150684b = 16000;
                        aVar.f150686d = 2;
                        aVar.f150685c = 128000;
                        VEAudioEncodeSettings a4 = aVar.a();
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (xVar.a(videoPublishEditModel.mEncodedAudioOutputFile, a4, new VEListener.q() {
                            /* class dmt.av.a.h.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(104083);
                            }

                            @Override // com.ss.android.vesdk.VEListener.q
                            public final void onCompileProgress(float f2) {
                            }

                            @Override // com.ss.android.vesdk.VEListener.q
                            public final void onCompileDone() {
                                h.this.f156709a = 0;
                                countDownLatch.countDown();
                            }

                            @Override // com.ss.android.vesdk.VEListener.q
                            public final void onCompileError(int i2, int i3, float f2, String str) {
                                countDownLatch.countDown();
                            }
                        })) {
                            try {
                                countDownLatch.await(40000, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        xVar.j();
                    }
                } else if (concatAudioPath != null) {
                    this.f156709a = this.f156710b.a("stitch_without_voice_record", concatAudioPath, videoPublishEditModel.mEncodedAudioOutputFile);
                } else {
                    this.f156709a = -999;
                }
            } else if (!videoPublishEditModel.isMvThemeVideoType()) {
                if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
                    audioPath = videoPublishEditModel.videoPath().toString();
                } else {
                    audioPath = videoPublishEditModel.audioPath();
                }
                if (!z) {
                    this.f156709a = this.f156710b.a("normal_without_voice_record", audioPath, videoPublishEditModel.mEncodedAudioOutputFile);
                } else if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
                    this.f156709a = this.f156710b.a("normal_with_voice_record", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
                } else {
                    this.f156709a = -999;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(audioPath);
                    arrayList3.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
                    i2 = VEUtils.mixAudio(arrayList3, videoPublishEditModel.mEncodedAudioOutputFile, null);
                }
            } else if (z) {
                this.f156709a = this.f156710b.a("MV", videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile);
            }
            int checkAudioFile = VEUtils.checkAudioFile(videoPublishEditModel.mEncodedAudioOutputFile);
            o.b("aweme_movie_publish_log", "encode_audio_file", new ar().a("status", Integer.valueOf(checkAudioFile + 10000)).a("errorDesc", "mixResult" + i2 + "encodeResult = " + this.f156709a + " checkResult = " + checkAudioFile + " path = " + videoPublishEditModel.mEncodedAudioOutputFile).a());
        }
    }

    private static void a(EditPreviewInfo editPreviewInfo, List<EditVideoSegment> list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            EditVideoSegment editVideoSegment = list.get(i2);
            strArr[i2] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                jArr[i2] = videoCutInfo.getStart();
                jArr2[i2] = videoCutInfo.getEnd();
                fArr[i2] = videoCutInfo.getSpeed();
            } else {
                jArr[i2] = -1;
                jArr2[i2] = -1;
                fArr[i2] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }
}
