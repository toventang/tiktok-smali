package com.ss.avframework.livestreamv2.recorder;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioTrack;

public interface IRecorderManager {

    public interface IRecorderListener {
        static {
            Covode.recordClassIndex(100435);
        }

        void onRecorderError(int i2, Exception exc);

        void onRecorderStarted();

        void onRecorderStoped(String str);
    }

    static {
        Covode.recordClassIndex(100433);
    }

    void addAudioTrack(AudioTrack audioTrack);

    Config getConfig();

    Canvas lock(Rect rect);

    void removeAudioTrack(AudioTrack audioTrack);

    void start(String str, IRecorderListener iRecorderListener, Config config, int i2);

    void stop();

    void unlockAndPost(Canvas canvas);

    public static class Config {
        public long audioBitrate;
        public int audioChannel;
        public int audioSample;
        public boolean havaVideo = true;
        public boolean haveAudio = true;
        public boolean useMediaMuxer;
        public long videoBitrate;
        public int videoFps;
        public int videoHeight;
        public boolean videoProfileHigh;
        public int videoWidth;

        static {
            Covode.recordClassIndex(100434);
        }

        public Config dump() {
            Config config = new Config();
            config.videoProfileHigh = this.videoProfileHigh;
            config.videoWidth = this.videoWidth;
            config.videoHeight = this.videoHeight;
            config.videoFps = this.videoFps;
            config.havaVideo = this.havaVideo;
            config.videoBitrate = this.videoBitrate;
            config.haveAudio = this.haveAudio;
            config.audioChannel = this.audioChannel;
            config.audioSample = this.audioSample;
            config.audioBitrate = this.audioBitrate;
            return config;
        }
    }
}
