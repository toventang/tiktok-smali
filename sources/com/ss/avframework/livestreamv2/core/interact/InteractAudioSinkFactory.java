package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.InteractEngine;
import com.ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSink;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory;
import com.ss.avframework.utils.AVLog;

class InteractAudioSinkFactory implements AudioSinkFactory {
    private final InteractEngineBuilder mBuilder;
    private int mChannelCount;
    private int mCreateCount;
    private int mDestroyCount;
    private int mSampleRate;

    static {
        Covode.recordClassIndex(100207);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getBitWidth() {
        return 16;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getIntervalMs() {
        return 10;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getChannelCount() {
        return this.mChannelCount;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getSampleRate() {
        return this.mSampleRate;
    }

    public void release() {
        AVLog.iow("InteractAudioSinkFactory", "AudioSink create count " + this.mCreateCount + ", destroy count " + this.mDestroyCount);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public void destroy(AudioSink audioSink) {
        this.mDestroyCount++;
        if (audioSink instanceof InteractAudioSink) {
            ((InteractAudioSink) audioSink).release();
        }
    }

    InteractAudioSinkFactory(InteractEngineBuilder interactEngineBuilder) {
        this.mBuilder = interactEngineBuilder;
        this.mChannelCount = interactEngineBuilder.getLiveCoreBuilder().getAudioChannel();
        this.mSampleRate = interactEngineBuilder.getLiveCoreBuilder().getAudioSampleHZ();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public AudioSink create(String str) {
        this.mCreateCount++;
        if (str == null) {
            str = InteractEngine.AUDIO_LAYER_NAME;
        }
        return new InteractAudioSink(this.mBuilder, str, this.mSampleRate, this.mChannelCount);
    }
}
