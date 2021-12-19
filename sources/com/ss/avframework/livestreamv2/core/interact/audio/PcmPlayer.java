package com.ss.avframework.livestreamv2.core.interact.audio;

import android.media.AudioTrack;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class PcmPlayer {
    private boolean inited;
    private AudioTrack mAudioTrack;

    static {
        Covode.recordClassIndex(100238);
    }

    public static int com_ss_avframework_livestreamv2_core_interact_audio_PcmPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public boolean isInited() {
        return this.inited;
    }

    public void release() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.mAudioTrack.stop();
                this.mAudioTrack.release();
            }
            this.mAudioTrack = null;
        }
    }

    public void playPcmData(ByteBuffer byteBuffer) {
        if (this.inited && Build.VERSION.SDK_INT >= 21) {
            this.mAudioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }

    public PcmPlayer(int i2, int i3) {
        int i4;
        String str;
        if (i3 == 1) {
            i4 = 4;
        } else if (i3 != 2) {
            com_ss_avframework_livestreamv2_core_interact_audio_PcmPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e("PcmPlayer", "Channel count " + i3 + " not supported!");
            return;
        } else {
            i4 = 12;
        }
        try {
            AudioTrack audioTrack = new AudioTrack(3, i2, i4, 2, AudioTrack.getMinBufferSize(i2, i4, 2), 1);
            this.mAudioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                StringBuilder sb = new StringBuilder("Create AudioTrack failed");
                if (this.mAudioTrack == null) {
                    str = "!";
                } else {
                    str = ": state " + this.mAudioTrack.getState();
                }
                com_ss_avframework_livestreamv2_core_interact_audio_PcmPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e("PcmPlayer", sb.append(str).toString());
                return;
            }
            this.mAudioTrack.play();
            this.inited = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void playPcmData(byte[] bArr, int i2, int i3) {
        if (this.inited) {
            this.mAudioTrack.write(bArr, i2, i3);
        }
    }
}
