package dmt.av.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import dmt.av.a.a;
import h.f.b.l;
import java.util.ArrayList;

public final class i extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f156713f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public VERecordData f156714e;

    static {
        Covode.recordClassIndex(104084);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104085);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // dmt.av.a.a
    public final void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        super.a(videoPublishEditModel);
        MultiEditVideoRecordData multiEditVideoRecordData = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData;
        l.b(multiEditVideoRecordData, "");
        this.f156714e = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData);
        MultiEditVideoRecordData multiEditVideoRecordData2 = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData;
        l.b(multiEditVideoRecordData2, "");
        Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData2.getPlayInOutTime();
        l.b(playInOutTime, "");
        VERecordData vERecordData = this.f156714e;
        if (vERecordData == null) {
            l.a("recordData");
        }
        vERecordData.a(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
    }

    @Override // dmt.av.a.a
    public final a.b d(VideoPublishEditModel videoPublishEditModel) {
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        VERecordData vERecordData = this.f156714e;
        if (vERecordData == null) {
            l.a("recordData");
        }
        if (com.ss.android.ugc.tools.utils.i.a(vERecordData.f150793e)) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        String str = videoPublishEditModel.mEncodedAudioOutputFile;
        VERecordData vERecordData2 = this.f156714e;
        if (vERecordData2 == null) {
            l.a("recordData");
        }
        this.f156691a = VEUtils.getAudioFromRecordData(str, vERecordData2, 1, 88200, 44100);
        if (com.ss.android.ugc.tools.utils.i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("RecordVideoSeparator", aVar, a.b.EnumC4141a.NO_NEEDED, aVar2, this.f156691a);
    }

    @Override // dmt.av.a.a
    public final a.b c(VideoPublishEditModel videoPublishEditModel) {
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        a.b.EnumC4141a aVar3 = a.b.EnumC4141a.NO_NEEDED;
        if (com.ss.android.ugc.tools.utils.i.a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f || !videoPublishEditModel.hasOriginalSound()) {
            this.f156691a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            VERecordData vERecordData = this.f156714e;
            if (vERecordData == null) {
                l.a("recordData");
            }
            if (com.ss.android.ugc.tools.utils.i.a(vERecordData.f150793e)) {
                aVar3 = a.b.EnumC4141a.EXIT;
            } else {
                aVar3 = a.b.EnumC4141a.ABSENCE;
            }
            String str = this.f156693c.f156703a + System.currentTimeMillis() + "_a";
            VERecordData vERecordData2 = this.f156714e;
            if (vERecordData2 == null) {
                l.a("recordData");
            }
            this.f156691a = VEUtils.getAudioFromRecordData(str, vERecordData2, 1, 88200, 44100);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
            this.f156692b = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
            e.c(str);
        }
        if (com.ss.android.ugc.tools.utils.i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("RecordVideoSeparator", aVar3, aVar, aVar2, this.f156691a, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
