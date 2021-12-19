package com.ss.avframework.livestreamv2.filter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.effect.EffectWrapper;
import com.ss.avframework.engine.AudioDeviceModule;
import java.nio.Buffer;

class AudioStrangeVoice extends IAudioStrangeVoice {
    private EffectWrapper mEffect;
    private AudioDeviceModule.AudioRenderSink mPlayer;

    static {
        Covode.recordClassIndex(100307);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.filter.IAudioStrangeVoice
    public void release() {
        super.release();
        this.mEffect = null;
        this.mPlayer = null;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IAudioStrangeVoice
    public int setAudioStrangeResource(String str) {
        EffectWrapper effectWrapper = this.mEffect;
        if (effectWrapper == null) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return effectWrapper.setAudioEffectConfig(str);
    }

    public AudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, EffectWrapper effectWrapper, int i2, int i3) {
        this.mEffect = effectWrapper;
        this.mPlayer = audioRenderSink;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.filter.IAudioStrangeVoice
    public Buffer process(Buffer buffer, int i2, int i3, int i4, long j2) {
        EffectWrapper effectWrapper;
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        if (this.mEnable && (effectWrapper = this.mEffect) != null && effectWrapper.processStrangeVoice(buffer, i2, i3, i4, j2) == 0 && this.mIsPlayerMode && (audioRenderSink = this.mPlayer) != null) {
            audioRenderSink.onData(buffer, i2, i3, i4, j2);
        }
        return buffer;
    }
}
