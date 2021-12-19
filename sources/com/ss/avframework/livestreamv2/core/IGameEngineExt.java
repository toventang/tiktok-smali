package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.ss.avframework.mixer.VideoMixer;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class IGameEngineExt implements IGameEngine {

    public static class GameAudioConsumer extends AudioSink {
        static {
            Covode.recordClassIndex(100061);
        }

        @Override // com.ss.avframework.engine.AudioSink
        public void onData(Buffer buffer, int i2, int i3, int i4, long j2) {
        }

        @Override // com.ss.avframework.engine.AudioSink
        public void onNoData() {
        }
    }

    public static class GameVideoConsumer extends VideoSink {
        static {
            Covode.recordClassIndex(100062);
        }

        @Override // com.ss.avframework.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.ss.avframework.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
        }
    }

    public interface IGamePipelineEventObserver {
        static {
            Covode.recordClassIndex(100064);
        }

        void notifyLiveCoreToChangeCameraAdaptedParams(int i2, int i3, int i4);

        void notifyLiveCoreToToggleCamera(boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(100060);
    }

    /* access modifiers changed from: protected */
    public abstract String getVersion();

    public abstract GameVideoSink getVideoSink();

    public abstract void release();

    public abstract void setGameCallback(GameVideoConsumer gameVideoConsumer, GameAudioConsumer gameAudioConsumer);

    public abstract void setGamePipelineObserver(IGamePipelineEventObserver iGamePipelineEventObserver);

    public abstract void setInteractEngine(InteractEngine interactEngine);

    public abstract void setupLogServer(LiveStreamLogService liveStreamLogService);

    public abstract class GameVideoSink extends VideoSink {
        static {
            Covode.recordClassIndex(100063);
        }

        public abstract void onVideoFrame(int i2, VideoFrame videoFrame, int i3);

        public abstract void onVideoFrame(int i2, VideoMixer.VideoMixerTexture videoMixerTexture, ByteBuffer byteBuffer);

        public GameVideoSink() {
        }
    }
}
