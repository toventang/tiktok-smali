package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.mixer.AudioMixer;
import java.nio.ByteBuffer;

public interface IInputAudioStream {
    static {
        Covode.recordClassIndex(99858);
    }

    AudioTrack getAudioTrack();

    int getChannel();

    AudioMixer.AudioMixerDescription getMixerDescription();

    int getSample();

    String name();

    int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2);

    void release();

    void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription);

    int start();

    int stop();
}
