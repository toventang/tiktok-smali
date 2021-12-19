package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AudioTrack extends MediaTrack {
    private AudioProcessor mAudioProcessor;

    static {
        Covode.recordClassIndex(99814);
    }

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    @Override // com.ss.avframework.engine.MediaTrack
    public synchronized void release() {
        MethodCollector.i(14439);
        super.release();
        AudioProcessor audioProcessor = this.mAudioProcessor;
        if (audioProcessor != null) {
            audioProcessor.release();
            this.mAudioProcessor = null;
        }
        MethodCollector.o(14439);
    }

    @Override // com.ss.avframework.engine.MediaTrack
    public void addAudioSink(AudioSink audioSink) {
        super.addAudioSink(audioSink);
    }

    @Override // com.ss.avframework.engine.MediaTrack
    public void removeAudioSink(AudioSink audioSink) {
        super.removeAudioSink(audioSink);
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        MethodCollector.i(14438);
        this.mAudioProcessor = audioProcessor;
        nativeSetAudioProcessor(audioProcessor);
        MethodCollector.o(14438);
    }

    public AudioTrack(long j2, MediaSource mediaSource) {
        super(j2, mediaSource);
    }
}
