package com.ss.avframework.livestreamv2.ktv;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.player.IAVPlayer;
import java.nio.ByteBuffer;

public interface IKaraokeMovie {

    public interface Listener {
        static {
            Covode.recordClassIndex(100411);
        }

        void onKaraokeError(int i2, Exception exc);

        void onKaraokeInfo(int i2, long j2, String str);
    }

    static {
        Covode.recordClassIndex(100410);
    }

    void enableAGC(boolean z);

    void enableAudioMixer(boolean z);

    VideoSink getCameraVideoSink();

    long getCurrentPlaybackTimeMs();

    int getDurationMs();

    IAVPlayer.MetaData getMetadata();

    IAVPlayer getPlayer();

    VideoMixer.VideoMixerDescription getVideoMixerDescription(int i2);

    VideoTrack getVideoTrack();

    boolean isEnableAGC();

    boolean isLoop();

    boolean isMirror();

    boolean isMute();

    void mute(boolean z);

    void pause();

    void prepare();

    boolean readAudioBufferByKaraoke(ByteBuffer byteBuffer, int i2, int i3, int i4);

    void release();

    void seek(long j2);

    void setAutoFillAspectRatioOnFit(boolean z);

    void setDataSource(String str);

    void setDisplay(View view);

    void setListener(Listener listener);

    void setLoop(boolean z);

    void setMirror(boolean z);

    void setRenderMode(boolean z);

    void setVideoMixerDescription(int i2, VideoMixer.VideoMixerDescription videoMixerDescription);

    void setVolume(float f2);

    void start();

    void stop();
}
