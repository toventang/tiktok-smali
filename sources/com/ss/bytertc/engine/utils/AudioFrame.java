package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;

public class AudioFrame {
    public byte[] buffer;
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samples;

    static {
        Covode.recordClassIndex(101035);
    }

    public AudioFrame() {
    }

    public AudioFrame(byte[] bArr, int i2, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.buffer = bArr;
        this.samples = i2;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }
}
