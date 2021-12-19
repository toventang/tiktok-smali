package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.ep;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140180a = new a((byte) 0);

    static {
        Covode.recordClassIndex(91581);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91582);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(VideoPublishEditModel videoPublishEditModel) {
            if (videoPublishEditModel == null || !ep.a()) {
                return false;
            }
            if (videoPublishEditModel.isMvThemeVideoType()) {
                return videoPublishEditModel.hasRecord();
            }
            if (videoPublishEditModel.mOrigin == 0 && videoPublishEditModel.isMusic() > 0 && (videoPublishEditModel.voiceVolume > 0.0f || videoPublishEditModel.hasRecord())) {
                return true;
            }
            if (((videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.isFastImport || videoPublishEditModel.hasRecord()) && videoPublishEditModel.mMusicPath != null && (videoPublishEditModel.voiceVolume > 0.0f || videoPublishEditModel.hasRecord())) || videoPublishEditModel.veAudioEffectParam != null) {
                return true;
            }
            return false;
        }
    }
}
