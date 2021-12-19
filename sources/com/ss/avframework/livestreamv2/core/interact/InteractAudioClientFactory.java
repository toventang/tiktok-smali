package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.livestreamv2.core.InteractEngine;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory;
import com.ss.avframework.utils.AVLog;

class InteractAudioClientFactory implements AudioClientFactory {
    private int mChannelCount = 44100;
    InteractEngine mEngine;
    private int mSampleRate = 2;

    static {
        Covode.recordClassIndex(100205);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getBitWidth() {
        return 16;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getChannelCount() {
        int i2;
        MethodCollector.i(14594);
        synchronized (this) {
            try {
                i2 = this.mChannelCount;
            } finally {
                MethodCollector.o(14594);
            }
        }
        return i2;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getSampleRate() {
        int i2;
        MethodCollector.i(14593);
        synchronized (this) {
            try {
                i2 = this.mSampleRate;
            } finally {
                MethodCollector.o(14593);
            }
        }
        return i2;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public AudioClient create() {
        AVLog.d("InteractAudioClientFactory", "Create audio client ");
        if (this.mEngine.getBuilder().getLiveCoreBuilder() == null) {
            return null;
        }
        InteractAudioClient interactAudioClient = new InteractAudioClient(this.mChannelCount, this.mSampleRate, this.mEngine.getBuilder().isEnableRtcPushStatics());
        this.mEngine.addAudioFrameAvailableListener(interactAudioClient);
        return interactAudioClient;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public void destroy(AudioClient audioClient) {
        AVLog.d("InteractAudioClientFactory", "Destroy audio client ");
        this.mEngine.removeAudioFrameAvailableListener((InteractAudioClient) audioClient);
    }

    public InteractAudioClientFactory(InteractEngine interactEngine) {
        this.mEngine = interactEngine;
        LiveCore.Builder liveCoreBuilder = interactEngine.getBuilder().getLiveCoreBuilder();
        if (liveCoreBuilder != null) {
            this.mChannelCount = liveCoreBuilder.getAudioChannel();
            this.mSampleRate = liveCoreBuilder.getAudioSampleHZ();
        }
    }
}
