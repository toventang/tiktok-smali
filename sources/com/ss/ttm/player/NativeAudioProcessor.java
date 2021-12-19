package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class NativeAudioProcessor extends AudioProcessor {

    /* renamed from: a  reason: collision with root package name */
    protected long f151960a;

    static {
        Covode.recordClassIndex(101308);
    }

    private long getNativeWrapper() {
        return this.f151960a;
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public void audioClose() {
        throw new AndroidRuntimeException("Should not be here");
    }

    public static boolean isNativeAudioProcessor(AudioProcessor audioProcessor) {
        return audioProcessor instanceof NativeAudioProcessor;
    }

    public void setNativeWrapper(long j2) {
        this.f151960a = j2;
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public void audioRelease(int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public void audioProcess(ByteBuffer[] byteBufferArr, int i2, long j2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public void audioOpen(int i2, int i3, int i4, int i5) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
