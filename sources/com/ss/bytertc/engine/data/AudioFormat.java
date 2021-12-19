package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class AudioFormat {
    public AudioChannel channel;
    public AudioSampleRate sampleRate;

    static {
        Covode.recordClassIndex(100839);
    }

    public String toString() {
        return "AudioFormat{sampleRate='" + this.sampleRate + '\'' + ", channel='" + this.channel + '\'' + '}';
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }
}
