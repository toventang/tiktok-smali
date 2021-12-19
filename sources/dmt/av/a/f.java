package dmt.av.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VEUtils;
import dmt.av.a.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f156707e = new a((byte) 0);

    static {
        Covode.recordClassIndex(104078);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104079);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    @Override // dmt.av.a.a
    public final a.b d(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        a.b.EnumC4141a aVar;
        l.d(videoPublishEditModel, "");
        if (es.j(videoPublishEditModel)) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            l.b(previewInfo, "");
            videoList = e.a(previewInfo);
        } else {
            videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        }
        int size = videoList.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        l.b(previewInfo2, "");
        a(previewInfo2, videoList, strArr, jArr, jArr2, fArr, jArr3);
        this.f156691a = VEUtils.detachAudioFromVideos(videoPublishEditModel.mEncodedAudioOutputFile, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        a.b.EnumC4141a aVar2 = a.b.EnumC4141a.NO_NEEDED;
        return new a.b("FastImportSeparator", aVar2, aVar2, aVar, this.f156691a, "startSimple");
    }

    @Override // dmt.av.a.a
    public final a.b c(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        if (es.j(videoPublishEditModel)) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            l.b(previewInfo, "");
            videoList = e.a(previewInfo);
        } else {
            videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        }
        int size = videoList.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        l.b(previewInfo2, "");
        a(previewInfo2, videoList, strArr, jArr, jArr2, fArr, jArr3);
        String str = this.f156693c.f156703a + System.currentTimeMillis() + "_a";
        a.b.EnumC4141a aVar3 = a.b.EnumC4141a.NO_NEEDED;
        if (i.a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f) {
            this.f156691a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            this.f156691a = VEUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
            if (i.a(str)) {
                aVar3 = a.b.EnumC4141a.EXIT;
            } else {
                aVar3 = a.b.EnumC4141a.ABSENCE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
            this.f156692b = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
            e.c(str);
        }
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("FastImportSeparator", aVar3, aVar, aVar2, this.f156691a, "voiceVolume: " + videoPublishEditModel.voiceVolume);
    }

    private static void a(EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) list.get(i2);
            strArr[i2] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    l.b();
                }
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
