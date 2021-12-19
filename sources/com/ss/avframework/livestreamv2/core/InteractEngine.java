package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.utils.MiscUtils;
import java.nio.ByteBuffer;

public interface InteractEngine extends ILiveStream.IAudioFrameAvailableListener, LiveCore.ILiveCoreTextureFrameAvailableListener {
    public static final String AUDIO_LAYER_NAME = MiscUtils.getUUID("interact-audio");

    void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void addTextureFrameAvailableListener(LiveCore.ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener);

    void checkReleaseRtcEngine();

    Client create(LiveCore.InteractConfig interactConfig);

    void dealSeiInfo(int i2, String str, int i3, int i4, int i5, long j2, ByteBuffer byteBuffer);

    void enableGameMode(boolean z, boolean z2);

    InteractEngineBuilder getBuilder();

    String getInteractId();

    boolean isInteracting();

    int queryRtcId(String str);

    void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    boolean removeClient(Client client);

    void removeTextureFrameAvailableListener(LiveCore.ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener);

    void start(Client client);

    void switchMixType(boolean z);

    void updateClientMixStreamDescription(VideoMixer.VideoMixerDescription videoMixerDescription);

    static {
        Covode.recordClassIndex(100070);
    }
}
