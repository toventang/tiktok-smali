package com.ss.android.vesdk;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

public final class c {
    static {
        Covode.recordClassIndex(99360);
    }

    private static void a(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord, new Object[0], 100404, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            a.a(null, audioRecord, new Object[0], 100401, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    private static void b(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord, new Object[0], 100405, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            a.a(null, audioRecord, new Object[0], 100403, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    private static void c(AudioRecord audioRecord) {
        if (!((Boolean) a.a(audioRecord, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord.startRecording();
            a.a(null, audioRecord, new Object[0], 100400, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    public static void a(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (a(privacyCert, 0)) {
            c(audioRecord);
        }
    }

    public static void b(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (a(privacyCert, 1)) {
            a(audioRecord);
        }
    }

    public static void c(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (a(privacyCert, 2)) {
            b(audioRecord);
        }
    }

    private static boolean a(PrivacyCert privacyCert, int i2) {
        boolean z = true;
        if (i2 == 0) {
            try {
                a.C0572a.b(privacyCert, "audio_start");
            } catch (com.bytedance.bpea.basics.a e2) {
                z = false;
                an.d("TEAudioPolicyAdapter", "error:" + e2.getErrorMsg() + " errorCode:" + e2.getErrorCode());
            }
        } else if (i2 == 1) {
            a.C0572a.b(privacyCert, "audio_stop");
        } else if (i2 == 2) {
            a.C0572a.b(privacyCert, "audio_release");
        }
        an.a("TEAudioPolicyAdapter", "check privacy:" + z + ", check type: " + i2);
        return z;
    }
}
