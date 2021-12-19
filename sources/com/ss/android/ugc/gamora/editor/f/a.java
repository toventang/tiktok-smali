package com.ss.android.ugc.gamora.editor.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145842a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(95836);
    }

    public static final void a(float f2, float f3, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(videoPublishEditModel, "");
        l.d(aVar, "");
        StitchParams stitchParams = videoPublishEditModel.stitchParams;
        if (stitchParams == null) {
            return;
        }
        if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            int duration = (int) stitchParams.getDuration();
            int videoLength = videoPublishEditModel.getVideoLength();
            if (f3 != -1.0f) {
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f3, 0, duration, 1);
                l.b(ofVoice, "");
                aVar.a(ofVoice);
            }
            int i2 = duration + 100;
            VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(0.0f, duration, i2, 3);
            l.b(ofVoice2, "");
            aVar.a(ofVoice2);
            if (f2 != -1.0f) {
                VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(f2, i2, videoLength, 2);
                l.b(ofVoice3, "");
                aVar.a(ofVoice3);
                return;
            }
            return;
        }
        if (f2 != -1.0f) {
            VEVolumeChangeOp ofVoice4 = VEVolumeChangeOp.ofVoice(f2);
            l.b(ofVoice4, "");
            aVar.a(ofVoice4);
        }
        if (f3 != -1.0f) {
            VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f3);
            l.b(ofMusic, "");
            aVar.a(ofMusic);
        }
    }
}
