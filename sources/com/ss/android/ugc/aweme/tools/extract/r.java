package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.b;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f140107a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(91552);
    }

    public static final b a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        b.a aVar = new b.a();
        if (videoPublishEditModel.hasOriginalSound()) {
            aVar.a(c.RECORD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.hasRecord()) {
            aVar.a(c.EDIT_RECORD_SOUND);
        }
        String str = videoPublishEditModel.mMusicPath;
        if (!(str == null || str.length() == 0)) {
            aVar.a(c.MUSIC);
        }
        if (videoPublishEditModel.mOrigin == 0) {
            aVar.a(c.UPLOAD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.voiceVolume > 0.0f) {
            aVar.a(c.VOLUME_NOT_MUTE);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            aVar.a(c.EDIT_AUDIO_EFFECT);
        }
        return aVar.a();
    }
}
